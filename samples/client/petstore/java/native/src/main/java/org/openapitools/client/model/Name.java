/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Model for testing model name same as property name
 */
@JsonPropertyOrder({
  Name.JSON_PROPERTY_NAME,
  Name.JSON_PROPERTY_SNAKE_CASE,
  Name.JSON_PROPERTY_PROPERTY,
  Name.JSON_PROPERTY_123NUMBER,
})
@ApiModel(description = "Model for testing model name same as property name")

public class Name {
  public static final String JSON_PROPERTY_NAME = "name";
  private Integer name;

  public static final String JSON_PROPERTY_SNAKE_CASE = "snake_case";
  private Integer snakeCase;

  public static final String JSON_PROPERTY_PROPERTY = "property";
  private String property;

  public static final String JSON_PROPERTY_123NUMBER = "123Number";
  private Integer _123number;


  public Name name(Integer name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getName() {
    return name;
  }



  public void setName(Integer name) {
    this.name = name;
  }


   /**
   * Get snakeCase
   * @return snakeCase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SNAKE_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSnakeCase() {
    return snakeCase;
  }




  public Name property(String property) {
    
    this.property = property;
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProperty() {
    return property;
  }



  public void setProperty(String property) {
    this.property = property;
  }


   /**
   * Get _123number
   * @return _123number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_123NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer get123number() {
    return _123number;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return Objects.equals(this.name, name.name) &&
        Objects.equals(this.snakeCase, name.snakeCase) &&
        Objects.equals(this.property, name.property) &&
        Objects.equals(this._123number, name._123number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, snakeCase, property, _123number);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    snakeCase: ").append(toIndentedString(snakeCase)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    _123number: ").append(toIndentedString(_123number)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

