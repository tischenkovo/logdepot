package ru.eaglebut.logdepot.bean;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;

/**
 * Log bean
 *
 * @author Veniamin Tischenkov
 * @since 17.08.2022
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class LogBean {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Instant createDate;
    private Instant logDate;
    private String source;
    private String logLevel;
    private String message;
}
