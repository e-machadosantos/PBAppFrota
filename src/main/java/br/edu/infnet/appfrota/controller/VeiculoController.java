package br.edu.infnet.appfrota.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appfrota.model.domain.Usuario;
import br.edu.infnet.appfrota.model.domain.Veiculo;
import br.edu.infnet.appfrota.model.service.VeiculoService;

@Controller
public class VeiculoController {
	
	@Autowired
	private VeiculoService veiculoService;
	
	private String msg;
	
	@GetMapping(value = "/veiculo/lista")
	public String telaLista(Model model, @SessionAttribute("usuario") Usuario usuario) {		

		model.addAttribute("veiculos", veiculoService.obterLista(usuario));
		
		model.addAttribute("mensagem", msg);
		
		msg = null;
				
		return "veiculo/lista";
	}
	
	@GetMapping(value = "/veiculo/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		Veiculo veiculo = veiculoService.obterPorId(id);
		
		veiculoService.excluir(id);		
		
		msg = "A exclusão do veículo (" + veiculo.getTipo()+ ") foi realizada com sucesso!!";
		
		return "redirect:/veiculo/lista";
		
	}


}
