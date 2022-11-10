package digital.quintino.gerpessapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import digital.quintino.gerpessapi.domain.PessoaDomain;
import digital.quintino.gerpessapi.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public PessoaDomain saveOne(PessoaDomain pessoaDomain) {
		return this.pessoaRepository.save(pessoaDomain);
	}
	
	public List<PessoaDomain> findAll() {
		return this.pessoaRepository.findAll();
	}
	
	// TODO -- Tratar Exception para registros nao encontrados
	public PessoaDomain findOne(Long codigo) {
		return this.pessoaRepository.findById(codigo).get();
	}
	
	public List<PessoaDomain> recuperarPessoaJuridica() {
		return this.pessoaRepository.findByTipoPessoaDomainCodigo(2L);
	}
	
	public PessoaDomain updateOne(PessoaDomain pessoaDomain, Long codigo) {
		PessoaDomain pessoaDomainAntiga = this.findOne(codigo);
			pessoaDomainAntiga.setNome(pessoaDomain.getNome());
			pessoaDomainAntiga.setTipoPessoaDomain(pessoaDomain.getTipoPessoaDomain());
		return this.pessoaRepository.save(pessoaDomainAntiga);
	}
	
	public void deleteOne(Long codigo) {
		PessoaDomain pessoaDomain = this.findOne(codigo);
		if(pessoaDomain != null) {
			this.pessoaRepository.deleteById(codigo);
		}
	}
	
}
