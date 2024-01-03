package br.com.belodestino.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.belodestino.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

}
