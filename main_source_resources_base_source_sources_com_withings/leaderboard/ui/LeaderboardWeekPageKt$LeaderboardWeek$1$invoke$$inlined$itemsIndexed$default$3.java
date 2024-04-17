package com.withings.leaderboard.ui;

import androidx.camera.core.y1;
import androidx.compose.material3.i1;
import androidx.compose.runtime.a;
import androidx.compose.runtime.j;
import com.withings.leaderboard.repositories.data.LeaderboardEntry;
import d2.f0;
import java.util.List;
import k1.a1;
import k1.x;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import s0.b;
import y2.l;
import yk.f;
import ym0.r;
/* compiled from: LazyDsl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ls0/b;", "", "it", "Lnm0/y;", "invoke", "(Ls0/b;ILandroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LeaderboardWeekPageKt$LeaderboardWeek$1$invoke$$inlined$itemsIndexed$default$3 extends w implements r<b, Integer, a, Integer, y> {
    final /* synthetic */ long $data5FontSize$inlined;
    final /* synthetic */ String $glyphCup$inlined;
    final /* synthetic */ l $glyphFontFamily$inlined;
    final /* synthetic */ List $items;
    final /* synthetic */ List $list$inlined;
    final /* synthetic */ ym0.l $onClick$inlined;
    final /* synthetic */ ym0.l $onLongClick$inlined;
    final /* synthetic */ long $userId$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardWeekPageKt$LeaderboardWeek$1$invoke$$inlined$itemsIndexed$default$3(List list, long j5, List list2, ym0.l lVar, ym0.l lVar2, long j11, l lVar3, String str) {
        super(4);
        this.$items = list;
        this.$userId$inlined = j5;
        this.$list$inlined = list2;
        this.$onLongClick$inlined = lVar;
        this.$onClick$inlined = lVar2;
        this.$data5FontSize$inlined = j11;
        this.$glyphFontFamily$inlined = lVar3;
        this.$glyphCup$inlined = str;
    }

    public final void invoke(b bVar, int i11, a aVar, int i12) {
        int i13;
        long t11;
        long t12;
        if ((i12 & 14) == 0) {
            i13 = i12 | (aVar.K(bVar) ? 4 : 2);
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= aVar.c(i11) ? 32 : 16;
        }
        if ((i13 & 731) == 146 && aVar.h()) {
            aVar.C();
            return;
        }
        LeaderboardEntry leaderboardEntry = (LeaderboardEntry) this.$items.get(i11);
        aVar.s(1412082922);
        a1[] a1VarArr = new a1[2];
        x b10 = f.b();
        if (this.$userId$inlined == leaderboardEntry.getUserid()) {
            t11 = ((i1) y1.c(aVar, 1412083048)).J();
        } else {
            aVar.s(1412083083);
            t11 = ((f0) aVar.D(f.b())).t();
        }
        aVar.J();
        a1VarArr[0] = b10.c(f0.j(t11));
        x c11 = f.c();
        if (this.$userId$inlined == leaderboardEntry.getUserid()) {
            t12 = ((i1) y1.c(aVar, 1412083194)).J();
        } else {
            aVar.s(1412083231);
            t12 = ((f0) aVar.D(f.c())).t();
        }
        aVar.J();
        a1VarArr[1] = c11.c(f0.j(t12));
        j.b(a1VarArr, s1.b.b(aVar, 304182693, new LeaderboardWeekPageKt$LeaderboardWeek$1$1$1(i11, this.$list$inlined, leaderboardEntry, this.$userId$inlined, this.$onLongClick$inlined, this.$onClick$inlined, this.$data5FontSize$inlined, this.$glyphFontFamily$inlined, this.$glyphCup$inlined)), aVar, 56);
        aVar.J();
    }

    @Override // ym0.r
    public /* bridge */ /* synthetic */ y invoke(b bVar, Integer num, a aVar, Integer num2) {
        invoke(bVar, num.intValue(), aVar, num2.intValue());
        return y.f85009a;
    }
}
