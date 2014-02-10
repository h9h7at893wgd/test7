package example;

import java.sql.Connection;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

@Component
public class HelloWorld extends ActionSupport {

    @Autowired
    private BasicDataSource dataSource;
    public void setDataSource(BasicDataSource dataSource){
    	this.dataSource = dataSource;
    }

    public String execute() throws Exception {

    	Connection con = dataSource.getConnection();
    	con.close();

        return SUCCESS;
    }
}
