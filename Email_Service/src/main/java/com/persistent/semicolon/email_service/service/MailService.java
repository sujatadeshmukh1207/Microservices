package com.persistent.semicolon.email_service.service;

import com.persistent.semicolon.email_service.model.Mail;

public interface MailService {
    public void sendEmail(Mail mail);
}