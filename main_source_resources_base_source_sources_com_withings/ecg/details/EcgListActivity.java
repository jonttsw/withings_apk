package com.withings.ecg.details;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.FragmentManager;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.google.android.material.appbar.AppBarLayout;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.views.view.BlockableViewPager;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: EcgListActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withings/ecg/details/EcgListActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/views/view/BlockableViewPager$b;", "Lpy/a;", "<init>", "()V", "a", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class EcgListActivity extends Hilt_EcgListActivity implements BlockableViewPager.b, py.a {

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f38010e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f38011f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f38012g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f38013h;

    /* renamed from: i  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f38014i;
    @Inject

    /* renamed from: j  reason: collision with root package name */
    public v1 f38015j;

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f38016k;

    /* renamed from: l  reason: collision with root package name */
    private x0 f38017l;

    /* renamed from: m  reason: collision with root package name */
    private final String f38018m;

    /* renamed from: o  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f38009o = {androidx.camera.core.v.c(EcgListActivity.class, "layout", "getLayout()Lcom/withings/views/databinding/ActivityMeasurementPagerBinding;", 0)};

    /* renamed from: n  reason: collision with root package name */
    public static final a f38008n = new Object();

    /* compiled from: EcgListActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static Intent a(a aVar, Context context, long j5, Long l5, Long l6, Long l11, int i11) {
            if ((i11 & 4) != 0) {
                l5 = null;
            }
            if ((i11 & 8) != 0) {
                l6 = null;
            }
            if ((i11 & 16) != 0) {
                l11 = null;
            }
            aVar.getClass();
            kotlin.jvm.internal.u.j(context, "context");
            Intent putExtra = new Intent(context, EcgListActivity.class).putExtra(HealthUserProfile.USER_PROFILE_KEY_USER_ID, j5).putExtra("ecg_id", l5).putExtra("ws_measure_groupId", l6).putExtra("local_measure_group_id", l11);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: EcgListActivity.kt */
    /* loaded from: classes3.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<Long> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final Long invoke() {
            Intent intent = EcgListActivity.this.getIntent();
            kotlin.jvm.internal.u.i(intent, "getIntent(...)");
            return bh.b.a(intent, "ecg_id");
        }
    }

    /* compiled from: EcgListActivity.kt */
    /* loaded from: classes3.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<Long> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Long invoke() {
            Intent intent = EcgListActivity.this.getIntent();
            kotlin.jvm.internal.u.i(intent, "getIntent(...)");
            return bh.b.a(intent, "local_measure_group_id");
        }
    }

    /* compiled from: EcgListActivity.kt */
    /* loaded from: classes3.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<Long> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final Long invoke() {
            Intent intent = EcgListActivity.this.getIntent();
            kotlin.jvm.internal.u.i(intent, "getIntent(...)");
            return bh.b.a(intent, "ws_measure_groupId");
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.l<ComponentActivity, d80.a> {
        @Override // ym0.l
        public final d80.a invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            kotlin.jvm.internal.u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.root);
            kotlin.jvm.internal.u.i(e11, "requireViewById(this, id)");
            return d80.a.a(e11);
        }
    }

    /* compiled from: EcgListActivity.kt */
    /* loaded from: classes3.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<Long> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final Long invoke() {
            Intent intent = EcgListActivity.this.getIntent();
            kotlin.jvm.internal.u.i(intent, "getIntent(...)");
            return bh.b.a(intent, HealthUserProfile.USER_PROFILE_KEY_USER_ID);
        }
    }

    /* compiled from: EcgListActivity.kt */
    /* loaded from: classes3.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<t1> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final t1 invoke() {
            EcgListActivity ecgListActivity = EcgListActivity.this;
            return (t1) new androidx.lifecycle.k1(ecgListActivity, new r1(ecgListActivity)).a(t1.class);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public EcgListActivity() {
        super(0);
        this.f38010e = nm0.h.b(new f());
        this.f38011f = nm0.h.b(new b());
        this.f38012g = nm0.h.b(new d());
        this.f38013h = nm0.h.b(new c());
        this.f38014i = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new kotlin.jvm.internal.w(1));
        this.f38016k = nm0.h.b(new g());
        this.f38018m = ConstantsWs.JSON_SESSION_KEY_ECG;
    }

    public static final Long A3(EcgListActivity ecgListActivity) {
        return (Long) ecgListActivity.f38013h.getValue();
    }

    public static final Long B3(EcgListActivity ecgListActivity) {
        return (Long) ecgListActivity.f38012g.getValue();
    }

    public static final Long D3(EcgListActivity ecgListActivity) {
        return (Long) ecgListActivity.f38010e.getValue();
    }

    public static final void E3(EcgListActivity ecgListActivity, m1 m1Var) {
        ecgListActivity.getClass();
        if (m1Var.b().isEmpty()) {
            ecgListActivity.finish();
            return;
        }
        x0 x0Var = ecgListActivity.f38017l;
        if (x0Var != null) {
            if (!kotlin.jvm.internal.u.e(x0Var.b(), m1Var.b())) {
                x0 x0Var2 = ecgListActivity.f38017l;
                if (x0Var2 != null) {
                    x0Var2.c(m1Var.b());
                    ecgListActivity.F3().f63578f.D(m1Var.a(), false);
                } else {
                    kotlin.jvm.internal.u.s("pagerAdapter");
                    throw null;
                }
            }
            ProgressBar loading = ecgListActivity.F3().f63575c;
            kotlin.jvm.internal.u.i(loading, "loading");
            loading.setVisibility(8);
            return;
        }
        kotlin.jvm.internal.u.s("pagerAdapter");
        throw null;
    }

    private final d80.a F3() {
        Object value = ((LifecycleViewBindingProperty) this.f38014i).getValue(this, f38009o[0]);
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (d80.a) value;
    }

    public static final Long z3(EcgListActivity ecgListActivity) {
        return (Long) ecgListActivity.f38011f.getValue();
    }

    @Override // com.withings.views.view.BlockableViewPager.b
    public final void Q1(boolean z5) {
        F3().f63578f.setPagingEnabled(z5);
    }

    @Override // py.a
    public final String getAnalyticsDetailsViewIdentifier() {
        return this.f38018m;
    }

    @Override // com.withings.ecg.details.Hilt_EcgListActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressBar loading = F3().f63575c;
        kotlin.jvm.internal.u.i(loading, "loading");
        loading.setVisibility(0);
        androidx.core.view.l1.a(getWindow(), false);
        setSupportActionBar(F3().f63577e);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        AppBarLayout appBar = F3().f63573a;
        kotlin.jvm.internal.u.i(appBar, "appBar");
        ay.b.n(appBar, true, false, 29);
        Long l5 = (Long) this.f38010e.getValue();
        nm0.g gVar = this.f38016k;
        if (l5 != null) {
            long longValue = l5.longValue();
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            kotlin.jvm.internal.u.i(supportFragmentManager, "getSupportFragmentManager(...)");
            this.f38017l = new x0(supportFragmentManager, ((t1) gVar.getValue()).r0(), longValue);
            d80.a F3 = F3();
            F3.f63578f.c(new p1(this));
            d80.a F32 = F3();
            x0 x0Var = this.f38017l;
            if (x0Var != null) {
                F32.f63578f.setAdapter(x0Var);
                d80.a F33 = F3();
                F33.f63574b.setPager(F3().f63578f);
                nm0.y yVar = nm0.y.f85009a;
            } else {
                kotlin.jvm.internal.u.s("pagerAdapter");
                throw null;
            }
        } else {
            new q1(this);
        }
        t1 t1Var = (t1) gVar.getValue();
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(t1Var), null, null, new n1(t1Var, this, null), 3, null);
        xw.d.c(this, t1Var.q0(), new o1(this));
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
