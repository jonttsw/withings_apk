package com.withings.programs.model.room.endprogram;

import androidx.appcompat.app.h;
import com.rudderstack.android.sdk.core.ecomm.ECommerceParamNames;
import kotlin.Metadata;
/* compiled from: EndProgramStatsEntity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/withings/programs/model/room/endprogram/EndProgramStatsEntity;", "", ECommerceParamNames.TOTAL, "", "completed", "(II)V", "getCompleted", "()I", "getTotal", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EndProgramStatsEntity {
    private final int completed;
    private final int total;

    public EndProgramStatsEntity(int i11, int i12) {
        this.total = i11;
        this.completed = i12;
    }

    public static /* synthetic */ EndProgramStatsEntity copy$default(EndProgramStatsEntity endProgramStatsEntity, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = endProgramStatsEntity.total;
        }
        if ((i13 & 2) != 0) {
            i12 = endProgramStatsEntity.completed;
        }
        return endProgramStatsEntity.copy(i11, i12);
    }

    public final int component1() {
        return this.total;
    }

    public final int component2() {
        return this.completed;
    }

    public final EndProgramStatsEntity copy(int i11, int i12) {
        return new EndProgramStatsEntity(i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EndProgramStatsEntity)) {
            return false;
        }
        EndProgramStatsEntity endProgramStatsEntity = (EndProgramStatsEntity) obj;
        if (this.total == endProgramStatsEntity.total && this.completed == endProgramStatsEntity.completed) {
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

    public int hashCode() {
        return Integer.hashCode(this.completed) + (Integer.hashCode(this.total) * 31);
    }

    public String toString() {
        return h.c("EndProgramStatsEntity(total=", this.total, ", completed=", this.completed, ")");
    }
}
