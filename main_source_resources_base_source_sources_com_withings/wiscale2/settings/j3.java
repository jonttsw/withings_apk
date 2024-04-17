package com.withings.wiscale2.settings;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class j3 extends kotlin.jvm.internal.w implements ym0.r<r0.h, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r8.n f60076a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(r8.n nVar) {
        super(4);
        this.f60076a = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(r0.h hVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.h bottomSheet = hVar;
        androidx.navigation.d it = dVar;
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        kotlin.jvm.internal.u.j(bottomSheet, "$this$bottomSheet");
        kotlin.jvm.internal.u.j(it, "it");
        r8.n nVar = this.f60076a;
        e.j.a(0, 1, aVar2, new g3(nVar), false);
        l0.b(new h3(nVar), new i3(nVar), aVar2, 0);
        return nm0.y.f85009a;
    }
}
