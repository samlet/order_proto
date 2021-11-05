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
@ApiModel(value = "Shipment对象", description = "")
public class Shipment implements Serializable {

    private static final long serialVersionUID = 1L;

    private String shipmentId;

    private String shipmentTypeId;

    private String statusId;

    private String primaryOrderId;

    private String primaryReturnId;

    private String primaryShipGroupSeqId;

    private String picklistBinId;

    private LocalDateTime estimatedReadyDate;

    private LocalDateTime estimatedShipDate;

    private String estimatedShipWorkEffId;

    private LocalDateTime estimatedArrivalDate;

    private String estimatedArrivalWorkEffId;

    private LocalDateTime latestCancelDate;

    private BigDecimal estimatedShipCost;

    private String currencyUomId;

    private String handlingInstructions;

    private String originFacilityId;

    private String destinationFacilityId;

    private String originContactMechId;

    private String originTelecomNumberId;

    private String destinationContactMechId;

    private String destinationTelecomNumberId;

    private String partyIdTo;

    private String partyIdFrom;

    private BigDecimal additionalShippingCharge;

    private String addtlShippingChargeDesc;

    private LocalDateTime createdDate;

    private String createdByUserLogin;

    private LocalDateTime lastModifiedDate;

    private String lastModifiedByUserLogin;

    private LocalDateTime lastUpdatedStamp;

    private LocalDateTime lastUpdatedTxStamp;

    private LocalDateTime createdStamp;

    private LocalDateTime createdTxStamp;


    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getShipmentTypeId() {
        return shipmentTypeId;
    }

