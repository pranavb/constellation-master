package edu.cmu.constellation.dao;

import edu.cmu.constellation.entity.Project;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectDao extends MongoRepository<Project, String> {

    List<Project> findBySponsorAndrewId(String sponsorAndrewId);

}
