package com.withings.leaderboard.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: LeaderboardActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newPage", "Lnm0/y;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class LeaderboardActivity$ScreenContent$1$1$2$1 extends w implements l<Integer, y> {
    final /* synthetic */ l<Integer, y> $onMovePage;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LeaderboardActivity$ScreenContent$1$1$2$1(l<? super Integer, y> lVar) {
        super(1);
        this.$onMovePage = lVar;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(Integer num) {
        invoke(num.intValue());
        return y.f85009a;
    }

    public final void invoke(int i11) {
        this.$onMovePage.invoke(Integer.valueOf(i11));
    }
}
