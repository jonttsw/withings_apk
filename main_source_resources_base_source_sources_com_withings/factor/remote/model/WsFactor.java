package com.withings.factor.remote.model;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.core.v;
import androidx.camera.core.y1;
import androidx.work.impl.g;
import com.google.gson.annotations.SerializedName;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
/* compiled from: WsFactor.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003Jm\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0006HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006-"}, d2 = {"Lcom/withings/factor/remote/model/WsFactor;", "", "id", "", NavigationArguments.USER_ID, "type", "", "startDate", "endDate", "deletionDate", "numberOfPills", ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "deleted", "", "modified", "(JJIJJJIJZJ)V", "getCreated", "()J", "getDeleted", "()Z", "getDeletionDate", "getEndDate", "getId", "getModified", "getNumberOfPills", "()I", "getStartDate", "getType", "getUserId", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WsFactor {
    private final long created;
    private final boolean deleted;
    @SerializedName("deletion_date")
    private final long deletionDate;
    @SerializedName("enddate")
    private final long endDate;

    /* renamed from: id  reason: collision with root package name */
    private final long f39106id;
    private final long modified;
    @SerializedName("nb_of_pills")
    private final int numberOfPills;
    @SerializedName("startdate")
    private final long startDate;
    @SerializedName("factor_type")
    private final int type;
    @SerializedName("userid")
    private final long userId;

    public WsFactor(long j5, long j11, int i11, long j12, long j13, long j14, int i12, long j15, boolean z5, long j16) {
        this.f39106id = j5;
        this.userId = j11;
        this.type = i11;
        this.startDate = j12;
        this.endDate = j13;
        this.deletionDate = j14;
        this.numberOfPills = i12;
        this.created = j15;
        this.deleted = z5;
        this.modified = j16;
    }

    public static /* synthetic */ WsFactor copy$default(WsFactor wsFactor, long j5, long j11, int i11, long j12, long j13, long j14, int i12, long j15, boolean z5, long j16, int i13, Object obj) {
        long j17;
        long j18;
        int i14;
        long j19;
        long j21;
        long j22;
        int i15;
        long j23;
        boolean z11;
        long j24;
        if ((i13 & 1) != 0) {
            j17 = wsFactor.f39106id;
        } else {
            j17 = j5;
        }
        if ((i13 & 2) != 0) {
            j18 = wsFactor.userId;
        } else {
            j18 = j11;
        }
        if ((i13 & 4) != 0) {
            i14 = wsFactor.type;
        } else {
            i14 = i11;
        }
        if ((i13 & 8) != 0) {
            j19 = wsFactor.startDate;
        } else {
            j19 = j12;
        }
        if ((i13 & 16) != 0) {
            j21 = wsFactor.endDate;
        } else {
            j21 = j13;
        }
        if ((i13 & 32) != 0) {
            j22 = wsFactor.deletionDate;
        } else {
            j22 = j14;
        }
        if ((i13 & 64) != 0) {
            i15 = wsFactor.numberOfPills;
        } else {
            i15 = i12;
        }
        if ((i13 & 128) != 0) {
            j23 = wsFactor.created;
        } else {
            j23 = j15;
        }
        long j25 = j23;
        if ((i13 & 256) != 0) {
            z11 = wsFactor.deleted;
        } else {
            z11 = z5;
        }
        boolean z12 = z11;
        if ((i13 & 512) != 0) {
            j24 = wsFactor.modified;
        } else {
            j24 = j16;
        }
        return wsFactor.copy(j17, j18, i14, j19, j21, j22, i15, j25, z12, j24);
    }

    public final long component1() {
        return this.f39106id;
    }

    public final long component10() {
        return this.modified;
    }

    public final long component2() {
        return this.userId;
    }

    public final int component3() {
        return this.type;
    }

    public final long component4() {
        return this.startDate;
    }

    public final long component5() {
        return this.endDate;
    }

    public final long component6() {
        return this.deletionDate;
    }

    public final int component7() {
        return this.numberOfPills;
    }

    public final long component8() {
        return this.created;
    }

    public final boolean component9() {
        return this.deleted;
    }

    public final WsFactor copy(long j5, long j11, int i11, long j12, long j13, long j14, int i12, long j15, boolean z5, long j16) {
        return new WsFactor(j5, j11, i11, j12, j13, j14, i12, j15, z5, j16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsFactor)) {
            return false;
        }
        WsFactor wsFactor = (WsFactor) obj;
        if (this.f39106id == wsFactor.f39106id && this.userId == wsFactor.userId && this.type == wsFactor.type && this.startDate == wsFactor.startDate && this.endDate == wsFactor.endDate && this.deletionDate == wsFactor.deletionDate && this.numberOfPills == wsFactor.numberOfPills && this.created == wsFactor.created && this.deleted == wsFactor.deleted && this.modified == wsFactor.modified) {
            return true;
        }
        return false;
    }

    public final long getCreated() {
        return this.created;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final long getDeletionDate() {
        return this.deletionDate;
    }

    public final long getEndDate() {
        return this.endDate;
    }

    public final long getId() {
        return this.f39106id;
    }

    public final long getModified() {
        return this.modified;
    }

    public final int getNumberOfPills() {
        return this.numberOfPills;
    }

    public final long getStartDate() {
        return this.startDate;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Long.hashCode(this.modified) + y1.a(this.deleted, c.a(this.created, h.a(this.numberOfPills, c.a(this.deletionDate, c.a(this.endDate, c.a(this.startDate, h.a(this.type, c.a(this.userId, Long.hashCode(this.f39106id) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        long j5 = this.f39106id;
        long j11 = this.userId;
        int i11 = this.type;
        long j12 = this.startDate;
        long j13 = this.endDate;
        long j14 = this.deletionDate;
        int i12 = this.numberOfPills;
        long j15 = this.created;
        boolean z5 = this.deleted;
        long j16 = this.modified;
        StringBuilder e11 = v.e("WsFactor(id=", j5, ", userId=");
        e11.append(j11);
        e11.append(", type=");
        e11.append(i11);
        g.d(e11, ", startDate=", j12, ", endDate=");
        e11.append(j13);
        g.d(e11, ", deletionDate=", j14, ", numberOfPills=");
        e11.append(i12);
        e11.append(", created=");
        e11.append(j15);
        e11.append(", deleted=");
        e11.append(z5);
        e11.append(", modified=");
        return android.support.v4.media.session.c.c(e11, j16, ")");
    }
}
