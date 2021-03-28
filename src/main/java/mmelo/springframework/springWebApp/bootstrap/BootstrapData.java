package mmelo.springframework.springWebApp.bootstrap;

import mmelo.springframework.springWebApp.domain.Address;
import mmelo.springframework.springWebApp.domain.Author;
import mmelo.springframework.springWebApp.domain.Book;
import mmelo.springframework.springWebApp.domain.Publisher;
import mmelo.springframework.springWebApp.repositories.AddressRepository;
import mmelo.springframework.springWebApp.repositories.AuthorRepository;
import mmelo.springframework.springWebApp.repositories.BookRespository;
import mmelo.springframework.springWebApp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRespository bookRespository;
    private final AddressRepository addressRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRespository bookRespository, AddressRepository addressRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRespository = bookRespository;
        this.addressRepository = addressRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author author = new Author();
        author.setFirstName("Magnaldo");
        author.setLastName("Melo");

        Book book = new Book();
        book.setTitle("Java");
        book.setIsbn("123456");

        book.getAuthors().add(author);
        author.getBooks().add(book);

        this.authorRepository.save(author);
        this.bookRespository.save(book);

        System.out.println("Bootstrap Starting");
        System.out.println("Books: " + this.bookRespository.count());
        System.out.println("Authors: " + this.authorRepository.count());

        Publisher publisher = new Publisher();
        publisher.setName("Primeira Publicação");

        Address address = new Address();
        address.setAddresses("Rua Espirito Santo");
        address.setCity("Campina Grande");
        address.setState("Paraiba");
        address.setZip("58414670");

        publisher.setAddress(address);
        address.setPublisher(publisher);

        this.publisherRepository.save(publisher);
        this.addressRepository.save(address);

        System.out.println("Publishers: " + this.publisherRepository.count());
        System.out.println("Addresses: " + this.addressRepository.count());
    }
}
