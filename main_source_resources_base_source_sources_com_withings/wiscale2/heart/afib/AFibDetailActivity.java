package com.withings.wiscale2.heart.afib;

import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.library.measure.Measure;
import com.withings.views.view.BlockableViewPager;
import com.withings.wiscale2.C1987R;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: AFibDetailActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/heart/afib/AFibDetailActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/views/view/BlockableViewPager$b;", "Lpy/a;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AFibDetailActivity extends Hilt_AFibDetailActivity implements BlockableViewPager.b, py.a {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f57077j = 0;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f57078e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f57079f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f57080g;

    /* renamed from: h  reason: collision with root package name */
    private u0 f57081h;

    /* renamed from: i  reason: collision with root package name */
    private t0 f57082i;

    /* compiled from: AFibDetailActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<d80.a> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final d80.a invoke() {
            return d80.a.a(AFibDetailActivity.this.getLayoutInflater().inflate(C1987R.layout.activity_measurement_pager, (ViewGroup) null, false));
        }
    }

    /* compiled from: AFibDetailActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<Measure> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final Measure invoke() {
            Object obj;
            Intent intent = AFibDetailActivity.this.getIntent();
            kotlin.jvm.internal.u.i(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                obj = intent.getSerializableExtra("measure", Measure.class);
            } else {
                Serializable serializableExtra = intent.getSerializableExtra("measure");
                if (!(serializableExtra instanceof Measure)) {
                    serializableExtra = null;
                }
                obj = (Measure) serializableExtra;
            }
            kotlin.jvm.internal.u.g(obj);
            return (Measure) obj;
        }
    }

    /* compiled from: Extensions.kt */
    /* loaded from: classes5.dex */
    public static final class c implements k1.b {
        public c() {
        }

        @Override // androidx.lifecycle.k1.b
        public final <U extends g1> U create(Class<U> modelClass) {
            kotlin.jvm.internal.u.j(modelClass, "modelClass");
            AFibDetailActivity aFibDetailActivity = AFibDetailActivity.this;
            Application application = aFibDetailActivity.getApplication();
            kotlin.jvm.internal.u.i(application, "getApplication(...)");
            return new u0(application, AFibDetailActivity.A3(aFibDetailActivity), AFibDetailActivity.z3(aFibDetailActivity));
        }
    }

    /* compiled from: AFibDetailActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.l<n0, nm0.y> {
        d() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(n0 n0Var) {
            n0 n0Var2 = n0Var;
            kotlin.jvm.internal.u.g(n0Var2);
            AFibDetailActivity.B3(AFibDetailActivity.this, n0Var2);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: AFibDetailActivity.kt */
    /* loaded from: classes5.dex */
    static final class e implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f57087a;

        e(ym0.l lVar) {
            this.f57087a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f57087a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f57087a;
        }

        public final int hashCode() {
            return this.f57087a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f57087a.invoke(obj);
        }
    }

    /* compiled from: AFibDetailActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<Long> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final Long invoke() {
            long q11;
            AFibDetailActivity aFibDetailActivity = AFibDetailActivity.this;
            if (aFibDetailActivity.getIntent().hasExtra(HealthUserProfile.USER_PROFILE_KEY_USER_ID)) {
                q11 = aFibDetailActivity.getIntent().getLongExtra(HealthUserProfile.USER_PROFILE_KEY_USER_ID, -1L);
            } else {
                q11 = m70.i.b().e().q();
            }
            return Long.valueOf(q11);
        }
    }

    public AFibDetailActivity() {
        super(0);
        this.f57078e = nm0.h.b(new b());
        this.f57079f = nm0.h.b(new a());
        this.f57080g = nm0.h.b(new f());
    }

    public static final long A3(AFibDetailActivity aFibDetailActivity) {
        return ((Number) aFibDetailActivity.f57080g.getValue()).longValue();
    }

    public static final void B3(AFibDetailActivity aFibDetailActivity, n0 n0Var) {
        aFibDetailActivity.getClass();
        if (n0Var.b().isEmpty()) {
            aFibDetailActivity.finish();
            return;
        }
        t0 t0Var = aFibDetailActivity.f57082i;
        if (t0Var != null) {
            if (!kotlin.jvm.internal.u.e(t0Var.a(), n0Var.b())) {
                t0 t0Var2 = aFibDetailActivity.f57082i;
                if (t0Var2 != null) {
                    t0Var2.b(n0Var.b());
                    aFibDetailActivity.C3().f63578f.D(n0Var.a(), false);
                } else {
                    kotlin.jvm.internal.u.s("pagerAdapter");
                    throw null;
                }
            }
            ProgressBar loading = aFibDetailActivity.C3().f63575c;
            kotlin.jvm.internal.u.i(loading, "loading");
            loading.setVisibility(8);
            return;
        }
        kotlin.jvm.internal.u.s("pagerAdapter");
        throw null;
    }

    private final d80.a C3() {
        return (d80.a) this.f57079f.getValue();
    }

    public static final Measure z3(AFibDetailActivity aFibDetailActivity) {
        return (Measure) aFibDetailActivity.f57078e.getValue();
    }

    @Override // com.withings.views.view.BlockableViewPager.b
    public final void Q1(boolean z5) {
        C3().f63578f.setPagingEnabled(z5);
    }

    @Override // py.a
    public final String getAnalyticsDetailsViewIdentifier() {
        return "afib_event";
    }

    @Override // com.withings.wiscale2.heart.afib.Hilt_AFibDetailActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        int i11;
        super.onCreate(bundle);
        setContentView(C3().f63576d);
        ProgressBar loading = C3().f63575c;
        kotlin.jvm.internal.u.i(loading, "loading");
        loading.setVisibility(0);
        if (((Measure) this.f57078e.getValue()).getType() == 145) {
            i11 = C1987R.string.heartEvents_nonMedical_title;
        } else {
            i11 = C1987R.string.heartEvents_afib_title;
        }
        setTitle(i11);
        setSupportActionBar(C3().f63577e);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        u0 u0Var = (u0) new k1(this, new c()).a(u0.class);
        u0Var.g0().observe(this, new e(new d()));
        this.f57081h = u0Var;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        kotlin.jvm.internal.u.i(supportFragmentManager, "getSupportFragmentManager(...)");
        u0 u0Var2 = this.f57081h;
        if (u0Var2 != null) {
            this.f57082i = new t0(this, supportFragmentManager, u0Var2.i0());
            BlockableViewPager blockableViewPager = C3().f63578f;
            t0 t0Var = this.f57082i;
            if (t0Var != null) {
                blockableViewPager.setAdapter(t0Var);
                C3().f63574b.setPager(C3().f63578f);
                return;
            }
            kotlin.jvm.internal.u.s("pagerAdapter");
            throw null;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        finish();
        return super.onOptionsItemSelected(item);
    }
}
