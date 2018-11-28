package edu.cmu.constellation.main;

import edu.cmu.constellation.dao.ProjectDao;
import edu.cmu.constellation.service.ProjectManagementService;
import edu.cmu.constellation.service.impl.ProjectManagementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    // DAO _____________________________________________________

//    @Bean
//    public DatabaseConnection databaseConnectionBean() {
//        return new DatabaseConnectionImpl();
//    }

//    @Bean
//    @Autowired
//    public ProjectCrudDao projectCrudDaoBean(DatabaseConnection connection) {
//        return new ProjectCrudDaoImpl(connection.getConstellationDatabase());
//    }

    // SERVICES ________________________________________________

    @Bean
    @Autowired
    public ProjectManagementService projectManagementServiceBean(ProjectDao projectDao) {
        return new ProjectManagementServiceImpl(projectDao);
    }

}
