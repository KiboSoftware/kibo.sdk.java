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
import com.kibocommerce.sdk.inventory.model.BlockAssignmentRequest;
import com.kibocommerce.sdk.inventory.model.InlineResponse500;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BlockAssignmentControllerApi
 */
@Ignore
public class BlockAssignmentControllerApiTest {

    private final BlockAssignmentControllerApi api = new BlockAssignmentControllerApi();

    
    /**
     * 
     *
     * Setting the blockAssignment flag to true for the product based on the given request
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void blockAssignmentTest() throws ApiException {
        Integer xVolTenant = null;
        BlockAssignmentRequest blockAssignmentRequest = null;
        BaseResponse response = api.blockAssignment(xVolTenant, blockAssignmentRequest);

        // TODO: test validations
    }
    
}
