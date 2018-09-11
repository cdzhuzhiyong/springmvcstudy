package edu.swpu.service.base;

import java.util.List;

public interface BaseService<T> {
    List<T> selectEntryList(T condition) throws Exception;
    Integer selectEntryListCount(T condition) throws Exception;
    Integer insertEntry(T... conditions) throws Exception;
    Integer updateEntry(T... conditions) throws Exception;
    Integer deleteEntry(T... conditions) throws Exception;
}
