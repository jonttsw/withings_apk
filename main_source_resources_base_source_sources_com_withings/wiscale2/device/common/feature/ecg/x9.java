package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.wiscale2.C1987R;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class x9 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f52114a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f52115b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(CoroutineScope coroutineScope, r8.n nVar) {
        super(2);
        this.f52114a = coroutineScope;
        this.f52115b = nVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            com.withings.common.compose.component.l.c(null, ay.b.u(C1987R.string._CANCEL_, aVar2), null, false, null, null, false, new w9(this.f52114a, this.f52115b), aVar2, 0, 125);
        }
        return nm0.y.f85009a;
    }
}
