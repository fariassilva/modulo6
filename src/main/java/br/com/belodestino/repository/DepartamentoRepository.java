package br.com.belodestino.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.belodestino.model.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

}
