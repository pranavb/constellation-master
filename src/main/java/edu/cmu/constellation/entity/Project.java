package edu.cmu.constellation.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@Document(collection = "projects")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Project {

    @Id private String id;
    @Field("start_date") private Date startDate;
    @Field("end_date") private Date endDate;
    @Field("sponsor_id") private String sponsorAndrewId;
    private List<Role> roles;
    private String name, description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("sponsor_id")
    public String getSponsorAndrewId() {
        return sponsorAndrewId;
    }

    public void setSponsorAndrewId(String sponsorAndrewId) {
        this.sponsorAndrewId = sponsorAndrewId;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @JsonProperty("start_date")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("end_date")
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", roles=" + roles +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", sponsor='" + sponsorAndrewId + '\'' +
                '}';
    }
}
