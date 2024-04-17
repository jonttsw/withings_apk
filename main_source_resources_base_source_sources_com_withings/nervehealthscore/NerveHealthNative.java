package com.withings.nervehealthscore;

import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import pm0.a;
/* compiled from: NerveHealthNative.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J$\u0010\b\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u000b\u001a\u00020\fH\u0082 ¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withings/nervehealthscore/NerveHealthNative;", "", "()V", "getNeuropathyDiagnostics", "Lcom/withings/nervehealthscore/NHSProcessResult;", "neuropathyMeasureNative", "", "Lcom/withings/nervehealthscore/NeuropathyMeasureNative;", "processSudoMeasures", "neuropathyMeasuresNative", "", "currentDate", "Lcom/withings/nervehealthscore/TimeStampNative;", "([Lcom/withings/nervehealthscore/NeuropathyMeasureNative;Lcom/withings/nervehealthscore/TimeStampNative;)Lcom/withings/nervehealthscore/NHSProcessResult;", "nervehealthscore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class NerveHealthNative {
    public NerveHealthNative() {
        System.loadLibrary("nerveHealthScore");
    }

    private final native NHSProcessResult processSudoMeasures(NeuropathyMeasureNative[] neuropathyMeasureNativeArr, TimeStampNative timeStampNative);

    public final NHSProcessResult getNeuropathyDiagnostics(List<NeuropathyMeasureNative> neuropathyMeasureNative) {
        u.j(neuropathyMeasureNative, "neuropathyMeasureNative");
        Object[] array = x.D0(neuropathyMeasureNative, new Comparator() { // from class: com.withings.nervehealthscore.NerveHealthNative$getNeuropathyDiagnostics$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return a.b(((NeuropathyMeasureNative) t11).getTimeStamp().toDateTime(), ((NeuropathyMeasureNative) t12).getTimeStamp().toDateTime());
            }
        }).toArray(new NeuropathyMeasureNative[0]);
        u.h(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        DateTime now = DateTime.now();
        u.i(now, "now()");
        return processSudoMeasures((NeuropathyMeasureNative[]) array, new TimeStampNative(now));
    }
}
