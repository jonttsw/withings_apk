package com.withings.wiscale2.device.common.feature.ecg;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: WBS08EcgActivationActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationActivity$EcgPhoneNumberScreen$4$3$1", f = "WBS08EcgActivationActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class m7 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.platform.k4 f51520a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(androidx.compose.ui.platform.k4 k4Var, qm0.d<? super m7> dVar) {
        super(2, dVar);
        this.f51520a = k4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new m7(this.f51520a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((m7) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        androidx.compose.ui.platform.k4 k4Var = this.f51520a;
        if (k4Var != null) {
            k4Var.a();
        }
        return nm0.y.f85009a;
    }
}
