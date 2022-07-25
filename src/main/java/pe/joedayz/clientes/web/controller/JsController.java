package pe.joedayz.clientes.web.controller;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;

import pe.joedayz.clientes.entity.Role;
import pe.joedayz.clientes.entity.Token;

import javax.validation.Valid;

import pe.joedayz.clientes.crypto.bcrypt.BCryptPasswordEncoderMain;
import pe.joedayz.clientes.dto.MenuItem;
import pe.joedayz.clientes.entity.Cliente;
import pe.joedayz.clientes.entity.Clientes;
import pe.joedayz.clientes.entity.Producto;
import pe.joedayz.clientes.entity.Usuario;
import pe.joedayz.clientes.repository.ClienteRepository1;
import pe.joedayz.clientes.repository.MenuRepository;
import pe.joedayz.clientes.repository.ProductoRepository;
import pe.joedayz.clientes.repository.UsuarioRepository;
import pe.joedayz.clientes.util.Util;
import pe.joedayz.clientes.web.controller.validator.ClienteValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.client.RestTemplate;

@Controller
public class JsController {

	@Autowired
	private ClienteRepository1 clienteRepository;
	@Autowired
	private ProductoRepository productoRepository;
	
	@GetMapping(path="/p/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Clientes getCliente(@PathVariable String id) {
			return clienteRepository.findBynombre(id);
			
		}
}
