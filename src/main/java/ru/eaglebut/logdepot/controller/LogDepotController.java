package ru.eaglebut.logdepot.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello World!
 *
 * @author Veniamin Tischenkov
 * @since 09.08.2022
 */
@RestController
@RequestMapping("logdepot")
@Log4j2
public class LogDepotController {
//
//    private final LogRepository repository;
//
//    public LogDepotController(LogRepository repository) {
//        this.repository = repository;
//    }
//
//    @PostMapping
//    public void addLog(@RequestBody LogBean logBean){
//       log.debug(logBean);
//       repository.save(logBean);
//    }
}
