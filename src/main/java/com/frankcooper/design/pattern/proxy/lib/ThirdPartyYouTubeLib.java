package com.frankcooper.design.pattern.proxy.lib;

import java.util.HashMap;

/**
 * @author: wangzhou(Frank Cooper)
 * @date: 2022/3/9 14:23
 * @description:
 */
public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}