package com.withings.ecg.details;

import com.withings.device.Device;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: EcgInReviewViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.details.EcgInReviewViewModel$getDevice$2", f = "EcgInReviewViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class i1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Device>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgInReviewViewModel f38237a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(EcgInReviewViewModel ecgInReviewViewModel, qm0.d<? super i1> dVar) {
        super(2, dVar);
        this.f38237a = ecgInReviewViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new i1(this.f38237a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Device> dVar) {
        return ((i1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Long l5;
        kn.e eVar;
        Long l6;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        EcgInReviewViewModel ecgInReviewViewModel = this.f38237a;
        l5 = ecgInReviewViewModel.f38004g;
        if (l5 != null) {
            eVar = ecgInReviewViewModel.f38001d;
            l6 = ecgInReviewViewModel.f38004g;
            return eVar.d(l6.longValue());
        }
        return null;
    }
}
