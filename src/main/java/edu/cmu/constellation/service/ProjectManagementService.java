package edu.cmu.constellation.service;

import edu.cmu.constellation.entity.Project;

import java.io.IOException;
import java.util.List;

public interface ProjectManagementService {

    List<Project> getProjectsBySponsor(String sponsorAndrewId) throws IOException;
    Boolean createProject(Project projectToCreate);

}
