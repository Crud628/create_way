package com.bdu.tmanager.dao;

import com.bdu.tmanager.bean.Classlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ClasslistDao extends JpaRepository<Classlist,String> ,JpaSpecificationExecutor<Classlist> {
}
