package cn.ling.news.service.impl;

import cn.ling.news.dao.NewsMapper;
import cn.ling.news.pojo.News;
import cn.ling.news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;
    @Override
    public List<News> findAllNews() {
        return newsMapper.selectAll();
    }
}
