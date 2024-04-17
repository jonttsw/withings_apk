package com.withings.webview;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.camera.core.y1;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.button.MaterialButton;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import org.apache.http.HttpHost;
import p80.a;
import p80.b;
/* compiled from: WebClient.java */
/* loaded from: classes4.dex */
public final class e extends WebViewClient implements View.OnClickListener {

    /* renamed from: k  reason: collision with root package name */
    private static final String f46910k = String.format("(function(){return window.document.querySelector(\"meta[name='bottom-bar']\").getAttribute(\"%s\")})();", "content");

    /* renamed from: l  reason: collision with root package name */
    private static final String f46911l = String.format("(function(){return window.document.querySelector(\"meta[name='bottom-bar']\").getAttribute(\"%s\")})();", "currentIndex");

    /* renamed from: a  reason: collision with root package name */
    private final FragmentActivity f46912a;

    /* renamed from: b  reason: collision with root package name */
    private final View f46913b;

    /* renamed from: c  reason: collision with root package name */
    private final View f46914c;

    /* renamed from: d  reason: collision with root package name */
    private a.InterfaceC1507a f46915d;

    /* renamed from: e  reason: collision with root package name */
    private b.a f46916e;

    /* renamed from: f  reason: collision with root package name */
    private final WebViewDelegate f46917f;

    /* renamed from: g  reason: collision with root package name */
    private ProgressBar f46918g;

    /* renamed from: h  reason: collision with root package name */
    private com.withings.webview.a f46919h;

    /* renamed from: i  reason: collision with root package name */
    private d f46920i;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<String> f46921j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WebClient.java */
    /* loaded from: classes4.dex */
    public final class a implements ValueCallback<String> {
        a() {
        }

