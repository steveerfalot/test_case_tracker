package com.testtracker.module;

import com.testtracker.step.Step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/module")
public class ModuleController {

    private ModuleService moduleService;

    @Autowired
    ModuleController(ModuleService moduleService) {
        this.moduleService = moduleService;
    }

    @RequestMapping(method = RequestMethod.GET)
    List<Module> fetchAllModules() {
        return moduleService.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    Module fetchOne(@PathVariable Long id) {
        return moduleService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    Module create(@RequestBody Module module) {
        return moduleService.save(module);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    Module update(@RequestBody Module module) {
        return moduleService.save(module);
    }
}
