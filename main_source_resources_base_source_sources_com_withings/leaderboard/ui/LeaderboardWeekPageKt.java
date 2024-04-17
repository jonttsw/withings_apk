package com.withings.leaderboard.ui;

import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.f5;
import androidx.compose.material.r3;
import androidx.compose.material3.g9;
import androidx.compose.runtime.b;
import androidx.compose.runtime.v;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import com.withings.common.compose.component.l;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.leaderboard.repositories.data.LeaderboardEntry;
import com.withings.leaderboard.ui.UiState;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import dq.x;
import java.util.List;
import k1.j1;
import k1.o1;
import k1.p1;
import k1.r0;
import k1.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.Flow;
import nk.a0;
import nm0.y;
import r0.d0;
import r0.h0;
import r0.t0;
import x1.b;
import x1.d;
import yk.h;
import yk.o;
import ym0.a;
import ym0.p;
/* compiled from: LeaderboardWeekPage.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u000f\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0011\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002"}, d2 = {"", NavigationArguments.USER_ID, "Lcom/withings/leaderboard/ui/LeaderboardWeekViewModel;", "viewModel", "Lkotlin/Function0;", "Lnm0/y;", "onInviteClicked", "Lkotlin/Function1;", "Lcom/withings/leaderboard/repositories/data/LeaderboardEntry;", "onClick", "onLongClick", "LeaderboardWeekPage", "(JLcom/withings/leaderboard/ui/LeaderboardWeekViewModel;Lym0/a;Lym0/l;Lym0/l;Landroidx/compose/runtime/a;I)V", "", "list", "LeaderboardWeek", "(Ljava/util/List;JLym0/l;Lym0/l;Landroidx/compose/runtime/a;I)V", "EmptyScreen", "(Lym0/a;Landroidx/compose/runtime/a;I)V", "Lcom/withings/leaderboard/ui/UiState;", "state", "leaderboard_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LeaderboardWeekPageKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void EmptyScreen(a<y> aVar, androidx.compose.runtime.a aVar2, int i11) {
        int i12;
        int i13;
        b g11 = aVar2.g(1103055722);
        if ((i11 & 14) == 0) {
            if (g11.w(aVar)) {
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
            e.a aVar3 = e.f8927a;
            e h11 = x0.h(e1.d(aVar3), h.r(), 0.0f, 2);
            e.b b10 = androidx.compose.foundation.layout.e.b();
            d.a g12 = b.a.g();
            g11.s(-483455358);
            l0 a11 = n.a(b10, g12, g11);
            g11.s(-1323940314);
            int G = g11.G();
            v0 l5 = g11.l();
            g.D.getClass();
            a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(h11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a12);
                } else {
                    g11.m();
                }
                p b11 = com.withings.authentication.e.b(g11, a11, g11, l5);
                if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
                }
                x.b(0, c11, j1.a(g11), g11, 2058660585);
                a0.f(0, 0, 29, 0L, g11, null, null, ay.b.u(C1987R.string._LEADERBOARD_EMPTY_STATE_TITLE_, g11));
                d0.a(e1.f(aVar3, h.c()), g11);
                nk.a.d(null, ay.b.u(C1987R.string._LEADERBOARD_EMPTY_STATE_DESCRIPTION_, g11), 0L, null, 0, 0, null, g11, 0, 125);
                d0.a(e1.f(aVar3, h.q()), g11);
                l.a(null, ay.b.u(C1987R.string._LEADERBOARD_EMPTY_STATE_CTA_, g11), null, false, null, null, false, aVar, g11, (i12 << 21) & 29360128, 125);
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new LeaderboardWeekPageKt$EmptyScreen$2(aVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LeaderboardWeek(List<LeaderboardEntry> list, long j5, ym0.l<? super LeaderboardEntry, y> lVar, ym0.l<? super LeaderboardEntry, y> lVar2, androidx.compose.runtime.a aVar, int i11) {
        p1 p1Var;
        p1 p1Var2;
        androidx.compose.runtime.b g11 = aVar.g(-1039124986);
        g11.s(-892373489);
        p1Var = o.f109338j;
        g11.J();
        long h11 = ((yk.x) g11.D(p1Var)).i().h();
        g11.s(-892373489);
        p1Var2 = o.f109338j;
        g11.J();
        y2.l g12 = ((yk.x) g11.D(p1Var2)).p().g();
        String u11 = ay.b.u(C1987R.string.glyph_cup, g11);
        androidx.compose.ui.e d11 = e1.d(androidx.compose.ui.e.f8927a);
        int i12 = h0.f94240a;
        s0.a.a(d11, null, r0.l0.d(t0.a(g11), g11), false, null, null, null, false, new LeaderboardWeekPageKt$LeaderboardWeek$1(list, j5, lVar2, lVar, h11, g12, u11), g11, 6, 250);
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new LeaderboardWeekPageKt$LeaderboardWeek$2(list, j5, lVar, lVar2, i11));
        }
    }

    public static final void LeaderboardWeekPage(long j5, LeaderboardWeekViewModel viewModel, a<y> onInviteClicked, ym0.l<? super LeaderboardEntry, y> onClick, ym0.l<? super LeaderboardEntry, y> onLongClick, androidx.compose.runtime.a aVar, int i11) {
        u.j(viewModel, "viewModel");
        u.j(onInviteClicked, "onInviteClicked");
        u.j(onClick, "onClick");
        u.j(onLongClick, "onLongClick");
        androidx.compose.runtime.b g11 = aVar.g(256939250);
        Flow<UiState> uiState$leaderboard_release = viewModel.getUiState$leaderboard_release();
        UiState.Loading loading = UiState.Loading.INSTANCE;
        r0 a11 = androidx.compose.runtime.l0.a(uiState$leaderboard_release, loading, null, g11, 2);
        UiState LeaderboardWeekPage$lambda$0 = LeaderboardWeekPage$lambda$0(a11);
        if (u.e(LeaderboardWeekPage$lambda$0, UiState.Empty.INSTANCE)) {
            g11.s(-2089991935);
            EmptyScreen(onInviteClicked, g11, (i11 >> 6) & 14);
            g11.J();
        } else if (LeaderboardWeekPage$lambda$0 instanceof UiState.Leaderboard) {
            g11.s(-2089991872);
            UiState LeaderboardWeekPage$lambda$02 = LeaderboardWeekPage$lambda$0(a11);
            u.h(LeaderboardWeekPage$lambda$02, "null cannot be cast to non-null type com.withings.leaderboard.ui.UiState.Leaderboard");
            int i12 = i11 >> 3;
            LeaderboardWeek(((UiState.Leaderboard) LeaderboardWeekPage$lambda$02).getList(), j5, onClick, onLongClick, g11, ((i11 << 3) & 112) | 8 | (i12 & ConstantsWs.HWFAILURE_ZERO) | (i12 & 7168));
            g11.J();
        } else if (u.e(LeaderboardWeekPage$lambda$0, loading)) {
            g11.s(-2089991762);
            androidx.compose.ui.e d11 = e1.d(androidx.compose.ui.e.f8927a);
            l0 a12 = r3.a(g11, 733328855, false, g11, -1323940314);
            int G = g11.G();
            v0 l5 = g11.l();
            g.D.getClass();
            a a13 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(d11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a13);
                } else {
                    g11.m();
                }
                p b10 = com.withings.authentication.e.b(g11, a12, g11, l5);
                if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
                }
                x.b(0, c11, j1.a(g11), g11, 2058660585);
                f5.b(0.0f, 0, 0, 31, 0L, 0L, g11, null);
                androidx.camera.camera2.internal.l0.e(g11);
            } else {
                a3.g.s();
                throw null;
            }
        } else {
            g11.s(-2089991629);
            g11.J();
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new LeaderboardWeekPageKt$LeaderboardWeekPage$2(j5, viewModel, onInviteClicked, onClick, onLongClick, i11));
        }
    }

    private static final UiState LeaderboardWeekPage$lambda$0(o1<? extends UiState> o1Var) {
        return o1Var.getValue();
    }
}
