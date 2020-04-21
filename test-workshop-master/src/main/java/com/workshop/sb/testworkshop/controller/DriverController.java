package com.workshop.sb.testworkshop.controller;

import com.workshop.sb.testworkshop.model.request.DriverRequest;
import com.workshop.sb.testworkshop.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Driver;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class DriverController {

    @Autowired
    DriverService driverService;


    @PostMapping("/driver")
    public ResponseEntity AddNewDriver(@RequestBody DriverRequest request) {

        try {
            driverService.AddNewDriver(request);
            return ResponseEntity.ok("success");

        } catch (Exception e) {
            e.printStackTrace();
            return (ResponseEntity) ResponseEntity.badRequest();
        }
    }


    @RequestMapping(value = "/driver/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity DeleteDriverData(@PathVariable("id") Integer id) {

        try {
            driverService.DeleteDriverData(id);
            return ResponseEntity.ok("success");

        } catch (Exception e) {
            e.printStackTrace();
            return (ResponseEntity) ResponseEntity.badRequest();
        }
    }


    @RequestMapping(value = "/driver/get/{id}", method = RequestMethod.GET)
    public Driver GetDriverDataById(@PathVariable("id") Integer id) {

        try {
            return (Driver) driverService.GetDriverDataById(id);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    @RequestMapping(value = "/driver/get/all", method = RequestMethod.GET)
    public List<com.workshop.sb.testworkshop.persistance.model.Driver> GetDriverDataAll() {

        try {
            return driverService.GetDriverDataAll();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    @RequestMapping(value = "/driver/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity UpdateDriverData(@RequestBody DriverRequest request,@PathVariable("id") Integer id) {

        try {
            driverService.UpdateDriverData(request,id);
            return ResponseEntity.ok("success");

        } catch (Exception e) {
            e.printStackTrace();
            return (ResponseEntity) ResponseEntity.badRequest();
        }
    }

}



