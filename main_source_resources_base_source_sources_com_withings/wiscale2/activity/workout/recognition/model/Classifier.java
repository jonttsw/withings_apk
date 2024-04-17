package com.withings.wiscale2.activity.workout.recognition.model;

import com.withings.wiscale2.activity.workout.recognition.webservices.WsClassifier;
import org.joda.time.DateTime;
/* loaded from: classes4.dex */
public class Classifier {
    private int[] basicIndices;
    private int[] basicNbins;
    private float[] basicValues;
    private int[] c2featIndices;
    private int[] c2featNbins;
    private float[] c2featValues;
    private int[] cfeatIndices;
    private int[] cfeatNbins;
    private float[] cfeatValues;
    private int format;
    private DateTime modificationDate;
    private boolean recognizeAllActivities;
    private int[] subcategories;
    private long userId;
    private int version;

    public Classifier() {
    }

    public int[] getBasicIndices() {
        return this.basicIndices;
    }

    public int[] getBasicNbins() {
        return this.basicNbins;
    }

    public float[] getBasicValues() {
        return this.basicValues;
    }

    public int[] getC2featIndices() {
        return this.c2featIndices;
    }

    public int[] getC2featNbins() {
        return this.c2featNbins;
    }

    public float[] getC2featValues() {
        return this.c2featValues;
    }

    public int[] getCfeatIndices() {
        return this.cfeatIndices;
    }

    public int[] getCfeatNbins() {
        return this.cfeatNbins;
    }

    public float[] getCfeatValues() {
        return this.cfeatValues;
    }

    public int getFormat() {
        return this.format;
    }

    public DateTime getModificationDate() {
        return this.modificationDate;
    }

    public int[] getSubcategories() {
        return this.subcategories;
    }

    public long getUserId() {
        return this.userId;
    }

    public int getVersion() {
        return this.version;
    }

    public void setBasicIndices(int[] iArr) {
        this.basicIndices = iArr;
    }

    public void setBasicNbins(int[] iArr) {
        this.basicNbins = iArr;
    }

    public void setBasicValues(float[] fArr) {
        this.basicValues = fArr;
    }

    public void setC2featIndices(int[] iArr) {
        this.c2featIndices = iArr;
    }

    public void setC2featNbins(int[] iArr) {
        this.c2featNbins = iArr;
    }

    public void setC2featValues(float[] fArr) {
        this.c2featValues = fArr;
    }

    public void setCfeatIndices(int[] iArr) {
        this.cfeatIndices = iArr;
    }

    public void setCfeatNbins(int[] iArr) {
        this.cfeatNbins = iArr;
    }

    public void setCfeatValues(float[] fArr) {
        this.cfeatValues = fArr;
    }

    public void setFormat(int i11) {
        this.format = i11;
    }

    public void setModificationDate(DateTime dateTime) {
        this.modificationDate = dateTime;
    }

    public void setRecognizeAllActivities(boolean z5) {
        this.recognizeAllActivities = z5;
    }

    public void setSubcategories(int[] iArr) {
        this.subcategories = iArr;
    }

    public void setUserId(long j5) {
        this.userId = j5;
    }

    public void setVersion(int i11) {
        this.version = i11;
    }

    public boolean shouldRecognizeAllActivities() {
        return this.recognizeAllActivities;
    }

    public Classifier(long j5, int i11, WsClassifier.Response response) {
        WsClassifier wsClassifier = response.classifier;
        this.userId = j5;
        this.subcategories = wsClassifier.subcategories;
        this.cfeatNbins = wsClassifier.cfeatNbins;
        this.cfeatIndices = wsClassifier.cfeatIndices;
        this.cfeatValues = wsClassifier.cfeatValues;
        this.c2featNbins = wsClassifier.c2featNbins;
        this.c2featIndices = wsClassifier.c2featIndices;
        this.c2featValues = wsClassifier.c2featValues;
        this.basicNbins = wsClassifier.basicNbins;
        this.basicIndices = wsClassifier.basicIndices;
        this.basicValues = wsClassifier.basicValues;
        this.version = i11;
        this.format = response.format;
        this.recognizeAllActivities = response.recognizeAllActivities;
        this.modificationDate = response.modifiedTime;
    }
}
