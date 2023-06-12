package br.com.acqiogrowup.repositorio;

import br.com.acqiogrowup.modelo.ListEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListRepository extends JpaRepository<ListEntity, Long> {
}
