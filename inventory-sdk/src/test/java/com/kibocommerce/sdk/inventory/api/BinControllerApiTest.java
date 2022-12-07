/*
 * Inventory
 * Swagger JSON for inventory apis
 *
 * OpenAPI spec version: 5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.inventory.api;

import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.model.BaseResponse;
import com.kibocommerce.sdk.inventory.model.Bin;
import com.kibocommerce.sdk.inventory.model.BinIDResponse;
import com.kibocommerce.sdk.inventory.model.BinResponseModel;
import com.kibocommerce.sdk.inventory.model.BinSearchRequest;
import com.kibocommerce.sdk.inventory.model.BinSearchResponse;
import com.kibocommerce.sdk.inventory.model.BinStatusModel;
import com.kibocommerce.sdk.inventory.model.BinTypeModel;
import com.kibocommerce.sdk.inventory.model.CreateBinRequest;
import com.kibocommerce.sdk.inventory.model.LoadBinInventoryRequest;
import com.kibocommerce.sdk.inventory.model.LoadBinInventoryResponse;
import com.kibocommerce.sdk.inventory.model.UpdateBinRequest;
import com.kibocommerce.sdk.inventory.model.UpdateBinsRequest;
import com.kibocommerce.sdk.inventory.model.UpdateBinsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BinControllerApi
 */
@Ignore
public class BinControllerApiTest {

    private final BinControllerApi api = new BinControllerApi();

    
    /**
     * 
     *
     * Create a bin
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBinTest() throws ApiException {
        Integer xVolTenant = null;
        CreateBinRequest createBinRequest = null;
        BinIDResponse response = api.createBin(xVolTenant, createBinRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete a bin
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBinTest() throws ApiException {
        Integer xVolTenant = null;
        Long binId = null;
        Integer binName = null;
        String locationCode = null;
        BaseResponse response = api.deleteBin(xVolTenant, binId, binName, locationCode);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a bin
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBinTest() throws ApiException {
        Integer xVolTenant = null;
        Long binId = null;
        Bin response = api.getBin(xVolTenant, binId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get list of bin statuses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBinStatusesTest() throws ApiException {
        Integer xVolTenant = null;
        List<BinStatusModel> response = api.getBinStatuses(xVolTenant);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get list of bin types
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBinTypesTest() throws ApiException {
        Integer xVolTenant = null;
        List<BinTypeModel> response = api.getBinTypes(xVolTenant);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a list of bins
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBinsTest() throws ApiException {
        Integer xVolTenant = null;
        Long locationID = null;
        Long searchTerm = null;
        Long perPage = null;
        Long page = null;
        BinResponseModel response = api.getBins(xVolTenant, locationID, searchTerm, perPage, page);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Loads bin inventory for designated bins
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void loadInventoryTest() throws ApiException {
        Integer xVolTenant = null;
        LoadBinInventoryRequest loadBinInventoryRequest = null;
        LoadBinInventoryResponse response = api.loadInventory(xVolTenant, loadBinInventoryRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Search bins for a inventory by bin name or any product identifier
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchBinsTest() throws ApiException {
        Integer xVolTenant = null;
        BinSearchRequest binSearchRequest = null;
        BinSearchResponse response = api.searchBins(xVolTenant, binSearchRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update the designated bin
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBinTest() throws ApiException {
        Integer xVolTenant = null;
        Long binId = null;
        UpdateBinRequest updateBinRequest = null;
        Bin response = api.updateBin(xVolTenant, binId, updateBinRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update the designated bins
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBinsTest() throws ApiException {
        Integer xVolTenant = null;
        UpdateBinsRequest updateBinsRequest = null;
        UpdateBinsResponse response = api.updateBins(xVolTenant, updateBinsRequest);

        // TODO: test validations
    }
    
}
