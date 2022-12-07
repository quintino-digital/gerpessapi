package digital.quintino.gerpessapi.repository;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import digital.quintino.gerpessapi.domain.PessoaDomain;

@Repository
public class PessoaImplementacaoRepository { 
	
	@PersistenceContext
	private EntityManager entityManager;
	
	// TODO -- Corrigir problemas com UUID como Chave Primária
	public PessoaDomain recuperarPessoa(UUID codigo) {
		StringBuilder query = new StringBuilder("SELECT pessoaDomain_ ")
				.append("FROM PessoaDomain pessoaDomain_ ")
				.append("WHERE pessoaDomain_.codigo = :codigoPessoaParameter ");
		TypedQuery<PessoaDomain> typedQuery = this.entityManager.createQuery(query.toString(), PessoaDomain.class);
			typedQuery.setParameter("codigoPessoaParameter", codigo);
		return typedQuery.getSingleResult();
	}
	
}
