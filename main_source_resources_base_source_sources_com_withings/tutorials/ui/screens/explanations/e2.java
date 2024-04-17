package com.withings.tutorials.ui.screens.explanations;
/* compiled from: Vo2Max.kt */
/* loaded from: classes4.dex */
final class e2 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45126a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f45127b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(r8.n nVar, ym0.a aVar) {
        super(4);
        this.f45126a = aVar;
        this.f45127b = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        d2 d2Var = new d2(this.f45127b);
        x2.b(this.f45126a, d2Var, aVar, 0);
        return nm0.y.f85009a;
    }
}
