package harry.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import harry.springframework.spring5webapp.domain.Author;

// Go to defanitions - For methods of this interface
// Taking id and database;

public interface AuthorRepository extends CrudRepository<Author,Long> {
    
}

