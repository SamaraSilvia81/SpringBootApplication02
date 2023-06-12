package br.com.acqiogrowup.controlador;

import br.com.acqiogrowup.modelo.ListEntity;
import br.com.acqiogrowup.repositorio.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/list")
public class ListController {

    @Autowired
    ListRepository listRepository;

    @PostMapping
    public ListEntity create (@RequestBody ListEntity list){
        return listRepository.save(list);
    }

    @GetMapping
    public java.util.List<ListEntity> list(){
        return listRepository.findAll();
    }

    @PutMapping("/{listId}")
    public void update (@RequestBody ListEntity list){
        listRepository.save(list);
    }

    @DeleteMapping("/{listId}")
    public void delete (@PathVariable Long listId){
        listRepository.deleteById(listId);
    }
}