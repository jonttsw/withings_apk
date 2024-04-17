package com.withings.library.healthscore.models.internal;

import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.contentproviders.eightfit.model.webservice.a;
import com.withings.library.healthscore.models.PreviousHealthScores;
import com.withings.library.healthscore.models.api.AfibResultMeasureGroup;
import com.withings.library.healthscore.models.api.BloodPressureMeasureGroup;
import com.withings.library.healthscore.models.api.SleepTrack;
import com.withings.library.healthscore.models.api.UserInfo;
import com.withings.library.healthscore.models.api.VascularAgeMeasureGroup;
import com.withings.library.healthscore.models.api.WeightMeasureGroup;
import com.withings.library.healthscore.models.internal.activity.ActivityDayWithGoal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: HealthScoreInputs.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aJ\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0015HÆ\u0003J\t\u00101\u001a\u00020\u0015HÆ\u0003J\t\u00102\u001a\u00020\u0015HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010$J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\r0\u0007HÆ\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007HÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007HÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007HÆ\u0003Jº\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020\u00152\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020AHÖ\u0001J\t\u0010B\u001a\u00020CHÖ\u0001R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u0016\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0017\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001c¨\u0006D"}, d2 = {"Lcom/withings/library/healthscore/models/internal/HealthScoreInputs;", "", "userInfo", "Lcom/withings/library/healthscore/models/api/UserInfo;", "height", "", "activityDaysWithGoal", "", "Lcom/withings/library/healthscore/models/internal/activity/ActivityDayWithGoal;", "weights", "Lcom/withings/library/healthscore/models/api/WeightMeasureGroup;", "lastBodyData", "aFibResults", "Lcom/withings/library/healthscore/models/api/AfibResultMeasureGroup;", "bloodPressures", "Lcom/withings/library/healthscore/models/api/BloodPressureMeasureGroup;", "vascularAgeResults", "Lcom/withings/library/healthscore/models/api/VascularAgeMeasureGroup;", "sleepNights", "Lcom/withings/library/healthscore/models/api/SleepTrack;", "hasSleepData", "", "hasBloodPressureData", "hasEcgData", "previousHealthScore", "Lcom/withings/library/healthscore/models/PreviousHealthScores;", "(Lcom/withings/library/healthscore/models/api/UserInfo;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Lcom/withings/library/healthscore/models/api/WeightMeasureGroup;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLcom/withings/library/healthscore/models/PreviousHealthScores;)V", "getAFibResults", "()Ljava/util/List;", "getActivityDaysWithGoal", "getBloodPressures", "getHasBloodPressureData", "()Z", "getHasEcgData", "getHasSleepData", "getHeight", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLastBodyData", "()Lcom/withings/library/healthscore/models/api/WeightMeasureGroup;", "getPreviousHealthScore", "()Lcom/withings/library/healthscore/models/PreviousHealthScores;", "getSleepNights", "getUserInfo", "()Lcom/withings/library/healthscore/models/api/UserInfo;", "getVascularAgeResults", "getWeights", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/withings/library/healthscore/models/api/UserInfo;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Lcom/withings/library/healthscore/models/api/WeightMeasureGroup;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLcom/withings/library/healthscore/models/PreviousHealthScores;)Lcom/withings/library/healthscore/models/internal/HealthScoreInputs;", "equals", "other", "hashCode", "", "toString", "", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HealthScoreInputs {
    private final List<AfibResultMeasureGroup> aFibResults;
    private final List<ActivityDayWithGoal> activityDaysWithGoal;
    private final List<BloodPressureMeasureGroup> bloodPressures;
    private final boolean hasBloodPressureData;
    private final boolean hasEcgData;
    private final boolean hasSleepData;
    private final Double height;
    private final WeightMeasureGroup lastBodyData;
    private final PreviousHealthScores previousHealthScore;
    private final List<SleepTrack> sleepNights;
    private final UserInfo userInfo;
    private final List<VascularAgeMeasureGroup> vascularAgeResults;
    private final List<WeightMeasureGroup> weights;

    public HealthScoreInputs(UserInfo userInfo, Double d11, List<ActivityDayWithGoal> activityDaysWithGoal, List<WeightMeasureGroup> weights, WeightMeasureGroup weightMeasureGroup, List<AfibResultMeasureGroup> aFibResults, List<BloodPressureMeasureGroup> bloodPressures, List<VascularAgeMeasureGroup> vascularAgeResults, List<SleepTrack> sleepNights, boolean z5, boolean z11, boolean z12, PreviousHealthScores previousHealthScores) {
        u.j(userInfo, "userInfo");
        u.j(activityDaysWithGoal, "activityDaysWithGoal");
        u.j(weights, "weights");
        u.j(aFibResults, "aFibResults");
        u.j(bloodPressures, "bloodPressures");
        u.j(vascularAgeResults, "vascularAgeResults");
        u.j(sleepNights, "sleepNights");
        this.userInfo = userInfo;
        this.height = d11;
        this.activityDaysWithGoal = activityDaysWithGoal;
        this.weights = weights;
        this.lastBodyData = weightMeasureGroup;
        this.aFibResults = aFibResults;
        this.bloodPressures = bloodPressures;
        this.vascularAgeResults = vascularAgeResults;
        this.sleepNights = sleepNights;
        this.hasSleepData = z5;
        this.hasBloodPressureData = z11;
        this.hasEcgData = z12;
        this.previousHealthScore = previousHealthScores;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HealthScoreInputs copy$default(HealthScoreInputs healthScoreInputs, UserInfo userInfo, Double d11, List list, List list2, WeightMeasureGroup weightMeasureGroup, List list3, List list4, List list5, List list6, boolean z5, boolean z11, boolean z12, PreviousHealthScores previousHealthScores, int i11, Object obj) {
        UserInfo userInfo2;
        Double d12;
        List<ActivityDayWithGoal> list7;
        List<WeightMeasureGroup> list8;
        WeightMeasureGroup weightMeasureGroup2;
        List<AfibResultMeasureGroup> list9;
        List<BloodPressureMeasureGroup> list10;
        List<VascularAgeMeasureGroup> list11;
        List<SleepTrack> list12;
        boolean z13;
        boolean z14;
        boolean z15;
        PreviousHealthScores previousHealthScores2;
        if ((i11 & 1) != 0) {
            userInfo2 = healthScoreInputs.userInfo;
        } else {
            userInfo2 = userInfo;
        }
        if ((i11 & 2) != 0) {
            d12 = healthScoreInputs.height;
        } else {
            d12 = d11;
        }
        if ((i11 & 4) != 0) {
            list7 = healthScoreInputs.activityDaysWithGoal;
        } else {
            list7 = list;
        }
        if ((i11 & 8) != 0) {
            list8 = healthScoreInputs.weights;
        } else {
            list8 = list2;
        }
        if ((i11 & 16) != 0) {
            weightMeasureGroup2 = healthScoreInputs.lastBodyData;
        } else {
            weightMeasureGroup2 = weightMeasureGroup;
        }
        if ((i11 & 32) != 0) {
            list9 = healthScoreInputs.aFibResults;
        } else {
            list9 = list3;
        }
        if ((i11 & 64) != 0) {
            list10 = healthScoreInputs.bloodPressures;
        } else {
            list10 = list4;
        }
        if ((i11 & 128) != 0) {
            list11 = healthScoreInputs.vascularAgeResults;
        } else {
            list11 = list5;
        }
        if ((i11 & 256) != 0) {
            list12 = healthScoreInputs.sleepNights;
        } else {
            list12 = list6;
        }
        if ((i11 & 512) != 0) {
            z13 = healthScoreInputs.hasSleepData;
        } else {
            z13 = z5;
        }
        if ((i11 & 1024) != 0) {
            z14 = healthScoreInputs.hasBloodPressureData;
        } else {
            z14 = z11;
        }
        if ((i11 & ModuleCopy.f28574b) != 0) {
            z15 = healthScoreInputs.hasEcgData;
        } else {
            z15 = z12;
        }
        if ((i11 & 4096) != 0) {
            previousHealthScores2 = healthScoreInputs.previousHealthScore;
        } else {
            previousHealthScores2 = previousHealthScores;
        }
        return healthScoreInputs.copy(userInfo2, d12, list7, list8, weightMeasureGroup2, list9, list10, list11, list12, z13, z14, z15, previousHealthScores2);
    }

    public final UserInfo component1() {
        return this.userInfo;
    }

    public final boolean component10() {
        return this.hasSleepData;
    }

    public final boolean component11() {
        return this.hasBloodPressureData;
    }

    public final boolean component12() {
        return this.hasEcgData;
    }

    public final PreviousHealthScores component13() {
        return this.previousHealthScore;
    }

    public final Double component2() {
        return this.height;
    }

    public final List<ActivityDayWithGoal> component3() {
        return this.activityDaysWithGoal;
    }

    public final List<WeightMeasureGroup> component4() {
        return this.weights;
    }

    public final WeightMeasureGroup component5() {
        return this.lastBodyData;
    }

    public final List<AfibResultMeasureGroup> component6() {
        return this.aFibResults;
    }

    public final List<BloodPressureMeasureGroup> component7() {
        return this.bloodPressures;
    }

    public final List<VascularAgeMeasureGroup> component8() {
        return this.vascularAgeResults;
    }

    public final List<SleepTrack> component9() {
        return this.sleepNights;
    }

    public final HealthScoreInputs copy(UserInfo userInfo, Double d11, List<ActivityDayWithGoal> activityDaysWithGoal, List<WeightMeasureGroup> weights, WeightMeasureGroup weightMeasureGroup, List<AfibResultMeasureGroup> aFibResults, List<BloodPressureMeasureGroup> bloodPressures, List<VascularAgeMeasureGroup> vascularAgeResults, List<SleepTrack> sleepNights, boolean z5, boolean z11, boolean z12, PreviousHealthScores previousHealthScores) {
        u.j(userInfo, "userInfo");
        u.j(activityDaysWithGoal, "activityDaysWithGoal");
        u.j(weights, "weights");
        u.j(aFibResults, "aFibResults");
        u.j(bloodPressures, "bloodPressures");
        u.j(vascularAgeResults, "vascularAgeResults");
        u.j(sleepNights, "sleepNights");
        return new HealthScoreInputs(userInfo, d11, activityDaysWithGoal, weights, weightMeasureGroup, aFibResults, bloodPressures, vascularAgeResults, sleepNights, z5, z11, z12, previousHealthScores);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HealthScoreInputs)) {
            return false;
        }
        HealthScoreInputs healthScoreInputs = (HealthScoreInputs) obj;
        if (u.e(this.userInfo, healthScoreInputs.userInfo) && u.e(this.height, healthScoreInputs.height) && u.e(this.activityDaysWithGoal, healthScoreInputs.activityDaysWithGoal) && u.e(this.weights, healthScoreInputs.weights) && u.e(this.lastBodyData, healthScoreInputs.lastBodyData) && u.e(this.aFibResults, healthScoreInputs.aFibResults) && u.e(this.bloodPressures, healthScoreInputs.bloodPressures) && u.e(this.vascularAgeResults, healthScoreInputs.vascularAgeResults) && u.e(this.sleepNights, healthScoreInputs.sleepNights) && this.hasSleepData == healthScoreInputs.hasSleepData && this.hasBloodPressureData == healthScoreInputs.hasBloodPressureData && this.hasEcgData == healthScoreInputs.hasEcgData && u.e(this.previousHealthScore, healthScoreInputs.previousHealthScore)) {
            return true;
        }
        return false;
    }

    public final List<AfibResultMeasureGroup> getAFibResults() {
        return this.aFibResults;
    }

    public final List<ActivityDayWithGoal> getActivityDaysWithGoal() {
        return this.activityDaysWithGoal;
    }

    public final List<BloodPressureMeasureGroup> getBloodPressures() {
        return this.bloodPressures;
    }

    public final boolean getHasBloodPressureData() {
        return this.hasBloodPressureData;
    }

    public final boolean getHasEcgData() {
        return this.hasEcgData;
    }

    public final boolean getHasSleepData() {
        return this.hasSleepData;
    }

    public final Double getHeight() {
        return this.height;
    }

    public final WeightMeasureGroup getLastBodyData() {
        return this.lastBodyData;
    }

    public final PreviousHealthScores getPreviousHealthScore() {
        return this.previousHealthScore;
    }

    public final List<SleepTrack> getSleepNights() {
        return this.sleepNights;
    }

    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    public final List<VascularAgeMeasureGroup> getVascularAgeResults() {
        return this.vascularAgeResults;
    }

    public final List<WeightMeasureGroup> getWeights() {
        return this.weights;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.userInfo.hashCode() * 31;
        Double d11 = this.height;
        int i11 = 0;
        if (d11 == null) {
            hashCode = 0;
        } else {
            hashCode = d11.hashCode();
        }
        int b10 = e.b(this.weights, e.b(this.activityDaysWithGoal, (hashCode3 + hashCode) * 31, 31), 31);
        WeightMeasureGroup weightMeasureGroup = this.lastBodyData;
        if (weightMeasureGroup == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = weightMeasureGroup.hashCode();
        }
        int b11 = e.b(this.sleepNights, e.b(this.vascularAgeResults, e.b(this.bloodPressures, e.b(this.aFibResults, (b10 + hashCode2) * 31, 31), 31), 31), 31);
        boolean z5 = this.hasSleepData;
        int i12 = 1;
        int i13 = z5;
        if (z5 != 0) {
            i13 = 1;
        }
        int i14 = (b11 + i13) * 31;
        boolean z11 = this.hasBloodPressureData;
        int i15 = z11;
        if (z11 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        boolean z12 = this.hasEcgData;
        if (!z12) {
            i12 = z12 ? 1 : 0;
        }
        int i17 = (i16 + i12) * 31;
        PreviousHealthScores previousHealthScores = this.previousHealthScore;
        if (previousHealthScores != null) {
            i11 = previousHealthScores.hashCode();
        }
        return i17 + i11;
    }

    public String toString() {
        UserInfo userInfo = this.userInfo;
        Double d11 = this.height;
        List<ActivityDayWithGoal> list = this.activityDaysWithGoal;
        List<WeightMeasureGroup> list2 = this.weights;
        WeightMeasureGroup weightMeasureGroup = this.lastBodyData;
        List<AfibResultMeasureGroup> list3 = this.aFibResults;
        List<BloodPressureMeasureGroup> list4 = this.bloodPressures;
        List<VascularAgeMeasureGroup> list5 = this.vascularAgeResults;
        List<SleepTrack> list6 = this.sleepNights;
        boolean z5 = this.hasSleepData;
        boolean z11 = this.hasBloodPressureData;
        boolean z12 = this.hasEcgData;
        PreviousHealthScores previousHealthScores = this.previousHealthScore;
        StringBuilder sb2 = new StringBuilder("HealthScoreInputs(userInfo=");
        sb2.append(userInfo);
        sb2.append(", height=");
        sb2.append(d11);
        sb2.append(", activityDaysWithGoal=");
        a.a(sb2, list, ", weights=", list2, ", lastBodyData=");
        sb2.append(weightMeasureGroup);
        sb2.append(", aFibResults=");
        sb2.append(list3);
        sb2.append(", bloodPressures=");
        a.a(sb2, list4, ", vascularAgeResults=", list5, ", sleepNights=");
        sb2.append(list6);
        sb2.append(", hasSleepData=");
        sb2.append(z5);
        sb2.append(", hasBloodPressureData=");
        sb2.append(z11);
        sb2.append(", hasEcgData=");
        sb2.append(z12);
        sb2.append(", previousHealthScore=");
        sb2.append(previousHealthScores);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ HealthScoreInputs(UserInfo userInfo, Double d11, List list, List list2, WeightMeasureGroup weightMeasureGroup, List list3, List list4, List list5, List list6, boolean z5, boolean z11, boolean z12, PreviousHealthScores previousHealthScores, int i11, m mVar) {
        this(userInfo, d11, list, list2, weightMeasureGroup, list3, list4, list5, list6, z5, z11, z12, (i11 & 4096) != 0 ? null : previousHealthScores);
    }
}
