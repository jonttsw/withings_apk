package com.withings.authentication.mfa;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ResolveMultiFactorActivity.kt */
/* loaded from: classes3.dex */
public final class n extends kotlin.jvm.internal.w implements ym0.q<r8.n, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f31747a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ResolveMultiFactorActivity f31748b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f31749c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, ResolveMultiFactorActivity resolveMultiFactorActivity, Context context) {
        super(3);
        this.f31747a = str;
        this.f31748b = resolveMultiFactorActivity;
        this.f31749c = context;
    }

    @Override // ym0.q
    public final nm0.y invoke(r8.n nVar, androidx.compose.runtime.a aVar, Integer num) {
        r8.n navController = nVar;
        num.intValue();
        kotlin.jvm.internal.u.j(navController, "navController");
        m mVar = new m(this.f31748b, navController, this.f31749c);
        g gVar = g.f31626a;
        h hVar = h.f31628a;
        androidx.navigation.compose.s.b(navController, this.f31747a, null, null, null, e.f31622a, f.f31624a, gVar, hVar, mVar, aVar, 115015688, 28);
        return nm0.y.f85009a;
    }
}
