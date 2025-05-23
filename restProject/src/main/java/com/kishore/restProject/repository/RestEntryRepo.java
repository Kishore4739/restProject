package com.kishore.restProject.repository;

import com.kishore.restProject.entity.RestEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RestEntryRepo extends MongoRepository<RestEntry, ObjectId> {




}
