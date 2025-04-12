package com.escola.senai.controller;

import com.escola.senai.model.Professor;
import com.escola.senai.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.ui.Model;



import java.util.List;

@Controller
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    // Listar todos (Read)
    @GetMapping
    public String listarProfessores(Model model) {
        List<Professor> professores = professorService.buscarProfessor();
        model.addAttribute("professores", professores);
        return "professores/listar";
    }

    // Formulário para novo professor (Create)
    @GetMapping("/novo")
    public String novoProfessorForm(Model model) {
        model.addAttribute("professor", new Professor());
        return "professores/form";
    }

    // Salvar novo professor (Create)
    @PostMapping("/salvar")
    public String salvarProfessor(@ModelAttribute Professor professor) {
        professorService.salvarProfessor(professor);
        return "redirect:/professores";
    }

    // Formulário para editar professor (Update)
    @GetMapping("/editar/{id}")
    public String editarProfessorForm(@PathVariable Long id, Model model) {
        Professor professor = professorService.buscarProfessorId(id)
                .orElseThrow(() -> new RuntimeException("Professor não encontrado com o ID: " + id));
        model.addAttribute("professor", professor);
        return "professores/form";
    }

    // Atualizar professor (Update)
    @PostMapping("/atualizar/{id}")
    public String atualizarProfessor(@PathVariable Long id, @ModelAttribute Professor professor) {
        professorService.atualizarProfessor(id, professor);
        return "redirect:/professores";
    }

    // Deletar professor (Delete)
    @GetMapping("/deletar/{id}")
    public String deletarProfessor(@PathVariable Long id) {
        professorService.deleteId(id);
        return "redirect:/professores";
    }
}