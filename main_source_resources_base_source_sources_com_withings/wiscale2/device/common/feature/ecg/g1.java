package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.wiscale2.C1987R;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class g1 extends kotlin.jvm.internal.w implements ym0.q<s0.b, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ rq.e f51353a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51354b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51355c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(rq.e eVar, EcgActivationActivity ecgActivationActivity, ym0.a<nm0.y> aVar) {
        super(3);
        this.f51353a = eVar;
        this.f51354b = ecgActivationActivity;
        this.f51355c = aVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(s0.b bVar, androidx.compose.runtime.a aVar, Integer num) {
        s0.b item = bVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(item, "$this$item");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            com.withings.common.compose.component.y3.d(null, ay.b.u(C1987R.string.hwa09_usOnboarding_status_informations_title, aVar2), null, 0.0f, 0.0f, 0L, s1.b.b(aVar2, -1156095979, new f1(this.f51353a, this.f51354b, this.f51355c)), aVar2, 1572864, 61);
        }
        return nm0.y.f85009a;
    }
}
