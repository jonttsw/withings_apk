package com.withings.library.ecg.p003native;

import com.withings.library.ecg.filter.v2.BatchResult;
import kotlin.Metadata;
/* compiled from: EcgNativeV2.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\r\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086 ¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/withings/library/ecg/native/EcgNativeV2;", "", "", "frequency", "gain", "Lcom/withings/library/ecg/native/EcgNativeV2$ContextPair;", "filterInit", "(II)Lcom/withings/library/ecg/native/EcgNativeV2$ContextPair;", "", "tracingFilterContextPointer", "afibClassificationContextPointer", "", "values", "filterAll", "(JJ[I)[I", "Lcom/withings/library/ecg/filter/v2/BatchResult;", "filterBatch", "(JJ[I)Lcom/withings/library/ecg/filter/v2/BatchResult;", "Lnm0/y;", "filterFinish", "(JJ)V", "<init>", "()V", "ContextPair", "ecg-library_release"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.withings.library.ecg.native.EcgNativeV2  reason: invalid package */
/* loaded from: classes4.dex */
public final class EcgNativeV2 {
    public static final EcgNativeV2 INSTANCE = new EcgNativeV2();

    /* compiled from: EcgNativeV2.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/withings/library/ecg/native/EcgNativeV2$ContextPair;", "", "filter", "", "afib", "(JJ)V", "getAfib", "()J", "getFilter", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ecg-library_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.withings.library.ecg.native.EcgNativeV2$ContextPair */
    /* loaded from: classes4.dex */
    public static final class ContextPair {
        private final long afib;
        private final long filter;

        public ContextPair(long j5, long j11) {
            this.filter = j5;
            this.afib = j11;
        }

        public static /* synthetic */ ContextPair copy$default(ContextPair contextPair, long j5, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j5 = contextPair.filter;
            }
            if ((i11 & 2) != 0) {
                j11 = contextPair.afib;
            }
            return contextPair.copy(j5, j11);
        }

        public final long component1() {
            return this.filter;
        }

        public final long component2() {
            return this.afib;
        }

        public final ContextPair copy(long j5, long j11) {
            return new ContextPair(j5, j11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContextPair)) {
                return false;
            }
            ContextPair contextPair = (ContextPair) obj;
            if (this.filter == contextPair.filter && this.afib == contextPair.afib) {
                return true;
            }
            return false;
        }

        public final long getAfib() {
            return this.afib;
        }

        public final long getFilter() {
            return this.filter;
        }

        public int hashCode() {
            return Long.hashCode(this.afib) + (Long.hashCode(this.filter) * 31);
        }

        public String toString() {
            return "ContextPair(filter=" + this.filter + ", afib=" + this.afib + ')';
        }
    }

    static {
        System.loadLibrary("ecgw2-lib");
    }

    private EcgNativeV2() {
    }

    public final native int[] filterAll(long j5, long j11, int[] iArr);

    public final native BatchResult filterBatch(long j5, long j11, int[] iArr);

    public final native void filterFinish(long j5, long j11);

    public final native ContextPair filterInit(int i11, int i12);
}
