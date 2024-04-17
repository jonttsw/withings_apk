package com.withings.wiscale2.heart.afib;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.ChipGroup;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
/* compiled from: AFibMeasuresListActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/heart/afib/AFibMeasuresListActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AFibMeasuresListActivity extends Hilt_AFibMeasuresListActivity {

    /* renamed from: h  reason: collision with root package name */
    private tb0.b f57094h;

    /* renamed from: j  reason: collision with root package name */
    private v f57096j;
    @Inject

    /* renamed from: k  reason: collision with root package name */
    public fy.o f57097k;

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f57090m = {androidx.camera.core.v.c(AFibMeasuresListActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(AFibMeasuresListActivity.class, "dateStart", "getDateStart()J", 0), androidx.camera.core.v.c(AFibMeasuresListActivity.class, "isMedical", "isMedical()Z", 0)};

    /* renamed from: l  reason: collision with root package name */
    public static final a f57089l = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final f f57091e = new f(this);

    /* renamed from: f  reason: collision with root package name */
    private final g f57092f = new g(this);

    /* renamed from: g  reason: collision with root package name */
    private final h f57093g = new h(this);

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f57095i = nm0.h.b(new b());

    /* compiled from: AFibMeasuresListActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: AFibMeasuresListActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<m0> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final m0 invoke() {
            AFibMeasuresListActivity aFibMeasuresListActivity = AFibMeasuresListActivity.this;
            return new m0(aFibMeasuresListActivity, AFibMeasuresListActivity.D3(aFibMeasuresListActivity), true, false);
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
            AFibMeasuresListActivity aFibMeasuresListActivity = AFibMeasuresListActivity.this;
            long C3 = AFibMeasuresListActivity.C3(aFibMeasuresListActivity);
            fy.o oVar = aFibMeasuresListActivity.f57097k;
            if (oVar != null) {
                return new v(C3, oVar, AFibMeasuresListActivity.D3(aFibMeasuresListActivity), AFibMeasuresListActivity.E3(aFibMeasuresListActivity));
            }
            kotlin.jvm.internal.u.s("getMeasuresGroupList");
            throw null;
        }
    }

    /* compiled from: AFibMeasuresListActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.l<List<? extends ky.d>, nm0.y> {
        d() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(List<? extends ky.d> list) {
            AFibMeasuresListActivity.B3(AFibMeasuresListActivity.this).submitList(list);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: AFibMeasuresListActivity.kt */
    /* loaded from: classes5.dex */
    static final class e implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f57101a;

        e(ym0.l lVar) {
            this.f57101a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f57101a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f57101a;
        }

        public final int hashCode() {
            return this.f57101a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f57101a.invoke(obj);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class f implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57102a = nm0.h.b(new q(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f57103b;

        public f(Activity activity) {
            this.f57103b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f57102a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class g implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57104a = nm0.h.b(new r(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f57105b;

        public g(Activity activity) {
            this.f57105b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f57104a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class h implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57106a = nm0.h.b(new s(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f57107b;

        public h(Activity activity) {
            this.f57107b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f57106a.getValue();
        }
    }

    public static void A3(AFibMeasuresListActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        tb0.b bVar = this$0.f57094h;
        if (bVar != null) {
            bVar.f98867g.w(0);
        } else {
            kotlin.jvm.internal.u.s("binding");
            throw null;
        }
    }

    public static final m0 B3(AFibMeasuresListActivity aFibMeasuresListActivity) {
        return (m0) aFibMeasuresListActivity.f57095i.getValue();
    }

    public static final long C3(AFibMeasuresListActivity aFibMeasuresListActivity) {
        return ((Number) aFibMeasuresListActivity.f57092f.getValue(aFibMeasuresListActivity, f57090m[1])).longValue();
    }

    public static final User D3(AFibMeasuresListActivity aFibMeasuresListActivity) {
        return (User) aFibMeasuresListActivity.f57091e.getValue(aFibMeasuresListActivity, f57090m[0]);
    }

    public static final boolean E3(AFibMeasuresListActivity aFibMeasuresListActivity) {
        return ((Boolean) aFibMeasuresListActivity.f57093g.getValue(aFibMeasuresListActivity, f57090m[2])).booleanValue();
    }

    public static void z3(AFibMeasuresListActivity this$0, ChipGroup chipGroup) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(chipGroup, "<anonymous parameter 0>");
        v vVar = this$0.f57096j;
        if (vVar != null) {
            tb0.b bVar = this$0.f57094h;
            if (bVar != null) {
                boolean isChecked = bVar.f98862b.isChecked();
                tb0.b bVar2 = this$0.f57094h;
                if (bVar2 != null) {
                    boolean isChecked2 = bVar2.f98863c.isChecked();
                    tb0.b bVar3 = this$0.f57094h;
                    if (bVar3 != null) {
                        vVar.m0(isChecked, isChecked2, bVar3.f98864d.isChecked());
                        return;
                    } else {
                        kotlin.jvm.internal.u.s("binding");
                        throw null;
                    }
                }
                kotlin.jvm.internal.u.s("binding");
                throw null;
            }
            kotlin.jvm.internal.u.s("binding");
            throw null;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    @Override // com.withings.wiscale2.heart.afib.Hilt_AFibMeasuresListActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        tb0.b b10 = tb0.b.b(getLayoutInflater());
        this.f57094h = b10;
        setContentView(b10.a());
        tb0.b bVar = this.f57094h;
        if (bVar != null) {
            setSupportActionBar(bVar.f98868h);
            ActionBar supportActionBar = getSupportActionBar();
            kotlin.jvm.internal.u.g(supportActionBar);
            supportActionBar.o(true);
            tb0.b bVar2 = this.f57094h;
            if (bVar2 != null) {
                bVar2.f98868h.setOnClickListener(new gi.f(this, 17));
                tb0.b bVar3 = this.f57094h;
                if (bVar3 != null) {
                    bVar3.f98866f.setAdapter((m0) this.f57095i.getValue());
                    tb0.b bVar4 = this.f57094h;
                    if (bVar4 != null) {
                        RecyclerView manualList = bVar4.f98866f;
                        kotlin.jvm.internal.u.i(manualList, "manualList");
                        zq.b.a(manualList, C1987R.drawable.list_divider_thick_with_margins, 1);
                        tb0.b bVar5 = this.f57094h;
                        if (bVar5 != null) {
                            bVar5.f98865e.setOnCheckedChangeListener(new androidx.camera.camera2.internal.n0(this));
                            v vVar = (v) new k1(this, new c()).a(v.class);
                            vVar.k0().observe(this, new e(new d()));
                            this.f57096j = vVar;
                            return;
                        }
                        kotlin.jvm.internal.u.s("binding");
                        throw null;
                    }
                    kotlin.jvm.internal.u.s("binding");
                    throw null;
                }
                kotlin.jvm.internal.u.s("binding");
                throw null;
            }
            kotlin.jvm.internal.u.s("binding");
            throw null;
        }
        kotlin.jvm.internal.u.s("binding");
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
