package com.bdu.tmanager.dao;

import com.bdu.tmanager.bean.Dailyworkinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DailyworkinfoDao extends JpaRepository<Dailyworkinfo,String> ,JpaSpecificationExecutor<Dailyworkinfo> {
}
