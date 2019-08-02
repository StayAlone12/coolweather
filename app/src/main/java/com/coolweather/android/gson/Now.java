/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2019-2019. All rights reserved.
 */

package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Json返回数据Now部分数据结构
 *
 * @author l00510930
 * @since 2019-07-23
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
