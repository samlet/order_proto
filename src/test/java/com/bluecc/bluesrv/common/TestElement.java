package com.bluecc.bluesrv.common;

import java.util.HashMap;
import java.util.Map;

public enum TestElement {
    H("Hydrogen", 1, 1.008f),
    HE("Helium", 2, 4.0026f),
    // ...
    NE("Neon", 10, 20.180f);

    private static final Map<String, TestElement> BY_LABEL = new HashMap<>();
    private static final Map<Integer, TestElement> BY_ATOMIC_NUMBER = new HashMap<>();
    private static final Map<Float, TestElement> BY_ATOMIC_WEIGHT = new HashMap<>();

    static {
        for (TestElement e : values()) {
            BY_LABEL.put(e.label, e);
            BY_ATOMIC_NUMBER.put(e.atomicNumber, e);
            BY_ATOMIC_WEIGHT.put(e.atomicWeight, e);
        }
    }

    public final String label;
    public final int atomicNumber;
    public final float atomicWeight;

    private TestElement(String label, int atomicNumber, float atomicWeight) {
        this.label = label;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    public static TestElement valueOfLabel(String label) {
        return BY_LABEL.get(label);
    }

    public static TestElement valueOfAtomicNumber(int number) {
        return BY_ATOMIC_NUMBER.get(number);
    }

    public static TestElement valueOfAtomicWeight(float weight) {
        return BY_ATOMIC_WEIGHT.get(weight);
    }
}