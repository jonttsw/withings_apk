package com.withings.webview;

import android.view.View;
import vh.a;
/* compiled from: WebFragment.java */
/* loaded from: classes4.dex */
final class g implements a.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f46926a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f46927b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ WebFragment f46928c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(WebFragment webFragment, String str, boolean z5) {
        this.f46928c = webFragment;
        this.f46926a = str;
        this.f46927b = z5;
    }

    @Override // vh.a.b
    public final void onResult() {
        View view;
        String str;
        boolean z5;
        WebFragment webFragment = this.f46928c;
        view = webFragment.f46877e;
        view.setVisibility(8);
        webFragment.getClass();
        String str2 = this.f46926a;
        if (str2.endsWith(".pdf")) {
            webFragment.getClass();
            str = "https://docs.google.com/viewer?url=" + str2;
        } else {
            str = str2;
        }
        if (this.f46927b) {
            webFragment.f46876d.loadDataWithBaseURL("https://withings.com", str, null, "UTF-8", "https://withings.com");
            return;
        }
        webFragment.f46876d.loadUrl(str);
        webFragment.getClass();
        if (!str2.contains("withings-bd2") && !str2.contains("withings-events")) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z5) {
            webFragment.getActivity().finish();
        }
    }
}
