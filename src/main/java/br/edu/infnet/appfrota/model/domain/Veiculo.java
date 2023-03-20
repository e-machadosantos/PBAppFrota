package br.edu.infnet.appfrota.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.edu.infnet.appfrota.model.exceptions.VeiculoInvalidoException;

@Entity
@Table(name = "TVeiculo")
@Inheritance(strategy = InheritanceType.JOINED)
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String tipo;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;

	
	public Veiculo() {		
	};
	
	public Veiculo(String tipo) throws VeiculoInvalidoException {
	
		this();
		
		if (tipo == null) {
			throw new VeiculoInvalidoException("O campo Tipo deve ser preenchido!");			
		}	
		
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(tipo);
		
		return sb.toString();
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}	
	
}