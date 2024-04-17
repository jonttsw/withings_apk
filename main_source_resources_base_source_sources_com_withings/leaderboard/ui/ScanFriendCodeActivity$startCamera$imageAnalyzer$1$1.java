package com.withings.leaderboard.ui;

import android.widget.ProgressBar;
import com.withings.leaderboard.databinding.ActivityLeaderboardScanCodeBinding;
import com.withings.leaderboard.ui.ScanFriendCodeActivity;
import com.withings.leaderboard.utils.QRCodeAnalyzer;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScanFriendCodeActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withings/leaderboard/utils/QRCodeAnalyzer$QRCodeValue;", "qrCodeValue", "Lnm0/y;", "invoke", "(Lcom/withings/leaderboard/utils/QRCodeAnalyzer$QRCodeValue;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ScanFriendCodeActivity$startCamera$imageAnalyzer$1$1 extends w implements l<QRCodeAnalyzer.QRCodeValue, y> {
    final /* synthetic */ ScanFriendCodeActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanFriendCodeActivity$startCamera$imageAnalyzer$1$1(ScanFriendCodeActivity scanFriendCodeActivity) {
        super(1);
        this.this$0 = scanFriendCodeActivity;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(QRCodeAnalyzer.QRCodeValue qRCodeValue) {
        invoke2(qRCodeValue);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(QRCodeAnalyzer.QRCodeValue qrCodeValue) {
        ActivityLeaderboardScanCodeBinding activityLeaderboardScanCodeBinding;
        ScanFriendCodeActivity.ScanFriendCodeViewModel viewModel;
        u.j(qrCodeValue, "qrCodeValue");
        activityLeaderboardScanCodeBinding = this.this$0.binding;
        if (activityLeaderboardScanCodeBinding != null) {
            ProgressBar progress = activityLeaderboardScanCodeBinding.progress;
            u.i(progress, "progress");
            progress.setVisibility(0);
            viewModel = this.this$0.getViewModel();
            viewModel.makeFriends(qrCodeValue.getUserName(), qrCodeValue.getFriendHash());
            return;
        }
        u.s("binding");
        throw null;
    }
}
