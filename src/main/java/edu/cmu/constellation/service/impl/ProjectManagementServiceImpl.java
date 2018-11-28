package edu.cmu.constellation.service.impl;

import edu.cmu.constellation.dao.ProjectDao;
import edu.cmu.constellation.entity.Project;
import edu.cmu.constellation.service.ProjectManagementService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectManagementServiceImpl implements ProjectManagementService {

    private ProjectDao projectDao;

    public ProjectManagementServiceImpl(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }

    @Override
    public List<Project> getProjectsBySponsor(String sponsorAndrewId) {
        return projectDao.findBySponsorAndrewId(sponsorAndrewId);
//        return projectCrudDao.findAll();
    }

    @Override
    public Boolean createProject(Project projectToCreate) {
//        ObjectId id = projectCrudDao.createProject(projectToCreate);
//        return id!=null;
        Object o = projectDao.save(projectToCreate);
        return o != null;
    }
}
