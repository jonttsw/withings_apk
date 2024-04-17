package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class b2 extends kotlin.jvm.internal.w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51207a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(EcgActivationActivity ecgActivationActivity) {
        super(3);
        this.f51207a = ecgActivationActivity;
    }

    @Override // ym0.q
    public final nm0.y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.i AnimatedVisibility = iVar;
        num.intValue();
        kotlin.jvm.internal.u.j(AnimatedVisibility, "$this$AnimatedVisibility");
        EcgActivationActivity.G3(this.f51207a, aVar, 8);
        return nm0.y.f85009a;
    }
}
