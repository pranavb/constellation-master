package edu.cmu.constellation.dao;

import com.mongodb.client.MongoDatabase;
import org.springframework.stereotype.Repository;

@Repository
public interface DatabaseConnection {

    MongoDatabase getConstellationDatabase();

}
