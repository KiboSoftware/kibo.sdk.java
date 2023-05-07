/*
 * Inventory
 * Swagger JSON for inventory apis
 *
 * OpenAPI spec version: 5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.inventory.api;

import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.model.BaseResponse;
import com.kibocommerce.sdk.inventory.model.DeletedCountResponse;
import com.kibocommerce.sdk.inventory.model.Tag;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TagControllerApi
 */
@Ignore
public class TagControllerApiTest {

    private final TagControllerApi api = new TagControllerApi();

    
    /**
     * 
     *
     * Create a tag
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTagTest() throws ApiException {
        Integer xVolTenant = null;
        String tagCategoryName = null;
        Tag tag = null;
        Tag response = api.createTag(xVolTenant, tagCategoryName, tag);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete a Tag
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTagTest() throws ApiException {
        Integer xVolTenant = null;
        String tagCategoryName = null;
        String tagValue = null;
        DeletedCountResponse response = api.deleteTag(xVolTenant, tagCategoryName, tagValue);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a tag
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTagTest() throws ApiException {
        Integer xVolTenant = null;
        String tagCategoryName = null;
        String tagValue = null;
        Tag response = api.getTag(xVolTenant, tagCategoryName, tagValue);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update the designated tag
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTagTest() throws ApiException {
        Integer xVolTenant = null;
        String tagCategoryName = null;
        String tagValue = null;
        Tag tag = null;
        Tag response = api.updateTag(xVolTenant, tagCategoryName, tagValue, tag);

        // TODO: test validations
    }
    
}
