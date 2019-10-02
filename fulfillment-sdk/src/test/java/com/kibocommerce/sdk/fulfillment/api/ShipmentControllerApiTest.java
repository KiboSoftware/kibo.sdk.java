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
import com.kibocommerce.sdk.fulfillment.model.BackorderItemsRequest;
import com.kibocommerce.sdk.fulfillment.model.BackorderItemsUpdateRequest;
import com.kibocommerce.sdk.fulfillment.model.BackorderShipmentRequest;
import com.kibocommerce.sdk.fulfillment.model.CancelItemsRequest;
import com.kibocommerce.sdk.fulfillment.model.CancelShipment;
import com.kibocommerce.sdk.fulfillment.model.Destination;
import com.kibocommerce.sdk.fulfillment.model.ModelPackage;
import com.kibocommerce.sdk.fulfillment.model.PagedResourcesOfResourceOfShipment;
import com.kibocommerce.sdk.fulfillment.model.ReassignItemsRequest;
import com.kibocommerce.sdk.fulfillment.model.ReassignShipment;
import com.kibocommerce.sdk.fulfillment.model.RejectShipment;
import com.kibocommerce.sdk.fulfillment.model.ResourceOfShipment;
import com.kibocommerce.sdk.fulfillment.model.ResourcesOfDashboardResponse;
import com.kibocommerce.sdk.fulfillment.model.ResourcesOfTask;
import com.kibocommerce.sdk.fulfillment.model.Shipment;
import com.kibocommerce.sdk.fulfillment.model.TaskComplete;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ShipmentControllerApi
 */
@Ignore
public class ShipmentControllerApiTest {

