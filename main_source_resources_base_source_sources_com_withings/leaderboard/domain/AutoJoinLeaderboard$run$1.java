package com.withings.leaderboard.domain;

import com.withings.leaderboard.repositories.data.LeaderboardProgramPrefs;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.k;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetLeaderboard.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.leaderboard.domain.AutoJoinLeaderboard$run$1", f = "GetLeaderboard.kt", l = {61}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AutoJoinLeaderboard$run$1 extends i implements p<CoroutineScope, d<? super y>, Object> {
    int label;
    final /* synthetic */ AutoJoinLeaderboard this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoJoinLeaderboard$run$1(AutoJoinLeaderboard autoJoinLeaderboard, d<? super AutoJoinLeaderboard$run$1> dVar) {
        super(2, dVar);
        this.this$0 = autoJoinLeaderboard;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new AutoJoinLeaderboard$run$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        LeaderboardProgramPrefs leaderboardProgramPrefs;
        LeaderboardProgramPrefs leaderboardProgramPrefs2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                leaderboardProgramPrefs2 = this.this$0.getLeaderboardProgramPrefs();
                this.label = 1;
                obj = leaderboardProgramPrefs2.isLeaderboardActivate(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            a11 = Boolean.valueOf(!((Boolean) obj).booleanValue());
        } catch (Throwable th2) {
            a11 = l.a(th2);
        }
        AutoJoinLeaderboard autoJoinLeaderboard = this.this$0;
        if ((!(a11 instanceof k.a)) && ((Boolean) a11).booleanValue()) {
            leaderboardProgramPrefs = autoJoinLeaderboard.getLeaderboardProgramPrefs();
            leaderboardProgramPrefs.joinLeaderboard();
        }
        return y.f85009a;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((AutoJoinLeaderboard$run$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
