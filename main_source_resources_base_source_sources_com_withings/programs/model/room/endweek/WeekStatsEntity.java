package com.withings.programs.model.room.endweek;

import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.e;
import androidx.glance.appwidget.protobuf.g;
import com.rudderstack.android.sdk.core.ecomm.ECommerceParamNames;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: EndWeekStatsEntity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/withings/programs/model/room/endweek/WeekStatsEntity;", "", "type", "", ECommerceParamNames.TOTAL, "", "completed", "(Ljava/lang/String;II)V", "getCompleted", "()I", "getTotal", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WeekStatsEntity {
    private final int completed;
    private final int total;
    private final String type;

    public WeekStatsEntity(String type, int i11, int i12) {
        u.j(type, "type");
        this.type = type;
        this.total = i11;
        this.completed = i12;
    }

    public static /* synthetic */ WeekStatsEntity copy$default(WeekStatsEntity weekStatsEntity, String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = weekStatsEntity.type;
        }
        if ((i13 & 2) != 0) {
            i11 = weekStatsEntity.total;
        }
        if ((i13 & 4) != 0) {
            i12 = weekStatsEntity.completed;
        }
        return weekStatsEntity.copy(str, i11, i12);
    }

    public final String component1() {
        return this.type;
    }

    public final int component2() {
        return this.total;
    }

    public final int component3() {
        return this.completed;
    }

    public final WeekStatsEntity copy(String type, int i11, int i12) {
        u.j(type, "type");
        return new WeekStatsEntity(type, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeekStatsEntity)) {
            return false;
        }
        WeekStatsEntity weekStatsEntity = (WeekStatsEntity) obj;
        if (u.e(this.type, weekStatsEntity.type) && this.total == weekStatsEntity.total && this.completed == weekStatsEntity.completed) {
            return true;
        }
        return false;
    }

    public final int getCompleted() {
        return this.completed;
    }

    public final int getTotal() {
        return this.total;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.completed) + h.a(this.total, this.type.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.type;
        int i11 = this.total;
        return e.c(g.b("WeekStatsEntity(type=", str, ", total=", i11, ", completed="), this.completed, ")");
    }
}
