package com.withings.leaderboard.ui.screen;

import ah.o;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LeaderboardItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LeaderboardItemKt$LeaderBoardItem$2 extends w implements p<a, Integer, y> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $bodyText;
    final /* synthetic */ List<LeaderBoardUiEntry> $leaderboardEntries;
    final /* synthetic */ e $modifier;
    final /* synthetic */ String $position;
    final /* synthetic */ Integer $score;
    final /* synthetic */ String $title;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardItemKt$LeaderBoardItem$2(e eVar, String str, String str2, Integer num, String str3, List<LeaderBoardUiEntry> list, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$title = str;
        this.$bodyText = str2;
        this.$score = num;
        this.$position = str3;
        this.$leaderboardEntries = list;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(a aVar, int i11) {
        LeaderboardItemKt.LeaderBoardItem(this.$modifier, this.$title, this.$bodyText, this.$score, this.$position, this.$leaderboardEntries, aVar, o.g(this.$$changed | 1), this.$$default);
    }
}
