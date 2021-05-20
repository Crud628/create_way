package com.bdu.tmanager.dao;

import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.bdu.tmanager.bean.Dailyworkinfo;


public interface DailyworkinfoDao extends JpaRepository<Dailyworkinfo,String> ,JpaSpecificationExecutor<Dailyworkinfo> {

	Page findPage(PageRequest of);

}
