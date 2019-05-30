package io.falcon.assignment.repository;

import io.falcon.assignment.model.Payload;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayloadRepository extends JpaRepository<Payload, Long> {
}
