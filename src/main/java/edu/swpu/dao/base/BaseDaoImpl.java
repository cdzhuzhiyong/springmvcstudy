package edu.swpu.dao.base;

import java.util.List;

public abstract class BaseDaoImpl<T> extends MyBatisSupport implements BaseDao<T> {
    private static final String DEFAULT_INSERT_BY_KEY = "insertEntry";
    private static final String DEFAULT_UPDATE_BY_KEY = "updateEntry";
    private static final String DEFAULT_DELETE_BY_KEY = "deleteEntry";
    private static final String DEFAULT_SELECT_CONDTION = "selectEntryList";
    private static final String DEFAULT_SELECT_CONDITIONCOUNT = "selectEntryListCount";

    public abstract String getNameSpace(String statement);

    @Override
    public List<T> selectEntryList(T condition) throws Exception {
        return this.selectList(getNameSpace(DEFAULT_SELECT_CONDTION),condition);
    }

    @Override
    public Integer selectEntryListCount(T condition) throws Exception {
        return this.select(getNameSpace(DEFAULT_SELECT_CONDITIONCOUNT),condition);
    }

    @Override
    public Integer insertEntry(T ... conditions) throws Exception {
        int result = 0;
        if (conditions == null || conditions.length<=0){
            return result;
        }
        for (T t:conditions) {
            result += this.insert(getNameSpace(DEFAULT_INSERT_BY_KEY),t);
        }
        return result;
    }

    @Override
    public Integer updateEntry(T... conditions) throws Exception {
        int result = 0;
        if (conditions == null || conditions.length<=0){
            return result;
        }
        for (T t:conditions) {
            result += this.update(getNameSpace(DEFAULT_UPDATE_BY_KEY),t);
        }
        return result;
    }

    @Override
    public Integer deleteEntry(T... conditions) throws Exception {
        int result = 0;
        if (conditions == null || conditions.length<=0){
            return result;
        }
        for (T t:conditions) {
            result += this.delete(getNameSpace(DEFAULT_DELETE_BY_KEY),t);
        }
        return result;
    }
}
