package cn.ling.news;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"cn.ling.news.dao"})
public class NewsApplication {
    public static void main(String[] args) {
        SpringApplication.run(NewsApplication.class, args);
    }
}
