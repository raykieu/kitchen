/**
 * FileName: TwoMenuInfo
 * Author:   wyr
 * Date:     2019/1/9 11:24
 * Description: 主页导航栏烘培素食主义煲汤本周佳作的展示类
 */

package com.qfedu.vo;

public class TwoMenuInfo {
    private Integer id;//类型id
    private String name;//类型名
    private String info; //该条数据的标题
    private Integer sid;//该条数据id
    private String img_url;
    private String video_url;
    private String cook_name; //用户名
    private Integer like_count;//点赞量
    private Integer collect_count;
    private Integer play_count;
    private Integer look_count; //浏览量
    private Integer clid;  //对应的点赞收藏的表id

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public String getCook_name() {
        return cook_name;
    }

    public void setCook_name(String cook_name) {
        this.cook_name = cook_name;
    }

    public Integer getLike_count() {
        return like_count;
    }

    public void setLike_count(Integer like_count) {
        this.like_count = like_count;
    }

    public Integer getCollect_count() {
        return collect_count;
    }

    public void setCollect_count(Integer collect_count) {
        this.collect_count = collect_count;
    }

    public Integer getPlay_count() {
        return play_count;
    }

    public void setPlay_count(Integer play_count) {
        this.play_count = play_count;
    }

    public Integer getLook_count() {
        return look_count;
    }

    public void setLook_count(Integer look_count) {
        this.look_count = look_count;
    }

    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }



}
