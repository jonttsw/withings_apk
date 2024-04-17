package com.withings.wiscale2.device.wpm.ui;

import com.withings.device.Device;
import com.withings.library.measure.MeasuresGroup;
import com.withings.wiscale2.device.wpm.ui.c0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wpm02ResultScreenFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpm.ui.Wpm02ResultScreenFragment$onDoneButtonClicked$1", f = "Wpm02ResultScreenFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class f0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c0 f55738a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(c0 c0Var, qm0.d<? super f0> dVar) {
        super(2, dVar);
        this.f55738a = c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new f0(this.f55738a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((f0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        c0.a aVar;
        MeasuresGroup D1;
        MeasuresGroup D12;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        kn.e c11 = kn.e.c();
        c0 c0Var = this.f55738a;
        Device f11 = c11.f(c0.x1(c0Var));
        if (f11 != null) {
            D12 = c0Var.D1();
            f11.setLastUseDate(new DateTime(D12.getDate()));
            kn.e.c().t(f11);
        }
        aVar = c0Var.f55722t;
        if (aVar != null) {
            u70.i x12 = c0.x1(c0Var);
            D1 = c0Var.D1();
            aVar.Z0(x12, new DateTime(D1.getDate()));
        }
        return nm0.y.f85009a;
    }
}
