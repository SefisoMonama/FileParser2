package com.eviro.assesment.grad001.sefisomonama.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepository extends JpaRepository<AccountProfile, Integer>{
	
}


