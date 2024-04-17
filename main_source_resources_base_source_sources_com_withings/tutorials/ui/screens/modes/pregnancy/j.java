package com.withings.tutorials.ui.screens.modes.pregnancy;

import androidx.compose.material3.j5;
import androidx.compose.runtime.a;
import com.withings.library.authentication.api.ConstantsWs;
/* compiled from: PregnancyMode.kt */
/* loaded from: classes4.dex */
final class j extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45957a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<String, nm0.y> f45958b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(ym0.a<nm0.y> aVar, ym0.l<? super String, nm0.y> lVar) {
        super(4);
        this.f45957a = aVar;
        this.f45958b = lVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        j5.e(num, cVar, "$this$composable", dVar, "it");
        d dVar2 = d.f45852a;
        aVar2.s(1959881420);
        ym0.l<String, nm0.y> lVar = this.f45958b;
        boolean K = aVar2.K(lVar);
        Object t11 = aVar2.t();
        if (K || t11 == a.C0060a.a()) {
            t11 = new i(lVar);
            aVar2.n(t11);
        }
        aVar2.J();
        dVar2.b(this.f45957a, (ym0.a) t11, aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED);
        return nm0.y.f85009a;
    }
}
