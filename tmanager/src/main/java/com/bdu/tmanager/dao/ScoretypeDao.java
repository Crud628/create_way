package com.bdu.tmanager.dao;

import com.bdu.tmanager.bean.Scoretype;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ScoretypeDao extends JpaRepository<Scoretype,String> ,JpaSpecificationExecutor<Scoretype> {
}
