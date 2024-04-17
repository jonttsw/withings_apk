package com.withings.wiscale2;

import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.t;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.rudderstack.android.sdk.core.util.Utils;
import com.withings.account.core.model.Account;
import com.withings.account.models.AccountPrefEntity;
import com.withings.authentication.AuthenticationActivity;
import com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.views.view.BlockableViewPager;
import com.withings.webview.WebFragment;
import com.withings.wiscale2.account.password.PasswordExpiredActivity;
import com.withings.wiscale2.accountV2.ui.LoggedOutActivity;
import com.withings.wiscale2.healthsync.google.fit.ImportStepsFromFit;
import com.withings.wiscale2.settings.changelog.ChangeLogTimelineDelegate;
import com.withings.wiscale2.user.ui.profile.EditProfileActivity;
import com.withings.wiscale2.utils.TimeZoneReceiver;
import gm.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import sf.c;
/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withings/wiscale2/MainActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lgm/b$a;", "Lcom/google/android/material/navigation/NavigationBarView$c;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MainActivity extends Hilt_MainActivity implements b.a, NavigationBarView.c {

    /* renamed from: j  reason: collision with root package name */
    private androidx.appcompat.app.c f47958j;
    @Inject

    /* renamed from: l  reason: collision with root package name */
    public ch.d f47960l;
    @Inject

    /* renamed from: m  reason: collision with root package name */
    public ea0.k f47961m;
    @Inject

    /* renamed from: n  reason: collision with root package name */
    public ch0.f f47962n;
    @Inject

    /* renamed from: o  reason: collision with root package name */
    public u70.a f47963o;

    /* renamed from: p  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f47964p;

    /* renamed from: q  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f47965q;

    /* renamed from: s  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f47951s = {androidx.camera.core.v.c(MainActivity.class, "activityMainBinding", "getActivityMainBinding()Lcom/withings/wiscale2/databinding/ActivityMainBinding;", 0)};

    /* renamed from: r  reason: collision with root package name */
    public static final a f47950r = new Object();

    /* renamed from: t  reason: collision with root package name */
    private static final String f47952t = "MainActivity";

    /* renamed from: e  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f47953e = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new kotlin.jvm.internal.w(1));

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f47954f = nm0.h.b(new b());

    /* renamed from: g  reason: collision with root package name */
    private final androidx.lifecycle.i1 f47955g = new androidx.lifecycle.i1(kotlin.jvm.internal.q0.b(GoogleAuthProviderViewModel.class), new f(this), new e(this), new g(this));

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f47956h = nm0.h.b(new h());

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<Fragment> f47957i = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private int f47959k = C1987R.id.home;

    /* compiled from: MainActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static Intent a(Context context) {
            kotlin.jvm.internal.u.j(context, "context");
            Intent addFlags = new Intent(context, MainActivity.class).addFlags(67108864).addFlags(Utils.MAX_EVENT_SIZE);
            kotlin.jvm.internal.u.i(addFlags, "addFlags(...)");
            return addFlags;
        }

        public static Intent b(Context context, int i11, Long l5, int i12) {
            kotlin.jvm.internal.u.j(context, "context");
            Intent putExtra = a(context).putExtra("navigationUserId", l5).putExtra("navigationResId", i11).putExtra("navigationAchieveTab", i12);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            return putExtra;
        }

        public static Intent c() {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
            intent.putExtra("navigationResId", C1987R.id.home);
            intent.addFlags(67108864).addFlags(Utils.MAX_EVENT_SIZE);
            return intent;
        }
    }

    /* compiled from: MainActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<aq.a> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final aq.a invoke() {
            return new aq.a(MainActivity.this);
        }
    }

    /* compiled from: MainActivity.kt */
    /* loaded from: classes4.dex */
    static final class c implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f47967a;

        c(ym0.l lVar) {
            this.f47967a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f47967a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f47967a;
        }

        public final int hashCode() {
            return this.f47967a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f47967a.invoke(obj);
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.l<MainActivity, tb0.c0> {
        @Override // ym0.l
        public final tb0.c0 invoke(MainActivity mainActivity) {
            MainActivity activity = mainActivity;
            kotlin.jvm.internal.u.j(activity, "activity");
            int i11 = u9.a.f101598b;
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                if (childCount != 0) {
                    if (childCount == 1) {
                        View childAt = viewGroup.getChildAt(0);
                        kotlin.jvm.internal.u.i(childAt, "contentView.getChildAt(0)");
                        return tb0.c0.a(childAt);
                    }
                    throw new IllegalStateException("More than one child view found in the Activity content view".toString());
                }
                throw new IllegalStateException("Content view has no children. Provide a root view explicitly".toString());
            }
            throw new IllegalStateException("Activity has no content view".toString());
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f47968a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f47968a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f47968a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.a<androidx.lifecycle.m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f47969a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f47969a = componentActivity;
        }

        @Override // ym0.a
        public final androidx.lifecycle.m1 invoke() {
            return this.f47969a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f47970a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f47970a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f47970a.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: MainActivity.kt */
    /* loaded from: classes4.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.a<ch0.d> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final ch0.d invoke() {
            MainActivity mainActivity = MainActivity.this;
            return (ch0.d) new androidx.lifecycle.k1(mainActivity, new l2(mainActivity)).a(ch0.d.class);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public MainActivity() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new g40.a(this, 1));
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f47964p = registerForActivityResult;
        androidx.activity.result.b<Intent> registerForActivityResult2 = registerForActivityResult(new g.a(), new g40.b(this, 1));
        kotlin.jvm.internal.u.i(registerForActivityResult2, "registerForActivityResult(...)");
        this.f47965q = registerForActivityResult2;
    }

    public static void A3(MainActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        vh.h.l().b(new f2(this$0)).q(new g2(ProgressDialog.show(this$0, null, this$0.getString(C1987R.string._LOADING_)), this$0));
    }

    public static void B3(MainActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        ((GoogleAuthProviderViewModel) this$0.f47955g.getValue()).T0(this$0.f47965q);
    }

    public static void C3(MainActivity this$0, ActivityResult activityResult) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (activityResult.b() == -1) {
            androidx.lifecycle.i1 i1Var = this$0.f47955g;
            GoogleAuthProviderViewModel googleAuthProviderViewModel = (GoogleAuthProviderViewModel) i1Var.getValue();
            Task<GoogleSignInAccount> signedInAccountFromIntent = GoogleSignIn.getSignedInAccountFromIntent(activityResult.a());
            kotlin.jvm.internal.u.i(signedInAccountFromIntent, "getSignedInAccountFromIntent(...)");
            GoogleSignInAccount O0 = GoogleAuthProviderViewModel.O0(signedInAccountFromIntent);
            if (O0 != null) {
                ((GoogleAuthProviderViewModel) i1Var.getValue()).U0(O0);
            }
        }
    }

    public static void D3(MainActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        vh.h.h().b(new d2(this$0));
    }

    public static void E3(MainActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (this$0.R3().r0()) {
            vh.c b10 = vh.h.h().b(new z1(this$0));
            b10.s(new a2(this$0));
            b10.p(this$0);
            return;
        }
        this$0.finish();
    }

    public static void F3(MainActivity this$0, EditText input) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(input, "$input");
        String obj = input.getText().toString();
        ProgressDialog show = ProgressDialog.show(this$0, null, this$0.getString(C1987R.string._WTA_PASSWORD_CHECK_), true, false);
        vh.c b10 = vh.h.l().b(new j2(this$0, obj));
        b10.q(new k2(show, this$0));
        b10.p(this$0);
    }

    public static final void I3(MainActivity mainActivity, List list) {
        int i11;
        mainActivity.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v60.a aVar = (v60.a) it.next();
            int ordinal = aVar.b().ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i11 = C1987R.id.measure;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i11 = C1987R.id.discover;
            }
            com.google.android.material.badge.a c11 = mainActivity.Q3().f98894a.c(i11);
            c11.m(mainActivity.getColor(C1987R.color.statusBad));
            c11.n(!aVar.a());
        }
    }

    public static final void J3(MainActivity mainActivity, lb0.k kVar) {
        mainActivity.getClass();
        if (kVar instanceof lb0.f) {
            lb0.g.b(mainActivity);
        } else {
            mainActivity.R3().F0(mainActivity, kVar);
        }
    }

    public static final void K3(MainActivity mainActivity) {
        if (mainActivity.R3().y0()) {
            Intent intent = new Intent(mainActivity, MainActivity.class);
            intent.setFlags(268468224);
            mainActivity.startActivity(intent);
        }
    }

    public static final void M3(MainActivity mainActivity) {
        mainActivity.Q3().f98894a.setSelectedItemId(mainActivity.Q3().f98894a.getMenu().getItem(0).getItemId());
    }

    private final void N3() {
        if (!R3().t0("android.permission.BLUETOOTH_SCAN")) {
            return;
        }
        if ((androidx.core.content.a.checkSelfPermission(this, "android.permission.BLUETOOTH_SCAN") != 0 || androidx.core.content.a.checkSelfPermission(this, "android.permission.BLUETOOTH_CONNECT") != 0) && !shouldShowRequestPermissionRationale("android.permission.BLUETOOTH_SCAN")) {
            ((aq.a) this.f47954f.getValue()).g(this, 8498);
            R3().O0("android.permission.BLUETOOTH_SCAN");
        }
    }

    private final void O3(int i11) {
        Integer num;
        this.f47959k = i11;
        if (i11 == C1987R.id.home) {
            num = 0;
        } else if (i11 == C1987R.id.measure || i11 == C1987R.id.dashboard) {
            num = 1;
        } else if (i11 == C1987R.id.discover) {
            num = 2;
        } else if (i11 == C1987R.id.devices) {
            num = 3;
        } else {
            num = null;
        }
        if (num != null) {
            Q3().f98895b.D(num.intValue(), false);
        }
    }

    private final boolean P3() {
        User q02;
        Account k02 = R3().k0();
        if (k02 != null && R3().r0() && (q02 = R3().q0()) != null && !q02.D() && q02.A() == 1) {
            if (getIntent().getBooleanExtra("extra-password-expired", false)) {
                Intent putExtra = new Intent(this, PasswordExpiredActivity.class).putExtra("extra_key_native_change", true);
                kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
                startActivityForResult(putExtra, 849);
                return false;
            }
            sf.c d11 = k02.i().d();
            if (d11 instanceof c.a) {
                boolean d12 = k02.d();
                if (kotlin.jvm.internal.u.e(((c.a) d11).a(), AccountPrefEntity.PROVIDER_GOOGLE)) {
                    androidx.appcompat.app.c cVar = this.f47958j;
                    if (cVar == null || !cVar.isShowing()) {
                        qc.b bVar = new qc.b(this);
                        bVar.g(C1987R.string.login_withAuthProvider_noAccount_google_title);
                        this.f47958j = bVar.z(C1987R.string._RETRY_, new zn.b(this, 2)).w(C1987R.string._DECONNECTER_, new y1(this, 0)).s();
                    }
                } else if (d12) {
                    U3();
                } else {
                    Intent flags = new Intent(this, LoggedOutActivity.class).setFlags(268468224);
                    kotlin.jvm.internal.u.i(flags, "setFlags(...)");
                    startActivity(flags);
                }
                return false;
            }
            this.f47958j = null;
            return true;
        }
        this.f47964p.a(new Intent(this, AuthenticationActivity.class));
        return false;
    }

    private final tb0.c0 Q3() {
        return (tb0.c0) ((LifecycleViewBindingProperty) this.f47953e).getValue(this, f47951s[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ch0.d R3() {
        return (ch0.d) this.f47956h.getValue();
    }

    private final void T3() {
        if (Q3().f98895b.getCurrentItem() < this.f47957i.size()) {
            Fragment fragment = this.f47957i.get(Q3().f98895b.getCurrentItem());
            kotlin.jvm.internal.u.i(fragment, "get(...)");
            Fragment fragment2 = fragment;
            if ((fragment2 instanceof y70.c) && fragment2.isVisible()) {
                ((y70.c) fragment2).i1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U3() {
        EditText editText = new EditText(this);
        editText.setText("");
        editText.setHint(C1987R.string._PASSWORD_);
        editText.setInputType(ConstantsWs.MEASURE_TYPE_BREATHING_EVENT_PROBABILITY);
        qc.b bVar = new qc.b(this);
        bVar.C(C1987R.string._WFC_PASSWORD_INVALID_);
        bVar.g(C1987R.string._ACCOUNT_NOCONNECT_ALERT_);
        bVar.r(editText, (int) getResources().getDimension(C1987R.dimen.keyline_2), (int) getResources().getDimension(C1987R.dimen.keyline_2));
        bVar.setPositiveButton(C1987R.string._OK_, new vn.a(1, this, editText)).setNegativeButton(C1987R.string._DECONNECTER_, new com.withings.ecg.heartsound.c(this, 2)).i(C1987R.string._FORGOT_PASSWORD_, new com.withings.reminder.details.a(this, 1)).b(false).s();
    }

    public static void z3(MainActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        vh.h.h().b(new d2(this$0));
    }

    public final void S3(int i11) {
        Q3().f98894a.setSelectedItemId(i11);
        O3(i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        x70.b.r(f47952t, androidx.appcompat.app.h.c("onActivityResult(requestCode:", i11, ", resultCode:", i12, ", data)"), new Object[0]);
        if (i11 != 4) {
            if (i11 != 654) {
                if (i11 != 4098) {
                    if (i11 != 9002) {
                        if (i11 != 849) {
                            if (i11 != 850) {
                                super.onActivityResult(i11, i12, intent);
                                return;
                            } else if (i12 == -1) {
                                S3(C1987R.id.home);
                                return;
                            } else {
                                return;
                            }
                        } else if (i12 != -1) {
                            if (i12 == 0) {
                                finish();
                                return;
                            }
                            return;
                        } else {
                            S3(C1987R.id.home);
                            return;
                        }
                    } else if (i12 == -1) {
                        androidx.work.impl.n0 n11 = androidx.work.impl.n0.n(this);
                        kotlin.jvm.internal.u.i(n11, "getInstance(...)");
                        n11.d("ImportStepsFromFit", ExistingPeriodicWorkPolicy.f19028c, new t.a(ImportStepsFromFit.class, 1L, TimeUnit.HOURS).b());
                        return;
                    } else {
                        androidx.work.impl.n0.n(this).i("ImportStepsFromFit");
                        return;
                    }
                }
                mm.a.d(this);
            } else if (i12 != 0) {
                if (i12 == 1) {
                    R3().B0();
                }
            } else {
                R3().getClass();
                lb0.g.d();
            }
        } else if (R3().z0()) {
            S3(C1987R.id.home);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Fragment Y = getSupportFragmentManager().Y(ConstantsWs.APPPFM_WEB);
        if (Y instanceof WebFragment) {
            WebFragment webFragment = (WebFragment) Y;
            if (webFragment.C1()) {
                webFragment.D1();
                return;
            }
        }
        if (getSupportFragmentManager().a0() <= 0 && R3().q0() != null) {
            if (Q3().f98895b.getCurrentItem() < this.f47957i.size()) {
                Fragment fragment = this.f47957i.get(Q3().f98895b.getCurrentItem());
                kotlin.jvm.internal.u.i(fragment, "get(...)");
                Fragment fragment2 = fragment;
                if (fragment2 instanceof pg0.e0) {
                    if (((pg0.e0) fragment2).f1()) {
                        super.onBackPressed();
                        return;
                    } else {
                        T3();
                        return;
                    }
                }
                S3(C1987R.id.home);
                return;
            }
            super.onBackPressed();
            return;
        }
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.u.j(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        recreate();
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.core.view.b0, java.lang.Object] */
    @Override // com.withings.wiscale2.Hilt_MainActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        Bundle extras;
        if (bundle == null) {
            Intent intent = getIntent();
            if (!intent.hasExtra("bundle")) {
                intent = null;
            }
            if (intent != null && (extras = intent.getExtras()) != null) {
                bundle = extras.getBundle("bundle");
            } else {
                bundle = null;
            }
        }
        int intExtra = getIntent().getIntExtra("navigationResId", 0);
        x3.a.a(new x3.a(this));
        super.onCreate(bundle);
        if (getIntent().hasExtra("fromNotification")) {
            ch0.d R3 = R3();
            Bundle extras2 = getIntent().getExtras();
            kotlin.jvm.internal.u.g(extras2);
            R3.K0(extras2);
        }
        androidx.core.view.l1.a(getWindow(), false);
        setContentView(C1987R.layout.activity_main);
        BlockableViewPager blockableViewPager = Q3().f98895b;
        blockableViewPager.setPagingEnabled(false);
        blockableViewPager.setOffscreenPageLimit(4);
        lb0.h p02 = R3().p0();
        if (R3().q0() != null) {
            p02.observe(this, new c(new c2(this)));
        }
        BottomNavigationView bottomNavigationView = Q3().f98894a;
        ea0.k kVar = this.f47961m;
        if (kVar != null) {
            bottomNavigationView.d(kVar.b());
            androidx.core.view.u0.p0(Q3().f98894a, new Object());
            Q3().f98894a.setOnItemSelectedListener(this);
            androidx.lifecycle.q.b(R3().m0(), null, 3).observe(this, new c(new b2(this)));
            Intent intent2 = getIntent();
            kotlin.jvm.internal.u.i(intent2, "getIntent(...)");
            if (intent2.getFlags() != 269484032) {
                if (bundle == null) {
                    P3();
                    gm.b.d(getIntent(), this);
                }
                Intent intent3 = getIntent();
                kotlin.jvm.internal.u.i(intent3, "getIntent(...)");
                gm.b.f(intent3, this, this);
            }
            if (!isTaskRoot()) {
                finish();
            }
            androidx.core.app.y.c(this).b(-123456, null);
            TimeZoneReceiver.a();
            ChangeLogTimelineDelegate changeLogTimelineDelegate = new ChangeLogTimelineDelegate();
            ww.b e11 = ww.b.e();
            kotlin.jvm.internal.u.i(e11, "get(...)");
            changeLogTimelineDelegate.showChangelogIfNecessary(this, e11, R3().q0());
            if (intExtra != 0) {
                S3(intExtra);
                return;
            }
            return;
        }
        kotlin.jvm.internal.u.s("bottomBarNavigationProvider");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        kotlin.jvm.internal.u.j(intent, "intent");
        super.onNewIntent(intent);
        P3();
        if (!gm.b.d(intent, this)) {
            q(intent, null);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i11, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.u.j(permissions, "permissions");
        kotlin.jvm.internal.u.j(grantResults, "grantResults");
        if (i11 == 8497) {
            boolean z5 = false;
            if (grantResults[0] == 0 && kotlin.jvm.internal.u.e(permissions[0], "android.permission.POST_NOTIFICATIONS")) {
                z5 = true;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("choice", Boolean.valueOf(z5));
            int i12 = v70.a.f103433b;
            v70.a.d("HomeTab", "enable_native_notification", hashMap, true);
            R3().M0();
            if (Build.VERSION.SDK_INT >= 31) {
                N3();
            }
        }
        super.onRequestPermissionsResult(i11, permissions, grantResults);
    }

    @Override // android.app.Activity
    protected final void onRestoreInstanceState(Bundle savedInstanceState) {
        kotlin.jvm.internal.u.j(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        setTitle(savedInstanceState.getString("title"));
        if (R3().q0() != null) {
            Q3().f98894a.setSelectedItemId(savedInstanceState.getInt("currentNavigationId", this.f47959k));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        int i11;
        super.onResume();
        BottomNavigationView bottomNavigationView = Q3().f98894a;
        boolean z5 = false;
        if (R3().q0() != null && P3()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        bottomNavigationView.setVisibility(i11);
        com.withings.wiscale2.device.hwa08.postinstall.b0.s(this, !ah.u.D(this), ah.u.w(16843857, this, -65281));
        if (R3().q0() != null && P3()) {
            if (!R3().z0()) {
                EditProfileActivity.a aVar = EditProfileActivity.f61841i;
                User q02 = R3().q0();
                kotlin.jvm.internal.u.g(q02);
                long q11 = q02.q();
                aVar.getClass();
                startActivityForResult(new Intent(EditProfileActivity.a.a(this, q11, true)), 4);
                return;
            }
            if (this.f47957i.isEmpty()) {
                int intExtra = getIntent().getIntExtra("navigationResId", 0);
                if (R3().q0() != null) {
                    ArrayList<Fragment> arrayList = new ArrayList<>();
                    User q03 = R3().q0();
                    arrayList.add(new pg0.b());
                    if (q03 != null) {
                        arrayList.add(new com.withings.measurements.ui.i2());
                        q30.a.f92070l.getClass();
                        q30.a aVar2 = new q30.a();
                        aVar2.setArguments(androidx.core.os.e.a(new nm0.j(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, q03)));
                        arrayList.add(aVar2);
                    }
                    this.f47957i = arrayList;
                    Q3().f98895b.setAdapter(new h2(this, getSupportFragmentManager()));
                    Q3().f98895b.c(new i2(this));
                }
                if (intExtra != 0) {
                    S3(intExtra);
                } else {
                    Q3().f98894a.setSelectedItemId(Q3().f98894a.getMenu().getItem(0).getItemId());
                }
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 33 && R3().t0("android.permission.POST_NOTIFICATIONS") && androidx.core.content.a.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") != 0 && !shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 8497);
                R3().O0("android.permission.POST_NOTIFICATIONS");
                z5 = true;
            }
            if (i12 >= 31 && !z5) {
                N3();
            }
        } else if (R3().k0() != null && R3().q0() == null) {
            this.f47964p.a(new Intent(this, AuthenticationActivity.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        CharSequence charSequence;
        kotlin.jvm.internal.u.j(outState, "outState");
        super.onSaveInstanceState(outState);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null && (charSequence = supportActionBar.f()) != null) {
            if (charSequence.length() == 0) {
                charSequence = getTitle();
            }
        } else {
            charSequence = null;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            outState.putString("title", String.valueOf(charSequence));
        }
        int i11 = this.f47959k;
        if (i11 != -1) {
            outState.putInt("currentNavigationId", i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        vh.h.b(this);
        super.onStop();
    }

    @Override // gm.b.a
    public final void q(Intent intent, String str) {
        String str2;
        kotlin.jvm.internal.u.j(intent, "intent");
        if (kotlin.jvm.internal.u.e(str, "achieve") || kotlin.jvm.internal.u.e(str, "library")) {
            int intExtra = intent.getIntExtra("navigationAchieveTab", 0);
            Iterator<Fragment> it = this.f47957i.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                if (next instanceof q30.a) {
                    ((q30.a) next).w1(intExtra);
                }
            }
        }
        if (intent.getComponent() != null) {
            ComponentName component = intent.getComponent();
            if (component != null) {
                str2 = component.getClassName();
            } else {
                str2 = null;
            }
            if (kotlin.jvm.internal.u.e(str2, MainActivity.class.getName())) {
                u70.a aVar = this.f47963o;
                if (aVar != null) {
                    if (!aVar.d(0L)) {
                        S3(intent.getIntExtra("navigationResId", 0));
                        return;
                    }
                } else {
                    kotlin.jvm.internal.u.s("backgroundManager");
                    throw null;
                }
            }
        }
        startActivity(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public final void startActivityFromFragment(Fragment fragment, Intent intent, int i11) {
        kotlin.jvm.internal.u.j(fragment, "fragment");
        kotlin.jvm.internal.u.j(intent, "intent");
        if (gm.b.d(intent, this)) {
            return;
        }
        super.startActivityFromFragment(fragment, intent, i11);
    }

    @Override // com.google.android.material.navigation.NavigationBarView.c
    public final void z1(MenuItem menuItem) {
        kotlin.jvm.internal.u.j(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (this.f47959k == itemId) {
            T3();
        } else {
            O3(itemId);
        }
    }
}
