package com.zet.repository;

public interface Specification <T> {
    boolean isExist(T t);
}
