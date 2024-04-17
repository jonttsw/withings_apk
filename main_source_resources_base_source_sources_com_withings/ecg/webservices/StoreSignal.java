package com.withings.ecg.webservices;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/withings/ecg/webservices/StoreSignal;", "", "signalid", "", "modified", "Lorg/joda/time/DateTime;", "(JLorg/joda/time/DateTime;)V", "getModified", "()Lorg/joda/time/DateTime;", "getSignalid", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ecg_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StoreSignal {
    public static final int $stable = 8;
    private final DateTime modified;
    private final long signalid;

    public StoreSignal(long j5, DateTime modified) {
        u.j(modified, "modified");
        this.signalid = j5;
        this.modified = modified;
    }

    public static /* synthetic */ StoreSignal copy$default(StoreSignal storeSignal, long j5, DateTime dateTime, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j5 = storeSignal.signalid;
        }
        if ((i11 & 2) != 0) {
            dateTime = storeSignal.modified;
        }
        return storeSignal.copy(j5, dateTime);
    }

    public final long component1() {
        return this.signalid;
    }

    public final DateTime component2() {
        return this.modified;
    }

    public final StoreSignal copy(long j5, DateTime modified) {
        u.j(modified, "modified");
        return new StoreSignal(j5, modified);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreSignal)) {
            return false;
        }
        StoreSignal storeSignal = (StoreSignal) obj;
        if (this.signalid == storeSignal.signalid && u.e(this.modified, storeSignal.modified)) {
            return true;
        }
        return false;
    }

    public final DateTime getModified() {
        return this.modified;
    }

    public final long getSignalid() {
        return this.signalid;
    }

    public int hashCode() {
        return this.modified.hashCode() + (Long.hashCode(this.signalid) * 31);
    }

    public String toString() {
        long j5 = this.signalid;
        DateTime dateTime = this.modified;
        return "StoreSignal(signalid=" + j5 + ", modified=" + dateTime + ")";
    }
}
