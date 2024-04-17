package com.withings.webview;

import ah.u;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.withings.core.webcontent.HMWebViewDelegate;
import com.withings.util.log.Fail;
import com.withings.wiscale2.C1987R;
/* loaded from: classes4.dex */
public class WebActivity extends AppCompatActivity {
    private static final double BLUE_THRESHOLD = 0.114d;
    private static final double BRIGHTNESS_THRESHOLD = 0.5d;
    private static final int COLOR_TOTAL = 255;
    private static final float DARK_ALPHA = 0.8f;
    protected static final String EXTRA_ACCOUNT_ID = "com.withings.webview.extra.EXTRA_ACCOUNT_ID";
    public static final String EXTRA_ALLOW_BACK = "com.withings.webview.extra.EXTRA_ALLOW_BACK";
    protected static final String EXTRA_DELEGATE = "com.withings.webview.extra.EXTRA_DELEGATE";
    protected static final String EXTRA_HTML = "com.withings.webview.extra.EXTRA_HTML";
    protected static final String EXTRA_STATUS_BAR_COLOR = "com.withings.webview.extra.EXTRA_STATUS_BAR_COLOR";
    protected static final String EXTRA_TITLE = "com.withings.webview.extra.EXTRA_TITLE";
    protected static final String EXTRA_TOOLBAR_COLOR = "com.withings.webview.extra.EXTRA_TOOLBAR_COLOR";
    public static final String EXTRA_URL = "com.withings.webview.extra.EXTRA_URL";
    private static final double GREEN_THRESHOLD = 0.587d;
    private static final double RED_THRESHOLD = 0.299d;
    private boolean allowBack;
    private AppBarLayout appbar;
    private ProgressBar shareLoading;
    private Toolbar toolbar;
    private TextView toolbarTitle;
    protected WebFragment webFragment;
    private Integer toolbarColor = null;
    private Integer statusBarColor = null;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f46867a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<?> f46868b;

        /* renamed from: c  reason: collision with root package name */
        private String f46869c;

        /* renamed from: d  reason: collision with root package name */
        private WebViewDelegate f46870d;

        /* renamed from: e  reason: collision with root package name */
        private String f46871e;

        /* renamed from: f  reason: collision with root package name */
        private String f46872f;

        /* renamed from: g  reason: collision with root package name */
        private Long f46873g;

        public a(Context context, Long l5, Class<? extends WebActivity> cls) {
            this.f46867a = context;
            this.f46873g = l5;
            this.f46868b = cls;
        }

        public final Intent a() {
            Intent intent = new Intent(this.f46867a, this.f46868b);
            if (!TextUtils.isEmpty(this.f46869c)) {
                intent.putExtra(WebActivity.EXTRA_TITLE, this.f46869c);
            }
            WebViewDelegate webViewDelegate = this.f46870d;
            if (webViewDelegate != null) {
                intent.putExtra(WebActivity.EXTRA_DELEGATE, webViewDelegate);
            }
            if (!TextUtils.isEmpty(this.f46871e)) {
                intent.putExtra(WebActivity.EXTRA_URL, this.f46871e);
            } else if (!TextUtils.isEmpty(this.f46872f)) {
                intent.putExtra(WebActivity.EXTRA_HTML, this.f46872f);
            }
            Long l5 = this.f46873g;
            if (l5 != null) {
                intent.putExtra(WebActivity.EXTRA_ACCOUNT_ID, l5);
            }
            return intent;
        }

        public final void b(String str, String str2) {
            if ("html".equals(str)) {
                this.f46872f = str2;
            } else {
                this.f46871e = str2;
            }
        }

        public final void c(HMWebViewDelegate hMWebViewDelegate) {
            this.f46870d = hMWebViewDelegate;
        }

        public final void d(String str) {
            this.f46869c = str;
        }

