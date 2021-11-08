package com.bluecc.bluesrv.ecomm.order;

import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderElements {
    String orderId;
    Map<String, Collection<JsonObject>> values;
}

