package com.bluecc.bluesrv.ecomm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bluecc.bluesrv.common.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author samlet
 * @since 2021-11-05
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("person")
@ApiModel(value = "PersonEntity对象", description = "")
public class PersonEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "party_id", type = IdType.ASSIGN_ID)
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


}
