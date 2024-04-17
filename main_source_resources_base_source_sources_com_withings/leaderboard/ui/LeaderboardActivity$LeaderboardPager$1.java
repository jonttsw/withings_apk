package com.withings.leaderboard.ui;

import android.content.Context;
import androidx.compose.material.v;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import androidx.lifecycle.n1;
import com.google.protobuf.t;
import com.withings.leaderboard.repositories.data.LeaderboardEntry;
import i6.a;
import j6.b;
import k1.d;
import k1.j1;
import k1.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import l0.q;
import nm0.y;
import org.joda.time.DateTime;
import u0.d0;
import ym0.l;
import ym0.p;
import ym0.r;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LeaderboardActivity.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lu0/d0;", "", "page", "Lnm0/y;", "invoke", "(Lu0/d0;ILandroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LeaderboardActivity$LeaderboardPager$1 extends w implements r<d0, Integer, a, Integer, y> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ym0.a<y> $onInviteClicked;
    final /* synthetic */ l<LeaderboardEntry, y> $onLongClick;
    final /* synthetic */ LeaderboardActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LeaderboardActivity$LeaderboardPager$1(LeaderboardActivity leaderboardActivity, ym0.a<y> aVar, l<? super LeaderboardEntry, y> lVar, Context context) {
        super(4);
        this.this$0 = leaderboardActivity;
        this.$onInviteClicked = aVar;
        this.$onLongClick = lVar;
        this.$context = context;
    }

    public final void invoke(d0 HorizontalPager, final int i11, a aVar, int i12) {
        i6.a aVar2;
        long userId;
        u.j(HorizontalPager, "$this$HorizontalPager");
        final LeaderboardActivity leaderboardActivity = this.this$0;
        ym0.a<y> aVar3 = this.$onInviteClicked;
        l<LeaderboardEntry, y> lVar = this.$onLongClick;
        Context context = this.$context;
        aVar.s(-483455358);
        e.a aVar4 = e.f8927a;
        l0 a11 = v.a(androidx.compose.foundation.layout.e.h(), aVar, -1323940314);
        int G = aVar.G();
        v0 l5 = aVar.l();
        g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(aVar4);
        if (aVar.i() instanceof d) {
            aVar.A();
            if (aVar.e()) {
                aVar.F(a12);
            } else {
                aVar.m();
            }
            p c12 = t.c(aVar, a11, aVar, l5);
            if (aVar.e() || !u.e(aVar.t(), Integer.valueOf(G))) {
                q.a(G, aVar, G, c12);
            }
            l0.r.c(0, c11, j1.a(aVar), aVar, 2058660585);
            com.withings.common.compose.component.v0.b(0.0f, aVar, 0, 1);
            String valueOf = String.valueOf(i11);
            k1.b bVar = new k1.b() { // from class: com.withings.leaderboard.ui.LeaderboardActivity$LeaderboardPager$1$1$1
                @Override // androidx.lifecycle.k1.b
                public /* bridge */ /* synthetic */ g1 create(Class cls, i6.a aVar5) {
                    return super.create(cls, aVar5);
                }

                @Override // androidx.lifecycle.k1.b
                public <T extends g1> T create(Class<T> modelClass) {
                    u.j(modelClass, "modelClass");
                    LeaderboardWeekViewModelFactory viewModelFactory = LeaderboardActivity.this.getViewModelFactory();
                    DateTime now = DateTime.now();
                    u.i(now, "now(...)");
                    String abstractDateTime = hn.a.s(now).minusWeeks(i11).toString("yyyy-MM-dd");
                    u.i(abstractDateTime, "toString(...)");
                    LeaderboardWeekViewModel create = viewModelFactory.create(abstractDateTime);
                    u.h(create, "null cannot be cast to non-null type T of com.withings.leaderboard.ui.LeaderboardActivity.LeaderboardPager.<no name provided>.invoke$lambda$0.<no name provided>.create");
                    return create;
                }
            };
            aVar.s(1729797275);
            n1 a13 = j6.a.a(aVar);
            if (a13 != null) {
                if (a13 instanceof androidx.lifecycle.u) {
                    aVar2 = ((androidx.lifecycle.u) a13).getDefaultViewModelCreationExtras();
                } else {
                    aVar2 = a.C1058a.f71431b;
                }
                g1 a14 = b.a(LeaderboardWeekViewModel.class, a13, valueOf, bVar, aVar2, aVar);
                aVar.J();
                LeaderboardWeekViewModel leaderboardWeekViewModel = (LeaderboardWeekViewModel) a14;
                userId = leaderboardActivity.getUserId();
                LeaderboardWeekPageKt.LeaderboardWeekPage(userId, leaderboardWeekViewModel, aVar3, new LeaderboardActivity$LeaderboardPager$1$1$2(leaderboardActivity, context), lVar, aVar, 64);
                d.j(aVar);
                return;
            }
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        a3.g.s();
        throw null;
    }

    @Override // ym0.r
    public /* bridge */ /* synthetic */ y invoke(d0 d0Var, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        invoke(d0Var, num.intValue(), aVar, num2.intValue());
        return y.f85009a;
    }
}
