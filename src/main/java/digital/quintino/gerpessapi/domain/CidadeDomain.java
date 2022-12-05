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
@Table(name = "TB_CIDADE")
public class CidadeDomain implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO")
	private Long codigo;
	
	@ManyToOne
	@JoinColumn(name = "ID_ESTADO")
	private EstadoDomain estadoDomain;
	
	@Column(name = "NOME", nullable = false)
	private String nome;
	
	public CidadeDomain() { }

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public EstadoDomain getEstadoDomain() {
		return estadoDomain;
	}

	public void setEstadoDomain(EstadoDomain estadoDomain) {
		this.estadoDomain = estadoDomain;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
