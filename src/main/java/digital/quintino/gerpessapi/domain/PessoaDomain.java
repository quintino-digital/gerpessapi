package digital.quintino.gerpessapi.domain;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "TB_PESSOA")
public class PessoaDomain implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "CODIGO")
	private UUID codigo;
	
	@JsonProperty("tipoPessoa")
	@OneToOne
	@JoinColumn(name = "ID_TIPO_PESSOA")
	private TipoPessoaDomain tipoPessoaDomain;
	
	@Column(name = "NOME", unique = true, nullable = false)
	private String nome;
	
	public PessoaDomain() { }

	public UUID getCodigo() {
		return codigo;
	}

	public void setCodigo(UUID codigo) {
		this.codigo = codigo;
	}

	public TipoPessoaDomain getTipoPessoaDomain() {
		return tipoPessoaDomain;
	}

	public void setTipoPessoaDomain(TipoPessoaDomain tipoPessoaDomain) {
		this.tipoPessoaDomain = tipoPessoaDomain;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
