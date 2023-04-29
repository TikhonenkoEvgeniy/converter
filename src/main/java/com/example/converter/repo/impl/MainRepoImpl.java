package com.example.converter.repo.impl;

import com.example.converter.enums.Currency;
import com.example.converter.repo.MainRepo;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class MainRepoImpl implements MainRepo {
    private final HashMap<Currency, Integer> currencyRepo = new HashMap<>();

    public MainRepoImpl() {
        currencyRepo.put(Currency.APPLE, 50000);
        currencyRepo.put(Currency.POTATO, 50000);
    }

    @Override
    public void update(Currency currency, Integer value) {
        currencyRepo.put(currency, value);
    }

    @Override
    public Integer get(Currency currency) {
        return currencyRepo.get(currency);
    }
}
