package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Location;

@RestController
public class LocationController {
    
@Autowired

@PostMapping("/location")
public Location addLocation(@RequestBody Location loc){

return
}


}
