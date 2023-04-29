package com.example.converter.service.impl;

import com.example.converter.repo.MainRepo;
import com.example.converter.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MainServiceImpl implements MainService {
    private final MainRepo mainRepo;

}
