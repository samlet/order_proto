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
 * @since 2021-11-06
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("acctg_trans_entry")
@ApiModel(value = "AcctgTransEntryEntity对象", description = "")
public class AcctgTransEntryEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String acctgTransId;

    private String acctgTransEntrySeqId;

    private String acctgTransEntryTypeId;

    private String description;

    private String voucherRef;

    private String partyId;

    private String roleTypeId;

    private String theirPartyId;

    private String productId;

    private String theirProductId;

    private String inventoryItemId;

    private String glAccountTypeId;

    private String glAccountId;

    private String organizationPartyId;

    private BigDecimal amount;

    private String currencyUomId;

    private BigDecimal origAmount;

    private String origCurrencyUomId;

    private String debitCreditFlag;

    private LocalDate dueDate;

    private String groupId;

    private String taxId;

    private String reconcileStatusId;

    private String settlementTermId;

    private String isSummary;


}
