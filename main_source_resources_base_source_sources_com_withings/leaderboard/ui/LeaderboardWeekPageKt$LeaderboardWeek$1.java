package com.withings.leaderboard.ui;

import com.withings.leaderboard.repositories.data.LeaderboardEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import s0.i0;
import s1.a;
import ym0.l;
/* compiled from: LeaderboardWeekPage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls0/i0;", "Lnm0/y;", "invoke", "(Ls0/i0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class LeaderboardWeekPageKt$LeaderboardWeek$1 extends w implements l<i0, y> {
    final /* synthetic */ long $data5FontSize;
    final /* synthetic */ String $glyphCup;
    final /* synthetic */ y2.l $glyphFontFamily;
    final /* synthetic */ List<LeaderboardEntry> $list;
    final /* synthetic */ l<LeaderboardEntry, y> $onClick;
    final /* synthetic */ l<LeaderboardEntry, y> $onLongClick;
    final /* synthetic */ long $userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LeaderboardWeekPageKt$LeaderboardWeek$1(List<LeaderboardEntry> list, long j5, l<? super LeaderboardEntry, y> lVar, l<? super LeaderboardEntry, y> lVar2, long j11, y2.l lVar3, String str) {
        super(1);
        this.$list = list;
        this.$userId = j5;
        this.$onLongClick = lVar;
        this.$onClick = lVar2;
        this.$data5FontSize = j11;
        this.$glyphFontFamily = lVar3;
        this.$glyphCup = str;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(i0 LazyColumn) {
        u.j(LazyColumn, "$this$LazyColumn");
        List<LeaderboardEntry> list = this.$list;
        LazyColumn.c(list.size(), null, new LeaderboardWeekPageKt$LeaderboardWeek$1$invoke$$inlined$itemsIndexed$default$2(list), new a(true, -1091073711, new LeaderboardWeekPageKt$LeaderboardWeek$1$invoke$$inlined$itemsIndexed$default$3(list, this.$userId, list, this.$onLongClick, this.$onClick, this.$data5FontSize, this.$glyphFontFamily, this.$glyphCup)));
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(i0 i0Var) {
        invoke2(i0Var);
        return y.f85009a;
    }
}
