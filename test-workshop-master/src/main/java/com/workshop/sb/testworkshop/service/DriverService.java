package com.workshop.sb.testworkshop.service;

import com.workshop.sb.testworkshop.model.request.DriverRequest;
import com.workshop.sb.testworkshop.model.response.DriverResponse;
import com.workshop.sb.testworkshop.persistance.model.Driver;
import com.workshop.sb.testworkshop.persistance.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    public void addNewDriver(DriverRequest request) throws Exception{
        Driver driverData = new Driver(request);
        driverRepository.save(driverData);
    }

    public DriverResponse getDataDriverById(int id) {
        Optional<Driver> optionalDriver = driverRepository.findById(id);
        if(optionalDriver.isPresent()){
            DriverResponse response = new DriverResponse();
            response.setId(optionalDriver.get().getId());
            response.setAddress(optionalDriver.get().getAddress());
            response.setIdNumber(optionalDriver.get().getIdNumber());
            response.setName(optionalDriver.get().getName());
            response.setPhoneNumber(optionalDriver.get().getPhoneNumber());
            response.setSalary(optionalDriver.get().getSalary());

            return response;
        }
        return null;

    }
}
