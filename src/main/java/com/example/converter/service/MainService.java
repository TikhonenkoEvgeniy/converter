package com.example.converter.service;

import com.example.converter.dto.CurrencyResponse;
import com.example.converter.enums.Currency;

import java.util.List;

public interface MainService {
    List<CurrencyResponse> addCurrency(Currency currency, Integer volume);
}
