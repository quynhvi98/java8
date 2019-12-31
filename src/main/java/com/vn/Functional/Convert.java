package com.vn.Functional;
@FunctionalInterface
public interface Convert<T> {
    T convert(Object o);
}
