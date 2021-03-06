# fulfillment-sdk

Kibo Fulfillment API - Production Profile
- API version: 1.0
  - Build date: 2020-12-08T12:42:53.880-06:00[America/Chicago]

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
import com.kibocommerce.sdk.fulfillment.api.CustomerSurveyControllerApi;

import java.io.File;
import java.util.*;

public class CustomerSurveyControllerApiExample {

    public static void main(String[] args) {
        
        CustomerSurveyControllerApi apiInstance = new CustomerSurveyControllerApi();
        Integer shipmentNumber = 56; // Integer | shipmentNumber
        Integer xVolTenant = 56; // Integer | 
        CustomerSurvey customerSurvey = new CustomerSurvey(); // CustomerSurvey | customerSurveyDto
        Integer xVolSite = 56; // Integer | 
        try {
            EntityModelOfCustomerSurvey result = apiInstance.createSurveyUsingPOST(shipmentNumber, xVolTenant, customerSurvey, xVolSite);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerSurveyControllerApi#createSurveyUsingPOST");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://2.services.sb.ng-qa.dev.kibocommerce.com/kibo.fulfillment.webapi*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CustomerSurveyControllerApi* | [**createSurveyUsingPOST**](docs/CustomerSurveyControllerApi.md#createSurveyUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/surveys | createSurvey
*CustomerSurveyControllerApi* | [**getSurveyUsingGET**](docs/CustomerSurveyControllerApi.md#getSurveyUsingGET) | **GET** /commerce/shipments/surveys/{id} | getSurvey
*CustomerSurveyControllerApi* | [**getSurveysUsingGET**](docs/CustomerSurveyControllerApi.md#getSurveysUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/surveys | getSurveys
*ManifestControllerApi* | [**createManifestUsingPOST**](docs/ManifestControllerApi.md#createManifestUsingPOST) | **POST** /commerce/fulfillment/shipping/manifests | createManifest
*ManifestControllerApi* | [**getEligibleShipmentsUsingGET**](docs/ManifestControllerApi.md#getEligibleShipmentsUsingGET) | **GET** /commerce/fulfillment/shipping/manifests/eligibleShipments | getEligibleShipments
*ManifestControllerApi* | [**getManifestUsingGET**](docs/ManifestControllerApi.md#getManifestUsingGET) | **GET** /commerce/fulfillment/shipping/manifests/{manifestId} | getManifest
*ManifestControllerApi* | [**getManifestsUsingGET**](docs/ManifestControllerApi.md#getManifestsUsingGET) | **GET** /commerce/fulfillment/shipping/manifests | getManifests
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
*ShipmentControllerApi* | [**cancelShipmentsUsingPUT**](docs/ShipmentControllerApi.md#cancelShipmentsUsingPUT) | **PUT** /commerce/shipments/order/{orderId}/canceled | cancelShipments
*ShipmentControllerApi* | [**customerAtCurbsideUsingPUT**](docs/ShipmentControllerApi.md#customerAtCurbsideUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/customerAtCurbside | customerAtCurbside
*ShipmentControllerApi* | [**customerAtStoreUsingPUT**](docs/ShipmentControllerApi.md#customerAtStoreUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/customerAtStore | customerAtStore
*ShipmentControllerApi* | [**customerCareItemsUsingPOST**](docs/ShipmentControllerApi.md#customerCareItemsUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/customerCaredItems | customerCareItems
*ShipmentControllerApi* | [**customerCareShipmentUsingPUT**](docs/ShipmentControllerApi.md#customerCareShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/customerCared | customerCareShipment
*ShipmentControllerApi* | [**customerInTransitUsingPUT**](docs/ShipmentControllerApi.md#customerInTransitUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/customerInTransit | customerInTransit
*ShipmentControllerApi* | [**deleteShipmentUsingDELETE**](docs/ShipmentControllerApi.md#deleteShipmentUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber} | deleteShipment
*ShipmentControllerApi* | [**destinationUpdateUsingPUT**](docs/ShipmentControllerApi.md#destinationUpdateUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/destination | destinationUpdate
*ShipmentControllerApi* | [**executeUsingPUT**](docs/ShipmentControllerApi.md#executeUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/tasks/{taskName}/completed | execute
*ShipmentControllerApi* | [**fulfillShipmentUsingPUT**](docs/ShipmentControllerApi.md#fulfillShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/fulfilled | fulfillShipment
*ShipmentControllerApi* | [**getDashboardUsingGET**](docs/ShipmentControllerApi.md#getDashboardUsingGET) | **GET** /commerce/shipments/dashboard | getDashboard
*ShipmentControllerApi* | [**getLocationSummaryReportUsingGET**](docs/ShipmentControllerApi.md#getLocationSummaryReportUsingGET) | **GET** /commerce/shipments/locationSummaryReport | getLocationSummaryReport
*ShipmentControllerApi* | [**getShipmentStepCountByShipmentTypeUsingGET**](docs/ShipmentControllerApi.md#getShipmentStepCountByShipmentTypeUsingGET) | **GET** /commerce/shipments/countsByStep | getShipmentStepCountByShipmentType
*ShipmentControllerApi* | [**getShipmentUsingGET**](docs/ShipmentControllerApi.md#getShipmentUsingGET) | **GET** /commerce/shipments/{shipmentNumber} | getShipment
*ShipmentControllerApi* | [**getShipmentsUsingGET**](docs/ShipmentControllerApi.md#getShipmentsUsingGET) | **GET** /commerce/shipments | getShipments
*ShipmentControllerApi* | [**getTasksUsingGET**](docs/ShipmentControllerApi.md#getTasksUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/tasks | getTasks
*ShipmentControllerApi* | [**newShipmentUsingPOST**](docs/ShipmentControllerApi.md#newShipmentUsingPOST) | **POST** /commerce/shipments | newShipment
*ShipmentControllerApi* | [**newShipmentsUsingPOST**](docs/ShipmentControllerApi.md#newShipmentsUsingPOST) | **POST** /commerce/shipments/bulk | newShipments
*ShipmentControllerApi* | [**pickupItemsUsingPOST**](docs/ShipmentControllerApi.md#pickupItemsUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/pickedUpItems | pickupItems
*ShipmentControllerApi* | [**reassignItemsUsingPUT**](docs/ShipmentControllerApi.md#reassignItemsUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/reassignedItems | reassignItems
*ShipmentControllerApi* | [**reassignShipmentUsingPUT**](docs/ShipmentControllerApi.md#reassignShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/reassigned | reassignShipment
*ShipmentControllerApi* | [**receiveTransferUsingPUT**](docs/ShipmentControllerApi.md#receiveTransferUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/received | receiveTransfer
*ShipmentControllerApi* | [**refreshShipmentUsingPUT**](docs/ShipmentControllerApi.md#refreshShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/refresh | refreshShipment
*ShipmentControllerApi* | [**rejectItemsUsingPUT**](docs/ShipmentControllerApi.md#rejectItemsUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/rejectedItems | rejectItems
*ShipmentControllerApi* | [**rejectShipmentUsingPUT**](docs/ShipmentControllerApi.md#rejectShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/rejected | rejectShipment
*ShipmentControllerApi* | [**replaceShipmentUsingPUT**](docs/ShipmentControllerApi.md#replaceShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber} | replaceShipment
*ShipmentControllerApi* | [**retryFulfillingShipmentUsingPUT**](docs/ShipmentControllerApi.md#retryFulfillingShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/retried | retryFulfillingShipment
*ShipmentControllerApi* | [**revertUsingPUT**](docs/ShipmentControllerApi.md#revertUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/tasks/{taskName}/reverted | revert
*ShipmentControllerApi* | [**searchAndReceiveTransferUsingPUT**](docs/ShipmentControllerApi.md#searchAndReceiveTransferUsingPUT) | **PUT** /commerce/shipments/received/{search} | searchAndReceiveTransfer
*ShipmentControllerApi* | [**skipTaskUsingPUT**](docs/ShipmentControllerApi.md#skipTaskUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/tasks/{taskName}/skipped | skipTask
*ShipmentControllerApi* | [**transferItemsUsingPUT**](docs/ShipmentControllerApi.md#transferItemsUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/transferredItems | transferItems
*ShipmentControllerApi* | [**transferShipmentUsingPUT**](docs/ShipmentControllerApi.md#transferShipmentUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/transferred | transferShipment
*ShipmentControllerApi* | [**workflowDefinitionImageUsingGET**](docs/ShipmentControllerApi.md#workflowDefinitionImageUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/workflow-definition-image | workflowDefinitionImage
*ShipmentControllerApi* | [**workflowInstanceImageUsingGET**](docs/ShipmentControllerApi.md#workflowInstanceImageUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/workflow-instance-image | workflowInstanceImage
*ShipmentDataControllerApi* | [**deleteShipmentAttributeUsingDELETE1**](docs/ShipmentDataControllerApi.md#deleteShipmentAttributeUsingDELETE1) | **DELETE** /commerce/shipments/{shipmentNumber}/data | deleteShipmentAttribute
*ShipmentDataControllerApi* | [**deleteShipmentAttributeUsingDELETE2**](docs/ShipmentDataControllerApi.md#deleteShipmentAttributeUsingDELETE2) | **DELETE** /commerce/shipments/{shipmentNumber}/items/{lineId}/data | deleteShipmentAttribute
*ShipmentDataControllerApi* | [**getShipmentDataUsingGET**](docs/ShipmentDataControllerApi.md#getShipmentDataUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/data | getShipmentData
*ShipmentDataControllerApi* | [**getShipmentDataUsingGET1**](docs/ShipmentDataControllerApi.md#getShipmentDataUsingGET1) | **GET** /commerce/shipments/{shipmentNumber}/items/{lineId}/data | getShipmentData
*ShipmentDataControllerApi* | [**replaceShipmentDataUsingPUT**](docs/ShipmentDataControllerApi.md#replaceShipmentDataUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/data | replaceShipmentData
*ShipmentDataControllerApi* | [**replaceShipmentItemDataUsingPUT**](docs/ShipmentDataControllerApi.md#replaceShipmentItemDataUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/items/{lineId}/data | replaceShipmentItemData
*ShipmentPackagesControllerApi* | [**deleteShipmentPackageUsingDELETE**](docs/ShipmentPackagesControllerApi.md#deleteShipmentPackageUsingDELETE) | **DELETE** /commerce/shipments/{shipmentNumber}/packages/{packageId} | deleteShipmentPackage
*ShipmentPackagesControllerApi* | [**newPackageUsingPOST**](docs/ShipmentPackagesControllerApi.md#newPackageUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/packages | newPackage
*ShipmentPackagesControllerApi* | [**updatePackageUsingPUT**](docs/ShipmentPackagesControllerApi.md#updatePackageUsingPUT) | **PUT** /commerce/shipments/{shipmentNumber}/packages/{packageId} | updatePackage
*StorefrontControllerApi* | [**getShipmentUsingGET1**](docs/StorefrontControllerApi.md#getShipmentUsingGET1) | **GET** /commerce/fulfillment/storefront/shipments/{shipmentNumber} | getShipment
*StorefrontControllerApi* | [**getShipmentsUsingGET1**](docs/StorefrontControllerApi.md#getShipmentsUsingGET1) | **GET** /commerce/fulfillment/storefront/shipments | getShipments
*WorkflowProcessControllerApi* | [**getDefinitionImageUsingGET**](docs/WorkflowProcessControllerApi.md#getDefinitionImageUsingGET) | **GET** /commerce/processes/definitionImage/{containerIdOrAlias}/{processId} | getDefinitionImage
*WorkflowProcessControllerApi* | [**getWorkflowProcessByShipmentTypeLocationCodeUsingGET**](docs/WorkflowProcessControllerApi.md#getWorkflowProcessByShipmentTypeLocationCodeUsingGET) | **GET** /commerce/processes/shipmentType/{shipmentType}/location/{locationCode} | getWorkflowProcessByShipmentTypeLocationCode
*WorkflowProcessControllerApi* | [**getWorkflowProcessByShipmentTypeLocationGroupCodeUsingGET**](docs/WorkflowProcessControllerApi.md#getWorkflowProcessByShipmentTypeLocationGroupCodeUsingGET) | **GET** /commerce/processes/shipmentType/{shipmentType}/locationGroup/{locationGroupCode} | getWorkflowProcessByShipmentTypeLocationGroupCode
*WorkflowProcessControllerApi* | [**getWorkflowProcessByShipmentTypeUsingGET**](docs/WorkflowProcessControllerApi.md#getWorkflowProcessByShipmentTypeUsingGET) | **GET** /commerce/processes/shipmentType/{shipmentType} | getWorkflowProcessByShipmentType
*WorkflowProcessControllerApi* | [**getWorkflowProcessUsingGET**](docs/WorkflowProcessControllerApi.md#getWorkflowProcessUsingGET) | **GET** /commerce/processes/definitions/{containerIdOrAlias}/{processId} | getWorkflowProcess
*WorkflowProcessControllerApi* | [**getWorkflowProcessesUsingGET**](docs/WorkflowProcessControllerApi.md#getWorkflowProcessesUsingGET) | **GET** /commerce/processes/definitions | getWorkflowProcesses


## Documentation for Models

 - [Address](docs/Address.md)
 - [AuditInfo](docs/AuditInfo.md)
 - [BackorderItem](docs/BackorderItem.md)
 - [BackorderItemUpdate](docs/BackorderItemUpdate.md)
 - [BackorderItemsRequest](docs/BackorderItemsRequest.md)
 - [BackorderItemsUpdateRequest](docs/BackorderItemsUpdateRequest.md)
 - [BackorderShipmentRequest](docs/BackorderShipmentRequest.md)
 - [BinShipmentProductQuantity](docs/BinShipmentProductQuantity.md)
 - [BpmVariable](docs/BpmVariable.md)
 - [CancelItem](docs/CancelItem.md)
 - [CancelItemsRequest](docs/CancelItemsRequest.md)
 - [CancelShipment](docs/CancelShipment.md)
 - [CanceledItem](docs/CanceledItem.md)
 - [CanceledReason](docs/CanceledReason.md)
 - [ChangeMessage](docs/ChangeMessage.md)
 - [ClosePickWave](docs/ClosePickWave.md)
 - [CollectionModelOfDashboardResponse](docs/CollectionModelOfDashboardResponse.md)
 - [CollectionModelOfEntityModelOfCustomerSurvey](docs/CollectionModelOfEntityModelOfCustomerSurvey.md)
 - [CollectionModelOfEntityModelOfShipment](docs/CollectionModelOfEntityModelOfShipment.md)
 - [CollectionModelOfEntityModelOfWorkflowProcess](docs/CollectionModelOfEntityModelOfWorkflowProcess.md)
 - [CollectionModelOfLocationSummary](docs/CollectionModelOfLocationSummary.md)
 - [CollectionModelOfManifest](docs/CollectionModelOfManifest.md)
 - [CollectionModelOfPickWave](docs/CollectionModelOfPickWave.md)
 - [CollectionModelOfShipment](docs/CollectionModelOfShipment.md)
 - [CollectionModelOfTask](docs/CollectionModelOfTask.md)
 - [Contact](docs/Contact.md)
 - [CreatePickWave](docs/CreatePickWave.md)
 - [Customer](docs/Customer.md)
 - [CustomerSurvey](docs/CustomerSurvey.md)
 - [CustomerSurveyEntry](docs/CustomerSurveyEntry.md)
 - [DashboardResponse](docs/DashboardResponse.md)
 - [DashboardStep](docs/DashboardStep.md)
 - [Destination](docs/Destination.md)
 - [EntityModelOfCustomerSurvey](docs/EntityModelOfCustomerSurvey.md)
 - [EntityModelOfDashboardResponse](docs/EntityModelOfDashboardResponse.md)
 - [EntityModelOfManifest](docs/EntityModelOfManifest.md)
 - [EntityModelOfPickWave](docs/EntityModelOfPickWave.md)
 - [EntityModelOfShipment](docs/EntityModelOfShipment.md)
 - [EntityModelOfWorkflowProcess](docs/EntityModelOfWorkflowProcess.md)
 - [GiftCard](docs/GiftCard.md)
 - [HandleOption](docs/HandleOption.md)
 - [Item](docs/Item.md)
 - [Link](docs/Link.md)
 - [LinkRelation](docs/LinkRelation.md)
 - [Links](docs/Links.md)
 - [LocationSummary](docs/LocationSummary.md)
 - [Manifest](docs/Manifest.md)
 - [ManifestRequest](docs/ManifestRequest.md)
 - [ManifestRequestShipment](docs/ManifestRequestShipment.md)
 - [ManifestShipment](docs/ManifestShipment.md)
 - [Measurement](docs/Measurement.md)
 - [ModelPackage](docs/ModelPackage.md)
 - [PackageMeasurements](docs/PackageMeasurements.md)
 - [PageMetadata](docs/PageMetadata.md)
 - [PagedModelOfEntityModelOfShipment](docs/PagedModelOfEntityModelOfShipment.md)
 - [Phone](docs/Phone.md)
 - [PickWave](docs/PickWave.md)
 - [PickWaveBinRange](docs/PickWaveBinRange.md)
 - [PickWaveContent](docs/PickWaveContent.md)
 - [PickWaveProductMatch](docs/PickWaveProductMatch.md)
 - [PickupItem](docs/PickupItem.md)
 - [PickupItemsRequest](docs/PickupItemsRequest.md)
 - [ProductOption](docs/ProductOption.md)
 - [ReassignItem](docs/ReassignItem.md)
 - [ReassignItemsRequest](docs/ReassignItemsRequest.md)
 - [ReassignShipment](docs/ReassignShipment.md)
 - [ReassignedReason](docs/ReassignedReason.md)
 - [RejectItem](docs/RejectItem.md)
 - [RejectItemsRequest](docs/RejectItemsRequest.md)
 - [RejectShipment](docs/RejectShipment.md)
 - [RejectedItem](docs/RejectedItem.md)
 - [RejectedReason](docs/RejectedReason.md)
 - [Shipment](docs/Shipment.md)
 - [ShipmentAttribute](docs/ShipmentAttribute.md)
 - [ShipmentStatusReason](docs/ShipmentStatusReason.md)
 - [Task](docs/Task.md)
 - [TaskComplete](docs/TaskComplete.md)
 - [TaskDefinition](docs/TaskDefinition.md)
 - [TaskInput](docs/TaskInput.md)
 - [TaskReason](docs/TaskReason.md)
 - [TemplateVariable](docs/TemplateVariable.md)
 - [TemplateVariables](docs/TemplateVariables.md)
 - [Tracking](docs/Tracking.md)
 - [TransferItem](docs/TransferItem.md)
 - [TransferItemsRequest](docs/TransferItemsRequest.md)
 - [TransferShipment](docs/TransferShipment.md)
 - [TransferredReason](docs/TransferredReason.md)
 - [UriTemplate](docs/UriTemplate.md)
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



