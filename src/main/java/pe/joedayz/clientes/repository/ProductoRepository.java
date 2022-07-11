package pe.joedayz.clientes.repository;

import pe.joedayz.clientes.entity.Producto;


import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author : JoeDayz
 * @since : 21/03/20
 */
public interface ProductoRepository extends JpaRepository<Producto, String> {

	//Producto findByProducto(String unsername);
	Producto findByid(int id);
}
