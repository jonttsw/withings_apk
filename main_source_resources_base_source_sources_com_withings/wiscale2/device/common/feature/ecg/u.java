package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class u extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51759a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51760b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(r8.n nVar, EcgActivationActivity ecgActivationActivity) {
        super(4);
        this.f51759a = ecgActivationActivity;
        this.f51760b = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.material3.j5.e(num, cVar, "$this$composable", dVar, "it");
        EcgActivationActivity.B3(this.f51759a, this.f51760b, aVar, 72);
        return nm0.y.f85009a;
    }
}
