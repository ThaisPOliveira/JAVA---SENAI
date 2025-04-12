package com.escola.senai.service;


import com.escola.senai.model.Aluno;
import com.escola.senai.model.Professor;
import com.escola.senai.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProfessorService {
@Autowired
    private ProfessorRepository professorRepository;
    //Inserir alunos (CREATE)
    public Professor salvarProfessor(Professor professor){
        return professorRepository.save(professor);
    }

    //Buscar alunos (READ)
    public List<Professor> buscarProfessor(){
        return professorRepository.findAll();
    }

    //Atualizar(Update)
    public Professor atualizarProfessor(Long Id, Professor professorAtualizado){
        return professorRepository.findById(Id)
                .map(professor ->
                {
                    professor.setNomeProfessor(professorAtualizado.getNomeProfessor());
                    professor.setNomeDisciplina(professorAtualizado.getNomeDisciplina());
                    return professorRepository.save(professor);
                })
                .orElseThrow(() -> new RuntimeException("Aluno não encotrado pelo ID:" + Id));
    }

    //Deletar
    public void deleteId(Long Id){
        professorRepository.deleteById(Id);
    }

    //Metodo para buscar apenas um aluno pelo id
    public Optional<Professor> buscarProfessorId(Long Id){
        return professorRepository.findById(Id);
    }


}
