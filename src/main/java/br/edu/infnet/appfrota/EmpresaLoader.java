package br.edu.infnet.appfrota;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appfrota.model.domain.Empresa;
import br.edu.infnet.appfrota.model.service.EmpresaService;

@Component
public class EmpresaLoader implements ApplicationRunner {
	
	@Autowired
	private EmpresaService empresaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		try {
			String arq = "empresas.txt";
			
			try {
				FileReader fileR = new FileReader(arq);
				BufferedReader leitura = new BufferedReader(fileR);
				
				String linha = leitura.readLine();			
				String[] campos = null;

				while(linha != null) {
					
					campos = linha.split(";");
					
					Empresa empresa = new Empresa(
							Integer.valueOf(campos[0]),
							campos[1],
							campos[2],
							campos[3],
							campos[4],
							campos[5],
							campos[6],
							campos[7],
							campos[8],
							Integer.valueOf(campos[9])
						);

					empresaService.incluir(empresa);
					
					System.out.println("Inclusão da empresa " + empresa.getRazaoSocial() + " foi realizada com sucesso!!!");
					
					linha = leitura.readLine();
				}

				leitura.close();
				fileR.close();
			} catch (IOException e) {
				System.out.println("[ERRO] " + e.getMessage());
			} 
			
		} finally {
			System.out.println("Processamento realizado com sucesso!!!");
		}
	}
}
