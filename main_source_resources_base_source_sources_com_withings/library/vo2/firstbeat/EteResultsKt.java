package com.withings.library.vo2.firstbeat;

import com.withings.library.vo2.Vo2MaxComputeStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: EteResults.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toLocalEteResults", "Lcom/withings/library/vo2/firstbeat/EteResults;", "Lfi/firstbeat/ete/EteResults;", "status", "Lcom/withings/library/vo2/Vo2MaxComputeStatus;", "Vo2Lib_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EteResultsKt {
    public static final EteResults toLocalEteResults(fi.firstbeat.ete.EteResults eteResults, Vo2MaxComputeStatus status) {
        u.j(eteResults, "<this>");
        u.j(status, "status");
        int i11 = eteResults.correctedHr;
        int i12 = eteResults.artifactPercent;
        int i13 = eteResults.minimalHr;
        int i14 = eteResults.maximalHr;
        int i15 = eteResults.trainingLoadPeak;
        int[] iArr = eteResults.maximalMet;
        u.i(iArr, "this.maximalMet");
        return new EteResults(status, i11, i12, i13, i14, i15, iArr, eteResults.maximalMetMinutes);
    }
}
