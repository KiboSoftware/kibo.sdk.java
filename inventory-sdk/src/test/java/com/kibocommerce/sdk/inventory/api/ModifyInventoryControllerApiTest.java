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
import com.kibocommerce.sdk.inventory.model.AdjustRequest;
import com.kibocommerce.sdk.inventory.model.DeleteItemRequest;
import com.kibocommerce.sdk.inventory.model.DeleteItemResponse;
import com.kibocommerce.sdk.inventory.model.InlineResponse404;
import com.kibocommerce.sdk.inventory.model.InventoryResponse;
import com.kibocommerce.sdk.inventory.model.RefreshRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ModifyInventoryControllerApi
 */
@Ignore
public class ModifyInventoryControllerApiTest {

    private final ModifyInventoryControllerApi api = new ModifyInventoryControllerApi();

    
    /**
     * 
     *
     * Adjust Inventory
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void adjustTest() throws ApiException {
        Integer xVolTenant = null;
        AdjustRequest adjustRequest = null;
        Integer response = api.adjust(xVolTenant, adjustRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete Inventory
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        Integer xVolTenant = null;
        DeleteItemRequest deleteItemRequest = null;
        Integer xVolSite = null;
        DeleteItemResponse response = api.delete(xVolTenant, deleteItemRequest, xVolSite);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Refresh Inventory
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void refreshTest() throws ApiException {
        Integer xVolTenant = null;
        RefreshRequest refreshRequest = null;
        Integer response = api.refresh(xVolTenant, refreshRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Adjust Inventory - synchronous
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void syncAdjustTest() throws ApiException {
        Integer xVolTenant = null;
        AdjustRequest adjustRequest = null;
        List<InventoryResponse> response = api.syncAdjust(xVolTenant, adjustRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Refresh Inventory - synchronous
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void syncRefreshTest() throws ApiException {
        Integer xVolTenant = null;
        RefreshRequest refreshRequest = null;
        List<InventoryResponse> response = api.syncRefresh(xVolTenant, refreshRequest);

        // TODO: test validations
    }
    
}