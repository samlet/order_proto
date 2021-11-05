package com.bluecc.bluesrv.ofbiz.entity;

import java.io.Serializable;
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
@ApiModel(value = "Invoice对象", description = "")
public class Invoice implements Serializable {

    private static final long serialVersionUID = 1L;

    private String invoiceId;

    private String invoiceTypeId;

    private String partyIdFrom;

    private String partyId;

    private String roleTypeId;

    private String statusId;

    private String billingAccountId;

    private String contactMechId;

    private LocalDateTime invoiceDate;

    private LocalDateTime dueDate;

    private LocalDateTime paidDate;

    private String invoiceMessage;

    private String referenceNumber;

    private String description;

    private String currencyUomId;

    private String recurrenceInfoId;

    private LocalDateTime lastUpdatedStamp;

    private LocalDateTime lastUpdatedTxStamp;

    private LocalDateTime createdStamp;

    private LocalDateTime createdTxStamp;


    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoiceTypeId() {
        return invoiceTypeId;
    }

    public void setInvoiceTypeId(String invoiceTypeId) {
        this.invoiceTypeId = invoiceTypeId;
    }

    public String getPartyIdFrom() {
        return partyIdFrom;
    }

    public void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getBillingAccountId() {
        return billingAccountId;
    }

    public void setBillingAccountId(String billingAccountId) {
        this.billingAccountId = billingAccountId;
    }

    public String getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }

    public LocalDateTime getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDateTime invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDateTime getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(LocalDateTime paidDate) {
        this.paidDate = paidDate;
    }

    public String getInvoiceMessage() {
        return invoiceMessage;
    }

    public void setInvoiceMessage(String invoiceMessage) {
        this.invoiceMessage = invoiceMessage;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public String getRecurrenceInfoId() {
        return recurrenceInfoId;
    }

    public void setRecurrenceInfoId(String recurrenceInfoId) {
        this.recurrenceInfoId = recurrenceInfoId;
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
        return "Invoice{" +
        "invoiceId=" + invoiceId +
        ", invoiceTypeId=" + invoiceTypeId +
        ", partyIdFrom=" + partyIdFrom +
        ", partyId=" + partyId +
        ", roleTypeId=" + roleTypeId +
        ", statusId=" + statusId +
        ", billingAccountId=" + billingAccountId +
        ", contactMechId=" + contactMechId +
        ", invoiceDate=" + invoiceDate +
        ", dueDate=" + dueDate +
        ", paidDate=" + paidDate +
        ", invoiceMessage=" + invoiceMessage +
        ", referenceNumber=" + referenceNumber +
        ", description=" + description +
        ", currencyUomId=" + currencyUomId +
        ", recurrenceInfoId=" + recurrenceInfoId +
        ", lastUpdatedStamp=" + lastUpdatedStamp +
        ", lastUpdatedTxStamp=" + lastUpdatedTxStamp +
        ", createdStamp=" + createdStamp +
        ", createdTxStamp=" + createdTxStamp +
        "}";
    }
}
