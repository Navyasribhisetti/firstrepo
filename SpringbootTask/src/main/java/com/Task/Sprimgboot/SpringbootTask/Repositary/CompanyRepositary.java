package com.Task.Sprimgboot.SpringbootTask.Repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Task.Sprimgboot.SpringbootTask.Entity.Company;
@Repository
public interface CompanyRepositary extends JpaRepository<Company,Integer>{

	
	

}
