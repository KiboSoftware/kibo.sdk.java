# adminuser

Kibo Admin User Service
- API version: 1.0.0

OpenAPI Spec for Kibo Admin User Service


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

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
  <artifactId>adminuser</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'adminuser' jar has been published to maven central.
    mavenLocal()       // Needed if the 'adminuser' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.kibocommerce:adminuser:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/adminuser-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminAuthTicketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    AdminAuthTicketApi apiInstance = new AdminAuthTicketApi(defaultClient);
    Integer tenantId = 56; // Integer | Optional tenant Id parameter
    UserAuthInfo userAuthInfo = new UserAuthInfo(); // UserAuthInfo | User's email address and password.
    try {
      TenantAdminUserAuthTicket result = apiInstance.createUserAuthTicket(tenantId, userAuthInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminAuthTicketApi#createUserAuthTicket");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://https:/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminAuthTicketApi* | [**createUserAuthTicket**](docs/AdminAuthTicketApi.md#createUserAuthTicket) | **POST** /platform/adminuser/authtickets/tenants | Create User Auth Ticket
*AdminAuthTicketApi* | [**createUserAuthTicketWithWsFed**](docs/AdminAuthTicketApi.md#createUserAuthTicketWithWsFed) | **POST** /platform/adminuser/authtickets/wsfed/auth/{id} | Create User Auth Ticket With Ws Fed
*AdminAuthTicketApi* | [**deleteUserAuthTicket**](docs/AdminAuthTicketApi.md#deleteUserAuthTicket) | **DELETE** /platform/adminuser/authtickets | Delete User Auth Ticket
*AdminAuthTicketApi* | [**getWsFedChallengeUrl**](docs/AdminAuthTicketApi.md#getWsFedChallengeUrl) | **GET** /platform/adminuser/authtickets/wsfed/challenge/{id} | Get Ws Fed Challenge Url
*AdminAuthTicketApi* | [**getWsFedSignOutUrl**](docs/AdminAuthTicketApi.md#getWsFedSignOutUrl) | **GET** /platform/adminuser/authtickets/wsfed/SignOut/{id} | Get Ws Fed Sign Out Url
*AdminAuthTicketApi* | [**refreshAuthTicket**](docs/AdminAuthTicketApi.md#refreshAuthTicket) | **PUT** /platform/adminuser/authtickets/tenants | Refresh Auth Ticket
*AdminGroupApi* | [**addAdminGroup**](docs/AdminGroupApi.md#addAdminGroup) | **POST** /platform/adminuser/groups | Add a admin group
*AdminGroupApi* | [**addUsers**](docs/AdminGroupApi.md#addUsers) | **POST** /platform/adminuser/groups/{groupCode}/addusers | Add users to admin group
*AdminGroupApi* | [**deleteAdminGroup**](docs/AdminGroupApi.md#deleteAdminGroup) | **DELETE** /platform/adminuser/groups/{groupCode} | Deletes a Admin Group
*AdminGroupApi* | [**getAdminGroup**](docs/AdminGroupApi.md#getAdminGroup) | **GET** /platform/adminuser/groups/{groupCode} | Get Admin Group
*AdminGroupApi* | [**getAdminGroups**](docs/AdminGroupApi.md#getAdminGroups) | **GET** /platform/adminuser/groups | Get Admin Groups
*AdminGroupApi* | [**removeUsers**](docs/AdminGroupApi.md#removeUsers) | **POST** /platform/adminuser/groups/{groupCode}/removeusers | Remove users from admin group
*AdminGroupApi* | [**updateAdminGroup**](docs/AdminGroupApi.md#updateAdminGroup) | **PUT** /platform/adminuser/groups/{groupCode} | Update an existing adminGroup
*AdminUserApi* | [**addUserRole**](docs/AdminUserApi.md#addUserRole) | **POST** /platform/adminuser/accounts/{userId}/roles/{roleId} | Add User Role
*AdminUserApi* | [**changePassword**](docs/AdminUserApi.md#changePassword) | **POST** /platform/adminuser/accounts/{userId}/Change-Password | Changes a user&#39;s password
*AdminUserApi* | [**changeUserPassword**](docs/AdminUserApi.md#changeUserPassword) | **POST** /platform/adminuser/accounts/{userId}/Change-User-Password | Change User Password
*AdminUserApi* | [**createUser**](docs/AdminUserApi.md#createUser) | **POST** /platform/adminuser/accounts | Creates a new user
*AdminUserApi* | [**deleteUser**](docs/AdminUserApi.md#deleteUser) | **DELETE** /platform/adminuser/accounts/{userId} | Delete User
*AdminUserApi* | [**getTenantScopesForUser**](docs/AdminUserApi.md#getTenantScopesForUser) | **GET** /platform/adminuser/accounts/{userId}/tenants | Get tenant scope for users
*AdminUserApi* | [**getUser**](docs/AdminUserApi.md#getUser) | **GET** /platform/adminuser/accounts/{userId} | Get User
*AdminUserApi* | [**getUserById**](docs/AdminUserApi.md#getUserById) | **GET** /platform/adminuser/accounts/{userId}/userbyid | Get User By Id
*AdminUserApi* | [**getUserRoles**](docs/AdminUserApi.md#getUserRoles) | **GET** /platform/adminuser/accounts/{userId}/roles | Get User Roles
*AdminUserApi* | [**getUsers**](docs/AdminUserApi.md#getUsers) | **GET** /platform/adminuser/accounts | Get Users
*AdminUserApi* | [**removeUserRole**](docs/AdminUserApi.md#removeUserRole) | **DELETE** /platform/adminuser/accounts/{userId}/roles/{roleId} | Remove User Role
*AdminUserApi* | [**resetPassword**](docs/AdminUserApi.md#resetPassword) | **POST** /platform/adminuser/accounts/Reset-Password | Reset Password
*AdminUserApi* | [**unlockUser**](docs/AdminUserApi.md#unlockUser) | **POST** /platform/adminuser/accounts/{userId}/unlock | Enables the user
*AdminUserApi* | [**updateUser**](docs/AdminUserApi.md#updateUser) | **PUT** /platform/adminuser/accounts/{userId} | Update User
*DeveloperAdminAuthTicketApi* | [**createDeveloperUserAuthTicket**](docs/DeveloperAdminAuthTicketApi.md#createDeveloperUserAuthTicket) | **POST** /platform/developer/authtickets | Create Developer User Auth Ticket
*DeveloperAdminAuthTicketApi* | [**deleteUserAuthTicket**](docs/DeveloperAdminAuthTicketApi.md#deleteUserAuthTicket) | **DELETE** /platform/developer/authtickets | Delete User Auth Ticket
*DeveloperAdminAuthTicketApi* | [**refreshDeveloperAuthTicket**](docs/DeveloperAdminAuthTicketApi.md#refreshDeveloperAuthTicket) | **PUT** /platform/developer/authtickets | Refresh Developer Auth Ticket
*RoleApi* | [**getRoles**](docs/RoleApi.md#getRoles) | **GET** /platform/adminuser/roles | Get Roles


## Documentation for Models

 - [AdminGroup](docs/AdminGroup.md)
 - [AdminGroupCollection](docs/AdminGroupCollection.md)
 - [AdminUserAuditInfo](docs/AdminUserAuditInfo.md)
 - [AdminUserMasterCatalog](docs/AdminUserMasterCatalog.md)
 - [AdminUserPasswordInfo](docs/AdminUserPasswordInfo.md)
 - [AdminUserResetPasswordInfo](docs/AdminUserResetPasswordInfo.md)
 - [AdminUserTenant](docs/AdminUserTenant.md)
 - [AdminUserUserRoleCollection](docs/AdminUserUserRoleCollection.md)
 - [BaseTenantEntity](docs/BaseTenantEntity.md)
 - [Behavior](docs/Behavior.md)
 - [Catalog](docs/Catalog.md)
 - [ChangeUserPasswordInfo](docs/ChangeUserPasswordInfo.md)
 - [CollectionOfRole](docs/CollectionOfRole.md)
 - [DeveloperAccount](docs/DeveloperAccount.md)
 - [DeveloperAdminUserAuthTicket](docs/DeveloperAdminUserAuthTicket.md)
 - [Owner](docs/Owner.md)
 - [Resource](docs/Resource.md)
 - [Role](docs/Role.md)
 - [RoleCollection](docs/RoleCollection.md)
 - [Site](docs/Site.md)
 - [TenantAdminUserAuthTicket](docs/TenantAdminUserAuthTicket.md)
 - [TenantAttribute](docs/TenantAttribute.md)
 - [TenantCollection](docs/TenantCollection.md)
 - [User](docs/User.md)
 - [UserAuthInfo](docs/UserAuthInfo.md)
 - [UserProfile](docs/UserProfile.md)
 - [UserRole](docs/UserRole.md)
 - [UserScope](docs/UserScope.md)
 - [UserSystemData](docs/UserSystemData.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### bearerAuth

- **Type**: HTTP basic authentication

### clientOauth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


