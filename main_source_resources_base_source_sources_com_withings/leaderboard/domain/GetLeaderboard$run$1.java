package com.withings.leaderboard.domain;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: GetLeaderboard.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.leaderboard.domain.GetLeaderboard$run$1", f = "GetLeaderboard.kt", l = {38}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class GetLeaderboard$run$1 extends i implements p<CoroutineScope, d<? super y>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ GetLeaderboard this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLeaderboard$run$1(GetLeaderboard getLeaderboard, d<? super GetLeaderboard$run$1> dVar) {
        super(2, dVar);
        this.this$0 = getLeaderboard;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new GetLeaderboard$run$1(this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (com.withings.webservices.legacy.lastupdate.LastUpdateCheckerKt.shouldMakeCallForLastUpdate(r1, r3) == true) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r10.label
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            java.lang.Object r0 = r10.L$0
            com.withings.leaderboard.domain.LeaderboardManager r0 = (com.withings.leaderboard.domain.LeaderboardManager) r0
            nm0.l.b(r11)
            goto L89
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            nm0.l.b(r11)
            com.withings.leaderboard.domain.LeaderboardManager$Companion r11 = com.withings.leaderboard.domain.LeaderboardManager.Companion
            com.withings.leaderboard.domain.LeaderboardManager r11 = r11.get()
            org.joda.time.DateTime r1 = r11.localLastUpdate()
            long r3 = r1.getMillis()
            com.withings.leaderboard.domain.GetLeaderboard r1 = r10.this$0
            boolean r1 = com.withings.leaderboard.domain.GetLeaderboard.access$getIgnoreLastUpdate$p(r1)
            if (r1 != 0) goto L53
            com.withings.leaderboard.domain.GetLeaderboard r1 = r10.this$0
            com.withings.webservices.legacy.lastupdate.LastUpdate r1 = r1.getLastUpdate()
            if (r1 == 0) goto Lb6
            com.withings.leaderboard.domain.GetLeaderboard r5 = r10.this$0
            long r5 = com.withings.leaderboard.domain.GetLeaderboard.access$getUserId$p(r5)
            com.withings.webservices.legacy.lastupdate.UserLastUpdate r1 = r1.getUser(r5)
            if (r1 == 0) goto Lb6
            org.joda.time.DateTime r1 = r1.getLeaderboard()
            if (r1 == 0) goto Lb6
            boolean r1 = com.withings.webservices.legacy.lastupdate.LastUpdateCheckerKt.shouldMakeCallForLastUpdate(r1, r3)
            if (r1 != r2) goto Lb6
        L53:
            com.withings.leaderboard.domain.GetLeaderboard r1 = r10.this$0
            org.joda.time.DateTime r1 = com.withings.leaderboard.domain.GetLeaderboard.access$getWeek$p(r1)
            org.joda.time.DateTime r1 = r1.withDayOfWeek(r2)
            java.lang.String r3 = "yyyy-MM-dd"
            java.lang.String r5 = r1.toString(r3)
            com.withings.leaderboard.domain.GetLeaderboard r1 = r10.this$0
            com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository r1 = com.withings.leaderboard.domain.GetLeaderboard.access$getLeaderboardRemoteRepository$p(r1)
            com.withings.leaderboard.domain.GetLeaderboard r3 = r10.this$0
            java.lang.String r3 = r3.getSyncContext()
            com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository r4 = r1.withSyncContext(r3)
            com.withings.leaderboard.domain.GetLeaderboard r1 = r10.this$0
            long r7 = com.withings.leaderboard.domain.GetLeaderboard.access$getUserId$p(r1)
            r10.L$0 = r11
            r10.label = r2
            r6 = 36
            r9 = r10
            java.lang.Object r1 = r4.getLeaderboard(r5, r6, r7, r9)
            if (r1 != r0) goto L87
            return r0
        L87:
            r0 = r11
            r11 = r1
        L89:
            com.withings.leaderboard.repositories.data.LeaderboardResult r11 = (com.withings.leaderboard.repositories.data.LeaderboardResult) r11
            if (r11 == 0) goto Lb6
            java.util.List r11 = r11.getList()
            if (r11 == 0) goto Lb6
            com.withings.leaderboard.domain.GetLeaderboard r1 = r10.this$0
            long r3 = com.withings.leaderboard.domain.GetLeaderboard.access$getUserId$p(r1)
            org.joda.time.DateTime r5 = com.withings.leaderboard.domain.GetLeaderboard.access$getWeek$p(r1)
            org.joda.time.DateTime r5 = hn.a.s(r5)
            r0.insertLeaderboard(r3, r5, r11)
            int r11 = r11.size()
            if (r11 <= r2) goto Lb6
            com.withings.leaderboard.domain.AutoJoinLeaderboard r11 = new com.withings.leaderboard.domain.AutoJoinLeaderboard
            android.content.Context r0 = com.withings.leaderboard.domain.GetLeaderboard.access$getContext$p(r1)
            r11.<init>(r0)
            r11.run()
        Lb6:
            nm0.y r11 = nm0.y.f85009a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.leaderboard.domain.GetLeaderboard$run$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((GetLeaderboard$run$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
