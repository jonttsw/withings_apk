package com.withings.device.ws;

import com.google.gson.annotations.SerializedName;
import com.withings.webservices.legacy.withings.model.timeline.AlertEnvironmentItemData;
import com.withings.webservices.legacy.withings.model.timeline.MovementDetectedItemData;
import com.withings.webservices.legacy.withings.model.timeline.NoiseDetectedItemData;
/* loaded from: classes3.dex */
public class ByAccountSettings {
    @SerializedName("accountid")
    public long accountId;
    @SerializedName(AlertEnvironmentItemData.WS_TYPE)
    public int alertEnvironment;
    @SerializedName("confighomeid")
    public int configHomeId;
    public int connection;
    public long created;
    @SerializedName("deviceid")
    public long deviceId;
    public long modified;
    @SerializedName(MovementDetectedItemData.WS_TYPE)
    public int movementDetected;
    @SerializedName(NoiseDetectedItemData.WS_TYPE)
    public int noiseDetected;
    @SerializedName("person_detected")
    public int personDetected;
    public boolean push;
}
