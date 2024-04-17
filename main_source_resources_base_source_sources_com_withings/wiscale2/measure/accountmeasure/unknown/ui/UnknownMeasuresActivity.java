package com.withings.wiscale2.measure.accountmeasure.unknown.ui;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.camera.core.v;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.l1;
import androidx.lifecycle.h1;
import androidx.lifecycle.l0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.google.android.material.appbar.AppBarLayout;
import com.withings.android.activity.WithingsActivity;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.measure.accountmeasure.unknown.ui.UnknownMeasuresActivity;
import com.withings.wiscale2.measure.accountmeasure.unknown.ui.a;
import com.withings.wiscale2.measure.accountmeasure.unknown.ui.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import tb0.w0;
import ym0.l;
/* compiled from: UnknownMeasuresActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withings/wiscale2/measure/accountmeasure/unknown/ui/UnknownMeasuresActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/wiscale2/measure/accountmeasure/unknown/ui/a$a;", "Lcom/withings/wiscale2/measure/accountmeasure/unknown/ui/j$a;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class UnknownMeasuresActivity extends WithingsActivity implements a.InterfaceC0754a, j.a {

    /* renamed from: a  reason: collision with root package name */
    private MenuItem f58325a;

    /* renamed from: b  reason: collision with root package name */
    private final d f58326b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f58327c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f58328d;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f58329e;

    /* renamed from: f  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f58330f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f58331g;

    /* renamed from: i  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f58324i = {v.c(UnknownMeasuresActivity.class, "measureType", "getMeasureType()I", 0), v.c(UnknownMeasuresActivity.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/ActivityUnknownMeasuresBinding;", 0)};

    /* renamed from: h  reason: collision with root package name */
    public static final a f58323h = new Object();

    /* compiled from: UnknownMeasuresActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(int i11, Context context) {
            Intent putExtra = new Intent(context, UnknownMeasuresActivity.class).putExtra("measure_type", i11);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: UnknownMeasuresActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<Long> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final Long invoke() {
            return Long.valueOf(UnknownMeasuresActivity.this.getResources().getInteger(17694720));
        }
    }

    /* compiled from: UnknownMeasuresActivity.kt */
    /* loaded from: classes5.dex */
    static final class c implements l0, p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f58333a;

        c(l lVar) {
            this.f58333a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof l0) || !(obj instanceof p)) {
                return false;
            }
            return u.e(this.f58333a, ((p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f58333a;
        }

        public final int hashCode() {
            return this.f58333a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f58333a.invoke(obj);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class d implements bn0.d<Activity, Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f58334a = nm0.h.b(new com.withings.wiscale2.measure.accountmeasure.unknown.ui.f(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f58335b;

        public d(Activity activity) {
            this.f58335b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Integer] */
        @Override // bn0.d
        public final Integer getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f58334a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class e extends w implements l<ComponentActivity, w0> {
        @Override // ym0.l
        public final w0 invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.root);
            u.i(e11, "requireViewById(this, id)");
            return w0.a(e11);
        }
    }

    /* compiled from: UnknownMeasuresActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends w implements ym0.a<com.withings.wiscale2.measure.accountmeasure.unknown.ui.a> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final com.withings.wiscale2.measure.accountmeasure.unknown.ui.a invoke() {
            return new com.withings.wiscale2.measure.accountmeasure.unknown.ui.a(UnknownMeasuresActivity.this);
        }
    }

    /* compiled from: UnknownMeasuresActivity.kt */
    /* loaded from: classes5.dex */
    static final class g extends w implements ym0.a<j> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final j invoke() {
            return new j(UnknownMeasuresActivity.this);
        }
    }

    /* compiled from: UnknownMeasuresActivity.kt */
    /* loaded from: classes5.dex */
    static final class h extends w implements ym0.a<i> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final i invoke() {
            nm0.g gVar;
            UnknownMeasuresActivity unknownMeasuresActivity = UnknownMeasuresActivity.this;
            Application application = unknownMeasuresActivity.getApplication();
            u.i(application, "getApplication(...)");
            m70.i b10 = m70.i.b();
            u.i(b10, "get(...)");
            gVar = ih0.a.f72286g;
            return new i(application, b10, (ih0.a) gVar.getValue(), UnknownMeasuresActivity.B3(unknownMeasuresActivity));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public UnknownMeasuresActivity() {
        super(C1987R.layout.activity_unknown_measures);
        this.f58326b = new d(this);
        this.f58327c = nm0.h.b(new g());
        this.f58328d = nm0.h.b(new f());
        this.f58329e = nm0.h.b(new h());
        this.f58330f = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new w(1));
        this.f58331g = nm0.h.b(new b());
    }

    public static void A3(UnknownMeasuresActivity this$0) {
        u.j(this$0, "this$0");
        i G3 = this$0.G3();
        G3.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(G3), Dispatchers.getIO(), null, new com.withings.wiscale2.measure.accountmeasure.unknown.ui.h(G3, null), 2, null);
    }

    public static final int B3(UnknownMeasuresActivity unknownMeasuresActivity) {
        return ((Number) unknownMeasuresActivity.f58326b.getValue(unknownMeasuresActivity, f58324i[0])).intValue();
    }

    public static final com.withings.wiscale2.measure.accountmeasure.unknown.ui.a C3(UnknownMeasuresActivity unknownMeasuresActivity) {
        return (com.withings.wiscale2.measure.accountmeasure.unknown.ui.a) unknownMeasuresActivity.f58328d.getValue();
    }

    public static final j D3(UnknownMeasuresActivity unknownMeasuresActivity) {
        return (j) unknownMeasuresActivity.f58327c.getValue();
    }

    public static final void E3(UnknownMeasuresActivity unknownMeasuresActivity, List list) {
        unknownMeasuresActivity.getClass();
        nm0.g gVar = unknownMeasuresActivity.f58331g;
        if (list != null && (!list.isEmpty())) {
            MenuItem menuItem = unknownMeasuresActivity.f58325a;
            if (menuItem != null) {
                if (!menuItem.isVisible()) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(unknownMeasuresActivity, C1987R.anim.slide_in_bottom);
                    loadAnimation.setDuration(((Number) gVar.getValue()).longValue());
                    ConstraintLayout constraintLayout = unknownMeasuresActivity.F3().f99574b;
                    constraintLayout.startAnimation(loadAnimation);
                    constraintLayout.setVisibility(0);
                    MenuItem menuItem2 = unknownMeasuresActivity.f58325a;
                    if (menuItem2 != null) {
                        menuItem2.setVisible(true);
                        return;
                    } else {
                        u.s("deleteMenu");
                        throw null;
                    }
                }
                return;
            }
            u.s("deleteMenu");
            throw null;
        }
        Animation loadAnimation2 = AnimationUtils.loadAnimation(unknownMeasuresActivity, C1987R.anim.slide_out_bottom);
        loadAnimation2.setDuration(((Number) gVar.getValue()).longValue());
        ConstraintLayout constraintLayout2 = unknownMeasuresActivity.F3().f99574b;
        constraintLayout2.startAnimation(loadAnimation2);
        constraintLayout2.setVisibility(8);
        MenuItem menuItem3 = unknownMeasuresActivity.f58325a;
        if (menuItem3 != null) {
            menuItem3.setVisible(false);
        } else {
            u.s("deleteMenu");
            throw null;
        }
    }

    private final w0 F3() {
        Object value = ((LifecycleViewBindingProperty) this.f58330f).getValue(this, f58324i[1]);
        u.i(value, "getValue(...)");
        return (w0) value;
    }

    private final i G3() {
        return (i) this.f58329e.getValue();
    }

    public static void z3(UnknownMeasuresActivity this$0, User user) {
        u.j(this$0, "this$0");
        u.j(user, "$user");
        i G3 = this$0.G3();
        G3.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(G3), Dispatchers.getIO(), null, new com.withings.wiscale2.measure.accountmeasure.unknown.ui.g(G3, user, null), 2, null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    @Override // com.withings.wiscale2.measure.accountmeasure.unknown.ui.j.a
    public final void G2(User user) {
        Integer num;
        int i11;
        qc.b bVar = new qc.b(this);
        List list = (List) G3().g0().getValue();
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            i11 = C1987R.string._CONFIRMATION_ATTRIB_TO__s_ONE_;
        } else {
            i11 = C1987R.string._CONFIRMATION_ATTRIB_TO__s_MULTIPLE_;
        }
        String string = getString(i11, user.l());
        u.i(string, "getString(...)");
        bVar.v(string);
        qc.b w11 = bVar.z(C1987R.string._YES_, new sg.l(2, this, user)).w(C1987R.string._CANCEL_, new Object());
        w11.t(false);
        final androidx.appcompat.app.c create = w11.create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: jh0.h
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                UnknownMeasuresActivity.a aVar = UnknownMeasuresActivity.f58323h;
                androidx.appcompat.app.c this_apply = androidx.appcompat.app.c.this;
                u.j(this_apply, "$this_apply");
                UnknownMeasuresActivity this$0 = this;
                u.j(this$0, "this$0");
                this_apply.g(-2).setTextColor(ah.u.w(C1987R.attr.colorOnSurface, this$0, -65281));
                this_apply.g(-1).setTextColor(ah.u.w(C1987R.attr.colorOnSurface, this$0, -65281));
            }
        });
        create.show();
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.unknown.ui.a.InterfaceC0754a
    public final void W(jh0.d dVar) {
        G3().m0(dVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        AppBarLayout appBar = F3().f99573a;
        u.i(appBar, "appBar");
        ay.b.n(appBar, true, false, 29);
        RecyclerView recyclerViewMeasures = F3().f99575c;
        u.i(recyclerViewMeasures, "recyclerViewMeasures");
        ay.b.n(recyclerViewMeasures, false, true, 23);
        ConstraintLayout layoutAssign = F3().f99574b;
        u.i(layoutAssign, "layoutAssign");
        ay.b.n(layoutAssign, false, true, 23);
        setSupportActionBar(F3().f99577e);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
            supportActionBar.q(true);
        }
        RecyclerView recyclerView = F3().f99575c;
        u.g(recyclerView);
        zq.b.a(recyclerView, C1987R.drawable.list_divider_thick, 1);
        recyclerView.setAdapter((com.withings.wiscale2.measure.accountmeasure.unknown.ui.a) this.f58328d.getValue());
        w0 F3 = F3();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        RecyclerView recyclerView2 = F3.f99576d;
        recyclerView2.setLayoutManager(linearLayoutManager);
        recyclerView2.setAdapter((j) this.f58327c.getValue());
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        u.j(menu, "menu");
        getMenuInflater().inflate(C1987R.menu.menu_unknown_measurements, menu);
        MenuItem findItem = menu.findItem(C1987R.id.action_delete);
        u.i(findItem, "findItem(...)");
        this.f58325a = findItem;
        findItem.setVisible(false);
        G3().j0().observe(this, new c(new com.withings.wiscale2.measure.accountmeasure.unknown.ui.c(this)));
        G3().i0().observe(this, new c(new com.withings.wiscale2.measure.accountmeasure.unknown.ui.d(this)));
        G3().g0().observe(this, new c(new com.withings.wiscale2.measure.accountmeasure.unknown.ui.e(this)));
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Integer num;
        int i11;
        u.j(item, "item");
        int itemId = item.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        } else if (itemId == C1987R.id.action_delete) {
            qc.b bVar = new qc.b(this);
            List list = (List) G3().g0().getValue();
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 1) {
                i11 = C1987R.string._DELETE_MEASURE_CONFIRMATION_;
            } else {
                i11 = C1987R.string._TM_MEASURE_ASSIGN_DELETE_ALERT_TITLE_;
            }
            bVar.g(i11);
            qc.b w11 = bVar.z(C1987R.string._DELETE_YES_, new ao.i(this, 5)).w(C1987R.string._CANCEL_, new cq.g(2));
            w11.t(false);
            final androidx.appcompat.app.c create = w11.create();
            create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: jh0.f
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    UnknownMeasuresActivity.a aVar = UnknownMeasuresActivity.f58323h;
                    androidx.appcompat.app.c this_apply = androidx.appcompat.app.c.this;
                    u.j(this_apply, "$this_apply");
                    UnknownMeasuresActivity this$0 = this;
                    u.j(this$0, "this$0");
                    Button g11 = this_apply.g(-2);
                    if (g11 != null) {
                        g11.setTextColor(ah.u.w(C1987R.attr.colorOnSurface, this$0, -65281));
                    }
                    Button g12 = this_apply.g(-1);
                    if (g12 != null) {
                        g12.setTextColor(ah.u.w(C1987R.attr.colorError, this$0, -65281));
                    }
                }
            });
            create.show();
            return true;
        } else if (itemId == C1987R.id.action_select_all) {
            G3().k0();
            ((com.withings.wiscale2.measure.accountmeasure.unknown.ui.a) this.f58328d.getValue()).notifyDataSetChanged();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
