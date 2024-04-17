package com.withings.device.details.automatic.activity.detection;

import androidx.compose.foundation.layout.x0;
import androidx.compose.runtime.a;
import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutomaticActivityDetection.kt */
/* loaded from: classes3.dex */
public final class h extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f36710a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<Boolean, nm0.y> f36711b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ym0.l lVar, boolean z5) {
        super(2);
        this.f36710a = z5;
        this.f36711b = lVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            androidx.compose.ui.e h11 = x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2);
            String u11 = ay.b.u(C1987R.string.scanwatch_settings_actirec_deactivation_button_title, aVar2);
            String u12 = ay.b.u(C1987R.string.scanwatch_settings_actirec_deactivation_button_description, aVar2);
            aVar2.s(101081021);
            ym0.l<Boolean, nm0.y> lVar = this.f36711b;
            boolean K = aVar2.K(lVar);
            Object t11 = aVar2.t();
            if (K || t11 == a.C0060a.a()) {
                t11 = new g(lVar);
                aVar2.n(t11);
            }
            aVar2.J();
            com.withings.common.compose.component.o.l(h11, this.f36710a, (ym0.l) t11, null, u11, u12, false, false, false, null, aVar2, 0, 968);
        }
        return nm0.y.f85009a;
    }
}
