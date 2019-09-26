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


package com.kibocommerce.sdk.auth.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.auth.model.HttpContent;
import com.kibocommerce.sdk.auth.model.HttpRequestMessage;
import com.kibocommerce.sdk.auth.model.KeyValuePair2;
import com.kibocommerce.sdk.auth.model.Version;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HttpResponseMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-26T13:42:29.731930-05:00[America/Chicago]")
public class HttpResponseMessage {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Version version = null;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private HttpContent content = null;

  /**
   * Gets or Sets statusCode
   */
  @JsonAdapter(StatusCodeEnum.Adapter.class)
  public enum StatusCodeEnum {
    CONTINUE("Continue"),
    
    SWITCHINGPROTOCOLS("SwitchingProtocols"),
    
    PROCESSING("Processing"),
    
    EARLYHINTS("EarlyHints"),
    
    OK("OK"),
    
    CREATED("Created"),
    
    ACCEPTED("Accepted"),
    
    NONAUTHORITATIVEINFORMATION("NonAuthoritativeInformation"),
    
    NOCONTENT("NoContent"),
    
    RESETCONTENT("ResetContent"),
    
    PARTIALCONTENT("PartialContent"),
    
    MULTISTATUS("MultiStatus"),
    
    ALREADYREPORTED("AlreadyReported"),
    
    IMUSED("IMUsed"),
    
    MULTIPLECHOICES("MultipleChoices"),
    
    AMBIGUOUS("Ambiguous"),
    
    MOVEDPERMANENTLY("MovedPermanently"),
    
    MOVED("Moved"),
    
    FOUND("Found"),
    
    REDIRECT("Redirect"),
    
    SEEOTHER("SeeOther"),
    
    REDIRECTMETHOD("RedirectMethod"),
    
    NOTMODIFIED("NotModified"),
    
    USEPROXY("UseProxy"),
    
    UNUSED("Unused"),
    
    TEMPORARYREDIRECT("TemporaryRedirect"),
    
    REDIRECTKEEPVERB("RedirectKeepVerb"),
    
    PERMANENTREDIRECT("PermanentRedirect"),
    
    BADREQUEST("BadRequest"),
    
    UNAUTHORIZED("Unauthorized"),
    
    PAYMENTREQUIRED("PaymentRequired"),
    
    FORBIDDEN("Forbidden"),
    
    NOTFOUND("NotFound"),
    
    METHODNOTALLOWED("MethodNotAllowed"),
    
    NOTACCEPTABLE("NotAcceptable"),
    
    PROXYAUTHENTICATIONREQUIRED("ProxyAuthenticationRequired"),
    
    REQUESTTIMEOUT("RequestTimeout"),
    
    CONFLICT("Conflict"),
    
    GONE("Gone"),
    
    LENGTHREQUIRED("LengthRequired"),
    
    PRECONDITIONFAILED("PreconditionFailed"),
    
    REQUESTENTITYTOOLARGE("RequestEntityTooLarge"),
    
    REQUESTURITOOLONG("RequestUriTooLong"),
    
    UNSUPPORTEDMEDIATYPE("UnsupportedMediaType"),
    
    REQUESTEDRANGENOTSATISFIABLE("RequestedRangeNotSatisfiable"),
    
    EXPECTATIONFAILED("ExpectationFailed"),
    
    MISDIRECTEDREQUEST("MisdirectedRequest"),
    
    UNPROCESSABLEENTITY("UnprocessableEntity"),
    
    LOCKED("Locked"),
    
    FAILEDDEPENDENCY("FailedDependency"),
    
    UPGRADEREQUIRED("UpgradeRequired"),
    
    PRECONDITIONREQUIRED("PreconditionRequired"),
    
    TOOMANYREQUESTS("TooManyRequests"),
    
    REQUESTHEADERFIELDSTOOLARGE("RequestHeaderFieldsTooLarge"),
    
    UNAVAILABLEFORLEGALREASONS("UnavailableForLegalReasons"),
    
    INTERNALSERVERERROR("InternalServerError"),
    
    NOTIMPLEMENTED("NotImplemented"),
    
    BADGATEWAY("BadGateway"),
    
    SERVICEUNAVAILABLE("ServiceUnavailable"),
    
