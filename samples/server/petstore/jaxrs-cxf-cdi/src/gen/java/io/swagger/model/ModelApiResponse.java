package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ModelApiResponse", propOrder =
    { "code", "type", "message"
})

@XmlRootElement(name="ModelApiResponse")
@ApiModel(description="Describes the result of uploading an image resource")
public class ModelApiResponse  {
  

  @XmlElement(name="code")
  @ApiModelProperty(example = "null", value = "")
  private Integer code = null;

  @XmlElement(name="type")
  @ApiModelProperty(example = "null", value = "")
  private String type = null;

  @XmlElement(name="message")
  @ApiModelProperty(example = "null", value = "")
  private String message = null;

 /**
   * Get code
   * @return code
  **/
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }
 /**
   * Get type
   * @return type
  **/
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
 /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelApiResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
