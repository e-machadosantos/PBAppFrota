package br.edu.infnet.appfrota;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appfrota.model.domain.Automovel;
import br.edu.infnet.appfrota.model.domain.Usuario;
import br.edu.infnet.appfrota.model.service.AutomovelService;

@Order(3)
@Component
public class AutomovelLoader implements ApplicationRunner{
	
	@Autowired
	private AutomovelService automovelService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario admin = new Usuario();
		admin.setId(1);
		
		try {
			Automovel automovel = new Automovel("A", "Honda", "Civic", "2023", "2024", "CTB-0000");			
			automovel.setUsuario(admin);
			
			System.out.println(automovel);			
			
			automovelService.incluir(automovel);			
			
			System.out.println("Automóvel incluído com sucesso!");
			
		} catch (Exception e) {
			System.out.println("Deu erro no AutomovelLoader!");
		}
		
		
		try {
			Automovel automovel = new Automovel("A", "Volkswagen", "Amarok", "2023", "2023", "VTI-0000");			
			automovel.setUsuario(admin);
			
			System.out.println(automovel);
			
			automovelService.incluir(automovel);			
			
			System.out.println("Automóvel incluído com sucesso!");
			
		} catch (Exception e) {
			System.out.println("Deu erro no AutomovelLoader!");
		}
		
		
		try {
			Automovel automovel = new Automovel("A", "Chevrolet", "Onix", "2021", "2022", "MTG-0000");			
			automovel.setUsuario(admin);
			
			System.out.println(automovel);			
			
			automovelService.incluir(automovel);			
			
			System.out.println("Automóvel incluído com sucesso!");
			
		} catch (Exception e) {
			System.out.println("Deu erro no AutomovelLoader!");
		}
		
		System.out.println("Listatem de Automoveis:");
		for(Automovel automovel : automovelService.obterLista()) {
			System.out.printf("%d - %s - %s - %s - %s - %s - %s\n",
					automovel.getId(),
					automovel.getTipo(),
					automovel.getMarca(),
					automovel.getModelo(),
					automovel.getAnoFabricacao(),
					automovel.getAnoModelo(),
					automovel.getPlaca()
					);
		}
		
	}

}
