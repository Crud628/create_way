package com.bdu.tmanager.dao;

import com.bdu.tmanager.bean.Autothinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AutothinfoDao extends JpaRepository<Autothinfo,String> ,JpaSpecificationExecutor<Autothinfo> {
}
