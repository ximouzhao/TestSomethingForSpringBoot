package com.ximouzhao.testsomething.jpa.repository;

import com.ximouzhao.testsomething.jpa.model.JpaUserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<JpaUserModel,Integer> {
}
