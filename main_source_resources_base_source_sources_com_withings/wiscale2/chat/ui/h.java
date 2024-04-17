package com.withings.wiscale2.chat.ui;

import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.withings.common.compose.component.AvatarSize;
import com.withings.leaderboard.repositories.data.LeaderboardEntry;
import com.withings.leaderboard.ui.LeaderboardEntryImage;
import java.text.NumberFormat;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatFragment.kt */
/* loaded from: classes4.dex */
public final class h extends w implements p<LeaderboardEntry, LeaderboardEntry, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChatFragment f50398a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ChatFragment chatFragment) {
        super(2);
        this.f50398a = chatFragment;
    }

    @Override // ym0.p
    public final y invoke(LeaderboardEntry leaderboardEntry, LeaderboardEntry leaderboardEntry2) {
        LeaderboardEntry user = leaderboardEntry;
        LeaderboardEntry friend = leaderboardEntry2;
        u.j(user, "user");
        u.j(friend, "friend");
        ChatFragment chatFragment = this.f50398a;
        TextView textView = chatFragment.f50356l;
        if (textView != null) {
            textView.setText(user.getFirstname());
            TextView textView2 = chatFragment.f50355k;
            if (textView2 != null) {
                textView2.setText(friend.getFirstname());
                TextView textView3 = chatFragment.f50354j;
                if (textView3 != null) {
                    textView3.setText(NumberFormat.getInstance().format(Integer.valueOf(user.getScore())));
                    TextView textView4 = chatFragment.f50353i;
                    if (textView4 != null) {
                        textView4.setText(NumberFormat.getInstance().format(Integer.valueOf(friend.getScore())));
                        ComposeView composeView = chatFragment.f50352h;
                        if (composeView != null) {
                            AvatarSize avatarSize = AvatarSize.f33299d;
                            LeaderboardEntryImage.setImageForLeaderboardEntry$default(composeView, user, avatarSize, 0, 0, 12, null);
                            ComposeView composeView2 = chatFragment.f50351g;
                            if (composeView2 != null) {
                                LeaderboardEntryImage.setImageForLeaderboardEntry$default(composeView2, friend, avatarSize, 0, 0, 12, null);
                                return y.f85009a;
                            }
                            u.s("friendImage");
                            throw null;
                        }
                        u.s("userImage");
                        throw null;
                    }
                    u.s("friendScore");
                    throw null;
                }
                u.s("userScore");
                throw null;
            }
            u.s("friendName");
            throw null;
        }
        u.s("userName");
        throw null;
    }
}
