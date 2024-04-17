package com.withings.leaderboard.repositories.data;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: LeaderboardEntry.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002BS\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0011\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0000H\u0096\u0002J\u0010\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003Jb\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010\u001f\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u0004HÖ\u0001J\t\u0010.\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006/"}, d2 = {"Lcom/withings/leaderboard/repositories/data/LeaderboardEntry;", "Ljava/io/Serializable;", "", "id", "", "date", "", "userid", "", FirebaseAnalytics.Param.SCORE, "firstname", "lastName", "imageUrl", "modified", "Lorg/joda/time/DateTime;", "(Ljava/lang/Integer;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "getDate", "()Ljava/lang/String;", "getFirstname", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImageUrl", "getLastName", "getModified", "()Lorg/joda/time/DateTime;", "getScore", "()I", "getUserid", "()J", "compareTo", "other", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;)Lcom/withings/leaderboard/repositories/data/LeaderboardEntry;", "equals", "", "", "hashCode", "toString", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LeaderboardEntry implements Serializable, Comparable<LeaderboardEntry> {
    public static final int $stable = 8;
    private final String date;
    private final String firstname;

    /* renamed from: id  reason: collision with root package name */
    private final Integer f40609id;
    private final String imageUrl;
    private final String lastName;
    private final DateTime modified;
    private final int score;
    private final long userid;

    public LeaderboardEntry(Integer num, String date, long j5, int i11, String firstname, String lastName, String str, DateTime modified) {
        u.j(date, "date");
        u.j(firstname, "firstname");
        u.j(lastName, "lastName");
        u.j(modified, "modified");
        this.f40609id = num;
        this.date = date;
        this.userid = j5;
        this.score = i11;
        this.firstname = firstname;
        this.lastName = lastName;
        this.imageUrl = str;
        this.modified = modified;
    }

    public static /* synthetic */ LeaderboardEntry copy$default(LeaderboardEntry leaderboardEntry, Integer num, String str, long j5, int i11, String str2, String str3, String str4, DateTime dateTime, int i12, Object obj) {
        Integer num2;
        String str5;
        long j11;
        int i13;
        String str6;
        String str7;
        String str8;
        DateTime dateTime2;
        if ((i12 & 1) != 0) {
            num2 = leaderboardEntry.f40609id;
        } else {
            num2 = num;
        }
        if ((i12 & 2) != 0) {
            str5 = leaderboardEntry.date;
        } else {
            str5 = str;
        }
        if ((i12 & 4) != 0) {
            j11 = leaderboardEntry.userid;
        } else {
            j11 = j5;
        }
        if ((i12 & 8) != 0) {
            i13 = leaderboardEntry.score;
        } else {
            i13 = i11;
        }
        if ((i12 & 16) != 0) {
            str6 = leaderboardEntry.firstname;
        } else {
            str6 = str2;
        }
        if ((i12 & 32) != 0) {
            str7 = leaderboardEntry.lastName;
        } else {
            str7 = str3;
        }
        if ((i12 & 64) != 0) {
            str8 = leaderboardEntry.imageUrl;
        } else {
            str8 = str4;
        }
        if ((i12 & 128) != 0) {
            dateTime2 = leaderboardEntry.modified;
        } else {
            dateTime2 = dateTime;
        }
        return leaderboardEntry.copy(num2, str5, j11, i13, str6, str7, str8, dateTime2);
    }

    public final Integer component1() {
        return this.f40609id;
    }

    public final String component2() {
        return this.date;
    }

    public final long component3() {
        return this.userid;
    }

    public final int component4() {
        return this.score;
    }

    public final String component5() {
        return this.firstname;
    }

    public final String component6() {
        return this.lastName;
    }

    public final String component7() {
        return this.imageUrl;
    }

    public final DateTime component8() {
        return this.modified;
    }

    public final LeaderboardEntry copy(Integer num, String date, long j5, int i11, String firstname, String lastName, String str, DateTime modified) {
        u.j(date, "date");
        u.j(firstname, "firstname");
        u.j(lastName, "lastName");
        u.j(modified, "modified");
        return new LeaderboardEntry(num, date, j5, i11, firstname, lastName, str, modified);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardEntry)) {
            return false;
        }
        LeaderboardEntry leaderboardEntry = (LeaderboardEntry) obj;
        if (u.e(this.f40609id, leaderboardEntry.f40609id) && u.e(this.date, leaderboardEntry.date) && this.userid == leaderboardEntry.userid && this.score == leaderboardEntry.score && u.e(this.firstname, leaderboardEntry.firstname) && u.e(this.lastName, leaderboardEntry.lastName) && u.e(this.imageUrl, leaderboardEntry.imageUrl) && u.e(this.modified, leaderboardEntry.modified)) {
            return true;
        }
        return false;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getFirstname() {
        return this.firstname;
    }

    public final Integer getId() {
        return this.f40609id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final DateTime getModified() {
        return this.modified;
    }

    public final int getScore() {
        return this.score;
    }

    public final long getUserid() {
        return this.userid;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.f40609id;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int c11 = d.c(this.lastName, d.c(this.firstname, h.a(this.score, c.a(this.userid, d.c(this.date, hashCode * 31, 31), 31), 31), 31), 31);
        String str = this.imageUrl;
        if (str != null) {
            i11 = str.hashCode();
        }
        return this.modified.hashCode() + ((c11 + i11) * 31);
    }

    public String toString() {
        Integer num = this.f40609id;
        String str = this.date;
        long j5 = this.userid;
        int i11 = this.score;
        String str2 = this.firstname;
        String str3 = this.lastName;
        String str4 = this.imageUrl;
        DateTime dateTime = this.modified;
        StringBuilder sb2 = new StringBuilder("LeaderboardEntry(id=");
        sb2.append(num);
        sb2.append(", date=");
        sb2.append(str);
        sb2.append(", userid=");
        sb2.append(j5);
        sb2.append(", score=");
        sb2.append(i11);
        b.d(sb2, ", firstname=", str2, ", lastName=", str3);
        sb2.append(", imageUrl=");
        sb2.append(str4);
        sb2.append(", modified=");
        sb2.append(dateTime);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(LeaderboardEntry other) {
        u.j(other, "other");
        return u.l(other.score, this.score);
    }

    public /* synthetic */ LeaderboardEntry(Integer num, String str, long j5, int i11, String str2, String str3, String str4, DateTime dateTime, int i12, m mVar) {
        this((i12 & 1) != 0 ? null : num, str, j5, (i12 & 8) != 0 ? 0 : i11, (i12 & 16) != 0 ? "" : str2, (i12 & 32) != 0 ? "" : str3, str4, (i12 & 128) != 0 ? new DateTime(0L) : dateTime);
    }
}
