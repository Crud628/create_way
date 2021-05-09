package com.bdu.tmanager.dao;

import com.bdu.tmanager.bean.Dailyworktype;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DailyworktypeDao extends JpaRepository<Dailyworktype,String> ,JpaSpecificationExecutor<Dailyworktype> {
}
