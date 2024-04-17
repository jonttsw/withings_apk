package com.withings.leaderboard.ui;

import android.widget.Toast;
import androidx.compose.material.c5;
import com.withings.leaderboard.repositories.data.SharePublicKey;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import nm0.y;
import ym0.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LeaderboardActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LeaderboardActivity$ScreenContent$1$onInviteClicked$1 extends w implements a<y> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ c5 $modalBottomSheetState;
    final /* synthetic */ SharePublicKey $sharedPublicKey;
    final /* synthetic */ LeaderboardActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardActivity$ScreenContent$1$onInviteClicked$1(SharePublicKey sharePublicKey, LeaderboardActivity leaderboardActivity, CoroutineScope coroutineScope, c5 c5Var) {
        super(0);
        this.$sharedPublicKey = sharePublicKey;
        this.this$0 = leaderboardActivity;
        this.$coroutineScope = coroutineScope;
        this.$modalBottomSheetState = c5Var;
    }

    @Override // ym0.a
    public /* bridge */ /* synthetic */ y invoke() {
        invoke2();
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Job launch$default;
        if (this.$sharedPublicKey != null) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.$coroutineScope, null, null, new LeaderboardActivity$ScreenContent$1$onInviteClicked$1$1$1(this.$modalBottomSheetState, null), 3, null);
            if (launch$default != null) {
                return;
            }
        }
        LeaderboardActivity leaderboardActivity = this.this$0;
        Toast.makeText(leaderboardActivity, leaderboardActivity.getString(C1987R.string._HOME_NO_INTERNET_FOR_MODE_MESSAGE_), 0).show();
        y yVar = y.f85009a;
    }
}
