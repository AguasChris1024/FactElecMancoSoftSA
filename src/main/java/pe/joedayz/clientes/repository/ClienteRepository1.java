package pe.joedayz.clientes.repository;


import pe.joedayz.clientes.entity.Clientes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository1 extends JpaRepository<Clientes, String> {

	//Clientes findByCodUsuario(String username);
	Clientes findById(int id);
}
