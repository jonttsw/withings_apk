package com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import u60.e;
/* compiled from: ToiletDeviceViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet.ToiletDeviceViewModel$setupTutorialRepository$1", f = "ToiletDeviceViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_R50KHZ_SEGMENT}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class p extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f55439a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k f55440b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f55441c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(k kVar, long j5, qm0.d<? super p> dVar) {
        super(2, dVar);
        this.f55440b = kVar;
        this.f55441c = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new p(this.f55440b, this.f55441c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((p) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        o60.g gVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f55439a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            gVar = this.f55440b.f55405b;
            String a11 = e.b.f101518c.a();
            this.f55439a = 1;
            if (gVar.b(this.f55441c, a11, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
