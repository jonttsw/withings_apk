package com.withings.leaderboard.ui;

import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.camera.view.PreviewView;
import com.withings.leaderboard.databinding.ActivityLeaderboardScanCodeBinding;
import com.withings.wiscale2.C1987R;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: ScanFriendCodeActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withings/leaderboard/ui/BecomeFriendsResult;", "it", "Lnm0/y;", "invoke", "(Lcom/withings/leaderboard/ui/BecomeFriendsResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class ScanFriendCodeActivity$onCreate$1$1 extends w implements l<BecomeFriendsResult, y> {
    final /* synthetic */ ScanFriendCodeActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanFriendCodeActivity$onCreate$1$1(ScanFriendCodeActivity scanFriendCodeActivity) {
        super(1);
        this.this$0 = scanFriendCodeActivity;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(BecomeFriendsResult becomeFriendsResult) {
        invoke2(becomeFriendsResult);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(BecomeFriendsResult becomeFriendsResult) {
        ActivityLeaderboardScanCodeBinding activityLeaderboardScanCodeBinding;
        ActivityLeaderboardScanCodeBinding activityLeaderboardScanCodeBinding2;
        ActivityLeaderboardScanCodeBinding activityLeaderboardScanCodeBinding3;
        ActivityLeaderboardScanCodeBinding activityLeaderboardScanCodeBinding4;
        ActivityLeaderboardScanCodeBinding activityLeaderboardScanCodeBinding5;
        ActivityLeaderboardScanCodeBinding activityLeaderboardScanCodeBinding6;
        if (becomeFriendsResult != null) {
            ScanFriendCodeActivity scanFriendCodeActivity = this.this$0;
            if (becomeFriendsResult instanceof Loading) {
                activityLeaderboardScanCodeBinding6 = scanFriendCodeActivity.binding;
                if (activityLeaderboardScanCodeBinding6 != null) {
                    ProgressBar progress = activityLeaderboardScanCodeBinding6.progress;
                    u.i(progress, "progress");
                    progress.setVisibility(0);
                    return;
                }
                u.s("binding");
                throw null;
            } else if (becomeFriendsResult instanceof BecomeFriendsSuccess) {
                activityLeaderboardScanCodeBinding2 = scanFriendCodeActivity.binding;
                if (activityLeaderboardScanCodeBinding2 != null) {
                    ProgressBar progress2 = activityLeaderboardScanCodeBinding2.progress;
                    u.i(progress2, "progress");
                    progress2.setVisibility(8);
                    activityLeaderboardScanCodeBinding3 = scanFriendCodeActivity.binding;
                    if (activityLeaderboardScanCodeBinding3 != null) {
                        PreviewView preview = activityLeaderboardScanCodeBinding3.preview;
                        u.i(preview, "preview");
                        preview.setVisibility(8);
                        activityLeaderboardScanCodeBinding4 = scanFriendCodeActivity.binding;
                        if (activityLeaderboardScanCodeBinding4 != null) {
                            TextView scannerText = activityLeaderboardScanCodeBinding4.scannerText;
                            u.i(scannerText, "scannerText");
                            scannerText.setVisibility(8);
                            activityLeaderboardScanCodeBinding5 = scanFriendCodeActivity.binding;
                            if (activityLeaderboardScanCodeBinding5 != null) {
                                TextView textView = activityLeaderboardScanCodeBinding5.successText;
                                u.g(textView);
                                textView.setVisibility(0);
                                String string = scanFriendCodeActivity.getString(C1987R.string.friendRequest_requestSuccess);
                                u.i(string, "getString(...)");
                                textView.setText(String.format(string, Arrays.copyOf(new Object[]{((BecomeFriendsSuccess) becomeFriendsResult).getUserName()}, 1)));
                                return;
                            }
                            u.s("binding");
                            throw null;
                        }
                        u.s("binding");
                        throw null;
                    }
                    u.s("binding");
                    throw null;
                }
                u.s("binding");
                throw null;
            } else if (becomeFriendsResult instanceof BecomeFriendsError) {
                activityLeaderboardScanCodeBinding = scanFriendCodeActivity.binding;
                if (activityLeaderboardScanCodeBinding != null) {
                    ProgressBar progress3 = activityLeaderboardScanCodeBinding.progress;
                    u.i(progress3, "progress");
                    progress3.setVisibility(8);
                    Toast.makeText(scanFriendCodeActivity, "Impossible friendship", 1).show();
                    scanFriendCodeActivity.finish();
                    return;
                }
                u.s("binding");
                throw null;
            }
        }
    }
}