        @Override // android.webkit.ValueCallback
        public final void onReceiveValue(String str) {
            String str2 = str;
            e eVar = e.this;
            TextView textView = (TextView) eVar.f46912a.findViewById(C1987R.id.web_toolbar_title);
            if (!str2.trim().isEmpty()) {
                textView.setText(e.c(eVar, str2));
            } else {
                textView.setText(eVar.f46912a.getIntent().getStringExtra("com.withings.webview.extra.EXTRA_TITLE"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WebClient.java */
    /* loaded from: classes4.dex */
    public final class b implements ValueCallback<String> {
        b() {
        }

        @Override // android.webkit.ValueCallback
        public final void onReceiveValue(String str) {
            e.d(e.this, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WebClient.java */
    /* loaded from: classes4.dex */
    public final class c implements ValueCallback<String> {
        c() {
        }

        @Override // android.webkit.ValueCallback
        public final void onReceiveValue(String str) {
            String str2 = str;
            if (!str2.isEmpty() && !str2.contains(ConstantsWs.PARAMETER_VALUE_NULL)) {
                e eVar = e.this;
                if (eVar.f46920i != null) {
                    ((WebFragment) eVar.f46920i).H1(Integer.parseInt(e.c(eVar, str2)));
                }
            }
        }
    }

    /* compiled from: WebClient.java */
    /* loaded from: classes4.dex */
    interface d {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(FragmentActivity fragmentActivity, a.InterfaceC1507a interfaceC1507a, b.a aVar, WebViewDelegate webViewDelegate, com.withings.webview.a aVar2, d dVar, ProgressBar progressBar) {
        this.f46912a = fragmentActivity;
        this.f46917f = webViewDelegate;
        this.f46919h = aVar2;
        this.f46920i = dVar;
        this.f46918g = progressBar;
        this.f46915d = interfaceC1507a;
        this.f46916e = aVar;
        this.f46913b = fragmentActivity.findViewById(C1987R.id.no_network);
        this.f46914c = fragmentActivity.findViewById(C1987R.id.webview);
    }

    static /* bridge */ /* synthetic */ String c(e eVar, String str) {
        eVar.getClass();
        return e(str);
    }

    static void d(e eVar, String str) {
        FragmentActivity fragmentActivity = eVar.f46912a;
        LinearLayout linearLayout = (LinearLayout) fragmentActivity.findViewById(C1987R.id.buttons_container);
        if (linearLayout != null) {
            if (!str.isEmpty() && !str.contains(ConstantsWs.PARAMETER_VALUE_NULL)) {
                eVar.f46921j = new ArrayList<>(Arrays.asList(e(str).split(",")));
                linearLayout.removeAllViewsInLayout();
                if (eVar.f46921j.size() > 0) {
                    Iterator<String> it = eVar.f46921j.iterator();
                    while (it.hasNext()) {
                        MaterialButton materialButton = (MaterialButton) fragmentActivity.getLayoutInflater().inflate(C1987R.layout.button_layout, (ViewGroup) linearLayout.getParent(), false).findViewById(C1987R.id.button);
                        materialButton.setText(it.next());
                        materialButton.setOnClickListener(eVar);
                        linearLayout.addView(materialButton);
                    }
                    linearLayout.setVisibility(0);
                    return;
                }
                linearLayout.setVisibility(8);
                return;
            }
            linearLayout.setVisibility(8);
        }
    }

    private static String e(String str) {
        if (str.startsWith("\"")) {
            str = str.substring(1);
        }
        if (str.endsWith("\"")) {
            return android.support.v4.media.a.b(str, 1, 0);
        }
        return str;
    }

    public final void f(WebView webView) {
        webView.evaluateJavascript("(function(){return window.document.title})();", new a());
        if (webView.getUrl().contains("inappviews")) {
            webView.evaluateJavascript(f46910k, new b());
            webView.evaluateJavascript(f46911l, new c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.f46915d = null;
        com.withings.webview.b.f46889a.getClass();
        com.withings.webview.b.d(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        this.f46916e = null;
        com.withings.webview.b.f46889a.getClass();
        com.withings.webview.b.e(null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.withings.webview.a aVar = this.f46919h;
        if (aVar != null) {
            WebFragment webFragment = (WebFragment) aVar;
            webFragment.G1(this.f46921j.indexOf(((MaterialButton) view).getText().toString()));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        ProgressBar progressBar = this.f46918g;
        if (progressBar != null) {
            progressBar.setVisibility(4);
            progressBar.setProgress(100);
        }
        f(webView);
        this.f46917f.U(this.f46912a, webView);
        x70.b.b(this, "onPageFinished(" + str + ")", new Object[0]);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f46914c.setVisibility(0);
        this.f46913b.setVisibility(8);
        x70.b.b(this, "onPageStarted(" + str + ")", new Object[0]);
        ProgressBar progressBar = this.f46918g;
        if (progressBar != null) {
            progressBar.setVisibility(0);
            progressBar.setProgress(0);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String url) {
        Uri parse = Uri.parse(url);
        FragmentActivity activity = this.f46912a;
        WebViewDelegate webViewDelegate = this.f46917f;
        if (webViewDelegate != null && webViewDelegate.z(activity, parse)) {
            return true;
        }
        if ("withings-private".equalsIgnoreCase(parse.getScheme())) {
            com.withings.webview.b bVar = com.withings.webview.b.f46889a;
            a.InterfaceC1507a interfaceC1507a = this.f46915d;
            bVar.getClass();
            com.withings.webview.b.d(interfaceC1507a);
            com.withings.webview.b.e(this.f46916e);
            u.j(webView, "webView");
            u.j(url, "url");
            l0 l0Var = new l0();
            BuildersKt__BuildersKt.runBlocking$default(null, new com.withings.webview.d(url, l0Var, webView, null), 1, null);
            boolean z5 = l0Var.f76251a;
            if (webViewDelegate != null && z5) {
                webViewDelegate.U(activity, webView);
            }
            return true;
        }
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, parse);
        if (url.endsWith(".pdf")) {
            activity.startActivity(intent);
            return true;
        }
        u.j(activity, "activity");
        List<ResolveInfo> queryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 131072);
        u.i(queryIntentActivities, "queryIntentActivities(...)");
        if (queryIntentActivities.size() > 0 && !HttpHost.DEFAULT_SCHEME_NAME.equals(parse.getScheme()) && !"https".equals(parse.getScheme())) {
            activity.startActivity(intent);
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i11, String str, String str2) {
        FragmentActivity activity = this.f46912a;
        if (i11 == -10) {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str2));
            u.j(activity, "activity");
            List<ResolveInfo> queryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 131072);
            u.i(queryIntentActivities, "queryIntentActivities(...)");
            if (queryIntentActivities.size() > 0) {
                if (webView.canGoBack()) {
                    webView.goBack();
                }
                activity.startActivity(intent);
                return;
            }
            super.onReceivedError(webView, i11, str, str2);
            return;
        }
        Uri parse = Uri.parse(str2);
        x70.b.d(this, "onReceivedError: %s", str);
        WebViewDelegate webViewDelegate = this.f46917f;
        if (webViewDelegate == null || !webViewDelegate.z(activity, parse)) {
            if (i11 == -2) {
                if (o80.a.a(str2)) {
                    return;
                }
                this.f46914c.setVisibility(4);
                this.f46913b.setVisibility(0);
                return;
            }
            super.onReceivedError(webView, i11, str, str2);
            x70.b.b(this, y1.e(androidx.compose.material3.d.a("onReceivedError(", i11, ", ", str, ", "), str2, ")"), new Object[0]);
        }
    }
}
