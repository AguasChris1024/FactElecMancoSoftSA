package pe.joedayz.clientes.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import pe.joedayz.clientes.repository.ClienteRepository1;
import pe.joedayz.clientes.repository.ProductoRepository;

@Controller
public class JsController {

	@Autowired
	private ClienteRepository1 clienteRepository;
	@Autowired
	private ProductoRepository productoRepository;
	
	
}
