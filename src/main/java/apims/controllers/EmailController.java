package apims.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apims.dtos.EmailDTO;
import apims.models.EmailModel;
import apims.services.EmailService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/ms")
public class EmailController {

  private EmailService emailService;

  @PostMapping
  public ResponseEntity<EmailModel> sendEmail(@RequestBody @Valid EmailDTO emailDTO) {
    EmailModel emailModel = new EmailModel();
    BeanUtils.copyProperties(emailDTO, emailModel);
    emailService.sendEmail(emailModel);

    return ResponseEntity.status(HttpStatus.CREATED).body(emailModel);
  }

}
