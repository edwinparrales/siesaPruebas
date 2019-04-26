package co.company.pruebas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsuarioController {
	@GetMapping({"/usuario","/"})
	public String usuario(@RequestParam(name="nombre",required=false,defaultValue="Login")
	String nombre,Model model) {
		
		model.addAttribute("nom",nombre);
		return "usuario";
	}

}
