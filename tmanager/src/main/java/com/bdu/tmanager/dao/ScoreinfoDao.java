package com.bdu.tmanager.dao;

import com.bdu.tmanager.bean.Scoreinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ScoreinfoDao extends JpaRepository<Scoreinfo,String> ,JpaSpecificationExecutor<Scoreinfo> {
}
