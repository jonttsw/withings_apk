package com.withings.tutorials.ui.screens.modes.athlete;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.r;
/* compiled from: AthleteMode.kt */
/* loaded from: classes4.dex */
final class g extends w implements r<r0.h, androidx.navigation.d, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f45597a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f45598b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ym0.a<y> aVar, ym0.a<y> aVar2) {
        super(4);
        this.f45597a = aVar;
        this.f45598b = aVar2;
    }

    @Override // ym0.r
    public final y invoke(r0.h hVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.h bottomSheet = hVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        u.j(bottomSheet, "$this$bottomSheet");
        u.j(it, "it");
        a.f45543a.c(this.f45597a, this.f45598b, aVar, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED);
        return y.f85009a;
    }
}
