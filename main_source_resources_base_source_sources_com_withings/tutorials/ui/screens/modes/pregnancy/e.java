package com.withings.tutorials.ui.screens.modes.pregnancy;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: PregnancyMode.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyMode$IntroForActivationScreen$2$1", f = "PregnancyMode.kt", l = {ConstantsWs.WS_STATUS_WRONGUSERID}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f45933a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PregnancyModeViewModel f45934b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45935c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f45936d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PregnancyModeViewModel pregnancyModeViewModel, ym0.a<nm0.y> aVar, k1.r0<Boolean> r0Var, qm0.d<? super e> dVar) {
        super(2, dVar);
        this.f45934b = pregnancyModeViewModel;
        this.f45935c = aVar;
        this.f45936d = r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new e(this.f45934b, this.f45935c, this.f45936d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((e) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f45933a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            SharedFlow<Boolean> Y0 = this.f45934b.Y0();
            this.f45933a = 1;
            obj = FlowKt.first(Y0, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.f45936d.setValue(Boolean.TRUE);
        } else {
            this.f45935c.invoke();
        }
        return nm0.y.f85009a;
    }
}
