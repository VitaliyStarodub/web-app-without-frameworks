package com.starodub.dao;

public interface CategoryDao<T, ID> extends GenericDao<T, ID> {

    T findByIdJoinProduct(ID id);

}
