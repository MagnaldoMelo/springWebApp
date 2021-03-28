package mmelo.springframework.springWebApp.repositories;

import mmelo.springframework.springWebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRespository extends CrudRepository<Book, Long> {
}
