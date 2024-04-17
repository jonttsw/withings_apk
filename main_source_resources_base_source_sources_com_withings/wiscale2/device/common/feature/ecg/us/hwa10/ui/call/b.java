package com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call;

import androidx.compose.ui.platform.k4;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
/* compiled from: VideoCallCodeCheckScreen.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallCodeCheckScreenKt$VideoCallCodeCheckScreen$10$2$1", f = "VideoCallCodeCheckScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class b extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k4 f51880a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k4 k4Var, qm0.d<? super b> dVar) {
        super(2, dVar);
        this.f51880a = k4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new b(this.f51880a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        k4 k4Var = this.f51880a;
        if (k4Var != null) {
            k4Var.a();
        }
        return y.f85009a;
    }
}
