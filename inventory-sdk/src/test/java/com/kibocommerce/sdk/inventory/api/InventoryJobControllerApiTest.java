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
import com.kibocommerce.sdk.inventory.model.JobIDResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InventoryJobControllerApi
 */
@Ignore
public class InventoryJobControllerApiTest {

    private final InventoryJobControllerApi api = new InventoryJobControllerApi();

    
    /**
     * 
     *
     * Deletes older records from inventory table of all silos
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAllOldInventoryTest() throws ApiException {
        Integer xVolTenant = null;
        Integer months = null;
        List<JobIDResponse> response = api.deleteAllOldInventory(xVolTenant, months);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes older records from inventory table
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOldInventoryTest() throws ApiException {
        Integer xVolTenant = null;
        Integer months = null;
        JobIDResponse response = api.deleteOldInventory(xVolTenant, months);

        // TODO: test validations
    }
    
}
