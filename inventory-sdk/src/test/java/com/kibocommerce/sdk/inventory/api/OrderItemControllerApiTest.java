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
import com.kibocommerce.sdk.inventory.model.OrderItemInformation;
import com.kibocommerce.sdk.inventory.model.OrderItemInformationRequest;
import com.kibocommerce.sdk.inventory.model.OrderItemLogRequest;
import com.kibocommerce.sdk.inventory.model.OrderItemLogResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrderItemControllerApi
 */
@Ignore
public class OrderItemControllerApiTest {

    private final OrderItemControllerApi api = new OrderItemControllerApi();

    
    /**
     * 
     *
     * Get Order Item Information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderItemInformationTest() throws ApiException {
        Integer xVolTenant = null;
        OrderItemInformationRequest orderItemInformationRequest = null;
        List<OrderItemInformation> response = api.getOrderItemInformation(xVolTenant, orderItemInformationRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get Order Item Log
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderItemLogTest() throws ApiException {
        Integer xVolTenant = null;
        OrderItemLogRequest orderItemLogRequest = null;
        List<OrderItemLogResponse> response = api.getOrderItemLog(xVolTenant, orderItemLogRequest);

        // TODO: test validations
    }
    
}
