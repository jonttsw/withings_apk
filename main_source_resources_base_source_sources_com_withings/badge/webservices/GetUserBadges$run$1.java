package com.withings.badge.webservices;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: GetUserBadges.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.badge.webservices.GetUserBadges$run$1", f = "GetUserBadges.kt", l = {21, 23, 26}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class GetUserBadges$run$1 extends i implements p<CoroutineScope, d<? super y>, Object> {
    int label;
    final /* synthetic */ GetUserBadges this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserBadges$run$1(GetUserBadges getUserBadges, d<? super GetUserBadges$run$1> dVar) {
        super(2, dVar);
        this.this$0 = getUserBadges;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new GetUserBadges$run$1(this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
        if (r9 == false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9 A[LOOP:0: B:29:0x00a3->B:31:0x00a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            nm0.l.b(r9)
            goto Ld0
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            nm0.l.b(r9)
            goto L7f
        L20:
            nm0.l.b(r9)
            goto L3c
        L24:
            nm0.l.b(r9)
            com.withings.badge.webservices.GetUserBadges r9 = r8.this$0
            zh.a r9 = com.withings.badge.webservices.GetUserBadges.access$getLocalRepository$p(r9)
            com.withings.badge.webservices.GetUserBadges r1 = r8.this$0
            long r5 = com.withings.badge.webservices.GetUserBadges.access$getUserId$p(r1)
            r8.label = r4
            java.lang.Long r9 = r9.getLastUpdate(r5)
            if (r9 != r0) goto L3c
            return r0
        L3c:
            java.lang.Number r9 = (java.lang.Number) r9
            long r4 = r9.longValue()
            com.withings.badge.webservices.GetUserBadges r9 = r8.this$0
            boolean r9 = com.withings.badge.webservices.GetUserBadges.access$getIgnoreLastUpdate$p(r9)
            if (r9 != 0) goto L6a
            com.withings.badge.webservices.GetUserBadges r9 = r8.this$0
            com.withings.webservices.legacy.lastupdate.LastUpdate r1 = r9.getLastUpdate()
            if (r1 == 0) goto L63
            com.withings.badge.webservices.GetUserBadges r6 = r8.this$0
            long r6 = com.withings.badge.webservices.GetUserBadges.access$getUserId$p(r6)
            com.withings.webservices.legacy.lastupdate.UserLastUpdate r1 = r1.getUser(r6)
            if (r1 == 0) goto L63
            org.joda.time.DateTime r1 = r1.getBadge()
            goto L64
        L63:
            r1 = 0
        L64:
            boolean r9 = com.withings.badge.webservices.GetUserBadges.access$shouldMakeCallForLastUpdates(r9, r4, r1)
            if (r9 == 0) goto Ld0
        L6a:
            com.withings.badge.webservices.GetUserBadges r9 = r8.this$0
            zh.b r9 = com.withings.badge.webservices.GetUserBadges.access$getRemoteRepository$p(r9)
            com.withings.badge.webservices.GetUserBadges r1 = r8.this$0
            long r4 = com.withings.badge.webservices.GetUserBadges.access$getUserId$p(r1)
            r8.label = r3
            java.lang.Object r9 = r9.a(r4, r8)
            if (r9 != r0) goto L7f
            return r0
        L7f:
            ai.b r9 = (ai.b) r9
            com.withings.badge.webservices.GetUserBadges r1 = r8.this$0
            java.util.Map r3 = r9.b()
            java.util.List r1 = com.withings.badge.webservices.GetUserBadges.access$convertToList(r1, r3)
            java.util.Collection r1 = (java.util.Collection) r1
            com.withings.badge.webservices.GetUserBadges r3 = r8.this$0
            java.util.Map r9 = r9.a()
            java.util.List r9 = com.withings.badge.webservices.GetUserBadges.access$convertToList(r3, r9)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r9 = kotlin.collections.x.l0(r9, r1)
            com.withings.badge.webservices.GetUserBadges r1 = r8.this$0
            java.util.Iterator r3 = r9.iterator()
        La3:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lbb
            java.lang.Object r4 = r3.next()
            ai.a r4 = (ai.a) r4
            com.withings.badge.webservices.BadgeImageDownloader r5 = com.withings.badge.webservices.GetUserBadges.access$getImageDownloader$p(r1)
            java.lang.String r4 = r4.d()
            r5.downloadImages(r4)
            goto La3
        Lbb:
            com.withings.badge.webservices.GetUserBadges r1 = r8.this$0
            zh.a r1 = com.withings.badge.webservices.GetUserBadges.access$getLocalRepository$p(r1)
            com.withings.badge.webservices.GetUserBadges r3 = r8.this$0
            long r3 = com.withings.badge.webservices.GetUserBadges.access$getUserId$p(r3)
            r8.label = r2
            nm0.y r9 = r1.e(r3, r9)
            if (r9 != r0) goto Ld0
            return r0
        Ld0:
            nm0.y r9 = nm0.y.f85009a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.badge.webservices.GetUserBadges$run$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((GetUserBadges$run$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
