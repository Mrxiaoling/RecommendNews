package cn.ling.news.recommend;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.apache.mahout.cf.taste.impl.model.jdbc.MySQLJDBCDataModel;
import org.apache.mahout.cf.taste.model.JDBCDataModel;

public class JDBCTest {
    public static void main(String[] args) {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setServerName("118.178.195.126");
        dataSource.setUser("root");
        dataSource.setPassword("547926");
        dataSource.setDatabaseName("news");
        JDBCDataModel dataModel = new MySQLJDBCDataModel(dataSource,news,"uid","iid","val","time");

        }
    }
}
