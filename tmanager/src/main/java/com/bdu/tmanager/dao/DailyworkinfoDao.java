package com.bdu.tmanager.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.bdu.tmanager.bean.Dailyworkinfo;


public interface DailyworkinfoDao extends JpaRepository<Dailyworkinfo,String> ,JpaSpecificationExecutor<Dailyworkinfo> {
	

}
