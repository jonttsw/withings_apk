package com.withings.leaderboard.ui.screen;

import android.content.Context;
import androidx.compose.foundation.layout.x0;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.v;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.u0;
import bk.m;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.withings.common.compose.component.u1;
import com.withings.common.compose.component.w1;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import yk.h;
import yk.o;
/* compiled from: LeaderboardItem.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001aM\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u000e\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0012\u001a\u00020\u000b2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0014\u001a\u00020\u000b2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "", "title", "bodyText", "", FirebaseAnalytics.Param.SCORE, "position", "", "Lcom/withings/leaderboard/ui/screen/LeaderBoardUiEntry;", "leaderboardEntries", "Lnm0/y;", "LeaderBoardItem", "(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Landroidx/compose/runtime/a;II)V", "HorizontalBars", "(Ljava/util/List;Landroidx/compose/runtime/a;I)V", "", "darkMode", "PreviewFirstLeaderBoardItem", "(ZLandroidx/compose/runtime/a;I)V", "PreviewNoLeaderBoardItem", "leaderboard_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LeaderboardItemKt {
    public static final void HorizontalBars(List<LeaderBoardUiEntry> leaderboardEntries, a aVar, int i11) {
        int i12;
        u.j(leaderboardEntries, "leaderboardEntries");
        b g11 = aVar.g(-423081909);
        if (leaderboardEntries.isEmpty()) {
            v o02 = g11.o0();
            if (o02 != null) {
                o02.G(new LeaderboardItemKt$HorizontalBars$1(leaderboardEntries, i11));
                return;
            }
            return;
        }
        List<LeaderBoardUiEntry> list = leaderboardEntries;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            int score = ((LeaderBoardUiEntry) it.next()).getScore();
            while (it.hasNext()) {
                int score2 = ((LeaderBoardUiEntry) it.next()).getScore();
                if (score < score2) {
                    score = score2;
                }
            }
            g11.s(82180773);
            ArrayList arrayList = new ArrayList(x.y(list, 10));
            for (LeaderBoardUiEntry leaderBoardUiEntry : list) {
                if (leaderBoardUiEntry.isMainUser()) {
                    i12 = C1987R.color.datavizMonochromaticNeutral3;
                } else {
                    i12 = C1987R.color.datavizMonochromaticGhost2;
                }
                arrayList.add(new u1(leaderBoardUiEntry.getName(), String.valueOf(leaderBoardUiEntry.getScore()), null, leaderBoardUiEntry.getScore() / score, androidx.core.content.a.getColor((Context) g11.D(u0.d()), i12), null, leaderBoardUiEntry.getImgUrl(), 36));
            }
            g11.J();
            w1.e(64, 1, g11, null, arrayList);
            v o03 = g11.o0();
            if (o03 != null) {
                o03.G(new LeaderboardItemKt$HorizontalBars$2(leaderboardEntries, i11));
                return;
            }
            return;
        }
        throw new NoSuchElementException();
    }

    public static final void LeaderBoardItem(e eVar, String title, String str, Integer num, String position, List<LeaderBoardUiEntry> leaderboardEntries, a aVar, int i11, int i12) {
        e eVar2;
        String str2;
        u.j(title, "title");
        u.j(position, "position");
        u.j(leaderboardEntries, "leaderboardEntries");
        b g11 = aVar.g(-526411132);
        if ((i12 & 1) != 0) {
            eVar2 = e.f8927a;
        } else {
            eVar2 = eVar;
        }
        if ((i12 & 4) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        m.c(str2, title, x0.h(eVar2, h.o(), 0.0f, 2), false, false, null, s1.b.b(g11, 1651014001, new LeaderboardItemKt$LeaderBoardItem$1(num, leaderboardEntries, position)), g11, ((i11 >> 6) & 14) | 1572864 | (i11 & 112), 56);
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new LeaderboardItemKt$LeaderBoardItem$2(eVar2, title, str2, num, position, leaderboardEntries, i11, i12));
        }
    }

    public static final void PreviewFirstLeaderBoardItem(boolean z5, a aVar, int i11) {
        int i12;
        int i13;
        b g11 = aVar.g(607835377);
        if ((i11 & 14) == 0) {
            if (g11.a(z5)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && g11.h()) {
            g11.C();
        } else {
            o.b(z5, ComposableSingletons$LeaderboardItemKt.INSTANCE.m26getLambda1$leaderboard_release(), g11, (i12 & 14) | 48, 0);
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new LeaderboardItemKt$PreviewFirstLeaderBoardItem$1(z5, i11));
        }
    }

    public static final void PreviewNoLeaderBoardItem(boolean z5, a aVar, int i11) {
        int i12;
        int i13;
        b g11 = aVar.g(-673141108);
        if ((i11 & 14) == 0) {
            if (g11.a(z5)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && g11.h()) {
            g11.C();
        } else {
            o.b(z5, ComposableSingletons$LeaderboardItemKt.INSTANCE.m27getLambda2$leaderboard_release(), g11, (i12 & 14) | 48, 0);
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new LeaderboardItemKt$PreviewNoLeaderBoardItem$1(z5, i11));
        }
    }
}
