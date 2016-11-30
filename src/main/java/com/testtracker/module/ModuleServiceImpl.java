package com.testtracker.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ModuleServiceImpl implements ModuleService {

    private ModuleRepository moduleRepository;

    @Autowired
    ModuleServiceImpl(ModuleRepository moduleRepository) {
        this.moduleRepository = moduleRepository;
    }

    @Override
    public List<Module> findAll() {
        return moduleRepository.findAll();
    }

    @Override
    public Module findById(Long id) {
        return moduleRepository.findOne(id);
    }

    @Override
    public Module save(Module module) {
        return moduleRepository.save(module);
    }

    @Override
    public void delete(Long id) {
        moduleRepository.delete(id);
    }
}
