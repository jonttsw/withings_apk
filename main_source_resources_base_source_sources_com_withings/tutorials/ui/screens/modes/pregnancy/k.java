package com.withings.tutorials.ui.screens.modes.pregnancy;

import com.withings.library.authentication.api.ConstantsWs;
/* compiled from: PregnancyMode.kt */
/* loaded from: classes4.dex */
final class k extends kotlin.jvm.internal.w implements ym0.r<r0.h, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45961a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45962b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2) {
        super(4);
        this.f45961a = aVar;
        this.f45962b = aVar2;
    }

    @Override // ym0.r
    public final nm0.y invoke(r0.h hVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.h bottomSheet = hVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(bottomSheet, "$this$bottomSheet");
        kotlin.jvm.internal.u.j(it, "it");
        d.f45852a.a(this.f45961a, this.f45962b, aVar, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED);
        return nm0.y.f85009a;
    }
}
