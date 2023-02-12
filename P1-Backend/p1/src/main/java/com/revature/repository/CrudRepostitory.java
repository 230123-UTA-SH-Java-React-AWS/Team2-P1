package com.revature.repository;

import java.util.List;

public interface CrudRepostitory<T> {

    List<T> findAll();
    
}
