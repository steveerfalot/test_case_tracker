package com.testtracker.module_step;

import com.testtracker.module.Module;
import com.testtracker.step.Step;

import javax.persistence.*;

@Entity
@Table(name = "module_step")
public class ModuleStep {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "position")
    private Integer position;

    @ManyToOne
    @JoinColumn(name="step_id", referencedColumnName="id", nullable=false)
    private Step step;

    @ManyToOne
    @JoinColumn(name="module_id", referencedColumnName="id", nullable=false)
    private Module module;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Step getStep() {
        return step;
    }

    public void setStep(Step step) {
        this.step = step;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }
}
