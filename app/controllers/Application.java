package controllers;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import play.*;
import play.libs.Mail;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void sendMail(String fromAddress, String toAddress, String subject, String body) throws EmailException {
        MultiPartEmail email = new MultiPartEmail();

        email.setFrom(fromAddress);
        email.addTo(toAddress);
        email.setSubject(subject);
        email.setMsg(body);

        Mail.send(email);

        renderText("Mail sent!");
    }

}