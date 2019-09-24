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
import com.kibocommerce.kibo.sdk.java.auth.model.DeveloperAdminUserAuthTicket;
import com.kibocommerce.kibo.sdk.java.auth.model.UserAuthInfo;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PublicDeveloperAdminAuthTicketApi
 */
@Ignore
public class PublicDeveloperAdminAuthTicketApiTest {

    private final PublicDeveloperAdminAuthTicketApi api = new PublicDeveloperAdminAuthTicketApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDeveloperUserAuthTicketTest() throws ApiException {
        Integer xVolTenant = null;
        Integer developerAccountId = null;
        Integer xVolSite = null;
        UserAuthInfo userAuthInfo = null;
        DeveloperAdminUserAuthTicket response = api.createDeveloperUserAuthTicket(xVolTenant, developerAccountId, xVolSite, userAuthInfo);

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
    public void deleteUserAuthTicketTest() throws ApiException {
        Integer xVolTenant = null;
        String refreshToken = null;
        Integer xVolSite = null;
        api.deleteUserAuthTicket(xVolTenant, refreshToken, xVolSite);

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
    public void refreshDeveloperAuthTicketTest() throws ApiException {
        Integer xVolTenant = null;
        Integer developerAccountId = null;
        Integer xVolSite = null;
        DeveloperAdminUserAuthTicket developerAdminUserAuthTicket = null;
        DeveloperAdminUserAuthTicket response = api.refreshDeveloperAuthTicket(xVolTenant, developerAccountId, xVolSite, developerAdminUserAuthTicket);

        // TODO: test validations
    }
    
}
