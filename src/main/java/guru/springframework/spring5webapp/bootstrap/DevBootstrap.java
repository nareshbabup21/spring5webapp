package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.model.Publisher;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;


/**
 * created by naresh on 11/28/19
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authRepository = authRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
     initData();
    }

    private void initData(){

   Publisher publisherfoo = new Publisher();
        publisherfoo.setName("foo");
    publisherRepository.save(publisherfoo);

        Publisher publisherrod = new Publisher();
        publisherrod.setName("rod");
        publisherRepository.save(publisherrod);

    //Eric
    Author eric = new Author("Eric", "Evans");
    Book ddd = new Book("Domain Driven Design",  "1234",  publisherfoo);
    eric.getBook().add(ddd);
    authRepository.save(eric);
    bookRepository.save(ddd);
    //Rod
    Author rod = new Author("Rod", "Johnson");
    Book noEJB = new Book("J2EE Development without EJB", "23444", publisherrod);
    rod.getBook().add(noEJB);
    authRepository.save(rod);
    bookRepository.save(noEJB);

}

}
