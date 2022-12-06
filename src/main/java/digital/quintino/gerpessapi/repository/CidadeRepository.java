package digital.quintino.gerpessapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import digital.quintino.gerpessapi.domain.CidadeDomain;

@Repository
public interface CidadeRepository extends JpaRepository<CidadeDomain, Long> { }
