package br.com.acqiogrowup.controlador;

import br.com.acqiogrowup.modelo.CharacterEntity;
import br.com.acqiogrowup.repositorio.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/character")
public class CharacterController {

    @Autowired
    CharacterRepository characterRepository;

    @GetMapping
    public List<CharacterEntity> list(){
        return characterRepository.findAll();
    }

}
