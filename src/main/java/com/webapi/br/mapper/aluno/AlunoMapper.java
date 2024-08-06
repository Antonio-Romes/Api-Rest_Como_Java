package com.webapi.br.mapper.aluno;

import java.util.List;

import org.mapstruct.Mapper;

import com.webapi.br.dto.aluno.AlunoRequestDTO;
import com.webapi.br.dto.aluno.AlunoResponseDTO;
import com.webapi.br.entities.aluno.AlunoEntity;

@Mapper(componentModel = "spring")
public interface AlunoMapper {
	
	AlunoEntity AlunoRequestDTOToAlunoEntity(AlunoRequestDTO alunoRequestDTO);
	AlunoResponseDTO AlunoEntityToAlunoResponseDTO(AlunoEntity alunoEntity);
	List<AlunoResponseDTO> AlunoEntitysToAlunoResponseDTOs(List<AlunoEntity> alunoEntity);
}
