package edu.swpu.dao.base;

import java.util.List;

public interface BaseDao<T> {
    List<T> selectEntryList(T condition) throws Exception;
    Integer selectEntryListCount(T condition) throws Exception;
    Integer insertEntry(T... condition) throws Exception;
    Integer updateEntry(T... conditions) throws Exception;
    Integer deleteEntry(T... conditions) throws Exception;
}
