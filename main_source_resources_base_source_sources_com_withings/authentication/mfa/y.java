package com.withings.authentication.mfa;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsMfaNavigation.kt */
/* loaded from: classes3.dex */
public final class y extends kotlin.jvm.internal.w implements ym0.r<l0.i, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.navigation.e f32231a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(r8.n nVar) {
        super(4);
        this.f32231a = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.i iVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.i composableWithHorizontalTransition = iVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composableWithHorizontalTransition, "$this$composableWithHorizontalTransition");
        kotlin.jvm.internal.u.j(it, "it");
        androidx.navigation.e eVar = this.f32231a;
        fh.e.c(new u(eVar), new v(eVar), new w(eVar), new x(eVar), null, aVar, 0, 16);
        return nm0.y.f85009a;
    }
}
