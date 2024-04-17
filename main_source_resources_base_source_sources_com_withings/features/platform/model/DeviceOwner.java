package com.withings.features.platform.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
/* compiled from: PlatformFeature.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\b\u0010\u0014\u001a\u00020\u0015H\u0016R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/withings/features/platform/model/DeviceOwner;", "Lcom/withings/features/platform/model/Owner;", "deviceId", "", "active", "", "activable", "write", "modified", "startDate", "endDate", "frequency", "", "isTutorialSeen", "(Ljava/lang/Long;ZZZJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Z)V", "getDeviceId", "()Ljava/lang/Long;", "setDeviceId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeviceOwner extends Owner {
    @SerializedName("deviceid")
    private Long deviceId;

    public DeviceOwner() {
        this(null, false, false, false, 0L, null, null, null, false, 511, null);
    }

    public final Long getDeviceId() {
        return this.deviceId;
    }

    public final void setDeviceId(Long l5) {
        this.deviceId = l5;
    }

    @Override // com.withings.features.platform.model.Owner
    public String toString() {
        Long l5 = this.deviceId;
        String owner = super.toString();
        return "DeviceOwner deviceId " + l5 + owner;
    }

    public /* synthetic */ DeviceOwner(Long l5, boolean z5, boolean z11, boolean z12, long j5, Long l6, Long l11, Integer num, boolean z13, int i11, m mVar) {
        this((i11 & 1) != 0 ? null : l5, (i11 & 2) != 0 ? false : z5, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? 0L : j5, (i11 & 32) != 0 ? null : l6, (i11 & 64) != 0 ? null : l11, (i11 & 128) == 0 ? num : null, (i11 & 256) == 0 ? z13 : false);
    }

    public DeviceOwner(Long l5, boolean z5, boolean z11, boolean z12, long j5, Long l6, Long l11, Integer num, boolean z13) {
        super(z5, z11, z12, j5, l6, l11, num, z13);
        this.deviceId = l5;
    }
}
