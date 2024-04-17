package com.withings.weight.legacy;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.l0;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.user.User;
import com.withings.weight.legacy.n;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
import org.joda.time.DateTime;
/* compiled from: WeightDetailActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withings/weight/legacy/WeightDetailActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/weight/legacy/n$b;", "Lpy/a;", "<init>", "()V", "a", "weight_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WeightDetailActivity extends Hilt_WeightDetailActivity implements n.b, py.a {

    /* renamed from: e  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f47007e;

    /* renamed from: f  reason: collision with root package name */
    private final e f47008f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f47009g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f47010h;

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f47011i;
    @Inject

    /* renamed from: j  reason: collision with root package name */
    public fy.n f47012j;

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f47013k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f47014l;

    /* renamed from: m  reason: collision with root package name */
    private final String f47015m;

    /* renamed from: o  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f47006o = {androidx.camera.core.v.c(WeightDetailActivity.class, "binding", "getBinding()Lcom/withings/weight/databinding/ActivityViewMeasuresViewpagerBinding;", 0), androidx.camera.core.v.c(WeightDetailActivity.class, "measurementType", "getMeasurementType()I", 0)};

    /* renamed from: n  reason: collision with root package name */
    public static final a f47005n = new Object();

    /* compiled from: WeightDetailActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    /* compiled from: WeightDetailActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<ky.d> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final ky.d invoke() {
            Object obj;
            Intent intent = WeightDetailActivity.this.getIntent();
            kotlin.jvm.internal.u.i(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                obj = intent.getSerializableExtra("EXTRA_MEASURE_GROUP", ky.d.class);
            } else {
                Object serializableExtra = intent.getSerializableExtra("EXTRA_MEASURE_GROUP");
                if (!(serializableExtra instanceof ky.d)) {
                    serializableExtra = null;
                }
                obj = (ky.d) serializableExtra;
            }
            return (ky.d) obj;
        }
    }

    /* compiled from: WeightDetailActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<com.withings.weight.legacy.c> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final com.withings.weight.legacy.c invoke() {
            Long l5;
            WeightDetailActivity weightDetailActivity = WeightDetailActivity.this;
            User C3 = WeightDetailActivity.C3(weightDetailActivity);
            int A3 = WeightDetailActivity.A3(weightDetailActivity);
            ky.d B3 = WeightDetailActivity.B3(weightDetailActivity);
            if (B3 != null) {
                l5 = Long.valueOf(B3.d());
            } else {
                l5 = null;
            }
            fy.n nVar = weightDetailActivity.f47012j;
            if (nVar != null) {
                return new com.withings.weight.legacy.c(C3, A3, l5, nVar);
            }
            kotlin.jvm.internal.u.s("getMeasureGroupsWithAllTypes");
            throw null;
        }
    }

    /* compiled from: WeightDetailActivity.kt */
    /* loaded from: classes4.dex */
    static final class d implements l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f47018a;

        d(ym0.l lVar) {
            this.f47018a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f47018a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f47018a;
        }

        public final int hashCode() {
            return this.f47018a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f47018a.invoke(obj);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class e implements bn0.d<Activity, Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f47019a = nm0.h.b(new j(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f47020b;

        public e(Activity activity) {
            this.f47020b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Integer] */
        @Override // bn0.d
        public final Integer getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f47019a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.l<ComponentActivity, e90.a> {
        @Override // ym0.l
        public final e90.a invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            kotlin.jvm.internal.u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.container);
            kotlin.jvm.internal.u.i(e11, "requireViewById(this, id)");
            return e90.a.a(e11);
        }
    }

    /* compiled from: WeightDetailActivity.kt */
    /* loaded from: classes4.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<User> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final User invoke() {
            User user;
            WeightDetailActivity weightDetailActivity = WeightDetailActivity.this;
            ky.d B3 = WeightDetailActivity.B3(weightDetailActivity);
            if (B3 != null) {
                user = WeightDetailActivity.D3(weightDetailActivity).i(B3.h());
            } else {
                user = null;
            }
            if (user == null) {
                User e11 = WeightDetailActivity.D3(weightDetailActivity).e();
                kotlin.jvm.internal.u.i(e11, "getMainUser(...)");
                return e11;
            }
            return user;
        }
    }

    /* compiled from: WeightDetailActivity.kt */
    /* loaded from: classes4.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.a<m70.i> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f47022a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final m70.i invoke() {
            return m70.i.b();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public WeightDetailActivity() {
        super(0);
        this.f47007e = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new kotlin.jvm.internal.w(1));
        this.f47008f = new e(this);
        this.f47009g = nm0.h.b(h.f47022a);
        this.f47010h = nm0.h.b(new b());
        this.f47011i = nm0.h.b(new g());
        this.f47013k = nm0.h.b(new c());
        this.f47015m = "body_weight";
    }

    public static final int A3(WeightDetailActivity weightDetailActivity) {
        return ((Number) weightDetailActivity.f47008f.getValue(weightDetailActivity, f47006o[1])).intValue();
    }

    public static final ky.d B3(WeightDetailActivity weightDetailActivity) {
        return (ky.d) weightDetailActivity.f47010h.getValue();
    }

    public static final User C3(WeightDetailActivity weightDetailActivity) {
        return (User) weightDetailActivity.f47011i.getValue();
    }

    public static final m70.i D3(WeightDetailActivity weightDetailActivity) {
        return (m70.i) weightDetailActivity.f47009g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e90.a E3() {
        Object value = ((LifecycleViewBindingProperty) this.f47007e).getValue(this, f47006o[0]);
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (e90.a) value;
    }

    @Override // android.app.Activity
    public final void finish() {
        DateTime dateTime;
        if (this.f47014l) {
            ky.d dVar = (ky.d) this.f47010h.getValue();
            if (dVar != null) {
                dateTime = dVar.c();
            } else {
                dateTime = null;
            }
            DateTime dateTime2 = new DateTime(dateTime);
            Intent intent = new Intent();
            intent.putExtra("EXTRA_DELETED_MEASURES_GROUP_DATE", dateTime2);
            setResult(3, intent);
        }
        super.finish();
    }

    @Override // py.a
    public final String getAnalyticsDetailsViewIdentifier() {
        return this.f47015m;
    }

    @Override // com.withings.weight.legacy.Hilt_WeightDetailActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setSupportActionBar(E3().f64953c);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        e90.a E3 = E3();
        E3.f64951a.c(new com.withings.weight.legacy.h(this));
        com.withings.weight.legacy.c cVar = (com.withings.weight.legacy.c) this.f47013k.getValue();
        cVar.i0().observe(this, new d(new com.withings.weight.legacy.e(this)));
        cVar.g0().observe(this, new d(new com.withings.weight.legacy.f(this)));
        cVar.f0().observe(this, new d(new com.withings.weight.legacy.g(this)));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (16908332 == item.getItemId()) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.withings.weight.legacy.n.b
    public final void s(n weightDetailFragment) {
        kotlin.jvm.internal.u.j(weightDetailFragment, "weightDetailFragment");
        this.f47014l = true;
    }
}
