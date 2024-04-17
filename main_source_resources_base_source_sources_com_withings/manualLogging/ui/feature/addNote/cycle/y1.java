package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.manualLogging.ui.feature.addNote.cycle.model.CycleManualLoggingEvent;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleManualLoggingViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel$continueTutorial$1", f = "CycleManualLoggingViewModel.kt", l = {ConstantsWs.WS_STATUS_MISSING}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class y1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f41415a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CycleManualLoggingViewModel f41416b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f41417c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(CycleManualLoggingViewModel cycleManualLoggingViewModel, boolean z5, qm0.d<? super y1> dVar) {
        super(2, dVar);
        this.f41416b = cycleManualLoggingViewModel;
        this.f41417c = z5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new y1(this.f41416b, this.f41417c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((y1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        String str;
        boolean z5;
        CycleManualLoggingEvent cycleManualLoggingEvent;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f41415a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CycleManualLoggingViewModel cycleManualLoggingViewModel = this.f41416b;
            mutableStateFlow = cycleManualLoggingViewModel.f40773v;
            if (!this.f41417c) {
                str = cycleManualLoggingViewModel.f40765n;
                if (!kotlin.jvm.internal.u.e(str, "factor")) {
                    z5 = cycleManualLoggingViewModel.f40766o;
                    if (z5) {
                        cycleManualLoggingEvent = CycleManualLoggingEvent.f41118f;
                    } else {
                        cycleManualLoggingEvent = CycleManualLoggingEvent.f41119g;
                    }
                } else {
                    cycleManualLoggingEvent = CycleManualLoggingEvent.f41116d;
                }
            } else {
                cycleManualLoggingEvent = CycleManualLoggingEvent.f41117e;
            }
            this.f41415a = 1;
            if (mutableStateFlow.emit(cycleManualLoggingEvent, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
