package com.withings.library.vo2;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: Vo2MaxOutput.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JJ\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016¨\u0006&"}, d2 = {"Lcom/withings/library/vo2/Vo2MaxOutput;", "", "computeStatus", "Lcom/withings/library/vo2/Vo2MaxComputeStatus;", "vo2Max", "", "trainingLoad", "algoVersion", "", "traces", "", "Lcom/withings/library/vo2/Vo2MaxTrace;", "(Lcom/withings/library/vo2/Vo2MaxComputeStatus;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;)V", "getAlgoVersion", "()Ljava/lang/String;", "getComputeStatus", "()Lcom/withings/library/vo2/Vo2MaxComputeStatus;", "getTraces", "()Ljava/util/List;", "setTraces", "(Ljava/util/List;)V", "getTrainingLoad", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getVo2Max", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/withings/library/vo2/Vo2MaxComputeStatus;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;)Lcom/withings/library/vo2/Vo2MaxOutput;", "equals", "", "other", "hashCode", "", "toString", "Vo2Lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Vo2MaxOutput {
    private final String algoVersion;
    private final Vo2MaxComputeStatus computeStatus;
    private List<Vo2MaxTrace> traces;
    private final Double trainingLoad;
    private final Double vo2Max;

    public Vo2MaxOutput(Vo2MaxComputeStatus computeStatus, Double d11, Double d12, String algoVersion, List<Vo2MaxTrace> traces) {
        u.j(computeStatus, "computeStatus");
        u.j(algoVersion, "algoVersion");
        u.j(traces, "traces");
        this.computeStatus = computeStatus;
        this.vo2Max = d11;
        this.trainingLoad = d12;
        this.algoVersion = algoVersion;
        this.traces = traces;
    }

    public static /* synthetic */ Vo2MaxOutput copy$default(Vo2MaxOutput vo2MaxOutput, Vo2MaxComputeStatus vo2MaxComputeStatus, Double d11, Double d12, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            vo2MaxComputeStatus = vo2MaxOutput.computeStatus;
        }
        if ((i11 & 2) != 0) {
            d11 = vo2MaxOutput.vo2Max;
        }
        Double d13 = d11;
        if ((i11 & 4) != 0) {
            d12 = vo2MaxOutput.trainingLoad;
        }
        Double d14 = d12;
        if ((i11 & 8) != 0) {
            str = vo2MaxOutput.algoVersion;
        }
        String str2 = str;
        List<Vo2MaxTrace> list2 = list;
        if ((i11 & 16) != 0) {
            list2 = vo2MaxOutput.traces;
        }
        return vo2MaxOutput.copy(vo2MaxComputeStatus, d13, d14, str2, list2);
    }

    public final Vo2MaxComputeStatus component1() {
        return this.computeStatus;
    }

    public final Double component2() {
        return this.vo2Max;
    }

    public final Double component3() {
        return this.trainingLoad;
    }

    public final String component4() {
        return this.algoVersion;
    }

    public final List<Vo2MaxTrace> component5() {
        return this.traces;
    }

    public final Vo2MaxOutput copy(Vo2MaxComputeStatus computeStatus, Double d11, Double d12, String algoVersion, List<Vo2MaxTrace> traces) {
        u.j(computeStatus, "computeStatus");
        u.j(algoVersion, "algoVersion");
        u.j(traces, "traces");
        return new Vo2MaxOutput(computeStatus, d11, d12, algoVersion, traces);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vo2MaxOutput)) {
            return false;
        }
        Vo2MaxOutput vo2MaxOutput = (Vo2MaxOutput) obj;
        if (this.computeStatus == vo2MaxOutput.computeStatus && u.e(this.vo2Max, vo2MaxOutput.vo2Max) && u.e(this.trainingLoad, vo2MaxOutput.trainingLoad) && u.e(this.algoVersion, vo2MaxOutput.algoVersion) && u.e(this.traces, vo2MaxOutput.traces)) {
            return true;
        }
        return false;
    }

    public final String getAlgoVersion() {
        return this.algoVersion;
    }

    public final Vo2MaxComputeStatus getComputeStatus() {
        return this.computeStatus;
    }

    public final List<Vo2MaxTrace> getTraces() {
        return this.traces;
    }

    public final Double getTrainingLoad() {
        return this.trainingLoad;
    }

    public final Double getVo2Max() {
        return this.vo2Max;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.computeStatus.hashCode() * 31;
        Double d11 = this.vo2Max;
        int i11 = 0;
        if (d11 == null) {
            hashCode = 0;
        } else {
            hashCode = d11.hashCode();
        }
        int i12 = (hashCode2 + hashCode) * 31;
        Double d12 = this.trainingLoad;
        if (d12 != null) {
            i11 = d12.hashCode();
        }
        return this.traces.hashCode() + d.c(this.algoVersion, (i12 + i11) * 31, 31);
    }

    public final void setTraces(List<Vo2MaxTrace> list) {
        u.j(list, "<set-?>");
        this.traces = list;
    }

    public String toString() {
        return "Vo2MaxOutput(computeStatus=" + this.computeStatus + ", vo2Max=" + this.vo2Max + ", trainingLoad=" + this.trainingLoad + ", algoVersion=" + this.algoVersion + ", traces=" + this.traces + ')';
    }

    public /* synthetic */ Vo2MaxOutput(Vo2MaxComputeStatus vo2MaxComputeStatus, Double d11, Double d12, String str, List list, int i11, m mVar) {
        this(vo2MaxComputeStatus, d11, d12, str, (i11 & 16) != 0 ? i0.f76187a : list);
    }
}
