/*
 * Spring Boot使用 Swagger2 构建RestFul API
 * 接口文档
 *
 * OpenAPI spec version: v1
 * Contact: 123456@dongfangdi.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.bidewu.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ApiHouseAgentDO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-26T06:55:57.895Z")
public class ApiHouseAgentDO {
  @SerializedName("agentName")
  private String agentName = null;

  @SerializedName("agentPic")
  private String agentPic = null;

  @SerializedName("agentTel")
  private String agentTel = null;

  public ApiHouseAgentDO agentName(String agentName) {
    this.agentName = agentName;
    return this;
  }

   /**
   * Get agentName
   * @return agentName
  **/
  @ApiModelProperty(value = "")
  public String getAgentName() {
    return agentName;
  }

  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }

  public ApiHouseAgentDO agentPic(String agentPic) {
    this.agentPic = agentPic;
    return this;
  }

   /**
   * Get agentPic
   * @return agentPic
  **/
  @ApiModelProperty(value = "")
  public String getAgentPic() {
    return agentPic;
  }

  public void setAgentPic(String agentPic) {
    this.agentPic = agentPic;
  }

  public ApiHouseAgentDO agentTel(String agentTel) {
    this.agentTel = agentTel;
    return this;
  }

   /**
   * Get agentTel
   * @return agentTel
  **/
  @ApiModelProperty(value = "")
  public String getAgentTel() {
    return agentTel;
  }

  public void setAgentTel(String agentTel) {
    this.agentTel = agentTel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiHouseAgentDO apiHouseAgentDO = (ApiHouseAgentDO) o;
    return Objects.equals(this.agentName, apiHouseAgentDO.agentName) &&
        Objects.equals(this.agentPic, apiHouseAgentDO.agentPic) &&
        Objects.equals(this.agentTel, apiHouseAgentDO.agentTel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentName, agentPic, agentTel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiHouseAgentDO {\n");
    
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    agentPic: ").append(toIndentedString(agentPic)).append("\n");
    sb.append("    agentTel: ").append(toIndentedString(agentTel)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
