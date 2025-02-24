package br.com.fiap.finance_walk_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.finance_walk_api.model.Category;

@RestController
public class CategoryController {
    
    //Listar todas as categorias
    // GET :8080/categories
    @RequestMapping(method = {RequestMethod.GET}, path = "/categories", produces = "application/json")
    public List<Category> index(){
        return List.of(
            new Category(1L, "Educação", "book"),
            new Category(2L, "Lazer", "casino"),
            new Category(3L, "Salário", "payments")
            );
    }

    //Cadastrar uma categoria

    //Apagar uma categoria

}
