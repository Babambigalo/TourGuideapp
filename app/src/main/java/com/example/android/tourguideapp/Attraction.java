package com.example.android.tourguideapp;

/**
 * Created by nmatveev on 18.10.2017.
 */

public class Attraction {
    private String mAdress;
    private String mName;
    private String mNumber;
    private int mImageId;


//    public Attraction(String name,String adress,int number){
//        mAdress = adress;
//        mName = name;
//        mNumber = number;
//    }


    public Attraction(String name,String adress,String number,int imageId){
        mAdress = adress;
        mName = name;
        mNumber = number;
        mImageId = imageId;
    }


    public int getmImageId() {
        return mImageId;
    }

    public String getmNumber() {
        return mNumber;
    }

    public String getmAdress() {
        return mAdress;
    }

    public String getmName() {
        return mName;
    }

    public void setmAdress(String adress) {
        mAdress = adress;
    }

    public void setmImageId(int imageId) {
        mImageId = imageId;
    }

    public void setmName(String name) {
        mName = name;
    }

    public void setmNumber(String number) {
        mNumber = number;
    }
}
