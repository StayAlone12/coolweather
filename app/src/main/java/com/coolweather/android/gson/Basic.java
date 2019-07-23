/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2019-2019. All rights reserved.
 */

package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Json数据中basic部分内容
 * 包含城市、编号、更新日期
 *
 * @author l00510930
 * @since 2019-07-23
 */
public class Basic {
    /**
     * JSON中的一些字段不太适合直接作为Java字段来命名，
     * 这里使用注解@SerializedName注解的方式来让JSON字段和Java字段之间建立映射关系
     */

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        public String updateTime;
    }
}
