package com.withings.vasistas.v2.repository;

import com.withings.vasistas.model.Vasistas;
import com.withings.vasistas.v2.repository.SqlVasistasDao;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
import ym0.a;
import ym0.p;
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SqlVasistasRepository.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/withings/vasistas/v2/model/Vasistas;", "T", "Lkotlinx/coroutines/channels/ProducerScope;", "", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/channels/ProducerScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.vasistas.v2.repository.SqlVasistasRepository$get$1", f = "SqlVasistasRepository.kt", l = {49, 53}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SqlVasistasRepository$get$1<T> extends i implements p<ProducerScope<? super List<? extends T>>, d<? super y>, Object> {
    final /* synthetic */ Vasistas.Category $category;
    final /* synthetic */ DateTime $from;
    final /* synthetic */ DateTime $to;
    final /* synthetic */ long $userId;
    final /* synthetic */ Class<T> $vasistasClass;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SqlVasistasRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SqlVasistasRepository.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/withings/vasistas/v2/model/Vasistas;", "T", "Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @e(c = "com.withings.vasistas.v2.repository.SqlVasistasRepository$get$1$1", f = "SqlVasistasRepository.kt", l = {50}, m = "invokeSuspend")
    /* renamed from: com.withings.vasistas.v2.repository.SqlVasistasRepository$get$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends i implements p<CoroutineScope, d<? super y>, Object> {
        final /* synthetic */ ProducerScope<List<? extends T>> $$this$callbackFlow;
        final /* synthetic */ Vasistas.Category $category;
        final /* synthetic */ DateTime $from;
        final /* synthetic */ DateTime $to;
        final /* synthetic */ long $userId;
        final /* synthetic */ Class<T> $vasistasClass;
        int label;
        final /* synthetic */ SqlVasistasRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(ProducerScope<? super List<? extends T>> producerScope, SqlVasistasRepository sqlVasistasRepository, Vasistas.Category category, long j5, DateTime dateTime, DateTime dateTime2, Class<T> cls, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$$this$callbackFlow = producerScope;
            this.this$0 = sqlVasistasRepository;
            this.$category = category;
            this.$userId = j5;
            this.$from = dateTime;
            this.$to = dateTime2;
            this.$vasistasClass = cls;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$$this$callbackFlow, this.this$0, this.$category, this.$userId, this.$from, this.$to, this.$vasistasClass, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List<Vasistas> sqlVasistas;
            com.withings.vasistas.v2.model.Vasistas map;
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
                ProducerScope<List<? extends T>> producerScope = this.$$this$callbackFlow;
                sqlVasistas = this.this$0.getSqlVasistas(this.$category, this.$userId, this.$from, this.$to);
                SqlVasistasRepository sqlVasistasRepository = this.this$0;
                Class<T> cls = this.$vasistasClass;
                ArrayList arrayList = new ArrayList();
                for (Vasistas vasistas : sqlVasistas) {
                    map = sqlVasistasRepository.map(cls, vasistas);
                    if (map != null) {
                        arrayList.add(map);
                    }
                }
                this.label = 1;
                if (producerScope.send(arrayList, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SqlVasistasRepository.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withings/vasistas/v2/model/Vasistas;", "T", "Lnm0/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.vasistas.v2.repository.SqlVasistasRepository$get$1$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends w implements a<y> {
        final /* synthetic */ SqlVasistasRepository$get$1$listener$1 $listener;
        final /* synthetic */ SqlVasistasRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(SqlVasistasRepository sqlVasistasRepository, SqlVasistasRepository$get$1$listener$1 sqlVasistasRepository$get$1$listener$1) {
            super(0);
            this.this$0 = sqlVasistasRepository;
            this.$listener = sqlVasistasRepository$get$1$listener$1;
        }

        @Override // ym0.a
        public /* bridge */ /* synthetic */ y invoke() {
            invoke2();
            return y.f85009a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SqlVasistasDao sqlVasistasDao;
            sqlVasistasDao = this.this$0.sqlVasistasDao;
            sqlVasistasDao.unregisterListener(this.$listener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SqlVasistasRepository$get$1(SqlVasistasRepository sqlVasistasRepository, DateTime dateTime, DateTime dateTime2, long j5, Vasistas.Category category, Class<T> cls, d<? super SqlVasistasRepository$get$1> dVar) {
        super(2, dVar);
        this.this$0 = sqlVasistasRepository;
        this.$from = dateTime;
        this.$to = dateTime2;
        this.$userId = j5;
        this.$category = category;
        this.$vasistasClass = cls;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        SqlVasistasRepository$get$1 sqlVasistasRepository$get$1 = new SqlVasistasRepository$get$1(this.this$0, this.$from, this.$to, this.$userId, this.$category, this.$vasistasClass, dVar);
        sqlVasistasRepository$get$1.L$0 = obj;
        return sqlVasistasRepository$get$1;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, d<? super y> dVar) {
        return invoke((ProducerScope) ((ProducerScope) obj), dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ProducerScope producerScope;
        SqlVasistasRepository$get$1$listener$1 sqlVasistasRepository$get$1$listener$1;
        SqlVasistasDao sqlVasistasDao;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    l.b(obj);
                    return y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            producerScope = (ProducerScope) this.L$0;
            l.b(obj);
            sqlVasistasRepository$get$1$listener$1 = (SqlVasistasRepository$get$1$listener$1) this.L$1;
        } else {
            l.b(obj);
            final ProducerScope producerScope2 = (ProducerScope) this.L$0;
            final DateTime dateTime = this.$from;
            final DateTime dateTime2 = this.$to;
            final long j5 = this.$userId;
            final SqlVasistasRepository sqlVasistasRepository = this.this$0;
            final Vasistas.Category category = this.$category;
            final Class<T> cls = this.$vasistasClass;
            SqlVasistasDao.Listener listener = new SqlVasistasDao.Listener(dateTime, dateTime2, j5, sqlVasistasRepository, category, producerScope2, cls) { // from class: com.withings.vasistas.v2.repository.SqlVasistasRepository$get$1$listener$1
                final /* synthetic */ ProducerScope<List<? extends T>> $$this$callbackFlow;
                final /* synthetic */ Vasistas.Category $category;
                final /* synthetic */ Class<T> $vasistasClass;
                private final DateTime end;
                private final long requestedUserId;
                private final DateTime start;
                final /* synthetic */ SqlVasistasRepository this$0;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.this$0 = sqlVasistasRepository;
                    this.$category = category;
                    this.$$this$callbackFlow = producerScope2;
                    this.$vasistasClass = cls;
                    this.start = dateTime;
                    this.end = dateTime2;
                    this.requestedUserId = j5;
                }

                public final DateTime getEnd() {
                    return this.end;
                }

                public final long getRequestedUserId() {
                    return this.requestedUserId;
                }

                public final DateTime getStart() {
                    return this.start;
                }

                @Override // com.withings.vasistas.v2.repository.SqlVasistasDao.Listener
                public void onVasistasUpdated(long j11, Vasistas.Category vasistasCategory, DateTime from, DateTime to) {
                    List categoriesRelatedTo;
                    List<Vasistas> sqlVasistas;
                    com.withings.vasistas.v2.model.Vasistas map;
                    u.j(vasistasCategory, "vasistasCategory");
                    u.j(from, "from");
                    u.j(to, "to");
                    if (j11 == this.requestedUserId) {
                        categoriesRelatedTo = this.this$0.getCategoriesRelatedTo(this.$category);
                        if (categoriesRelatedTo.contains(vasistasCategory)) {
                            SendChannel sendChannel = this.$$this$callbackFlow;
                            sqlVasistas = this.this$0.getSqlVasistas(this.$category, j11, this.start, this.end);
                            SqlVasistasRepository sqlVasistasRepository2 = this.this$0;
                            Class<T> cls2 = this.$vasistasClass;
                            ArrayList arrayList = new ArrayList();
                            for (Vasistas vasistas : sqlVasistas) {
                                map = sqlVasistasRepository2.map(cls2, vasistas);
                                if (map != null) {
                                    arrayList.add(map);
                                }
                            }
                            sendChannel.mo66trySendJP2dKIU(arrayList);
                        }
                    }
                }
            };
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(producerScope2, this.this$0, this.$category, this.$userId, this.$from, this.$to, this.$vasistasClass, null);
            this.L$0 = producerScope2;
            this.L$1 = listener;
            this.label = 1;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            producerScope = producerScope2;
            sqlVasistasRepository$get$1$listener$1 = listener;
        }
        sqlVasistasDao = this.this$0.sqlVasistasDao;
        sqlVasistasDao.registerListener(sqlVasistasRepository$get$1$listener$1);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, sqlVasistasRepository$get$1$listener$1);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (ProduceKt.awaitClose(producerScope, anonymousClass2, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return y.f85009a;
    }

    public final Object invoke(ProducerScope<? super List<? extends T>> producerScope, d<? super y> dVar) {
        return ((SqlVasistasRepository$get$1) create(producerScope, dVar)).invokeSuspend(y.f85009a);
    }
}
