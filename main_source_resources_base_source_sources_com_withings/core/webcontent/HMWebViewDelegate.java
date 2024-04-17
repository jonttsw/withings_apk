package com.withings.core.webcontent;

import ah.o;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.camera.camera2.internal.q;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.framework.common.ContainerUtils;
import com.withings.account.core.repositories.AccountSessionRepository;
import com.withings.core.webcontent.HMWebViewDelegate;
import com.withings.user.User;
import com.withings.webview.WebActivity;
import com.withings.webview.WebViewDelegate;
import com.withings.wiscale2.C1987R;
import dp0.j;
import f7.e;
import ga.f;
import gm.b;
import gm.g;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import m70.i;
import nm0.k;
import nm0.l;
import vh.h;
/* compiled from: HMWebViewDelegate.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/withings/core/webcontent/HMWebViewDelegate;", "Lcom/withings/webview/WebViewDelegate;", "Lgm/b$b;", "<init>", "()V", com.huawei.hms.feature.dynamic.e.b.f28627a, "c", "d", "core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class HMWebViewDelegate implements WebViewDelegate, b.InterfaceC0988b {
    public static final Parcelable.Creator<HMWebViewDelegate> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private dg.a f35398a;

    /* compiled from: HMWebViewDelegate.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<HMWebViewDelegate> {
        @Override // android.os.Parcelable.Creator
        public final HMWebViewDelegate createFromParcel(Parcel source) {
            u.j(source, "source");
            return new HMWebViewDelegate();
        }

        @Override // android.os.Parcelable.Creator
        public final HMWebViewDelegate[] newArray(int i11) {
            return new HMWebViewDelegate[i11];
        }
    }

    /* compiled from: HMWebViewDelegate.kt */
    /* loaded from: classes3.dex */
    public interface b {
        void a();
    }

    /* compiled from: HMWebViewDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/withings/core/webcontent/HMWebViewDelegate$c;", "", "core_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public interface c {
        dg.a getActiveSessionProvider();
    }

    /* compiled from: HMWebViewDelegate.kt */
    /* loaded from: classes3.dex */
    public interface d {
        void M(Uri uri, HMWebViewDelegate hMWebViewDelegate);

        void k0();
    }

    private final void b(CookieManager cookieManager, String str) {
        String str2;
        sf.d a11;
        dg.a aVar = this.f35398a;
        if (aVar != null && (a11 = dg.b.a(aVar, false)) != null) {
            str2 = a11.e();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "https://.withings.com";
        }
        cookieManager.setCookie(str2, str);
        cookieManager.setCookie("https://.withings.zendesk.com", str);
    }

    @Override // com.withings.webview.WebViewDelegate
    public final void D1(CookieManager cookieManager, String data, Context context) {
        String str;
        sf.d a11;
        u.j(data, "data");
        u.j(context, "context");
        if (this.f35398a == null) {
            this.f35398a = ((c) o.c(context, c.class)).getActiveSessionProvider();
        }
        dg.a aVar = this.f35398a;
        b(cookieManager, w6.o.a((aVar == null || (a11 = dg.b.a(aVar, false)) == null || (r4 = a11.f()) == null) ? "corpsession_key" : "corpsession_key", ContainerUtils.KEY_VALUE_DELIMITER, data));
        b(cookieManager, android.support.v4.media.a.a("appliver=", e.g()));
        String country = Locale.getDefault().getCountry();
        u.i(country, "getCountry(...)");
        if (!j.x(Locale.US.getCountry(), country) && !j.x(Locale.CANADA.getCountry(), country)) {
            str = "eu";
        } else {
            str = "us";
        }
        b(cookieManager, "region=".concat(str));
        User f11 = i.b().f();
        if (f11 != null) {
            b(cookieManager, q.c("current_user=", f11.q()));
        }
    }

    @Override // com.withings.webview.WebViewDelegate
    public final String K0(Context context, long j5) {
        Object a11;
        u.j(context, "context");
        try {
            a11 = kg.a.b(AccountSessionRepository.a.a(), j5).n();
        } catch (Throwable th2) {
            a11 = l.a(th2);
        }
        if (a11 instanceof k.a) {
            a11 = null;
        }
        return (String) a11;
    }

    @Override // com.withings.webview.WebViewDelegate
    public final boolean R1(FragmentActivity activity, int i11) {
        b bVar;
        u.j(activity, "activity");
        if (activity instanceof b) {
            bVar = (b) activity;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            bVar.a();
            return true;
        }
        return false;
    }

    @Override // com.withings.webview.WebViewDelegate
    public final void U(final FragmentActivity activity, WebView view) {
        boolean z5;
        WebActivity webActivity;
        Fragment fragment;
        View view2;
        FragmentManager supportFragmentManager;
        u.j(activity, "activity");
        u.j(view, "view");
        if (!e.f() && !e.d()) {
            z5 = false;
        } else {
            z5 = true;
        }
        WebView.setWebContentsDebuggingEnabled(z5);
        View view3 = null;
        if (activity instanceof WebActivity) {
            webActivity = (WebActivity) activity;
        } else {
            webActivity = null;
        }
        if (webActivity != null && (supportFragmentManager = webActivity.getSupportFragmentManager()) != null) {
            fragment = supportFragmentManager.X(C1987R.id.web_fragment);
        } else {
            fragment = null;
        }
        if (fragment != null && (view2 = fragment.getView()) != null) {
            view3 = view2.findViewById(C1987R.id.web_loading);
        }
        if (view3 != null) {
            view3.setVisibility(8);
        }
        view.evaluateJavascript("\n            var meta = document.querySelector(\"meta[name='nk-share']\");\n            if (meta == null) {\n                \"missing\";\n            } else {\n                meta.getAttribute(\"content\");\n            }\n            ", new ValueCallback() { // from class: qm.a
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                HMWebViewDelegate.d dVar;
                String str = (String) obj;
                Activity activity2 = activity;
                u.j(activity2, "$activity");
                HMWebViewDelegate this$0 = this;
                u.j(this$0, "this$0");
                if (activity2 instanceof HMWebViewDelegate.d) {
                    dVar = (HMWebViewDelegate.d) activity2;
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    if (!u.e(str, "\"missing\"")) {
                        Uri parse = Uri.parse(j.O("?" + str, "\"", "", false));
                        u.i(parse, "parse(...)");
                        dVar.M(parse, this$0);
                        return;
                    }
                    dVar.k0();
                }
            }
        });
    }

    @Override // gm.b.InterfaceC0988b
    public final void a(Activity activity, Intent intent) {
        WebActivity webActivity;
        u.j(activity, "activity");
        if (activity instanceof WebActivity) {
            webActivity = (WebActivity) activity;
        } else {
            webActivity = null;
        }
        if (webActivity != null) {
            webActivity.setLoading(false);
        }
        activity.startActivity(intent);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        u.j(dest, "dest");
    }

    @Override // com.withings.webview.WebViewDelegate
    public final boolean z(FragmentActivity activity, Uri uri) {
        u.j(activity, "activity");
        u.j(uri, "uri");
        boolean z5 = false;
        if (!gm.b.g(uri)) {
            return false;
        }
        String uri2 = uri.toString();
        u.i(uri2, "toString(...)");
        hm.a aVar = null;
        WebActivity webActivity = null;
        if (j.r(uri2, FirebaseAnalytics.Event.SHARE, false)) {
            if (activity instanceof WebActivity) {
                webActivity = (WebActivity) activity;
            }
            if (webActivity != null) {
                webActivity.setLoading(true);
            }
            String queryParameter = uri.getQueryParameter("picture");
            f.a aVar2 = new f.a(activity);
            aVar2.d(queryParameter);
            aVar2.r(new gm.e(this, activity, uri, activity, queryParameter, this, uri));
            w9.a.a(activity).d(aVar2.b());
            return true;
        }
        hm.d a11 = hm.c.a(uri);
        hm.b bVar = e.f66267b;
        if (bVar != null) {
            hm.a a12 = bVar.a(a11);
            if (!(a12 instanceof g)) {
                aVar = a12;
            }
            if (aVar != null) {
                int i11 = h.f103738e;
                h.f(new com.withings.core.webcontent.b(aVar, a11)).s(new com.withings.core.webcontent.c(activity, this));
                z5 = true;
            }
            return z5;
        }
        u.s("deepLinkHandlerProvider");
        throw null;
    }
}
