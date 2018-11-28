package edu.cmu.constellation.entity;

import java.util.List;

public class Recipe {

    private Double id;
    private List<SkillTest> skillTests;

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public List<SkillTest> getSkillTests() {
        return skillTests;
    }

    public void setSkillTests(List<SkillTest> skillTests) {
        this.skillTests = skillTests;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", skillTests=" + skillTests +
                '}';
    }
}
