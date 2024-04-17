package com.withings.webview;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.webkit.CookieManager;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;
/* loaded from: classes4.dex */
public interface WebViewDelegate extends Parcelable {
    void D1(CookieManager cookieManager, String str, Context context);

    String K0(Context context, long j5);

    boolean R1(FragmentActivity fragmentActivity, int i11);

    void U(FragmentActivity fragmentActivity, WebView webView);

    boolean z(FragmentActivity fragmentActivity, Uri uri);
}
