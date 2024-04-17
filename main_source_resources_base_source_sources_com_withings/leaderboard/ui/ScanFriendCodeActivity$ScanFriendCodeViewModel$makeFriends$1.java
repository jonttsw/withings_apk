package com.withings.leaderboard.ui;

import com.withings.leaderboard.ui.ScanFriendCodeActivity;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import qm0.d;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScanFriendCodeActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.leaderboard.ui.ScanFriendCodeActivity$ScanFriendCodeViewModel$makeFriends$1", f = "ScanFriendCodeActivity.kt", l = {ConstantsWs.MEASURE_TYPE_VASISTAS_TYPE_WALKING_ASYMETRY, ConstantsWs.MEASURE_TYPE_FAT_FREE_MASS_SEGMENT, ConstantsWs.MEASURE_TYPE_FAT_MASS_SEGMENT}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ScanFriendCodeActivity$ScanFriendCodeViewModel$makeFriends$1 extends i implements p<CoroutineScope, d<? super y>, Object> {
    final /* synthetic */ String $friendHash;
    final /* synthetic */ String $userName;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ScanFriendCodeActivity.ScanFriendCodeViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanFriendCodeActivity$ScanFriendCodeViewModel$makeFriends$1(ScanFriendCodeActivity.ScanFriendCodeViewModel scanFriendCodeViewModel, String str, String str2, d<? super ScanFriendCodeActivity$ScanFriendCodeViewModel$makeFriends$1> dVar) {
        super(2, dVar);
        this.this$0 = scanFriendCodeViewModel;
        this.$friendHash = str;
        this.$userName = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new ScanFriendCodeActivity$ScanFriendCodeViewModel$makeFriends$1(this.this$0, this.$friendHash, this.$userName, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
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
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L36
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            nm0.l.b(r11)     // Catch: java.lang.Throwable -> L13
            goto L7a
        L13:
            r11 = move-exception
            goto L85
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            java.lang.Object r1 = r10.L$1
            com.withings.user.core.models.User r1 = (com.withings.user.core.models.User) r1
            java.lang.Object r3 = r10.L$0
            com.withings.leaderboard.ui.ScanFriendCodeActivity$ScanFriendCodeViewModel r3 = (com.withings.leaderboard.ui.ScanFriendCodeActivity.ScanFriendCodeViewModel) r3
            nm0.l.b(r11)     // Catch: java.lang.Throwable -> L13
            goto L6c
        L2a:
            java.lang.Object r1 = r10.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r5 = r10.L$0
            com.withings.leaderboard.ui.ScanFriendCodeActivity$ScanFriendCodeViewModel r5 = (com.withings.leaderboard.ui.ScanFriendCodeActivity.ScanFriendCodeViewModel) r5
            nm0.l.b(r11)     // Catch: java.lang.Throwable -> L13
            goto L51
        L36:
            nm0.l.b(r11)
            com.withings.leaderboard.ui.ScanFriendCodeActivity$ScanFriendCodeViewModel r11 = r10.this$0
            java.lang.String r1 = r10.$friendHash
            r70.c r5 = com.withings.leaderboard.ui.ScanFriendCodeActivity.ScanFriendCodeViewModel.access$getUserRepository$p(r11)     // Catch: java.lang.Throwable -> L13
            r10.L$0 = r11     // Catch: java.lang.Throwable -> L13
            r10.L$1 = r1     // Catch: java.lang.Throwable -> L13
            r10.label = r4     // Catch: java.lang.Throwable -> L13
            java.lang.Object r5 = r70.d.e(r5, r10)     // Catch: java.lang.Throwable -> L13
            if (r5 != r0) goto L4e
            return r0
        L4e:
            r9 = r5
            r5 = r11
            r11 = r9
        L51:
            com.withings.user.core.models.User r11 = (com.withings.user.core.models.User) r11     // Catch: java.lang.Throwable -> L13
            if (r11 == 0) goto L7d
            com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository r6 = com.withings.leaderboard.ui.ScanFriendCodeActivity.ScanFriendCodeViewModel.access$getRemoteRepository$p(r5)     // Catch: java.lang.Throwable -> L13
            long r7 = r11.getId()     // Catch: java.lang.Throwable -> L13
            r10.L$0 = r5     // Catch: java.lang.Throwable -> L13
            r10.L$1 = r11     // Catch: java.lang.Throwable -> L13
            r10.label = r3     // Catch: java.lang.Throwable -> L13
            java.lang.Object r1 = r6.join(r7, r1, r10)     // Catch: java.lang.Throwable -> L13
            if (r1 != r0) goto L6a
            return r0
        L6a:
            r1 = r11
            r3 = r5
        L6c:
            r11 = 0
            r10.L$0 = r11     // Catch: java.lang.Throwable -> L13
            r10.L$1 = r11     // Catch: java.lang.Throwable -> L13
            r10.label = r2     // Catch: java.lang.Throwable -> L13
            java.lang.Object r11 = com.withings.leaderboard.ui.ScanFriendCodeActivity.ScanFriendCodeViewModel.access$syncLeaderboard(r3, r1, r10)     // Catch: java.lang.Throwable -> L13
            if (r11 != r0) goto L7a
            return r0
        L7a:
            nm0.y r11 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L13
            goto L89
        L7d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "No user"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L13
            throw r11     // Catch: java.lang.Throwable -> L13
        L85:
            nm0.k$a r11 = nm0.l.a(r11)
        L89:
            com.withings.leaderboard.ui.ScanFriendCodeActivity$ScanFriendCodeViewModel r0 = r10.this$0
            java.lang.String r1 = r10.$userName
            boolean r2 = r11 instanceof nm0.k.a
            r2 = r2 ^ r4
            if (r2 == 0) goto La1
            r2 = r11
            nm0.y r2 = (nm0.y) r2
            androidx.lifecycle.k0 r0 = r0.getBecomeFriendsLiveData()
            com.withings.leaderboard.ui.BecomeFriendsSuccess r2 = new com.withings.leaderboard.ui.BecomeFriendsSuccess
            r2.<init>(r1)
            r0.postValue(r2)
        La1:
            com.withings.leaderboard.ui.ScanFriendCodeActivity$ScanFriendCodeViewModel r0 = r10.this$0
            java.lang.String r1 = r10.$userName
            java.lang.Throwable r11 = nm0.k.b(r11)
            if (r11 == 0) goto Ld0
            boolean r2 = r11 instanceof com.withings.webservices.legacy.common.exception.AlreadyExistsException
            if (r2 == 0) goto Lbc
            androidx.lifecycle.k0 r11 = r0.getBecomeFriendsLiveData()
            com.withings.leaderboard.ui.BecomeFriendsSuccess r0 = new com.withings.leaderboard.ui.BecomeFriendsSuccess
            r0.<init>(r1)
            r11.postValue(r0)
            goto Ld0
        Lbc:
            x70.b.n(r11)
            androidx.lifecycle.k0 r0 = r0.getBecomeFriendsLiveData()
            com.withings.leaderboard.ui.BecomeFriendsError r1 = new com.withings.leaderboard.ui.BecomeFriendsError
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>(r11)
            r1.<init>(r2)
            r0.postValue(r1)
        Ld0:
            nm0.y r11 = nm0.y.f85009a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.leaderboard.ui.ScanFriendCodeActivity$ScanFriendCodeViewModel$makeFriends$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((ScanFriendCodeActivity$ScanFriendCodeViewModel$makeFriends$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
