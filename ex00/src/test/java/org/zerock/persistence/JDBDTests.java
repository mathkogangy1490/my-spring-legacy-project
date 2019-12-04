package org.zerock.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBDTests {

	static {
		try {
			Class.forName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection(){
		try	(Connection con =
			DriverManager.getConnection(
			"jdbc:log4jdbc:mysql://localhost:3306/book_ex?serverTimezone=Asia/Seoul&useSSL=false&allowPublicKeyRetrieval=true",
			"book_ex",
			"math3039")){
				
			log.info(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
