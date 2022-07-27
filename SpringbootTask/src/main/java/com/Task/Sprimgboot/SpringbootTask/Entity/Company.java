package com.Task.Sprimgboot.SpringbootTask.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

@Entity

@Table
public class Company {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ipaddress;
	
	private String Servernmme;
	private String Status;

	
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public int getIpaddress() {
		return ipaddress;
	}
	public void setIpaddress(int ipaddress) {
		this.ipaddress = ipaddress;
	}
	
	public String getServernmme() {
		return Servernmme;
	}
	public void setServernmme(String servernmme) {
		Servernmme = servernmme;
	}
	@Autowired
	
	public Company(int ipaddress, String servernmme,String Status) {
		super();
		this.ipaddress = ipaddress;
		
		Servernmme = servernmme;
	}
	
	public Company() {
		
	}
	@Override
	public String toString() {
		return "Company [ipaddress=" + ipaddress + ", Servernmme=" + Servernmme + ", Status="
				+ Status + ",  ]";
	}
	

}
