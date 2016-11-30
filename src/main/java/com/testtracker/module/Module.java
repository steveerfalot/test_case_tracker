package com.testtracker.module;

import com.testtracker.module_step.ModuleStep;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "module")
public class Module {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "module")
    private List<ModuleStep> moduleSteps;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ModuleStep> getModuleSteps() {
        return moduleSteps;
    }

    public void setModuleSteps(List<ModuleStep> moduleSteps) {
        this.moduleSteps = moduleSteps;
    }
}
