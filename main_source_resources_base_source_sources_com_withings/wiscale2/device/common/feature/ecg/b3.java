package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.wiscale2.C1987R;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class b3 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f51208a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51209b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f51210c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(CoroutineScope coroutineScope, EcgActivationActivity ecgActivationActivity, r8.n nVar) {
        super(2);
        this.f51208a = coroutineScope;
        this.f51209b = ecgActivationActivity;
        this.f51210c = nVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string.hwa09_usOnboarding_videoCall_smsBottomSheet_cta, aVar2), null, false, null, null, false, new a3(this.f51208a, this.f51209b, this.f51210c), aVar2, 0, 125);
        }
        return nm0.y.f85009a;
    }
}
