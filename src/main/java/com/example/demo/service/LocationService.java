package com.example.demo.service;


import java.util.List;

import com.example.demo.entity.Location;

public interface LocationService {
    
Location createLocation(Location location);
List<Location> getAllLocations();
Location getViewByID(Long id);
Location UpadateLoc(Long id,Location locc);
void delete(Long id);

}
