package com.withings.leaderboard.domain;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LeaderboardManager.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.leaderboard.domain.LeaderboardManager", f = "LeaderboardManager.kt", l = {53}, m = "deleteUser")
/* loaded from: classes3.dex */
public final class LeaderboardManager$deleteUser$1 extends c {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LeaderboardManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardManager$deleteUser$1(LeaderboardManager leaderboardManager, d<? super LeaderboardManager$deleteUser$1> dVar) {
        super(dVar);
        this.this$0 = leaderboardManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.deleteUser(0L, this);
    }
}
