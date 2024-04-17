package com.withings.wiscale2;

import android.app.ProgressDialog;
import android.widget.Toast;
import com.withings.webservices.legacy.WsFailer;
import java.util.Arrays;
/* compiled from: MainActivity.kt */
/* loaded from: classes4.dex */
public final class g2 extends WsFailer.ActionCallback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ProgressDialog f56127a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainActivity f56128b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g2(ProgressDialog progressDialog, MainActivity mainActivity) {
        this.f56127a = progressDialog;
        this.f56128b = mainActivity;
    }

    @Override // com.withings.webservices.legacy.WsFailer.ActionCallback, vh.p
    public final void onError(Exception exception) {
        kotlin.jvm.internal.u.j(exception, "exception");
        super.onError(exception);
        this.f56127a.dismiss();
        MainActivity mainActivity = this.f56128b;
        Toast.makeText(mainActivity, String.format("%s\n%s", Arrays.copyOf(new Object[]{mainActivity.getString(C1987R.string._FORGOT_PASSWORD_ERROR_TITLE_), mainActivity.getString(C1987R.string._FORGOT_PASSWORD_ERROR_MESSAGE_)}, 2)), 1).show();
    }

    @Override // com.withings.webservices.legacy.WsFailer.ActionCallback, vh.a.b
    public final void onResult() {
        this.f56127a.dismiss();
        MainActivity mainActivity = this.f56128b;
        Toast.makeText(mainActivity, String.format("%s\n%s", Arrays.copyOf(new Object[]{mainActivity.getString(C1987R.string._FORGOT_PASSWORD_SUCCESS_TITLE_), mainActivity.getString(C1987R.string._FORGOT_PASSWORD_SUCCESS_MESSAGE_)}, 2)), 1).show();
    }
}
