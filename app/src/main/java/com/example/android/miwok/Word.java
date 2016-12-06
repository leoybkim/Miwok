package com.example.android.miwok;

/**
 * Created by leo on 03/12/16.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     *
     * @param defaultTranslation
     * @param miwokTranslation
     * @param audioResourceId
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }


    /**
     *
     * @param defaultTranslation
     * @param miwokTranslation
     * @param audioResourceId
     * @param imageResourceId
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
        mImageResourceId = imageResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() { return mImageResourceId; }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId () { return mAudioResourceId; }

}
