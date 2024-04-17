package com.withings.insight.core.model;

import androidx.fragment.app.o;
import com.huawei.hms.hihealth.data.DeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: HealthInsight.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/withings/insight/core/model/HealthInsightObjectStructure;", "", "Activity", "Aggregate", "Measure", DeviceInfo.STR_TYPE_UNKNOWN, "Lcom/withings/insight/core/model/HealthInsightObjectStructure$Activity;", "Lcom/withings/insight/core/model/HealthInsightObjectStructure$Aggregate;", "Lcom/withings/insight/core/model/HealthInsightObjectStructure$Measure;", "Lcom/withings/insight/core/model/HealthInsightObjectStructure$Unknown;", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface HealthInsightObjectStructure {

    /* compiled from: HealthInsight.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/withings/insight/core/model/HealthInsightObjectStructure$Activity;", "Lcom/withings/insight/core/model/HealthInsightObjectStructure;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Activity implements HealthInsightObjectStructure {
        public static final Activity INSTANCE = new Activity();

        private Activity() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return true;
        }

        public int hashCode() {
            return -744769647;
        }

        public String toString() {
            return "Activity";
        }
    }

    /* compiled from: HealthInsight.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/withings/insight/core/model/HealthInsightObjectStructure$Aggregate;", "Lcom/withings/insight/core/model/HealthInsightObjectStructure;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Aggregate implements HealthInsightObjectStructure {
        public static final Aggregate INSTANCE = new Aggregate();

        private Aggregate() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Aggregate)) {
                return false;
            }
            Aggregate aggregate = (Aggregate) obj;
            return true;
        }

        public int hashCode() {
            return -1642477187;
        }

        public String toString() {
            return "Aggregate";
        }
    }

    /* compiled from: HealthInsight.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/withings/insight/core/model/HealthInsightObjectStructure$Measure;", "Lcom/withings/insight/core/model/HealthInsightObjectStructure;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Measure implements HealthInsightObjectStructure {
        public static final Measure INSTANCE = new Measure();

        private Measure() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Measure)) {
                return false;
            }
            Measure measure = (Measure) obj;
            return true;
        }

        public int hashCode() {
            return 1244809372;
        }

        public String toString() {
            return "Measure";
        }
    }

    /* compiled from: HealthInsight.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/insight/core/model/HealthInsightObjectStructure$Unknown;", "Lcom/withings/insight/core/model/HealthInsightObjectStructure;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Unknown implements HealthInsightObjectStructure {
        private final String value;

        public Unknown(String value) {
            u.j(value, "value");
            this.value = value;
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = unknown.value;
            }
            return unknown.copy(str);
        }

        public final String component1() {
            return this.value;
        }

        public final Unknown copy(String value) {
            u.j(value, "value");
            return new Unknown(value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Unknown) && u.e(this.value, ((Unknown) obj).value)) {
                return true;
            }
            return false;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return o.d("Unknown(value=", this.value, ")");
        }
    }
}
