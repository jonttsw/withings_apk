package com.withings.library.vo2.firstbeat;

import com.withings.library.vo2.Vo2MaxInput;
import com.withings.library.vo2.Vo2MaxMode;
import com.withings.library.vo2.Vo2MaxOutput;
import com.withings.library.vo2.Vo2MaxUserInfoInput;
import com.withings.library.vo2.firstbeat.utils.FxIntHelperKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: FirstbeatVo2MaxComputer.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¢\u0006\u0002\u0010\u0010J%\u0010\u0011\u001a\u0004\u0018\u00010\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¢\u0006\u0002\u0010\u0012J\f\u0010\u0011\u001a\u00020\r*\u00020\u000fH\u0002J\"\u0010\u0013\u001a\u00020\u0004*\u00020\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¨\u0006\u0017"}, d2 = {"Lcom/withings/library/vo2/firstbeat/FirstbeatVo2MaxComputer;", "", "()V", "compute", "Lcom/withings/library/vo2/Vo2MaxOutput;", "vo2MaxUserInfoInput", "Lcom/withings/library/vo2/Vo2MaxUserInfoInput;", "vo2MaxInputs", "", "Lcom/withings/library/vo2/Vo2MaxInput;", "vo2MaxMode", "Lcom/withings/library/vo2/Vo2MaxMode;", "getTrainingLoad", "", "eteResults", "Lcom/withings/library/vo2/firstbeat/EteResults;", "(Lcom/withings/library/vo2/firstbeat/EteResults;)Ljava/lang/Double;", "getVo2Max", "(Ljava/util/List;Lcom/withings/library/vo2/firstbeat/EteResults;)Ljava/lang/Double;", "toFirstbeatVo2MaxOutput", "algoVersion", "", "Companion", "Vo2Lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FirstbeatVo2MaxComputer {
    public static final Companion Companion = new Companion(null);
    private static final double MAXMET_TO_VO2MAX_COEFFICIENT = 3.5d;

    /* compiled from: FirstbeatVo2MaxComputer.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/library/vo2/firstbeat/FirstbeatVo2MaxComputer$Companion;", "", "()V", "MAXMET_TO_VO2MAX_COEFFICIENT", "", "Vo2Lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    private final Double getTrainingLoad(EteResults eteResults) {
        if (eteResults.getTrainingLoadPeak() > 0) {
            return Double.valueOf(FxIntHelperKt.fxIntToDouble(eteResults.getTrainingLoadPeak()));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Double getVo2Max(java.util.List<com.withings.library.vo2.Vo2MaxInput> r5, com.withings.library.vo2.firstbeat.EteResults r6) {
        /*
            r4 = this;
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r0 = r5 instanceof java.util.Collection
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L13
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
        L11:
            r5 = r2
            goto L30
        L13:
            java.util.Iterator r5 = r5.iterator()
        L17:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L11
            java.lang.Object r0 = r5.next()
            com.withings.library.vo2.Vo2MaxInput r0 = (com.withings.library.vo2.Vo2MaxInput) r0
            java.lang.Double r3 = r0.getAltitude()
            if (r3 != 0) goto L2f
            java.lang.Double r0 = r0.getSpeed()
            if (r0 == 0) goto L17
        L2f:
            r5 = r1
        L30:
            int r0 = r6.getMaximalMetMinutes()
            if (r0 <= 0) goto L38
            r0 = r1
            goto L39
        L38:
            r0 = r2
        L39:
            int r3 = r6.getTrainingLoadPeak()
            if (r3 <= 0) goto L40
            goto L41
        L40:
            r1 = r2
        L41:
            if (r5 == 0) goto L50
            if (r0 == 0) goto L50
            if (r1 == 0) goto L50
            double r5 = r4.getVo2Max(r6)
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            goto L51
        L50:
            r5 = 0
        L51:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.vo2.firstbeat.FirstbeatVo2MaxComputer.getVo2Max(java.util.List, com.withings.library.vo2.firstbeat.EteResults):java.lang.Double");
    }

    private final Vo2MaxOutput toFirstbeatVo2MaxOutput(EteResults eteResults, List<Vo2MaxInput> list, String str) {
        return new Vo2MaxOutput(eteResults.getStatus(), getVo2Max(list, eteResults), getTrainingLoad(eteResults), str, null, 16, null);
    }

    public final Vo2MaxOutput compute(Vo2MaxUserInfoInput vo2MaxUserInfoInput, List<Vo2MaxInput> vo2MaxInputs, Vo2MaxMode vo2MaxMode) {
        boolean z5;
        u.j(vo2MaxUserInfoInput, "vo2MaxUserInfoInput");
        u.j(vo2MaxInputs, "vo2MaxInputs");
        u.j(vo2MaxMode, "vo2MaxMode");
        FirstbeatVo2MaxTracesBuilder firstbeatVo2MaxTracesBuilder = new FirstbeatVo2MaxTracesBuilder();
        NativeFirstbeatVo2MaxComputer nativeFirstbeatVo2MaxComputer = new NativeFirstbeatVo2MaxComputer();
        nativeFirstbeatVo2MaxComputer.injectFirstbeatParameters(vo2MaxUserInfoInput);
        if (vo2MaxMode != Vo2MaxMode.RUNNING) {
            z5 = true;
        } else {
            z5 = false;
        }
        nativeFirstbeatVo2MaxComputer.injectWalkingTest(z5);
        for (Vo2MaxInput vo2MaxInput : vo2MaxInputs) {
            nativeFirstbeatVo2MaxComputer.injectInput(vo2MaxInput);
        }
        EteResults results = nativeFirstbeatVo2MaxComputer.getResults();
        Vo2MaxOutput firstbeatVo2MaxOutput = toFirstbeatVo2MaxOutput(results, vo2MaxInputs, nativeFirstbeatVo2MaxComputer.getVersion());
        firstbeatVo2MaxOutput.setTraces(firstbeatVo2MaxTracesBuilder.build(vo2MaxUserInfoInput, vo2MaxInputs, firstbeatVo2MaxOutput, results));
        return firstbeatVo2MaxOutput;
    }

    private final double getVo2Max(EteResults eteResults) {
        return FxIntHelperKt.fxIntToDouble(eteResults.getMaximalMet()[2]) * 3.5d;
    }
}
