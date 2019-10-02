/*
 * Kibo Fulfillment API
 * REST API backing the Kibo Fulfiller User Interface
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.fulfillment.api;

import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.model.ClosePickWave;
import com.kibocommerce.sdk.fulfillment.model.CreatePickWave;
import com.kibocommerce.sdk.fulfillment.model.ResourceOfPickWave;
import com.kibocommerce.sdk.fulfillment.model.ResourcesOfPickWave;
import com.kibocommerce.sdk.fulfillment.model.ResourcesOfShipment;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PickWaveControllerApi
 */
@Ignore
public class PickWaveControllerApiTest {

    private final PickWaveControllerApi api = new PickWaveControllerApi();

    
    /**
     * closePickWave
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void closePickWaveUsingPUTTest() throws ApiException {
        Integer pickWaveNumber = null;
        Integer xVolTenant = null;
        ClosePickWave closePickWave = null;
        Integer xVolSite = null;
        ResourceOfPickWave response = api.closePickWaveUsingPUT(pickWaveNumber, xVolTenant, closePickWave, xVolSite);

        // TODO: test validations
    }
    
    /**
     * createPickWave
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPickWaveUsingPOSTTest() throws ApiException {
        Integer xVolTenant = null;
        CreatePickWave createPickWave = null;
        Integer xVolSite = null;
        ResourceOfPickWave response = api.createPickWaveUsingPOST(xVolTenant, createPickWave, xVolSite);

        // TODO: test validations
    }
    
    /**
     * getOpenPickWaves
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOpenPickWavesUsingGETTest() throws ApiException {
        String fulfillmentLocationCode = null;
        Integer xVolTenant = null;
        String shipmentType = null;
        String userId = null;
        Integer xVolSite = null;
        ResourcesOfPickWave response = api.getOpenPickWavesUsingGET(fulfillmentLocationCode, xVolTenant, shipmentType, userId, xVolSite);

        // TODO: test validations
    }
    
    /**
     * getPickWave
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPickWaveUsingGETTest() throws ApiException {
        Integer pickWaveNumber = null;
        Integer xVolTenant = null;
        Integer xVolSite = null;
        ResourceOfPickWave response = api.getPickWaveUsingGET(pickWaveNumber, xVolTenant, xVolSite);

        // TODO: test validations
    }
    
    /**
     * getShipmentsInPickWave
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShipmentsInPickWaveUsingGETTest() throws ApiException {
        Integer pickWaveNumber = null;
        Integer xVolTenant = null;
        Integer xVolSite = null;
        ResourcesOfShipment response = api.getShipmentsInPickWaveUsingGET(pickWaveNumber, xVolTenant, xVolSite);

        // TODO: test validations
    }
    
}