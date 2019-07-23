/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2019-2019. All rights reserved.
 */

package com.coolweather.android.gson;

/**
 * JSON返回api部分，解析成GSON结构
 *
 * @author l00510930
 * @since 2019-07-23
 */
public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;

        public String pm25;
    }
}
