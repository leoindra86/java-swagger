package com.swaggerph1.swaggerph1.space;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "This is cool spacecraft")
public class SpaceCraft {

    @ApiModelProperty(notes = "This name of Spacecraft")
    private String name;
    @ApiModelProperty(notes = "Weight of Spacecraft")
    private Integer weight;
    @ApiModelProperty(notes = "Description of Spacecraft")
    private String description;
    @ApiModelProperty(notes = "Crews of Spacecraft")
    private Integer numberOfCrew;


    public SpaceCraft(String name, Integer weight, String description, Integer numberOfCrew) {
        this.name = name;
        this.weight = weight;
        this.description = description;
        this.numberOfCrew = numberOfCrew;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumberOfCrew() {
        return numberOfCrew;
    }

    public void setNumberOfCrew(Integer numberOfCrew) {
        this.numberOfCrew = numberOfCrew;
    }

// Builder part --- lombok @Builder creates below logic

    public static SpaceCraftBuilder builder() {
        return new SpaceCraftBuilder();

    }

    public static class SpaceCraftBuilder {

        private String name;
        private Integer weight;
        private String description;
        private Integer numberOfCrew;

        SpaceCraftBuilder() {
        }

        public SpaceCraftBuilder name(String name) {
            this.name = name;
            return this;
        }

        public SpaceCraftBuilder weight(Integer weight) {
            this.weight = weight;
            return this;
        }

        public SpaceCraftBuilder description(String description) {
            this.description = description;
            return this;
        }

        public SpaceCraftBuilder numberOfCrew(Integer numberOfCrew) {
            this.numberOfCrew = numberOfCrew;
            return this;
        }

        public SpaceCraft build() {
            return new SpaceCraft(name, weight, description, numberOfCrew);
        }

        public String toString() {
            return "SpaceCraft.SpaceCraftBuilder" +
                    "(name=" + this.name + ", weight=" + this.weight + ", description=" + this.description + ", numberOfCrew=" + this.numberOfCrew + ")";

        }
}
}
