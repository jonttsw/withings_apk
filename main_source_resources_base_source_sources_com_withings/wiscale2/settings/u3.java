package com.withings.wiscale2.settings;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class u3 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r8.n f60334a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60335b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(r8.n nVar, SettingsActivity settingsActivity) {
        super(4);
        this.f60334a = nVar;
        this.f60335b = settingsActivity;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        r8.n nVar = this.f60334a;
        oc0.h.a(0, aVar, new t3(nVar, this.f60335b), new s3(nVar));
        return nm0.y.f85009a;
    }
}
