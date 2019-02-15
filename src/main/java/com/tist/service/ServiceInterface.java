package com.tist.service;

import java.util.List;

/**
 * 泛型service定義
 *
 * @param <T>
 * @author sungyeh
 */
public interface ServiceInterface<T> {
    List<T> findAll();

    List<T> findById(int id);
}
