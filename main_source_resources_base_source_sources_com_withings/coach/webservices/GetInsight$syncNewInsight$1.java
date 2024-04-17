package com.withings.coach.webservices;

import com.withings.insight.android.entity.WsModelsMapperKt;
import com.withings.insight.core.model.Insight;
import com.withings.insight.core.model.InsightContainer;
import ew.a;
import gw.b;
import gw.f;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import org.joda.time.Instant;
import qm0.d;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetInsight.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.coach.webservices.GetInsight$syncNewInsight$1", f = "GetInsight.kt", l = {39, 41}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class GetInsight$syncNewInsight$1 extends i implements p<CoroutineScope, d<? super y>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ GetInsight this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GetInsight.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @e(c = "com.withings.coach.webservices.GetInsight$syncNewInsight$1$1", f = "GetInsight.kt", l = {42, 44}, m = "invokeSuspend")
    /* renamed from: com.withings.coach.webservices.GetInsight$syncNewInsight$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends i implements p<CoroutineScope, d<? super y>, Object> {
        final /* synthetic */ Long $modified;
        int label;
        final /* synthetic */ GetInsight this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(GetInsight getInsight, Long l5, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = getInsight;
            this.$modified = l5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$modified, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ti.d dVar;
            ti.d dVar2;
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
                l.b(obj);
            } else {
                l.b(obj);
                dVar = this.this$0.insightStateRepository;
                this.label = 1;
                if (dVar.d(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            Long l5 = this.$modified;
            if (l5 != null && (l5 == null || l5.longValue() != -1)) {
                dVar2 = this.this$0.insightStateRepository;
                long userId = this.this$0.getUserId();
                DateTime dateTime = Instant.ofEpochSecond(this.$modified.longValue()).toDateTime();
                this.label = 2;
                if (dVar2.c(userId, this, dateTime) == coroutineSingletons) {
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
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetInsight$syncNewInsight$1(GetInsight getInsight, d<? super GetInsight$syncNewInsight$1> dVar) {
        super(2, dVar);
        this.this$0 = getInsight;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new GetInsight$syncNewInsight$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        boolean z5;
        Insight insight;
        com.withings.insight.android.entity.Insight entity;
        b bVar;
        b bVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        y yVar = null;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    insight = (Insight) this.L$0;
                    l.b(obj);
                    if (insight == null && (entity = WsModelsMapperKt.toEntity(insight)) != null) {
                        GetInsight getInsight = this.this$0;
                        entity.setUserId(getInsight.getUserId());
                        entity.setSynced(true);
                        long j5 = 1000;
                        entity.setModified(entity.getModified() * j5);
                        entity.setCreated(entity.getCreated() * j5);
                        Long insightId = entity.getInsightId();
                        if (insightId == null) {
                            return null;
                        }
                        long longValue = insightId.longValue();
                        bVar = getInsight.repository;
                        if (bVar.b(longValue) != null) {
                            bVar2 = getInsight.repository;
                            bVar2.e(entity);
                            yVar = y.f85009a;
                        }
                        if (yVar == null) {
                            getInsight.addInsightAndSendFirebaseEvent(entity);
                        }
                        return y.f85009a;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.b(obj);
        } else {
            l.b(obj);
            aVar = this.this$0.remoteRepository;
            f withSyncContext = aVar.withSyncContext(this.this$0.getSyncContext());
            long userId = this.this$0.getUserId();
            z5 = this.this$0.forceRefresh;
            this.label = 1;
            obj = withSyncContext.b(userId, z5, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        InsightContainer insightContainer = (InsightContainer) obj;
        Insight component1 = insightContainer.component1();
        Long component2 = insightContainer.component2();
        CoroutineDispatcher io2 = Dispatchers.getIO();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, component2, null);
        this.L$0 = component1;
        this.label = 2;
        if (BuildersKt.withContext(io2, anonymousClass1, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        insight = component1;
        return insight == null ? null : null;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((GetInsight$syncNewInsight$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
