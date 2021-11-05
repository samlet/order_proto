package com.bluecc.bluesrv.ofbiz.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
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
@ApiModel(value = "Person对象", description = "")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    private String partyId;

    private String salutation;

    private String firstName;

    private String middleName;

    private String lastName;

    private String personalTitle;

    private String suffix;

    private String nickname;

    private String firstNameLocal;

    private String middleNameLocal;

    private String lastNameLocal;

    private String otherLocal;

    private String memberId;

    private String gender;

    private LocalDate birthDate;

    private LocalDate deceasedDate;

    private Double height;

    private Double weight;

    private String mothersMaidenName;

    private String maritalStatus;

    private String socialSecurityNumber;

    private String passportNumber;

    private LocalDate passportExpireDate;

    private Double totalYearsWorkExperience;

    private String comments;

    private String employmentStatusEnumId;

    private String residenceStatusEnumId;

    private String occupation;

    private BigDecimal yearsWithEmployer;

    private BigDecimal monthsWithEmployer;

    private String existingCustomer;

    private String cardId;

    private LocalDateTime lastUpdatedStamp;

    private LocalDateTime lastUpdatedTxStamp;

    private LocalDateTime createdStamp;

    private LocalDateTime createdTxStamp;


    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonalTitle() {
        return personalTitle;
    }

    public void setPersonalTitle(String personalTitle) {
        this.personalTitle = personalTitle;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFirstNameLocal() {
        return firstNameLocal;
    }

    public void setFirstNameLocal(String firstNameLocal) {
        this.firstNameLocal = firstNameLocal;
    }

    public String getMiddleNameLocal() {
        return middleNameLocal;
    }

    public void setMiddleNameLocal(String middleNameLocal) {
        this.middleNameLocal = middleNameLocal;
    }

    public String getLastNameLocal() {
        return lastNameLocal;
    }

    public void setLastNameLocal(String lastNameLocal) {
        this.lastNameLocal = lastNameLocal;
    }

    public String getOtherLocal() {
        return otherLocal;
    }

    public void setOtherLocal(String otherLocal) {
        this.otherLocal = otherLocal;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getDeceasedDate() {
        return deceasedDate;
    }

    public void setDeceasedDate(LocalDate deceasedDate) {
        this.deceasedDate = deceasedDate;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getMothersMaidenName() {
        return mothersMaidenName;
    }

    public void setMothersMaidenName(String mothersMaidenName) {
        this.mothersMaidenName = mothersMaidenName;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getPassportExpireDate() {
        return passportExpireDate;
    }

    public void setPassportExpireDate(LocalDate passportExpireDate) {
        this.passportExpireDate = passportExpireDate;
    }

    public Double getTotalYearsWorkExperience() {
        return totalYearsWorkExperience;
    }

    public void setTotalYearsWorkExperience(Double totalYearsWorkExperience) {
        this.totalYearsWorkExperience = totalYearsWorkExperience;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getEmploymentStatusEnumId() {
        return employmentStatusEnumId;
    }

    public void setEmploymentStatusEnumId(String employmentStatusEnumId) {
        this.employmentStatusEnumId = employmentStatusEnumId;
    }

    public String getResidenceStatusEnumId() {
        return residenceStatusEnumId;
    }

    public void setResidenceStatusEnumId(String residenceStatusEnumId) {
        this.residenceStatusEnumId = residenceStatusEnumId;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public BigDecimal getYearsWithEmployer() {
        return yearsWithEmployer;
    }

    public void setYearsWithEmployer(BigDecimal yearsWithEmployer) {
        this.yearsWithEmployer = yearsWithEmployer;
    }

    public BigDecimal getMonthsWithEmployer() {
        return monthsWithEmployer;
    }

    public void setMonthsWithEmployer(BigDecimal monthsWithEmployer) {
        this.monthsWithEmployer = monthsWithEmployer;
    }

    public String getExistingCustomer() {
        return existingCustomer;
    }

    public void setExistingCustomer(String existingCustomer) {
        this.existingCustomer = existingCustomer;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
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
        return "Person{" +
        "partyId=" + partyId +
        ", salutation=" + salutation +
        ", firstName=" + firstName +
        ", middleName=" + middleName +
        ", lastName=" + lastName +
        ", personalTitle=" + personalTitle +
        ", suffix=" + suffix +
        ", nickname=" + nickname +
        ", firstNameLocal=" + firstNameLocal +
        ", middleNameLocal=" + middleNameLocal +
        ", lastNameLocal=" + lastNameLocal +
        ", otherLocal=" + otherLocal +
        ", memberId=" + memberId +
        ", gender=" + gender +
        ", birthDate=" + birthDate +
        ", deceasedDate=" + deceasedDate +
        ", height=" + height +
        ", weight=" + weight +
        ", mothersMaidenName=" + mothersMaidenName +
        ", maritalStatus=" + maritalStatus +
        ", socialSecurityNumber=" + socialSecurityNumber +
        ", passportNumber=" + passportNumber +
        ", passportExpireDate=" + passportExpireDate +
        ", totalYearsWorkExperience=" + totalYearsWorkExperience +
        ", comments=" + comments +
        ", employmentStatusEnumId=" + employmentStatusEnumId +
        ", residenceStatusEnumId=" + residenceStatusEnumId +
        ", occupation=" + occupation +
        ", yearsWithEmployer=" + yearsWithEmployer +
        ", monthsWithEmployer=" + monthsWithEmployer +
        ", existingCustomer=" + existingCustomer +
        ", cardId=" + cardId +
        ", lastUpdatedStamp=" + lastUpdatedStamp +
        ", lastUpdatedTxStamp=" + lastUpdatedTxStamp +
        ", createdStamp=" + createdStamp +
        ", createdTxStamp=" + createdTxStamp +
        "}";
    }
}
