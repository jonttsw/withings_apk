package com.withings.authentication.mfa;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsMfaNavigation.kt */
/* loaded from: classes3.dex */
public final class b0 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.navigation.e f31616a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(r8.n nVar) {
        super(4);
        this.f31616a = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        androidx.navigation.e eVar = this.f31616a;
        lh.o.a(new z(eVar), null, new a0(eVar), aVar, 48);
        return nm0.y.f85009a;
    }
}
