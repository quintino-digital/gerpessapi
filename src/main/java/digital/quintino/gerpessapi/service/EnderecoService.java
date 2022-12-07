package digital.quintino.gerpessapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import digital.quintino.gerpessapi.domain.CidadeDomain;
import digital.quintino.gerpessapi.domain.EnderecoDomain;
import digital.quintino.gerpessapi.domain.PessoaDomain;
import digital.quintino.gerpessapi.domain.TipoEnderecoDomain;
import digital.quintino.gerpessapi.repository.CidadeRepository;
import digital.quintino.gerpessapi.repository.EnderecoRepository;
import digital.quintino.gerpessapi.repository.PessoaRepository;
import digital.quintino.gerpessapi.repository.TipoEnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private TipoEnderecoRepository tipoEnderecoRepository;
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public EnderecoDomain saveOne(EnderecoDomain enderecoDomain) {
		return this.enderecoRepository.save(this.configurarEndereco(enderecoDomain));
	}
	
	public List<EnderecoDomain> saveAll(List<EnderecoDomain> enderecoDomainList) {
		return this.enderecoRepository.saveAll(enderecoDomainList);
	}
	
	public List<EnderecoDomain> findAll() {
		return this.enderecoRepository.findAll();
	}
	
	private EnderecoDomain configurarEndereco(EnderecoDomain enderecoDomain) {
		CidadeDomain cidadeDomain = this.cidadeRepository.findById(enderecoDomain.getCidadeDomain().getCodigo()).get();
		TipoEnderecoDomain tipoEnderecoDomain = this.tipoEnderecoRepository.findById(enderecoDomain.getTipoEnderecoDomain().getCodigo()).get();
		PessoaDomain pessoaDomain = this.pessoaRepository.findById(enderecoDomain.getPessoaDomain().getCodigo()).get();
			enderecoDomain.setTipoEnderecoDomain(tipoEnderecoDomain);
			enderecoDomain.setCidadeDomain(cidadeDomain);
			enderecoDomain.setPessoaDomain(pessoaDomain);
		return enderecoDomain;
	}
	
}
