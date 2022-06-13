package ec.edu.espe.tesis.repository;

import ec.edu.espe.tesis.model.ERole;
import ec.edu.espe.tesis.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {

    Optional<Role> findByName(ERole name);

}
