package com.bluecc.bluesrv.ecomm.meta;

import com.google.gson.Gson;
import lombok.Data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import static com.bluecc.bluesrv.common.Helper.pretty;

public class MetaReader {
    @Data
    public static class FieldMeta{
        String name;
        String type;
        String col;
        boolean pk;
        boolean notNull;
        boolean encrypt;
        boolean autoCreatedInternal;
        List<String> validators;
    }

    @Data
    public static class RelationMeta{
        String name;
        String type;
        String relEntityName;
        String fkName;
        boolean autoRelation;
        List<KeymapMeta> keymaps;
    }

    @Data
    public static class KeymapMeta{
        String fieldName;
        String relFieldName;
    }
    @Data
    public static class EntityMeta{
        String name;
        List<FieldMeta> fields;
        List<RelationMeta> relations;

        int pksSize;
        List<String> pks;
        boolean isView;
    }

    static Gson gson=new Gson();
    public static void main(String[] args) throws FileNotFoundException {
        EntityMeta entityMeta=gson.fromJson(new FileReader("asset/meta/orderheader.json"), EntityMeta.class);
        pretty(entityMeta);

        System.out.println(entityMeta.getPks());
    }
}
