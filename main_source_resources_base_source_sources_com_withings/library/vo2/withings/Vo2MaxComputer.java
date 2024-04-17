package com.withings.library.vo2.withings;

import com.withings.library.vo2.Vo2MaxInput;
import com.withings.library.vo2.Vo2MaxOutput;
import com.withings.library.vo2.Vo2MaxUserInfoInput;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: Vo2MaxComputer.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/withings/library/vo2/withings/Vo2MaxComputer;", "", "()V", "nativeVo2MaxComputer", "Lcom/withings/library/vo2/withings/NativeVo2MaxComputer;", "compute", "Lcom/withings/library/vo2/Vo2MaxOutput;", "vo2MaxUserInfoInput", "Lcom/withings/library/vo2/Vo2MaxUserInfoInput;", "vo2MaxInputs", "", "Lcom/withings/library/vo2/Vo2MaxInput;", "firstbeat_legacy", "", "isRunning", "Vo2Lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Vo2MaxComputer {
    private final NativeVo2MaxComputer nativeVo2MaxComputer = new NativeVo2MaxComputer();

    public final Vo2MaxOutput compute(Vo2MaxUserInfoInput vo2MaxUserInfoInput, List<Vo2MaxInput> vo2MaxInputs, boolean z5, boolean z11) {
        Double d11;
        u.j(vo2MaxUserInfoInput, "vo2MaxUserInfoInput");
        u.j(vo2MaxInputs, "vo2MaxInputs");
        Vo2MaxOutput compute = this.nativeVo2MaxComputer.compute(vo2MaxUserInfoInput, vo2MaxInputs, z5, z11);
        Double vo2Max = compute.getVo2Max();
        if (vo2Max != null && !Double.isNaN(vo2Max.doubleValue())) {
            d11 = vo2Max;
        } else {
            d11 = null;
        }
        return new Vo2MaxOutput(compute.getComputeStatus(), d11, compute.getTrainingLoad(), compute.getAlgoVersion(), compute.getTraces());
    }
}
