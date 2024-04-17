package com.withings.ecg.heartsound;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.k1;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.views.view.BlockableViewPager;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
/* compiled from: HeartSoundListActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withings/ecg/heartsound/HeartSoundListActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/views/view/BlockableViewPager$b;", "Lpy/a;", "<init>", "()V", "a", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class HeartSoundListActivity extends Hilt_HeartSoundListActivity implements BlockableViewPager.b, py.a {

    /* renamed from: e  reason: collision with root package name */
    private final c f38404e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f38405f;

    /* renamed from: g  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f38406g;

    /* renamed from: h  reason: collision with root package name */
    private u0 f38407h;

    /* renamed from: i  reason: collision with root package name */
    private b0 f38408i;

    /* renamed from: j  reason: collision with root package name */
    private final String f38409j;

    /* renamed from: l  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f38403l = {androidx.camera.core.v.c(HeartSoundListActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(HeartSoundListActivity.class, "binding", "getBinding()Lcom/withings/views/databinding/ActivityMeasurementPagerBinding;", 0)};

    /* renamed from: k  reason: collision with root package name */
    public static final a f38402k = new Object();

    /* compiled from: HeartSoundListActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* compiled from: HeartSoundListActivity.kt */
    /* loaded from: classes3.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<Long> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final Long invoke() {
            long longExtra = HeartSoundListActivity.this.getIntent().getLongExtra("ecg_id", -1L);
            Long valueOf = Long.valueOf(longExtra);
            if (longExtra == -1) {
                return null;
            }
            return valueOf;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class c implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f38411a = nm0.h.b(new n0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f38412b;

        public c(Activity activity) {
            this.f38412b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f38411a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.l<ComponentActivity, d80.a> {
        @Override // ym0.l
        public final d80.a invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            kotlin.jvm.internal.u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.root);
            kotlin.jvm.internal.u.i(e11, "requireViewById(this, id)");
            return d80.a.a(e11);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public HeartSoundListActivity() {
        super(0);
        this.f38404e = new c(this);
        this.f38405f = nm0.h.b(new b());
        this.f38406g = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new kotlin.jvm.internal.w(1));
        this.f38409j = "heart_sound";
    }

    public static final User B3(HeartSoundListActivity heartSoundListActivity) {
        return (User) heartSoundListActivity.f38404e.getValue(heartSoundListActivity, f38403l[0]);
    }

    public static final void C3(HeartSoundListActivity heartSoundListActivity, t0 t0Var) {
        heartSoundListActivity.getClass();
        if (t0Var.b().isEmpty()) {
            heartSoundListActivity.finish();
            return;
        }
        b0 b0Var = heartSoundListActivity.f38408i;
        if (b0Var != null) {
            if (b0Var.a().isEmpty()) {
                b0 b0Var2 = heartSoundListActivity.f38408i;
                if (b0Var2 != null) {
                    b0Var2.c(t0Var.b());
                    heartSoundListActivity.D3().f63578f.D(t0Var.a(), false);
                } else {
                    kotlin.jvm.internal.u.s("pagerAdapter");
                    throw null;
                }
            } else {
                b0 b0Var3 = heartSoundListActivity.f38408i;
                if (b0Var3 != null) {
                    if (!kotlin.jvm.internal.u.e(b0Var3.a(), t0Var.b())) {
                        b0 b0Var4 = heartSoundListActivity.f38408i;
                        if (b0Var4 != null) {
                            b0Var4.c(t0Var.b());
                        } else {
                            kotlin.jvm.internal.u.s("pagerAdapter");
                            throw null;
                        }
                    }
                } else {
                    kotlin.jvm.internal.u.s("pagerAdapter");
                    throw null;
                }
            }
            ProgressBar loading = heartSoundListActivity.D3().f63575c;
            kotlin.jvm.internal.u.i(loading, "loading");
            loading.setVisibility(8);
            return;
        }
        kotlin.jvm.internal.u.s("pagerAdapter");
        throw null;
    }

    private final d80.a D3() {
        Object value = ((LifecycleViewBindingProperty) this.f38406g).getValue(this, f38403l[1]);
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (d80.a) value;
    }

    public static final Long z3(HeartSoundListActivity heartSoundListActivity) {
        return (Long) heartSoundListActivity.f38405f.getValue();
    }

    @Override // com.withings.views.view.BlockableViewPager.b
    public final void Q1(boolean z5) {
        D3().f63578f.setPagingEnabled(z5);
    }

    @Override // py.a
    public final String getAnalyticsDetailsViewIdentifier() {
        return this.f38409j;
    }

    @Override // com.withings.ecg.heartsound.Hilt_HeartSoundListActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressBar loading = D3().f63575c;
        kotlin.jvm.internal.u.i(loading, "loading");
        loading.setVisibility(0);
        setSupportActionBar(D3().f63577e);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        u0 u0Var = (u0) new k1(this, new j0(this)).a(u0.class);
        xw.d.c(this, u0Var.i0(), new k0(this));
        xw.d.c(this, u0Var.g0(), new l0(this));
        this.f38407h = u0Var;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        kotlin.jvm.internal.u.i(supportFragmentManager, "getSupportFragmentManager(...)");
        u0 u0Var2 = this.f38407h;
        if (u0Var2 != null) {
            this.f38408i = new b0(supportFragmentManager, u0Var2.j0());
            d80.a D3 = D3();
            D3.f63578f.c(new m0(this));
            d80.a D32 = D3();
            b0 b0Var = this.f38408i;
            if (b0Var != null) {
                D32.f63578f.setAdapter(b0Var);
                d80.a D33 = D3();
                D33.f63574b.setPager(D3().f63578f);
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
        if (item.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
