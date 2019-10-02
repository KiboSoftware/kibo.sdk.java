# fulfillment-sdk

Kibo Fulfillment API
- API version: 1.0
  - Build date: 2019-10-02T09:23:50.115103-05:00[America/Chicago]

REST API backing the Kibo Fulfiller User Interface


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.kibocommerce</groupId>
  <artifactId>fulfillment-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.kibocommerce:fulfillment-sdk:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/fulfillment-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.kibocommerce.sdk.fulfillment.*;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.model.*;
import com.kibocommerce.sdk.fulfillment.api.FulfillmentControllerApi;

import java.io.File;
import java.util.*;

public class FulfillmentControllerApiExample {

    public static void main(String[] args) {
        
        FulfillmentControllerApi apiInstance = new FulfillmentControllerApi();
        Integer xVolTenant = 56; // Integer | 
        Integer xVolSite = 56; // Integer | 
        try {
            String result = apiInstance.fulfillmentUsingGET(xVolTenant, xVolSite);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FulfillmentControllerApi#fulfillmentUsingGET");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://services-tp.dev01.kubedev.kibo-dev.com/kibo.fulfillment.webapi*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FulfillmentControllerApi* | [**fulfillmentUsingGET**](docs/FulfillmentControllerApi.md#fulfillmentUsingGET) | **GET** /commerce/fulfillment | fulfillment
*FulfillmentControllerApi* | [**getAuthorizedUserNameUsingGET**](docs/FulfillmentControllerApi.md#getAuthorizedUserNameUsingGET) | **GET** /commerce/fulfillment/user/username | getAuthorizedUserName
*FulfillmentControllerApi* | [**getAuthorizedUserRolesUsingGET**](docs/FulfillmentControllerApi.md#getAuthorizedUserRolesUsingGET) | **GET** /commerce/fulfillment/user/behaviors | getAuthorizedUserRoles
*FulfillmentControllerApi* | [**getPrincipalUsingGET**](docs/FulfillmentControllerApi.md#getPrincipalUsingGET) | **GET** /commerce/fulfillment/user/principal | getPrincipal
*FulfillmentControllerApi* | [**homeUsingGET**](docs/FulfillmentControllerApi.md#homeUsingGET) | **GET** /commerce/fulfillment/user/hello | home
*FulfillmentControllerApi* | [**storeAssociateUsingGET**](docs/FulfillmentControllerApi.md#storeAssociateUsingGET) | **GET** /commerce/fulfillment/associate | storeAssociate
*FulfillmentControllerApi* | [**storeManagerUsingGET**](docs/FulfillmentControllerApi.md#storeManagerUsingGET) | **GET** /commerce/fulfillment/manager | storeManager
*PickWaveControllerApi* | [**closePickWaveUsingPUT**](docs/PickWaveControllerApi.md#closePickWaveUsingPUT) | **PUT** /commerce/pickwaves/{pickWaveNumber}/closed | closePickWave
*PickWaveControllerApi* | [**createPickWaveUsingPOST**](docs/PickWaveControllerApi.md#createPickWaveUsingPOST) | **POST** /commerce/pickwaves | createPickWave
*PickWaveControllerApi* | [**getOpenPickWavesUsingGET**](docs/PickWaveControllerApi.md#getOpenPickWavesUsingGET) | **GET** /commerce/pickwaves/open/{fulfillmentLocationCode} | getOpenPickWaves
*PickWaveControllerApi* | [**getPickWaveUsingGET**](docs/PickWaveControllerApi.md#getPickWaveUsingGET) | **GET** /commerce/pickwaves/{pickWaveNumber} | getPickWave
*PickWaveControllerApi* | [**getShipmentsInPickWaveUsingGET**](docs/PickWaveControllerApi.md#getShipmentsInPickWaveUsingGET) | **GET** /commerce/pickwaves/{pickWaveNumber}/shipments | getShipmentsInPickWave
*ShipmentAttributesControllerApi* | [**deleteShipmentAttributeUsingDELETE**](docs/ShipmentAttributesControllerApi.md#deleteShipmentAttributeUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber}/attributes/{key} | deleteShipmentAttribute
*ShipmentAttributesControllerApi* | [**getShipmentAttributeUsingGET**](docs/ShipmentAttributesControllerApi.md#getShipmentAttributeUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/attributes/{key} | getShipmentAttribute
*ShipmentAttributesControllerApi* | [**getShipmentAttributesUsingGET**](docs/ShipmentAttributesControllerApi.md#getShipmentAttributesUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/attributes | getShipmentAttributes
*ShipmentAttributesControllerApi* | [**setShipmentAttributeUsingPUT**](docs/ShipmentAttributesControllerApi.md#setShipmentAttributeUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/attributes/{key} | setShipmentAttribute
*ShipmentAttributesControllerApi* | [**setShipmentAttributesUsingPUT**](docs/ShipmentAttributesControllerApi.md#setShipmentAttributesUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/attributes | setShipmentAttributes
*ShipmentControllerApi* | [**backorderItemsUpdateUsingPUT**](docs/ShipmentControllerApi.md#backorderItemsUpdateUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/backorderedItems | backorderItemsUpdate
*ShipmentControllerApi* | [**backorderItemsUsingPOST**](docs/ShipmentControllerApi.md#backorderItemsUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/backorderedItems | backorderItems
*ShipmentControllerApi* | [**backorderShipmentUsingPOST**](docs/ShipmentControllerApi.md#backorderShipmentUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/backordered | backorderShipment
*ShipmentControllerApi* | [**cancelItemsUsingPUT**](docs/ShipmentControllerApi.md#cancelItemsUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/canceledItems | cancelItems
*ShipmentControllerApi* | [**cancelShipmentUsingPUT**](docs/ShipmentControllerApi.md#cancelShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/canceled | cancelShipment
*ShipmentControllerApi* | [**deleteShipmentUsingDELETE**](docs/ShipmentControllerApi.md#deleteShipmentUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber} | deleteShipment
*ShipmentControllerApi* | [**destinationUpdateUsingPUT**](docs/ShipmentControllerApi.md#destinationUpdateUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/destination | destinationUpdate
*ShipmentControllerApi* | [**executeUsingPUT**](docs/ShipmentControllerApi.md#executeUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/tasks/{taskId}/completed | execute
*ShipmentControllerApi* | [**fulfillShipmentUsingPUT**](docs/ShipmentControllerApi.md#fulfillShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/fulfilled | fulfillShipment
*ShipmentControllerApi* | [**getDashboardUsingGET**](docs/ShipmentControllerApi.md#getDashboardUsingGET) | **GET** /commerce/shipments/dashboard | getDashboard
*ShipmentControllerApi* | [**getShipmentUsingGET**](docs/ShipmentControllerApi.md#getShipmentUsingGET) | **GET** /commerce/shipments/{shipmentNumber} | getShipment
*ShipmentControllerApi* | [**getShipmentsUsingGET**](docs/ShipmentControllerApi.md#getShipmentsUsingGET) | **GET** /commerce/shipments | getShipments
*ShipmentControllerApi* | [**getTasksUsingGET**](docs/ShipmentControllerApi.md#getTasksUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/tasks | getTasks
*ShipmentControllerApi* | [**newShipmentUsingPOST**](docs/ShipmentControllerApi.md#newShipmentUsingPOST) | **POST** /commerce/shipments | newShipment
*ShipmentControllerApi* | [**reassignItemsUsingPUT**](docs/ShipmentControllerApi.md#reassignItemsUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/reassignedItems | reassignItems
*ShipmentControllerApi* | [**reassignShipmentUsingPUT**](docs/ShipmentControllerApi.md#reassignShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/reassigned | reassignShipment
*ShipmentControllerApi* | [**rejectShipmentUsingPUT**](docs/ShipmentControllerApi.md#rejectShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/rejected | rejectShipment
*ShipmentControllerApi* | [**replaceShipmentUsingPUT**](docs/ShipmentControllerApi.md#replaceShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber} | replaceShipment
*ShipmentControllerApi* | [**revertUsingPUT**](docs/ShipmentControllerApi.md#revertUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/tasks/{taskId}/reverted | revert
*ShipmentControllerApi* | [**skipTaskUsingPUT**](docs/ShipmentControllerApi.md#skipTaskUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/tasks/{taskId}/skipped | skipTask
*ShipmentControllerApi* | [**updatePackageUsingPUT**](docs/ShipmentControllerApi.md#updatePackageUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/packages/{packageId} | updatePackage
*ShipmentControllerApi* | [**workflowDefinitionImageUsingGET**](docs/ShipmentControllerApi.md#workflowDefinitionImageUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/workflow-definition-image | workflowDefinitionImage
*ShipmentControllerApi* | [**workflowInstanceImageUsingGET**](docs/ShipmentControllerApi.md#workflowInstanceImageUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/workflow-instance-image | workflowInstanceImage
*WorkflowProcessControllerApi* | [**getWorkflowProcessUsingGET**](docs/WorkflowProcessControllerApi.md#getWorkflowProcessUsingGET) | **GET** /commerce/processes/definitions/{containerId}/{processId} | getWorkflowProcess
*WorkflowProcessControllerApi* | [**getWorkflowProcessUsingGET1**](docs/WorkflowProcessControllerApi.md#getWorkflowProcessUsingGET1) | **GET** /commerce/processes/shipmentType/{shipmentType} | getWorkflowProcess
*WorkflowProcessControllerApi* | [**getWorkflowProcessesUsingGET**](docs/WorkflowProcessControllerApi.md#getWorkflowProcessesUsingGET) | **GET** /commerce/processes/definitions | getWorkflowProcesses


## Documentation for Models

 - [Address](docs/Address.md)
 - [Attribute](docs/Attribute.md)
 - [AuditInfo](docs/AuditInfo.md)
 - [BackorderItem](docs/BackorderItem.md)
 - [BackorderItemUpdate](docs/BackorderItemUpdate.md)
 - [BackorderItemsRequest](docs/BackorderItemsRequest.md)
 - [BackorderItemsUpdateRequest](docs/BackorderItemsUpdateRequest.md)
 - [BackorderShipmentRequest](docs/BackorderShipmentRequest.md)
 - [BinShipmentProductQuantity](docs/BinShipmentProductQuantity.md)
 - [CancelItem](docs/CancelItem.md)
 - [CancelItemsRequest](docs/CancelItemsRequest.md)
 - [CancelShipment](docs/CancelShipment.md)
 - [CanceledItem](docs/CanceledItem.md)
 - [CanceledReason](docs/CanceledReason.md)
 - [ChangeMessage](docs/ChangeMessage.md)
 - [ClosePickWave](docs/ClosePickWave.md)
 - [Contact](docs/Contact.md)
 - [CreatePickWave](docs/CreatePickWave.md)
 - [DashboardResponse](docs/DashboardResponse.md)
 - [DashboardStepDto](docs/DashboardStepDto.md)
 - [Destination](docs/Destination.md)
 - [HandleOption](docs/HandleOption.md)
 - [Item](docs/Item.md)
 - [Link](docs/Link.md)
 - [Measurement](docs/Measurement.md)
 - [ModelPackage](docs/ModelPackage.md)
 - [PackageMeasurements](docs/PackageMeasurements.md)
 - [PageMetadata](docs/PageMetadata.md)
 - [PagedResourcesOfResourceOfShipment](docs/PagedResourcesOfResourceOfShipment.md)
 - [Phone](docs/Phone.md)
 - [PickWave](docs/PickWave.md)
 - [PickWaveBinRange](docs/PickWaveBinRange.md)
 - [PickWaveContent](docs/PickWaveContent.md)
 - [PickWaveProductMatch](docs/PickWaveProductMatch.md)
 - [Principal](docs/Principal.md)
 - [ProductOption](docs/ProductOption.md)
 - [ReassignItem](docs/ReassignItem.md)
 - [ReassignItemsRequest](docs/ReassignItemsRequest.md)
 - [ReassignShipment](docs/ReassignShipment.md)
 - [ReassignedReason](docs/ReassignedReason.md)
 - [RejectShipment](docs/RejectShipment.md)
 - [RejectedReason](docs/RejectedReason.md)
 - [ResourceOfPickWave](docs/ResourceOfPickWave.md)
 - [ResourceOfShipment](docs/ResourceOfShipment.md)
 - [ResourceOfWorkflowProcess](docs/ResourceOfWorkflowProcess.md)
 - [ResourcesOfDashboardResponse](docs/ResourcesOfDashboardResponse.md)
 - [ResourcesOfPickWave](docs/ResourcesOfPickWave.md)
 - [ResourcesOfResourceOfWorkflowProcess](docs/ResourcesOfResourceOfWorkflowProcess.md)
 - [ResourcesOfShipment](docs/ResourcesOfShipment.md)
 - [ResourcesOfTask](docs/ResourcesOfTask.md)
 - [Shipment](docs/Shipment.md)
 - [Task](docs/Task.md)
 - [TaskComplete](docs/TaskComplete.md)
 - [TaskDefinition](docs/TaskDefinition.md)
 - [TaskInput](docs/TaskInput.md)
 - [WorkflowProcess](docs/WorkflowProcess.md)
 - [WorkflowProcessVariable](docs/WorkflowProcessVariable.md)
 - [WorkflowState](docs/WorkflowState.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### AppClaims

- **Type**: API key
- **API key parameter name**: x-vol-app-claims
- **Location**: HTTP header

### Bearer

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

### UserClaims

- **Type**: API key
- **API key parameter name**: x-vol-user-claims
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


