/**
 * FileName: TwoMenuInfo
 * Author:   wyr
 * Date:     2019/1/9 11:24
 * Description: 主页导航栏烘培素食主义煲汤本周佳作的展示类
 */

package com.qfedu.vo;

public class TwoMenuInfo {
    private String name;
    private String info;
    private String img_url;
    private String video_url;
    private String cook_name;
    private Integer like_count;
    private Integer collect_count;
    private Integer play_count;

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public String getImg_url() {
        return img_url;
    }

    public String getVideo_url() {
        return video_url;
    }

    public String getCook_name() {
        return cook_name;
    }

    public Integer getLike_count() {
        return like_count;
    }

    public Integer getCollect_count() {
        return collect_count;
    }

    public Integer getPlay_count() {
        return play_count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public void setViedo_url(String viedo_url) {
        this.video_url = viedo_url;
    }

    public void setCook_name(String cook_name) {
        this.cook_name = cook_name;
    }

    public void setLike_count(Integer like_count) {
        this.like_count = like_count;
    }

    public void setCollect_count(Integer collect_count) {
        this.collect_count = collect_count;
    }

    public void setPlay_count(Integer play_count) {
        this.play_count = play_count;
    }
}
