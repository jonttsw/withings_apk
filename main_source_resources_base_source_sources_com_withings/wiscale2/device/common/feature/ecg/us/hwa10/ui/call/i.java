package com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call;

import androidx.compose.ui.platform.k4;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
/* compiled from: VideoCallPhoneNumberScreen.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallPhoneNumberScreenKt$VideoCallPhoneNumberScreen$9$4$1", f = "VideoCallPhoneNumberScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class i extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k4 f51932a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k4 k4Var, qm0.d<? super i> dVar) {
        super(2, dVar);
        this.f51932a = k4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new i(this.f51932a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((i) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        k4 k4Var = this.f51932a;
        if (k4Var != null) {
            k4Var.a();
        }
        return y.f85009a;
    }
}
