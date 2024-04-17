package com.withings.coach.webservices;

import com.withings.insight.core.model.InsightContainer;
import ew.a;
import gw.f;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetInsightByConversationId.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/insight/core/model/InsightContainer;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.coach.webservices.GetInsightByConversationId$run$1$container$1", f = "GetInsightByConversationId.kt", l = {25}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class GetInsightByConversationId$run$1$container$1 extends i implements p<CoroutineScope, d<? super InsightContainer>, Object> {
    int label;
    final /* synthetic */ GetInsightByConversationId this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetInsightByConversationId$run$1$container$1(GetInsightByConversationId getInsightByConversationId, d<? super GetInsightByConversationId$run$1$container$1> dVar) {
        super(2, dVar);
        this.this$0 = getInsightByConversationId;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new GetInsightByConversationId$run$1$container$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        long j5;
        long j11;
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
            aVar = this.this$0.remoteRepository;
            f withSyncContext = aVar.withSyncContext(this.this$0.getSyncContext());
            j5 = this.this$0.callUserId;
            j11 = this.this$0.callConversationId;
            this.label = 1;
            obj = withSyncContext.a(j5, j11, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super InsightContainer> dVar) {
        return ((GetInsightByConversationId$run$1$container$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
