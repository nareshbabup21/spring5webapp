package repositories;
import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * created by naresh on 11/28/19
 */

public interface AuthorRepository extends CrudRepository<Author, Long> {


}

