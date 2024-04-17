package com.withings.nervehealth.ui.guidedscan;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: NerveHealthGuidedScanViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel$onFinish$1", f = "NerveHealthGuidedScanViewModel.kt", l = {99}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class j0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f42630a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NerveHealthGuidedScanViewModel f42631b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f42632c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(NerveHealthGuidedScanViewModel nerveHealthGuidedScanViewModel, Context context, qm0.d<? super j0> dVar) {
        super(2, dVar);
        this.f42631b = nerveHealthGuidedScanViewModel;
        this.f42632c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new j0(this.f42631b, this.f42632c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((j0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f42630a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            this.f42630a = 1;
            if (NerveHealthGuidedScanViewModel.i0(this.f42631b, this.f42632c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
