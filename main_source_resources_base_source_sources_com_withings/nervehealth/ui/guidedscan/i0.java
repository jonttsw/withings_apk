package com.withings.nervehealth.ui.guidedscan;

import android.content.Context;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.nervehealth.ui.guidedscan.c;
import com.withings.nervehealth.ui.guidedscan.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NerveHealthGuidedScanViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel$onConfirmExit$1", f = "NerveHealthGuidedScanViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_PAUSE, 135}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class i0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f42627a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NerveHealthGuidedScanViewModel f42628b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f42629c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(NerveHealthGuidedScanViewModel nerveHealthGuidedScanViewModel, Context context, qm0.d<? super i0> dVar) {
        super(2, dVar);
        this.f42628b = nerveHealthGuidedScanViewModel;
        this.f42629c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new i0(this.f42628b, this.f42629c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((i0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        d.b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f42627a;
        NerveHealthGuidedScanViewModel nerveHealthGuidedScanViewModel = this.f42628b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            mutableStateFlow = nerveHealthGuidedScanViewModel.f42540k;
            d b10 = ((p0) mutableStateFlow.getValue()).b();
            if (b10 instanceof d.b) {
                bVar = (d.b) b10;
            } else {
                bVar = null;
            }
            if (bVar != null && bVar.d()) {
                this.f42627a = 1;
                if (NerveHealthGuidedScanViewModel.f0(nerveHealthGuidedScanViewModel, this.f42629c, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        MutableSharedFlow mutableSharedFlow = nerveHealthGuidedScanViewModel.f42544o;
        c.a aVar = c.a.f42596a;
        this.f42627a = 2;
        if (mutableSharedFlow.emit(aVar, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
