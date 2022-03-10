package com.frankcooper.design.pattern.proxy.lib;

/**
 * @author: wangzhou(Frank Cooper)
 * @date: 2022/3/9 14:24
 * @description:
 */
public class Video {
    public String id;
    public String title;
    public String data;

    Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }
}