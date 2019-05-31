package io.falcon.assignment.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Payload {

    @Id
    @GeneratedValue
    private long id;

    @JsonProperty("content")
    @NotEmpty(message = "Please provide a word")
    private String content;
    @JsonProperty("timestamp")
    @NotEmpty(message = "Please provide a timestamp")
    private String timestamp;
    @Transient
    private int longest_palindrome_size;
}
