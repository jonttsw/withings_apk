package com.withings.device.ws;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes3.dex */
public class Associations implements Serializable {
    @SerializedName("associations")
    public List<Association> list;
}
