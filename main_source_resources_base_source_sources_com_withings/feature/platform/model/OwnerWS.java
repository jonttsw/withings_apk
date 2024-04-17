package com.withings.feature.platform.model;

import com.google.gson.annotations.SerializedName;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import java.io.Serializable;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
/* compiled from: OwnerWS.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 *2\u00020\u0001:\u0004)*+,BO\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\b\u0010'\u001a\u00020(H\u0016R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010\u0017R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\u0011\u0082\u0001\u0003-./¨\u00060"}, d2 = {"Lcom/withings/feature/platform/model/OwnerWS;", "Ljava/io/Serializable;", "active", "", "activable", "write", "modified", "", "startDate", "endDate", "frequency", "", "isTutorialSeen", "(ZZZJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Z)V", "getActivable", "()Z", "setActivable", "(Z)V", "getActive", "setActive", "getEndDate", "()Ljava/lang/Long;", "setEndDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getFrequency", "()Ljava/lang/Integer;", "setFrequency", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "setTutorialSeen", "getModified", "()J", "setModified", "(J)V", "getStartDate", "setStartDate", "getWrite", "setWrite", "toString", "", "AccountOwnerWS", "Companion", "DeviceOwnerWS", "UserOwnerWS", "Lcom/withings/feature/platform/model/OwnerWS$AccountOwnerWS;", "Lcom/withings/feature/platform/model/OwnerWS$DeviceOwnerWS;", "Lcom/withings/feature/platform/model/OwnerWS$UserOwnerWS;", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OwnerWS implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_ACTIVE = "active";
    public static final String KEY_ACTIVE_ABLE = "activable";
    public static final String KEY_DEVICE_ID = "deviceid";
    public static final String KEY_END_DATE = "enddate";
    public static final String KEY_FREQUENCY = "frequency";
    public static final String KEY_MODIFIED = "modified";
    public static final String KEY_START_DATE = "startdate";
    public static final String KEY_TUTORIAL = "tutorial";
    public static final String KEY_WRITE = "write";
    @SerializedName("activable")
    private boolean activable;
    @SerializedName("active")
    private boolean active;
    @SerializedName("enddate")
    private Long endDate;
    @SerializedName("frequency")
    private Integer frequency;
    @SerializedName("tutorial")
    private boolean isTutorialSeen;
    @SerializedName("modified")
    private long modified;
    @SerializedName("startdate")
    private Long startDate;
    @SerializedName("write")
    private boolean write;

    /* compiled from: OwnerWS.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\b\u0010\u0014\u001a\u00020\u0015H\u0016R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/withings/feature/platform/model/OwnerWS$AccountOwnerWS;", "Lcom/withings/feature/platform/model/OwnerWS;", "accountId", "", "active", "", "activable", "write", "modified", "startDate", "endDate", "frequency", "", "isTutorialSeen", "(Ljava/lang/Long;ZZZJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Z)V", "getAccountId", "()Ljava/lang/Long;", "setAccountId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "toString", "", "Companion", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class AccountOwnerWS extends OwnerWS {
        public static final Companion Companion = new Companion(null);
        public static final String KEY_ACCOUNT_ID = "accountid";
        @SerializedName("accountid")
        private Long accountId;

        /* compiled from: OwnerWS.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/feature/platform/model/OwnerWS$AccountOwnerWS$Companion;", "", "()V", "KEY_ACCOUNT_ID", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(m mVar) {
                this();
            }

            private Companion() {
            }
        }

        public AccountOwnerWS() {
            this(null, false, false, false, 0L, null, null, null, false, 511, null);
        }

        public final Long getAccountId() {
            return this.accountId;
        }

        public final void setAccountId(Long l5) {
            this.accountId = l5;
        }

        @Override // com.withings.feature.platform.model.OwnerWS
        public String toString() {
            Long l5 = this.accountId;
            String ownerWS = super.toString();
            return "AccountOwnerWS accountId " + l5 + ownerWS;
        }

        public /* synthetic */ AccountOwnerWS(Long l5, boolean z5, boolean z11, boolean z12, long j5, Long l6, Long l11, Integer num, boolean z13, int i11, m mVar) {
            this((i11 & 1) != 0 ? null : l5, (i11 & 2) != 0 ? false : z5, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? 0L : j5, (i11 & 32) != 0 ? null : l6, (i11 & 64) != 0 ? null : l11, (i11 & 128) == 0 ? num : null, (i11 & 256) == 0 ? z13 : false);
        }

        public AccountOwnerWS(Long l5, boolean z5, boolean z11, boolean z12, long j5, Long l6, Long l11, Integer num, boolean z13) {
            super(z5, z11, z12, j5, l6, l11, num, z13, null);
            this.accountId = l5;
        }
    }

    /* compiled from: OwnerWS.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/withings/feature/platform/model/OwnerWS$Companion;", "", "()V", "KEY_ACTIVE", "", "KEY_ACTIVE_ABLE", "KEY_DEVICE_ID", "KEY_END_DATE", "KEY_FREQUENCY", "KEY_MODIFIED", "KEY_START_DATE", "KEY_TUTORIAL", "KEY_WRITE", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: OwnerWS.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\b\u0010\u0014\u001a\u00020\u0015H\u0016R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/withings/feature/platform/model/OwnerWS$DeviceOwnerWS;", "Lcom/withings/feature/platform/model/OwnerWS;", "deviceId", "", "active", "", "activable", "write", "modified", "startDate", "endDate", "frequency", "", "isTutorialSeen", "(Ljava/lang/Long;ZZZJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Z)V", "getDeviceId", "()Ljava/lang/Long;", "setDeviceId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DeviceOwnerWS extends OwnerWS {
        @SerializedName("deviceid")
        private Long deviceId;

        public DeviceOwnerWS() {
            this(null, false, false, false, 0L, null, null, null, false, 511, null);
        }

        public final Long getDeviceId() {
            return this.deviceId;
        }

        public final void setDeviceId(Long l5) {
            this.deviceId = l5;
        }

        @Override // com.withings.feature.platform.model.OwnerWS
        public String toString() {
            Long l5 = this.deviceId;
            String ownerWS = super.toString();
            return "DeviceOwnerWS deviceId " + l5 + ownerWS;
        }

        public /* synthetic */ DeviceOwnerWS(Long l5, boolean z5, boolean z11, boolean z12, long j5, Long l6, Long l11, Integer num, boolean z13, int i11, m mVar) {
            this((i11 & 1) != 0 ? null : l5, (i11 & 2) != 0 ? false : z5, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? 0L : j5, (i11 & 32) != 0 ? null : l6, (i11 & 64) != 0 ? null : l11, (i11 & 128) == 0 ? num : null, (i11 & 256) == 0 ? z13 : false);
        }

        public DeviceOwnerWS(Long l5, boolean z5, boolean z11, boolean z12, long j5, Long l6, Long l11, Integer num, boolean z13) {
            super(z5, z11, z12, j5, l6, l11, num, z13, null);
            this.deviceId = l5;
        }
    }

    /* compiled from: OwnerWS.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006¢\u0006\u0002\u0010\u000fJ\b\u0010\u0017\u001a\u00020\u0018H\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/withings/feature/platform/model/OwnerWS$UserOwnerWS;", "Lcom/withings/feature/platform/model/OwnerWS;", NavigationArguments.USER_ID, "", "deviceId", "active", "", "activable", "write", "modified", "startDate", "endDate", "frequency", "", "isTutorialSeen", "(Ljava/lang/Long;Ljava/lang/Long;ZZZJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Z)V", "getDeviceId", "()Ljava/lang/Long;", "setDeviceId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getUserId", "setUserId", "toString", "", "Companion", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class UserOwnerWS extends OwnerWS {
        public static final Companion Companion = new Companion(null);
        public static final String KEY_USER_ID = "userid";
        @SerializedName("deviceid")
        private Long deviceId;
        @SerializedName("userid")
        private Long userId;

        /* compiled from: OwnerWS.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/feature/platform/model/OwnerWS$UserOwnerWS$Companion;", "", "()V", "KEY_USER_ID", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(m mVar) {
                this();
            }

            private Companion() {
            }
        }

        public UserOwnerWS() {
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

        @Override // com.withings.feature.platform.model.OwnerWS
        public String toString() {
            Long l5 = this.userId;
            String ownerWS = super.toString();
            return "UserOwnerApi userId " + l5 + ownerWS;
        }

        public /* synthetic */ UserOwnerWS(Long l5, Long l6, boolean z5, boolean z11, boolean z12, long j5, Long l11, Long l12, Integer num, boolean z13, int i11, m mVar) {
            this((i11 & 1) != 0 ? null : l5, (i11 & 2) != 0 ? null : l6, (i11 & 4) != 0 ? false : z5, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? 0L : j5, (i11 & 64) != 0 ? null : l11, (i11 & 128) != 0 ? null : l12, (i11 & 256) == 0 ? num : null, (i11 & 512) == 0 ? z13 : false);
        }

        public UserOwnerWS(Long l5, Long l6, boolean z5, boolean z11, boolean z12, long j5, Long l11, Long l12, Integer num, boolean z13) {
            super(z5, z11, z12, j5, l11, l12, num, z13, null);
            this.userId = l5;
            this.deviceId = l6;
        }
    }

    public /* synthetic */ OwnerWS(boolean z5, boolean z11, boolean z12, long j5, Long l5, Long l6, Integer num, boolean z13, m mVar) {
        this(z5, z11, z12, j5, l5, l6, num, z13);
    }

    public final boolean getActivable() {
        return this.activable;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final Long getEndDate() {
        return this.endDate;
    }

    public final Integer getFrequency() {
        return this.frequency;
    }

    public final long getModified() {
        return this.modified;
    }

    public final Long getStartDate() {
        return this.startDate;
    }

    public final boolean getWrite() {
        return this.write;
    }

    public final boolean isTutorialSeen() {
        return this.isTutorialSeen;
    }

    public final void setActivable(boolean z5) {
        this.activable = z5;
    }

    public final void setActive(boolean z5) {
        this.active = z5;
    }

    public final void setEndDate(Long l5) {
        this.endDate = l5;
    }

    public final void setFrequency(Integer num) {
        this.frequency = num;
    }

    public final void setModified(long j5) {
        this.modified = j5;
    }

    public final void setStartDate(Long l5) {
        this.startDate = l5;
    }

    public final void setTutorialSeen(boolean z5) {
        this.isTutorialSeen = z5;
    }

    public final void setWrite(boolean z5) {
        this.write = z5;
    }

    public String toString() {
        Date date;
        boolean z5 = this.active;
        boolean z11 = this.activable;
        boolean z12 = this.write;
        Date date2 = new Date(this.modified);
        Long l5 = this.startDate;
        Date date3 = null;
        if (l5 != null) {
            date = new Date(l5.longValue());
        } else {
            date = null;
        }
        Long l6 = this.endDate;
        if (l6 != null) {
            date3 = new Date(l6.longValue());
        }
        return "active " + z5 + ", activable " + z11 + ", write " + z12 + ", modified " + date2 + ", startDate " + date + ", endDate " + date3 + ", isTutorialSeen " + this.isTutorialSeen;
    }

    private OwnerWS(boolean z5, boolean z11, boolean z12, long j5, Long l5, Long l6, Integer num, boolean z13) {
        this.active = z5;
        this.activable = z11;
        this.write = z12;
        this.modified = j5;
        this.startDate = l5;
        this.endDate = l6;
        this.frequency = num;
        this.isTutorialSeen = z13;
    }

    public /* synthetic */ OwnerWS(boolean z5, boolean z11, boolean z12, long j5, Long l5, Long l6, Integer num, boolean z13, int i11, m mVar) {
        this(z5, z11, z12, (i11 & 8) != 0 ? 0L : j5, l5, l6, num, z13, null);
    }
}
