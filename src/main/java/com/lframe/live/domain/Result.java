package com.lframe.live.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author home-pc
 * @create2018 -02 -05 -6:37
 */
public class Result<T> {

    /*** 状态码.*/
    private Integer code;

    /*** 提示信息.*/
    private String meg;

    /*** 具体的内容
     * 其中@JsonProperty("datas")能够改变返回的json数据的名字
     * 把data改为了datas
     * */
//    @JsonProperty("datas")
    private List<T> data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMeg() {
        return meg;
    }

    public void setMeg(String meg) {
        this.meg = meg;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
