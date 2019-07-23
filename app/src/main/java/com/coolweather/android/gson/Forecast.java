/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2019-2019. All rights reserved.
 */

package com.coolweather.android.gson;

/**
 * 天气预报
 *
 * @author l00510930
 * @since 2019-07-23
 */
public class Forecast {
    public String date;

    public Temperature temperature;

    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        public String info;
    }
}
