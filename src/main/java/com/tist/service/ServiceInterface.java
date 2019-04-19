package com.tist.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 泛型ineterface定義
 *
 *
 */
@Service
public interface ServiceInterface<T> {

    public List<T>  findAll();

    public T findById(int id);

    public T findIdByName();



}

