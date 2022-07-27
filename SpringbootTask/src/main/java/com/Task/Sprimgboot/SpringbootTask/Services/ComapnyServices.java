package com.Task.Sprimgboot.SpringbootTask.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Task.Sprimgboot.SpringbootTask.Entity.Company;
import com.Task.Sprimgboot.SpringbootTask.Repositary.CompanyRepositary;
@Service
public class ComapnyServices implements CompanySerint {
	@Autowired
	CompanyRepositary cr;

	@Override
	public Company createCompany(Company comp) {
		
		return cr.save(comp);
	}

	@Override
	public List<Company> GetAllDetils() {
		return cr.findAll();
	}

	@Override
	public Company getDetailsbyId(int ipaddress) {
		Optional<Company> com=this.cr.findById(ipaddress);
		if(com.isPresent()) {
			
			return com.get();
		}
		else {
			return null;
			
		}
	}


}
