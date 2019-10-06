package com.ximouzhao.testsomething.transaction.dao;

import com.ximouzhao.testsomething.transaction.model.ScoreModel;

public interface ScoreMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ScoreModel record);

    int insertSelective(ScoreModel record);

    ScoreModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ScoreModel record);

    int updateByPrimaryKey(ScoreModel record);
}