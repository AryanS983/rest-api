package com.myspring.rest_api.controller;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myspring.rest_api.model.CloudVendor;
import com.myspring.rest_api.service.CloudVendorService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("{vendorID}")
    public CloudVendor getCloudVendor(@PathVariable("vendorID") String vendorID) {
        return cloudVendorService.getCloudVendor(vendorID);

    }

    @PostMapping("/create")
    public String CreateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping("/update")
    public String putMethodName(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("/delete/{vendorID}")
    public String deleteVendorDetails(@PathVariable("vendorID") String vendorID) {
        cloudVendorService.deleteCloudVendor(vendorID);
        return "Cloud Vendor Deleted Successfully";
    }
    @GetMapping()
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorService.getAllCloudVendors();
    }
}
