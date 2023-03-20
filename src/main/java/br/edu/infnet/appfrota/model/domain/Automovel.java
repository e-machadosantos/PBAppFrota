package br.edu.infnet.appfrota.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.appfrota.model.exceptions.VeiculoInvalidoException;

@Entity
@Table(name = "TAutomovel")
public class Automovel extends Veiculo{	
	
	private String marca;
	private String modelo;
	private String anoFabricacao;
	private String anoModelo;
	private String placa;
	
	public Automovel() {
		
	}
	
	public Automovel(String tipo, String marca, String modelo, String anoFabricacao, String anoModelo, String placa) throws VeiculoInvalidoException {
		super(tipo);
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.placa = placa;		
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();			
		sb.append(super.toString());
		sb.append(";");
		sb.append(marca);
		sb.append(";");
		sb.append(modelo);
		sb.append(";");
		sb.append(anoFabricacao);
		sb.append(";");
		sb.append(anoModelo);
		sb.append(";");
		sb.append(placa);
		
		return sb.toString();
		
	}	

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public String getAnoModelo() {
		return anoModelo;
	}

	public String getPlaca() {
		return placa;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

}
