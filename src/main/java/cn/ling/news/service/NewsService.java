package cn.ling.news.service;

import cn.ling.news.pojo.News;

import java.util.List;

public interface NewsService {
    List<News> findAllNews();
}
