package com.withings.wiscale2.settings;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class a5 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f59868a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f59869b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(ym0.a<nm0.y> aVar, SettingsActivity settingsActivity) {
        super(4);
        this.f59868a = aVar;
        this.f59869b = settingsActivity;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        z4 z4Var = new z4(this.f59869b);
        c1.d(null, this.f59868a, z4Var, aVar, 0, 1);
        return nm0.y.f85009a;
    }
}
