package cn.ling.news.pojo;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
@Table(name = "NEWS")
public class News implements Serializable {
    @Column(name = "id")
    private String id;
    @Column(name = "link")
    private String link;
    @Column(name = "title")
    private String title;
    @Column(name = "created_at")
    private String createdtime;
    @Column(name = "updated_at")
    private String updatedtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(String createdtime) {
        this.createdtime = createdtime;
    }

    public String getUpdatedtime() {
        return updatedtime;
    }

    public void setUpdatedtime(String updatedtime) {
        this.updatedtime = updatedtime;
    }
}
