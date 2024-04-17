package com.withings.wiscale2.settings;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class z2 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f60405a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f60406b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f60407c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f60408d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f60409e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60410f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, ym0.a<nm0.y> aVar4, SettingsViewModel settingsViewModel, SettingsActivity settingsActivity) {
        super(4);
        this.f60405a = aVar;
        this.f60406b = aVar2;
        this.f60407c = aVar3;
        this.f60408d = aVar4;
        this.f60409e = settingsViewModel;
        this.f60410f = settingsActivity;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        y2 y2Var = new y2(this.f60410f);
        ym0.a<nm0.y> aVar2 = this.f60407c;
        ym0.a<nm0.y> aVar3 = this.f60408d;
        a.a(this.f60405a, this.f60406b, aVar2, aVar3, y2Var, this.f60409e, aVar, 262144);
        return nm0.y.f85009a;
    }
}
