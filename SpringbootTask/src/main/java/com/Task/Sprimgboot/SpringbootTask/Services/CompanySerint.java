package com.Task.Sprimgboot.SpringbootTask.Services;

import java.util.List;

import com.Task.Sprimgboot.SpringbootTask.Entity.Company;

public interface CompanySerint {
	Company  createCompany(Company comp);
	List<Company> GetAllDetils();
	Company getDetailsbyId(int ipaddress);

}
