package com.withings.wiscale2.heart.heartrate;

import android.app.Activity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.k1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* compiled from: HRMeasuresListActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/heart/heartrate/HRMeasuresListActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HRMeasuresListActivity extends Hilt_HRMeasuresListActivity {

    /* renamed from: g  reason: collision with root package name */
    private tb0.z f57472g;

    /* renamed from: i  reason: collision with root package name */
    private e0 f57474i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f57475j;
    @Inject

    /* renamed from: k  reason: collision with root package name */
    public r0 f57476k;

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f57469m = {androidx.camera.core.v.c(HRMeasuresListActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(HRMeasuresListActivity.class, "dateStart", "getDateStart()Lorg/joda/time/DateTime;", 0)};

    /* renamed from: l  reason: collision with root package name */
    public static final a f57468l = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final e f57470e = new e(this);

    /* renamed from: f  reason: collision with root package name */
    private final f f57471f = new f(this);

    /* renamed from: h  reason: collision with root package name */
    private final k1 f57473h = new k1();

    /* compiled from: HRMeasuresListActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: Extensions.kt */
    /* loaded from: classes5.dex */
    public static final class b implements k1.b {
        public b() {
        }

        @Override // androidx.lifecycle.k1.b
        public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
            kotlin.jvm.internal.u.j(modelClass, "modelClass");
            HRMeasuresListActivity hRMeasuresListActivity = HRMeasuresListActivity.this;
            r0 r0Var = hRMeasuresListActivity.f57476k;
            if (r0Var != null) {
                return r0Var.a(HRMeasuresListActivity.B3(hRMeasuresListActivity), HRMeasuresListActivity.A3(hRMeasuresListActivity));
            }
            kotlin.jvm.internal.u.s("viewModelFactory");
            throw null;
        }
    }

    /* compiled from: HRMeasuresListActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<List<? extends MeasuresGroup>, nm0.y> {
        c() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(List<? extends MeasuresGroup> list) {
            HRMeasuresListActivity.this.f57473h.submitList(list);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: HRMeasuresListActivity.kt */
    /* loaded from: classes5.dex */
    static final class d implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f57479a;

        d(ym0.l lVar) {
            this.f57479a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f57479a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f57479a;
        }

        public final int hashCode() {
            return this.f57479a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f57479a.invoke(obj);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class e implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57480a = nm0.h.b(new com.withings.wiscale2.heart.heartrate.e(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f57481b;

        public e(Activity activity) {
            this.f57481b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f57480a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class f implements bn0.d<Activity, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57482a = nm0.h.b(new com.withings.wiscale2.heart.heartrate.f(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f57483b;

        public f(Activity activity) {
            this.f57483b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [org.joda.time.DateTime, java.lang.Object] */
        @Override // bn0.d
        public final DateTime getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f57482a.getValue();
        }
    }

    public static final DateTime A3(HRMeasuresListActivity hRMeasuresListActivity) {
        return (DateTime) hRMeasuresListActivity.f57471f.getValue(hRMeasuresListActivity, f57469m[1]);
    }

    public static final User B3(HRMeasuresListActivity hRMeasuresListActivity) {
        return (User) hRMeasuresListActivity.f57470e.getValue(hRMeasuresListActivity, f57469m[0]);
    }

    private final void C3() {
        this.f57475j = !this.f57475j;
        k1 k1Var = this.f57473h;
        k1Var.e().clear();
        k1Var.notifyItemRangeChanged(0, k1Var.getItemCount(), Boolean.valueOf(this.f57475j));
        invalidateOptionsMenu();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.f57475j) {
            C3();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.withings.wiscale2.heart.heartrate.Hilt_HRMeasuresListActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.core.view.l1.a(getWindow(), false);
        tb0.z b10 = tb0.z.b(getLayoutInflater());
        this.f57472g = b10;
        setContentView(b10.a());
        tb0.z zVar = this.f57472g;
        if (zVar != null) {
            setSupportActionBar(zVar.f99664d);
            ActionBar supportActionBar = getSupportActionBar();
            kotlin.jvm.internal.u.g(supportActionBar);
            supportActionBar.o(true);
            tb0.z zVar2 = this.f57472g;
            if (zVar2 != null) {
                AppBarLayout appbar = zVar2.f99662b;
                kotlin.jvm.internal.u.i(appbar, "appbar");
                ay.b.n(appbar, true, false, 29);
                tb0.z zVar3 = this.f57472g;
                if (zVar3 != null) {
                    RecyclerView list = zVar3.f99663c;
                    kotlin.jvm.internal.u.i(list, "list");
                    ay.b.n(list, false, true, 23);
                    tb0.z zVar4 = this.f57472g;
                    if (zVar4 != null) {
                        zVar4.f99663c.setAdapter(this.f57473h);
                        tb0.z zVar5 = this.f57472g;
                        if (zVar5 != null) {
                            RecyclerView list2 = zVar5.f99663c;
                            kotlin.jvm.internal.u.i(list2, "list");
                            zq.b.a(list2, C1987R.drawable.list_divider_thick_with_margins, 1);
                            e0 e0Var = (e0) new androidx.lifecycle.k1(this, new b()).a(e0.class);
                            e0Var.K0().observe(this, new d(new c()));
                            this.f57474i = e0Var;
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
    public final boolean onCreateOptionsMenu(Menu menu) {
        kotlin.jvm.internal.u.j(menu, "menu");
        getMenuInflater().inflate(C1987R.menu.deletable_measurements_list, menu);
        menu.findItem(C1987R.id.select).setVisible(!this.f57475j);
        menu.findItem(C1987R.id.delete).setVisible(this.f57475j);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        MeasuresGroup measuresGroup;
        kotlin.jvm.internal.u.j(item, "item");
        int itemId = item.getItemId();
        if (itemId == C1987R.id.select) {
            C3();
        } else if (itemId == C1987R.id.delete) {
            ArrayList arrayList = new ArrayList();
            SparseArray<Boolean> e11 = this.f57473h.e();
            int size = e11.size();
            for (int i11 = 0; i11 < size; i11++) {
                int keyAt = e11.keyAt(i11);
                if (e11.valueAt(i11).booleanValue()) {
                    e0 e0Var = this.f57474i;
                    if (e0Var != null) {
                        List list = (List) e0Var.K0().getValue();
                        if (list != null && (measuresGroup = (MeasuresGroup) list.get(keyAt)) != null) {
                            arrayList.add(hy.g.a(measuresGroup));
                        }
                        setResult(12);
                    } else {
                        kotlin.jvm.internal.u.s("viewModel");
                        throw null;
                    }
                }
            }
            e0 e0Var2 = this.f57474i;
            if (e0Var2 != null) {
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(e0Var2), Dispatchers.getIO(), null, new h0(e0Var2, arrayList, null), 2, null);
                C3();
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
