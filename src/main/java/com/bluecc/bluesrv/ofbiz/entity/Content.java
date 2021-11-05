package com.bluecc.bluesrv.ofbiz.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author samlet
 * @since 2021-11-05
 */
@ApiModel(value = "Content对象", description = "")
public class Content implements Serializable {

    private static final long serialVersionUID = 1L;

    private String contentId;

    private String contentTypeId;

    private String ownerContentId;

    private String decoratorContentId;

    private String instanceOfContentId;

    private String dataResourceId;

    private String templateDataResourceId;

    private String dataSourceId;

    private String statusId;

    private String privilegeEnumId;

    private String serviceName;

    private String customMethodId;

    private String contentName;

    private String description;

    private String localeString;

    private String mimeTypeId;

    private String characterSetId;

    private BigDecimal childLeafCount;

    private BigDecimal childBranchCount;

    private LocalDateTime createdDate;

    private String createdByUserLogin;

    private LocalDateTime lastModifiedDate;

    private String lastModifiedByUserLogin;

    private LocalDateTime lastUpdatedStamp;

    private LocalDateTime lastUpdatedTxStamp;

    private LocalDateTime createdStamp;

    private LocalDateTime createdTxStamp;


    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getContentTypeId() {
        return contentTypeId;
    }

    public void setContentTypeId(String contentTypeId) {
        this.contentTypeId = contentTypeId;
    }

    public String getOwnerContentId() {
        return ownerContentId;
    }

    public void setOwnerContentId(String ownerContentId) {
        this.ownerContentId = ownerContentId;
    }

    public String getDecoratorContentId() {
        return decoratorContentId;
    }

    public void setDecoratorContentId(String decoratorContentId) {
        this.decoratorContentId = decoratorContentId;
    }

    public String getInstanceOfContentId() {
        return instanceOfContentId;
    }

    public void setInstanceOfContentId(String instanceOfContentId) {
        this.instanceOfContentId = instanceOfContentId;
    }

    public String getDataResourceId() {
        return dataResourceId;
    }

    public void setDataResourceId(String dataResourceId) {
        this.dataResourceId = dataResourceId;
    }

    public String getTemplateDataResourceId() {
        return templateDataResourceId;
    }

    public void setTemplateDataResourceId(String templateDataResourceId) {
        this.templateDataResourceId = templateDataResourceId;
    }

    public String getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getPrivilegeEnumId() {
        return privilegeEnumId;
    }

    public void setPrivilegeEnumId(String privilegeEnumId) {
        this.privilegeEnumId = privilegeEnumId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getCustomMethodId() {
        return customMethodId;
    }

    public void setCustomMethodId(String customMethodId) {
        this.customMethodId = customMethodId;
    }

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocaleString() {
        return localeString;
    }

    public void setLocaleString(String localeString) {
        this.localeString = localeString;
    }

    public String getMimeTypeId() {
        return mimeTypeId;
    }

    public void setMimeTypeId(String mimeTypeId) {
        this.mimeTypeId = mimeTypeId;
    }

    public String getCharacterSetId() {
        return characterSetId;
    }

    public void setCharacterSetId(String characterSetId) {
        this.characterSetId = characterSetId;
    }

    public BigDecimal getChildLeafCount() {
        return childLeafCount;
    }

    public void setChildLeafCount(BigDecimal childLeafCount) {
        this.childLeafCount = childLeafCount;
    }

    public BigDecimal getChildBranchCount() {
        return childBranchCount;
    }

    public void setChildBranchCount(BigDecimal childBranchCount) {
        this.childBranchCount = childBranchCount;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }

    public LocalDateTime getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public LocalDateTime getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public LocalDateTime getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }

    public LocalDateTime getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    @Override
    public String toString() {
        return "Content{" +
        "contentId=" + contentId +
        ", contentTypeId=" + contentTypeId +
        ", ownerContentId=" + ownerContentId +
        ", decoratorContentId=" + decoratorContentId +
        ", instanceOfContentId=" + instanceOfContentId +
        ", dataResourceId=" + dataResourceId +
        ", templateDataResourceId=" + templateDataResourceId +
        ", dataSourceId=" + dataSourceId +
        ", statusId=" + statusId +
        ", privilegeEnumId=" + privilegeEnumId +
        ", serviceName=" + serviceName +
        ", customMethodId=" + customMethodId +
        ", contentName=" + contentName +
        ", description=" + description +
        ", localeString=" + localeString +
        ", mimeTypeId=" + mimeTypeId +
        ", characterSetId=" + characterSetId +
        ", childLeafCount=" + childLeafCount +
        ", childBranchCount=" + childBranchCount +
        ", createdDate=" + createdDate +
        ", createdByUserLogin=" + createdByUserLogin +
        ", lastModifiedDate=" + lastModifiedDate +
        ", lastModifiedByUserLogin=" + lastModifiedByUserLogin +
        ", lastUpdatedStamp=" + lastUpdatedStamp +
        ", lastUpdatedTxStamp=" + lastUpdatedTxStamp +
        ", createdStamp=" + createdStamp +
        ", createdTxStamp=" + createdTxStamp +
        "}";
    }
}
