package digital.quintino.gerpessapi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import digital.quintino.gerpessapi.domain.EnderecoDomain;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoDomain, UUID> { }
