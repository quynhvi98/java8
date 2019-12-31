package com.vn.Functional.impl;

import com.vn.Functional.Convert;

public class ConvertFromStringToFloat implements Convert<Float> {
    @Override
    public Float convert(Object o) {
        return Float.valueOf(String.valueOf(o));
    }
}
