package com.withings.programs.model.goal;

import androidx.appcompat.app.h;
import com.withings.common.compose.component.m4;
import com.withings.goal.core.model.HealthGoalTrend;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: HealthGoalHeaderUi.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\n\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0004J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001e\u0010\u0004R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010\u000b¨\u0006#"}, d2 = {"Lcom/withings/programs/model/goal/HealthGoalHeaderUi;", "", "", "component1", "()I", "Lcom/withings/goal/core/model/HealthGoalTrend;", "component2", "()Lcom/withings/goal/core/model/HealthGoalTrend;", "component3", "Lcom/withings/common/compose/component/m4;", "component4", "()Lcom/withings/common/compose/component/m4;", "title", "goalTrend", "measureType", "statusHeaderData", "copy", "(ILcom/withings/goal/core/model/HealthGoalTrend;ILcom/withings/common/compose/component/m4;)Lcom/withings/programs/model/goal/HealthGoalHeaderUi;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTitle", "Lcom/withings/goal/core/model/HealthGoalTrend;", "getGoalTrend", "getMeasureType", "Lcom/withings/common/compose/component/m4;", "getStatusHeaderData", "<init>", "(ILcom/withings/goal/core/model/HealthGoalTrend;ILcom/withings/common/compose/component/m4;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class HealthGoalHeaderUi {
    public static final int $stable;
    private final HealthGoalTrend goalTrend;
    private final int measureType;
    private final m4 statusHeaderData;
    private final int title;

    static {
        int i11 = m4.f34073f;
        $stable = 0;
    }

    public HealthGoalHeaderUi(int i11, HealthGoalTrend goalTrend, int i12, m4 statusHeaderData) {
        u.j(goalTrend, "goalTrend");
        u.j(statusHeaderData, "statusHeaderData");
        this.title = i11;
        this.goalTrend = goalTrend;
        this.measureType = i12;
        this.statusHeaderData = statusHeaderData;
    }

    public static /* synthetic */ HealthGoalHeaderUi copy$default(HealthGoalHeaderUi healthGoalHeaderUi, int i11, HealthGoalTrend healthGoalTrend, int i12, m4 m4Var, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = healthGoalHeaderUi.title;
        }
        if ((i13 & 2) != 0) {
            healthGoalTrend = healthGoalHeaderUi.goalTrend;
        }
        if ((i13 & 4) != 0) {
            i12 = healthGoalHeaderUi.measureType;
        }
        if ((i13 & 8) != 0) {
            m4Var = healthGoalHeaderUi.statusHeaderData;
        }
        return healthGoalHeaderUi.copy(i11, healthGoalTrend, i12, m4Var);
    }

    public final int component1() {
        return this.title;
    }

    public final HealthGoalTrend component2() {
        return this.goalTrend;
    }

    public final int component3() {
        return this.measureType;
    }

    public final m4 component4() {
        return this.statusHeaderData;
    }

    public final HealthGoalHeaderUi copy(int i11, HealthGoalTrend goalTrend, int i12, m4 statusHeaderData) {
        u.j(goalTrend, "goalTrend");
        u.j(statusHeaderData, "statusHeaderData");
        return new HealthGoalHeaderUi(i11, goalTrend, i12, statusHeaderData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HealthGoalHeaderUi)) {
            return false;
        }
        HealthGoalHeaderUi healthGoalHeaderUi = (HealthGoalHeaderUi) obj;
        if (this.title == healthGoalHeaderUi.title && this.goalTrend == healthGoalHeaderUi.goalTrend && this.measureType == healthGoalHeaderUi.measureType && u.e(this.statusHeaderData, healthGoalHeaderUi.statusHeaderData)) {
            return true;
        }
        return false;
    }

    public final HealthGoalTrend getGoalTrend() {
        return this.goalTrend;
    }

    public final int getMeasureType() {
        return this.measureType;
    }

    public final m4 getStatusHeaderData() {
        return this.statusHeaderData;
    }

    public final int getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.goalTrend.hashCode();
        return this.statusHeaderData.hashCode() + h.a(this.measureType, (hashCode + (Integer.hashCode(this.title) * 31)) * 31, 31);
    }

    public String toString() {
        int i11 = this.title;
        HealthGoalTrend healthGoalTrend = this.goalTrend;
        int i12 = this.measureType;
        m4 m4Var = this.statusHeaderData;
        return "HealthGoalHeaderUi(title=" + i11 + ", goalTrend=" + healthGoalTrend + ", measureType=" + i12 + ", statusHeaderData=" + m4Var + ")";
    }
}
