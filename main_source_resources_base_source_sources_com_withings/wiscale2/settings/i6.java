package com.withings.wiscale2.settings;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WithingsAdvertisingViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.WithingsAdvertisingViewModel$initPersonalizedAdvertising$2", f = "WithingsAdvertisingViewModel.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class i6 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f60055a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WithingsAdvertisingViewModel f60056b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(WithingsAdvertisingViewModel withingsAdvertisingViewModel, qm0.d<? super i6> dVar) {
        super(2, dVar);
        this.f60056b = withingsAdvertisingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new i6(this.f60056b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((i6) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        Object value;
        tf.b bVar;
        MutableStateFlow mutableStateFlow2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f60055a;
        WithingsAdvertisingViewModel withingsAdvertisingViewModel = this.f60056b;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                bVar = withingsAdvertisingViewModel.f59816b;
                wf.b d11 = bVar.d();
                this.f60055a = 1;
                obj = FlowKt.first(d11, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            sf.b bVar2 = (sf.b) obj;
            mutableStateFlow2 = withingsAdvertisingViewModel.f59817c;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, g.a((g) value2, false, null, Boolean.valueOf(bVar2.a()), 2)));
        } catch (Exception unused) {
            mutableStateFlow = withingsAdvertisingViewModel.f59817c;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, g.a((g) value, false, null, null, 6)));
        }
        return nm0.y.f85009a;
    }
}
