package com.withings.webview;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.withings.webview.e;
import com.withings.wiscale2.C1987R;
import java.util.Arrays;
import java.util.List;
import p80.a;
import p80.b;
/* loaded from: classes4.dex */
public class WebFragment extends Fragment implements a.InterfaceC1507a, b.a, com.withings.webview.a, e.d {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f46874m = 0;

    /* renamed from: c  reason: collision with root package name */
    private e f46875c;

    /* renamed from: d  reason: collision with root package name */
    private WebView f46876d;

    /* renamed from: e  reason: collision with root package name */
    private View f46877e;

    /* renamed from: f  reason: collision with root package name */
    private LinearLayout f46878f;

    /* renamed from: g  reason: collision with root package name */
    private ProgressBar f46879g;

    /* renamed from: h  reason: collision with root package name */
    private WebViewDelegate f46880h;

    /* renamed from: i  reason: collision with root package name */
    private String f46881i;

    /* renamed from: j  reason: collision with root package name */
    private String f46882j;

    /* renamed from: k  reason: collision with root package name */
    private Long f46883k = null;

    /* renamed from: l  reason: collision with root package name */
    List<String> f46884l = Arrays.asList("https://.withings.com");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            WebFragment webFragment = WebFragment.this;
            webFragment.f46875c.f(webFragment.f46876d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f46886a;

        b(int i11) {
            this.f46886a = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            WebFragment webFragment = WebFragment.this;
            int i11 = this.f46886a;
            webFragment.J1(i11);
            webFragment.f46880h.R1(webFragment.getActivity(), i11);
        }
    }

