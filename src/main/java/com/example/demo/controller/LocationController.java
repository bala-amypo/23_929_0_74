package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.example.demo.entity.Location;
import com.example.demo.service.LocationService;
import org.springframework.http.ResponseEntity;

@RestController

public class LocationController {
    
@Autowired
LocationService  lcs;

// for post the data
@PostMapping("/location")
public Location addLocation(@RequestBody Location loc){

return lcs.createLocation(loc);
}

// for get all the data in list view
@GetMapping
public List<Location> getAll(){
    return lcs.getAllLocations();
}


@GetMapping("/{id}")
public Location getStudent(@PathVariable Long id) {
return lcs.getViewByID(id);
}


@PutMapping("/{id}")
public Location updateStudent(@PathVariable Long id,@Valid @RequestBody Location student){
return lcs.updateStudent(id, student);
}

@DeleteMapping("/{id}")
public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
lcs.deleteStudent(id);
return ResponseEntity.ok("Student deleted successfully");
}
}

