package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

/**
 * 省表实体类
 * 记录省的信息，id、名字、编码
 *
 * @author l00510930
 * @since 2019-07-22
 */
public class Province extends LitePalSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
