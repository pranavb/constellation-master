package edu.cmu.constellation.controller;

import edu.cmu.constellation.entity.Project;
import edu.cmu.constellation.service.ProjectManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class ProjectManagementController {

    private ProjectManagementService projectManagementService;

    @Autowired
    public ProjectManagementController(ProjectManagementService projectManagementService) {
        this.projectManagementService = projectManagementService;
    }

    @GetMapping(path = "/sponsor/{sponsorAndrewId}/projects",
            produces = "application/json")
    public @ResponseBody
    ResponseEntity<List<Project>> getProjects(@PathVariable String sponsorAndrewId) {
        try {
            return new ResponseEntity<>(
                    projectManagementService.getProjectsBySponsor(sponsorAndrewId), HttpStatus.OK);
        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping(path = "sponsor/{sponsorAndrewId}/create",
            consumes = "application/json")
    public @ResponseBody
    ResponseEntity createProject(@PathVariable String sponsorAndrewId, @RequestBody Project project) {
        project.setSponsorAndrewId(sponsorAndrewId);
        projectManagementService.createProject(project);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
