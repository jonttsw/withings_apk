package com.withings.leaderboard.repositories.webservice.entries;

import androidx.appcompat.app.h;
import com.withings.webservices.legacy.withings.model.ImagesP4;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: LeaderboardEntry.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/withings/leaderboard/repositories/webservice/entries/LeaderboardWSEntry;", "", "userid", "", "value", "", "firstname", "", "lastname", "p4", "Lcom/withings/webservices/legacy/withings/model/ImagesP4;", "modified", "Lorg/joda/time/DateTime;", "(JILjava/lang/String;Ljava/lang/String;Lcom/withings/webservices/legacy/withings/model/ImagesP4;Lorg/joda/time/DateTime;)V", "getFirstname", "()Ljava/lang/String;", "getLastname", "getModified", "()Lorg/joda/time/DateTime;", "getP4", "()Lcom/withings/webservices/legacy/withings/model/ImagesP4;", "getUserid", "()J", "getValue", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LeaderboardWSEntry {
    public static final int $stable = 8;
    private final String firstname;
    private final String lastname;
    private final DateTime modified;

    /* renamed from: p4  reason: collision with root package name */
    private final ImagesP4 f40611p4;
    private final long userid;
    private final int value;

    public LeaderboardWSEntry(long j5, int i11, String firstname, String lastname, ImagesP4 p42, DateTime modified) {
        u.j(firstname, "firstname");
        u.j(lastname, "lastname");
        u.j(p42, "p4");
        u.j(modified, "modified");
        this.userid = j5;
        this.value = i11;
        this.firstname = firstname;
        this.lastname = lastname;
        this.f40611p4 = p42;
        this.modified = modified;
    }

    public static /* synthetic */ LeaderboardWSEntry copy$default(LeaderboardWSEntry leaderboardWSEntry, long j5, int i11, String str, String str2, ImagesP4 imagesP4, DateTime dateTime, int i12, Object obj) {
        long j11;
        int i13;
        String str3;
        String str4;
        ImagesP4 imagesP42;
        DateTime dateTime2;
        if ((i12 & 1) != 0) {
            j11 = leaderboardWSEntry.userid;
        } else {
            j11 = j5;
        }
        if ((i12 & 2) != 0) {
            i13 = leaderboardWSEntry.value;
        } else {
            i13 = i11;
        }
        if ((i12 & 4) != 0) {
            str3 = leaderboardWSEntry.firstname;
        } else {
            str3 = str;
        }
        if ((i12 & 8) != 0) {
            str4 = leaderboardWSEntry.lastname;
        } else {
            str4 = str2;
        }
        if ((i12 & 16) != 0) {
            imagesP42 = leaderboardWSEntry.f40611p4;
        } else {
            imagesP42 = imagesP4;
        }
        if ((i12 & 32) != 0) {
            dateTime2 = leaderboardWSEntry.modified;
        } else {
            dateTime2 = dateTime;
        }
        return leaderboardWSEntry.copy(j11, i13, str3, str4, imagesP42, dateTime2);
    }

    public final long component1() {
        return this.userid;
    }

    public final int component2() {
        return this.value;
    }

    public final String component3() {
        return this.firstname;
    }

    public final String component4() {
        return this.lastname;
    }

    public final ImagesP4 component5() {
        return this.f40611p4;
    }

    public final DateTime component6() {
        return this.modified;
    }

    public final LeaderboardWSEntry copy(long j5, int i11, String firstname, String lastname, ImagesP4 p42, DateTime modified) {
        u.j(firstname, "firstname");
        u.j(lastname, "lastname");
        u.j(p42, "p4");
        u.j(modified, "modified");
        return new LeaderboardWSEntry(j5, i11, firstname, lastname, p42, modified);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardWSEntry)) {
            return false;
        }
        LeaderboardWSEntry leaderboardWSEntry = (LeaderboardWSEntry) obj;
        if (this.userid == leaderboardWSEntry.userid && this.value == leaderboardWSEntry.value && u.e(this.firstname, leaderboardWSEntry.firstname) && u.e(this.lastname, leaderboardWSEntry.lastname) && u.e(this.f40611p4, leaderboardWSEntry.f40611p4) && u.e(this.modified, leaderboardWSEntry.modified)) {
            return true;
        }
        return false;
    }

    public final String getFirstname() {
        return this.firstname;
    }

    public final String getLastname() {
        return this.lastname;
    }

    public final DateTime getModified() {
        return this.modified;
    }

    public final ImagesP4 getP4() {
        return this.f40611p4;
    }

    public final long getUserid() {
        return this.userid;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        int c11 = d.c(this.lastname, d.c(this.firstname, h.a(this.value, Long.hashCode(this.userid) * 31, 31), 31), 31);
        return this.modified.hashCode() + ((this.f40611p4.hashCode() + c11) * 31);
    }

    public String toString() {
        long j5 = this.userid;
        int i11 = this.value;
        String str = this.firstname;
        String str2 = this.lastname;
        ImagesP4 imagesP4 = this.f40611p4;
        DateTime dateTime = this.modified;
        StringBuilder sb2 = new StringBuilder("LeaderboardWSEntry(userid=");
        sb2.append(j5);
        sb2.append(", value=");
        sb2.append(i11);
        b.d(sb2, ", firstname=", str, ", lastname=", str2);
        sb2.append(", p4=");
        sb2.append(imagesP4);
        sb2.append(", modified=");
        sb2.append(dateTime);
        sb2.append(")");
        return sb2.toString();
    }
}
