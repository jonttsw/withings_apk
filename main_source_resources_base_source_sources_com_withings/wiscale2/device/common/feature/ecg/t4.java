package com.withings.wiscale2.device.common.feature.ecg;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: EcgActivationViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.EcgActivationViewModel$onDocumentPreviewClicked$1$1", f = "EcgActivationViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class t4 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o4 f51752a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(o4 o4Var, qm0.d<? super t4> dVar) {
        super(2, dVar);
        this.f51752a = o4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new t4(this.f51752a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((t4) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        com.withings.wiscale2.device.common.feature.d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        o4 o4Var = this.f51752a;
        dVar = o4Var.f51555b;
        o4Var.e1().postValue(dVar.b());
        return nm0.y.f85009a;
    }
}
