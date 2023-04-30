package com.example.converter.service.impl;

import com.example.converter.dto.CurrencyResponse;
import com.example.converter.enums.Currency;
import com.example.converter.repo.MainRepo;
import com.example.converter.repo.impl.MainRepoImpl;
import com.example.converter.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MainServiceImpl implements MainService {
    private final MainRepo mainRepo;

    @Override
    public List<CurrencyResponse> addCurrency(Currency currency, Integer volume) {
        final long newVolume = mainRepo.get(currency) + volume;
        mainRepo.update(currency, newVolume);

        final Currency anotherCurrency = currency.equals(Currency.APPLE) ?
                Currency.POTATO : Currency.APPLE;

        final long anotherVolume = MainRepoImpl.allVolume / newVolume;
        mainRepo.update(anotherCurrency, anotherVolume);

        List<CurrencyResponse> response = new ArrayList<>();

        response.add(new CurrencyResponse(currency, mainRepo.get(currency),
                (double) MainRepoImpl.currencyVolume / mainRepo.get(currency)));


        response.add(new CurrencyResponse(anotherCurrency, mainRepo.get(anotherCurrency),
                (double) MainRepoImpl.currencyVolume / mainRepo.get(anotherCurrency)));

        return response;
    }
}
