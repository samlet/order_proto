package com.bluecc.bluesrv.ecomm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bluecc.bluesrv.common.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
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
 * @since 2021-11-04
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("postal_address")
@ApiModel(value = "PostalAddressEntity对象", description = "")
public class PostalAddressEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "contact_mech_id", type = IdType.ASSIGN_ID)
    private String contactMechId;

    private String toName;

    private String attnName;

    private String address1;

    private String address2;

    private BigDecimal houseNumber;

    private String houseNumberExt;

    private String directions;

    private String city;

    private String cityGeoId;

    private String postalCode;

    private String postalCodeExt;

    private String countryGeoId;

    private String stateProvinceGeoId;

    private String countyGeoId;

    private String municipalityGeoId;

    private String postalCodeGeoId;

    private String geoPointId;


}
