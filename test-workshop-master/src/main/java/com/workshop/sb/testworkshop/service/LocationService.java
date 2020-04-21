package com.workshop.sb.testworkshop.service;

import com.workshop.sb.testworkshop.model.Location;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationService {

    public List<Location> getBusLocation() {
        List<Location> locationList = new ArrayList<>();

        Location locationBus1 = new Location();
        locationBus1.setLatitude(0.293591);
        locationBus1.setLongitude(103.5969923);
        locationBus1.setBusDriverName("Joko");
        locationBus1.setDestination("Yogyakarta");
        locationBus1.setBusNumber("B001");
        locationBus1.setEta(120);

        Location locationBus2 = new Location();
        locationBus2.setLatitude(0.293594);
        locationBus2.setLongitude(103.5969923);
        locationBus2.setBusDriverName("Bowo");
        locationBus2.setDestination("Jakarta");
        locationBus2.setBusNumber("B002");
        locationBus2.setEta(73);

        locationList.add(locationBus1);
        locationList.add(locationBus2);

        return locationList;
    }
}
