package harry.springframework.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import harry.springframework.spring5webapp.domain.Author;
import harry.springframework.spring5webapp.domain.Book;
import harry.springframework.spring5webapp.domain.Publisher;
import harry.springframework.spring5webapp.repositories.AuthorRepository;
import harry.springframework.spring5webapp.repositories.BookRepository;
import harry.springframework.spring5webapp.repositories.PublisherRepository;

// Component means->    This is Spring manage component  
// We are saving it java-spring In-database,   That is H2 databse,  




@Component
public class BootStrapData implements CommandLineRunner{


    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;


    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository,PublisherRepository publicrepo) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository=publicrepo;
    }


    @Override
    public void run(String... args) throws Exception {
        // Publishers

        Publisher p= new Publisher("harry singh","talwan road phillaur");
        publisherRepository.save(p);// P is some kind of json

        // Author1
        Author author= new Author("Amneet","Singh");
        Book b=new Book("Game_of_thrones","its awsome");
        author.getBooks().add(b);
        b.getAuthors().add(author);
        b.setPublisher(p);
        p.getBooks().add(b);


        authorRepository.save(author);
        bookRepository.save(b);
        publisherRepository.save(p);



        // Author 2
        Author author1= new Author("Amneet","Singh");
        Book b1=new Book("Game_of_thrones","its awsome");
        author1.getBooks().add(b1);
        b1.getAuthors().add(author1);
        b1.setPublisher(p);
        p.getBooks().add(b1);

        authorRepository.save(author1);
        bookRepository.save(b1);
        publisherRepository.save(p);




        // Now we have to give publisher the book and give book the publisher;


        
        System.out.println("Started in Bootstrap");
        System.out.println("Number of books-> "+bookRepository.count());
        System.out.println("Number of Authors-> "+authorRepository.count());
        System.out.println("Number of publishers-> "+publisherRepository.count());
        System.out.print(" Publisher number of boks "+p.getBooks().size());



        
    }
    
}
