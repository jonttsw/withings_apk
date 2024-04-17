package com.withings.leaderboard.domain;

import com.withings.account.network.ws.RetrofitAccountRemoteRepository;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: GetPublicKey.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/withings/leaderboard/domain/GetPublicKey;", "", "Lcom/withings/leaderboard/repositories/data/SharePublicKey;", RetrofitAccountRemoteRepository.CHANNEL_CALL, "(Lqm0/d;)Ljava/lang/Object;", "", NavigationArguments.USER_ID, "J", "Lcom/withings/leaderboard/repositories/webservice/LeaderboardRemoteRepository;", "leaderboardRemoteRepository", "Lcom/withings/leaderboard/repositories/webservice/LeaderboardRemoteRepository;", "<init>", "(JLcom/withings/leaderboard/repositories/webservice/LeaderboardRemoteRepository;)V", "leaderboard_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GetPublicKey {
    public static final int $stable = 8;
    private final LeaderboardRemoteRepository leaderboardRemoteRepository;
    private final long userId;

    public GetPublicKey(long j5, LeaderboardRemoteRepository leaderboardRemoteRepository) {
        u.j(leaderboardRemoteRepository, "leaderboardRemoteRepository");
        this.userId = j5;
        this.leaderboardRemoteRepository = leaderboardRemoteRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5 A[PHI: r11 
      PHI: (r11v11 java.lang.Object) = (r11v7 java.lang.Object), (r11v1 java.lang.Object) binds: [B:40:0x00a2, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call(qm0.d<? super com.withings.leaderboard.repositories.data.SharePublicKey> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.withings.leaderboard.domain.GetPublicKey$call$1
            if (r0 == 0) goto L13
            r0 = r11
            com.withings.leaderboard.domain.GetPublicKey$call$1 r0 = (com.withings.leaderboard.domain.GetPublicKey$call$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.leaderboard.domain.GetPublicKey$call$1 r0 = new com.withings.leaderboard.domain.GetPublicKey$call$1
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            nm0.l.b(r11)
            goto La5
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L33:
            java.lang.Object r2 = r0.L$0
            com.withings.leaderboard.domain.GetPublicKey r2 = (com.withings.leaderboard.domain.GetPublicKey) r2
            nm0.l.b(r11)
            goto L4e
        L3b:
            nm0.l.b(r11)
            com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository r11 = r10.leaderboardRemoteRepository
            long r5 = r10.userId
            r0.L$0 = r10
            r0.label = r4
            java.lang.Object r11 = r11.getPublicKey(r5, r0)
            if (r11 != r1) goto L4d
            return r1
        L4d:
            r2 = r10
        L4e:
            com.withings.leaderboard.repositories.data.SharePublicKeys r11 = (com.withings.leaderboard.repositories.data.SharePublicKeys) r11
            r4 = 0
            if (r11 == 0) goto L96
            java.util.List r11 = r11.getList()
            if (r11 == 0) goto L96
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
        L5f:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L8f
            java.lang.Object r5 = r11.next()
            r6 = r5
            com.withings.leaderboard.repositories.data.SharePublicKey r6 = (com.withings.leaderboard.repositories.data.SharePublicKey) r6
            java.lang.String r7 = r6.getObject()
            java.lang.String r8 = "leaderboard"
            boolean r7 = dp0.j.x(r8, r7)
            if (r7 == 0) goto L5f
            java.lang.String r7 = "dev_user"
            java.lang.String r8 = r6.getOwnerType()
            boolean r7 = dp0.j.x(r7, r8)
            if (r7 == 0) goto L5f
            long r6 = r6.getOwnerId()
            long r8 = r2.userId
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L5f
            goto L90
        L8f:
            r5 = r4
        L90:
            com.withings.leaderboard.repositories.data.SharePublicKey r5 = (com.withings.leaderboard.repositories.data.SharePublicKey) r5
            if (r5 != 0) goto L95
            goto L96
        L95:
            return r5
        L96:
            com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository r11 = r2.leaderboardRemoteRepository
            long r5 = r2.userId
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r11 = r11.createPublicKey(r5, r0)
            if (r11 != r1) goto La5
            return r1
        La5:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.leaderboard.domain.GetPublicKey.call(qm0.d):java.lang.Object");
    }
}
