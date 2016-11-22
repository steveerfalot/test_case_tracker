package com.testtracker.service;

import com.testtracker.domain.Step;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StepService {

    List<Step> findAll();

    Step findById(Long id);

    Step save(Step step);

    void delete(Long id);

}
