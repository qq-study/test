package com.zte.entity;

import java.util.Date;
/**
 * 订单的实体类
 * @author Administrator
 *
 */
public class Order {
	private Integer oid;
	private Integer uid;
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Date getRsd() {
		return rsd;
	}
	public void setRsd(Date rsd) {
		this.rsd = rsd;
	}
	public Date getRed() {
		return red;
	}
	public void setRed(Date red) {
		this.red = red;
	}
	public Date getOtime() {
		return otime;
	}
	public void setOtime(Date otime) {
		this.otime = otime;
	}
	public Float getDiscount() {
		return discount;
	}
	public void setDiscount(Float discount) {
		this.discount = discount;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	private Integer cid;
	private Date rsd;
	private Date red;
	private Date otime;
	private Float discount;
	private Float total;
}
