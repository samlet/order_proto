package com.bluecc.bluesrv.common;

import java.util.Collection;

public interface IEnumeration<T extends IEnumeration<?>> {
    String getTypeId();
    String getParentType();
    String getDescription();
    Collection<T> childTypes();
}
