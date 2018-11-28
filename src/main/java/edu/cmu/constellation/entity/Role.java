package edu.cmu.constellation.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Role {

    private Double id, recipeId, skillTestId, resultId;
    private String name, description, level;
    private Integer numRequired;

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public Double getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Double recipeId) {
        this.recipeId = recipeId;
    }

    public Double getSkillTestId() {
        return skillTestId;
    }

    public void setSkillTestId(Double skillTestId) {
        this.skillTestId = skillTestId;
    }

    public Double getResultId() {
        return resultId;
    }

    public void setResultId(Double resultId) {
        this.resultId = resultId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @JsonProperty("num_required")
    public Integer getNumRequired() {
        return numRequired;
    }

    public void setNumRequired(Integer numRequired) {
        this.numRequired = numRequired;
    }
}
