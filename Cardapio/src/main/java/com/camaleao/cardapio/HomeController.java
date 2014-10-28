package com.camaleao.cardapio;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.camaleao.cardapio.entity.Usuario;
import com.camaleao.cardapio.service.UsuarioService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
//	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired 
	private UsuarioService usuarioSvc;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		
		model.addAttribute("usuarios", usuarioSvc.getAll());
		
		return "home";
	}
	
	@RequestMapping(value = "/addUsuario", method = RequestMethod.POST)
	public String addUsuario(@ModelAttribute Usuario usuario) {
		usuarioSvc.add(usuario);
	    return "redirect:/";
	}
	
}
