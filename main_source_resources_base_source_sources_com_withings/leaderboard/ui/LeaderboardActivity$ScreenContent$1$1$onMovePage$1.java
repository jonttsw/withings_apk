package com.withings.leaderboard.ui;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import m0.k;
import nm0.y;
import qm0.d;
import u0.i0;
import ym0.l;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LeaderboardActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newPage", "Lnm0/y;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LeaderboardActivity$ScreenContent$1$1$onMovePage$1 extends w implements l<Integer, y> {
    final /* synthetic */ i0 $contentPagerState;
    final /* synthetic */ CoroutineScope $coroutineScope;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LeaderboardActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @e(c = "com.withings.leaderboard.ui.LeaderboardActivity$ScreenContent$1$1$onMovePage$1$1", f = "LeaderboardActivity.kt", l = {ConstantsWs.MEASURE_TYPE_VASISTAS_TYPE_WALKING_ASYMETRY}, m = "invokeSuspend")
    /* renamed from: com.withings.leaderboard.ui.LeaderboardActivity$ScreenContent$1$1$onMovePage$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends i implements p<CoroutineScope, d<? super y>, Object> {
        final /* synthetic */ i0 $contentPagerState;
        final /* synthetic */ int $newPage;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(i0 i0Var, int i11, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$contentPagerState = i0Var;
            this.$newPage = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$contentPagerState, this.$newPage, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object m11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                i0 i0Var = this.$contentPagerState;
                int i12 = this.$newPage;
                this.label = 1;
                m11 = i0Var.m(i12, 0.0f, k.c(0.0f, 0.0f, null, 7), this);
                if (m11 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardActivity$ScreenContent$1$1$onMovePage$1(CoroutineScope coroutineScope, i0 i0Var) {
        super(1);
        this.$coroutineScope = coroutineScope;
        this.$contentPagerState = i0Var;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(Integer num) {
        invoke(num.intValue());
        return y.f85009a;
    }

    public final void invoke(int i11) {
        BuildersKt__Builders_commonKt.launch$default(this.$coroutineScope, null, null, new AnonymousClass1(this.$contentPagerState, i11, null), 3, null);
    }
}
