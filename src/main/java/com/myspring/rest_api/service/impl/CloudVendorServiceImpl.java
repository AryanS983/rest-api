package com.myspring.rest_api.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myspring.rest_api.model.CloudVendor;
import com.myspring.rest_api.repository.CloudVendorRepository;
import com.myspring.rest_api.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService{

    CloudVendorRepository cloudVendorRepository;
    
    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Cloud Vendor Created Successfully";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Cloud Vendor Updated Successfully";
    }

    @Override
    public String deleteCloudVendor(String vendorID) {
        cloudVendorRepository.deleteById(vendorID);
        return "Cloud Vendor Deleted Successfully";
    }

    @Override
    public CloudVendor getCloudVendor(String vendorID) {
        return cloudVendorRepository.findById(vendorID).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
    

}
