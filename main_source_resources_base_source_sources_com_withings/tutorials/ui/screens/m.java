package com.withings.tutorials.ui.screens;

import androidx.compose.material3.j5;
import com.withings.library.authentication.api.ConstantsWs;
import nm0.y;
/* compiled from: SegmentalBodyComposition.kt */
/* loaded from: classes4.dex */
final class m extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f45522a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f45523b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r8.n nVar, ym0.a aVar) {
        super(4);
        this.f45522a = aVar;
        this.f45523b = nVar;
    }

    @Override // ym0.r
    public final y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        j5.e(num, cVar, "$this$composable", dVar, "it");
        g gVar = g.f45305a;
        l lVar = new l(this.f45523b);
        gVar.b(this.f45522a, lVar, aVar, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED);
        return y.f85009a;
    }
}
