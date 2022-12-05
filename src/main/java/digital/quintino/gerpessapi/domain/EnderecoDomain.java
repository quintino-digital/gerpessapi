package digital.quintino.gerpessapi.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ENDERECO")
public class EnderecoDomain implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO")
	private Long codigo;
	
	@OneToOne
	@JoinColumn(name = "ID_TIPO_ENDERECO", nullable = false)
	private TipoEnderecoDomain tipoEnderecoDomain;
	
	@ManyToOne
	@JoinColumn(name = "ID_CIDADE", nullable = false)
	private CidadeDomain cidadeDomain;
	
	@Column(name = "LOGRADOURO", nullable = false)
	private String logradouro;
	
	@Column(name = "COMPLEMENTO")
	private String complemento;
	
	@Column(name = "NUMERO", nullable = false)
	private String numero;
	
	@Column(name = "BAIRRO")
	private String bairro;
	
	@Column(name = "E_PRINCIPAL")
	private Boolean ePrincipal;
	
	@Column(name = "E_ATIVO", nullable = false)
	private Boolean eAtivo;
	
	public EnderecoDomain() { }

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Boolean getePrincipal() {
		return ePrincipal;
	}

	public void setePrincipal(Boolean ePrincipal) {
		this.ePrincipal = ePrincipal;
	}

	public Boolean geteAtivo() {
		return eAtivo;
	}

	public void seteAtivo(Boolean eAtivo) {
		this.eAtivo = eAtivo;
	}

}
