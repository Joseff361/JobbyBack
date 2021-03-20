package com.dorian.PortalWebBack.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dorian.PortalWebBack.dao.EmpresaRepository;
import com.dorian.PortalWebBack.entity.Empresa;

@Service
public class EmpresaService {

	@Autowired
	public EmpresaRepository empresaRepository;
	
	public List<Empresa> getTodosLasEmpresas(){
		
		return this.empresaRepository.findAll();
	}
	
	public Optional<Empresa> getEmpresaPorId(int id) {
		
		return this.empresaRepository.findById(id);
	}
	
	public void guardarEmpresa(Empresa laEmpresa) {
		
		this.empresaRepository.save(laEmpresa);
	}
}
