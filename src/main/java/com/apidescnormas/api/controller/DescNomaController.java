package com.apidescnormas.api.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.apidescnormas.domain.model.DescNormaEntity;
import com.apidescnormas.domain.service.DescNormaService;


@RestController
@RequestMapping("/descricao-normas")
public class DescNomaController {
	
	@Autowired
	DescNormaService descNormaService;
	
	@PostMapping
	public ResponseEntity<DescNormaEntity> salva (@RequestBody DescNormaEntity descNormaEntity){
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(descNormaService.salvar(descNormaEntity));
	}
	
	
	@GetMapping
	public ResponseEntity<List<DescNormaEntity>> obter(){
		
		return ResponseEntity.status(HttpStatus.OK).body(descNormaService.obter());
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Optional<DescNormaEntity>> obterCodigo(@PathVariable String codigo){
		
		return ResponseEntity.status(HttpStatus.OK).body(descNormaService.obterPorCodigo(codigo));
	}	

}