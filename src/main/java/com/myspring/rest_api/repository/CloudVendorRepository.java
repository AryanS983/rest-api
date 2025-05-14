package com.myspring.rest_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myspring.rest_api.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
    // This interface will automatically provide CRUD operations for the CloudVendor entity
    // No need to implement any methods here, JpaRepository takes care of it

    
}
