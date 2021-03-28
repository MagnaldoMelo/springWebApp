package mmelo.springframework.springWebApp.repositories;

import mmelo.springframework.springWebApp.domain.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
