package com.withings.features.platform.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import org.joda.time.DateTime;
/* compiled from: PlatformFeature.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 )2\u00020\u0001:\u0001)BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\b\u0010'\u001a\u00020(H\u0016R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010\u0017R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\u0011¨\u0006*"}, d2 = {"Lcom/withings/features/platform/model/Owner;", "Ljava/io/Serializable;", "active", "", "activable", "write", "modified", "", "startDate", "endDate", "frequency", "", "isTutorialSeen", "(ZZZJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Z)V", "getActivable", "()Z", "setActivable", "(Z)V", "getActive", "setActive", "getEndDate", "()Ljava/lang/Long;", "setEndDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getFrequency", "()Ljava/lang/Integer;", "setFrequency", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "setTutorialSeen", "getModified", "()J", "setModified", "(J)V", "getStartDate", "setStartDate", "getWrite", "setWrite", "toString", "", "Companion", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class Owner implements Serializable {
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

    /* compiled from: PlatformFeature.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/withings/features/platform/model/Owner$Companion;", "", "()V", "KEY_ACTIVE", "", "KEY_ACTIVE_ABLE", "KEY_DEVICE_ID", "KEY_END_DATE", "KEY_FREQUENCY", "KEY_MODIFIED", "KEY_START_DATE", "KEY_TUTORIAL", "KEY_WRITE", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public Owner(boolean z5, boolean z11, boolean z12, long j5, Long l5, Long l6, Integer num, boolean z13) {
        this.active = z5;
        this.activable = z11;
        this.write = z12;
        this.modified = j5;
        this.startDate = l5;
        this.endDate = l6;
        this.frequency = num;
        this.isTutorialSeen = z13;
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
        boolean z5 = this.active;
        boolean z11 = this.activable;
        boolean z12 = this.write;
        DateTime dateTime = new DateTime(this.modified);
        DateTime dateTime2 = new DateTime(this.startDate);
        DateTime dateTime3 = new DateTime(this.endDate);
        boolean z13 = this.isTutorialSeen;
        return "active " + z5 + ", activable " + z11 + ", write " + z12 + ", modified " + dateTime + ", startDate " + dateTime2 + ", endDate " + dateTime3 + ", isTutorialSeen " + z13;
    }

    public /* synthetic */ Owner(boolean z5, boolean z11, boolean z12, long j5, Long l5, Long l6, Integer num, boolean z13, int i11, m mVar) {
        this(z5, z11, z12, (i11 & 8) != 0 ? 0L : j5, l5, l6, num, z13);
    }
}
