package Factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class ConnectionFactory {
	public DataSource dataSource;
	
	public ConnectionFactory() {
		ComboPooledDataSource comboPool = new ComboPooledDataSource();
        comboPool.setJdbcUrl("jdbc:mysql://localhost/hotel_alura?useTimeZone=true&serverTimeZone=UTC");
        comboPool.setUser("root");
        comboPool.setPassword("root1234");
        
        
        this.dataSource = comboPool;
        
	}
	 public Connection recuperaConexion() {
	        try {
	            return this.dataSource.getConnection();
	        } catch (SQLException e) {
	        	System.out.println("Hay un error");
	            throw new RuntimeException(e);
	        }
	    }
	
}
