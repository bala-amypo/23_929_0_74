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

@PostMapping("/location")
public Location addLocation(@RequestBody Location loc){

return lcs.createLocation(loc);
}

@GetMapping
public List<Location> getAll(){
    return lcs.getAllLocations();
}

@GetMapping("/{id}")
public Location getStudent(@PathVariable Long id) {
return lcs.getViewByID(id);
}
// UPDATE
@PutMapping("/{id}")
public Location updateStudent(@PathVariable Long id,
@Valid @RequestBody Location student)
{
return lcs.updateStudent(id, student);
}
// DELETE
@DeleteMapping("/{id}")
public ResponseEntity<String> deleteStudent(@PathVariable Long
id) {
lcs.deleteStudent(id);
return ResponseEntity.ok("Student deleted successfully");
}

}

