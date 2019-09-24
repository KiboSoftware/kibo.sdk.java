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
import com.kibocommerce.kibo.sdk.java.auth.model.Invitation;
import com.kibocommerce.kibo.sdk.java.auth.model.InvitationCollection;
import com.kibocommerce.kibo.sdk.java.auth.model.MultiScopeAdminUserAuthTicket;
import com.kibocommerce.kibo.sdk.java.auth.model.User;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MultiScopeInvitationApi
 */
@Ignore
public class MultiScopeInvitationApiTest {

    private final MultiScopeInvitationApi api = new MultiScopeInvitationApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void completeInvitationTest() throws ApiException {
        String invitationId = null;
        Integer xVolTenant = null;
        Integer xVolSite = null;
        User user = null;
        MultiScopeAdminUserAuthTicket response = api.completeInvitation(invitationId, xVolTenant, xVolSite, user);

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
    public void confirmInvitationTest() throws ApiException {
        String invitationId = null;
        Integer xVolTenant = null;
        Integer xVolSite = null;
        api.confirmInvitation(invitationId, xVolTenant, xVolSite);

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
    public void createInvitationTest() throws ApiException {
        Integer xVolTenant = null;
        Integer xVolSite = null;
        Invitation invitation = null;
        Invitation response = api.createInvitation(xVolTenant, xVolSite, invitation);

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
    public void declineInvitationTest() throws ApiException {
        String invitationId = null;
        Integer xVolTenant = null;
        Integer xVolSite = null;
        api.declineInvitation(invitationId, xVolTenant, xVolSite);

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
    public void deleteInvitationTest() throws ApiException {
        String invitationId = null;
        Integer xVolTenant = null;
        Integer xVolSite = null;
        api.deleteInvitation(invitationId, xVolTenant, xVolSite);

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
    public void getInvitationTest() throws ApiException {
        String invitationId = null;
        Integer xVolTenant = null;
        Integer xVolSite = null;
        Invitation response = api.getInvitation(invitationId, xVolTenant, xVolSite);

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
    public void getInvitationsTest() throws ApiException {
        Integer xVolTenant = null;
        String scopeType = null;
        Integer scopeId = null;
        String filter = null;
        Integer xVolSite = null;
        InvitationCollection response = api.getInvitations(xVolTenant, scopeType, scopeId, filter, xVolSite);

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
    public void resubmitInvitationTest() throws ApiException {
        String invitationId = null;
        Integer xVolTenant = null;
        Integer xVolSite = null;
        api.resubmitInvitation(invitationId, xVolTenant, xVolSite);

        // TODO: test validations
    }
    
}
