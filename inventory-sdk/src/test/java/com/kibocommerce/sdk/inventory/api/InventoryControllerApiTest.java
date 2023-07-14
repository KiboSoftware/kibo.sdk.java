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
import com.kibocommerce.sdk.inventory.model.AggregateRequest;
import com.kibocommerce.sdk.inventory.model.AggregateResponse;
import com.kibocommerce.sdk.inventory.model.InventoryRequest;
import com.kibocommerce.sdk.inventory.model.InventoryResponse;
import com.kibocommerce.sdk.inventory.model.ItemQuantity;
import com.kibocommerce.sdk.inventory.model.RequestLocation;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InventoryControllerApi
 */
@Ignore
public class InventoryControllerApiTest {

    private final InventoryControllerApi api = new InventoryControllerApi();

    
    /**
     * 
     *
     * Aggregates Inventory
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void aggregateTest() throws ApiException {
        Integer xVolTenant = null;
        AggregateRequest aggregateRequest = null;
        Integer xVolSite = null;
        List<AggregateResponse> response = api.aggregate(xVolTenant, aggregateRequest, xVolSite);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get inventory from specified location
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInventoryTest() throws ApiException {
        Integer xVolTenant = null;
        String type = null;
        Integer xVolSite = null;
        List<ItemQuantity> items = null;
        RequestLocation requestLocation = null;
        List<String> locationWhitelist = null;
        List<String> locationBlacklist = null;
        Integer limit = null;
        Boolean ignoreSafetyStock = null;
        Boolean includeNegativeInventory = null;
        Boolean shippingLocation = null;
        Boolean transferEnabled = null;
        Boolean pickup = null;
        Boolean includeInAggregate = null;
        Boolean includeAttributes = null;
        List<InventoryResponse> response = api.getInventory(xVolTenant, type, xVolSite, items, requestLocation, locationWhitelist, locationBlacklist, limit, ignoreSafetyStock, includeNegativeInventory, shippingLocation, transferEnabled, pickup, includeInAggregate, includeAttributes);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Queries for specified inventory at given location
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postQueryInventoryTest() throws ApiException {
        Integer xVolTenant = null;
        InventoryRequest inventoryRequest = null;
        Integer xVolSite = null;
        List<InventoryResponse> response = api.postQueryInventory(xVolTenant, inventoryRequest, xVolSite);

        // TODO: test validations
    }
    
}