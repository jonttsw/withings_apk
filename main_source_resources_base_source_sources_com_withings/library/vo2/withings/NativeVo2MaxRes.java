package com.withings.library.vo2.withings;

import androidx.activity.b;
import androidx.compose.material.o;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: NativeVo2MaxRes.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/withings/library/vo2/withings/NativeVo2MaxRes;", "", "status", "", ConstantsWs.SUBCATEGORY_FEATURE_VO2MAX, "", "algoVersion", "", "(SFI)V", "getAlgoVersion", "()I", "getStatus", "()S", "getVo2max", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Vo2Lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NativeVo2MaxRes {
    private final int algoVersion;
    private final short status;
    private final float vo2max;

    public NativeVo2MaxRes(short s11, float f11, int i11) {
        this.status = s11;
        this.vo2max = f11;
        this.algoVersion = i11;
    }

    public static /* synthetic */ NativeVo2MaxRes copy$default(NativeVo2MaxRes nativeVo2MaxRes, short s11, float f11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            s11 = nativeVo2MaxRes.status;
        }
        if ((i12 & 2) != 0) {
            f11 = nativeVo2MaxRes.vo2max;
        }
        if ((i12 & 4) != 0) {
            i11 = nativeVo2MaxRes.algoVersion;
        }
        return nativeVo2MaxRes.copy(s11, f11, i11);
    }

    public final short component1() {
        return this.status;
    }

    public final float component2() {
        return this.vo2max;
    }

    public final int component3() {
        return this.algoVersion;
    }

    public final NativeVo2MaxRes copy(short s11, float f11, int i11) {
        return new NativeVo2MaxRes(s11, f11, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeVo2MaxRes)) {
            return false;
        }
        NativeVo2MaxRes nativeVo2MaxRes = (NativeVo2MaxRes) obj;
        if (this.status == nativeVo2MaxRes.status && u.e(Float.valueOf(this.vo2max), Float.valueOf(nativeVo2MaxRes.vo2max)) && this.algoVersion == nativeVo2MaxRes.algoVersion) {
            return true;
        }
        return false;
    }

    public final int getAlgoVersion() {
        return this.algoVersion;
    }

    public final short getStatus() {
        return this.status;
    }

    public final float getVo2max() {
        return this.vo2max;
    }

    public int hashCode() {
        return Integer.hashCode(this.algoVersion) + o.a(this.vo2max, Short.hashCode(this.status) * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NativeVo2MaxRes(status=");
        sb2.append((int) this.status);
        sb2.append(", vo2max=");
        sb2.append(this.vo2max);
        sb2.append(", algoVersion=");
        return b.c(sb2, this.algoVersion, ')');
    }
}
