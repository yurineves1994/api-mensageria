package apims.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import apims.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}