package com.withings.wiscale2.measure.accountmeasure.ui.add;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.wiscale2.measure.accountmeasure.ui.FatMassView;
import tb0.r1;
/* compiled from: AddWeightFragment.kt */
/* loaded from: classes5.dex */
final class r0 extends kotlin.jvm.internal.w implements ym0.l<Double, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o0 f58273a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(o0 o0Var) {
        super(1);
        this.f58273a = o0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(Double d11) {
        r1 I1;
        double d12;
        Double d13 = d11;
        I1 = this.f58273a.I1();
        FatMassView fatMassView = I1.f99448a;
        if (d13 != null) {
            d12 = d13.doubleValue();
        } else {
            d12 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        fatMassView.setValue(d12);
        return nm0.y.f85009a;
    }
}
