package digital.quintino.gerpessapi.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ESTADO")
public class EstadoDomain implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO")
	private Long codigo;
	
	@ManyToOne
	@JoinColumn(name = "ID_PAIS")
	private PaisDomain paisDomain;
	
	@Column(name = "NOME", unique = true, nullable = false)
	private String nome;
	
	public EstadoDomain() { }

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public PaisDomain getPaisDomain() {
		return paisDomain;
	}

	public void setPaisDomain(PaisDomain paisDomain) {
		this.paisDomain = paisDomain;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
