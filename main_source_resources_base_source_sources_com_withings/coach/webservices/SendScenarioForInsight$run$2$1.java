package com.withings.coach.webservices;

import com.google.gson.Gson;
import com.withings.insight.android.entity.Insight;
import com.withings.insight.core.model.UpdateResponse;
import com.withings.insight.core.model.UpdateScenarioResponse;
import ew.a;
import gw.b;
import gw.f;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.k;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SendScenarioForInsight.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/k;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lnm0/k;"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.coach.webservices.SendScenarioForInsight$run$2$1", f = "SendScenarioForInsight.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SendScenarioForInsight$run$2$1 extends i implements p<CoroutineScope, d<? super k<? extends y>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ SendScenarioForInsight this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendScenarioForInsight$run$2$1(SendScenarioForInsight sendScenarioForInsight, d<? super SendScenarioForInsight$run$2$1> dVar) {
        super(2, dVar);
        this.this$0 = sendScenarioForInsight;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new SendScenarioForInsight$run$2$1(this.this$0, dVar);
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, d<? super k<? extends y>> dVar) {
        return invoke2(coroutineScope, (d<? super k<y>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        a aVar;
        long j5;
        int i11;
        Insight insight;
        Insight insight2;
        Insight insight3;
        Insight insight4;
        Object c11;
        SendScenarioForInsight sendScenarioForInsight;
        Insight insight5;
        Insight insight6;
        long j11;
        b bVar;
        Insight insight7;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i12 = this.label;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    sendScenarioForInsight = (SendScenarioForInsight) this.L$0;
                    l.b(obj);
                    c11 = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                SendScenarioForInsight sendScenarioForInsight2 = this.this$0;
                aVar = sendScenarioForInsight2.remoteRepository;
                f withSyncContext = aVar.withSyncContext(sendScenarioForInsight2.getSyncContext());
                j5 = sendScenarioForInsight2.userId;
                i11 = sendScenarioForInsight2.programId;
                insight = sendScenarioForInsight2.insightToUpdate;
                Long insightId = insight.getInsightId();
                u.g(insightId);
                long longValue = insightId.longValue();
                Gson gson = new Gson();
                insight2 = sendScenarioForInsight2.insightToUpdate;
                String json = gson.toJson(insight2.getScenario());
                u.i(json, "toJson(...)");
                insight3 = sendScenarioForInsight2.insightToUpdate;
                boolean read = insight3.getRead();
                insight4 = sendScenarioForInsight2.insightToUpdate;
                boolean opened = insight4.getOpened();
                this.L$0 = sendScenarioForInsight2;
                this.label = 1;
                c11 = withSyncContext.c(j5, i11, longValue, json, read, opened, this);
                if (c11 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                sendScenarioForInsight = sendScenarioForInsight2;
            }
            insight5 = sendScenarioForInsight.insightToUpdate;
            insight5.setSynced(true);
            insight6 = sendScenarioForInsight.insightToUpdate;
            UpdateResponse insight8 = ((UpdateScenarioResponse) c11).getInsight();
            if (insight8 != null) {
                j11 = insight8.getModified();
            } else {
                j11 = 0;
            }
            insight6.setModified(j11 * 1000);
            bVar = sendScenarioForInsight.repository;
            insight7 = sendScenarioForInsight.insightToUpdate;
            bVar.e(insight7);
            a11 = y.f85009a;
        } catch (Throwable th2) {
            a11 = l.a(th2);
        }
        return k.a(a11);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, d<? super k<y>> dVar) {
        return ((SendScenarioForInsight$run$2$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
