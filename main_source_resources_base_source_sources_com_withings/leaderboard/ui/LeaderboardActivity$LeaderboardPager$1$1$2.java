package com.withings.leaderboard.ui;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.o;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.leaderboard.repositories.data.LeaderboardEntry;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: LeaderboardActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withings/leaderboard/repositories/data/LeaderboardEntry;", "it", "Lnm0/y;", "invoke", "(Lcom/withings/leaderboard/repositories/data/LeaderboardEntry;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class LeaderboardActivity$LeaderboardPager$1$1$2 extends w implements l<LeaderboardEntry, y> {
    final /* synthetic */ Context $context;
    final /* synthetic */ LeaderboardActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardActivity$LeaderboardPager$1$1$2(LeaderboardActivity leaderboardActivity, Context context) {
        super(1);
        this.this$0 = leaderboardActivity;
        this.$context = context;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(LeaderboardEntry leaderboardEntry) {
        invoke2(leaderboardEntry);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LeaderboardEntry it) {
        u.j(it, "it");
        LeaderboardActivity leaderboardActivity = this.this$0;
        Context context = this.$context;
        Intent putExtra = o.b(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(context.getPackageName(), "com.withings.wiscale2.chat.ui.ChatActivity").putExtra("key_friend_id", it.getUserid());
        u.i(putExtra, "putExtra(...)");
        leaderboardActivity.startActivity(putExtra);
    }
}
