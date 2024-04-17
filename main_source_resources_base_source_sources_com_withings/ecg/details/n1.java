package com.withings.ecg.details;

import com.withings.ecg.details.n2;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: EcgListActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.details.EcgListActivity$initViewModel$1$1", f = "EcgListActivity.kt", l = {115}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class n1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38270a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ t1 f38271b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ EcgListActivity f38272c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EcgListActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EcgListActivity f38273a;

        a(EcgListActivity ecgListActivity) {
            this.f38273a = ecgListActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, qm0.d dVar) {
            n2 n2Var = (n2) obj;
            if (n2Var instanceof n2.b) {
                n2.b bVar = (n2.b) n2Var;
                if (bVar.a() != null) {
                    EcgListActivity.E3(this.f38273a, bVar.a());
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(t1 t1Var, EcgListActivity ecgListActivity, qm0.d<? super n1> dVar) {
        super(2, dVar);
        this.f38271b = t1Var;
        this.f38272c = ecgListActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new n1(this.f38271b, this.f38272c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        ((n1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        return CoroutineSingletons.f76214a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f38270a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            StateFlow<n2> t02 = this.f38271b.t0();
            a aVar = new a(this.f38272c);
            this.f38270a = 1;
            if (t02.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        throw new KotlinNothingValueException();
    }
}
