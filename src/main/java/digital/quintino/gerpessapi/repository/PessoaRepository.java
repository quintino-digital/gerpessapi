package digital.quintino.gerpessapi.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import digital.quintino.gerpessapi.domain.PessoaDomain;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaDomain, UUID> { 
	public List<PessoaDomain> findByTipoPessoaDomainCodigo(UUID codigo);
}
