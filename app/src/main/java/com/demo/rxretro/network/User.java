package com.demo.rxretro.network;


import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Admin on 9/2/2019.
 */

public class User extends BaseResponse {

    private Integer id;
    private String phoneNumber;
    private String userName;
    private String userImage;
    private String userThum;
    private Integer accountBalance;
    private String jobTitle;
    private String businessName;
    private String businessInfo;
    private String businessImage;
    private String busiThum;
    private String businessFbPage;
    private String category;
    private String locationName;
    private String country;
    private String address;
    private String lat;
    private String lon;
    private String stripeId;
    private String lastDigits;
    private String deviceType;
    private String deviceToken;
    private Integer chatNoti;
    private Integer chatSound;
    private Integer newTicketNoti;
    private Integer newTicketSound;
    private Integer newSellNoti;
    private Integer newSellSound;
    private Integer widget;
    private Integer dimensionSys;
    private Integer isDelete;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getUserThum() {
        return userThum;
    }

    public void setUserThum(String userThum) {
        this.userThum = userThum;
    }

    public Integer getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Integer accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessInfo() {
        return businessInfo;
    }

    public void setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
    }

    public String getBusinessImage() {
        return businessImage;
    }

    public void setBusinessImage(String businessImage) {
        this.businessImage = businessImage;
    }

    public String getBusiThum() {
        return busiThum;
    }

    public void setBusiThum(String busiThum) {
        this.busiThum = busiThum;
    }

    public String getBusinessFbPage() {
        return businessFbPage;
    }

    public void setBusinessFbPage(String businessFbPage) {
        this.businessFbPage = businessFbPage;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getStripeId() {
        return stripeId;
    }

    public void setStripeId(String stripeId) {
        this.stripeId = stripeId;
    }

    public String getLastDigits() {
        return lastDigits;
    }

    public void setLastDigits(String lastDigits) {
        this.lastDigits = lastDigits;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    public Integer getChatNoti() {
        return chatNoti;
    }

    public void setChatNoti(Integer chatNoti) {
        this.chatNoti = chatNoti;
    }

    public Integer getChatSound() {
        return chatSound;
    }

    public void setChatSound(Integer chatSound) {
        this.chatSound = chatSound;
    }

    public Integer getNewTicketNoti() {
        return newTicketNoti;
    }

    public void setNewTicketNoti(Integer newTicketNoti) {
        this.newTicketNoti = newTicketNoti;
    }

    public Integer getNewTicketSound() {
        return newTicketSound;
    }

    public void setNewTicketSound(Integer newTicketSound) {
        this.newTicketSound = newTicketSound;
    }

    public Integer getNewSellNoti() {
        return newSellNoti;
    }

    public void setNewSellNoti(Integer newSellNoti) {
        this.newSellNoti = newSellNoti;
    }

    public Integer getNewSellSound() {
        return newSellSound;
    }

    public void setNewSellSound(Integer newSellSound) {
        this.newSellSound = newSellSound;
    }

    public Integer getWidget() {
        return widget;
    }

    public void setWidget(Integer widget) {
        this.widget = widget;
    }

    public Integer getDimensionSys() {
        return dimensionSys;
    }

    public void setDimensionSys(Integer dimensionSys) {
        this.dimensionSys = dimensionSys;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}