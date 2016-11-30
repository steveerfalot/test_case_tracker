package com.testtracker.module;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ModuleService {

    List<Module> findAll();

    Module findById(Long id);

    Module save(Module module);

    void delete(Long id);
}
