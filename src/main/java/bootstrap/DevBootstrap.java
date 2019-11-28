package bootstrap;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import repositories.AuthorRepository;
import repositories.BookRepository;


/**
 * created by naresh on 11/28/19
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authRepository, BookRepository bookRepository) {
        this.authRepository = authRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
     initData();
    }

    private void initData(){

    //Eric
    Author eric = new Author("Eric", "Evans");
    Book ddd = new Book("Domain Driven Design",  "1234",  "Harper Collins");
    eric.getBook().add(ddd);
    authRepository.save(eric);
    bookRepository.save(ddd);
    //Rod
    Author rod = new Author("Rod", "Johnson");
    Book noEJB = new Book("J2EE Development without EJB", "23444", "Worx");
    rod.getBook().add(noEJB);
    authRepository.save(rod);
    bookRepository.save(noEJB);

}

}
