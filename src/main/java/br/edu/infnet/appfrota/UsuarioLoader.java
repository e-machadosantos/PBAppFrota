package br.edu.infnet.appfrota;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appfrota.model.domain.Usuario;
import br.edu.infnet.appfrota.model.service.UsuarioService;

@Order(1)
@Component
public class UsuarioLoader implements ApplicationRunner{
	
	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario userAdmin = new Usuario("Administrador", "admin@admin.com", "123");
		userAdmin.setIdade(30);
		userAdmin.setSalario(9999);
		userAdmin.setSetor("Administracao");
		userAdmin.setTipo("Admin");
		
		usuarioService.incluir(userAdmin);
	
		System.out.println("Inclusão do Administrador " + userAdmin.getNome() + " realizada com sucesso!!!");
		
		for (int i = 0; i < 9; i++) {
			Usuario usuario = new Usuario("Administrador" + i, "admin" + i + "@admin.com", "0" + i);
//			usuario.setId(i);
			usuario.setIdade(i*4);
			usuario.setSalario(i*100);
			usuario.setSetor("Presidência" + i);
			usuario.setTipo("Admin" + i);
			
			usuarioService.incluir(usuario);
			
			System.out.println("Inclusão do usuário " + usuario.getNome() + " realizada com sucesso!!!");
			
		}
		
	}

}