package dto;

public class Porder {
 private int orderno;
 private String sorderdate;
 private String dordername;
 private String orderphone;
 private String orderaddress;
 private int ordertotalpay;
 private String orderactive;
 private String orderrequest;
 private int orderdeliverno;
 private int mon; 
 public Porder() {
	// TODO Auto-generated constructor stub
}
public Porder(int orderno, String sorderdate, String dordername, String orderphone, String orderaddress,
		int ordertotalpay, String orderactive, String orderrequest, int orderdeliverno, int mon) {
	super();
	this.orderno = orderno;
	this.sorderdate = sorderdate;
	this.dordername = dordername;
	this.orderphone = orderphone;
	this.orderaddress = orderaddress;
	this.ordertotalpay = ordertotalpay;
	this.orderactive = orderactive;
	this.orderrequest = orderrequest;
	this.orderdeliverno = orderdeliverno;
	this.mon = mon;
}
public int getOrderno() {
	return orderno;
}

public void setOrderno(int orderno) {
	this.orderno = orderno;
}

public String getSorderdate() {
	return sorderdate;
}

public void setSorderdate(String sorderdate) {
	this.sorderdate = sorderdate;
}

public String getDordername() {
	return dordername;
}

public void setDordername(String dordername) {
	this.dordername = dordername;
}

public String getOrderphone() {
	return orderphone;
}

public void setOrderphone(String orderphone) {
	this.orderphone = orderphone;
}

public String getOrderaddress() {
	return orderaddress;
}

public void setOrderaddress(String orderaddress) {
	this.orderaddress = orderaddress;
}

public int getOrdertotalpay() {
	return ordertotalpay;
}

public void setOrdertotalpay(int ordertotalpay) {
	this.ordertotalpay = ordertotalpay;
}

public String getOrderactive() {
	return orderactive;
}

public void setOrderactive(String orderactive) {
	this.orderactive = orderactive;
}

public String getOrderrequest() {
	return orderrequest;
}

public void setOrderrequest(String orderrequest) {
	this.orderrequest = orderrequest;
}

public int getOrderdeliverno() {
	return orderdeliverno;
}

public void setOrderdeliverno(int orderdeliverno) {
	this.orderdeliverno = orderdeliverno;
}

public int getMon() {
	return mon;
}

public void setMon(int mon) {
	this.mon = mon;
}
 
}
