package com.workshop.sb.testworkshop.controller;

import com.workshop.sb.testworkshop.model.Location;
import com.workshop.sb.testworkshop.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class LocationRestController {

    @Autowired  //panggil class baru methodnya secara otomatis
            LocationService locationService;

    @GetMapping("/bus/location")
    public List<Location> getBusLocation ()
    {
        return locationService.getBusLocation();

    }
}