    private final ShipmentControllerApi api = new ShipmentControllerApi();

    
    /**
     * backorderItemsUpdate
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void backorderItemsUpdateUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        Integer xVolTenant = null;
        BackorderItemsUpdateRequest backorderItemsUpdateRequest = null;
        Integer xVolSite = null;
        ResourceOfShipment response = api.backorderItemsUpdateUsingPUT(shipmentNumber, xVolTenant, backorderItemsUpdateRequest, xVolSite);

        // TODO: test validations
    }
    
    /**
     * backorderItems
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void backorderItemsUsingPOSTTest() throws ApiException {
        Integer shipmentNumber = null;
        Integer xVolTenant = null;
        BackorderItemsRequest backorderItemsRequest = null;
        Integer xVolSite = null;
        ResourceOfShipment response = api.backorderItemsUsingPOST(shipmentNumber, xVolTenant, backorderItemsRequest, xVolSite);

        // TODO: test validations
    }
    
    /**
     * backorderShipment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void backorderShipmentUsingPOSTTest() throws ApiException {
        Integer shipmentNumber = null;
        Integer xVolTenant = null;
        BackorderShipmentRequest backorderShipmentRequest = null;
        Integer xVolSite = null;
        ResourceOfShipment response = api.backorderShipmentUsingPOST(shipmentNumber, xVolTenant, backorderShipmentRequest, xVolSite);

        // TODO: test validations
    }
    
    /**
     * cancelItems
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelItemsUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        Integer xVolTenant = null;
        CancelItemsRequest cancelItemsRequest = null;
        Integer xVolSite = null;
        ResourceOfShipment response = api.cancelItemsUsingPUT(shipmentNumber, xVolTenant, cancelItemsRequest, xVolSite);

        // TODO: test validations
    }
    
    /**
     * cancelShipment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelShipmentUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        Integer xVolTenant = null;
        CancelShipment cancelShipment = null;
        Integer xVolSite = null;
        ResourceOfShipment response = api.cancelShipmentUsingPUT(shipmentNumber, xVolTenant, cancelShipment, xVolSite);

        // TODO: test validations
    }
    
    /**
     * deleteShipment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteShipmentUsingDELETETest() throws ApiException {
        Integer shipmentNumber = null;
        Integer xVolTenant = null;
        Integer xVolSite = null;
        api.deleteShipmentUsingDELETE(shipmentNumber, xVolTenant, xVolSite);

        // TODO: test validations
    }
    
    /**
     * destinationUpdate
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void destinationUpdateUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        Integer xVolTenant = null;
        Destination destination = null;
        Integer xVolSite = null;
        ResourceOfShipment response = api.destinationUpdateUsingPUT(shipmentNumber, xVolTenant, destination, xVolSite);

        // TODO: test validations
    }
    
    /**
     * execute
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String taskId = null;
        Integer xVolTenant = null;
        TaskComplete taskComplete = null;
        Integer xVolSite = null;
        ResourceOfShipment response = api.executeUsingPUT(shipmentNumber, taskId, xVolTenant, taskComplete, xVolSite);

        // TODO: test validations
    }
    
    /**
     * fulfillShipment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fulfillShipmentUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        Integer xVolTenant = null;
        Integer xVolSite = null;
        ResourceOfShipment response = api.fulfillShipmentUsingPUT(shipmentNumber, xVolTenant, xVolSite);

        // TODO: test validations
    }
    
    /**
     * getDashboard
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDashboardUsingGETTest() throws ApiException {
        List<String> fulfillmentLocationCodes = null;
        Integer xVolTenant = null;
        Integer xVolSite = null;
        ResourcesOfDashboardResponse response = api.getDashboardUsingGET(fulfillmentLocationCodes, xVolTenant, xVolSite);

        // TODO: test validations
    }
    
    /**
     * getShipment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShipmentUsingGETTest() throws ApiException {
        Integer shipmentNumber = null;
        Integer xVolTenant = null;
        Integer xVolSite = null;
        ResourceOfShipment response = api.getShipmentUsingGET(shipmentNumber, xVolTenant, xVolSite);

        // TODO: test validations
    }
    
    /**
     * getShipments
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShipmentsUsingGETTest() throws ApiException {
        Integer xVolTenant = null;
        String filter = null;
        Boolean isLate = null;
        Integer page = null;
        Integer pageSize = null;
        String quickSearch = null;
        String sort = null;
        String workflowTaskName = null;
        Integer xVolSite = null;
        PagedResourcesOfResourceOfShipment response = api.getShipmentsUsingGET(xVolTenant, filter, isLate, page, pageSize, quickSearch, sort, workflowTaskName, xVolSite);

        // TODO: test validations
    }
    
    /**
     * getTasks
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTasksUsingGETTest() throws ApiException {
        Integer shipmentNumber = null;
        Integer xVolTenant = null;
        Integer xVolSite = null;
        ResourcesOfTask response = api.getTasksUsingGET(shipmentNumber, xVolTenant, xVolSite);

        // TODO: test validations
    }
    
    /**
     * newShipment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newShipmentUsingPOSTTest() throws ApiException {
        Integer xVolTenant = null;
        Shipment shipment = null;
        Integer xVolSite = null;
        ResourceOfShipment response = api.newShipmentUsingPOST(xVolTenant, shipment, xVolSite);

        // TODO: test validations
    }
    
    /**
     * reassignItems
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reassignItemsUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        Integer xVolTenant = null;
        ReassignItemsRequest reassignItemsRequest = null;
        Integer xVolSite = null;
        ResourceOfShipment response = api.reassignItemsUsingPUT(shipmentNumber, xVolTenant, reassignItemsRequest, xVolSite);

        // TODO: test validations
    }
    
    /**
     * reassignShipment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reassignShipmentUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        Integer xVolTenant = null;
        ReassignShipment reassignShipment = null;
        Integer xVolSite = null;
        ResourceOfShipment response = api.reassignShipmentUsingPUT(shipmentNumber, xVolTenant, reassignShipment, xVolSite);

        // TODO: test validations
    }
    
    /**
     * rejectShipment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rejectShipmentUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        Integer xVolTenant = null;
        RejectShipment rejectShipment = null;
        Integer xVolSite = null;
        ResourceOfShipment response = api.rejectShipmentUsingPUT(shipmentNumber, xVolTenant, rejectShipment, xVolSite);

        // TODO: test validations
    }
    
    /**
     * replaceShipment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceShipmentUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        Integer xVolTenant = null;
        Shipment shipment = null;
        Integer xVolSite = null;
        ResourceOfShipment response = api.replaceShipmentUsingPUT(shipmentNumber, xVolTenant, shipment, xVolSite);

        // TODO: test validations
    }
    
    /**
     * revert
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revertUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String taskId = null;
        Integer xVolTenant = null;
        Integer xVolSite = null;
        ResourceOfShipment response = api.revertUsingPUT(shipmentNumber, taskId, xVolTenant, xVolSite);

        // TODO: test validations
    }
    
    /**
     * skipTask
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void skipTaskUsingPUTTest() throws ApiException {
        Integer shipmentNumber = null;
        String taskId = null;
        Integer xVolTenant = null;
        Integer xVolSite = null;
        ResourceOfShipment response = api.skipTaskUsingPUT(shipmentNumber, taskId, xVolTenant, xVolSite);

        // TODO: test validations
    }
    
    /**
     * updatePackage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePackageUsingPUTTest() throws ApiException {
        String packageId = null;
        Integer shipmentNumber = null;
        Integer xVolTenant = null;
        ModelPackage modelPackage = null;
        Integer xVolSite = null;
        ResourceOfShipment response = api.updatePackageUsingPUT(packageId, shipmentNumber, xVolTenant, modelPackage, xVolSite);

        // TODO: test validations
    }
    
    /**
     * workflowDefinitionImage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowDefinitionImageUsingGETTest() throws ApiException {
        Integer shipmentNumber = null;
        Integer xVolTenant = null;
        Integer xVolSite = null;
        String response = api.workflowDefinitionImageUsingGET(shipmentNumber, xVolTenant, xVolSite);

        // TODO: test validations
    }
    
    /**
     * workflowInstanceImage
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowInstanceImageUsingGETTest() throws ApiException {
        Integer shipmentNumber = null;
        Integer xVolTenant = null;
        Integer xVolSite = null;
        String response = api.workflowInstanceImageUsingGET(shipmentNumber, xVolTenant, xVolSite);

        // TODO: test validations
    }
    
}