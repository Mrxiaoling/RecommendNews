package cn.ling.news.controller;

import cn.ling.news.entiy.Result;
import cn.ling.news.entiy.StatusCode;
import cn.ling.news.pojo.News;
import cn.ling.news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Action;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping(value = "/allnews")
    public Result<News> findAllNews(){
        List<News> news = newsService.findAllNews();
        return new Result<News>(true,StatusCode.OK,"查询成功",news);
    }

}
