package com.demo.rxretro.network;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Admin on 9/12/2019.
 */

public class getmodal  {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private List<GiftDataPojoDatum> data = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<GiftDataPojoDatum> getData() {
        return data;
    }

    public void setData(List<GiftDataPojoDatum> data) {
        this.data = data;
    }

}