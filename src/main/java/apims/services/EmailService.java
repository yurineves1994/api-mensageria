package apims.services;

import java.time.LocalDateTime;

import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import apims.models.EmailModel;
import apims.models.enums.StatusSend;
import apims.repositories.EmailRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class EmailService {

  private EmailRepository emailRepository;

  private JavaMailSender emailSender;

  public EmailModel sendEmail(EmailModel emailModel) {
    emailModel.setSendDateEmail(LocalDateTime.now());
    try {
      SimpleMailMessage message = new SimpleMailMessage();
      message.setFrom(emailModel.getEmailFrom());
      message.setTo(emailModel.getEmailTo());
      message.setSubject(emailModel.getSubject());
      message.setText(emailModel.getText());
      emailSender.send(message);

      emailModel.setStatusSend(StatusSend.SENT);
    } catch (MailException e) {
      emailModel.setStatusSend(StatusSend.ERROR);
    } finally {
       this.emailRepository.save(emailModel);
    }

    return emailModel;
  }
}