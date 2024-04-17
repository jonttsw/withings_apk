package com.withings.wiscale2.legacyprograms;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k0;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.withings.account.core.model.Account;
import com.withings.android.activity.WithingsActivity;
import com.withings.core.webcontent.HMWebViewDelegate;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.programs.model.ProgramOld;
import com.withings.webview.WebActivity;
import com.withings.webview.WebFragment;
import com.withings.wiscale2.C1987R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
/* compiled from: ProgramMenuActivity.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b'\u0010(J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR#\u0010\u0012\u001a\n \r*\u0004\u0018\u00010\f0\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0017\u001a\n \r*\u0004\u0018\u00010\u00130\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u001c\u001a\n \r*\u0004\u0018\u00010\u00180\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u001bR#\u0010!\u001a\n \r*\u0004\u0018\u00010\u001d0\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u000f\u001a\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/ProgramMenuActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lnm0/y;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Landroidx/appcompat/widget/Toolbar;", "kotlin.jvm.PlatformType", "toolbar$delegate", "Lnm0/g;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/viewpager/widget/ViewPager;", "viewPager$delegate", "getViewPager", "()Landroidx/viewpager/widget/ViewPager;", "viewPager", "Lcom/google/android/material/tabs/TabLayout;", "tabLayout$delegate", "getTabLayout", "()Lcom/google/android/material/tabs/TabLayout;", "tabLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "appBarLayout$delegate", "getAppBarLayout", "()Lcom/google/android/material/appbar/AppBarLayout;", "appBarLayout", "Lcom/withings/programs/model/ProgramOld;", "program$delegate", "getProgram", "()Lcom/withings/programs/model/ProgramOld;", "program", "<init>", "()V", "Companion", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ProgramMenuActivity extends WithingsActivity {
    public static final String EXTRA_KEY_PROGRAM = "extra_key_program";
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final g toolbar$delegate = h.b(new ProgramMenuActivity$toolbar$2(this));
    private final g viewPager$delegate = h.b(new ProgramMenuActivity$viewPager$2(this));
    private final g tabLayout$delegate = h.b(new ProgramMenuActivity$tabLayout$2(this));
    private final g appBarLayout$delegate = h.b(new ProgramMenuActivity$appBarLayout$2(this));
    private final g program$delegate = h.b(new ProgramMenuActivity$program$2(this));

    /* compiled from: ProgramMenuActivity.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/ProgramMenuActivity$Companion;", "", "()V", "EXTRA_KEY_PROGRAM", "", "createIntent", "Landroid/content/Intent;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "program", "Lcom/withings/programs/model/ProgramOld;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final Intent createIntent(Context context, ProgramOld program) {
            u.j(context, "context");
            u.j(program, "program");
            Intent putExtra = new Intent(context, ProgramMenuActivity.class).putExtra(ProgramMenuActivity.EXTRA_KEY_PROGRAM, program);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }

        private Companion() {
        }
    }

    public final AppBarLayout getAppBarLayout() {
        return (AppBarLayout) this.appBarLayout$delegate.getValue();
    }

    public final ProgramOld getProgram() {
        return (ProgramOld) this.program$delegate.getValue();
    }

    public final TabLayout getTabLayout() {
        return (TabLayout) this.tabLayout$delegate.getValue();
    }

    public final Toolbar getToolbar() {
        return (Toolbar) this.toolbar$delegate.getValue();
    }

    public final ViewPager getViewPager() {
        return (ViewPager) this.viewPager$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        vf.c cVar;
        Account.b i11;
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_program_menu);
        setSupportActionBar(getToolbar());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        cVar = vf.c.f103617d;
        if (cVar != null) {
            Account i12 = cVar.i();
            if (i12 != null && (i11 = i12.i()) != null) {
                final long b10 = i11.b();
                setTitle(getProgram().getName());
                final List<ProgramOld.MenuItem> menu = getProgram().getMenu();
                if (menu != null) {
                    getViewPager().setOffscreenPageLimit(menu.size());
                    ViewPager viewPager = getViewPager();
                    final FragmentManager supportFragmentManager = getSupportFragmentManager();
                    viewPager.setAdapter(new k0(supportFragmentManager) { // from class: com.withings.wiscale2.legacyprograms.ProgramMenuActivity$onCreate$1$1
                        @Override // androidx.viewpager.widget.e
                        public int getCount() {
                            return menu.size();
                        }

                        @Override // androidx.fragment.app.k0
                        public WebFragment getItem(int i13) {
                            String url = menu.get(i13).getUrl();
                            long j5 = b10;
                            HMWebViewDelegate hMWebViewDelegate = new HMWebViewDelegate();
                            int i14 = WebFragment.f46874m;
                            WebFragment webFragment = new WebFragment();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString(WebActivity.EXTRA_URL, url);
                            bundle2.putParcelable("EXTRA_WEBVIEW_DELEGATE", hMWebViewDelegate);
                            bundle2.putBoolean("EXTRA_ENABLE_LOCALE_STORAGE", false);
                            bundle2.putBoolean("EXTRA_ALLOW_CACHE", true);
                            bundle2.putLong("EXTRA_ACCOUNT_ID", j5);
                            webFragment.setArguments(bundle2);
                            return webFragment;
                        }

                        @Override // androidx.viewpager.widget.e
                        public String getPageTitle(int i13) {
                            Context applicationContext = this.getApplicationContext();
                            u.i(applicationContext, "getApplicationContext(...)");
                            return menu.get(i13).formattedTitle(applicationContext);
                        }
                    });
                }
                getTabLayout().setupWithViewPager(getViewPager());
                return;
            }
            finish();
            return;
        }
        throw new IllegalArgumentException("You must call init before".toString());
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
