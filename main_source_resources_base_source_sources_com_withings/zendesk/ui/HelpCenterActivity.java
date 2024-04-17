package com.withings.zendesk.ui;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.v;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import androidx.navigation.e;
import androidx.navigation.t;
import by.kirich1409.viewbindingdelegate.f;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.withings.android.activity.WithingsActivity;
import com.withings.authentication.n;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.zendesk.R;
import com.withings.zendesk.databinding.ActivityHelpCenterBinding;
import com.withings.zendesk.ui.vm.HelpCenterViewModel;
import fn0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import nm0.j;
/* compiled from: HelpCenterActivity.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b/\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u0019\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0004R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/withings/zendesk/ui/HelpCenterActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lnm0/y;", "initSearch", "()V", "", "query", FirebaseAnalytics.Event.SEARCH, "(Ljava/lang/String;)V", "initToolbar", "initNavigation", "initViewModel", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onBackPressed", "Lcom/withings/zendesk/ui/ProductHelpCenter;", "productInfo$delegate", "Lnm0/g;", "getProductInfo", "()Lcom/withings/zendesk/ui/ProductHelpCenter;", "productInfo", "", "articleId$delegate", "getArticleId", "()Ljava/lang/Long;", "articleId", "Landroidx/navigation/e;", "navController$delegate", "getNavController", "()Landroidx/navigation/e;", "navController", "Lcom/withings/zendesk/databinding/ActivityHelpCenterBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/f;", "getBinding", "()Lcom/withings/zendesk/databinding/ActivityHelpCenterBinding;", "binding", "Lcom/withings/zendesk/ui/vm/HelpCenterViewModel;", "viewModel", "Lcom/withings/zendesk/ui/vm/HelpCenterViewModel;", "<init>", "Companion", "zendesk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HelpCenterActivity extends WithingsActivity {
    private static final String EXTRA_ARTICLE_ID = "article_id";
    private static final String EXTRA_PRODUCT_INFO = "product_info";
    private final g articleId$delegate;
    private final f binding$delegate;
    private final g navController$delegate;
    private final g productInfo$delegate;
    private HelpCenterViewModel viewModel;
    static final /* synthetic */ k<Object>[] $$delegatedProperties = {v.c(HelpCenterActivity.class, "binding", "getBinding()Lcom/withings/zendesk/databinding/ActivityHelpCenterBinding;", 0)};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: HelpCenterActivity.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/withings/zendesk/ui/HelpCenterActivity$Companion;", "", "()V", "EXTRA_ARTICLE_ID", "", "EXTRA_PRODUCT_INFO", "createIntent", "Landroid/content/Intent;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "productInfo", "Lcom/withings/zendesk/ui/ProductHelpCenter;", "articleId", "", "(Landroid/content/Context;Lcom/withings/zendesk/ui/ProductHelpCenter;Ljava/lang/Long;)Landroid/content/Intent;", "zendesk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public static /* synthetic */ Intent createIntent$default(Companion companion, Context context, ProductHelpCenter productHelpCenter, Long l5, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                productHelpCenter = null;
            }
            if ((i11 & 4) != 0) {
                l5 = null;
            }
            return companion.createIntent(context, productHelpCenter, l5);
        }

        public final Intent createIntent(Context context, ProductHelpCenter productHelpCenter, Long l5) {
            Intent putExtra = n.a(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, context, HelpCenterActivity.class).putExtra(HelpCenterActivity.EXTRA_PRODUCT_INFO, productHelpCenter).putExtra(HelpCenterActivity.EXTRA_ARTICLE_ID, l5);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }

        private Companion() {
        }
    }

    public HelpCenterActivity() {
        super(R.layout.activity_help_center);
        this.productInfo$delegate = h.b(new HelpCenterActivity$productInfo$2(this));
        this.articleId$delegate = h.b(new HelpCenterActivity$articleId$2(this));
        this.navController$delegate = h.b(new HelpCenterActivity$navController$2(this));
        this.binding$delegate = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new HelpCenterActivity$special$$inlined$viewBindingActivity$1(R.id.container));
    }

    public static final Intent createIntent(Context context, ProductHelpCenter productHelpCenter, Long l5) {
        return Companion.createIntent(context, productHelpCenter, l5);
    }

    private final Long getArticleId() {
        return (Long) this.articleId$delegate.getValue();
    }

    private final ActivityHelpCenterBinding getBinding() {
        T value = this.binding$delegate.getValue(this, $$delegatedProperties[0]);
        u.i(value, "getValue(...)");
        return (ActivityHelpCenterBinding) value;
    }

    private final androidx.navigation.e getNavController() {
        return (androidx.navigation.e) this.navController$delegate.getValue();
    }

    public final ProductHelpCenter getProductInfo() {
        return (ProductHelpCenter) this.productInfo$delegate.getValue();
    }

    private final void initNavigation() {
        setTitle("");
        ProductHelpCenter productInfo = getProductInfo();
        if (productInfo != null) {
            androidx.navigation.e navController = getNavController();
            int i11 = R.navigation.help_center_graph;
            navController.a0(navController.C().b(i11), androidx.core.os.e.a(new j("productInfo", productInfo)));
        }
        Long articleId = getArticleId();
        if (articleId != null) {
            long longValue = articleId.longValue();
            setTitle(C1987R.string._HELP_CENTER_);
            androidx.navigation.e navController2 = getNavController();
            navController2.a0(navController2.C().b(R.navigation.help_center_graph), null);
            getNavController().A().Q(R.id.articlePage);
            getNavController().O(R.id.helpCenterLanding, true);
            getNavController().K(ArticlePageDirections.Companion.showArticle(longValue));
        }
        getNavController().p(new e.b() { // from class: com.withings.zendesk.ui.c
            @Override // androidx.navigation.e.b
            public final void X0(androidx.navigation.e eVar, t tVar, Bundle bundle) {
                HelpCenterActivity.initNavigation$lambda$7(HelpCenterActivity.this, eVar, tVar, bundle);
            }
        });
    }

    public static final void initNavigation$lambda$7(HelpCenterActivity this$0, androidx.navigation.e eVar, t destination, Bundle bundle) {
        boolean z5;
        int i11;
        int i12;
        u.j(this$0, "this$0");
        u.j(eVar, "<anonymous parameter 0>");
        u.j(destination, "destination");
        TextInputEditText search = this$0.getBinding().search;
        u.i(search, "search");
        int i13 = 0;
        if (destination.r() != R.id.articlePage) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        search.setVisibility(i11);
        FrameLayout searchIconAndBg = this$0.getBinding().searchIconAndBg;
        u.i(searchIconAndBg, "searchIconAndBg");
        TextInputEditText search2 = this$0.getBinding().search;
        u.i(search2, "search");
        if (search2.getVisibility() == 0) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        searchIconAndBg.setVisibility(i12);
        ImageButton clearText = this$0.getBinding().clearText;
        u.i(clearText, "clearText");
        TextInputEditText search3 = this$0.getBinding().search;
        u.i(search3, "search");
        if (search3.getVisibility() != 0) {
            i13 = 8;
        }
        clearText.setVisibility(i13);
        int r7 = destination.r();
        if (r7 == R.id.search) {
            this$0.getBinding().search.requestFocus();
            Object systemService = this$0.getBinding().search.getContext().getSystemService("input_method");
            u.h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(this$0.getBinding().search, 1);
        } else if (r7 == R.id.helpCenterLanding) {
            v70.a.c("help_center", null, 6);
        } else {
            TextInputEditText search4 = this$0.getBinding().search;
            u.i(search4, "search");
            ay.b.p(search4);
        }
    }

    private final void initSearch() {
        getBinding().search.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.withings.zendesk.ui.a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z5) {
                HelpCenterActivity.initSearch$lambda$0(HelpCenterActivity.this, view, z5);
            }
        });
        getBinding().clearText.setOnClickListener(new gi.f(this, 19));
        getBinding().search.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.withings.zendesk.ui.b
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean initSearch$lambda$2;
                initSearch$lambda$2 = HelpCenterActivity.initSearch$lambda$2(HelpCenterActivity.this, textView, i11, keyEvent);
                return initSearch$lambda$2;
            }
        });
        TextInputEditText search = getBinding().search;
        u.i(search, "search");
        search.addTextChangedListener(new TextWatcher() { // from class: com.withings.zendesk.ui.HelpCenterActivity$initSearch$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                HelpCenterActivity.this.search(String.valueOf(editable));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            }
        });
    }

    public static final void initSearch$lambda$0(HelpCenterActivity this$0, View view, boolean z5) {
        u.j(this$0, "this$0");
        if (z5) {
            this$0.getNavController().K(SearchFragmentDirections.Companion.goToSearch());
        }
    }

    public static final void initSearch$lambda$1(HelpCenterActivity this$0, View view) {
        u.j(this$0, "this$0");
        this$0.getBinding().search.setText((CharSequence) null);
    }

    public static final boolean initSearch$lambda$2(HelpCenterActivity this$0, TextView textView, int i11, KeyEvent keyEvent) {
        u.j(this$0, "this$0");
        if (i11 == 6) {
            TextInputEditText search = this$0.getBinding().search;
            u.i(search, "search");
            ay.b.p(search);
            return true;
        }
        return true;
    }

    private final void initToolbar() {
        setSupportActionBar(getBinding().supportToolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(true);
            supportActionBar.o(true);
        }
    }

    private final void initViewModel() {
        this.viewModel = (HelpCenterViewModel) new k1(this, new k1.b() { // from class: com.withings.zendesk.ui.HelpCenterActivity$initViewModel$$inlined$getViewModel$1
            @Override // androidx.lifecycle.k1.b
            public /* bridge */ /* synthetic */ g1 create(Class cls, i6.a aVar) {
                return super.create(cls, aVar);
            }

            @Override // androidx.lifecycle.k1.b
            public <U extends g1> U create(Class<U> modelClass) {
                ProductHelpCenter productInfo;
                ProductHelpCenter productInfo2;
                u.j(modelClass, "modelClass");
                Application application = HelpCenterActivity.this.getApplication();
                u.i(application, "getApplication(...)");
                productInfo = HelpCenterActivity.this.getProductInfo();
                Long valueOf = productInfo != null ? Long.valueOf(productInfo.getCategoryId()) : null;
                productInfo2 = HelpCenterActivity.this.getProductInfo();
                return new HelpCenterViewModel(application, valueOf, productInfo2 != null ? Long.valueOf(productInfo2.getSectionId()) : null);
            }
        }).a(HelpCenterViewModel.class);
        Long articleId = getArticleId();
        if (articleId != null) {
            long longValue = articleId.longValue();
            HelpCenterViewModel helpCenterViewModel = this.viewModel;
            if (helpCenterViewModel != null) {
                helpCenterViewModel.setArticleId(longValue);
            } else {
                u.s("viewModel");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void search(java.lang.String r4) {
        /*
            r3 = this;
            com.withings.zendesk.ui.vm.HelpCenterViewModel r0 = r3.viewModel
            if (r0 == 0) goto L6d
            kotlinx.coroutines.flow.MutableSharedFlow r0 = r0.getSearchQuery()
            r0.tryEmit(r4)
            com.withings.zendesk.databinding.ActivityHelpCenterBinding r0 = r3.getBinding()
            android.widget.ImageButton r0 = r0.clearText
            java.lang.String r1 = "clearText"
            kotlin.jvm.internal.u.i(r0, r1)
            int r4 = r4.length()
            r1 = 0
            if (r4 <= 0) goto L30
            com.withings.zendesk.databinding.ActivityHelpCenterBinding r4 = r3.getBinding()
            com.google.android.material.textfield.TextInputEditText r4 = r4.search
            java.lang.String r2 = "search"
            kotlin.jvm.internal.u.i(r4, r2)
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L30
            r4 = 1
            goto L31
        L30:
            r4 = r1
        L31:
            if (r4 == 0) goto L34
            goto L36
        L34:
            r1 = 8
        L36:
            r0.setVisibility(r1)
            androidx.navigation.e r4 = r3.getNavController()
            androidx.navigation.t r4 = r4.y()
            if (r4 == 0) goto L4c
            int r4 = r4.r()
            int r0 = com.withings.zendesk.R.id.search
            if (r4 != r0) goto L4c
            goto L6c
        L4c:
            com.withings.zendesk.databinding.ActivityHelpCenterBinding r4 = r3.getBinding()
            com.google.android.material.textfield.TextInputEditText r4 = r4.search
            android.text.Editable r4 = r4.getText()
            if (r4 == 0) goto L6c
            boolean r4 = dp0.j.D(r4)
            if (r4 == 0) goto L5f
            goto L6c
        L5f:
            androidx.navigation.e r4 = r3.getNavController()
            com.withings.zendesk.ui.SearchFragmentDirections$Companion r0 = com.withings.zendesk.ui.SearchFragmentDirections.Companion
            r8.l r0 = r0.goToSearch()
            r4.K(r0)
        L6c:
            return
        L6d:
            java.lang.String r4 = "viewModel"
            kotlin.jvm.internal.u.s(r4)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.zendesk.ui.HelpCenterActivity.search(java.lang.String):void");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!getNavController().N()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ConstraintLayout root = getBinding().getRoot();
        u.i(root, "getRoot(...)");
        ay.b.t(root);
        Toolbar supportToolbar = getBinding().supportToolbar;
        u.i(supportToolbar, "supportToolbar");
        ay.b.m(supportToolbar, true, false, 29);
        initToolbar();
        initNavigation();
        initViewModel();
        initSearch();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        onBackPressed();
        return super.onOptionsItemSelected(item);
    }
}
