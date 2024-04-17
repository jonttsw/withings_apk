package com.withings.device.ws;

import com.google.gson.annotations.SerializedName;
import com.withings.library.authentication.api.ConstantsWs;
import java.io.Serializable;
import org.joda.time.DateTime;
/* loaded from: classes3.dex */
public class Association implements Serializable {
    public long accountid;
    public long associationid;
    public DateTime created;
    public long deviceid;
    public String devicename;
    public DeviceProperties deviceproperties;
    @SerializedName(ConstantsWs.JSON_SESSION_KEY_KL)
    public String klSecret;
    public DateTime modified;
}
