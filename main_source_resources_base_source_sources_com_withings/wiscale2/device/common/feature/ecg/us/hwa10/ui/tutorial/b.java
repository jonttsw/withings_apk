package com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.tutorial;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.tutorial.FirstEcgVideoInstructionViewModel;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: FirstEcgVideoInstructionScreen.kt */
@e(c = "com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.tutorial.FirstEcgVideoInstructionViewModel$localReceiver$1$1", f = "FirstEcgVideoInstructionScreen.kt", l = {ConstantsWs.MEASURE_TYPE_VASCULAR_AGE, ConstantsWs.MEASURE_TYPE_VASCULAR_AGE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class b extends i implements p<CoroutineScope, d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    MutableSharedFlow f51982a;

    /* renamed from: b  reason: collision with root package name */
    int f51983b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FirstEcgVideoInstructionViewModel f51984c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FirstEcgVideoInstructionViewModel firstEcgVideoInstructionViewModel, d<? super b> dVar) {
        super(2, dVar);
        this.f51984c = firstEcgVideoInstructionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new b(this.f51984c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow<FirstEcgVideoInstructionViewModel.a> k02;
        SharedFlow sharedFlow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f51983b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    l.b(obj);
                    return y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k02 = this.f51982a;
            l.b(obj);
        } else {
            l.b(obj);
            FirstEcgVideoInstructionViewModel firstEcgVideoInstructionViewModel = this.f51984c;
            k02 = firstEcgVideoInstructionViewModel.k0();
            sharedFlow = firstEcgVideoInstructionViewModel.f51947g;
            this.f51982a = k02;
            this.f51983b = 1;
            obj = FlowKt.first(sharedFlow, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        FirstEcgVideoInstructionViewModel.a aVar = new FirstEcgVideoInstructionViewModel.a(u.e(obj, Boolean.TRUE));
        this.f51982a = null;
        this.f51983b = 2;
        if (k02.emit(aVar, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return y.f85009a;
    }
}
