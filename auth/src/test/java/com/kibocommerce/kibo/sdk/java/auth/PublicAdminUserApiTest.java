/*
 * Kibo Admin User Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.kibo.sdk.java.auth;

import com.kibocommerce.kibo.sdk.java.auth.ApiException;
import com.kibocommerce.kibo.sdk.java.auth.model.ChangeUserPasswordInfo;
import com.kibocommerce.kibo.sdk.java.auth.model.PasswordInfo;
import com.kibocommerce.kibo.sdk.java.auth.model.TenantCollection;
import com.kibocommerce.kibo.sdk.java.auth.model.User;
import com.kibocommerce.kibo.sdk.java.auth.model.UserRoleCollection;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PublicAdminUserApi
 */
@Ignore
public class PublicAdminUserApiTest {

    private final PublicAdminUserApi api = new PublicAdminUserApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addUserRoleTest() throws ApiException {
        String userId = null;
        Integer roleId = null;
        Integer xVolTenant = null;
        Integer xVolSite = null;
        api.addUserRole(userId, roleId, xVolTenant, xVolSite);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void changePasswordTest() throws ApiException {
        String userId = null;
        Integer xVolTenant = null;
        Integer xVolSite = null;
        PasswordInfo passwordInfo = null;
        api.changePassword(userId, xVolTenant, xVolSite, passwordInfo);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void changeUserPasswordTest() throws ApiException {
        String userId = null;
        Integer xVolTenant = null;
        Integer xVolSite = null;
        ChangeUserPasswordInfo changeUserPasswordInfo = null;
        api.changeUserPassword(userId, xVolTenant, xVolSite, changeUserPasswordInfo);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        Integer xVolTenant = null;
        Integer xVolSite = null;
        User user = null;
        User response = api.createUser(xVolTenant, xVolSite, user);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserTest() throws ApiException {
        String userId = null;
        Integer xVolTenant = null;
        Integer xVolSite = null;
        api.deleteUser(userId, xVolTenant, xVolSite);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTenantScopesForUserTest() throws ApiException {
        String userId = null;
        Integer xVolTenant = null;
        Integer xVolSite = null;
        TenantCollection response = api.getTenantScopesForUser(userId, xVolTenant, xVolSite);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTest() throws ApiException {
        String userId = null;
        Integer xVolTenant = null;
        Integer xVolSite = null;
        User response = api.getUser(userId, xVolTenant, xVolSite);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserByIdTest() throws ApiException {
        String userId = null;
        Integer xVolTenant = null;
        String responseGroups = null;
        Integer xVolSite = null;
        User response = api.getUserById(userId, xVolTenant, responseGroups, xVolSite);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserRolesTest() throws ApiException {
        String userId = null;
        Integer xVolTenant = null;
        Integer xVolSite = null;
        UserRoleCollection response = api.getUserRoles(userId, xVolTenant, xVolSite);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersTest() throws ApiException {
        Integer xVolTenant = null;
        String emailAddress = null;
        Integer startIndex = null;
        Integer pageSize = null;
        String sortBy = null;
        String filter = null;
        String responseGroups = null;
        Integer xVolSite = null;
        api.getUsers(xVolTenant, emailAddress, startIndex, pageSize, sortBy, filter, responseGroups, xVolSite);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeUserRoleTest() throws ApiException {
        String userId = null;
        Integer roleId = null;
        Integer xVolTenant = null;
        Integer xVolSite = null;
        api.removeUserRole(userId, roleId, xVolTenant, xVolSite);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserTest() throws ApiException {
        String userId = null;
        Integer xVolTenant = null;
        Integer xVolSite = null;
        User user = null;
        User response = api.updateUser(userId, xVolTenant, xVolSite, user);

        // TODO: test validations
    }
    
}