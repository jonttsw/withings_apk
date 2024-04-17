package com.withings.leaderboard.ui.screen;

import ah.o;
import androidx.compose.runtime.a;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LeaderboardItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LeaderboardItemKt$PreviewFirstLeaderBoardItem$1 extends w implements p<a, Integer, y> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $darkMode;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardItemKt$PreviewFirstLeaderBoardItem$1(boolean z5, int i11) {
        super(2);
        this.$darkMode = z5;
        this.$$changed = i11;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(a aVar, int i11) {
        LeaderboardItemKt.PreviewFirstLeaderBoardItem(this.$darkMode, aVar, o.g(this.$$changed | 1));
    }
}
