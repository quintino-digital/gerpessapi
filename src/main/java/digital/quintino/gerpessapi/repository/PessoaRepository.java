package digital.quintino.gerpessapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import digital.quintino.gerpessapi.domain.PessoaDomain;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaDomain, Long> { 
	public List<PessoaDomain> findByTipoPessoaDomainCodigo(Long codigo);
	public PessoaDomain findByCodigo(Long codigo);
}
