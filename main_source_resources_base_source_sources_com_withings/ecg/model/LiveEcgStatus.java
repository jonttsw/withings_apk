package com.withings.ecg.model;

import androidx.camera.core.y1;
import com.withings.comm.wpp.generated.object.StoredMeasureMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import u70.i;
/* compiled from: LiveEcgMeasurementRepository.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0004J\u0012\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJT\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\u0004R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b#\u0010\u0007R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010$\u001a\u0004\b%\u0010\nR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b&\u0010\u0004R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b'\u0010\nR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b)\u0010\u000f¨\u0006,"}, d2 = {"Lcom/withings/ecg/model/LiveEcgStatus;", "", "", "component1", "()Z", "Lcom/withings/comm/wpp/generated/object/StoredMeasureMeta;", "component2", "()Lcom/withings/comm/wpp/generated/object/StoredMeasureMeta;", "", "component3", "()Ljava/lang/Integer;", "component4", "component5", "Lu70/i;", "component6", "()Lu70/i;", "started", "meta", "stopReason", "ecgInserted", "trackerPos", "macAddress", "copy", "(ZLcom/withings/comm/wpp/generated/object/StoredMeasureMeta;Ljava/lang/Integer;ZLjava/lang/Integer;Lu70/i;)Lcom/withings/ecg/model/LiveEcgStatus;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getStarted", "Lcom/withings/comm/wpp/generated/object/StoredMeasureMeta;", "getMeta", "Ljava/lang/Integer;", "getStopReason", "getEcgInserted", "getTrackerPos", "Lu70/i;", "getMacAddress", "<init>", "(ZLcom/withings/comm/wpp/generated/object/StoredMeasureMeta;Ljava/lang/Integer;ZLjava/lang/Integer;Lu70/i;)V", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LiveEcgStatus {
    public static final int $stable = 8;
    private final boolean ecgInserted;
    private final i macAddress;
    private final StoredMeasureMeta meta;
    private final boolean started;
    private final Integer stopReason;
    private final Integer trackerPos;

    public /* synthetic */ LiveEcgStatus(boolean z5, StoredMeasureMeta storedMeasureMeta, Integer num, boolean z11, Integer num2, i iVar, int i11, m mVar) {
        this(z5, (i11 & 2) != 0 ? null : storedMeasureMeta, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? null : num2, (i11 & 32) == 0 ? iVar : null);
    }

    public static /* synthetic */ LiveEcgStatus copy$default(LiveEcgStatus liveEcgStatus, boolean z5, StoredMeasureMeta storedMeasureMeta, Integer num, boolean z11, Integer num2, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z5 = liveEcgStatus.started;
        }
        if ((i11 & 2) != 0) {
            storedMeasureMeta = liveEcgStatus.meta;
        }
        StoredMeasureMeta storedMeasureMeta2 = storedMeasureMeta;
        if ((i11 & 4) != 0) {
            num = liveEcgStatus.stopReason;
        }
        Integer num3 = num;
        if ((i11 & 8) != 0) {
            z11 = liveEcgStatus.ecgInserted;
        }
        boolean z12 = z11;
        if ((i11 & 16) != 0) {
            num2 = liveEcgStatus.trackerPos;
        }
        Integer num4 = num2;
        if ((i11 & 32) != 0) {
            iVar = liveEcgStatus.macAddress;
        }
        return liveEcgStatus.copy(z5, storedMeasureMeta2, num3, z12, num4, iVar);
    }

    public final boolean component1() {
        return this.started;
    }

    public final StoredMeasureMeta component2() {
        return this.meta;
    }

    public final Integer component3() {
        return this.stopReason;
    }

    public final boolean component4() {
        return this.ecgInserted;
    }

    public final Integer component5() {
        return this.trackerPos;
    }

    public final i component6() {
        return this.macAddress;
    }

    public final LiveEcgStatus copy(boolean z5, StoredMeasureMeta storedMeasureMeta, Integer num, boolean z11, Integer num2, i iVar) {
        return new LiveEcgStatus(z5, storedMeasureMeta, num, z11, num2, iVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveEcgStatus)) {
            return false;
        }
        LiveEcgStatus liveEcgStatus = (LiveEcgStatus) obj;
        if (this.started == liveEcgStatus.started && u.e(this.meta, liveEcgStatus.meta) && u.e(this.stopReason, liveEcgStatus.stopReason) && this.ecgInserted == liveEcgStatus.ecgInserted && u.e(this.trackerPos, liveEcgStatus.trackerPos) && u.e(this.macAddress, liveEcgStatus.macAddress)) {
            return true;
        }
        return false;
    }

    public final boolean getEcgInserted() {
        return this.ecgInserted;
    }

    public final i getMacAddress() {
        return this.macAddress;
    }

    public final StoredMeasureMeta getMeta() {
        return this.meta;
    }

    public final boolean getStarted() {
        return this.started;
    }

    public final Integer getStopReason() {
        return this.stopReason;
    }

    public final Integer getTrackerPos() {
        return this.trackerPos;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = Boolean.hashCode(this.started) * 31;
        StoredMeasureMeta storedMeasureMeta = this.meta;
        int i11 = 0;
        if (storedMeasureMeta == null) {
            hashCode = 0;
        } else {
            hashCode = storedMeasureMeta.hashCode();
        }
        int i12 = (hashCode4 + hashCode) * 31;
        Integer num = this.stopReason;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int a11 = y1.a(this.ecgInserted, (i12 + hashCode2) * 31, 31);
        Integer num2 = this.trackerPos;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i13 = (a11 + hashCode3) * 31;
        i iVar = this.macAddress;
        if (iVar != null) {
            i11 = iVar.hashCode();
        }
        return i13 + i11;
    }

    public String toString() {
        boolean z5 = this.started;
        StoredMeasureMeta storedMeasureMeta = this.meta;
        Integer num = this.stopReason;
        boolean z11 = this.ecgInserted;
        Integer num2 = this.trackerPos;
        i iVar = this.macAddress;
        return "LiveEcgStatus(started=" + z5 + ", meta=" + storedMeasureMeta + ", stopReason=" + num + ", ecgInserted=" + z11 + ", trackerPos=" + num2 + ", macAddress=" + iVar + ")";
    }

    public LiveEcgStatus(boolean z5, StoredMeasureMeta storedMeasureMeta, Integer num, boolean z11, Integer num2, i iVar) {
        this.started = z5;
        this.meta = storedMeasureMeta;
        this.stopReason = num;
        this.ecgInserted = z11;
        this.trackerPos = num2;
        this.macAddress = iVar;
    }
}
