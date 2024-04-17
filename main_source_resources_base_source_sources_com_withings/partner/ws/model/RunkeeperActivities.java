package com.withings.partner.ws.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.u;
/* compiled from: RunkeeperActivities.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/withings/partner/ws/model/RunkeeperActivities;", "", "()V", "activities", "", "Lcom/withings/partner/ws/model/RunkeeperActivity;", "getActivities", "()Ljava/util/List;", "setActivities", "(Ljava/util/List;)V", "toString", "", "partner_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RunkeeperActivities {
    @SerializedName("measuregrps")
    private List<RunkeeperActivity> activities = i0.f76187a;

    public final List<RunkeeperActivity> getActivities() {
        return this.activities;
    }

    public final void setActivities(List<RunkeeperActivity> list) {
        u.j(list, "<set-?>");
        this.activities = list;
    }

    public String toString() {
        return this.activities.toString();
    }
}
