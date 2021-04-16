package com.ihrm.common.service;

import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class BaseService<T> {

    /**
     * 用户构造查询条件
     * root:包含了所有的对象数据
     * cq：一般不用
     * cb:构造查询条件
     * @param companyId
     * @return
     */
    protected Specification<T> getSpec(String companyId) {
        Specification<T> spect = new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder cb) {
                //根据企业id查询
                return cb.equal(root.get("companyId").as(String.class),companyId);
            }
        };
        return spect;
    }
}
