package szymon.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import szymon.springframework.spring5webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
