package guru.springframework.spring5webapp.repositories;
import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * created by naresh 11/28/19
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
