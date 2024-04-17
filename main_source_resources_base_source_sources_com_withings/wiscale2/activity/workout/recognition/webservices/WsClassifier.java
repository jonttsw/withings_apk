package com.withings.wiscale2.activity.workout.recognition.webservices;

import com.google.gson.annotations.SerializedName;
import org.joda.time.DateTime;
/* loaded from: classes4.dex */
public class WsClassifier {
    @SerializedName("qclf_basic_indices")
    public int[] basicIndices;
    @SerializedName("qclf_basic_nbins")
    public int[] basicNbins;
    @SerializedName("qclf_basic_values")
    public float[] basicValues;
    @SerializedName("qclf_c2feat_indices")
    public int[] c2featIndices;
    @SerializedName("qclf_c2feat_nbins")
    public int[] c2featNbins;
    @SerializedName("qclf_c2feat_values")
    public float[] c2featValues;
    @SerializedName("qclf_cfeat_indices")
    public int[] cfeatIndices;
    @SerializedName("qclf_cfeat_nbins")
    public int[] cfeatNbins;
    @SerializedName("qclf_cfeat_values")
    public float[] cfeatValues;
    public int[] subcategories;

    /* loaded from: classes4.dex */
    public static class Response {
        public WsClassifier classifier;
        @SerializedName("actirecfmt")
        public int format;
        @SerializedName("modified")
        public DateTime modifiedTime;
        @SerializedName("recognition")
        public boolean recognizeAllActivities;
    }
}
