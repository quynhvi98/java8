package com.vnext.lambdaexpression;

/**
 * Posted from Nov 12, 2018, 1:54 PM
 *
 * @Author quynhntv (vi.quynh.31598@gmail.com)
 **/

@FunctionalInterface
public interface Convert<T> {
    Integer get(T o, T o1);
    default Integer get(T o1) {
        return null;
    }
    //Một Functional Interface có thể có các phương thức của lớp java.lang.Object.
//    int hashCode();
//
//    String toString();
//
//    boolean equals(Object obj);
}
