package com.withings.wiscale2.settings;

import com.withings.wiscale2.settings.f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WithingsAdvertisingViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.WithingsAdvertisingViewModel$setPersonalizedAdvertising$2", f = "WithingsAdvertisingViewModel.kt", l = {80, 88}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class k6 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f60109a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WithingsAdvertisingViewModel f60110b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f60111c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(WithingsAdvertisingViewModel withingsAdvertisingViewModel, boolean z5, qm0.d<? super k6> dVar) {
        super(2, dVar);
        this.f60110b = withingsAdvertisingViewModel;
        this.f60111c = z5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new k6(this.f60110b, this.f60111c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((k6) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        tf.b bVar;
        MutableStateFlow mutableStateFlow;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f60109a;
        boolean z5 = this.f60111c;
        WithingsAdvertisingViewModel withingsAdvertisingViewModel = this.f60110b;
        try {
        } catch (Exception unused) {
            mutableSharedFlow = withingsAdvertisingViewModel.f59819e;
            f.a aVar = f.a.f59989a;
            this.f60109a = 2;
            if (mutableSharedFlow.emit(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
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
            bVar = withingsAdvertisingViewModel.f59816b;
            sf.b bVar2 = new sf.b(z5);
            this.f60109a = 1;
            if (bVar.c(bVar2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        mutableStateFlow = withingsAdvertisingViewModel.f59817c;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, g.a((g) value, false, null, Boolean.valueOf(z5), 3)));
        return nm0.y.f85009a;
    }
}
