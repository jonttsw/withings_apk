package com.withings.vasistas.v2.repository;

import com.withings.vasistas.model.Vasistas;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: SqlVasistasRepository.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/withings/vasistas/v2/model/Vasistas;", "T", "Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.vasistas.v2.repository.SqlVasistasRepository$add$2", f = "SqlVasistasRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SqlVasistasRepository$add$2 extends i implements p<CoroutineScope, d<? super y>, Object> {
    final /* synthetic */ List<T> $vasistasList;
    int label;
    final /* synthetic */ SqlVasistasRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SqlVasistasRepository$add$2(SqlVasistasRepository sqlVasistasRepository, List<? extends T> list, d<? super SqlVasistasRepository$add$2> dVar) {
        super(2, dVar);
        this.this$0 = sqlVasistasRepository;
        this.$vasistasList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new SqlVasistasRepository$add$2(this.this$0, this.$vasistasList, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SqlVasistasDao sqlVasistasDao;
        Vasistas map;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            sqlVasistasDao = this.this$0.sqlVasistasDao;
            Iterable<com.withings.vasistas.v2.model.Vasistas> iterable = this.$vasistasList;
            SqlVasistasRepository sqlVasistasRepository = this.this$0;
            ArrayList arrayList = new ArrayList(x.y(iterable, 10));
            for (com.withings.vasistas.v2.model.Vasistas vasistas : iterable) {
                map = sqlVasistasRepository.map(vasistas);
                arrayList.add(map);
            }
            sqlVasistasDao.insert(arrayList);
            return y.f85009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((SqlVasistasRepository$add$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
