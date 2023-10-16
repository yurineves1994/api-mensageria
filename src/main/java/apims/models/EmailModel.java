package apims.models;

import java.time.LocalDateTime;

import apims.models.enums.StatusSend;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity(name = "tb_emails")
@Table(name = "tb_emails")
public class EmailModel {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long Id;

  private String ownerRef;

  private String emailFrom;

  private String emailTo;

  private String subject;

  @Column(columnDefinition = "TEXT")
  private String text;

  private LocalDateTime sendDateEmail;

  private StatusSend statusSend;
}
