package com.bdu.tmanager.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author lan
 * @date 2021/4/21 - 21:51
 */

@Entity
@Table(name = "test")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Test {
    @Id
    @GeneratedValue
    private String id;
    private String name;
    private String pass;

}
