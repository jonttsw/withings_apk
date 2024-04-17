package com.withings.tutorials.ui.screens.modes.pacemaker;

import androidx.compose.material3.j5;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.r;
/* compiled from: PacemakerMode.kt */
/* loaded from: classes4.dex */
final class g extends w implements r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f45764a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f45765b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r8.n nVar, ym0.a aVar) {
        super(4);
        this.f45764a = aVar;
        this.f45765b = nVar;
    }

    @Override // ym0.r
    public final y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        j5.e(num, cVar, "$this$composable", dVar, "it");
        c cVar2 = c.f45714a;
        f fVar = new f(this.f45765b);
        cVar2.c(this.f45764a, fVar, aVar, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED);
        return y.f85009a;
    }
}
