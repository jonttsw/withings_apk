package com.withings.features.platform.model;

import com.google.gson.annotations.SerializedName;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
/* compiled from: PlatformFeature.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006¢\u0006\u0002\u0010\u000fJ\b\u0010\u0017\u001a\u00020\u0018H\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/withings/features/platform/model/UserOwner;", "Lcom/withings/features/platform/model/Owner;", NavigationArguments.USER_ID, "", "deviceId", "active", "", "activable", "write", "modified", "startDate", "endDate", "frequency", "", "isTutorialSeen", "(Ljava/lang/Long;Ljava/lang/Long;ZZZJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Z)V", "getDeviceId", "()Ljava/lang/Long;", "setDeviceId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getUserId", "setUserId", "toString", "", "Companion", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserOwner extends Owner {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_USER_ID = "userid";
    @SerializedName("deviceid")
    private Long deviceId;
    @SerializedName("userid")
    private Long userId;

    /* compiled from: PlatformFeature.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/features/platform/model/UserOwner$Companion;", "", "()V", "KEY_USER_ID", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public UserOwner() {
        this(null, null, false, false, false, 0L, null, null, null, false, 1023, null);
    }

    public final Long getDeviceId() {
        return this.deviceId;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public final void setDeviceId(Long l5) {
        this.deviceId = l5;
    }

    public final void setUserId(Long l5) {
        this.userId = l5;
    }

    @Override // com.withings.features.platform.model.Owner
    public String toString() {
        Long l5 = this.userId;
        String owner = super.toString();
        return "UserOwner userId " + l5 + owner;
    }

    public /* synthetic */ UserOwner(Long l5, Long l6, boolean z5, boolean z11, boolean z12, long j5, Long l11, Long l12, Integer num, boolean z13, int i11, m mVar) {
        this((i11 & 1) != 0 ? null : l5, (i11 & 2) != 0 ? null : l6, (i11 & 4) != 0 ? false : z5, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? 0L : j5, (i11 & 64) != 0 ? null : l11, (i11 & 128) != 0 ? null : l12, (i11 & 256) == 0 ? num : null, (i11 & 512) == 0 ? z13 : false);
    }

    public UserOwner(Long l5, Long l6, boolean z5, boolean z11, boolean z12, long j5, Long l11, Long l12, Integer num, boolean z13) {
        super(z5, z11, z12, j5, l11, l12, num, z13);
        this.userId = l5;
        this.deviceId = l6;
    }
}
