package com.itcast.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Feng on 2017/2/11.
 */
public class Customer {

    private Long custID;//客户编号(主键)
    private String custName;//客户名称(公司名称
    private String custSource;//客户信息来源
    private String custIndustry;//客户所属行业
    private String custLevel;//客户级别
    private String custPhone;//固定电话
    private String custMobile;//移动电话
    private Set<LinkMan> linkmens =new HashSet<>();


    public Set<LinkMan> getLinkmens() {
        return linkmens;
    }

    public void setLinkmens(Set<LinkMan> linkmen) {
        this.linkmens = linkmen;
    }

    public Customer() {
    }

    public Customer(String custName, String custSource) {
        this.custName = custName;
        this.custSource = custSource;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "custID=" + custID +
                ", custName='" + custName + '\'' +
                ", custSource='" + custSource + '\'' +
                ", custIndustry='" + custIndustry + '\'' +
                ", custLevel='" + custLevel + '\'' +
                ", custPhone='" + custPhone + '\'' +
                ", custMobile='" + custMobile + '\'' +
                ", linkmen=" + linkmens +
                '}';
    }

    public Long getCustID() {
        return custID;
    }

    public void setCustID(Long custID) {
        this.custID = custID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustMobile() {
        return custMobile;
    }

    public void setCustMobile(String custMobile) {
        this.custMobile = custMobile;
    }
}
