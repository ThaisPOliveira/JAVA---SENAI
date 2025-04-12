package com.escola.senai.service;

import com.escola.senai.model.Aluno;
import com.escola.senai.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {
    private AlunoRepository alunoRepository;

    //Inserir alunos (CREATE)
    public Aluno salvarAluno(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    //Buscar alunos (READ)
    public List<Aluno> buscarAluno(){
        return alunoRepository.findAll();
    }

    //Atualizar(Update)
    public Aluno atualizarAluno(Long Id, Aluno alunoAtualizado){
        return alunoRepository.findById(Id)
                .map(aluno ->
                        {
                            aluno.setNomeAluno(alunoAtualizado.getNomeAluno());
                            aluno.setIdadeAluno(alunoAtualizado.getIdadeAluno());
                            aluno.setMatriculaAluno(alunoAtualizado.getMatriculaAluno());
                            return alunoRepository.save(aluno);
                        })
                .orElseThrow(() -> new RuntimeException("Aluno não encotrado pelo ID:" + Id));
    }

    //Deletar
    public void deleteId(Long Id){
        alunoRepository.deleteById(Id);
    }

    //Metodo para buscar apenas um aluno pelo id
    public Optional<Aluno> buscarAlunoID(Long Id){
        return alunoRepository.findById(Id);
    }



}
