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
import com.kibocommerce.sdk.inventory.model.TagCategory;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TagCategoryControllerApi
 */
@Ignore
public class TagCategoryControllerApiTest {

    private final TagCategoryControllerApi api = new TagCategoryControllerApi();

    
    /**
     * 
     *
     * Create a tag category
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTagCategoryTest() throws ApiException {
        Integer xVolTenant = null;
        TagCategory tagCategory = null;
        TagCategory response = api.createTagCategory(xVolTenant, tagCategory);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete a Tag category
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTagCategoryTest() throws ApiException {
        Integer xVolTenant = null;
        String tagCategoryName = null;
        DeletedCountResponse response = api.deleteTagCategory(xVolTenant, tagCategoryName);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a tag category
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTagCategoryTest() throws ApiException {
        Integer xVolTenant = null;
        String tagCategoryName = null;
        TagCategory response = api.getTagCategory(xVolTenant, tagCategoryName);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get all tag categories for a tenant
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTagCategoryAllTest() throws ApiException {
        Integer xVolTenant = null;
        List<TagCategory> response = api.getTagCategoryAll(xVolTenant);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update the designated tag category
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTagCategoryTest() throws ApiException {
        Integer xVolTenant = null;
        String tagCategoryName = null;
        TagCategory tagCategory = null;
        TagCategory response = api.updateTagCategory(xVolTenant, tagCategoryName, tagCategory);

        // TODO: test validations
    }
    
}
