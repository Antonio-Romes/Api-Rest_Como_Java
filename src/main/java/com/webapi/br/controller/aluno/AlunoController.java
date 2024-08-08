package com.webapi.br.controller.aluno;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.webapi.br.controller.BaseController;
import com.webapi.br.dto.aluno.AlunoRequestDTO;
import com.webapi.br.dto.aluno.AlunoResponseDTO;
import com.webapi.br.service.aluno.AlunoService;
 
import jakarta.validation.Valid;

 
@RestController
@RequestMapping("/api")
@Validated
@CrossOrigin(origins = "*" )
public class AlunoController extends BaseController {
	
	@Autowired
	AlunoService _alunoService;	
	
	@GetMapping("/alunos")
	public ResponseEntity<List<AlunoResponseDTO>> getAll() {
	 
	    List<AlunoResponseDTO> alunoResponseDTO = _alunoService.getAll();
        return ResponseEntity.ok(alunoResponseDTO);
         
	}
	
	@GetMapping("/alunos/{id}")
	public ResponseEntity<AlunoResponseDTO> getById(@PathVariable Long id) {
		 
		AlunoResponseDTO alunoResponseDTO = _alunoService.getById(id);
		
		if(alunoResponseDTO == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		
		return ResponseEntity.ok(alunoResponseDTO);
		 
	}
	
	@PostMapping("/alunos")
	public ResponseEntity<AlunoResponseDTO> save(@Valid @RequestBody AlunoRequestDTO alunoRequestDTO) {
	 
		try {
			AlunoResponseDTO alunoResponseDTO = _alunoService.saveAluno(alunoRequestDTO);
			
			if(alunoResponseDTO == null) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
			}
			
			return ResponseEntity.ok(alunoResponseDTO);
		}
		catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
		
		  
	}
	
	@PutMapping("/alunos/{id}")
	public ResponseEntity<AlunoResponseDTO> update(@Valid @PathVariable Long id, @RequestBody AlunoRequestDTO alunoRequestDTO) {
	 
		AlunoResponseDTO alunoResponseDTO = _alunoService.saveAluno(alunoRequestDTO);
		
		if(alunoResponseDTO == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		
		return ResponseEntity.ok(alunoResponseDTO);
		 
	}
	
	@DeleteMapping("/alunos/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Long id) {
		 
		_alunoService.deleteById(id);
		return ResponseEntity.noContent().build();
	 
		  
	}
	
	

}
