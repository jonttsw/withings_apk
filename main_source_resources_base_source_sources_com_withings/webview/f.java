package com.withings.webview;

import android.view.View;
import retrofit.RetrofitError;
import vh.p;
/* compiled from: WebFragment.java */
/* loaded from: classes4.dex */
final class f implements p {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WebFragment f46925a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(WebFragment webFragment) {
        this.f46925a = webFragment;
    }

    @Override // vh.p
    public final void onError(Exception exc) {
        View view;
        if ((exc instanceof RetrofitError) && ((RetrofitError) exc).getKind() == RetrofitError.Kind.NETWORK) {
            WebFragment webFragment = this.f46925a;
            view = webFragment.f46877e;
            view.setVisibility(0);
            webFragment.f46876d.setVisibility(4);
        }
    }
}
