package com.example.converter.dto;

import com.example.converter.enums.Currency;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CurrencyResponse {
    private Currency currency;
    private Long volume;
    private Double price;
}
