package com.vnext.Functional;
@FunctionalInterface
public interface Convert<T> {
    T convert(Object o);
}
