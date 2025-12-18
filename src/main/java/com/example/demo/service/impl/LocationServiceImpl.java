package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Location;
import com.example.demo.repository.LocationRepository;
import com.example.demo.service.LocationService;
import com.example.demoaiml.exception.ResourceNotFoundException;


@Service
public class LocationServiceImpl implements LocationService{

    Long uu;
    @Autowired
    LocationRepository lrp;
    public Location createLocation(Location location){
       
        return lrp.save(location);
    }
    public List<Location> getAllLocations(){
        return lrp.findAll();
    }
    @Override
public Location getStudentById(Long id) {
return lrp.findById(id)
.orElseThrow(()-> new
ResourceNotFoundException("Student not found"));
}
@Override
public Location UpadateLoc(Long id, Location locc) {
Location existing = getStudentById(id);
existing.setName(locc.getName());
existing.setEmail(locc.getEmail());
return lrp.save(existing);
}

@Override
public void deleteStudent(Long id) {
Location locc = getStudentById(id);
lrp.delete(locc);
}
}
