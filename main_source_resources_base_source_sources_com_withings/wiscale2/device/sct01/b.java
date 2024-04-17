package com.withings.wiscale2.device.sct01;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import l70.v;
import l70.w;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: Sct01NetworkSetup.kt */
@e(c = "com.withings.wiscale2.device.sct01.Sct01NetworkSetup$assetResources$2$1", f = "Sct01NetworkSetup.kt", l = {30}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class b extends i implements p<CoroutineScope, d<? super Integer>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f54781a;

    b() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new i(2, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super Integer> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f54781a;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            w a11 = w.a.a();
            this.f54781a = 1;
            obj = FlowKt.first(a11.get(), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return new Integer(((v) obj).d());
    }
}
