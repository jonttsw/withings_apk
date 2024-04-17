package com.withings.leaderboard.ui;

import androidx.compose.runtime.a;
import ay.b;
import com.withings.common.compose.component.c5;
import com.withings.wiscale2.C1987R;
import d2.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LeaderboardActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LeaderboardActivity$ScreenContent$1$1$1 extends w implements p<a, Integer, y> {
    final /* synthetic */ ym0.a<y> $onInviteClicked;
    final /* synthetic */ LeaderboardActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LeaderboardActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.leaderboard.ui.LeaderboardActivity$ScreenContent$1$1$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends w implements ym0.a<y> {
        final /* synthetic */ LeaderboardActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LeaderboardActivity leaderboardActivity) {
            super(0);
            this.this$0 = leaderboardActivity;
        }

        @Override // ym0.a
        public /* bridge */ /* synthetic */ y invoke() {
            invoke2();
            return y.f85009a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardActivity$ScreenContent$1$1$1(ym0.a<y> aVar, LeaderboardActivity leaderboardActivity) {
        super(2);
        this.$onInviteClicked = aVar;
        this.this$0 = leaderboardActivity;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(a aVar, int i11) {
        long j5;
        if ((i11 & 11) != 2 || !aVar.h()) {
            j5 = f0.f63265i;
            c5.a(j5, 0L, b.u(C1987R.string._LEADERBOARD_, aVar), false, null, null, null, this.$onInviteClicked, false, new AnonymousClass1(this.this$0), aVar, 6, 378);
            return;
        }
        aVar.C();
    }
}
