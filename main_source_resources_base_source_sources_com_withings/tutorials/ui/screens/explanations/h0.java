package com.withings.tutorials.ui.screens.explanations;
/* compiled from: SleepApnea.kt */
/* loaded from: classes4.dex */
final class h0 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45150a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f45151b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(r8.n nVar, ym0.a aVar) {
        super(4);
        this.f45150a = aVar;
        this.f45151b = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        g0 g0Var = new g0(this.f45151b);
        c1.b(this.f45150a, g0Var, aVar, 0);
        return nm0.y.f85009a;
    }
}
