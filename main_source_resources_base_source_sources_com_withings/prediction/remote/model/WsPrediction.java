package com.withings.prediction.remote.model;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.core.v;
import androidx.camera.core.y1;
import androidx.work.impl.g;
import com.google.gson.annotations.SerializedName;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
/* compiled from: WsPrediction.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006'"}, d2 = {"Lcom/withings/prediction/remote/model/WsPrediction;", "", "id", "", NavigationArguments.USER_ID, "type", "", "startDateInSeconds", "endDateInSeconds", "active", "", ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "modified", "(JJIJJZJJ)V", "getActive", "()Z", "getCreated", "()J", "getEndDateInSeconds", "getId", "getModified", "getStartDateInSeconds", "getType", "()I", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsPrediction {
    private final boolean active;
    private final long created;
    @SerializedName("enddate")
    private final long endDateInSeconds;

    /* renamed from: id  reason: collision with root package name */
    private final long f43734id;
    private final long modified;
    @SerializedName("startdate")
    private final long startDateInSeconds;
    private final int type;
    @SerializedName("userid")
    private final long userId;

    public WsPrediction(long j5, long j11, int i11, long j12, long j13, boolean z5, long j14, long j15) {
        this.f43734id = j5;
        this.userId = j11;
        this.type = i11;
        this.startDateInSeconds = j12;
        this.endDateInSeconds = j13;
        this.active = z5;
        this.created = j14;
        this.modified = j15;
    }

    public static /* synthetic */ WsPrediction copy$default(WsPrediction wsPrediction, long j5, long j11, int i11, long j12, long j13, boolean z5, long j14, long j15, int i12, Object obj) {
        long j16;
        long j17;
        int i13;
        long j18;
        long j19;
        boolean z11;
        long j21;
        long j22;
        if ((i12 & 1) != 0) {
            j16 = wsPrediction.f43734id;
        } else {
            j16 = j5;
        }
        if ((i12 & 2) != 0) {
            j17 = wsPrediction.userId;
        } else {
            j17 = j11;
        }
        if ((i12 & 4) != 0) {
            i13 = wsPrediction.type;
        } else {
            i13 = i11;
        }
        if ((i12 & 8) != 0) {
            j18 = wsPrediction.startDateInSeconds;
        } else {
            j18 = j12;
        }
        if ((i12 & 16) != 0) {
            j19 = wsPrediction.endDateInSeconds;
        } else {
            j19 = j13;
        }
        if ((i12 & 32) != 0) {
            z11 = wsPrediction.active;
        } else {
            z11 = z5;
        }
        if ((i12 & 64) != 0) {
            j21 = wsPrediction.created;
        } else {
            j21 = j14;
        }
        if ((i12 & 128) != 0) {
            j22 = wsPrediction.modified;
        } else {
            j22 = j15;
        }
        return wsPrediction.copy(j16, j17, i13, j18, j19, z11, j21, j22);
    }

    public final long component1() {
        return this.f43734id;
    }

    public final long component2() {
        return this.userId;
    }

    public final int component3() {
        return this.type;
    }

    public final long component4() {
        return this.startDateInSeconds;
    }

    public final long component5() {
        return this.endDateInSeconds;
    }

    public final boolean component6() {
        return this.active;
    }

    public final long component7() {
        return this.created;
    }

    public final long component8() {
        return this.modified;
    }

    public final WsPrediction copy(long j5, long j11, int i11, long j12, long j13, boolean z5, long j14, long j15) {
        return new WsPrediction(j5, j11, i11, j12, j13, z5, j14, j15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsPrediction)) {
            return false;
        }
        WsPrediction wsPrediction = (WsPrediction) obj;
        if (this.f43734id == wsPrediction.f43734id && this.userId == wsPrediction.userId && this.type == wsPrediction.type && this.startDateInSeconds == wsPrediction.startDateInSeconds && this.endDateInSeconds == wsPrediction.endDateInSeconds && this.active == wsPrediction.active && this.created == wsPrediction.created && this.modified == wsPrediction.modified) {
            return true;
        }
        return false;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final long getCreated() {
        return this.created;
    }

    public final long getEndDateInSeconds() {
        return this.endDateInSeconds;
    }

    public final long getId() {
        return this.f43734id;
    }

    public final long getModified() {
        return this.modified;
    }

    public final long getStartDateInSeconds() {
        return this.startDateInSeconds;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Long.hashCode(this.modified) + c.a(this.created, y1.a(this.active, c.a(this.endDateInSeconds, c.a(this.startDateInSeconds, h.a(this.type, c.a(this.userId, Long.hashCode(this.f43734id) * 31, 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        long j5 = this.f43734id;
        long j11 = this.userId;
        int i11 = this.type;
        long j12 = this.startDateInSeconds;
        long j13 = this.endDateInSeconds;
        boolean z5 = this.active;
        long j14 = this.created;
        long j15 = this.modified;
        StringBuilder e11 = v.e("WsPrediction(id=", j5, ", userId=");
        e11.append(j11);
        e11.append(", type=");
        e11.append(i11);
        g.d(e11, ", startDateInSeconds=", j12, ", endDateInSeconds=");
        e11.append(j13);
        e11.append(", active=");
        e11.append(z5);
        g.d(e11, ", created=", j14, ", modified=");
        return android.support.v4.media.session.c.c(e11, j15, ")");
    }
}
