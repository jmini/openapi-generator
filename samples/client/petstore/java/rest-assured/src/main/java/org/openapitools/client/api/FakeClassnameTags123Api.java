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

import com.google.gson.reflect.TypeToken;
import org.openapitools.client.model.Client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;

import java.lang.reflect.Type;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.openapitools.client.JSON;

import static io.restassured.http.Method.*;

public class FakeClassnameTags123Api {

    private RequestSpecBuilder reqSpec;

    private JSON json;

    private FakeClassnameTags123Api(RequestSpecBuilder reqSpec) {
        this.reqSpec = reqSpec;
        this.json = new JSON();
    }

    public static FakeClassnameTags123Api fakeClassnameTags123(RequestSpecBuilder reqSpec) {
        return new FakeClassnameTags123Api(reqSpec);
    }


    public TestClassnameOper testClassname() {
        return new TestClassnameOper(reqSpec);
    }

    /**
     * Get JSON
     *
     * @return JSON object
     */
    public JSON getJSON() {
        return json;
    }

    /**
     * Set JSON
     *
     * @param json JSON object
     * @return FakeClassnameTags123Api
     */
    public FakeClassnameTags123Api setJSON(JSON json) {
        this.json = json;
        return this;
    }

    /**
    * Customise request specification
    */
    public FakeClassnameTags123Api reqSpec(Consumer<RequestSpecBuilder> consumer) {
        consumer.accept(reqSpec);
        return this;
    }

    /**
     * To test class name in snake case
     * To test class name in snake case
     *
     * @see #body client model (required)
     * return Client
     */
    public class TestClassnameOper {

        public static final String REQ_URI = "/fake_classname_test";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public TestClassnameOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public TestClassnameOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * PATCH /fake_classname_test
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(PATCH, REQ_URI));
        }

        /**
         * PATCH /fake_classname_test
         * @return Client
         */
        public Client executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<Client>(){}.getType();
            return getJSON().deserialize(execute(handler).asString(), type);
        }

         /**
         * @param body (Client) client model (required)
         */
        public TestClassnameOper body(Client body) {
            reqSpec.setBody(getJSON().serialize(body));
            return this;
        }

        /**
         * Customise request specification
         */
        public TestClassnameOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         */
        public TestClassnameOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
}