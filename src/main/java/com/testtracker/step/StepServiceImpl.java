package com.testtracker.step;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StepServiceImpl implements StepService {

    private StepRepository stepRepository;

    @Autowired
    StepServiceImpl(StepRepository stepRepository) {
        this.stepRepository = stepRepository;
    }

    @Override
    public List<Step> findAll() {
        return stepRepository.findAll();
    }

    @Override
    public Step findById(Long id) {
        return stepRepository.findOne(id);
    }

    @Override
    public Step save(Step step) {
        return stepRepository.save(step);
    }

    @Override
    public void delete(Long id) {
        stepRepository.delete(id);
    }
}
