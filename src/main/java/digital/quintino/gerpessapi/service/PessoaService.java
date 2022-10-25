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

}
