package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class c2 extends kotlin.jvm.internal.w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f51247a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f51248b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(int i11, androidx.compose.ui.e eVar) {
        super(3);
        this.f51247a = i11;
        this.f51248b = eVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.i AnimatedVisibility = iVar;
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        kotlin.jvm.internal.u.j(AnimatedVisibility, "$this$AnimatedVisibility");
        n0.z.a(s2.d.a(this.f51247a, aVar2), "Ecg live", this.f51248b, null, null, 0.0f, null, aVar2, 56, 120);
        return nm0.y.f85009a;
    }
}
