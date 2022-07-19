package pe.joedayz.clientes.web.controller;


import java.util.Iterator;
import java.util.List;

import pe.joedayz.clientes.entity.Role;
import javax.validation.Valid;

import pe.joedayz.clientes.crypto.bcrypt.BCryptPasswordEncoderMain;
import pe.joedayz.clientes.dto.MenuItem;
import pe.joedayz.clientes.entity.Clientes;
import pe.joedayz.clientes.entity.Usuario;
import pe.joedayz.clientes.repository.ClienteRepository1;
import pe.joedayz.clientes.repository.MenuRepository;
import pe.joedayz.clientes.repository.UsuarioRepository;
import pe.joedayz.clientes.util.Util;
import pe.joedayz.clientes.web.controller.validator.ClienteValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;


@Controller
public class ClienteController {

	@Autowired
	private MenuRepository menuRepository;
	@Autowired
	private ClienteRepository1 clienteRepository;
	@Autowired
	private Util util;
	
	

	@GetMapping("/cliente/list")
	public ModelMap getAll1(@PageableDefault(size = 10) Pageable pageable, @RequestParam(name = "value", required = false) String value, Model model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		model.addAttribute("username", ((Usuario)principal).getCodUsuario());
		return new ModelMap().addAttribute("clientes", clienteRepository.findAll(pageable));
	
	}


	@GetMapping("/cliente/form")
	public ModelMap getById(@RequestParam(value = "id", required = false)Integer id, Clientes cliente, Model model) {
		
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		model.addAttribute("username", ((Usuario)principal).getCodUsuario());
		//Usuario findByCodUsuario(String username);
		if (cliente == null) {
			cliente = new Clientes();
			//System.out.println("Usuarios TrueNEW CodSocio"+cliente.getCodUsuario());
			return new ModelMap("cliente", cliente);
		}else if(id!=null){
			//System.out.println("USUARIOS FALSE CodSocio"+cliente.getCodUsuario()+"ID:"+id);
		cliente = clienteRepository.findById(id);
		}
		
		return new ModelMap("cliente", cliente);
	}
	
	///
	
	/*
	 * @GetMapping("/clientes/form") public ModelMap getById(@RequestParam(value =
	 * "id", required = false) Cliente cliente, Model model) { Object principal =
	 * SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	 * model.addAttribute("username", ((Usuario)principal).getCodUsuario());
	 * 
	 * if (cliente == null) { cliente = new Cliente();
	 * System.out.println("CLIENTES TrueNEW CodSocio"+cliente.getCodSocio()); }
	 * System.out.println("CLIENTES FALSE CodSocio"+cliente.getCodSocio()); return
	 * new ModelMap("cliente", cliente); }
	 */
	
	
	///
	
	


	@Transactional
	@PostMapping("/cliente/form")
	public String saveSocio(@Valid Clientes cliente, BindingResult result, SessionStatus status) {
		//System.out.println("EDITAR1"+cliente.getCodUsuario());
		//new ClienteValidator().validate(cliente, result);

		if (result.hasErrors()) {
			return "cliente/form";
		}
//		cliente.setGrupoMenus("1,2,3,4,6,7,8,11,12");
//		cliente.setPasswordUsuario(BCryptPasswordEncoderMain.encode(cliente.getPasswordUsuario()));
//		cliente.setActive(true);
//		cliente.setActive(true);
//		Role r = new Role();
//		r.setId(1);
//		cliente.getRoles().add(r);
		
		clienteRepository.save(cliente);
		status.setComplete();
		//System.out.println("EDITAR2"+cliente.getCodUsuario());
		return "redirect:/cliente/list";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@ModelAttribute("menuItemsList")
	public List<MenuItem> menues() {
		return util.agruparMenus(menuRepository.getMenues());
	}

}
