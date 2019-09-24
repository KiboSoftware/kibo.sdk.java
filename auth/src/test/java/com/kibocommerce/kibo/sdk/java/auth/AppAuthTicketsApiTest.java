/*
 * Kibo AppDev Service
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
import com.kibocommerce.kibo.sdk.java.auth.model.MozuAppDevContractsOAuthAccessTokenResponse;
import com.kibocommerce.kibo.sdk.java.auth.model.MozuAppDevContractsOauthAuthRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppAuthTicketsApi
 */
@Ignore
public class AppAuthTicketsApiTest {

    private final AppAuthTicketsApi api = new AppAuthTicketsApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oauthAuthenticateAppTest() throws ApiException {
        Integer xVolTenant = null;
        Integer xVolSite = null;
        MozuAppDevContractsOauthAuthRequest mozuAppDevContractsOauthAuthRequest = null;
        MozuAppDevContractsOAuthAccessTokenResponse response = api.oauthAuthenticateApp(xVolTenant, xVolSite, mozuAppDevContractsOauthAuthRequest);

        // TODO: test validations
    }
    
}