package mmelo.springframework.springWebApp.repositories;

import mmelo.springframework.springWebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
