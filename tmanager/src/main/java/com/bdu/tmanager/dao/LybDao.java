package com.bdu.tmanager.dao;

import com.bdu.tmanager.bean.Lyb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface LybDao extends JpaRepository<Lyb,String> ,JpaSpecificationExecutor<Lyb> {
}