    GATEWAYTIMEOUT("GatewayTimeout"),
    
    HTTPVERSIONNOTSUPPORTED("HttpVersionNotSupported"),
    
    VARIANTALSONEGOTIATES("VariantAlsoNegotiates"),
    
    INSUFFICIENTSTORAGE("InsufficientStorage"),
    
    LOOPDETECTED("LoopDetected"),
    
    NOTEXTENDED("NotExtended"),
    
    NETWORKAUTHENTICATIONREQUIRED("NetworkAuthenticationRequired");

    private String value;

    StatusCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusCodeEnum fromValue(String text) {
      for (StatusCodeEnum b : StatusCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<StatusCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusCodeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS_CODE = "statusCode";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private StatusCodeEnum statusCode;

  public static final String SERIALIZED_NAME_REASON_PHRASE = "reasonPhrase";
  @SerializedName(SERIALIZED_NAME_REASON_PHRASE)
  private String reasonPhrase;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private List<KeyValuePair2> headers = null;

  public static final String SERIALIZED_NAME_REQUEST_MESSAGE = "requestMessage";
  @SerializedName(SERIALIZED_NAME_REQUEST_MESSAGE)
  private HttpRequestMessage requestMessage = null;

  public static final String SERIALIZED_NAME_IS_SUCCESS_STATUS_CODE = "isSuccessStatusCode";
  @SerializedName(SERIALIZED_NAME_IS_SUCCESS_STATUS_CODE)
  private Boolean isSuccessStatusCode;

  public HttpResponseMessage version(Version version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public Version getVersion() {
    return version;
  }

  public void setVersion(Version version) {
    this.version = version;
  }

  public HttpResponseMessage content(HttpContent content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  public HttpContent getContent() {
    return content;
  }

  public void setContent(HttpContent content) {
    this.content = content;
  }

  public HttpResponseMessage statusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @ApiModelProperty(value = "")
  public StatusCodeEnum getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
  }

  public HttpResponseMessage reasonPhrase(String reasonPhrase) {
    this.reasonPhrase = reasonPhrase;
    return this;
  }

   /**
   * Get reasonPhrase
   * @return reasonPhrase
  **/
  @ApiModelProperty(value = "")
  public String getReasonPhrase() {
    return reasonPhrase;
  }

  public void setReasonPhrase(String reasonPhrase) {
    this.reasonPhrase = reasonPhrase;
  }

   /**
   * Get headers
   * @return headers
  **/
  @ApiModelProperty(value = "")
  public List<KeyValuePair2> getHeaders() {
    return headers;
  }

  public HttpResponseMessage requestMessage(HttpRequestMessage requestMessage) {
    this.requestMessage = requestMessage;
    return this;
  }

   /**
   * Get requestMessage
   * @return requestMessage
  **/
  @ApiModelProperty(value = "")
  public HttpRequestMessage getRequestMessage() {
    return requestMessage;
  }

  public void setRequestMessage(HttpRequestMessage requestMessage) {
    this.requestMessage = requestMessage;
  }

   /**
   * Get isSuccessStatusCode
   * @return isSuccessStatusCode
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsSuccessStatusCode() {
    return isSuccessStatusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpResponseMessage httpResponseMessage = (HttpResponseMessage) o;
    return Objects.equals(this.version, httpResponseMessage.version) &&
        Objects.equals(this.content, httpResponseMessage.content) &&
        Objects.equals(this.statusCode, httpResponseMessage.statusCode) &&
        Objects.equals(this.reasonPhrase, httpResponseMessage.reasonPhrase) &&
        Objects.equals(this.headers, httpResponseMessage.headers) &&
        Objects.equals(this.requestMessage, httpResponseMessage.requestMessage) &&
        Objects.equals(this.isSuccessStatusCode, httpResponseMessage.isSuccessStatusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, content, statusCode, reasonPhrase, headers, requestMessage, isSuccessStatusCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpResponseMessage {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    reasonPhrase: ").append(toIndentedString(reasonPhrase)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    requestMessage: ").append(toIndentedString(requestMessage)).append("\n");
    sb.append("    isSuccessStatusCode: ").append(toIndentedString(isSuccessStatusCode)).append("\n");
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