    public void setShipmentTypeId(String shipmentTypeId) {
        this.shipmentTypeId = shipmentTypeId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getPrimaryOrderId() {
        return primaryOrderId;
    }

    public void setPrimaryOrderId(String primaryOrderId) {
        this.primaryOrderId = primaryOrderId;
    }

    public String getPrimaryReturnId() {
        return primaryReturnId;
    }

    public void setPrimaryReturnId(String primaryReturnId) {
        this.primaryReturnId = primaryReturnId;
    }

    public String getPrimaryShipGroupSeqId() {
        return primaryShipGroupSeqId;
    }

    public void setPrimaryShipGroupSeqId(String primaryShipGroupSeqId) {
        this.primaryShipGroupSeqId = primaryShipGroupSeqId;
    }

    public String getPicklistBinId() {
        return picklistBinId;
    }

    public void setPicklistBinId(String picklistBinId) {
        this.picklistBinId = picklistBinId;
    }

    public LocalDateTime getEstimatedReadyDate() {
        return estimatedReadyDate;
    }

    public void setEstimatedReadyDate(LocalDateTime estimatedReadyDate) {
        this.estimatedReadyDate = estimatedReadyDate;
    }

    public LocalDateTime getEstimatedShipDate() {
        return estimatedShipDate;
    }

    public void setEstimatedShipDate(LocalDateTime estimatedShipDate) {
        this.estimatedShipDate = estimatedShipDate;
    }

    public String getEstimatedShipWorkEffId() {
        return estimatedShipWorkEffId;
    }

    public void setEstimatedShipWorkEffId(String estimatedShipWorkEffId) {
        this.estimatedShipWorkEffId = estimatedShipWorkEffId;
    }

    public LocalDateTime getEstimatedArrivalDate() {
        return estimatedArrivalDate;
    }

    public void setEstimatedArrivalDate(LocalDateTime estimatedArrivalDate) {
        this.estimatedArrivalDate = estimatedArrivalDate;
    }

    public String getEstimatedArrivalWorkEffId() {
        return estimatedArrivalWorkEffId;
    }

    public void setEstimatedArrivalWorkEffId(String estimatedArrivalWorkEffId) {
        this.estimatedArrivalWorkEffId = estimatedArrivalWorkEffId;
    }

    public LocalDateTime getLatestCancelDate() {
        return latestCancelDate;
    }

    public void setLatestCancelDate(LocalDateTime latestCancelDate) {
        this.latestCancelDate = latestCancelDate;
    }

    public BigDecimal getEstimatedShipCost() {
        return estimatedShipCost;
    }

    public void setEstimatedShipCost(BigDecimal estimatedShipCost) {
        this.estimatedShipCost = estimatedShipCost;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public String getHandlingInstructions() {
        return handlingInstructions;
    }

    public void setHandlingInstructions(String handlingInstructions) {
        this.handlingInstructions = handlingInstructions;
    }

    public String getOriginFacilityId() {
        return originFacilityId;
    }

    public void setOriginFacilityId(String originFacilityId) {
        this.originFacilityId = originFacilityId;
    }

    public String getDestinationFacilityId() {
        return destinationFacilityId;
    }

    public void setDestinationFacilityId(String destinationFacilityId) {
        this.destinationFacilityId = destinationFacilityId;
    }

    public String getOriginContactMechId() {
        return originContactMechId;
    }

    public void setOriginContactMechId(String originContactMechId) {
        this.originContactMechId = originContactMechId;
    }

    public String getOriginTelecomNumberId() {
        return originTelecomNumberId;
    }

    public void setOriginTelecomNumberId(String originTelecomNumberId) {
        this.originTelecomNumberId = originTelecomNumberId;
    }

    public String getDestinationContactMechId() {
        return destinationContactMechId;
    }

    public void setDestinationContactMechId(String destinationContactMechId) {
        this.destinationContactMechId = destinationContactMechId;
    }

    public String getDestinationTelecomNumberId() {
        return destinationTelecomNumberId;
    }

    public void setDestinationTelecomNumberId(String destinationTelecomNumberId) {
        this.destinationTelecomNumberId = destinationTelecomNumberId;
    }

    public String getPartyIdTo() {
        return partyIdTo;
    }

    public void setPartyIdTo(String partyIdTo) {
        this.partyIdTo = partyIdTo;
    }

    public String getPartyIdFrom() {
        return partyIdFrom;
    }

    public void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }

    public BigDecimal getAdditionalShippingCharge() {
        return additionalShippingCharge;
    }

    public void setAdditionalShippingCharge(BigDecimal additionalShippingCharge) {
        this.additionalShippingCharge = additionalShippingCharge;
    }

    public String getAddtlShippingChargeDesc() {
        return addtlShippingChargeDesc;
    }

    public void setAddtlShippingChargeDesc(String addtlShippingChargeDesc) {
        this.addtlShippingChargeDesc = addtlShippingChargeDesc;
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
        return "Shipment{" +
        "shipmentId=" + shipmentId +
        ", shipmentTypeId=" + shipmentTypeId +
        ", statusId=" + statusId +
        ", primaryOrderId=" + primaryOrderId +
        ", primaryReturnId=" + primaryReturnId +
        ", primaryShipGroupSeqId=" + primaryShipGroupSeqId +
        ", picklistBinId=" + picklistBinId +
        ", estimatedReadyDate=" + estimatedReadyDate +
        ", estimatedShipDate=" + estimatedShipDate +
        ", estimatedShipWorkEffId=" + estimatedShipWorkEffId +
        ", estimatedArrivalDate=" + estimatedArrivalDate +
        ", estimatedArrivalWorkEffId=" + estimatedArrivalWorkEffId +
        ", latestCancelDate=" + latestCancelDate +
        ", estimatedShipCost=" + estimatedShipCost +
        ", currencyUomId=" + currencyUomId +
        ", handlingInstructions=" + handlingInstructions +
        ", originFacilityId=" + originFacilityId +
        ", destinationFacilityId=" + destinationFacilityId +
        ", originContactMechId=" + originContactMechId +
        ", originTelecomNumberId=" + originTelecomNumberId +
        ", destinationContactMechId=" + destinationContactMechId +
        ", destinationTelecomNumberId=" + destinationTelecomNumberId +
        ", partyIdTo=" + partyIdTo +
        ", partyIdFrom=" + partyIdFrom +
        ", additionalShippingCharge=" + additionalShippingCharge +
        ", addtlShippingChargeDesc=" + addtlShippingChargeDesc +
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
