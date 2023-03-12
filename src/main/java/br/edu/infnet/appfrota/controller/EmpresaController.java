package br.edu.infnet.appfrota.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import br.edu.infnet.appfrota.model.domain.Empresa;
import br.edu.infnet.appfrota.model.service.EmpresaService;

@Controller
public class EmpresaController {
	
	@Autowired
	private EmpresaService empresaService;
	
	private String msg;
	
	@GetMapping(value = "/empresa")
	public String telaCadastro() {
		return "empresa/cadastro";
	}
	
	@GetMapping(value = "/empresa/lista")
	public String telaLista(Model model) {		

		model.addAttribute("empresas", empresaService.obterLista());
		
		model.addAttribute("mensagem", msg);
		
		msg = null;
		
		return "empresa/lista";
	}
	
	@PostMapping(value = "/empresa/incluir")
	public String incluir(Empresa empresa) {
		
		empresaService.incluir(empresa);
		
		msg = "A inclusão da empresa " + empresa.getRazaoSocial()+ " foin realizada com sucesso!!";
		
		return "redirect:/empresa/lista";
	}	
	
	@GetMapping(value = "/empresa/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		Empresa empresa = empresaService.excluir(id);		
		msg = "A exclusão da empresa " + empresa.getRazaoSocial() + " foi realizada com sucesso!!";
		
		msg = "A exclusão da empresa foi realizada com sucesso!!";
		
		return "redirect:/empresa/lista";
		
	}
}