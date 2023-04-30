package com.example.converter.repo.impl;

import com.example.converter.enums.Currency;
import com.example.converter.repo.MainRepo;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class MainRepoImpl implements MainRepo {
    private final HashMap<Currency, Long> currencyRepo = new HashMap<>();
    public static final Long currencyVolume = 50000L;
    public static final Long allVolume = currencyVolume * currencyVolume;

    public MainRepoImpl() {
        this.currencyRepo.put(Currency.APPLE, currencyVolume);
        this.currencyRepo.put(Currency.POTATO, currencyVolume);
    }

    @Override
    public void update(Currency currency, Long value) {
        currencyRepo.put(currency, value);
    }

    @Override
    public Long get(Currency currency) {
        return currencyRepo.get(currency);
    }
}
