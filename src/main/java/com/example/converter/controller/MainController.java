package com.example.converter.controller;

import com.example.converter.dto.CurrencyResponse;
import com.example.converter.dto.CurrencyRequest;
import com.example.converter.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final MainService mainService;

    @PostMapping("add")
    public ResponseEntity<List<CurrencyResponse>> add(@RequestBody CurrencyRequest request) {
        if (request.getCurrency() == null || request.getVolume() == null) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .build();
        }
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(mainService.addCurrency(request.getCurrency(), request.getVolume()));
    }
}
