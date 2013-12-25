package example;

import java.sql.Connection;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorld extends ActionSupport {

    @Autowired
    private BasicDataSource dataSource;

    public String execute() throws Exception {

    	Connection con = dataSource.getConnection();
    	con.close();

        return SUCCESS;
    }
}
