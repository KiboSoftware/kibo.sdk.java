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
import com.kibocommerce.sdk.inventory.model.InlineResponse5001;
import com.kibocommerce.sdk.inventory.model.ShipmentInventoryAllocationRequest;
import com.kibocommerce.sdk.inventory.model.ShipmentInventoryAllocationResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ShipmentInventoryAllocationControllerApi
 */
@Ignore
public class ShipmentInventoryAllocationControllerApiTest {

    private final ShipmentInventoryAllocationControllerApi api = new ShipmentInventoryAllocationControllerApi();

    
    /**
     * 
     *
     * Get future Inventory Allocations by shipment Ids
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShipmentInventoryAllocationsTest() throws ApiException {
        Integer xVolTenant = null;
        ShipmentInventoryAllocationRequest shipmentInventoryAllocationRequest = null;
        ShipmentInventoryAllocationResponse response = api.getShipmentInventoryAllocations(xVolTenant, shipmentInventoryAllocationRequest);

        // TODO: test validations
    }
    
}