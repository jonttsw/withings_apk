package com.withings.nervehealth.ui.guidedscan;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import ky.d;
/* compiled from: NerveHealthGuidedScanViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel$checkReceivedMeasure$1", f = "NerveHealthGuidedScanViewModel.kt", l = {225}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class g0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f42616a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NerveHealthGuidedScanViewModel f42617b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ky.d f42618c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f42619d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(NerveHealthGuidedScanViewModel nerveHealthGuidedScanViewModel, ky.d dVar, long j5, qm0.d<? super g0> dVar2) {
        super(2, dVar2);
        this.f42617b = nerveHealthGuidedScanViewModel;
        this.f42618c = dVar;
        this.f42619d = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new g0(this.f42617b, this.f42618c, this.f42619d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((g0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        fy.c0 c0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f42616a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            NerveHealthGuidedScanViewModel nerveHealthGuidedScanViewModel = this.f42617b;
            ky.d dVar = this.f42618c;
            if (NerveHealthGuidedScanViewModel.z0(nerveHealthGuidedScanViewModel, dVar, this.f42619d)) {
                if (dVar.e().b() != 15) {
                    c0Var = nerveHealthGuidedScanViewModel.f42535f;
                    c0Var.b(ky.d.a(this.f42618c, 0L, 0L, NerveHealthGuidedScanViewModel.r0(nerveHealthGuidedScanViewModel), null, null, null, false, d.a.a(dVar.e(), 15, 0, 0, 30), ConstantsWs.WS_STATUS_NODATAFOUND));
                }
                this.f42616a = 1;
                if (nerveHealthGuidedScanViewModel.G0(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return nm0.y.f85009a;
    }
}
