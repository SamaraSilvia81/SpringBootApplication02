package br.com.acqiogrowup.controlador;

import br.com.acqiogrowup.modelo.UserEntity;
import br.com.acqiogrowup.repositorio.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping
    public UserEntity signIn (@RequestBody UserEntity user){
        return userRepository.save(user);
    }
    

    @GetMapping("/{userId}")
    public UserEntity getUser(@PathVariable Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

     @PutMapping("/{userId}")
    public UserEntity updateUser(@RequestBody UserEntity user, @PathVariable Long userId) {
        UserEntity existingUser = userRepository.findById(userId).orElse(null);
        if (existingUser != null) {
            // Atualiza os dados do usuário existente com base nos dados recebidos
            existingUser.setName(user.getName());
            existingUser.setEmail(user.getEmail());
            existingUser.setPassword(user.getPassword());
            return userRepository.save(existingUser);
        }
        return null;
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long userId) {
        userRepository.deleteById(userId);
    }

}