package com.withings.library.ecg.leads;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: EcgLeadsProvider.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0017\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/withings/library/ecg/leads/ComputeResult;", "", "dI", "", "dII", "dIII", "aVR", "aVL", "aVF", "([S[S[S[S[S[S)V", "getAVF", "()[S", "getAVL", "getAVR", "getDI", "getDII", "getDIII", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ecg-library_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComputeResult {
    private final short[] aVF;
    private final short[] aVL;
    private final short[] aVR;
    private final short[] dI;
    private final short[] dII;
    private final short[] dIII;

    public ComputeResult(short[] dI, short[] dII, short[] dIII, short[] aVR, short[] aVL, short[] aVF) {
        u.j(dI, "dI");
        u.j(dII, "dII");
        u.j(dIII, "dIII");
        u.j(aVR, "aVR");
        u.j(aVL, "aVL");
        u.j(aVF, "aVF");
        this.dI = dI;
        this.dII = dII;
        this.dIII = dIII;
        this.aVR = aVR;
        this.aVL = aVL;
        this.aVF = aVF;
    }

    public static /* synthetic */ ComputeResult copy$default(ComputeResult computeResult, short[] sArr, short[] sArr2, short[] sArr3, short[] sArr4, short[] sArr5, short[] sArr6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            sArr = computeResult.dI;
        }
        if ((i11 & 2) != 0) {
            sArr2 = computeResult.dII;
        }
        short[] sArr7 = sArr2;
        if ((i11 & 4) != 0) {
            sArr3 = computeResult.dIII;
        }
        short[] sArr8 = sArr3;
        if ((i11 & 8) != 0) {
            sArr4 = computeResult.aVR;
        }
        short[] sArr9 = sArr4;
        if ((i11 & 16) != 0) {
            sArr5 = computeResult.aVL;
        }
        short[] sArr10 = sArr5;
        if ((i11 & 32) != 0) {
            sArr6 = computeResult.aVF;
        }
        return computeResult.copy(sArr, sArr7, sArr8, sArr9, sArr10, sArr6);
    }

    public final short[] component1() {
        return this.dI;
    }

    public final short[] component2() {
        return this.dII;
    }

    public final short[] component3() {
        return this.dIII;
    }

    public final short[] component4() {
        return this.aVR;
    }

    public final short[] component5() {
        return this.aVL;
    }

    public final short[] component6() {
        return this.aVF;
    }

    public final ComputeResult copy(short[] dI, short[] dII, short[] dIII, short[] aVR, short[] aVL, short[] aVF) {
        u.j(dI, "dI");
        u.j(dII, "dII");
        u.j(dIII, "dIII");
        u.j(aVR, "aVR");
        u.j(aVL, "aVL");
        u.j(aVF, "aVF");
        return new ComputeResult(dI, dII, dIII, aVR, aVL, aVF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComputeResult)) {
            return false;
        }
        ComputeResult computeResult = (ComputeResult) obj;
        if (u.e(this.dI, computeResult.dI) && u.e(this.dII, computeResult.dII) && u.e(this.dIII, computeResult.dIII) && u.e(this.aVR, computeResult.aVR) && u.e(this.aVL, computeResult.aVL) && u.e(this.aVF, computeResult.aVF)) {
            return true;
        }
        return false;
    }

    public final short[] getAVF() {
        return this.aVF;
    }

    public final short[] getAVL() {
        return this.aVL;
    }

    public final short[] getAVR() {
        return this.aVR;
    }

    public final short[] getDI() {
        return this.dI;
    }

    public final short[] getDII() {
        return this.dII;
    }

    public final short[] getDIII() {
        return this.dIII;
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.dII);
        int hashCode2 = Arrays.hashCode(this.dIII);
        int hashCode3 = Arrays.hashCode(this.aVR);
        int hashCode4 = Arrays.hashCode(this.aVL);
        return Arrays.hashCode(this.aVF) + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (Arrays.hashCode(this.dI) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "ComputeResult(dI=" + Arrays.toString(this.dI) + ", dII=" + Arrays.toString(this.dII) + ", dIII=" + Arrays.toString(this.dIII) + ", aVR=" + Arrays.toString(this.aVR) + ", aVL=" + Arrays.toString(this.aVL) + ", aVF=" + Arrays.toString(this.aVF) + ')';
    }
}
