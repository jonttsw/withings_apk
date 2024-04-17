package com.withings.notifications.ui;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.notifications.model.NotificationStyle;
/* compiled from: NotificationCards.kt */
/* loaded from: classes4.dex */
final class f extends kotlin.jvm.internal.w implements ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c10.c<?> f42917a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c10.c<?> cVar) {
        super(3);
        this.f42917a = cVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.c cVar, androidx.compose.runtime.a aVar, Integer num) {
        int i11;
        r0.c BigRoundedSquareCard = cVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(BigRoundedSquareCard, "$this$BigRoundedSquareCard");
        if ((intValue & 14) == 0) {
            if (aVar2.K(BigRoundedSquareCard)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            intValue |= i11;
        }
        if ((intValue & 91) == 18 && aVar2.h()) {
            aVar2.C();
        } else {
            p.j(this.f42917a, BigRoundedSquareCard, NotificationStyle.f42819a, aVar2, ((intValue << 3) & 112) | ConstantsWs.WS_STATUS_FIRMWARE_NOT_VALIDATED);
        }
        return nm0.y.f85009a;
    }
}
