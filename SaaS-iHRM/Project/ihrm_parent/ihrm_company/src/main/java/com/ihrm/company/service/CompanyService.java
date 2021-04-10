package com.ihrm.company.service;

import com.ihrm.common.utils.IdWorker;
import com.ihrm.company.dao.CompanyDao;
import com.ihrm.domain.company.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lan
 * @date 2021/4/10 - 17:26
 */
@Service
public class CompanyService {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private IdWorker idWorker;
    /**
     * 保存企业
     * 1.配置idwork到工程
     * 2.在servicez中注入idworker
     * 3.通过idworker生成id
     * 4.保存企业
     * @param company
     */
    public void add(Company company){
        //基本属性设置
        String id = idWorker.nextId()+"";
        company.setId(id);
        //默认的状态
        company.setAuditState("0");//0.未审核  1.已审核
        company.setState(1);//1.已激活  0.未激活
        companyDao.save(company);
    }

    /**
     * 更新企业
     * 1.参数 ：company
     * 2.根据id查询企业对象
     * 3.设置修改的属性
     * 4.调用dao完成更新
     * @param company
     */
    public void update(Company company){
        Company temp = companyDao.findById(company.getId()).get();
        temp.setName(company.getName());
        temp.setCompanyPhone(company.getCompanyPhone());
        companyDao.save(company);
    }

    /**
     * 根据id查询企业
     * @param id
     * @return
     */
    public Company findById(String id){
        return companyDao.findById(id).get();
    }

    /**
     * 根据id删除企业
     * @param id
     */
    public void deleteById(String id){
        companyDao.deleteById(id);
    }

    /**
     * 查询企业列表
     * @return
     */
    public List<Company> findAll(){
        return companyDao.findAll();
    }
}
