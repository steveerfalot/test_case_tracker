package com.testtracker.controller;

import com.testtracker.domain.Step;
import com.testtracker.service.StepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/step")
public class StepController {

    private StepService stepService;

    @Autowired
    StepController(StepService stepService) {
        this.stepService = stepService;
    }

    @RequestMapping(method = RequestMethod.GET)
    List<Step> fetchAllSteps() {
        return stepService.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    Step fetchOne(@PathVariable Long id) {
        return stepService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    Step create(@RequestBody Step step) {
        return stepService.save(step);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    Step update(@RequestBody Step step) {
        return stepService.save(step);
    }

}
