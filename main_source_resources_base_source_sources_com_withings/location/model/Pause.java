package com.withings.location.model;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: Pause.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/withings/location/model/Pause;", "", "start", "Lorg/joda/time/DateTime;", "end", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getEnd", "()Lorg/joda/time/DateTime;", "getStart", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Pause {
    private final DateTime end;
    private final DateTime start;

    public Pause(DateTime start, DateTime end) {
        u.j(start, "start");
        u.j(end, "end");
        this.start = start;
        this.end = end;
    }

    public static /* synthetic */ Pause copy$default(Pause pause, DateTime dateTime, DateTime dateTime2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dateTime = pause.start;
        }
        if ((i11 & 2) != 0) {
            dateTime2 = pause.end;
        }
        return pause.copy(dateTime, dateTime2);
    }

    public final DateTime component1() {
        return this.start;
    }

    public final DateTime component2() {
        return this.end;
    }

    public final Pause copy(DateTime start, DateTime end) {
        u.j(start, "start");
        u.j(end, "end");
        return new Pause(start, end);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pause)) {
            return false;
        }
        Pause pause = (Pause) obj;
        if (u.e(this.start, pause.start) && u.e(this.end, pause.end)) {
            return true;
        }
        return false;
    }

    public final DateTime getEnd() {
        return this.end;
    }

    public final DateTime getStart() {
        return this.start;
    }

    public int hashCode() {
        return this.end.hashCode() + (this.start.hashCode() * 31);
    }

    public String toString() {
        DateTime dateTime = this.start;
        DateTime dateTime2 = this.end;
        return "Pause(start=" + dateTime + ", end=" + dateTime2 + ")";
    }
}
