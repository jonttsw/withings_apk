package com.withings.leaderboard.ui;

import androidx.compose.material.c5;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.a;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LeaderboardActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LeaderboardActivity$BottomSheetContent$1$1 extends w implements a<y> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ c5 $modalBottomSheetState;
    final /* synthetic */ LeaderboardActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LeaderboardActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @e(c = "com.withings.leaderboard.ui.LeaderboardActivity$BottomSheetContent$1$1$1", f = "LeaderboardActivity.kt", l = {ConstantsWs.WS_STATUS_NOPRIMARYUSER}, m = "invokeSuspend")
    /* renamed from: com.withings.leaderboard.ui.LeaderboardActivity$BottomSheetContent$1$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends i implements p<CoroutineScope, d<? super y>, Object> {
        final /* synthetic */ c5 $modalBottomSheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(c5 c5Var, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$modalBottomSheetState = c5Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$modalBottomSheetState, dVar);
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
                if (c5Var.h(this) == coroutineSingletons) {
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
    public LeaderboardActivity$BottomSheetContent$1$1(CoroutineScope coroutineScope, LeaderboardActivity leaderboardActivity, c5 c5Var) {
        super(0);
        this.$coroutineScope = coroutineScope;
        this.this$0 = leaderboardActivity;
        this.$modalBottomSheetState = c5Var;
    }

    @Override // ym0.a
    public /* bridge */ /* synthetic */ y invoke() {
        invoke2();
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        BuildersKt__Builders_commonKt.launch$default(this.$coroutineScope, null, null, new AnonymousClass1(this.$modalBottomSheetState, null), 3, null);
        LeaderboardActivity leaderboardActivity = this.this$0;
        leaderboardActivity.startActivityForResult(ScanFriendCodeActivity.Companion.createIntent(leaderboardActivity), 1234);
    }
}
