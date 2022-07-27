package com.Task.Sprimgboot.SpringbootTask.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Task.Sprimgboot.SpringbootTask.Entity.Company;
import com.Task.Sprimgboot.SpringbootTask.Services.ComapnyServices;

@RestController
public class CompanyController {
	
	@Autowired
	private ComapnyServices cs;
	
	@GetMapping("api/v1/Company/Opsramp")
	public ResponseEntity<List<Company>> getAlldetails(){
		return	ResponseEntity.ok().body(cs.GetAllDetils());
	}
	
	@GetMapping("/Company/{ipaddress}/Status")
	public ResponseEntity<Company> getdetailsbyid(@PathVariable@RequestBody int ipaddress){
		return	ResponseEntity.ok().body(cs.getDetailsbyId(ipaddress));
	}
		
	@PostMapping("/company/Opsramp")
	public ResponseEntity<Company> createCompany(@RequestBody Company com){
		return ResponseEntity.ok().body(cs.createCompany(com));
	}
}