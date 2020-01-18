package com.Test.config;

import com.Test.utils.Request;
import com.Test.utils.configFile;
import org.apache.http.impl.client.DefaultHttpClient;
import org.testng.annotations.AfterSuite;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;
import java.util.ResourceBundle;

public class SendEmail {
    /*
     * gmail邮箱SSL方式
     */
    private static void gmailssl(Properties props) {
        final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
        props.put("mail.debug", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.ssl.enable", "true");
        props.put("mail.smtp.socketFactory.class", SSL_FACTORY);
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.auth", "true");
    }


    //gmail邮箱的TLS方式
    private static void gmailtls(Properties props) {
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
    }

    /*
     * 通过gmail邮箱发送邮件
     */
    public static void main(String[] args) {

        // Get a Properties object
        Properties props = new Properties();
        //选择ssl方式
        gmailssl(props);
        ResourceBundle resourceBundle = configFile.getResourceBundle();
        final String username = resourceBundle.getString("Email.fromusername");
        final String password = resourceBundle.getString("Email.frompassword");
        String email = resourceBundle.getString("Email.tousername");
        String[] split = email.split(";");
        for (int i = 0; i <split.length ; i++) {
            Session session = Session.getDefaultInstance(props,
                    new Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(username, password);
                        }
                    });
            // -- Create a new message --
            Message msg = new MimeMessage(session);
            // -- Set the FROM and TO fields --
            try {
                msg.setFrom(new InternetAddress(username));
                msg.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse(split[i]));
                msg.setSubject(new Date()+new String (resourceBundle.getString("Email.Subject").getBytes("ISO-8859-1"), "UTF-8"));
                String Text = resourceBundle.getString("Email.Text");
                msg.setText(Text);
                msg.setSentDate(new Date());
                // 邮件内容,也可以使纯文本"text/plain"
                msg.setContent("http://10.14.23.101:8088/test-output/", "text/plain;charset=UTF-8");
                Transport.send(msg);
            } catch (AddressException e) {
                e.printStackTrace();
            } catch (MessagingException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Message sent.");
        }
    }
}