package com.withings.leaderboard.ui.screen;

import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.e;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: LeaderBoardUiEntry.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/withings/leaderboard/ui/screen/LeaderBoardUiEntry;", "", "isMainUser", "", "imgUrl", "", "name", FirebaseAnalytics.Param.SCORE, "", "position", "(ZLjava/lang/String;Ljava/lang/String;II)V", "getImgUrl", "()Ljava/lang/String;", "()Z", "getName", "getPosition", "()I", "getScore", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LeaderBoardUiEntry {
    public static final int $stable = 0;
    private final String imgUrl;
    private final boolean isMainUser;
    private final String name;
    private final int position;
    private final int score;

    public LeaderBoardUiEntry(boolean z5, String str, String name, int i11, int i12) {
        u.j(name, "name");
        this.isMainUser = z5;
        this.imgUrl = str;
        this.name = name;
        this.score = i11;
        this.position = i12;
    }

    public static /* synthetic */ LeaderBoardUiEntry copy$default(LeaderBoardUiEntry leaderBoardUiEntry, boolean z5, String str, String str2, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z5 = leaderBoardUiEntry.isMainUser;
        }
        if ((i13 & 2) != 0) {
            str = leaderBoardUiEntry.imgUrl;
        }
        String str3 = str;
        if ((i13 & 4) != 0) {
            str2 = leaderBoardUiEntry.name;
        }
        String str4 = str2;
        if ((i13 & 8) != 0) {
            i11 = leaderBoardUiEntry.score;
        }
        int i14 = i11;
        if ((i13 & 16) != 0) {
            i12 = leaderBoardUiEntry.position;
        }
        return leaderBoardUiEntry.copy(z5, str3, str4, i14, i12);
    }

    public final boolean component1() {
        return this.isMainUser;
    }

    public final String component2() {
        return this.imgUrl;
    }

    public final String component3() {
        return this.name;
    }

    public final int component4() {
        return this.score;
    }

    public final int component5() {
        return this.position;
    }

    public final LeaderBoardUiEntry copy(boolean z5, String str, String name, int i11, int i12) {
        u.j(name, "name");
        return new LeaderBoardUiEntry(z5, str, name, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderBoardUiEntry)) {
            return false;
        }
        LeaderBoardUiEntry leaderBoardUiEntry = (LeaderBoardUiEntry) obj;
        if (this.isMainUser == leaderBoardUiEntry.isMainUser && u.e(this.imgUrl, leaderBoardUiEntry.imgUrl) && u.e(this.name, leaderBoardUiEntry.name) && this.score == leaderBoardUiEntry.score && this.position == leaderBoardUiEntry.position) {
            return true;
        }
        return false;
    }

    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPosition() {
        return this.position;
    }

    public final int getScore() {
        return this.score;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Boolean.hashCode(this.isMainUser) * 31;
        String str = this.imgUrl;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Integer.hashCode(this.position) + h.a(this.score, d.c(this.name, (hashCode2 + hashCode) * 31, 31), 31);
    }

    public final boolean isMainUser() {
        return this.isMainUser;
    }

    public String toString() {
        boolean z5 = this.isMainUser;
        String str = this.imgUrl;
        String str2 = this.name;
        int i11 = this.score;
        int i12 = this.position;
        StringBuilder sb2 = new StringBuilder("LeaderBoardUiEntry(isMainUser=");
        sb2.append(z5);
        sb2.append(", imgUrl=");
        sb2.append(str);
        sb2.append(", name=");
        sb2.append(str2);
        sb2.append(", score=");
        sb2.append(i11);
        sb2.append(", position=");
        return e.c(sb2, i12, ")");
    }
}
