/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import com.google.gson.reflect.TypeToken;
import org.openapitools.client.model.User;

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

public class UserApi {

    private RequestSpecBuilder reqSpec;

    private UserApi(RequestSpecBuilder reqSpec) {
        this.reqSpec = reqSpec;
    }

    public static UserApi user(RequestSpecBuilder reqSpec) {
        return new UserApi(reqSpec);
    }


    public CreateUserOper createUser() {
        return new CreateUserOper(reqSpec);
    }

    public CreateUsersWithArrayInputOper createUsersWithArrayInput() {
        return new CreateUsersWithArrayInputOper(reqSpec);
    }

    public CreateUsersWithListInputOper createUsersWithListInput() {
        return new CreateUsersWithListInputOper(reqSpec);
    }

    public DeleteUserOper deleteUser() {
        return new DeleteUserOper(reqSpec);
    }

    public GetUserByNameOper getUserByName() {
        return new GetUserByNameOper(reqSpec);
    }

    public LoginUserOper loginUser() {
        return new LoginUserOper(reqSpec);
    }

    public LogoutUserOper logoutUser() {
        return new LogoutUserOper(reqSpec);
    }

    public UpdateUserOper updateUser() {
        return new UpdateUserOper(reqSpec);
    }

    /**
     * Customise request specification
     * @param consumer consumer
     * @return api
     */
    public UserApi reqSpec(Consumer<RequestSpecBuilder> consumer) {
        consumer.accept(reqSpec);
        return this;
    }

    /**
     * Create user
     * This can only be done by the logged in user.
     *
     * @see #body Created user object (required)
     */
    public class CreateUserOper {

        public static final String REQ_URI = "/user";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public CreateUserOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("*/*");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public CreateUserOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("*/*");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /user
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(POST, REQ_URI));
        }

         /**
         * @param user (User) Created user object (required)
         * @return operation
         */
        public CreateUserOper body(User user) {
            reqSpec.setBody(user);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public CreateUserOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public CreateUserOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Creates list of users with given input array
     * 
     *
     * @see #body List of user object (required)
     */
    public class CreateUsersWithArrayInputOper {

        public static final String REQ_URI = "/user/createWithArray";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public CreateUsersWithArrayInputOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("*/*");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public CreateUsersWithArrayInputOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("*/*");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /user/createWithArray
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(POST, REQ_URI));
        }

         /**
         * @param user (List&lt;User&gt;) List of user object (required)
         * @return operation
         */
        public CreateUsersWithArrayInputOper body(List<User> user) {
            reqSpec.setBody(user);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public CreateUsersWithArrayInputOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public CreateUsersWithArrayInputOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Creates list of users with given input array
     * 
     *
     * @see #body List of user object (required)
     */
    public class CreateUsersWithListInputOper {

        public static final String REQ_URI = "/user/createWithList";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public CreateUsersWithListInputOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("*/*");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public CreateUsersWithListInputOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("*/*");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /user/createWithList
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(POST, REQ_URI));
        }

         /**
         * @param user (List&lt;User&gt;) List of user object (required)
         * @return operation
         */
        public CreateUsersWithListInputOper body(List<User> user) {
            reqSpec.setBody(user);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public CreateUsersWithListInputOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public CreateUsersWithListInputOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Delete user
     * This can only be done by the logged in user.
     *
     * @see #usernamePath The name that needs to be deleted (required)
     */
    public class DeleteUserOper {

        public static final String REQ_URI = "/user/{username}";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public DeleteUserOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public DeleteUserOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * DELETE /user/{username}
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(DELETE, REQ_URI));
        }

        public static final String USERNAME_PATH = "username";

        /**
         * @param username (String) The name that needs to be deleted (required)
         * @return operation
         */
        public DeleteUserOper usernamePath(Object username) {
            reqSpec.addPathParam(USERNAME_PATH, username);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public DeleteUserOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public DeleteUserOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Get user by user name
     * 
     *
     * @see #usernamePath The name that needs to be fetched. Use user1 for testing. (required)
     * return User
     */
    public class GetUserByNameOper {

        public static final String REQ_URI = "/user/{username}";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public GetUserByNameOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public GetUserByNameOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /user/{username}
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /user/{username}
         * @param handler handler
         * @return User
         */
        public User executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<User>(){}.getType();
            return execute(handler).as(type);
        }

        public static final String USERNAME_PATH = "username";

        /**
         * @param username (String) The name that needs to be fetched. Use user1 for testing. (required)
         * @return operation
         */
        public GetUserByNameOper usernamePath(Object username) {
            reqSpec.addPathParam(USERNAME_PATH, username);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public GetUserByNameOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public GetUserByNameOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Logs user into the system
     * 
     *
     * @see #usernameQuery The user name for login (required)
     * @see #passwordQuery The password for login in clear text (required)
     * return String
     */
    public class LoginUserOper {

        public static final String REQ_URI = "/user/login";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public LoginUserOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public LoginUserOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /user/login
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /user/login
         * @param handler handler
         * @return String
         */
        public String executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<String>(){}.getType();
            return execute(handler).as(type);
        }

        public static final String USERNAME_QUERY = "username";

        /**
         * @param username (String) The user name for login (required)
         * @return operation
         */
        public LoginUserOper usernameQuery(Object... username) {
            reqSpec.addQueryParam(USERNAME_QUERY, username);
            return this;
        }

        public static final String PASSWORD_QUERY = "password";

        /**
         * @param password (String) The password for login in clear text (required)
         * @return operation
         */
        public LoginUserOper passwordQuery(Object... password) {
            reqSpec.addQueryParam(PASSWORD_QUERY, password);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public LoginUserOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public LoginUserOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Logs out current logged in user session
     * 
     *
     */
    public class LogoutUserOper {

        public static final String REQ_URI = "/user/logout";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public LogoutUserOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public LogoutUserOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /user/logout
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public LogoutUserOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public LogoutUserOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Updated user
     * This can only be done by the logged in user.
     *
     * @see #usernamePath name that need to be deleted (required)
     * @see #body Updated user object (required)
     */
    public class UpdateUserOper {

        public static final String REQ_URI = "/user/{username}";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public UpdateUserOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("*/*");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public UpdateUserOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("*/*");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * PUT /user/{username}
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(PUT, REQ_URI));
        }

         /**
         * @param user (User) Updated user object (required)
         * @return operation
         */
        public UpdateUserOper body(User user) {
            reqSpec.setBody(user);
            return this;
        }

        public static final String USERNAME_PATH = "username";

        /**
         * @param username (String) name that need to be deleted (required)
         * @return operation
         */
        public UpdateUserOper usernamePath(Object username) {
            reqSpec.addPathParam(USERNAME_PATH, username);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public UpdateUserOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public UpdateUserOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
}