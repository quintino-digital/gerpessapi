package digital.quintino.gerpessapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import digital.quintino.gerpessapi.domain.TipoEnderecoDomain;

@Repository
public interface TipoEnderecoRepository extends JpaRepository<TipoEnderecoDomain, Long> { }
