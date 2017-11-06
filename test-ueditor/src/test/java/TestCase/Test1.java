package TestCase;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wh51net.text.service.NoteService;

public class Test1 {
	
	
	@Resource
	NoteService noteService;
	
	ApplicationContext ctx;
	
	@Before
	public void before() {		
		ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml","spring-pool.xml");
	}
	
	@Test
	public void test1() {
		
		DataSource ds = (DataSource)ctx.getBean("dataSource");
		System.out.println(ds);
		
	}
	
	@Test
	public void test2() {
		SqlSessionFactory sf = (SqlSessionFactory)ctx.getBean("sqlSessionFactory");
		System.out.println(sf);
	}
	
	
}
