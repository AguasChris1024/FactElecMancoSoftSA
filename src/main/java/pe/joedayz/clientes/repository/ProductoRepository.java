package pe.joedayz.clientes.repository;

import pe.joedayz.clientes.entity.Producto;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, String> {

	//Producto findByProducto(String unsername);
	Producto findByid(int id);
}