    /* loaded from: classes4.dex */
    public class c extends WebChromeClient {
        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i11) {
            WebFragment webFragment = WebFragment.this;
            if (webFragment.f46879g != null) {
                webFragment.f46879g.setProgress(i11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void A1(WebFragment webFragment, CookieManager cookieManager, String str) {
        webFragment.getClass();
        cookieManager.setCookie("https://withings.zendesk.com", "device_lang=" + str + "; Max-Age=86400; Secure; HttpOnly; SameSite=Strict; ".concat("Domain=withings.zendesk.com"));
        for (String str2 : webFragment.f46884l) {
            cookieManager.setCookie(str2, "device_lang=" + str + "; Max-Age=86400; Secure; HttpOnly; SameSite=Strict; ".concat("Domain=.withings.com"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J1(int i11) {
        float f11;
        for (int i12 = 0; i12 < this.f46878f.getChildCount(); i12++) {
            MaterialButton materialButton = (MaterialButton) this.f46878f.getChildAt(i12);
            materialButton.setAllCaps(false);
            materialButton.setTextAppearance(C1987R.style.buttonPrimaryBlack);
            TypedArray obtainStyledAttributes = materialButton.getContext().obtainStyledAttributes(C1987R.style.buttonPrimaryBlack, new int[]{16843692, 16843958, 16843660});
            try {
                materialButton.setTypeface(androidx.core.content.res.g.e(obtainStyledAttributes.getResourceId(0, 0), materialButton.getContext()));
            } catch (Resources.NotFoundException unused) {
            }
            materialButton.setLetterSpacing(obtainStyledAttributes.getFloat(1, 0.0f));
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = materialButton.getContext().obtainStyledAttributes(C1987R.style.buttonPrimaryBlack, new int[]{16842904});
            int color = obtainStyledAttributes2.getColor(0, -16777216);
            obtainStyledAttributes2.recycle();
            if (i12 == i11) {
                f11 = 1.0f;
            } else {
                f11 = 0.4f;
            }
            materialButton.setTextColor(p0.d.i(color, (int) (f11 * 255.0f)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N1(CookieManager cookieManager, String str) {
        cookieManager.setCookie("https://withings.zendesk.com", "session_key=" + str + "; Max-Age=86400; Secure; HttpOnly; SameSite=Strict; ".concat("Domain=withings.zendesk.com"));
        for (String str2 : this.f46884l) {
            cookieManager.setCookie(str2, "session_key=" + str + "; Max-Age=86400; Secure; HttpOnly; SameSite=Strict; ".concat("Domain=.withings.com"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void z1(WebFragment webFragment, CookieManager cookieManager) {
        StringBuilder sb2 = new StringBuilder("withings_mobile_app=android");
        webFragment.getClass();
        sb2.append("; Max-Age=86400; Secure; HttpOnly; SameSite=Strict; ".concat("Domain=withings.zendesk.com"));
        cookieManager.setCookie("https://withings.zendesk.com", sb2.toString());
        for (String str : webFragment.f46884l) {
            cookieManager.setCookie(str, "withings_mobile_app=android" + "; Max-Age=86400; Secure; HttpOnly; SameSite=Strict; ".concat("Domain=.withings.com"));
        }
    }

    public final boolean C1() {
        WebView webView = this.f46876d;
        if (webView != null && webView.canGoBack()) {
            return true;
        }
        return false;
    }

    public final void D1() {
        WebView webView = this.f46876d;
        if (webView != null) {
            webView.goBack();
        }
    }

    public final void E1(String str) {
        WebView webView = this.f46876d;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    public final void F1(int i11) {
        new Handler(Looper.getMainLooper()).post(new b(i11));
    }

    public final void G1(int i11) {
        J1(i11);
        E1("javascript:window.dispatchEvent(new CustomEvent('navigate', {\"detail\" : { \"index\": " + i11 + "} }))");
    }

    public final void H1(int i11) {
        J1(i11);
    }

    public final void I1(String str) {
        N1(CookieManager.getInstance(), str);
    }

    public final void K1(long j5) {
        this.f46883k = Long.valueOf(j5);
    }

    public final void L1(String str) {
        this.f46882j = str;
    }

    public final void M1() {
        this.f46876d.getSettings().setDomStorageEnabled(true);
    }

    public final void O1(String str) {
        this.f46881i = str;
    }

    public final void P1(WebViewDelegate webViewDelegate) {
        this.f46880h = webViewDelegate;
    }

    public final void i0() {
        new Handler(Looper.getMainLooper()).post(new a());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        boolean z5;
        int i11;
        super.onActivityCreated(bundle);
        AppBarLayout appBarLayout = (AppBarLayout) getActivity().findViewById(C1987R.id.web_appbar);
        TextView textView = (TextView) getActivity().findViewById(C1987R.id.web_toolbar_title);
        this.f46879g = (ProgressBar) getActivity().findViewById(C1987R.id.web_loading);
        this.f46878f = (LinearLayout) getActivity().findViewById(C1987R.id.buttons_container);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        if (arguments.containsKey("EXTRA_ACCOUNT_ID")) {
            this.f46883k = Long.valueOf(arguments.getLong("EXTRA_ACCOUNT_ID"));
        }
        int i12 = 0;
        if (!arguments.containsKey("com.withings.webview.extra.EXTRA_HTML") && !"com.withings.webview.extra.EXTRA_HTML".equals(this.f46881i)) {
            z5 = false;
        } else {
            z5 = true;
        }
        if ((arguments.containsKey(WebActivity.EXTRA_URL) || WebActivity.EXTRA_URL.equals(this.f46881i)) && this.f46882j == null) {
            this.f46882j = arguments.getString(WebActivity.EXTRA_URL);
        } else if (z5 && this.f46882j == null) {
            this.f46882j = arguments.getString("com.withings.webview.extra.EXTRA_HTML");
        }
        if (arguments.getBoolean("EXTRA_TRANSLUCENT_TOOLBAR", false)) {
            View view = getView();
            view.setPadding(view.getPaddingLeft(), getResources().getDimensionPixelSize(C1987R.dimen.abc_action_bar_default_height_material), view.getPaddingRight(), view.getPaddingBottom());
        } else if (arguments.getBoolean("EXTRA_TOOLBAR", false)) {
            View view2 = getView();
            int dimensionPixelSize = getResources().getDimensionPixelSize(C1987R.dimen.abc_action_bar_default_height_material);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin += dimensionPixelSize;
            }
        }
        if (this.f46880h == null) {
            this.f46880h = (WebViewDelegate) arguments.getParcelable("EXTRA_WEBVIEW_DELEGATE");
        }
        WebSettings settings = this.f46876d.getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(arguments.getBoolean("EXTRA_ENABLE_LOCALE_STORAGE"));
        if (arguments.getBoolean("EXTRA_ALLOW_CACHE")) {
            i11 = -1;
        } else {
            i11 = 2;
        }
        settings.setCacheMode(i11);
        settings.setMixedContentMode(0);
        if (Build.VERSION.SDK_INT >= 29) {
            TypedArray obtainStyledAttributes = this.f46876d.getContext().obtainStyledAttributes((AttributeSet) null, new int[]{16844000});
            try {
                if (!obtainStyledAttributes.getBoolean(0, true)) {
                    i12 = 2;
                }
                settings.setForceDark(i12);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        e eVar = new e(getActivity(), this, this, this.f46880h, this, this, this.f46879g);
        this.f46875c = eVar;
        this.f46876d.setWebViewClient(eVar);
        this.f46876d.setWebChromeClient(new c());
        String str = this.f46882j;
        if (str != null && !str.isEmpty()) {
            String str2 = this.f46882j;
            vh.c a11 = vh.h.l().a(new h(this));
            a11.r(new g(this, str2, z5));
            a11.f(new f(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1987R.layout.fragment_webview, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        e eVar = this.f46875c;
        if (eVar != null) {
            eVar.g();
            this.f46875c.h();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f46876d = (WebView) view.findViewById(C1987R.id.webview);
        this.f46877e = view.findViewById(C1987R.id.no_network);
    }
}
