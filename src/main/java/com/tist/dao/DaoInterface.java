package com.tist.dao;

import com.tist.domain.City;

import java.util.List;

/**
 * 泛型dao定義
 *
 * @param <T>
 * @author sungyeh
 */
public interface DaoInterface<T> {
    List<T> findAll();

    T findById(int id);

    T insert(T t);

    T update(T t);

    void delete(T t);
}
