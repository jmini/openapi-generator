/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import java.math.BigDecimal;
import org.openapitools.client.model.Client;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.openapitools.client.model.OuterComposite;

import org.openapitools.client.Configuration;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.runner.RunWith;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.core.Vertx;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import io.vertx.ext.unit.junit.RunTestOnContext;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.Async;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FakeApi
 */
@RunWith(VertxUnitRunner.class)
@Ignore
public class FakeApiTest {

    private FakeApi api;

    @Rule
    public RunTestOnContext rule = new RunTestOnContext();

    @BeforeClass
    public void setupApiClient() {
        JsonObject config = new JsonObject();
        Vertx vertx = rule.vertx();
        Configuration.setupDefaultApiClient(vertx, config);

        api = new FakeApiImpl();
    }
    
    /**
     * 
     * Test serialization of outer boolean types
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void fakeOuterBooleanSerializeTest(TestContext context) {
        Async async = context.async();
        Boolean body = null;
        api.fakeOuterBooleanSerialize(body, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * 
     * Test serialization of object with outer number type
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void fakeOuterCompositeSerializeTest(TestContext context) {
        Async async = context.async();
        OuterComposite body = null;
        api.fakeOuterCompositeSerialize(body, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * 
     * Test serialization of outer number types
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void fakeOuterNumberSerializeTest(TestContext context) {
        Async async = context.async();
        BigDecimal body = null;
        api.fakeOuterNumberSerialize(body, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * 
     * Test serialization of outer string types
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void fakeOuterStringSerializeTest(TestContext context) {
        Async async = context.async();
        String body = null;
        api.fakeOuterStringSerialize(body, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * To test \&quot;client\&quot; model
     * To test \&quot;client\&quot; model
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void testClientModelTest(TestContext context) {
        Async async = context.async();
        Client body = null;
        api.testClientModel(body, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void testEndpointParametersTest(TestContext context) {
        Async async = context.async();
        BigDecimal number = null;
        Double _double = null;
        String patternWithoutDelimiter = null;
        byte[] _byte = null;
        Integer integer = null;
        Integer int32 = null;
        Long int64 = null;
        Float _float = null;
        String string = null;
        byte[] binary = null;
        LocalDate date = null;
        OffsetDateTime dateTime = null;
        String password = null;
        String paramCallback = null;
        api.testEndpointParameters(number, _double, patternWithoutDelimiter, _byte, integer, int32, int64, _float, string, binary, date, dateTime, password, paramCallback, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * To test enum parameters
     * To test enum parameters
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void testEnumParametersTest(TestContext context) {
        Async async = context.async();
        List<String> enumFormStringArray = null;
        String enumFormString = null;
        List<String> enumHeaderStringArray = null;
        String enumHeaderString = null;
        List<String> enumQueryStringArray = null;
        String enumQueryString = null;
        Integer enumQueryInteger = null;
        Double enumQueryDouble = null;
        api.testEnumParameters(enumFormStringArray, enumFormString, enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * test json serialization of form data
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void testJsonFormDataTest(TestContext context) {
        Async async = context.async();
        String param = null;
        String param2 = null;
        api.testJsonFormData(param, param2, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
}