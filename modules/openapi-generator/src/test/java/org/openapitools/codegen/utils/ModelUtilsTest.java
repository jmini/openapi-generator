/*
 * Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
 * Copyright 2018 SmartBear Software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openapitools.codegen.utils;

import io.swagger.parser.OpenAPIParser;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.parser.core.models.ParseOptions;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ModelUtilsTest {

    @Test
    public void testGetAllUsedSchemas() {
        final OpenAPI openAPI = new OpenAPIParser().readLocation("src/test/resources/3_0/unusedSchemas.yaml", null, new ParseOptions()).getOpenAPI();
        List<String> allUsedSchemas = ModelUtils.getAllUsedSchemas(openAPI);
        Assert.assertEquals(allUsedSchemas.size(), 12);

        Assert.assertTrue(allUsedSchemas.contains("SomeObjShared"), "contains 'SomeObjShared'");
        Assert.assertTrue(allUsedSchemas.contains("SomeObj1"), "contains 'UnusedObj1'");
        Assert.assertTrue(allUsedSchemas.contains("SomeObj2"), "contains 'SomeObj2'");
        Assert.assertTrue(allUsedSchemas.contains("SomeObj3"), "contains 'SomeObj3'");
        Assert.assertTrue(allUsedSchemas.contains("SomeObj6"), "contains 'SomeObj6'");
        Assert.assertTrue(allUsedSchemas.contains("SomeObj7"), "contains 'SomeObj7'");
        Assert.assertTrue(allUsedSchemas.contains("SomeObj8"), "contains 'SomeObj8'");
        Assert.assertTrue(allUsedSchemas.contains("SomeObj9A"), "contains 'SomeObj9A'");
        Assert.assertTrue(allUsedSchemas.contains("SomeObj9B"), "contains 'SomeObj9B'");
        Assert.assertTrue(allUsedSchemas.contains("SomeObj10A"), "contains 'SomeObj10A'");
        Assert.assertTrue(allUsedSchemas.contains("SomeObj10B"), "contains 'SomeObj10B'");
        Assert.assertTrue(allUsedSchemas.contains("SomeObj11"), "contains 'SomeObj11'");
    }

    @Test
    public void testGetUnusedSchemas() {
        final OpenAPI openAPI = new OpenAPIParser().readLocation("src/test/resources/3_0/unusedSchemas.yaml", null, new ParseOptions()).getOpenAPI();
        List<String> unusedSchemas = ModelUtils.getUnusedSchemas(openAPI);
        Assert.assertEquals(unusedSchemas.size(), 4);
        //UnusedObj is not used at all:
        Assert.assertTrue(unusedSchemas.contains("UnusedObj1"), "contains 'UnusedObj1'");
        //SomeObjUnused is used in a request body that is not used.
        Assert.assertTrue(unusedSchemas.contains("UnusedObj2"), "contains 'UnusedObj2'");
        //SomeObjUnused is used in a response that is not used.
        Assert.assertTrue(unusedSchemas.contains("UnusedObj3"), "contains 'UnusedObj3'");
        //SomeObjUnused is used in a parameter that is not used.
        Assert.assertTrue(unusedSchemas.contains("UnusedObj4"), "contains 'UnusedObj4'");
    }

    @Test
    public void testSchemasUsedOnlyInFormParam() {
        final OpenAPI openAPI = new OpenAPIParser().readLocation("src/test/resources/3_0/unusedSchemas.yaml", null, new ParseOptions()).getOpenAPI();
        List<String> unusedSchemas = ModelUtils.getSchemasUsedOnlyInFormParam(openAPI);
        Assert.assertEquals(unusedSchemas.size(), 3);
        //SomeObj2 is only used in a 'application/x-www-form-urlencoded' request
        Assert.assertTrue(unusedSchemas.contains("SomeObj2"), "contains 'SomeObj2'");
        //SomeObj3 is only used in a 'multipart/form-data' request
        Assert.assertTrue(unusedSchemas.contains("SomeObj3"), "contains 'SomeObj3'");
        //SomeObj7 is only used in a 'application/x-www-form-urlencoded' request (with referenced request body)
        Assert.assertTrue(unusedSchemas.contains("SomeObj7"), "contains 'SomeObj7'");
    }

    @Test
    public void testNoComponentsSection() {
        final OpenAPI openAPI = new OpenAPIParser().readLocation("src/test/resources/3_0/ping.yaml", null, new ParseOptions()).getOpenAPI();
        List<String> unusedSchemas = ModelUtils.getSchemasUsedOnlyInFormParam(openAPI);
        Assert.assertEquals(unusedSchemas.size(), 0);
    }

    @Test
    public void testGlobalProducesConsumes() {
        final OpenAPI openAPI = new OpenAPIParser().readLocation("src/test/resources/2_0/globalProducesConsumesTest.yaml", null, new ParseOptions()).getOpenAPI();
        List<String> unusedSchemas = ModelUtils.getSchemasUsedOnlyInFormParam(openAPI);
        Assert.assertEquals(unusedSchemas.size(), 0);
    }
}
