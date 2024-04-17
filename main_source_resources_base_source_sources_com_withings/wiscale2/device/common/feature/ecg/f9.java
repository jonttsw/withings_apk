package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class f9 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51347a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51348b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(r8.n nVar, WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(4);
        this.f51347a = wBS08EcgActivationActivity;
        this.f51348b = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [ym0.a, kotlin.jvm.internal.a] */
    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        WBS08EcgActivationViewModel R3;
        androidx.compose.material3.j5.e(num, cVar, "$this$composable", dVar, "it");
        R3 = this.f51347a.R3();
        String color = R3.B0().getColor();
        r8.n nVar = this.f51348b;
        ?? aVar2 = new kotlin.jvm.internal.a(0, nVar, r8.n.class, "popBackStack", "popBackStack()Z", 8);
        e9 e9Var = new e9(nVar);
        this.f51347a.z3(4096, 0, aVar, color, aVar2, e9Var);
        return nm0.y.f85009a;
    }
}
