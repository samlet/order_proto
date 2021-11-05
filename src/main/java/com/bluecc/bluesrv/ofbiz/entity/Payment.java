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
@ApiModel(value = "Payment对象", description = "")
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    private String paymentId;

    private String paymentTypeId;

    private String paymentMethodTypeId;

    private String paymentMethodId;

    private String paymentGatewayResponseId;

    private String paymentPreferenceId;

    private String partyIdFrom;

    private String partyIdTo;

    private String roleTypeIdTo;

    private String statusId;

    private LocalDateTime effectiveDate;

    private String paymentRefNum;

    private BigDecimal amount;

    private String currencyUomId;

    private String comments;

    private String finAccountTransId;

    private String overrideGlAccountId;

    private BigDecimal actualCurrencyAmount;

    private String actualCurrencyUomId;

    private LocalDateTime lastUpdatedStamp;

    private LocalDateTime lastUpdatedTxStamp;

    private LocalDateTime createdStamp;

    private LocalDateTime createdTxStamp;


    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(String paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public String getPaymentMethodTypeId() {
        return paymentMethodTypeId;
    }

    public void setPaymentMethodTypeId(String paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getPaymentGatewayResponseId() {
        return paymentGatewayResponseId;
    }

    public void setPaymentGatewayResponseId(String paymentGatewayResponseId) {
        this.paymentGatewayResponseId = paymentGatewayResponseId;
    }

    public String getPaymentPreferenceId() {
        return paymentPreferenceId;
    }

    public void setPaymentPreferenceId(String paymentPreferenceId) {
        this.paymentPreferenceId = paymentPreferenceId;
    }

    public String getPartyIdFrom() {
        return partyIdFrom;
    }

    public void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }

    public String getPartyIdTo() {
        return partyIdTo;
    }

    public void setPartyIdTo(String partyIdTo) {
        this.partyIdTo = partyIdTo;
    }

    public String getRoleTypeIdTo() {
        return roleTypeIdTo;
    }

    public void setRoleTypeIdTo(String roleTypeIdTo) {
        this.roleTypeIdTo = roleTypeIdTo;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public LocalDateTime getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getPaymentRefNum() {
        return paymentRefNum;
    }

    public void setPaymentRefNum(String paymentRefNum) {
        this.paymentRefNum = paymentRefNum;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getFinAccountTransId() {
        return finAccountTransId;
    }

    public void setFinAccountTransId(String finAccountTransId) {
        this.finAccountTransId = finAccountTransId;
    }

    public String getOverrideGlAccountId() {
        return overrideGlAccountId;
    }

    public void setOverrideGlAccountId(String overrideGlAccountId) {
        this.overrideGlAccountId = overrideGlAccountId;
    }

    public BigDecimal getActualCurrencyAmount() {
        return actualCurrencyAmount;
    }

    public void setActualCurrencyAmount(BigDecimal actualCurrencyAmount) {
        this.actualCurrencyAmount = actualCurrencyAmount;
    }

    public String getActualCurrencyUomId() {
        return actualCurrencyUomId;
    }

    public void setActualCurrencyUomId(String actualCurrencyUomId) {
        this.actualCurrencyUomId = actualCurrencyUomId;
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
        return "Payment{" +
        "paymentId=" + paymentId +
        ", paymentTypeId=" + paymentTypeId +
        ", paymentMethodTypeId=" + paymentMethodTypeId +
        ", paymentMethodId=" + paymentMethodId +
        ", paymentGatewayResponseId=" + paymentGatewayResponseId +
        ", paymentPreferenceId=" + paymentPreferenceId +
        ", partyIdFrom=" + partyIdFrom +
        ", partyIdTo=" + partyIdTo +
        ", roleTypeIdTo=" + roleTypeIdTo +
        ", statusId=" + statusId +
        ", effectiveDate=" + effectiveDate +
        ", paymentRefNum=" + paymentRefNum +
        ", amount=" + amount +
        ", currencyUomId=" + currencyUomId +
        ", comments=" + comments +
        ", finAccountTransId=" + finAccountTransId +
        ", overrideGlAccountId=" + overrideGlAccountId +
        ", actualCurrencyAmount=" + actualCurrencyAmount +
        ", actualCurrencyUomId=" + actualCurrencyUomId +
        ", lastUpdatedStamp=" + lastUpdatedStamp +
        ", lastUpdatedTxStamp=" + lastUpdatedTxStamp +
        ", createdStamp=" + createdStamp +
        ", createdTxStamp=" + createdTxStamp +
        "}";
    }
}
