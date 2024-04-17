package com.withings.wiscale2.measure.list;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.k1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.measure.list.d;
import fj0.f;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import tb0.d0;
/* compiled from: MeasureListActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/measure/list/MeasureListActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lfj0/f$a;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MeasureListActivity extends Hilt_MeasureListActivity implements f.a {

    /* renamed from: e  reason: collision with root package name */
    private x f58494e;

    /* renamed from: f  reason: collision with root package name */
    private d0 f58495f;

    /* renamed from: g  reason: collision with root package name */
    private final f f58496g = new f(this);

    /* renamed from: h  reason: collision with root package name */
    private final g f58497h = new g(this);

    /* renamed from: i  reason: collision with root package name */
    private final h f58498i = new h(this);

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f58499j = nm0.h.b(new b());

    /* renamed from: k  reason: collision with root package name */
    private com.withings.wiscale2.measure.list.g f58500k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f58501l;
    @Inject

    /* renamed from: m  reason: collision with root package name */
    public fy.n f58502m;

    /* renamed from: o  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f58493o = {androidx.camera.core.v.c(MeasureListActivity.class, NavigationArguments.USER_ID, "getUserId()J", 0), androidx.camera.core.v.c(MeasureListActivity.class, "titleScreen", "getTitleScreen()Ljava/lang/String;", 0), androidx.camera.core.v.c(MeasureListActivity.class, "measureTypes", "getMeasureTypes()[I", 0)};

    /* renamed from: n  reason: collision with root package name */
    public static final a f58492n = new Object();

    /* compiled from: MeasureListActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context, long j5, int[] iArr, int i11) {
            Intent putExtra = new Intent(context, MeasureListActivity.class).putExtra("EXTRA_USER_ID", j5).putExtra("EXTRA_MEASURES_TYPES", iArr).putExtra("EXTRA_TITLE", com.google.android.gms.internal.p002firebaseauthapi.a.b(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, i11, "getString(...)"));
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: MeasureListActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<i> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final i invoke() {
            return ah.d.e(MeasureListActivity.G3(MeasureListActivity.this));
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
            MeasureListActivity measureListActivity = MeasureListActivity.this;
            Application application = measureListActivity.getApplication();
            kotlin.jvm.internal.u.i(application, "getApplication(...)");
            m70.i b10 = m70.i.b();
            kotlin.jvm.internal.u.i(b10, "get(...)");
            fy.n nVar = measureListActivity.f58502m;
            if (nVar != null) {
                long H3 = MeasureListActivity.H3(measureListActivity);
                int[] G3 = MeasureListActivity.G3(measureListActivity);
                sw.a z5 = sw.a.z();
                kotlin.jvm.internal.u.i(z5, "get(...)");
                zx.v vVar = new zx.v(z5);
                zx.j a11 = zx.j.f111082d.a();
                return new com.withings.wiscale2.measure.list.g(application, b10, nVar, H3, G3, new fy.a(vVar, new fy.d(vVar, a11), new ey.a(new fy.x(new ey.b(vVar))), a11));
            }
            kotlin.jvm.internal.u.s("getMeasureGroupsWithAllTypes");
            throw null;
        }
    }

    /* compiled from: MeasureListActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.l<User, nm0.y> {
        d() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(User user) {
            User user2 = user;
            boolean D = user2.D();
            MeasureListActivity measureListActivity = MeasureListActivity.this;
            if (!D) {
                MeasureListActivity.J3(measureListActivity);
            }
            MeasureListActivity.I3(measureListActivity, user2);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: MeasureListActivity.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.l<List<? extends com.withings.wiscale2.measure.list.d>, nm0.y> {
        e() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(List<? extends com.withings.wiscale2.measure.list.d> list) {
            List<? extends com.withings.wiscale2.measure.list.d> it = list;
            kotlin.jvm.internal.u.j(it, "it");
            boolean isEmpty = it.isEmpty();
            MeasureListActivity measureListActivity = MeasureListActivity.this;
            if (!isEmpty) {
                x xVar = measureListActivity.f58494e;
                if (xVar != null) {
                    xVar.submitList(it);
                } else {
                    kotlin.jvm.internal.u.s("adapter");
                    throw null;
                }
            } else {
                measureListActivity.finish();
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class f implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f58507a = nm0.h.b(new r(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f58508b;

        public f(Activity activity) {
            this.f58508b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f58507a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class g implements bn0.d<Activity, String> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f58509a = nm0.h.b(new s(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f58510b;

        public g(Activity activity) {
            this.f58510b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.String] */
        @Override // bn0.d
        public final String getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f58509a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class h implements bn0.d<Activity, int[]> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f58511a = nm0.h.b(new t(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f58512b;

        public h(Activity activity) {
            this.f58512b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [int[], java.lang.Object] */
        @Override // bn0.d
        public final int[] getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f58511a.getValue();
        }
    }

    public static void A3(MeasureListActivity this$0, int i11) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        x xVar = this$0.f58494e;
        if (xVar != null) {
            xVar.notifyItemChanged(i11);
        } else {
            kotlin.jvm.internal.u.s("adapter");
            throw null;
        }
    }

    public static void B3(androidx.appcompat.app.c this_apply, MeasureListActivity this$0) {
        kotlin.jvm.internal.u.j(this_apply, "$this_apply");
        kotlin.jvm.internal.u.j(this$0, "this$0");
        Button g11 = this_apply.g(-2);
        if (g11 != null) {
            d0 d0Var = this$0.f58495f;
            if (d0Var != null) {
                Context context = d0Var.b().getContext();
                kotlin.jvm.internal.u.i(context, "getContext(...)");
                g11.setTextColor(ah.u.w(C1987R.attr.colorOnSurface, context, -65281));
            } else {
                kotlin.jvm.internal.u.s("binding");
                throw null;
            }
        }
        Button g12 = this_apply.g(-1);
        if (g12 != null) {
            d0 d0Var2 = this$0.f58495f;
            if (d0Var2 != null) {
                Context context2 = d0Var2.b().getContext();
                kotlin.jvm.internal.u.i(context2, "getContext(...)");
                g12.setTextColor(ah.u.w(C1987R.attr.colorError, context2, -65281));
                return;
            }
            kotlin.jvm.internal.u.s("binding");
            throw null;
        }
    }

    public static void C3(MeasureListActivity this$0, int i11, DialogInterface dialogInterface) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        dialogInterface.cancel();
        x xVar = this$0.f58494e;
        if (xVar != null) {
            xVar.notifyItemChanged(i11);
        } else {
            kotlin.jvm.internal.u.s("adapter");
            throw null;
        }
    }

    public static void D3(MeasureListActivity this$0, int i11) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        x xVar = this$0.f58494e;
        if (xVar != null) {
            xVar.notifyItemChanged(i11);
        } else {
            kotlin.jvm.internal.u.s("adapter");
            throw null;
        }
    }

    public static void E3(MeasureListActivity this$0, int i11) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.f58501l = true;
        x xVar = this$0.f58494e;
        if (xVar != null) {
            com.withings.wiscale2.measure.list.d dVar = xVar.getCurrentList().get(i11);
            kotlin.jvm.internal.u.h(dVar, "null cannot be cast to non-null type com.withings.wiscale2.measure.list.ListItem.MeasureItem");
            d.c cVar = (d.c) dVar;
            com.withings.wiscale2.measure.list.g gVar = this$0.f58500k;
            if (gVar != null) {
                MeasuresGroup measureGroup = cVar.a();
                kotlin.jvm.internal.u.j(measureGroup, "measureGroup");
                BuildersKt__Builders_commonKt.launch$default(h1.a(gVar), Dispatchers.getIO(), null, new com.withings.wiscale2.measure.list.e(gVar, measureGroup, null), 2, null);
                return;
            }
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
        kotlin.jvm.internal.u.s("adapter");
        throw null;
    }

    public static final int[] G3(MeasureListActivity measureListActivity) {
        return (int[]) measureListActivity.f58498i.getValue(measureListActivity, f58493o[2]);
    }

    public static final long H3(MeasureListActivity measureListActivity) {
        return ((Number) measureListActivity.f58496g.getValue(measureListActivity, f58493o[0])).longValue();
    }

    public static final void I3(MeasureListActivity measureListActivity, User user) {
        if (measureListActivity.f58494e == null) {
            x xVar = new x(user, measureListActivity.K3().d(), measureListActivity.K3().c(), measureListActivity.K3().e());
            measureListActivity.f58494e = xVar;
            d0 d0Var = measureListActivity.f58495f;
            if (d0Var != null) {
                d0Var.f98946b.setAdapter(xVar);
                d0 d0Var2 = measureListActivity.f58495f;
                if (d0Var2 != null) {
                    x xVar2 = measureListActivity.f58494e;
                    if (xVar2 != null) {
                        d0Var2.f98946b.j(new h80.a(xVar2));
                        return;
                    }
                    kotlin.jvm.internal.u.s("adapter");
                    throw null;
                }
                kotlin.jvm.internal.u.s("binding");
                throw null;
            }
            kotlin.jvm.internal.u.s("binding");
            throw null;
        }
    }

    public static final void J3(MeasureListActivity measureListActivity) {
        measureListActivity.getClass();
        androidx.recyclerview.widget.p pVar = new androidx.recyclerview.widget.p(new fj0.f(measureListActivity, measureListActivity, k.class));
        d0 d0Var = measureListActivity.f58495f;
        if (d0Var != null) {
            pVar.i(d0Var.f98946b);
        } else {
            kotlin.jvm.internal.u.s("binding");
            throw null;
        }
    }

    private final i K3() {
        return (i) this.f58499j.getValue();
    }

    public static void z3(MeasureListActivity this$0, int i11) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        x xVar = this$0.f58494e;
        if (xVar != null) {
            xVar.notifyItemChanged(i11);
        } else {
            kotlin.jvm.internal.u.s("adapter");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        if (this.f58501l) {
            setResult(1);
        }
        super.finish();
    }

    @Override // fj0.f.a
    public final void k2(RecyclerView.z viewHolder) {
        boolean z5;
        kotlin.jvm.internal.u.j(viewHolder, "viewHolder");
        x xVar = this.f58494e;
        if (xVar != null) {
            if (xVar.getCurrentList().size() < 3) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!K3().b() && z5) {
                final int adapterPosition = viewHolder.getAdapterPosition();
                qc.b bVar = new qc.b(this);
                K3().getClass();
                bVar.C(0);
                K3().getClass();
                bVar.g(0);
                bVar.t(true);
                bVar.y(new DialogInterface.OnCancelListener() { // from class: com.withings.wiscale2.measure.list.l
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        MeasureListActivity.D3(MeasureListActivity.this, adapterPosition);
                    }
                });
                bVar.z(C1987R.string._OK_, new DialogInterface.OnClickListener() { // from class: com.withings.wiscale2.measure.list.m
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        MeasureListActivity.A3(MeasureListActivity.this, adapterPosition);
                    }
                }).s();
                return;
            }
            final int adapterPosition2 = viewHolder.getAdapterPosition();
            qc.b bVar2 = new qc.b(this);
            bVar2.C(C1987R.string._DELETE_MEASURE_CONFIRMATION_);
            bVar2.g(C1987R.string._THIS_DATA_WILL_BE_PERMANTENTLY_DELETED_);
            bVar2.t(true);
            bVar2.y(new DialogInterface.OnCancelListener() { // from class: com.withings.wiscale2.measure.list.n
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    MeasureListActivity.z3(MeasureListActivity.this, adapterPosition2);
                }
            });
            final androidx.appcompat.app.c create = bVar2.z(C1987R.string._DELETE_YES_, new DialogInterface.OnClickListener() { // from class: com.withings.wiscale2.measure.list.o
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    MeasureListActivity.E3(MeasureListActivity.this, adapterPosition2);
                }
            }).w(C1987R.string._CANCEL_, new DialogInterface.OnClickListener() { // from class: com.withings.wiscale2.measure.list.p
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    MeasureListActivity.C3(MeasureListActivity.this, adapterPosition2, dialogInterface);
                }
            }).create();
            create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.withings.wiscale2.measure.list.q
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    MeasureListActivity.B3(androidx.appcompat.app.c.this, this);
                }
            });
            create.show();
            return;
        }
        kotlin.jvm.internal.u.s("adapter");
        throw null;
    }

    @Override // com.withings.wiscale2.measure.list.Hilt_MeasureListActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d0 a11 = d0.a(getLayoutInflater().inflate(C1987R.layout.activity_measures_list, (ViewGroup) null, false));
        this.f58495f = a11;
        setContentView(a11.b());
        d0 d0Var = this.f58495f;
        if (d0Var != null) {
            setSupportActionBar(d0Var.f98947c);
            setTitle((String) this.f58497h.getValue(this, f58493o[1]));
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.o(true);
            }
            d0 d0Var2 = this.f58495f;
            if (d0Var2 != null) {
                RecyclerView recyclerView = d0Var2.f98946b;
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                com.withings.wiscale2.measure.list.g gVar = (com.withings.wiscale2.measure.list.g) new k1(this, new c()).a(com.withings.wiscale2.measure.list.g.class);
                xw.d.c(this, gVar.q0(), new d());
                xw.d.c(this, gVar.k0(), new e());
                this.f58500k = gVar;
                return;
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
        }
        return super.onOptionsItemSelected(item);
    }
}
