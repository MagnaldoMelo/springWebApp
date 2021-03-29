package mmelo.springframework.springWebApp.controllers;

import mmelo.springframework.springWebApp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAurhors(Model model){
        model.addAttribute("authors", this.authorRepository.findAll());
        return "authors/list";
    }
}
