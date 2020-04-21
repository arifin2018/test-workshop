package com.workshop.sb.testworkshop.persistance.repository;

import com.workshop.sb.testworkshop.persistance.model.Driver;
import org.springframework.data.repository.CrudRepository;

public interface DriverRepository extends CrudRepository<Driver, Integer> {
}
