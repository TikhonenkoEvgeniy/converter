package com.example.converter.repo;

import com.example.converter.enums.Currency;

import java.util.Map;

public interface MainRepo {
    void update(Currency currency, Integer value);
    Integer get(Currency currency);
}
