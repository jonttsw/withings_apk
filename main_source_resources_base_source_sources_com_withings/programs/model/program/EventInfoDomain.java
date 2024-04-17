package com.withings.programs.model.program;

import androidx.activity.result.c;
import androidx.camera.camera2.internal.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: EventInfoDomain.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0006\u0010\u0019\u001a\u00020\u0015J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/withings/programs/model/program/EventInfoDomain;", "", "identifier", "", "title", "startDate", "", "endDate", "(Ljava/lang/String;Ljava/lang/String;JJ)V", "getEndDate", "()J", "getIdentifier", "()Ljava/lang/String;", "getStartDate", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "isCurrentTime", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EventInfoDomain {
    private final long endDate;
    private final String identifier;
    private final long startDate;
    private final String title;

    public EventInfoDomain(String identifier, String title, long j5, long j11) {
        u.j(identifier, "identifier");
        u.j(title, "title");
        this.identifier = identifier;
        this.title = title;
        this.startDate = j5;
        this.endDate = j11;
    }

    public static /* synthetic */ EventInfoDomain copy$default(EventInfoDomain eventInfoDomain, String str, String str2, long j5, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = eventInfoDomain.identifier;
        }
        if ((i11 & 2) != 0) {
            str2 = eventInfoDomain.title;
        }
        String str3 = str2;
        if ((i11 & 4) != 0) {
            j5 = eventInfoDomain.startDate;
        }
        long j12 = j5;
        if ((i11 & 8) != 0) {
            j11 = eventInfoDomain.endDate;
        }
        return eventInfoDomain.copy(str, str3, j12, j11);
    }

    public final String component1() {
        return this.identifier;
    }

    public final String component2() {
        return this.title;
    }

    public final long component3() {
        return this.startDate;
    }

    public final long component4() {
        return this.endDate;
    }

    public final EventInfoDomain copy(String identifier, String title, long j5, long j11) {
        u.j(identifier, "identifier");
        u.j(title, "title");
        return new EventInfoDomain(identifier, title, j5, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventInfoDomain)) {
            return false;
        }
        EventInfoDomain eventInfoDomain = (EventInfoDomain) obj;
        if (u.e(this.identifier, eventInfoDomain.identifier) && u.e(this.title, eventInfoDomain.title) && this.startDate == eventInfoDomain.startDate && this.endDate == eventInfoDomain.endDate) {
            return true;
        }
        return false;
    }

    public final long getEndDate() {
        return this.endDate;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final long getStartDate() {
        return this.startDate;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Long.hashCode(this.endDate) + c.a(this.startDate, d.c(this.title, this.identifier.hashCode() * 31, 31), 31);
    }

    public final boolean isCurrentTime() {
        long millis = DateTime.now().getMillis() / 1000;
        long j5 = this.startDate;
        if (millis > this.endDate || j5 > millis) {
            return false;
        }
        return true;
    }

    public String toString() {
        String str = this.identifier;
        String str2 = this.title;
        long j5 = this.startDate;
        long j11 = this.endDate;
        StringBuilder b10 = l0.b("EventInfoDomain(identifier=", str, ", title=", str2, ", startDate=");
        b10.append(j5);
        b10.append(", endDate=");
        b10.append(j11);
        b10.append(")");
        return b10.toString();
    }
}
