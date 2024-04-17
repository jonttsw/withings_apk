package com.withings.wiscale2.device.common.feature.ecg.us.ui;

import com.withings.common.compose.component.y3;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: EcgReviewActivity.kt */
/* loaded from: classes5.dex */
final class l extends w implements ym0.q<s0.b, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ rq.e f52035a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(rq.e eVar) {
        super(3);
        this.f52035a = eVar;
    }

    @Override // ym0.q
    public final y invoke(s0.b bVar, androidx.compose.runtime.a aVar, Integer num) {
        s0.b item = bVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        u.j(item, "$this$item");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            y3.d(null, ay.b.u(C1987R.string.hwa09_usOnboarding_status_informations_title, aVar2), null, 0.0f, 0.0f, 0L, s1.b.b(aVar2, 2099421067, new k(this.f52035a)), aVar2, 1572864, 61);
        }
        return y.f85009a;
    }
}
