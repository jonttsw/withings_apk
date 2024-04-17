package com.withings.vasistas.v2.model;

import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.e;
import androidx.camera.camera2.internal.l0;
import androidx.compose.material.o;
import com.google.android.gms.internal.mlkit_common.a;
import com.google.protobuf.t;
import com.withings.vasistas.v2.model.Vasistas;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.Duration;
/* compiled from: MotionVasistas.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u00017BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0012HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\t\u0010.\u001a\u00020\rHÆ\u0003Jm\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\u000bHÖ\u0001J\t\u00105\u001a\u000206HÖ\u0001R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00068"}, d2 = {"Lcom/withings/vasistas/v2/model/MotionVasistas;", "Lcom/withings/vasistas/v2/model/Vasistas;", "id", "", "startDate", "Lorg/joda/time/DateTime;", "duration", "Lorg/joda/time/Duration;", "metaData", "Lcom/withings/vasistas/v2/model/Vasistas$MetaData;", "steps", "", "calories", "", "ascent", "distance", "met", "activityRecognitionData", "Lcom/withings/vasistas/v2/model/MotionVasistas$ActivityRecognitionData;", "(JLorg/joda/time/DateTime;Lorg/joda/time/Duration;Lcom/withings/vasistas/v2/model/Vasistas$MetaData;IDDDDLcom/withings/vasistas/v2/model/MotionVasistas$ActivityRecognitionData;)V", "getActivityRecognitionData", "()Lcom/withings/vasistas/v2/model/MotionVasistas$ActivityRecognitionData;", "getAscent", "()D", "getCalories", "getDistance", "getDuration", "()Lorg/joda/time/Duration;", "getId", "()J", "getMet", "getMetaData", "()Lcom/withings/vasistas/v2/model/Vasistas$MetaData;", "getStartDate", "()Lorg/joda/time/DateTime;", "getSteps", "()I", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ActivityRecognitionData", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MotionVasistas extends Vasistas {
    private final ActivityRecognitionData activityRecognitionData;
    private final double ascent;
    private final double calories;
    private final double distance;
    private final Duration duration;

    /* renamed from: id  reason: collision with root package name */
    private final long f46394id;
    private final double met;
    private final Vasistas.MetaData metaData;
    private final DateTime startDate;
    private final int steps;

    /* compiled from: MotionVasistas.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/withings/vasistas/v2/model/MotionVasistas$ActivityRecognitionData;", "", "activityType", "", "classifierFeature", "", "classifierFeatureV2", "(IFI)V", "getActivityType", "()I", "getClassifierFeature", "()F", "getClassifierFeatureV2", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ActivityRecognitionData {
        private final int activityType;
        private final float classifierFeature;
        private final int classifierFeatureV2;

        public ActivityRecognitionData(int i11, float f11, int i12) {
            this.activityType = i11;
            this.classifierFeature = f11;
            this.classifierFeatureV2 = i12;
        }

        public static /* synthetic */ ActivityRecognitionData copy$default(ActivityRecognitionData activityRecognitionData, int i11, float f11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = activityRecognitionData.activityType;
            }
            if ((i13 & 2) != 0) {
                f11 = activityRecognitionData.classifierFeature;
            }
            if ((i13 & 4) != 0) {
                i12 = activityRecognitionData.classifierFeatureV2;
            }
            return activityRecognitionData.copy(i11, f11, i12);
        }

        public final int component1() {
            return this.activityType;
        }

        public final float component2() {
            return this.classifierFeature;
        }

        public final int component3() {
            return this.classifierFeatureV2;
        }

        public final ActivityRecognitionData copy(int i11, float f11, int i12) {
            return new ActivityRecognitionData(i11, f11, i12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivityRecognitionData)) {
                return false;
            }
            ActivityRecognitionData activityRecognitionData = (ActivityRecognitionData) obj;
            if (this.activityType == activityRecognitionData.activityType && Float.compare(this.classifierFeature, activityRecognitionData.classifierFeature) == 0 && this.classifierFeatureV2 == activityRecognitionData.classifierFeatureV2) {
                return true;
            }
            return false;
        }

        public final int getActivityType() {
            return this.activityType;
        }

        public final float getClassifierFeature() {
            return this.classifierFeature;
        }

        public final int getClassifierFeatureV2() {
            return this.classifierFeatureV2;
        }

        public int hashCode() {
            return Integer.hashCode(this.classifierFeatureV2) + o.a(this.classifierFeature, Integer.hashCode(this.activityType) * 31, 31);
        }

        public String toString() {
            int i11 = this.activityType;
            float f11 = this.classifierFeature;
            int i12 = this.classifierFeatureV2;
            StringBuilder sb2 = new StringBuilder("ActivityRecognitionData(activityType=");
            sb2.append(i11);
            sb2.append(", classifierFeature=");
            sb2.append(f11);
            sb2.append(", classifierFeatureV2=");
            return e.c(sb2, i12, ")");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionVasistas(long j5, DateTime startDate, Duration duration, Vasistas.MetaData metaData, int i11, double d11, double d12, double d13, double d14, ActivityRecognitionData activityRecognitionData) {
        super(null);
        u.j(startDate, "startDate");
        u.j(duration, "duration");
        u.j(metaData, "metaData");
        u.j(activityRecognitionData, "activityRecognitionData");
        this.f46394id = j5;
        this.startDate = startDate;
        this.duration = duration;
        this.metaData = metaData;
        this.steps = i11;
        this.calories = d11;
        this.ascent = d12;
        this.distance = d13;
        this.met = d14;
        this.activityRecognitionData = activityRecognitionData;
    }

    public static /* synthetic */ MotionVasistas copy$default(MotionVasistas motionVasistas, long j5, DateTime dateTime, Duration duration, Vasistas.MetaData metaData, int i11, double d11, double d12, double d13, double d14, ActivityRecognitionData activityRecognitionData, int i12, Object obj) {
        long j11;
        DateTime dateTime2;
        Duration duration2;
        Vasistas.MetaData metaData2;
        int i13;
        double d15;
        double d16;
        double d17;
        double d18;
        ActivityRecognitionData activityRecognitionData2;
        if ((i12 & 1) != 0) {
            j11 = motionVasistas.f46394id;
        } else {
            j11 = j5;
        }
        if ((i12 & 2) != 0) {
            dateTime2 = motionVasistas.startDate;
        } else {
            dateTime2 = dateTime;
        }
        if ((i12 & 4) != 0) {
            duration2 = motionVasistas.duration;
        } else {
            duration2 = duration;
        }
        if ((i12 & 8) != 0) {
            metaData2 = motionVasistas.metaData;
        } else {
            metaData2 = metaData;
        }
        if ((i12 & 16) != 0) {
            i13 = motionVasistas.steps;
        } else {
            i13 = i11;
        }
        if ((i12 & 32) != 0) {
            d15 = motionVasistas.calories;
        } else {
            d15 = d11;
        }
        if ((i12 & 64) != 0) {
            d16 = motionVasistas.ascent;
        } else {
            d16 = d12;
        }
        if ((i12 & 128) != 0) {
            d17 = motionVasistas.distance;
        } else {
            d17 = d13;
        }
        if ((i12 & 256) != 0) {
            d18 = motionVasistas.met;
        } else {
            d18 = d14;
        }
        if ((i12 & 512) != 0) {
            activityRecognitionData2 = motionVasistas.activityRecognitionData;
        } else {
            activityRecognitionData2 = activityRecognitionData;
        }
        return motionVasistas.copy(j11, dateTime2, duration2, metaData2, i13, d15, d16, d17, d18, activityRecognitionData2);
    }

    public final long component1() {
        return this.f46394id;
    }

    public final ActivityRecognitionData component10() {
        return this.activityRecognitionData;
    }

    public final DateTime component2() {
        return this.startDate;
    }

    public final Duration component3() {
        return this.duration;
    }

    public final Vasistas.MetaData component4() {
        return this.metaData;
    }

    public final int component5() {
        return this.steps;
    }

    public final double component6() {
        return this.calories;
    }

    public final double component7() {
        return this.ascent;
    }

    public final double component8() {
        return this.distance;
    }

    public final double component9() {
        return this.met;
    }

    public final MotionVasistas copy(long j5, DateTime startDate, Duration duration, Vasistas.MetaData metaData, int i11, double d11, double d12, double d13, double d14, ActivityRecognitionData activityRecognitionData) {
        u.j(startDate, "startDate");
        u.j(duration, "duration");
        u.j(metaData, "metaData");
        u.j(activityRecognitionData, "activityRecognitionData");
        return new MotionVasistas(j5, startDate, duration, metaData, i11, d11, d12, d13, d14, activityRecognitionData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotionVasistas)) {
            return false;
        }
        MotionVasistas motionVasistas = (MotionVasistas) obj;
        if (this.f46394id == motionVasistas.f46394id && u.e(this.startDate, motionVasistas.startDate) && u.e(this.duration, motionVasistas.duration) && u.e(this.metaData, motionVasistas.metaData) && this.steps == motionVasistas.steps && Double.compare(this.calories, motionVasistas.calories) == 0 && Double.compare(this.ascent, motionVasistas.ascent) == 0 && Double.compare(this.distance, motionVasistas.distance) == 0 && Double.compare(this.met, motionVasistas.met) == 0 && u.e(this.activityRecognitionData, motionVasistas.activityRecognitionData)) {
            return true;
        }
        return false;
    }

    public final ActivityRecognitionData getActivityRecognitionData() {
        return this.activityRecognitionData;
    }

    public final double getAscent() {
        return this.ascent;
    }

    public final double getCalories() {
        return this.calories;
    }

    public final double getDistance() {
        return this.distance;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public Duration getDuration() {
        return this.duration;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public long getId() {
        return this.f46394id;
    }

    public final double getMet() {
        return this.met;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public Vasistas.MetaData getMetaData() {
        return this.metaData;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public DateTime getStartDate() {
        return this.startDate;
    }

    public final int getSteps() {
        return this.steps;
    }

    public int hashCode() {
        int b10 = a.b(this.startDate, Long.hashCode(this.f46394id) * 31, 31);
        int hashCode = this.metaData.hashCode();
        return this.activityRecognitionData.hashCode() + l0.a(this.met, l0.a(this.distance, l0.a(this.ascent, l0.a(this.calories, h.a(this.steps, (hashCode + ((this.duration.hashCode() + b10) * 31)) * 31, 31), 31), 31), 31), 31);
    }

    public String toString() {
        long j5 = this.f46394id;
        DateTime dateTime = this.startDate;
        Duration duration = this.duration;
        Vasistas.MetaData metaData = this.metaData;
        int i11 = this.steps;
        double d11 = this.calories;
        double d12 = this.ascent;
        double d13 = this.distance;
        double d14 = this.met;
        ActivityRecognitionData activityRecognitionData = this.activityRecognitionData;
        StringBuilder sb2 = new StringBuilder("MotionVasistas(id=");
        sb2.append(j5);
        sb2.append(", startDate=");
        sb2.append(dateTime);
        sb2.append(", duration=");
        sb2.append(duration);
        sb2.append(", metaData=");
        sb2.append(metaData);
        sb2.append(", steps=");
        sb2.append(i11);
        sb2.append(", calories=");
        sb2.append(d11);
        t.d(sb2, ", ascent=", d12, ", distance=");
        sb2.append(d13);
        t.d(sb2, ", met=", d14, ", activityRecognitionData=");
        sb2.append(activityRecognitionData);
        sb2.append(")");
        return sb2.toString();
    }
}