        public final void e(String str) {
            this.f46871e = str;
        }
    }

    private void initStatusbarColor(Bundle bundle) {
        if (bundle.containsKey(EXTRA_STATUS_BAR_COLOR)) {
            this.statusBarColor = Integer.valueOf(bundle.getInt(EXTRA_STATUS_BAR_COLOR));
        } else {
            this.statusBarColor = Integer.valueOf(u.x(this, 16843857));
        }
    }

    private void initToolbarColor(Bundle bundle) {
        if (bundle.containsKey(EXTRA_TOOLBAR_COLOR)) {
            this.toolbarColor = Integer.valueOf(bundle.getInt(EXTRA_TOOLBAR_COLOR));
        } else {
            this.toolbarColor = Integer.valueOf(u.x(this, C1987R.attr.colorSurface));
        }
    }

    private boolean isColorDark(int i11) {
        if (1.0d - (((Color.blue(i11) * BLUE_THRESHOLD) + ((Color.green(i11) * GREEN_THRESHOLD) + (Color.red(i11) * RED_THRESHOLD))) / 255.0d) > BRIGHTNESS_THRESHOLD) {
            return true;
        }
        return false;
    }

    private void setLightOrDarkToolbarElements() {
        int i11;
        boolean isColorDark = isColorDark(this.toolbarColor.intValue());
        int x11 = u.x(this, C1987R.attr.colorOnSurface);
        Drawable mutate = androidx.core.content.a.getDrawable(this, C1987R.drawable.cross_drawable_toolbar).mutate();
        androidx.core.graphics.drawable.a.l(mutate, x11);
        this.toolbar.setNavigationIcon(mutate);
        this.toolbarTitle.setTextColor(x11);
        View decorView = getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        int i12 = systemUiVisibility | 256;
        if (isColorDark) {
            i11 = i12 & (-8193);
        } else {
            i11 = systemUiVisibility | 8464;
        }
        decorView.setSystemUiVisibility(i11);
    }

    private void setToolbarColor() {
        AppBarLayout appBarLayout = this.appbar;
        if (appBarLayout == null) {
            return;
        }
        appBarLayout.setBackgroundColor(getToolbarColor());
        getWindow().setStatusBarColor(getStatusBarColor());
    }

    protected int getStatusBarColor() {
        Integer num = this.statusBarColor;
        if (num != null) {
            return num.intValue();
        }
        Color.colorToHSV(getToolbarColor(), r1);
        float[] fArr = {0.0f, 0.0f, fArr[2] * DARK_ALPHA};
        return Color.HSVToColor(fArr);
    }

    protected int getToolbarColor() {
        Integer num = this.toolbarColor;
        if (num != null) {
            return num.intValue();
        }
        return u.x(this, C1987R.attr.colorSurface);
    }

    public void loadUrl(String str) {
        this.webFragment.E1(str);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        WebFragment webFragment = this.webFragment;
        if (webFragment != null && webFragment.C1() && this.allowBack) {
            this.webFragment.D1();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_webview);
        this.appbar = (AppBarLayout) findViewById(C1987R.id.web_appbar);
        this.toolbar = (Toolbar) findViewById(C1987R.id.web_toolbar);
        this.toolbarTitle = (TextView) findViewById(C1987R.id.web_toolbar_title);
        this.shareLoading = (ProgressBar) findViewById(C1987R.id.share_loading);
        setSupportActionBar(this.toolbar);
        getSupportActionBar().o(true);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            Fail.j("Extras are null");
            return;
        }
        this.allowBack = extras.getBoolean(EXTRA_ALLOW_BACK, true);
        initToolbarColor(extras);
        initStatusbarColor(extras);
        setLightOrDarkToolbarElements();
        WebViewDelegate webViewDelegate = (WebViewDelegate) extras.getParcelable(EXTRA_DELEGATE);
        long j5 = extras.getLong(EXTRA_ACCOUNT_ID, -1L);
        String str = EXTRA_URL;
        if (!extras.containsKey(EXTRA_URL)) {
            str = EXTRA_HTML;
        }
        WebFragment webFragment = (WebFragment) getSupportFragmentManager().X(C1987R.id.web_fragment);
        this.webFragment = webFragment;
        webFragment.O1(str);
        this.webFragment.L1(extras.getString(str));
        this.webFragment.P1(webViewDelegate);
        if (j5 != -1) {
            this.webFragment.K1(j5);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        setToolbarColor();
        setLightOrDarkToolbarElements();
    }

    public void setLoading(boolean z5) {
        int i11;
        ProgressBar progressBar = this.shareLoading;
        if (progressBar != null) {
            if (z5) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            progressBar.setVisibility(i11);
        }
    }
}
