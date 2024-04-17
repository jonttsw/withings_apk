package com.withings.webservices.legacy.lastupdate;

import com.google.android.gms.internal.mlkit_common.a;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: AccountLastUpdate.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006$"}, d2 = {"Lcom/withings/webservices/legacy/lastupdate/AccountLastUpdate;", "", "id", "", "plan", "Lorg/joda/time/DateTime;", "wellness", "virtualdevice", "modified", "features", "timelineSection", "(JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getFeatures", "()Lorg/joda/time/DateTime;", "getId", "()J", "getModified", "getPlan", "getTimelineSection", "getVirtualdevice", "getWellness", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "webservices-legacy_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AccountLastUpdate {
    private final DateTime features;

    /* renamed from: id  reason: collision with root package name */
    private final long f46849id;
    private final DateTime modified;
    private final DateTime plan;
    private final DateTime timelineSection;
    private final DateTime virtualdevice;
    private final DateTime wellness;

    public AccountLastUpdate() {
        this(0L, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ AccountLastUpdate copy$default(AccountLastUpdate accountLastUpdate, long j5, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, DateTime dateTime5, DateTime dateTime6, int i11, Object obj) {
        long j11;
        DateTime dateTime7;
        DateTime dateTime8;
        DateTime dateTime9;
        DateTime dateTime10;
        DateTime dateTime11;
        DateTime dateTime12;
        if ((i11 & 1) != 0) {
            j11 = accountLastUpdate.f46849id;
        } else {
            j11 = j5;
        }
        if ((i11 & 2) != 0) {
            dateTime7 = accountLastUpdate.plan;
        } else {
            dateTime7 = dateTime;
        }
        if ((i11 & 4) != 0) {
            dateTime8 = accountLastUpdate.wellness;
        } else {
            dateTime8 = dateTime2;
        }
        if ((i11 & 8) != 0) {
            dateTime9 = accountLastUpdate.virtualdevice;
        } else {
            dateTime9 = dateTime3;
        }
        if ((i11 & 16) != 0) {
            dateTime10 = accountLastUpdate.modified;
        } else {
            dateTime10 = dateTime4;
        }
        if ((i11 & 32) != 0) {
            dateTime11 = accountLastUpdate.features;
        } else {
            dateTime11 = dateTime5;
        }
        if ((i11 & 64) != 0) {
            dateTime12 = accountLastUpdate.timelineSection;
        } else {
            dateTime12 = dateTime6;
        }
        return accountLastUpdate.copy(j11, dateTime7, dateTime8, dateTime9, dateTime10, dateTime11, dateTime12);
    }

    public final long component1() {
        return this.f46849id;
    }

    public final DateTime component2() {
        return this.plan;
    }

    public final DateTime component3() {
        return this.wellness;
    }

    public final DateTime component4() {
        return this.virtualdevice;
    }

    public final DateTime component5() {
        return this.modified;
    }

    public final DateTime component6() {
        return this.features;
    }

    public final DateTime component7() {
        return this.timelineSection;
    }

    public final AccountLastUpdate copy(long j5, DateTime plan, DateTime wellness, DateTime virtualdevice, DateTime modified, DateTime features, DateTime timelineSection) {
        u.j(plan, "plan");
        u.j(wellness, "wellness");
        u.j(virtualdevice, "virtualdevice");
        u.j(modified, "modified");
        u.j(features, "features");
        u.j(timelineSection, "timelineSection");
        return new AccountLastUpdate(j5, plan, wellness, virtualdevice, modified, features, timelineSection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountLastUpdate)) {
            return false;
        }
        AccountLastUpdate accountLastUpdate = (AccountLastUpdate) obj;
        if (this.f46849id == accountLastUpdate.f46849id && u.e(this.plan, accountLastUpdate.plan) && u.e(this.wellness, accountLastUpdate.wellness) && u.e(this.virtualdevice, accountLastUpdate.virtualdevice) && u.e(this.modified, accountLastUpdate.modified) && u.e(this.features, accountLastUpdate.features) && u.e(this.timelineSection, accountLastUpdate.timelineSection)) {
            return true;
        }
        return false;
    }

    public final DateTime getFeatures() {
        return this.features;
    }

    public final long getId() {
        return this.f46849id;
    }

    public final DateTime getModified() {
        return this.modified;
    }

    public final DateTime getPlan() {
        return this.plan;
    }

    public final DateTime getTimelineSection() {
        return this.timelineSection;
    }

    public final DateTime getVirtualdevice() {
        return this.virtualdevice;
    }

    public final DateTime getWellness() {
        return this.wellness;
    }

    public int hashCode() {
        return this.timelineSection.hashCode() + a.b(this.features, a.b(this.modified, a.b(this.virtualdevice, a.b(this.wellness, a.b(this.plan, Long.hashCode(this.f46849id) * 31, 31), 31), 31), 31), 31);
    }

    public String toString() {
        long j5 = this.f46849id;
        DateTime dateTime = this.plan;
        DateTime dateTime2 = this.wellness;
        DateTime dateTime3 = this.virtualdevice;
        DateTime dateTime4 = this.modified;
        DateTime dateTime5 = this.features;
        DateTime dateTime6 = this.timelineSection;
        return "AccountLastUpdate(id=" + j5 + ", plan=" + dateTime + ", wellness=" + dateTime2 + ", virtualdevice=" + dateTime3 + ", modified=" + dateTime4 + ", features=" + dateTime5 + ", timelineSection=" + dateTime6 + ")";
    }

    public AccountLastUpdate(long j5, DateTime plan, DateTime wellness, DateTime virtualdevice, DateTime modified, DateTime features, DateTime timelineSection) {
        u.j(plan, "plan");
        u.j(wellness, "wellness");
        u.j(virtualdevice, "virtualdevice");
        u.j(modified, "modified");
        u.j(features, "features");
        u.j(timelineSection, "timelineSection");
        this.f46849id = j5;
        this.plan = plan;
        this.wellness = wellness;
        this.virtualdevice = virtualdevice;
        this.modified = modified;
        this.features = features;
        this.timelineSection = timelineSection;
    }

    public /* synthetic */ AccountLastUpdate(long j5, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, DateTime dateTime5, DateTime dateTime6, int i11, m mVar) {
        this((i11 & 1) != 0 ? 0L : j5, (i11 & 2) != 0 ? new DateTime(0L) : dateTime, (i11 & 4) != 0 ? new DateTime(0L) : dateTime2, (i11 & 8) != 0 ? new DateTime(0L) : dateTime3, (i11 & 16) != 0 ? new DateTime(0L) : dateTime4, (i11 & 32) != 0 ? new DateTime(0L) : dateTime5, (i11 & 64) != 0 ? new DateTime(0L) : dateTime6);
    }
}
