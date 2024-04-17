package com.withings.leaderboard.ui;

import com.withings.leaderboard.repositories.data.LeaderboardEntry;
import k1.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.a;
/* compiled from: LeaderboardActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class LeaderboardActivity$AskDelete$1$1 extends w implements a<y> {
    final /* synthetic */ r0<LeaderboardEntry> $userToDelete;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardActivity$AskDelete$1$1(r0<LeaderboardEntry> r0Var) {
        super(0);
        this.$userToDelete = r0Var;
    }

    @Override // ym0.a
    public /* bridge */ /* synthetic */ y invoke() {
        invoke2();
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$userToDelete.setValue(null);
    }
}
