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


package com.kibocommerce.sdk.inventory.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.inventory.model.ExportSettingsFTP;
import com.kibocommerce.sdk.inventory.model.ExportSettingsS3;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Export Settings
 */
@ApiModel(description = "Export Settings")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-24T16:31:33.449-05:00[America/Chicago]")
public class ExportSettings {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Format for the export file
   */
  @JsonAdapter(FileFormatEnum.Adapter.class)
  public enum FileFormatEnum {
    XML("XML"),
    
    CSV("CSV");

    private String value;

    FileFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FileFormatEnum fromValue(String text) {
      for (FileFormatEnum b : FileFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<FileFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FileFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FileFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FileFormatEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_FILE_FORMAT = "fileFormat";
  @SerializedName(SERIALIZED_NAME_FILE_FORMAT)
  private FileFormatEnum fileFormat;

  /**
   * Type of exportGG for the settings
   */
  @JsonAdapter(ExportTypeEnum.Adapter.class)
  public enum ExportTypeEnum {
    AGGREGATE("AGGREGATE"),
    
    LOCATION("LOCATION");

    private String value;

    ExportTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExportTypeEnum fromValue(String text) {
      for (ExportTypeEnum b : ExportTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<ExportTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExportTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExportTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ExportTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_EXPORT_TYPE = "exportType";
  @SerializedName(SERIALIZED_NAME_EXPORT_TYPE)
  private ExportTypeEnum exportType;

  public static final String SERIALIZED_NAME_ONLY_SEND_AVAILABLE = "onlySendAvailable";
  @SerializedName(SERIALIZED_NAME_ONLY_SEND_AVAILABLE)
  private Boolean onlySendAvailable;

  public static final String SERIALIZED_NAME_ONLY_SEND_ACTIVE_LOCATIONS = "onlySendActiveLocations";
  @SerializedName(SERIALIZED_NAME_ONLY_SEND_ACTIVE_LOCATIONS)
  private Boolean onlySendActiveLocations;

  public static final String SERIALIZED_NAME_FTP_INFORMATION = "ftpInformation";
  @SerializedName(SERIALIZED_NAME_FTP_INFORMATION)
  private List<ExportSettingsFTP> ftpInformation = new ArrayList<ExportSettingsFTP>();

  public static final String SERIALIZED_NAME_S3_INFORMATION = "s3Information";
  @SerializedName(SERIALIZED_NAME_S3_INFORMATION)
  private List<ExportSettingsS3> s3Information = null;

  public static final String SERIALIZED_NAME_EXPORT_SINGLE_FILE = "exportSingleFile";
  @SerializedName(SERIALIZED_NAME_EXPORT_SINGLE_FILE)
  private Boolean exportSingleFile;

  /**
   * Safety Stock
   */
  @JsonAdapter(SafetyStockEnum.Adapter.class)
  public enum SafetyStockEnum {
    MAX("SAFETY_STOCK_MAX"),
    
    MIN("SAFETY_STOCK_MIN"),
    
    AVG("SAFETY_STOCK_AVG"),
    
    SUM("SAFETY_STOCK_SUM");

    private String value;

    SafetyStockEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SafetyStockEnum fromValue(String text) {
      for (SafetyStockEnum b : SafetyStockEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<SafetyStockEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SafetyStockEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SafetyStockEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SafetyStockEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_SAFETY_STOCK = "safetyStock";
  @SerializedName(SERIALIZED_NAME_SAFETY_STOCK)
  private SafetyStockEnum safetyStock;

  /**
   * Floor
   */
  @JsonAdapter(FloorEnum.Adapter.class)
  public enum FloorEnum {
    MAX("FLOOR_MAX"),
    
    MIN("FLOOR_MIN"),
    
    AVG("FLOOR_AVG"),
    
    SUM("FLOOR_SUM");

    private String value;

    FloorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FloorEnum fromValue(String text) {
      for (FloorEnum b : FloorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<FloorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FloorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FloorEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FloorEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_FLOOR = "floor";
  @SerializedName(SERIALIZED_NAME_FLOOR)
  private FloorEnum floor;

  /**
   * LTD
   */
  @JsonAdapter(LtdEnum.Adapter.class)
  public enum LtdEnum {
    MAX("LTD_MAX"),
    
    MIN("LTD_MIN"),
    
    AVG("LTD_AVG"),
    
    SUM("LTD_SUM");

    private String value;

    LtdEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LtdEnum fromValue(String text) {
      for (LtdEnum b : LtdEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<LtdEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LtdEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LtdEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LtdEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_LTD = "ltd";
  @SerializedName(SERIALIZED_NAME_LTD)
  private LtdEnum ltd;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_INCLUDE_ATTRIBUTES = "includeAttributes";
  @SerializedName(SERIALIZED_NAME_INCLUDE_ATTRIBUTES)
  private Boolean includeAttributes;

  public static final String SERIALIZED_NAME_ZIP_FILES = "zipFiles";
  @SerializedName(SERIALIZED_NAME_ZIP_FILES)
  private Boolean zipFiles;

  public static final String SERIALIZED_NAME_ZIP_FILE_NAME = "zipFileName";
  @SerializedName(SERIALIZED_NAME_ZIP_FILE_NAME)
  private String zipFileName;

  public static final String SERIALIZED_NAME_UNTRANSFORMED_FILE_NAME = "untransformedFileName";
  @SerializedName(SERIALIZED_NAME_UNTRANSFORMED_FILE_NAME)
  private String untransformedFileName;

  public static final String SERIALIZED_NAME_UNTRANSFORMED_ZIP_FILE_NAME = "untransformedZipFileName";
  @SerializedName(SERIALIZED_NAME_UNTRANSFORMED_ZIP_FILE_NAME)
  private String untransformedZipFileName;

  public static final String SERIALIZED_NAME_LOCATION_GROUP_I_DS = "locationGroupIDs";
  @SerializedName(SERIALIZED_NAME_LOCATION_GROUP_I_DS)
  private List<Integer> locationGroupIDs = null;

  public static final String SERIALIZED_NAME_SITE_I_DS = "siteIDs";
  @SerializedName(SERIALIZED_NAME_SITE_I_DS)
  private List<Integer> siteIDs = null;

  public static final String SERIALIZED_NAME_DIRECT_SHIP = "directShip";
  @SerializedName(SERIALIZED_NAME_DIRECT_SHIP)
  private Boolean directShip;

  public static final String SERIALIZED_NAME_PICKUP = "pickup";
  @SerializedName(SERIALIZED_NAME_PICKUP)
  private Boolean pickup;

  public static final String SERIALIZED_NAME_TRANSFER = "transfer";
  @SerializedName(SERIALIZED_NAME_TRANSFER)
  private Boolean transfer;

  public ExportSettings name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Export Settings Name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Export Settings Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExportSettings fileFormat(FileFormatEnum fileFormat) {
    this.fileFormat = fileFormat;
    return this;
  }

   /**
   * Format for the export file
   * @return fileFormat
  **/
  @ApiModelProperty(required = true, value = "Format for the export file")
  public FileFormatEnum getFileFormat() {
    return fileFormat;
  }

  public void setFileFormat(FileFormatEnum fileFormat) {
    this.fileFormat = fileFormat;
  }

  public ExportSettings exportType(ExportTypeEnum exportType) {
    this.exportType = exportType;
    return this;
  }

   /**
   * Type of exportGG for the settings
   * @return exportType
  **/
  @ApiModelProperty(required = true, value = "Type of exportGG for the settings")
  public ExportTypeEnum getExportType() {
    return exportType;
  }

  public void setExportType(ExportTypeEnum exportType) {
    this.exportType = exportType;
  }

  public ExportSettings onlySendAvailable(Boolean onlySendAvailable) {
    this.onlySendAvailable = onlySendAvailable;
    return this;
  }

   /**
   * Flag for only sending available
   * @return onlySendAvailable
  **/
  @ApiModelProperty(value = "Flag for only sending available")
  public Boolean getOnlySendAvailable() {
    return onlySendAvailable;
  }

  public void setOnlySendAvailable(Boolean onlySendAvailable) {
    this.onlySendAvailable = onlySendAvailable;
  }

  public ExportSettings onlySendActiveLocations(Boolean onlySendActiveLocations) {
    this.onlySendActiveLocations = onlySendActiveLocations;
    return this;
  }

   /**
   * Flag for only sending from active locations
   * @return onlySendActiveLocations
  **/
  @ApiModelProperty(value = "Flag for only sending from active locations")
  public Boolean getOnlySendActiveLocations() {
    return onlySendActiveLocations;
  }

  public void setOnlySendActiveLocations(Boolean onlySendActiveLocations) {
    this.onlySendActiveLocations = onlySendActiveLocations;
  }

  public ExportSettings ftpInformation(List<ExportSettingsFTP> ftpInformation) {
    this.ftpInformation = ftpInformation;
    return this;
  }

  public ExportSettings addFtpInformationItem(ExportSettingsFTP ftpInformationItem) {
    this.ftpInformation.add(ftpInformationItem);
    return this;
  }

   /**
   * List of export FTP settings
   * @return ftpInformation
  **/
  @ApiModelProperty(required = true, value = "List of export FTP settings")
  public List<ExportSettingsFTP> getFtpInformation() {
    return ftpInformation;
  }

  public void setFtpInformation(List<ExportSettingsFTP> ftpInformation) {
    this.ftpInformation = ftpInformation;
  }

  public ExportSettings s3Information(List<ExportSettingsS3> s3Information) {
    this.s3Information = s3Information;
    return this;
  }

  public ExportSettings addS3InformationItem(ExportSettingsS3 s3InformationItem) {
    if (this.s3Information == null) {
      this.s3Information = new ArrayList<ExportSettingsS3>();
    }
    this.s3Information.add(s3InformationItem);
    return this;
  }

   /**
   * List of export S3 settings
   * @return s3Information
  **/
  @ApiModelProperty(value = "List of export S3 settings")
  public List<ExportSettingsS3> getS3Information() {
    return s3Information;
  }

  public void setS3Information(List<ExportSettingsS3> s3Information) {
    this.s3Information = s3Information;
  }

  public ExportSettings exportSingleFile(Boolean exportSingleFile) {
    this.exportSingleFile = exportSingleFile;
    return this;
  }

   /**
   * Flag for exporting as a single file
   * @return exportSingleFile
  **/
  @ApiModelProperty(value = "Flag for exporting as a single file")
  public Boolean getExportSingleFile() {
    return exportSingleFile;
  }

  public void setExportSingleFile(Boolean exportSingleFile) {
    this.exportSingleFile = exportSingleFile;
  }

  public ExportSettings safetyStock(SafetyStockEnum safetyStock) {
    this.safetyStock = safetyStock;
    return this;
  }

   /**
   * Safety Stock
   * @return safetyStock
  **/
  @ApiModelProperty(value = "Safety Stock")
  public SafetyStockEnum getSafetyStock() {
    return safetyStock;
  }

  public void setSafetyStock(SafetyStockEnum safetyStock) {
    this.safetyStock = safetyStock;
  }

  public ExportSettings floor(FloorEnum floor) {
    this.floor = floor;
    return this;
  }

   /**
   * Floor
   * @return floor
  **/
  @ApiModelProperty(value = "Floor")
  public FloorEnum getFloor() {
    return floor;
  }

  public void setFloor(FloorEnum floor) {
    this.floor = floor;
  }

  public ExportSettings ltd(LtdEnum ltd) {
    this.ltd = ltd;
    return this;
  }

   /**
   * LTD
   * @return ltd
  **/
  @ApiModelProperty(value = "LTD")
  public LtdEnum getLtd() {
    return ltd;
  }

  public void setLtd(LtdEnum ltd) {
    this.ltd = ltd;
  }

  public ExportSettings fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Name for the export file
   * @return fileName
  **/
  @ApiModelProperty(value = "Name for the export file")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public ExportSettings includeAttributes(Boolean includeAttributes) {
    this.includeAttributes = includeAttributes;
    return this;
  }

   /**
   * Flag for including attributes
   * @return includeAttributes
  **/
  @ApiModelProperty(value = "Flag for including attributes")
  public Boolean getIncludeAttributes() {
    return includeAttributes;
  }

  public void setIncludeAttributes(Boolean includeAttributes) {
    this.includeAttributes = includeAttributes;
  }

  public ExportSettings zipFiles(Boolean zipFiles) {
    this.zipFiles = zipFiles;
    return this;
  }

   /**
   * Flag for zipping the files
   * @return zipFiles
  **/
  @ApiModelProperty(value = "Flag for zipping the files")
  public Boolean getZipFiles() {
    return zipFiles;
  }

  public void setZipFiles(Boolean zipFiles) {
    this.zipFiles = zipFiles;
  }

  public ExportSettings zipFileName(String zipFileName) {
    this.zipFileName = zipFileName;
    return this;
  }

   /**
   * Name for the zipped file
   * @return zipFileName
  **/
  @ApiModelProperty(value = "Name for the zipped file")
  public String getZipFileName() {
    return zipFileName;
  }

  public void setZipFileName(String zipFileName) {
    this.zipFileName = zipFileName;
  }

  public ExportSettings untransformedFileName(String untransformedFileName) {
    this.untransformedFileName = untransformedFileName;
    return this;
  }

   /**
   * Untransformed File Name
   * @return untransformedFileName
  **/
  @ApiModelProperty(value = "Untransformed File Name")
  public String getUntransformedFileName() {
    return untransformedFileName;
  }

  public void setUntransformedFileName(String untransformedFileName) {
    this.untransformedFileName = untransformedFileName;
  }

  public ExportSettings untransformedZipFileName(String untransformedZipFileName) {
    this.untransformedZipFileName = untransformedZipFileName;
    return this;
  }

   /**
   * Untransformed Zip File Name
   * @return untransformedZipFileName
  **/
  @ApiModelProperty(value = "Untransformed Zip File Name")
  public String getUntransformedZipFileName() {
    return untransformedZipFileName;
  }

  public void setUntransformedZipFileName(String untransformedZipFileName) {
    this.untransformedZipFileName = untransformedZipFileName;
  }

  public ExportSettings locationGroupIDs(List<Integer> locationGroupIDs) {
    this.locationGroupIDs = locationGroupIDs;
    return this;
  }

  public ExportSettings addLocationGroupIDsItem(Integer locationGroupIDsItem) {
    if (this.locationGroupIDs == null) {
      this.locationGroupIDs = new ArrayList<Integer>();
    }
    this.locationGroupIDs.add(locationGroupIDsItem);
    return this;
  }

   /**
   * Location Group Ids associated with the settings
   * @return locationGroupIDs
  **/
  @ApiModelProperty(value = "Location Group Ids associated with the settings")
  public List<Integer> getLocationGroupIDs() {
    return locationGroupIDs;
  }

  public void setLocationGroupIDs(List<Integer> locationGroupIDs) {
    this.locationGroupIDs = locationGroupIDs;
  }

  public ExportSettings siteIDs(List<Integer> siteIDs) {
    this.siteIDs = siteIDs;
    return this;
  }

  public ExportSettings addSiteIDsItem(Integer siteIDsItem) {
    if (this.siteIDs == null) {
      this.siteIDs = new ArrayList<Integer>();
    }
    this.siteIDs.add(siteIDsItem);
    return this;
  }

   /**
   * Site Ids associated with the settings
   * @return siteIDs
  **/
  @ApiModelProperty(value = "Site Ids associated with the settings")
  public List<Integer> getSiteIDs() {
    return siteIDs;
  }

  public void setSiteIDs(List<Integer> siteIDs) {
    this.siteIDs = siteIDs;
  }

  public ExportSettings directShip(Boolean directShip) {
    this.directShip = directShip;
    return this;
  }

   /**
   * Flag for only using locations with Direct Ship enabled
   * @return directShip
  **/
  @ApiModelProperty(value = "Flag for only using locations with Direct Ship enabled")
  public Boolean getDirectShip() {
    return directShip;
  }

  public void setDirectShip(Boolean directShip) {
    this.directShip = directShip;
  }

  public ExportSettings pickup(Boolean pickup) {
    this.pickup = pickup;
    return this;
  }

   /**
   * Flag for only using locations with In Store Pickup enabled
   * @return pickup
  **/
  @ApiModelProperty(value = "Flag for only using locations with In Store Pickup enabled")
  public Boolean getPickup() {
    return pickup;
  }

  public void setPickup(Boolean pickup) {
    this.pickup = pickup;
  }

  public ExportSettings transfer(Boolean transfer) {
    this.transfer = transfer;
    return this;
  }

   /**
   * Flag for only using locations with Transfer enabled
   * @return transfer
  **/
  @ApiModelProperty(value = "Flag for only using locations with Transfer enabled")
  public Boolean getTransfer() {
    return transfer;
  }

  public void setTransfer(Boolean transfer) {
    this.transfer = transfer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportSettings exportSettings = (ExportSettings) o;
    return Objects.equals(this.name, exportSettings.name) &&
        Objects.equals(this.fileFormat, exportSettings.fileFormat) &&
        Objects.equals(this.exportType, exportSettings.exportType) &&
        Objects.equals(this.onlySendAvailable, exportSettings.onlySendAvailable) &&
        Objects.equals(this.onlySendActiveLocations, exportSettings.onlySendActiveLocations) &&
        Objects.equals(this.ftpInformation, exportSettings.ftpInformation) &&
        Objects.equals(this.s3Information, exportSettings.s3Information) &&
        Objects.equals(this.exportSingleFile, exportSettings.exportSingleFile) &&
        Objects.equals(this.safetyStock, exportSettings.safetyStock) &&
        Objects.equals(this.floor, exportSettings.floor) &&
        Objects.equals(this.ltd, exportSettings.ltd) &&
        Objects.equals(this.fileName, exportSettings.fileName) &&
        Objects.equals(this.includeAttributes, exportSettings.includeAttributes) &&
        Objects.equals(this.zipFiles, exportSettings.zipFiles) &&
        Objects.equals(this.zipFileName, exportSettings.zipFileName) &&
        Objects.equals(this.untransformedFileName, exportSettings.untransformedFileName) &&
        Objects.equals(this.untransformedZipFileName, exportSettings.untransformedZipFileName) &&
        Objects.equals(this.locationGroupIDs, exportSettings.locationGroupIDs) &&
        Objects.equals(this.siteIDs, exportSettings.siteIDs) &&
        Objects.equals(this.directShip, exportSettings.directShip) &&
        Objects.equals(this.pickup, exportSettings.pickup) &&
        Objects.equals(this.transfer, exportSettings.transfer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, fileFormat, exportType, onlySendAvailable, onlySendActiveLocations, ftpInformation, s3Information, exportSingleFile, safetyStock, floor, ltd, fileName, includeAttributes, zipFiles, zipFileName, untransformedFileName, untransformedZipFileName, locationGroupIDs, siteIDs, directShip, pickup, transfer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportSettings {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
    sb.append("    exportType: ").append(toIndentedString(exportType)).append("\n");
    sb.append("    onlySendAvailable: ").append(toIndentedString(onlySendAvailable)).append("\n");
    sb.append("    onlySendActiveLocations: ").append(toIndentedString(onlySendActiveLocations)).append("\n");
    sb.append("    ftpInformation: ").append(toIndentedString(ftpInformation)).append("\n");
    sb.append("    s3Information: ").append(toIndentedString(s3Information)).append("\n");
    sb.append("    exportSingleFile: ").append(toIndentedString(exportSingleFile)).append("\n");
    sb.append("    safetyStock: ").append(toIndentedString(safetyStock)).append("\n");
    sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
    sb.append("    ltd: ").append(toIndentedString(ltd)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    includeAttributes: ").append(toIndentedString(includeAttributes)).append("\n");
    sb.append("    zipFiles: ").append(toIndentedString(zipFiles)).append("\n");
    sb.append("    zipFileName: ").append(toIndentedString(zipFileName)).append("\n");
    sb.append("    untransformedFileName: ").append(toIndentedString(untransformedFileName)).append("\n");
    sb.append("    untransformedZipFileName: ").append(toIndentedString(untransformedZipFileName)).append("\n");
    sb.append("    locationGroupIDs: ").append(toIndentedString(locationGroupIDs)).append("\n");
    sb.append("    siteIDs: ").append(toIndentedString(siteIDs)).append("\n");
    sb.append("    directShip: ").append(toIndentedString(directShip)).append("\n");
    sb.append("    pickup: ").append(toIndentedString(pickup)).append("\n");
    sb.append("    transfer: ").append(toIndentedString(transfer)).append("\n");
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
