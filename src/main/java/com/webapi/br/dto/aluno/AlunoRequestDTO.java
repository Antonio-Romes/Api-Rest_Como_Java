package com.webapi.br.dto.aluno;

import java.util.Date;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.webapi.br.entities.aluno.AlunoEntity;
import com.webapi.br.validation.campoEmail.EmailUnico;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AlunoRequestDTO {
	
	private Long id;
	
	@NotBlank(message = "O campo nome é obrigatório!")
	@Size(max=100, message = "O nome deve contem no máximo 100 caracteres!")
	private String nome;
	
	@NotNull(message = "O campo data nascimento e obrigatório!")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date datanascimento;
    
    @NotBlank(message = "O campo email é obrigatório!")
    @Email(message = "Informe um email válido!")
    @EmailUnico(entity = AlunoEntity.class, field = "email", message = "O campo Email já foi cadastrado!") 
    private String email;
    private Boolean ativo;  
}
