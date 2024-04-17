package com.withings.paywall.subscription;

import com.withings.common.compose.component.ColorStyle;
import com.withings.common.compose.component.l;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: SubscriptionScreen.kt */
/* loaded from: classes4.dex */
final class e extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f43684a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ym0.a<y> aVar) {
        super(2);
        this.f43684a = aVar;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            l.a(null, ay.b.u(C1987R.string.purchase_paywall_cta_title, aVar2), null, false, ColorStyle.f33325d, null, false, this.f43684a, aVar2, 24576, 109);
        }
        return y.f85009a;
    }
}
