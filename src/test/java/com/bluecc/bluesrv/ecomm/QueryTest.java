package com.bluecc.bluesrv.ecomm;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bluecc.bluesrv.ecomm.entity.PersonEntity;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class QueryTest {
    <T> QueryWrapper<T> convertQueryWrapper(PageQueryData queryData) {
        QueryWrapper<T> wrapper = new QueryWrapper<T>();
        queryData.getConditions().forEach(c -> {
            switch (c.getOp()){
                case "eq": wrapper.eq(c.getColumn(), c.getVal()); break;
                case "ne": wrapper.ne(c.getColumn(), c.getVal()); break;
                case "gt": wrapper.gt(c.getColumn(), c.getVal()); break;
                case "lt": wrapper.lt(c.getColumn(), c.getVal()); break;
                default:
                    // skip
                    log.warn("ignore condition {}", c.getOp());
            }
        });
        return wrapper;
    }

    @Test
    void testQueryWrapper(){
        QueryWrapper<PersonEntity> wrapper = new QueryWrapper<>();
        wrapper.eq("firstName", "samlet");
    }
}

