package edu.swpu.dao.base;

import org.mybatis.spring.SqlSessionTemplate;

import javax.annotation.Resource;

public abstract class MyBatisSupport {
    @Resource
    private SqlSessionTemplate sqlTemplate;

    public SqlSessionTemplate getSqlSessionTemplate(){
        return sqlTemplate;
    }

    protected  <T> T select(String statement,Object param) throws Exception {
        T obj = null;
        try{
            obj = (T) getSqlSessionTemplate().selectOne(statement,param);
        }catch (Exception e){
            throw new Exception("Mybatis执行单条查询异常");
        }
        return obj;
    }

    protected <T> T selectList(String statement,Object param) throws Exception{
        T obj = null;
        try{
            obj = (T) getSqlSessionTemplate().selectList(statement,param);
        }catch (Exception e){
            throw new Exception("Mybatis执行列表查询异常");
        }
        return obj;
    }

    protected int delete(String statement,Object param) throws Exception{
        int flag = 0;
        try{
            flag = getSqlSessionTemplate().delete(statement,param);
        }catch (Exception e){
            throw new Exception("Mybatis执行删除异常");
        }
        return flag;
    }

    protected int insert(String statement,Object param) throws Exception{
        int flag = 0;
        try{
            flag = getSqlSessionTemplate().insert(statement,param);
        }catch (Exception e){
            throw new Exception("Mybatis执行插入异常");
        }
        return flag;
    }

    protected int update(String statement,Object param) throws Exception{
        int flag = 0;
        try{
            flag = getSqlSessionTemplate().update(statement,param);
        }catch (Exception e){
            throw new Exception("Mybatis执行更新异常");
        }
        return flag;
    }
}
