package com.withings.core.webcontent;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.core.graphics.f;
import androidx.core.view.b0;
import androidx.core.view.l1;
import androidx.core.view.u0;
import androidx.core.view.z1;
import com.withings.account.core.model.Account;
import com.withings.core.webcontent.HMWebViewDelegate;
import com.withings.webview.WebActivity;
import com.withings.webview.WebFragment;
import com.withings.wiscale2.C1987R;
import gm.b;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.j;
/* compiled from: HMWebActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/withings/core/webcontent/HMWebActivity;", "Lcom/withings/webview/WebActivity;", "Lcom/withings/core/webcontent/HMWebViewDelegate$d;", "<init>", "()V", "a", "core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class HMWebActivity extends WebActivity implements HMWebViewDelegate.d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f35395c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private Uri f35396a;

    /* renamed from: b  reason: collision with root package name */
    private b.InterfaceC0988b f35397b;

    /* compiled from: HMWebActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static Intent a(a aVar, Context context, String type, String str, String url, int i11) {
            vf.c cVar;
            Account.b i12;
            if ((i11 & 2) != 0) {
                type = "url";
            }
            Long l5 = null;
            if ((i11 & 4) != 0) {
                str = null;
            }
            HMWebViewDelegate hMWebViewDelegate = new HMWebViewDelegate();
            aVar.getClass();
            u.j(context, "context");
            u.j(type, "type");
            u.j(url, "url");
            cVar = vf.c.f103617d;
            if (cVar != null) {
                Account i13 = cVar.i();
                if (i13 != null && (i12 = i13.i()) != null) {
                    l5 = Long.valueOf(i12.b());
                }
                WebActivity.a aVar2 = new WebActivity.a(context, l5, HMWebActivity.class);
                aVar2.b(type, url);
                if (str == null) {
                    str = "";
                }
                aVar2.d(str);
                aVar2.c(hMWebViewDelegate);
                return aVar2.a();
            }
            throw new IllegalArgumentException("You must call init before".toString());
        }

        public final Intent b(Context context, Integer num, int i11) {
            String str;
            u.j(context, "context");
            if (num != null) {
                str = context.getString(num.intValue());
            } else {
                str = null;
            }
            String str2 = str;
            String string = context.getString(i11);
            u.i(string, "getString(...)");
            return a(this, context, "url", str2, string, 16);
        }

        public final Intent c(Context context, String str, String url) {
            u.j(context, "context");
            u.j(url, "url");
            return a(this, context, "url", str, url, 16);
        }
    }

    @Override // com.withings.core.webcontent.HMWebViewDelegate.d
    public final void M(Uri uri, HMWebViewDelegate hMWebViewDelegate) {
        this.f35396a = uri;
        this.f35397b = hMWebViewDelegate;
        invalidateOptionsMenu();
    }

    @Override // com.withings.core.webcontent.HMWebViewDelegate.d
    public final void k0() {
        this.f35396a = null;
        invalidateOptionsMenu();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.withings.webview.WebActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final View rootView = getWindow().getDecorView().findViewById(16908290).getRootView();
        u.i(rootView, "getRootView(...)");
        l1.a(getWindow(), false);
        u0.p0(rootView, new b0() { // from class: cm.d
            @Override // androidx.core.view.b0
            public final z1 a(View view, z1 z1Var) {
                View view2 = rootView;
                u.j(view2, "$view");
                u.j(view, "<anonymous parameter 0>");
                f f11 = z1Var.f(7);
                u.i(f11, "getInsets(...)");
                view2.setPadding(f11.f12446a, f11.f12447b, f11.f12448c, f11.f12449d);
                return z1.f12712b;
            }
        });
        View findViewById = findViewById(C1987R.id.web_appbar);
        u.i(findViewById, "findViewById(...)");
        ay.b.n(findViewById, true, false, 29);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        boolean z5;
        u.j(menu, "menu");
        getMenuInflater().inflate(C1987R.menu.activity_hmweb, menu);
        MenuItem findItem = menu.findItem(C1987R.id.action_share);
        if (this.f35396a != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        findItem.setVisible(z5);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.withings.webview.WebActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == C1987R.id.action_share) {
            cr.a.a(new j(this.f35396a, this.f35397b), new com.withings.core.webcontent.a(this));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        WebFragment webFragment = this.webFragment;
        if (webFragment != null) {
            webFragment.M1();
        }
    }
}
