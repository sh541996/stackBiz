package com.stackMyBiz.registeration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.stackMyBiz.registeration.model.RegisterDao;

@Repository
public interface RegisterationRepository extends JpaRepository<RegisterDao, Long> {

	RegisterDao findByUserName(String userName);
}
