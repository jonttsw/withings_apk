package com.withings.leaderboard.ui.screen;

import androidx.compose.foundation.layout.x0;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import ay.b;
import com.withings.common.compose.component.n4;
import com.withings.common.compose.component.p4;
import com.withings.wiscale2.C1987R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import yk.h;
import ym0.p;
import ym0.q;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LeaderboardItem.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LeaderboardItemKt$LeaderBoardItem$1 extends w implements p<a, Integer, y> {
    final /* synthetic */ List<LeaderBoardUiEntry> $leaderboardEntries;
    final /* synthetic */ String $position;
    final /* synthetic */ Integer $score;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LeaderboardItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/withings/common/compose/component/p4;", "Lnm0/y;", "invoke", "(Lcom/withings/common/compose/component/p4;Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.leaderboard.ui.screen.LeaderboardItemKt$LeaderBoardItem$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends w implements q<p4, a, Integer, y> {
        final /* synthetic */ String $position;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str) {
            super(3);
            this.$position = str;
        }

        @Override // ym0.q
        public /* bridge */ /* synthetic */ y invoke(p4 p4Var, a aVar, Integer num) {
            invoke(p4Var, aVar, num.intValue());
            return y.f85009a;
        }

        public final void invoke(p4 listOf, a aVar, int i11) {
            u.j(listOf, "$this$listOf");
            if ((i11 & 81) == 16 && aVar.h()) {
                aVar.C();
            } else {
                n4.c(b.u(C1987R.string.weeklyPodium_you, aVar), null, this.$position, false, null, aVar, 0, 26);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LeaderboardItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/withings/common/compose/component/p4;", "Lnm0/y;", "invoke", "(Lcom/withings/common/compose/component/p4;Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.leaderboard.ui.screen.LeaderboardItemKt$LeaderBoardItem$1$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends w implements q<p4, a, Integer, y> {
        final /* synthetic */ Integer $score;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Integer num) {
            super(3);
            this.$score = num;
        }

        @Override // ym0.q
        public /* bridge */ /* synthetic */ y invoke(p4 p4Var, a aVar, Integer num) {
            invoke(p4Var, aVar, num.intValue());
            return y.f85009a;
        }

        public final void invoke(p4 listOf, a aVar, int i11) {
            u.j(listOf, "$this$listOf");
            if ((i11 & 81) == 16 && aVar.h()) {
                aVar.C();
            } else {
                n4.c(b.u(C1987R.string._STEPS_, aVar), null, this.$score.toString(), false, null, aVar, 0, 26);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardItemKt$LeaderBoardItem$1(Integer num, List<LeaderBoardUiEntry> list, String str) {
        super(2);
        this.$score = num;
        this.$leaderboardEntries = list;
        this.$position = str;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.h()) {
            aVar.C();
            return;
        }
        aVar.s(-1382316302);
        if (this.$score != null) {
            n4.a(x0.h(e.f8927a, 0.0f, h.q(), 1), 0, 0.0f, x.W(s1.b.b(aVar, 1045271056, new AnonymousClass1(this.$position)), s1.b.b(aVar, -1434208751, new AnonymousClass2(this.$score))), false, null, aVar, 3120, 52);
        }
        aVar.J();
        LeaderboardItemKt.HorizontalBars(this.$leaderboardEntries, aVar, 8);
    }
}
