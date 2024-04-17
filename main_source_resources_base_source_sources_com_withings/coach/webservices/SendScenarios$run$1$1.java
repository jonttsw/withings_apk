package com.withings.coach.webservices;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: SendScenarios.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.coach.webservices.SendScenarios$run$1$1", f = "SendScenarios.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SendScenarios$run$1$1 extends i implements p<CoroutineScope, d<? super y>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ SendScenarios this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendScenarios$run$1$1(SendScenarios sendScenarios, d<? super SendScenarios$run$1$1> dVar) {
        super(2, dVar);
        this.this$0 = sendScenarios;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new SendScenarios$run$1$1(this.this$0, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c2 -> B:25:0x00c4). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r11 = r17
            kotlin.coroutines.intrinsics.CoroutineSingletons r12 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r0 = r11.label
            r13 = 1
            if (r0 == 0) goto L29
            if (r0 != r13) goto L21
            java.lang.Object r0 = r11.L$2
            com.withings.insight.android.entity.Insight r0 = (com.withings.insight.android.entity.Insight) r0
            java.lang.Object r1 = r11.L$1
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r2 = r11.L$0
            com.withings.coach.webservices.SendScenarios r2 = (com.withings.coach.webservices.SendScenarios) r2
            nm0.l.b(r18)
            r14 = r1
            r15 = r2
            r1 = r0
            r0 = r18
            goto Lc4
        L21:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L29:
            nm0.l.b(r18)
            com.withings.coach.webservices.SendScenarios r0 = r11.this$0
            java.util.List r0 = com.withings.coach.webservices.SendScenarios.access$getInsightsToSync$p(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L3d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L60
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.withings.insight.android.entity.Insight r3 = (com.withings.insight.android.entity.Insight) r3
            java.util.List r4 = r3.getScenario()
            if (r4 == 0) goto L3d
            boolean r4 = r3.getSynced()
            if (r4 != 0) goto L3d
            boolean r3 = r3.hasValidId()
            if (r3 == 0) goto L3d
            r1.add(r2)
            goto L3d
        L60:
            com.withings.coach.webservices.SendScenarios r0 = r11.this$0
            java.util.Iterator r1 = r1.iterator()
            r15 = r0
            r14 = r1
        L68:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto Le5
            java.lang.Object r0 = r14.next()
            r10 = r0
            com.withings.insight.android.entity.Insight r10 = (com.withings.insight.android.entity.Insight) r10
            ew.a r0 = com.withings.coach.webservices.SendScenarios.access$getRemoteRepository$p(r15)
            java.lang.String r1 = r15.getSyncContext()
            gw.f r0 = r0.withSyncContext(r1)
            long r1 = com.withings.coach.webservices.SendScenarios.access$getUserId$p(r15)
            int r3 = com.withings.coach.webservices.SendScenarios.access$getProgramId$p(r15)
            long r3 = (long) r3
            java.lang.Long r5 = r10.getInsightId()
            kotlin.jvm.internal.u.g(r5)
            long r5 = r5.longValue()
            com.google.gson.Gson r7 = new com.google.gson.Gson
            r7.<init>()
            java.util.List r8 = r10.getScenario()
            java.lang.String r7 = r7.toJson(r8)
            java.lang.String r8 = "toJson(...)"
            kotlin.jvm.internal.u.i(r7, r8)
            boolean r8 = r10.getRead()
            boolean r9 = r10.getOpened()
            r11.L$0 = r15
            r11.L$1 = r14
            r11.L$2 = r10
            r11.label = r13
            r16 = r10
            r10 = r17
            java.lang.Object r0 = r0.c(r1, r3, r5, r7, r8, r9, r10)
            if (r0 != r12) goto Lc2
            return r12
        Lc2:
            r1 = r16
        Lc4:
            com.withings.insight.core.model.UpdateScenarioResponse r0 = (com.withings.insight.core.model.UpdateScenarioResponse) r0
            r1.setSynced(r13)
            com.withings.insight.core.model.UpdateResponse r0 = r0.getInsight()
            if (r0 == 0) goto Ld4
            long r2 = r0.getModified()
            goto Ld6
        Ld4:
            r2 = 0
        Ld6:
            r0 = 1000(0x3e8, float:1.401E-42)
            long r4 = (long) r0
            long r2 = r2 * r4
            r1.setModified(r2)
            gw.b r0 = com.withings.coach.webservices.SendScenarios.access$getRepository$p(r15)
            r0.e(r1)
            goto L68
        Le5:
            nm0.y r0 = nm0.y.f85009a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.coach.webservices.SendScenarios$run$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((SendScenarios$run$1$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
