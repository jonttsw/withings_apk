package com.withings.webview;

import android.content.Context;
import android.webkit.CookieManager;
import androidx.compose.material3.k4;
import java.util.Locale;
/* compiled from: WebFragment.java */
/* loaded from: classes4.dex */
final class h implements vh.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WebFragment f46929a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(WebFragment webFragment) {
        this.f46929a = webFragment;
    }

    @Override // vh.a
    public final void run() throws Exception {
        Long l5;
        Long l6;
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        CookieManager.setAcceptFileSchemeCookies(true);
        WebFragment webFragment = this.f46929a;
        l5 = webFragment.f46883k;
        if (l5 != null) {
            WebViewDelegate webViewDelegate = webFragment.f46880h;
            Context requireContext = webFragment.requireContext();
            l6 = webFragment.f46883k;
            String K0 = webViewDelegate.K0(requireContext, l6.longValue());
            webFragment.N1(cookieManager, K0);
            WebFragment.A1(webFragment, cookieManager, Locale.getDefault().getLanguage());
            WebFragment.z1(webFragment, cookieManager);
            if (webFragment.f46880h != null) {
                WebViewDelegate webViewDelegate2 = webFragment.f46880h;
                StringBuilder c11 = k4.c(K0);
                c11.append("; Max-Age=86400; Secure; HttpOnly; SameSite=Strict; ".concat("Domain=.withings.com"));
                webViewDelegate2.D1(cookieManager, c11.toString(), webFragment.getContext());
                WebViewDelegate webViewDelegate3 = webFragment.f46880h;
                StringBuilder c12 = k4.c(K0);
                c12.append("; Max-Age=86400; Secure; HttpOnly; SameSite=Strict; ".concat("Domain=withings.zendesk.com"));
                webViewDelegate3.D1(cookieManager, c12.toString(), webFragment.getContext());
            }
        }
    }
}
