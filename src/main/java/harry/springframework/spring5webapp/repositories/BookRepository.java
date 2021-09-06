package harry.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import harry.springframework.spring5webapp.domain.Book;



// Go to defanitions - For methods of this interface
// Taking id and database;
public interface BookRepository extends CrudRepository<Book,Long> {
    
}