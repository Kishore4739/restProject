package com.kishore.restProject.controller;

import com.kishore.restProject.entity.RestEntry;
import com.kishore.restProject.service.RestEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/_rest")
public class RestEntryControllerV2 {

    @Autowired
    private RestEntryService restEntryService;


    @GetMapping
    public List<RestEntry> getAll() {
        return restEntryService.getAll();
    }


    @PostMapping
    public RestEntry createEntry(@RequestBody RestEntry myentry) {
        myentry.setDate(LocalDateTime.now());
        restEntryService.saveEntry(myentry);
        return myentry;
    }



    @GetMapping("id/{myid}")
    public RestEntry getRestEntryById(@PathVariable ObjectId myid) {

        return restEntryService.getEntryById(myid).orElse(null);
    }




    @DeleteMapping("id/{myid}")
    public boolean deleterestEntryById(@PathVariable ObjectId myid) {

         restEntryService.deleteEntryById(myid);
         return true;
    }



    @PutMapping("id/{myid}")
    public RestEntry updateEntry(@PathVariable ObjectId myid, @RequestBody RestEntry newentry) {
        RestEntry entry = restEntryService.getEntryById(myid).orElse(null);
        if(entry != null) {
            entry.setTitle(newentry.getTitle() != null && !newentry.getTitle().equals("") ? entry.getTitle() : newentry.getTitle());
            entry.setContent(newentry.getContent() != null && !newentry.getContent().equals("") ? entry.getContent() : newentry.getContent());
        }
        restEntryService.saveEntry(entry);
        return entry;
    }



}
