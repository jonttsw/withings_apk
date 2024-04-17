package com.withings.webservices.legacy.withings.model.plan;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import org.joda.time.DateTime;
/* loaded from: classes4.dex */
public class Plan {
    public static final String PLAN_STATE_CANCEL = "cancel";
    public static final String PLAN_STATE_EXPIRED = "expired";
    public static final String PLAN_STATE_ONGOING = "ongoing";
    public static final String PLAN_STATE_PENDING = "pending";
    public static final String PLAN_STATE_UPGRADED = "upgraded";
    public static final String PLAN_STATE_WAITING_DEVICE = "waiting_device";
    @SerializedName("accountid")
    public long accountId;
    @SerializedName("deviceid")
    public long deviceId;

    /* renamed from: id  reason: collision with root package name */
    public long f46865id;
    @SerializedName(FirebaseAnalytics.Param.START_DATE)
    public DateTime startDate;
    public String state;
    public int type;
}
