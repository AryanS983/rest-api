package com.myspring.rest_api.service;

import java.util.List;

import com.myspring.rest_api.model.CloudVendor;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String vendorID);
    public CloudVendor getCloudVendor(String vendorID);
    public List<CloudVendor> getAllCloudVendors();
}
