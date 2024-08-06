package com.webapi.br.repository.aluno;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.webapi.br.entities.aluno.AlunoEntity;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoEntity, Long> {

}
