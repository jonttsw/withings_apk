package com.withings.leaderboard.ui;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import ym0.l;
import ym0.p;
/* compiled from: LazyDsl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", FirebaseAnalytics.Param.INDEX, "", "invoke", "(I)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LeaderboardWeekPageKt$LeaderboardWeek$1$invoke$$inlined$itemsIndexed$default$1 extends w implements l<Integer, Object> {
    final /* synthetic */ List $items;
    final /* synthetic */ p $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardWeekPageKt$LeaderboardWeek$1$invoke$$inlined$itemsIndexed$default$1(p pVar, List list) {
        super(1);
        this.$key = pVar;
        this.$items = list;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Object invoke(int i11) {
        return this.$key.invoke(Integer.valueOf(i11), this.$items.get(i11));
    }
}
