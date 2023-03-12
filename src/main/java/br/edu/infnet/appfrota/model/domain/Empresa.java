package br.edu.infnet.appfrota.model.domain;

import br.edu.infnet.appfrota.model.exceptions.EmpresaInvalidaException;

public class Empresa {
	private Integer id;
	private Integer codigo;
	private String razaoSocial;
	private String nomeFantasia;
	private String cnpj;
	private String inscricaoEstadual;
	private String endereco;
	private String numero;
	private String bairro;
	private String cidade;
	private Integer cep;
	
	public Empresa(Integer codigo, String razaoSocial, String nomeFantasia, String cnpj, String inscricaoEstadual, String endereco, String numero, String bairro, String cidade, Integer cep) throws EmpresaInvalidaException {
		
		if(codigo == null) {
			throw new EmpresaInvalidaException("O campo Código deve ser preenchido!");
		}
		
		if(razaoSocial == null) {
			throw new EmpresaInvalidaException("O campo Razão Social deve ser preenchido!");
		}
		
		if(nomeFantasia == null) {
			throw new EmpresaInvalidaException("O campo Nome Fantasia deve ser preenchido!");
		}
		
		if(cnpj == null) {
			throw new EmpresaInvalidaException("O campo CNPJ deve ser preenchido!");
		}
		
		if(inscricaoEstadual == null) {
			throw new EmpresaInvalidaException("O campo Inscrição Estadual deve ser preenchido!");
		}
		
		if(endereco == null) {
			throw new EmpresaInvalidaException("O campo Endereço deve ser preenchido!");
		}
		
		if(numero == null) {
			throw new EmpresaInvalidaException("O campo Número deve ser preenchido!");
		}
		
		if(bairro == null) {
			throw new EmpresaInvalidaException("O campo Bairro deve ser preenchido!");
		}
		
		if(cidade == null) {
			throw new EmpresaInvalidaException("O campo Cidade deve ser preenchido!");
		}
		
		if(cep == null) {
			throw new EmpresaInvalidaException("O campo CEP deve ser preenchido!");
		}
		
		this.codigo = codigo;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.endereco = endereco;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(codigo);
		sb.append(";");
		sb.append(razaoSocial);
		sb.append(";");
		sb.append(nomeFantasia);
		sb.append(";");
		sb.append(cnpj);
		sb.append(";");
		sb.append(inscricaoEstadual);
		sb.append(";");
		sb.append(endereco);
		sb.append(";");
		sb.append(numero);
		sb.append(";");
		sb.append(bairro);
		sb.append(";");
		sb.append(cidade);
		sb.append(";");
		sb.append(cep);
		
		return sb.toString();
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getNumero() {
		return numero;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public Integer getCep() {
		return cep;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


}
	
