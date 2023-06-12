package br.com.acqiogrowup.repositorio;


import br.com.acqiogrowup.modelo.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository <CharacterEntity, Long> {
}
