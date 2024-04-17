package com.withings.wiscale2.spo2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.l1;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.k1;
import androidx.lifecycle.l0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.views.view.SectionView;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import ji0.c0;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import tb0.t0;
/* compiled from: SpO2MeasuresListActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/spo2/SpO2MeasuresListActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SpO2MeasuresListActivity extends Hilt_SpO2MeasuresListActivity {

    /* renamed from: g  reason: collision with root package name */
    private t0 f61599g;

    /* renamed from: j  reason: collision with root package name */
    private y f61602j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f61603k;
    @Inject

    /* renamed from: l  reason: collision with root package name */
    public fy.l f61604l;
    @Inject

    /* renamed from: m  reason: collision with root package name */
    public fy.b f61605m;
    @Inject

    /* renamed from: n  reason: collision with root package name */
    public kn.e f61606n;

    /* renamed from: p  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f61596p = {androidx.camera.core.v.c(SpO2MeasuresListActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(SpO2MeasuresListActivity.class, "dateStart", "getDateStart()J", 0)};

    /* renamed from: o  reason: collision with root package name */
    public static final a f61595o = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final f f61597e = new f(this);

    /* renamed from: f  reason: collision with root package name */
    private final g f61598f = new g(this);

    /* renamed from: h  reason: collision with root package name */
    private final a0 f61600h = new a0(null);

    /* renamed from: i  reason: collision with root package name */
    private final a0 f61601i = new a0(null);

    /* compiled from: SpO2MeasuresListActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(long j5, Context context, User user) {
            kotlin.jvm.internal.u.j(user, "user");
            Intent putExtra = new Intent(context, SpO2MeasuresListActivity.class).putExtra("extra_user", user).putExtra("extra_date_start", j5);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: Extensions.kt */
    /* loaded from: classes5.dex */
    public static final class b implements k1.b {
        public b() {
        }

        @Override // androidx.lifecycle.k1.b
        public final <U extends g1> U create(Class<U> modelClass) {
            kotlin.jvm.internal.u.j(modelClass, "modelClass");
            SpO2MeasuresListActivity spO2MeasuresListActivity = SpO2MeasuresListActivity.this;
            long C3 = SpO2MeasuresListActivity.C3(spO2MeasuresListActivity);
            fy.l lVar = spO2MeasuresListActivity.f61604l;
            if (lVar != null) {
                fy.b bVar = spO2MeasuresListActivity.f61605m;
                if (bVar != null) {
                    return new y(C3, lVar, bVar, SpO2MeasuresListActivity.E3(spO2MeasuresListActivity));
                }
                kotlin.jvm.internal.u.s("deleteMeasuresGroupsUseCase");
                throw null;
            }
            kotlin.jvm.internal.u.s("getMeasureGroupsWithAllTypesBetween");
            throw null;
        }
    }

    /* compiled from: SpO2MeasuresListActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<List<? extends ky.d>, nm0.y> {
        c() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(List<? extends ky.d> list) {
            int i11;
            int i12;
            List<? extends ky.d> list2 = list;
            SpO2MeasuresListActivity spO2MeasuresListActivity = SpO2MeasuresListActivity.this;
            spO2MeasuresListActivity.invalidateOptionsMenu();
            t0 t0Var = spO2MeasuresListActivity.f61599g;
            if (t0Var != null) {
                RecyclerView manualList = (RecyclerView) t0Var.f99497f;
                kotlin.jvm.internal.u.i(manualList, "manualList");
                int i13 = 0;
                if (list2.isEmpty()) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                manualList.setVisibility(i11);
                t0 t0Var2 = spO2MeasuresListActivity.f61599g;
                if (t0Var2 != null) {
                    SectionView manualLabel = (SectionView) t0Var2.f99495d;
                    kotlin.jvm.internal.u.i(manualLabel, "manualLabel");
                    if (list2.isEmpty()) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    manualLabel.setVisibility(i12);
                    t0 t0Var3 = spO2MeasuresListActivity.f61599g;
                    if (t0Var3 != null) {
                        View divider = t0Var3.f99498g;
                        kotlin.jvm.internal.u.i(divider, "divider");
                        if (list2.isEmpty()) {
                            i13 = 8;
                        }
                        divider.setVisibility(i13);
                        if (!list2.isEmpty()) {
                            a0 a0Var = spO2MeasuresListActivity.f61600h;
                            List<? extends ky.d> list3 = list2;
                            ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list3, 10));
                            for (ky.d dVar : list3) {
                                arrayList.add(new c0.b(dVar));
                            }
                            a0Var.submitList(arrayList);
                        }
                        return nm0.y.f85009a;
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
    }

    /* compiled from: SpO2MeasuresListActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.l<List<? extends Vasistas>, nm0.y> {
        d() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Comparator] */
        @Override // ym0.l
        public final nm0.y invoke(List<? extends Vasistas> list) {
            int i11;
            List<? extends Vasistas> list2 = list;
            SpO2MeasuresListActivity spO2MeasuresListActivity = SpO2MeasuresListActivity.this;
            t0 t0Var = spO2MeasuresListActivity.f61599g;
            if (t0Var != null) {
                RecyclerView autoList = (RecyclerView) t0Var.f99496e;
                kotlin.jvm.internal.u.i(autoList, "autoList");
                int i12 = 0;
                if (list2.isEmpty()) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                autoList.setVisibility(i11);
                t0 t0Var2 = spO2MeasuresListActivity.f61599g;
                if (t0Var2 != null) {
                    SectionView autoLabel = t0Var2.f99492a;
                    kotlin.jvm.internal.u.i(autoLabel, "autoLabel");
                    if (list2.isEmpty()) {
                        i12 = 8;
                    }
                    autoLabel.setVisibility(i12);
                    if (!list2.isEmpty()) {
                        spO2MeasuresListActivity.f61601i.submitList(kotlin.collections.x.D0(cp0.n.A(cp0.n.t(cp0.n.h(kotlin.collections.x.t(list2), com.withings.wiscale2.spo2.g.f61678a), new h(spO2MeasuresListActivity))), new Object()));
                    }
                    return nm0.y.f85009a;
                }
                kotlin.jvm.internal.u.s("binding");
                throw null;
            }
            kotlin.jvm.internal.u.s("binding");
            throw null;
        }
    }

    /* compiled from: SpO2MeasuresListActivity.kt */
    /* loaded from: classes5.dex */
    static final class e implements l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f61610a;

        e(ym0.l lVar) {
            this.f61610a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f61610a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f61610a;
        }

        public final int hashCode() {
            return this.f61610a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f61610a.invoke(obj);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class f implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f61611a = nm0.h.b(new j(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f61612b;

        public f(Activity activity) {
            this.f61612b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61611a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class g implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f61613a = nm0.h.b(new k(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f61614b;

        public g(Activity activity) {
            this.f61614b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61613a.getValue();
        }
    }

    public static final long C3(SpO2MeasuresListActivity spO2MeasuresListActivity) {
        return ((Number) spO2MeasuresListActivity.f61598f.getValue(spO2MeasuresListActivity, f61596p[1])).longValue();
    }

    public static final User E3(SpO2MeasuresListActivity spO2MeasuresListActivity) {
        return (User) spO2MeasuresListActivity.f61597e.getValue(spO2MeasuresListActivity, f61596p[0]);
    }

    private final void F3() {
        this.f61603k = !this.f61603k;
        a0 a0Var = this.f61600h;
        a0Var.f().clear();
        a0Var.notifyItemRangeChanged(0, a0Var.getItemCount(), Boolean.valueOf(this.f61603k));
        invalidateOptionsMenu();
    }

    public static void z3(SpO2MeasuresListActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        t0 t0Var = this$0.f61599g;
        if (t0Var != null) {
            ((NestedScrollView) t0Var.f99499h).w(0);
        } else {
            kotlin.jvm.internal.u.s("binding");
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.f61603k) {
            F3();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.withings.wiscale2.spo2.Hilt_SpO2MeasuresListActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f61599g = t0.d(getLayoutInflater());
        l1.a(getWindow(), false);
        t0 t0Var = this.f61599g;
        if (t0Var != null) {
            setContentView(t0Var.c());
            t0 t0Var2 = this.f61599g;
            if (t0Var2 != null) {
                AppBarLayout appbar = (AppBarLayout) t0Var2.f99494c;
                kotlin.jvm.internal.u.i(appbar, "appbar");
                ay.b.n(appbar, true, false, 29);
                t0 t0Var3 = this.f61599g;
                if (t0Var3 != null) {
                    NestedScrollView nestedScrollView = (NestedScrollView) t0Var3.f99499h;
                    kotlin.jvm.internal.u.i(nestedScrollView, "nestedScrollView");
                    ay.b.n(nestedScrollView, false, true, 23);
                    t0 t0Var4 = this.f61599g;
                    if (t0Var4 != null) {
                        setSupportActionBar((Toolbar) t0Var4.f99500i);
                        ActionBar supportActionBar = getSupportActionBar();
                        kotlin.jvm.internal.u.g(supportActionBar);
                        supportActionBar.o(true);
                        t0 t0Var5 = this.f61599g;
                        if (t0Var5 != null) {
                            ((Toolbar) t0Var5.f99500i).setOnClickListener(new sg.d(this, 19));
                            int dimensionPixelSize = getResources().getDimensionPixelSize(C1987R.dimen.horizontalMargin);
                            t0 t0Var6 = this.f61599g;
                            if (t0Var6 != null) {
                                ((RecyclerView) t0Var6.f99497f).setAdapter(this.f61600h);
                                t0 t0Var7 = this.f61599g;
                                if (t0Var7 != null) {
                                    RecyclerView manualList = (RecyclerView) t0Var7.f99497f;
                                    kotlin.jvm.internal.u.i(manualList, "manualList");
                                    zq.b.a(manualList, C1987R.drawable.list_divider_thick_with_margins, 1);
                                    t0 t0Var8 = this.f61599g;
                                    if (t0Var8 != null) {
                                        SectionView manualLabel = (SectionView) t0Var8.f99495d;
                                        kotlin.jvm.internal.u.i(manualLabel, "manualLabel");
                                        manualLabel.setPadding(dimensionPixelSize, manualLabel.getPaddingTop(), dimensionPixelSize, manualLabel.getPaddingBottom());
                                        t0 t0Var9 = this.f61599g;
                                        if (t0Var9 != null) {
                                            ((RecyclerView) t0Var9.f99496e).setAdapter(this.f61601i);
                                            t0 t0Var10 = this.f61599g;
                                            if (t0Var10 != null) {
                                                RecyclerView autoList = (RecyclerView) t0Var10.f99496e;
                                                kotlin.jvm.internal.u.i(autoList, "autoList");
                                                zq.b.a(autoList, C1987R.drawable.list_divider_thick_with_margins, 1);
                                                t0 t0Var11 = this.f61599g;
                                                if (t0Var11 != null) {
                                                    SectionView autoLabel = t0Var11.f99492a;
                                                    kotlin.jvm.internal.u.i(autoLabel, "autoLabel");
                                                    autoLabel.setPadding(dimensionPixelSize, autoLabel.getPaddingTop(), dimensionPixelSize, autoLabel.getPaddingBottom());
                                                    y yVar = (y) new k1(this, new b()).a(y.class);
                                                    yVar.m0().observe(this, new e(new c()));
                                                    yVar.p0().observe(this, new e(new d()));
                                                    this.f61602j = yVar;
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
        kotlin.jvm.internal.u.s("binding");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
        if ((!r1.isEmpty()) == true) goto L9;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onCreateOptionsMenu(android.view.Menu r4) {
        /*
            r3 = this;
            java.lang.String r0 = "menu"
            kotlin.jvm.internal.u.j(r4, r0)
            android.view.MenuInflater r0 = r3.getMenuInflater()
            r1 = 2131689480(0x7f0f0008, float:1.9007977E38)
            r0.inflate(r1, r4)
            r0 = 2131363805(0x7f0a07dd, float:1.834743E38)
            android.view.MenuItem r0 = r4.findItem(r0)
            boolean r1 = r3.f61603k
            if (r1 != 0) goto L3c
            com.withings.wiscale2.spo2.y r1 = r3.f61602j
            if (r1 == 0) goto L35
            androidx.lifecycle.j0 r1 = r1.m0()
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L3c
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 != r2) goto L3c
            goto L3d
        L35:
            java.lang.String r4 = "viewModel"
            kotlin.jvm.internal.u.s(r4)
            r4 = 0
            throw r4
        L3c:
            r2 = 0
        L3d:
            r0.setVisible(r2)
            r0 = 2131362506(0x7f0a02ca, float:1.8344795E38)
            android.view.MenuItem r0 = r4.findItem(r0)
            boolean r1 = r3.f61603k
            r0.setVisible(r1)
            boolean r4 = super.onCreateOptionsMenu(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.spo2.SpO2MeasuresListActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        ky.d dVar;
        kotlin.jvm.internal.u.j(item, "item");
        int itemId = item.getItemId();
        if (itemId == C1987R.id.select) {
            F3();
        } else if (itemId == C1987R.id.delete) {
            ArrayList arrayList = new ArrayList();
            SparseArray<Boolean> f11 = this.f61600h.f();
            int size = f11.size();
            for (int i11 = 0; i11 < size; i11++) {
                int keyAt = f11.keyAt(i11);
                if (f11.valueAt(i11).booleanValue()) {
                    y yVar = this.f61602j;
                    if (yVar != null) {
                        List list = (List) yVar.m0().getValue();
                        if (list != null && (dVar = (ky.d) list.get(keyAt)) != null) {
                            arrayList.add(dVar);
                        }
                        setResult(12);
                    } else {
                        kotlin.jvm.internal.u.s("viewModel");
                        throw null;
                    }
                }
            }
            y yVar2 = this.f61602j;
            if (yVar2 != null) {
                BuildersKt__Builders_commonKt.launch$default(h1.a(yVar2), Dispatchers.getIO(), null, new w(yVar2, arrayList, null), 2, null);
                F3();
            } else {
                kotlin.jvm.internal.u.s("viewModel");
                throw null;
            }
        } else {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
