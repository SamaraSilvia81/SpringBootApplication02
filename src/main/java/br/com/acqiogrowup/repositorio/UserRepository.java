package br.com.acqiogrowup.repositorio;

import br.com.acqiogrowup.modelo.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}