package com.withings.authentication.mfa;

import androidx.compose.foundation.layout.e1;
import androidx.compose.material3.y7;
import com.withings.library.authentication.api.ConstantsWs;
/* compiled from: ResolveMultiFactorActivity.kt */
/* loaded from: classes3.dex */
final class q extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.q<r8.n, androidx.compose.runtime.a, Integer, nm0.y> f31805a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f31806b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(ym0.q<? super r8.n, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> qVar, r8.n nVar) {
        super(2);
        this.f31805a = qVar;
        this.f31806b = nVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            y7.b(e1.d(androidx.compose.ui.e.f8927a), null, null, null, null, 0, 0L, 0L, null, s1.b.b(aVar2, -1815576338, new p(this.f31805a, this.f31806b)), aVar2, 805306374, ConstantsWs.WS_STATUS_ERROR_ARRAY_WAM);
        }
        return nm0.y.f85009a;
    }
}
