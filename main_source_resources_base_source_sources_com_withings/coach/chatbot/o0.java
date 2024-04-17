package com.withings.coach.chatbot;

import com.withings.coach.webservices.GetInsightByConversationId;
import com.withings.insight.android.entity.Insight;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatbotViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.coach.chatbot.ChatbotViewModel$getWsInsight$1", f = "ChatbotViewModel.kt", l = {227}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class o0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33040a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f33041b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p0 f33042c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatbotViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.coach.chatbot.ChatbotViewModel$getWsInsight$1$3$1", f = "ChatbotViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<Long, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ long f33043a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p0 f33044b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f33045c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j5, p0 p0Var, qm0.d dVar) {
            super(2, dVar);
            this.f33044b = p0Var;
            this.f33045c = j5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(this.f33045c, this.f33044b, dVar);
            aVar.f33043a = ((Number) obj).longValue();
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(Long l5, qm0.d<? super nm0.y> dVar) {
            return ((a) create(Long.valueOf(l5.longValue()), dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            long j5 = this.f33043a;
            p0 p0Var = this.f33044b;
            GetInsightByConversationId getInsightByConversationId = new GetInsightByConversationId(j5, p0Var.f33048a, p0Var.f33049b, this.f33045c);
            getInsightByConversationId.setSyncContext("fetchOnInsightSelected");
            getInsightByConversationId.run();
            Insight c11 = p0Var.f33048a.c(this.f33045c);
            if (c11 != null) {
                p0Var.t1(c11);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(long j5, p0 p0Var, qm0.d<? super o0> dVar) {
        super(2, dVar);
        this.f33041b = j5;
        this.f33042c = p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new o0(this.f33041b, this.f33042c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((o0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r10 == null) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r9.f33040a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            nm0.l.b(r10)
            goto L63
        Ld:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L15:
            nm0.l.b(r10)
            java.lang.Long r10 = new java.lang.Long
            long r3 = r9.f33041b
            r10.<init>(r3)
            long r5 = r10.longValue()
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r5 = 0
            if (r1 <= 0) goto L2b
            goto L2c
        L2b:
            r10 = r5
        L2c:
            com.withings.coach.chatbot.p0 r1 = r9.f33042c
            if (r10 == 0) goto L43
            gw.b r10 = com.withings.coach.chatbot.p0.r0(r1)
            com.withings.insight.android.entity.Insight r10 = r10.b(r3)
            if (r10 == 0) goto L40
            com.withings.coach.chatbot.p0.A0(r1, r10)
            nm0.y r10 = nm0.y.f85009a
            goto L41
        L40:
            r10 = r5
        L41:
            if (r10 != 0) goto Lbe
        L43:
            com.withings.insight.android.entity.Insight r10 = com.withings.coach.chatbot.p0.p0(r1)
            java.lang.Long r10 = r10.getConversationId()
            if (r10 == 0) goto L66
            long r3 = r10.longValue()
            kotlinx.coroutines.flow.SharedFlow r10 = com.withings.coach.chatbot.p0.z0(r1)
            com.withings.coach.chatbot.o0$a r6 = new com.withings.coach.chatbot.o0$a
            r6.<init>(r3, r1, r5)
            r9.f33040a = r2
            java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt.collectLatest(r10, r6, r9)
            if (r10 != r0) goto L63
            return r0
        L63:
            nm0.y r10 = nm0.y.f85009a
            goto Lbe
        L66:
            com.withings.insight.android.entity.Insight r10 = com.withings.coach.chatbot.p0.p0(r1)
            com.withings.insight.android.entity.InsightContent r10 = r10.getContent()
            if (r10 == 0) goto Lbe
            java.lang.String r10 = r10.getButtonUrl()
            if (r10 == 0) goto Lbe
            r0 = 0
            java.lang.String r2 = "hconv"
            boolean r0 = dp0.j.r(r10, r2, r0)
            if (r0 == 0) goto L80
            goto L81
        L80:
            r10 = r5
        L81:
            if (r10 == 0) goto Lbe
            gq0.c r10 = gq0.c.a(r10)     // Catch: java.lang.Throwable -> La8
            org.jsoup.nodes.Document r10 = r10.c()     // Catch: java.lang.Throwable -> La8
            org.jsoup.nodes.g r10 = r10.g0()     // Catch: java.lang.Throwable -> La8
            java.lang.String r10 = r10.W()     // Catch: java.lang.Throwable -> La8
            com.google.gson.Gson r0 = new com.google.gson.Gson     // Catch: java.lang.Throwable -> La8
            r0.<init>()     // Catch: java.lang.Throwable -> La8
            java.lang.Class<com.withings.insight.android.entity.Insight> r2 = com.withings.insight.android.entity.Insight.class
            java.lang.Object r10 = r0.fromJson(r10, r2)     // Catch: java.lang.Throwable -> La8
            com.withings.insight.android.entity.Insight r10 = (com.withings.insight.android.entity.Insight) r10     // Catch: java.lang.Throwable -> La8
            if (r10 == 0) goto Lad
            com.withings.coach.chatbot.p0.A0(r1, r10)     // Catch: java.lang.Throwable -> La8
            nm0.y r5 = nm0.y.f85009a     // Catch: java.lang.Throwable -> La8
            goto Lad
        La8:
            r10 = move-exception
            nm0.k$a r5 = nm0.l.a(r10)
        Lad:
            java.lang.Throwable r10 = nm0.k.b(r5)
            if (r10 == 0) goto Lbe
            java.lang.String r0 = r10.getMessage()
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            x70.b.t(r1, r0, r10)
        Lbe:
            nm0.y r10 = nm0.y.f85009a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.coach.chatbot.o0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
