package com.example.android.miwok;

public class Word {

    private  String mEnglish;
    private  String mMiwok;
    private  int mImage=NO_IMG_PROVIDED;
    private static final int NO_IMG_PROVIDED=-1;
    private  int mAudioResourceID;

    public Word(String vEnglish, String vMiwok,int vAudioResourceID)
    {
        mEnglish = vEnglish;
        mMiwok = vMiwok;
        mAudioResourceID = vAudioResourceID;

    }

    public Word(String vEnglish, String vMiwok, int vImage, int vAudioResourceID)
    {
        mEnglish = vEnglish;
        mMiwok = vMiwok;
        mImage = vImage;
        mAudioResourceID = vAudioResourceID;

    }

    public String getEnglish()
    {
        return mEnglish;
    }

    public String getMiwok(){

        return mMiwok;
    }

    public int getImage(){

        return mImage;
    }

    public boolean hasImage(){
    return mImage!=NO_IMG_PROVIDED;
    }

    public int getAudioResourceID(){
        return mAudioResourceID;

    }

}
