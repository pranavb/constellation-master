package edu.cmu.constellation.dao.impl;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import edu.cmu.constellation.dao.Constants;
import edu.cmu.constellation.dao.DatabaseConnection;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

@Repository
public class DatabaseConnectionImpl implements DatabaseConnection {

    private MongoDatabase constellationDatabase;

    public DatabaseConnectionImpl() {
        Logger logger = LoggerFactory.getLogger(DatabaseConnectionImpl.class);
//        TODO: Address weird build issue with the new sync API
//        com.mongodb.client.MongoClient mongoClient = MongoClients.create(Constants.CONSTELLATION_DB_URL);

        MongoClientURI mongoClientURI = new MongoClientURI(Constants.CONSTELLATION_DB_URL);
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));

        logger.info("Attempting to connect to the Mongo instance...");
        MongoClient mongoClient = new MongoClient(mongoClientURI);
        logger.info("Connected!");

        constellationDatabase = mongoClient
                .getDatabase(Constants.CONSTELLATION_DATABASE_NAME)
                .withCodecRegistry(pojoCodecRegistry);
    }

    @Override
    public MongoDatabase getConstellationDatabase() {
        return constellationDatabase;
    }

}
