package in.shubha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.shubha.entity.Book;
import in.shubha.repository.JdbcBookRepository;

@SpringBootApplication
public class SpringBootJdbcAppApplication {

	
	
	public static void main(String[] args) {
	ApplicationContext applicationContext=SpringApplication.run(SpringBootJdbcAppApplication.class, args);
	
	JdbcBookRepository bookrepository=applicationContext.getBean(JdbcBookRepository.class);
	
	Book book=new Book();
	book.setId(2);
	book.setName("Core Java");
	book.setCost(3500);
	
	int recordUpdate=bookrepository.save(book);
	System.out.println("No of Record inserted is :: "+recordUpdate);
	
	}
	


}
