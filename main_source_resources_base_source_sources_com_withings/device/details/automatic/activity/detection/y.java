package com.withings.device.details.automatic.activity.detection;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: AutomaticActivityDetectionViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.automatic.activity.detection.AutomaticActivityDetectionViewModel$toggleGlobal$1", f = "AutomaticActivityDetectionViewModel.kt", l = {53}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class y extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36747a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AutomaticActivityDetectionViewModel f36748b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f36749c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(AutomaticActivityDetectionViewModel automaticActivityDetectionViewModel, boolean z5, qm0.d<? super y> dVar) {
        super(2, dVar);
        this.f36748b = automaticActivityDetectionViewModel;
        this.f36749c = z5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new y(this.f36748b, this.f36749c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((y) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        d dVar;
        Object obj2 = CoroutineSingletons.f76214a;
        int i11 = this.f36747a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            AutomaticActivityDetectionViewModel automaticActivityDetectionViewModel = this.f36748b;
            dVar = automaticActivityDetectionViewModel.f36667a;
            long m02 = automaticActivityDetectionViewModel.m0();
            this.f36747a = 1;
            dVar.getClass();
            Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new e(dVar, m02, this.f36749c, null), this);
            if (withContext != obj2) {
                withContext = nm0.y.f85009a;
            }
            if (withContext == obj2) {
                return obj2;
            }
        }
        return nm0.y.f85009a;
    }
}
