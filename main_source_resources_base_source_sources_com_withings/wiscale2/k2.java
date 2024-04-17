package com.withings.wiscale2;

import android.app.ProgressDialog;
import com.withings.webservices.legacy.WsFailer;
/* compiled from: MainActivity.kt */
/* loaded from: classes4.dex */
public final class k2 extends WsFailer.ActionCallback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ProgressDialog f57977a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainActivity f57978b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k2(ProgressDialog progressDialog, MainActivity mainActivity) {
        this.f57977a = progressDialog;
        this.f57978b = mainActivity;
    }

    @Override // com.withings.webservices.legacy.WsFailer.ActionCallback, vh.p
    public final void onError(Exception exception) {
        kotlin.jvm.internal.u.j(exception, "exception");
        super.onError(exception);
        this.f57977a.dismiss();
        this.f57978b.U3();
    }

    @Override // com.withings.webservices.legacy.WsFailer.ActionCallback, vh.a.b
    public final void onResult() {
        this.f57977a.dismiss();
    }
}
