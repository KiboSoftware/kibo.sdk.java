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


package com.kibocommerce.kibo.sdk.phps.inventory;

import com.kibocommerce.kibo.sdk.java.inventory.ApiException;
import com.kibocommerce.kibo.sdk.java.inventory.model.TenantConfigModel;
import com.kibocommerce.kibo.sdk.java.inventory.model.UpdateTenantConfigRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TenantConfigControllerApi
 */
@Ignore
public class TenantConfigControllerApiTest {

    private final TenantConfigControllerApi api = new TenantConfigControllerApi();

    
    /**
     * 
     *
     * Creates or updates tenant config
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTenantConfigTest() throws ApiException {
        UpdateTenantConfigRequest updateTenantConfigRequest = null;
        Integer response = api.createTenantConfig(updateTenantConfigRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets tenant config
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTenantConfigTest() throws ApiException {
        Integer xVolTenant = null;
        TenantConfigModel response = api.getTenantConfig(xVolTenant);

        // TODO: test validations
    }
    
}
