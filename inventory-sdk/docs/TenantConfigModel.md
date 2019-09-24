
# TenantConfigModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenantID** | **Integer** | A Tenant ID |  [optional]
**numEventSenderWorkers** | **Integer** | Number of Event Sender Workers to run for this tenant. |  [optional]
**fetchWorkerConfigIds** | **List&lt;String&gt;** | Config IDs of Fetch Worker Configs to regularly run. Set this to [0] to run all configs. |  [optional]
**eventsToSend** | **String** | What level of events to send. Must be one of: NO_REFRESH_LOGS, WITH_REFRESH_LOGS, WITH_BASIC_EVENTS, ALL |  [optional]
**enableSyncApi** | **Boolean** | Whether our secret sync api is enabled for this tenant. |  [optional]



