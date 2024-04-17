package com.withings.wiscale2.settings;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class y4 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f60394a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60395b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f60396c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(ym0.a<nm0.y> aVar, SettingsActivity settingsActivity, r8.n nVar) {
        super(4);
        this.f60394a = aVar;
        this.f60395b = settingsActivity;
        this.f60396c = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        w4 w4Var = new w4(this.f60395b);
        x4 x4Var = new x4(this.f60396c);
        c1.b(this.f60394a, w4Var, x4Var, aVar, 0);
        return nm0.y.f85009a;
    }
}
