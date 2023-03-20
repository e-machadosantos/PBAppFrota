package br.edu.infnet.appfrota.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appfrota.model.domain.Automovel;
import br.edu.infnet.appfrota.model.domain.Usuario;
import br.edu.infnet.appfrota.model.service.AutomovelService;

@Controller
public class AutomovelController {
	
	@Autowired
	private AutomovelService automovelService;
	
	private String msg;
	
	@GetMapping(value = "/automovel")
	public String telaCadastro() {
		return "automovel/cadastro";
	}
	
	@GetMapping(value = "/automovel/lista")
	public String telaLista(Model model, @SessionAttribute("usuario") Usuario usuario) {		

		model.addAttribute("automoveis", automovelService.obterLista(usuario));
		
		model.addAttribute("mensagem", msg);
		
		msg = null;
				
		return "automovel/lista";
	}
	
	@PostMapping(value = "/automovel/incluir")
	public String incluir(Automovel automovel, @SessionAttribute("usuario") Usuario usuario) {
		
		automovel.setUsuario(usuario);
		
		automovelService.incluir(automovel);
		
		msg = "A inclusão do automóvel " + automovel.getModelo() + " foi realizada com sucesso!!";
		
		return "redirect:/automovel/lista";
	}	
	
	@GetMapping(value = "/automovel/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		Automovel automovel = automovelService.obterPorId(id);
		
		automovelService.excluir(id);		
		
		msg = "A exclusão do automóvel (" +automovel.getModelo() + ") foi realizada com sucesso!!";
		
		return "redirect:/automovel/lista";
		
	}


}
