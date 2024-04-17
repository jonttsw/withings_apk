package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.wiscale2.C1987R;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class u9 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f51771a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51772b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f51773c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(CoroutineScope coroutineScope, WBS08EcgActivationActivity wBS08EcgActivationActivity, r8.n nVar) {
        super(2);
        this.f51771a = coroutineScope;
        this.f51772b = wBS08EcgActivationActivity;
        this.f51773c = nVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string.hwa09_usOnboarding_videoCall_smsBottomSheet_cta, aVar2), null, false, null, null, false, new t9(this.f51771a, this.f51772b, this.f51773c), aVar2, 0, 125);
        }
        return nm0.y.f85009a;
    }
}
