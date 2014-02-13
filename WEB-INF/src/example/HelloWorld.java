package example;

import java.sql.Connection;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.opensymphony.xwork2.ActionSupport;

@Component
public class HelloWorld extends ActionSupport {

    @Autowired
    private BasicDataSource dataSource;

    @Transactional(rollbackFor=Throwable.class)
    public String execute() throws Exception {
    	Connection con = DataSourceUtils.getConnection(dataSource);
    	DataSourceUtils.releaseConnection(con, dataSource);
        return SUCCESS;
    }

}
