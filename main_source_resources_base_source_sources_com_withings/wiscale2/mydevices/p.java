package com.withings.wiscale2.mydevices;

import androidx.compose.runtime.l0;
import com.withings.features.FeatureFlag;
import com.withings.library.authentication.api.ConstantsWs;
import k1.r0;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: MyDevicesFragment.kt */
/* loaded from: classes5.dex */
final class p extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f58661a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar) {
        super(2);
        this.f58661a = qVar;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            q qVar = this.f58661a;
            r0 b10 = l0.b(q.w1(qVar).q0(), aVar2);
            if (wr.b.c(FeatureFlag.R)) {
                aVar2.s(2064071555);
                q.v1(qVar, (c) b10.getValue(), (vi.o) l0.a(q.w1(qVar).r0(), null, null, aVar2, 2).getValue(), aVar2, 576);
                aVar2.J();
            } else {
                aVar2.s(2064071773);
                q.v1(qVar, (c) b10.getValue(), null, aVar2, ConstantsWs.WS_STATUS_NEW_PASSWORD_REQUIRED);
                aVar2.J();
            }
        }
        return y.f85009a;
    }
}
