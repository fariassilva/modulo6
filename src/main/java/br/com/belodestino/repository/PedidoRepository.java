package br.com.belodestino.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.belodestino.model.Pedido;

//import br.com.belodestino.model.Usuario;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	/*
	 * @Query(value = "select * from pedido where usuario_id = :id", nativeQuery =
	 * true) public List<Pedido> buscarPedidosById(Long id); // usuario_id
	 */

	// UTILIZADO PARA FAZER A BUSCA DOS PEDIDOS CONFORME USUÁRIO LOGADO
	@Query(value = "select * from pedido where usuario_id = :usuario", nativeQuery = true)
	public List<Pedido> findByUserId(Long usuario);


}
