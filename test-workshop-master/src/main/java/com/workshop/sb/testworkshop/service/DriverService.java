package com.workshop.sb.testworkshop.service;

import com.workshop.sb.testworkshop.model.request.DriverRequest;
import com.workshop.sb.testworkshop.model.response.DriverResponse;
import com.workshop.sb.testworkshop.persistance.model.Driver;
import com.workshop.sb.testworkshop.persistance.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    public void AddNewDriver(DriverRequest request) throws Exception {
        Driver driverData = new Driver(request);  //driver data formatnya driver dengan isi dari DriverRequest(data from jason)
        driverRepository.save(driverData);
    }

    public void DeleteDriverData(Integer id) throws Exception {
        driverRepository.deleteById(id);
    }

    public Driver GetDriverDataById(Integer id) throws Exception {
        return driverRepository.findById(id).orElse(null);
    }

    public void UpdateDriverData(@RequestBody DriverRequest request, Integer id) throws Exception {
        Driver driverData = new Driver(request);
        driverData.setId(id);
        driverRepository.save(driverData);
    }

    public List<Driver> GetDriverDataAll() throws Exception {
        List<Driver> supir = new ArrayList<>();
        driverRepository.findAll().forEach(supir::add);
        return supir;

    }
}