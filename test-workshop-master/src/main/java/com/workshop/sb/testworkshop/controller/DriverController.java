package com.workshop.sb.testworkshop.controller;

import com.workshop.sb.testworkshop.model.request.DriverRequest;
import com.workshop.sb.testworkshop.model.response.BaseResponse;
import com.workshop.sb.testworkshop.model.response.DriverResponse;
import com.workshop.sb.testworkshop.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/driver")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @PostMapping()
    public ResponseEntity AddNewDriver(@RequestBody DriverRequest request) {
        try {
            driverService.addNewDriver(request);
            return ResponseEntity.ok("success");
        } catch (Exception e) {
            e.printStackTrace();
            return (ResponseEntity) ResponseEntity.badRequest();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<BaseResponse> getDriverById(@PathVariable("id") int id) {
        DriverResponse driver = driverService.getDataDriverById(id);
        if (driver != null) {
            BaseResponse response = new BaseResponse();
            response.setStatus("ok");
            response.setResult(driver);
            response.setMessage("success");
            return ResponseEntity.ok(response);
        }
        return (ResponseEntity) ResponseEntity.badRequest();
    }

    @PutMapping()
    public ResponseEntity updateDataDriver() {
        return null;
    }

    @DeleteMapping()
    public ResponseEntity removeDataDriverById(@PathVariable int id) {
        return null;
    }

    @GetMapping("/all")
    public ResponseEntity getAllDataDriver() {
        return null;
    }
}
