package com.apidescnormas.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apidescnormas.domain.model.DescNormaEntity;
import com.apidescnormas.domain.repository.DescNormaRepository;

@Service
public class DescNormaService {
	
	@Autowired
	DescNormaRepository descNormaRepository;
	
	public DescNormaEntity salvar(DescNormaEntity descNormaEntity) {
		
		return descNormaRepository.save(descNormaEntity);
	}
	
	public List<DescNormaEntity> obter(){
		
		return (List<DescNormaEntity>) descNormaRepository.findAll();
	}
	
	public Optional<DescNormaEntity> obterPorCodigo(String codigo) {
		
		return descNormaRepository.findById(codigo);
	}

}
