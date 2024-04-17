package com.withings.vasistas.v2.repository;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.flow.FlowCollector;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SqlVasistasRepository.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/withings/vasistas/v2/model/Vasistas;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.vasistas.v2.repository.SqlVasistasRepository$get$category$1", f = "SqlVasistasRepository.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SqlVasistasRepository$get$category$1<T> extends i implements p<FlowCollector<? super List<? extends T>>, d<? super y>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SqlVasistasRepository$get$category$1(d<? super SqlVasistasRepository$get$category$1> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        SqlVasistasRepository$get$category$1 sqlVasistasRepository$get$category$1 = new SqlVasistasRepository$get$category$1(dVar);
        sqlVasistasRepository$get$category$1.L$0 = obj;
        return sqlVasistasRepository$get$category$1;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, d<? super y> dVar) {
        return invoke((FlowCollector) ((FlowCollector) obj), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            i0 i0Var = i0.f76187a;
            this.label = 1;
            if (((FlowCollector) this.L$0).emit(i0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }

    public final Object invoke(FlowCollector<? super List<? extends T>> flowCollector, d<? super y> dVar) {
        return ((SqlVasistasRepository$get$category$1) create(flowCollector, dVar)).invokeSuspend(y.f85009a);
    }
}
