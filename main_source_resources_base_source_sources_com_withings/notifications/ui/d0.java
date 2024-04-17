package com.withings.notifications.ui;

import com.withings.wiscale2.C1987R;
import k1.o1;
/* compiled from: NotificationsActivity.kt */
/* loaded from: classes4.dex */
final class d0 extends kotlin.jvm.internal.w implements ym0.q<s0.b, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o1<Float> f42860a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(o1<Float> o1Var) {
        super(3);
        this.f42860a = o1Var;
    }

    @Override // ym0.q
    public final nm0.y invoke(s0.b bVar, androidx.compose.runtime.a aVar, Integer num) {
        int i11;
        s0.b item = bVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(item, "$this$item");
        if ((intValue & 14) == 0) {
            if (aVar2.K(item)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            intValue |= i11;
        }
        if ((intValue & 91) == 18 && aVar2.h()) {
            aVar2.C();
        } else {
            nk.a0.f(0, 0, 28, 0L, aVar2, s0.b.b(item, bj0.d.c(androidx.compose.foundation.layout.x0.j(androidx.compose.ui.e.f8927a, 0.0f, yk.h.B(), 0.0f, 0.0f, 13), this.f42860a.getValue().floatValue())), null, ay.b.u(C1987R.string.notificationStack_read, aVar2));
        }
        return nm0.y.f85009a;
    }
}
