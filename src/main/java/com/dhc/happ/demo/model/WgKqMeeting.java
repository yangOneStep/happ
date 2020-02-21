package com.dhc.happ.demo.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "WG_KQ_MEETING")
public class WgKqMeeting {
    @Column(name = "PID")
    private String pid;

    @Column(name = "USERID")
    private String userid;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "BEGINTIME")
    private Date begintime;

    @Column(name = "ENDTIME")
    private Date endtime;

    @Column(name = "DAYS")
    private BigDecimal days;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "ORGANIZER")
    private String organizer;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "REASON")
    private String reason;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "FLOWSTATUS")
    private String flowstatus;

    @Column(name = "CREATER")
    private String creater;

    @Column(name = "CREATETIME")
    private Date createtime;

    @Column(name = "LASTMODIFIER")
    private String lastmodifier;

    @Column(name = "LASTMODIFYTIME")
    private Date lastmodifytime;

    @Column(name = "BASESN")
    private String basesn;

    @Column(name = "DEPNAME")
    private String depname;

    @Column(name = "GROUPNAME")
    private String groupname;

    /**
     * @return PID
     */
    public String getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * @return USERID
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * @return USERNAME
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return BEGINTIME
     */
    public Date getBegintime() {
        return begintime;
    }

    /**
     * @param begintime
     */
    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    /**
     * @return ENDTIME
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * @param endtime
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * @return DAYS
     */
    public BigDecimal getDays() {
        return days;
    }

    /**
     * @param days
     */
    public void setDays(BigDecimal days) {
        this.days = days;
    }

    /**
     * @return TYPE
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return ORGANIZER
     */
    public String getOrganizer() {
        return organizer;
    }

    /**
     * @param organizer
     */
    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    /**
     * @return ADDRESS
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return REASON
     */
    public String getReason() {
        return reason;
    }

    /**
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return STATUS
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return FLOWSTATUS
     */
    public String getFlowstatus() {
        return flowstatus;
    }

    /**
     * @param flowstatus
     */
    public void setFlowstatus(String flowstatus) {
        this.flowstatus = flowstatus;
    }

    /**
     * @return CREATER
     */
    public String getCreater() {
        return creater;
    }

    /**
     * @param creater
     */
    public void setCreater(String creater) {
        this.creater = creater;
    }

    /**
     * @return CREATETIME
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return LASTMODIFIER
     */
    public String getLastmodifier() {
        return lastmodifier;
    }

    /**
     * @param lastmodifier
     */
    public void setLastmodifier(String lastmodifier) {
        this.lastmodifier = lastmodifier;
    }

    /**
     * @return LASTMODIFYTIME
     */
    public Date getLastmodifytime() {
        return lastmodifytime;
    }

    /**
     * @param lastmodifytime
     */
    public void setLastmodifytime(Date lastmodifytime) {
        this.lastmodifytime = lastmodifytime;
    }

    /**
     * @return BASESN
     */
    public String getBasesn() {
        return basesn;
    }

    /**
     * @param basesn
     */
    public void setBasesn(String basesn) {
        this.basesn = basesn;
    }

    /**
     * @return DEPNAME
     */
    public String getDepname() {
        return depname;
    }

    /**
     * @param depname
     */
    public void setDepname(String depname) {
        this.depname = depname;
    }

    /**
     * @return GROUPNAME
     */
    public String getGroupname() {
        return groupname;
    }

    /**
     * @param groupname
     */
    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }
}