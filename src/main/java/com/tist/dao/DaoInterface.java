package com.tist.dao;

import java.util.List;

/**
 * 泛型dao定義
 *
 * @param <T>
 * @author sungyeh
 */
public interface DaoInterface<T> {
    List<T> findAll();

    List<T> findById(int id);
}
