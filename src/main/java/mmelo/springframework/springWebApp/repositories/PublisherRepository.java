package mmelo.springframework.springWebApp.repositories;

import mmelo.springframework.springWebApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
