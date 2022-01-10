package com.example.tubespbol_finance.Util;

import java.util.List;

public interface DaoServicce <T>{

    int addData(T object);
    int deleteData(T object);
    int updateData(T object);
    List<T> fetchall();

}
