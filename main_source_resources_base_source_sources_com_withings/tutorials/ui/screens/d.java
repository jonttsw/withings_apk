package com.withings.tutorials.ui.screens;

import androidx.compose.material3.j5;
import com.withings.library.authentication.api.ConstantsWs;
import nm0.y;
/* compiled from: MultipleUsers.kt */
/* loaded from: classes4.dex */
final class d extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f45074a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f45075b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ym0.a<y> aVar, ym0.a<y> aVar2) {
        super(4);
        this.f45074a = aVar;
        this.f45075b = aVar2;
    }

    @Override // ym0.r
    public final y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        j5.e(num, cVar, "$this$composable", dVar, "it");
        a.f44812a.a(this.f45074a, this.f45075b, aVar, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED);
        return y.f85009a;
    }
}
