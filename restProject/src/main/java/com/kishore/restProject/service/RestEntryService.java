package com.kishore.restProject.service;

import com.kishore.restProject.entity.RestEntry;
import com.kishore.restProject.repository.RestEntryRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class RestEntryService {

    @Autowired
    private RestEntryRepo restEntryRepo;

    public void saveEntry(RestEntry entry) {
         restEntryRepo.save(entry);
    }

    public List<RestEntry> getAll() {
        return restEntryRepo.findAll();
    }

    public Optional<RestEntry> getEntryById(ObjectId id) {
        return restEntryRepo.findById(id);
    }

    public void deleteEntryById(ObjectId id) {
        restEntryRepo.deleteById(id);
    }

}

//controller ----> service ----> repository
