package com.ihrm.company;

import com.ihrm.company.dao.CompanyDao;
import com.ihrm.domain.company.Company;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lan
 * @date 2021/4/10 - 17:03
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class CompamyDaoTest {
    @Autowired
    private CompanyDao companyDao;

    @Test
    public void test(){
        //save(company)  保存或更新
        //deleteById  根据id删除
        //findById(id) 根据id查询
        //findByAll    查询全部
        Company company = companyDao.findById("1").get();
        System.out.println(company);
    }
}
