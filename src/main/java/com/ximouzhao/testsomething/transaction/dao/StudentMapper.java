package com.ximouzhao.testsomething.transaction.dao;

import com.ximouzhao.testsomething.transaction.model.StudentModel;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentModel record);

    int insertSelective(StudentModel record);

    StudentModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentModel record);

    int updateByPrimaryKey(StudentModel record);
}