package br.edu.infnet.appfrota;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appfrota.model.domain.Usuario;
import br.edu.infnet.appfrota.model.service.UsuarioService;

@Component
public class UsuarioLoader implements ApplicationRunner{
	
	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		for (int i = 0; i < 10; i++) {
			Usuario usuario = new Usuario("Administrador" + i, "admin" + i + "@admin.com", "0" + i);
			usuario.setId(i);
			usuario.setIdade(i*4);
			usuario.setSalario(i*100);
			usuario.setSetor("Presidência" + i);
			usuario.setTipo("Admin" + i);
			
			usuarioService.incluir(usuario);
			
			System.out.println("Inclusão do usuário " + usuario.getNome() + " realizada com sucesso!!!");
			
		}
		
	}

}