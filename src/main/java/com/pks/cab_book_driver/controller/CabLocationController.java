package com.pks.cab_book_driver.controller;

import com.pks.cab_book_driver.service.CabLocationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/cab-locator")
public class CabLocationController {

    private final CabLocationService cabLocationService;

    public CabLocationController(CabLocationService cabLocationService) {
        this.cabLocationService = cabLocationService;
    }


    @PutMapping
    public ResponseEntity updateLocation() throws InterruptedException {

        int range = 100;

        while( range > 0 ){
          cabLocationService.updateLocation("Math.random(): "+Math.random());
            Thread.sleep(1000);
          range--;

        }
        return new ResponseEntity(Map.of("message","Car Location"), HttpStatus.OK);
    }
}
