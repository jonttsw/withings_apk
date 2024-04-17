package com.withings.ecg.details;

import com.withings.device.Device;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: EcgInReviewFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.details.EcgInReviewFragmentKt$EcgInReviewScreen$1$1", f = "EcgInReviewFragment.kt", l = {99}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class c1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38152a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EcgInReviewViewModel f38153b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.p<Long, Device, nm0.y> f38154c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c1(EcgInReviewViewModel ecgInReviewViewModel, ym0.p<? super Long, ? super Device, nm0.y> pVar, qm0.d<? super c1> dVar) {
        super(2, dVar);
        this.f38153b = ecgInReviewViewModel;
        this.f38154c = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new c1(this.f38153b, this.f38154c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((c1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f38152a;
        EcgInReviewViewModel ecgInReviewViewModel = this.f38153b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            this.f38152a = 1;
            ecgInReviewViewModel.getClass();
            obj = BuildersKt.withContext(Dispatchers.getIO(), new i1(ecgInReviewViewModel, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Device device = (Device) obj;
        if (device != null) {
            this.f38154c.invoke(new Long(ecgInReviewViewModel.q0()), device);
        }
        return nm0.y.f85009a;
    }
}
