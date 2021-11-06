package com.bluecc.bluesrv.ecomm.domain;

import lombok.Data;
import lombok.experimental.Accessors;

public class InventoryDomain {
    // InventoryItemAndDetail
    @Data
    @Accessors(chain = true)
    public static class Inventory{
        String facilityId;
        String locationSeqId; // TLTLTLLL01
        String inventoryItemId;
        String inventoryItemTypeId;
        // ...
    }
}
