package com.example.swachhbharat;

import android.graphics.Bitmap;

public class item {
    String date,time,address;
    Bitmap userPhoto;

    public item(String date, String time, String address, Bitmap userPhoto){
        this.time=time;
        this.date=date;
        this.address=address;
        this.userPhoto=userPhoto;
    }
    public void setTime(String time ) {this.time= time;}

    public void setDate(String date) {
        this.date = date;
    }

    public void setAddress(String address) {
        this.address =address;
    }

    public void getUserPhoto(Bitmap image) {
        this.userPhoto=userPhoto;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public String getAddress() {
        return address;
    }

    public Bitmap getUserPhoto() {
        return userPhoto;
    }
}
