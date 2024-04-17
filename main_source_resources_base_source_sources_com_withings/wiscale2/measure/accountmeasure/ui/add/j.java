package com.withings.wiscale2.measure.accountmeasure.ui.add;

import com.withings.library.measure.Measure;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AddBodyTemperatureFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.accountmeasure.ui.add.AddBodyTemperatureFragment$loadInitialTemperature$initialTemperature$1", f = "AddBodyTemperatureFragment.kt", l = {93}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class j extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Integer>, Object> {

    /* renamed from: a  reason: collision with root package name */
    k f58198a;

    /* renamed from: b  reason: collision with root package name */
    int f58199b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k f58200c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, qm0.d<? super j> dVar) {
        super(2, dVar);
        this.f58200c = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new j(this.f58200c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Integer> dVar) {
        return ((j) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        k kVar;
        double d11;
        int N1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f58199b;
        if (i11 != 0) {
            if (i11 == 1) {
                kVar = this.f58198a;
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            k kVar2 = this.f58200c;
            this.f58198a = kVar2;
            this.f58199b = 1;
            int i12 = k.P;
            kVar2.getClass();
            Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new h(kVar2, null), this);
            if (withContext == coroutineSingletons) {
                return coroutineSingletons;
            }
            kVar = kVar2;
            obj = withContext;
        }
        Measure measure = (Measure) obj;
        if (measure != null) {
            d11 = measure.getValue();
        } else {
            d11 = 37.0d;
        }
        N1 = kVar.N1(d11);
        return new Integer(N1);
    }
}
