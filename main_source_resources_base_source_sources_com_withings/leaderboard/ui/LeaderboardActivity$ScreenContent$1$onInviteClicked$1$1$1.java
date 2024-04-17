package com.withings.leaderboard.ui;

import androidx.compose.material.c5;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: LeaderboardActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.leaderboard.ui.LeaderboardActivity$ScreenContent$1$onInviteClicked$1$1$1", f = "LeaderboardActivity.kt", l = {ConstantsWs.MEASURE_TYPE_PH}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class LeaderboardActivity$ScreenContent$1$onInviteClicked$1$1$1 extends i implements p<CoroutineScope, d<? super y>, Object> {
    final /* synthetic */ c5 $modalBottomSheetState;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardActivity$ScreenContent$1$onInviteClicked$1$1$1(c5 c5Var, d<? super LeaderboardActivity$ScreenContent$1$onInviteClicked$1$1$1> dVar) {
        super(2, dVar);
        this.$modalBottomSheetState = c5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new LeaderboardActivity$ScreenContent$1$onInviteClicked$1$1$1(this.$modalBottomSheetState, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            c5 c5Var = this.$modalBottomSheetState;
            this.label = 1;
            if (c5Var.l(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((LeaderboardActivity$ScreenContent$1$onInviteClicked$1$1$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
