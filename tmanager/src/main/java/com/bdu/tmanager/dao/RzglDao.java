package com.bdu.tmanager.dao;

import com.bdu.tmanager.bean.Rzgl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface RzglDao extends JpaRepository<Rzgl,String> ,JpaSpecificationExecutor<Rzgl> {
}
