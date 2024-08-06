package com.webapi.br.dto.aluno;

import java.util.Date;

 

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AlunoResponseDTO {
	
	private Long id; 
	private String nome;
    private Date datanascimento;
    private String email;
    private Boolean ativo; 
}
