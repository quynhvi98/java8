package com.vnext.Functional.impl;

import com.vnext.Functional.Convert;

public class ConvertFromStringToFloat implements Convert<Float> {
    @Override
    public Float convert(Object o) {
        return Float.valueOf(String.valueOf(o));
    }
}
