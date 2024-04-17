package com.withings.ecg.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: LiveEcgMeasurementRepository.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/withings/ecg/model/LiveEcgData;", "", FirebaseAnalytics.Param.INDEX, "", "filteredPayload", "", "(I[I)V", "getFilteredPayload", "()[I", "getIndex", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "ecg_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LiveEcgData {
    public static final int $stable = 8;
    private final int[] filteredPayload;
    private final int index;

    public LiveEcgData(int i11, int[] filteredPayload) {
        u.j(filteredPayload, "filteredPayload");
        this.index = i11;
        this.filteredPayload = filteredPayload;
    }

    public static /* synthetic */ LiveEcgData copy$default(LiveEcgData liveEcgData, int i11, int[] iArr, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = liveEcgData.index;
        }
        if ((i12 & 2) != 0) {
            iArr = liveEcgData.filteredPayload;
        }
        return liveEcgData.copy(i11, iArr);
    }

    public final int component1() {
        return this.index;
    }

    public final int[] component2() {
        return this.filteredPayload;
    }

    public final LiveEcgData copy(int i11, int[] filteredPayload) {
        u.j(filteredPayload, "filteredPayload");
        return new LiveEcgData(i11, filteredPayload);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveEcgData)) {
            return false;
        }
        LiveEcgData liveEcgData = (LiveEcgData) obj;
        if (this.index == liveEcgData.index && u.e(this.filteredPayload, liveEcgData.filteredPayload)) {
            return true;
        }
        return false;
    }

    public final int[] getFilteredPayload() {
        return this.filteredPayload;
    }

    public final int getIndex() {
        return this.index;
    }

    public int hashCode() {
        return Arrays.hashCode(this.filteredPayload) + (Integer.hashCode(this.index) * 31);
    }

    public String toString() {
        int i11 = this.index;
        String arrays = Arrays.toString(this.filteredPayload);
        return "LiveEcgData(index=" + i11 + ", filteredPayload=" + arrays + ")";
    }
}
