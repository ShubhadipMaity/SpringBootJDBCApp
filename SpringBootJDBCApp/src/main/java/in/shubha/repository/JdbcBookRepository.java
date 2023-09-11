package in.shubha.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.shubha.entity.Book;

@Repository
public class JdbcBookRepository implements BookRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public int save(Book book) {
		System.out.println(jdbcTemplate);
		
	int rowAffected=jdbcTemplate.update("insert into book values(?,?,?)",book.getId(),book.getName(),book.getCost());
		
	return rowAffected;
	}

}
