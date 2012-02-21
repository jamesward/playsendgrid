A Simple Play + SendGrid Example App
====================================

Setup
-----

Set the production mail config in the `conf/applicaiton.conf` file:

    %prod.mail.smtp.host=smtp.sendgrid.net
    %prod.mail.smtp.user=${SENDGRID_USERNAME}
    %prod.mail.smtp.pass=${SENDGRID_PASSWORD}


Sending Email
-------------

    MultiPartEmail email = new MultiPartEmail();
    email.setFrom(fromAddress);
    email.addTo(toAddress);
    email.setSubject(subject);
    email.setMsg(msg);
    Mail.send(email);


Deploy on Heroku
----------------

Create a new app on Heroku

    heroku create -s cedar

Add the SendGrid Add-On

    heroku addons:add sendgrid

Deploy the app:

    git push heroku master

