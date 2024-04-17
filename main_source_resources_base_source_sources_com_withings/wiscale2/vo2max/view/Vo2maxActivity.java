package com.withings.wiscale2.vo2max.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.DatePagerTabStrip;
import androidx.viewpager.widget.ViewPager;
import com.withings.features.FeatureFlag;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.MeasuresGroup;
import com.withings.tutorials.core.model.ExplanationsType;
import com.withings.tutorials.ui.screens.explanations.ExplanationsActivity;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.tutorial.LegacyTutorialActivity;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: Vo2maxActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/vo2max/view/Vo2maxActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lpy/a;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Vo2maxActivity extends Hilt_Vo2maxActivity implements py.a {

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ int f62651r = 0;
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public fy.n f62652e;
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public p60.c f62653f;

    /* renamed from: i  reason: collision with root package name */
    private c2 f62656i;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f62654g = wr.b.c(FeatureFlag.T);

    /* renamed from: h  reason: collision with root package name */
    private List<? extends MeasuresGroup> f62655h = kotlin.collections.i0.f76187a;

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f62657j = nm0.h.b(new b());

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f62658k = nm0.h.b(new f());

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f62659l = nm0.h.b(new g());

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f62660m = nm0.h.b(new d());

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f62661n = nm0.h.b(new c());

    /* renamed from: o  reason: collision with root package name */
    private final nm0.g f62662o = nm0.h.b(new a());

    /* renamed from: p  reason: collision with root package name */
    private final nm0.g f62663p = nm0.h.b(new e());

    /* renamed from: q  reason: collision with root package name */
    private final String f62664q = ConstantsWs.SUBCATEGORY_FEATURE_VO2MAX;

    /* compiled from: Vo2maxActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<View> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final View invoke() {
            return Vo2maxActivity.this.findViewById(C1987R.id.app_bar);
        }
    }

    /* compiled from: Vo2maxActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<Long> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final Long invoke() {
            return Long.valueOf(Vo2maxActivity.this.getIntent().getLongExtra("key_initial_measure_id", -1L));
        }
    }

    /* compiled from: Vo2maxActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<View> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final View invoke() {
            return Vo2maxActivity.this.findViewById(C1987R.id.progress);
        }
    }

    /* compiled from: Vo2maxActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<DatePagerTabStrip> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final DatePagerTabStrip invoke() {
            return (DatePagerTabStrip) Vo2maxActivity.this.findViewById(C1987R.id.date_pager);
        }
    }

    /* compiled from: Vo2maxActivity.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<Toolbar> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final Toolbar invoke() {
            return (Toolbar) Vo2maxActivity.this.findViewById(C1987R.id.toolbar);
        }
    }

    /* compiled from: Vo2maxActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<User> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final User invoke() {
            Parcelable parcelableExtra = Vo2maxActivity.this.getIntent().getParcelableExtra("key_user");
            kotlin.jvm.internal.u.h(parcelableExtra, "null cannot be cast to non-null type com.withings.user.User");
            return (User) parcelableExtra;
        }
    }

    /* compiled from: Vo2maxActivity.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<ViewPager> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final ViewPager invoke() {
            return (ViewPager) Vo2maxActivity.this.findViewById(C1987R.id.view_pager);
        }
    }

    public static final User A3(Vo2maxActivity vo2maxActivity) {
        return (User) vo2maxActivity.f62658k.getValue();
    }

    public static final void D3(Vo2maxActivity vo2maxActivity) {
        Intent a11;
        boolean z5 = vo2maxActivity.f62654g;
        nm0.g gVar = vo2maxActivity.f62658k;
        if (z5) {
            LegacyTutorialActivity.a aVar = LegacyTutorialActivity.f53518k;
            Long valueOf = Long.valueOf(((User) gVar.getValue()).q());
            aVar.getClass();
            a11 = LegacyTutorialActivity.a.a(vo2maxActivity, 2, true, valueOf);
        } else {
            ExplanationsActivity.a aVar2 = ExplanationsActivity.f45078i;
            ExplanationsType explanationsType = ExplanationsType.f44581b;
            long q11 = ((User) gVar.getValue()).q();
            aVar2.getClass();
            a11 = ExplanationsActivity.a.a(vo2maxActivity, explanationsType, q11);
        }
        wq.a.q(vo2maxActivity, a11, new e1(vo2maxActivity));
    }

    public static final void E3(Vo2maxActivity vo2maxActivity, List list) {
        int i11;
        int i12;
        vo2maxActivity.f62655h = list;
        androidx.viewpager.widget.e adapter = vo2maxActivity.getViewPager().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        nm0.g gVar = vo2maxActivity.f62657j;
        if (((Number) gVar.getValue()).longValue() != -1) {
            Iterator<? extends MeasuresGroup> it = vo2maxActivity.f62655h.iterator();
            i12 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (it.next().getId() == ((Number) gVar.getValue()).longValue()) {
                        break;
                    }
                    i12++;
                } else {
                    i12 = -1;
                    break;
                }
            }
        } else {
            androidx.viewpager.widget.e adapter2 = vo2maxActivity.getViewPager().getAdapter();
            if (adapter2 != null) {
                i11 = adapter2.getCount();
            } else {
                i11 = 1;
            }
            i12 = i11 - 1;
        }
        vo2maxActivity.getViewPager().D(i12, false);
        Object value = vo2maxActivity.f62661n.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        ((View) value).setVisibility(8);
    }

    private final ViewPager getViewPager() {
        Object value = this.f62659l.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (ViewPager) value;
    }

    @Override // py.a
    public final String getAnalyticsDetailsViewIdentifier() {
        return this.f62664q;
    }

    @Override // com.withings.wiscale2.vo2max.view.Hilt_Vo2maxActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.core.view.l1.a(getWindow(), false);
        setContentView(C1987R.layout.activity_vo2max);
        Object value = this.f62661n.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        ((View) value).setVisibility(0);
        Object value2 = this.f62663p.getValue();
        kotlin.jvm.internal.u.i(value2, "getValue(...)");
        setSupportActionBar((Toolbar) value2);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        Object value3 = this.f62662o.getValue();
        kotlin.jvm.internal.u.i(value3, "getValue(...)");
        ay.b.n((View) value3, true, false, 29);
        d1 d1Var = new d1(this, getSupportFragmentManager());
        getViewPager().c(new c1(this, d1Var));
        getViewPager().setAdapter(d1Var);
        Object value4 = this.f62660m.getValue();
        kotlin.jvm.internal.u.i(value4, "getValue(...)");
        ((DatePagerTabStrip) value4).setPager(getViewPager());
        c2 c2Var = (c2) new androidx.lifecycle.k1(this, new a1(this)).a(c2.class);
        this.f62656i = c2Var;
        xw.d.c(this, c2Var.p0(), new b1(this));
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new f1(this, null), 3, null);
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
