package com.example.converter.dto;

import com.example.converter.enums.Currency;
import lombok.Data;

@Data
public class CurrencyRequest {
    private Currency currency;
    private Integer volume;
}
