package com.webapi.br.service.aluno;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapi.br.dto.aluno.AlunoRequestDTO;
import com.webapi.br.dto.aluno.AlunoResponseDTO;
import com.webapi.br.entities.aluno.AlunoEntity;
import com.webapi.br.mapper.aluno.AlunoMapper;
import com.webapi.br.repository.aluno.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	AlunoRepository  _alunoRepository;
	
	@Autowired
	AlunoMapper _alunoMapper;
	
	
	public List<AlunoResponseDTO> getAll() {
		List<AlunoEntity> alunoEntity = _alunoRepository.findAll(); 
		var oi = _alunoMapper.AlunoEntitysToAlunoResponseDTOs(alunoEntity);
		return  oi;
	}
	
	public AlunoResponseDTO getById(Long id){
		AlunoEntity alunoEntity = _alunoRepository.findById(id).orElse(null);
		return _alunoMapper.AlunoEntityToAlunoResponseDTO(alunoEntity);
	}
	
	public AlunoResponseDTO saveAluno(AlunoRequestDTO  alunoRequestDTO){
		AlunoEntity alunoEntity = _alunoMapper.AlunoRequestDTOToAlunoEntity(alunoRequestDTO); 
		return _alunoMapper.AlunoEntityToAlunoResponseDTO(_alunoRepository.save(alunoEntity));
	}
	 
	public void deleteById(Long id){
		  _alunoRepository.deleteById(id);
	}
 }
