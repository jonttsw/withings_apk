package com.withings.wiscale2.settings;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.k1;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.device.Device;
import com.withings.views.view.ToggleCellView;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import l70.u;
/* compiled from: UnitsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/settings/UnitsActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class UnitsActivity extends Hilt_UnitsActivity {

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f59795m = {androidx.camera.core.v.c(UnitsActivity.class, "layout", "getLayout()Lcom/withings/wiscale2/databinding/ActivityUnitsBinding;", 0)};

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f59796n = 0;

    /* renamed from: e  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f59797e;

    /* renamed from: f  reason: collision with root package name */
    private final androidx.lifecycle.i1 f59798f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f59799g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f59800h;

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f59801i;

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f59802j;

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f59803k;

    /* renamed from: l  reason: collision with root package name */
    private final Bundle f59804l;

    /* compiled from: UnitsActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<kn.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f59805a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final kn.e invoke() {
            return kn.e.c();
        }
    }

    /* compiled from: UnitsActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<List<? extends l70.u>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f59806a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final List<? extends l70.u> invoke() {
            l70.u.f78815b.getClass();
            return kotlin.collections.x.W(new l70.u(6), new l70.u(7));
        }
    }

    /* compiled from: UnitsActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<List<? extends l70.u>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f59807a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final List<? extends l70.u> invoke() {
            l70.u.f78815b.getClass();
            return u.a.g();
        }
    }

    /* compiled from: UnitsActivity.kt */
    /* loaded from: classes5.dex */
    static final class d implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f59808a;

        d(ym0.l lVar) {
            this.f59808a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f59808a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f59808a;
        }

        public final int hashCode() {
            return this.f59808a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f59808a.invoke(obj);
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.l<ComponentActivity, tb0.v0> {
        @Override // ym0.l
        public final tb0.v0 invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            kotlin.jvm.internal.u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.container);
            kotlin.jvm.internal.u.i(e11, "requireViewById(this, id)");
            return tb0.v0.a(e11);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f59809a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f59809a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f59809a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes5.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.a<androidx.lifecycle.m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f59810a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f59810a = componentActivity;
        }

        @Override // ym0.a
        public final androidx.lifecycle.m1 invoke() {
            return this.f59810a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes5.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f59811a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f59811a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f59811a.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: UnitsActivity.kt */
    /* loaded from: classes5.dex */
    static final class i extends kotlin.jvm.internal.w implements ym0.a<List<? extends l70.u>> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f59812a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final List<? extends l70.u> invoke() {
            l70.u.f78815b.getClass();
            return kotlin.collections.x.W(new l70.u(11), new l70.u(13));
        }
    }

    /* compiled from: UnitsActivity.kt */
    /* loaded from: classes5.dex */
    static final class j extends kotlin.jvm.internal.w implements ym0.a<List<? extends l70.u>> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f59813a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final List<? extends l70.u> invoke() {
            if (kotlin.jvm.internal.u.e(Locale.JAPAN, Locale.getDefault())) {
                return kotlin.collections.x.V(new l70.u(1));
            }
            l70.u.f78815b.getClass();
            return u.a.h();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public UnitsActivity() {
        super(0);
        this.f59797e = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new kotlin.jvm.internal.w(1));
        this.f59798f = new androidx.lifecycle.i1(kotlin.jvm.internal.q0.b(UnitsActivityViewModel.class), new g(this), new f(this), new h(this));
        this.f59799g = nm0.h.b(a.f59805a);
        this.f59800h = nm0.h.b(c.f59807a);
        this.f59801i = nm0.h.b(j.f59813a);
        this.f59802j = nm0.h.b(b.f59806a);
        this.f59803k = nm0.h.b(i.f59812a);
        this.f59804l = new Bundle();
    }

    public static void A3(UnitsActivity this$0, LineCellView this_with, om.a accountUnits) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(this_with, "$this_with");
        kotlin.jvm.internal.u.j(accountUnits, "$accountUnits");
        H3(this_with, C1987R.string.unit_height, (List) this$0.f59800h.getValue(), accountUnits.b(), new c6(this$0));
    }

    public static void B3(UnitsActivity this$0, LineCellView this_with, om.a accountUnits) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(this_with, "$this_with");
        kotlin.jvm.internal.u.j(accountUnits, "$accountUnits");
        H3(this_with, C1987R.string._DISTANCE_, (List) this$0.f59802j.getValue(), accountUnits.a(), new d6(this$0));
    }

    public static void C3(UnitsActivity this$0, LineCellView this_with, om.a accountUnits) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(this_with, "$this_with");
        kotlin.jvm.internal.u.j(accountUnits, "$accountUnits");
        H3(this_with, C1987R.string._POIDS_, (List) this$0.f59801i.getValue(), accountUnits.e(), new b6(this$0));
    }

    public static final UnitsActivityViewModel E3(UnitsActivity unitsActivity) {
        return (UnitsActivityViewModel) unitsActivity.f59798f.getValue();
    }

    public static final void F3(final UnitsActivity unitsActivity, final om.a aVar) {
        int i11;
        tb0.v0 G3 = unitsActivity.G3();
        l70.u e11 = aVar.e();
        final LineCellView lineCellView = G3.f99546g;
        Context context = lineCellView.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        lineCellView.setValue(e11.i(context));
        lineCellView.setOnClickListener(new View.OnClickListener() { // from class: com.withings.wiscale2.settings.x5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnitsActivity.C3(UnitsActivity.this, lineCellView, aVar);
            }
        });
        tb0.v0 G32 = unitsActivity.G3();
        l70.u b10 = aVar.b();
        LineCellView lineCellView2 = G32.f99543d;
        Context context2 = lineCellView2.getContext();
        kotlin.jvm.internal.u.i(context2, "getContext(...)");
        lineCellView2.setValue(b10.i(context2));
        lineCellView2.setOnClickListener(new fa0.e(unitsActivity, lineCellView2, aVar, 1));
        tb0.v0 G33 = unitsActivity.G3();
        l70.u a11 = aVar.a();
        final LineCellView lineCellView3 = G33.f99542c;
        Context context3 = lineCellView3.getContext();
        kotlin.jvm.internal.u.i(context3, "getContext(...)");
        lineCellView3.setValue(a11.i(context3));
        lineCellView3.setOnClickListener(new View.OnClickListener() { // from class: com.withings.wiscale2.settings.y5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnitsActivity.B3(UnitsActivity.this, lineCellView3, aVar);
            }
        });
        tb0.v0 G34 = unitsActivity.G3();
        l70.u d11 = aVar.d();
        final LineCellView lineCellView4 = G34.f99544e;
        Context context4 = lineCellView4.getContext();
        kotlin.jvm.internal.u.i(context4, "getContext(...)");
        lineCellView4.setValue(d11.i(context4));
        lineCellView4.setOnClickListener(new View.OnClickListener() { // from class: com.withings.wiscale2.settings.z5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnitsActivity.z3(UnitsActivity.this, lineCellView4, aVar);
            }
        });
        tb0.v0 G35 = unitsActivity.G3();
        List<Device> m11 = ((kn.e) unitsActivity.f59799g.getValue()).m();
        kotlin.jvm.internal.u.i(m11, "getDevices(...)");
        List<Device> list = m11;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Device device : list) {
                if (device instanceof gl.q) {
                    i11 = C1987R.string._DISPLAY_BODY_COMPOSITION_PCT_;
                    break;
                }
            }
        }
        i11 = C1987R.string._DISPLAY_FAT_PCT_;
        String string = unitsActivity.getString(i11);
        ToggleCellView toggleCellView = G35.f99541b;
        toggleCellView.setLabelText(string);
        toggleCellView.setChecked(aVar.f());
        toggleCellView.A(new f6(unitsActivity));
    }

    private final tb0.v0 G3() {
        Object value = ((LifecycleViewBindingProperty) this.f59797e).getValue(this, f59795m[0]);
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (tb0.v0) value;
    }

    private static void H3(LineCellView lineCellView, int i11, List list, l70.u uVar, ym0.l lVar) {
        int indexOf = list.indexOf(uVar);
        qc.b bVar = new qc.b(lineCellView.getContext());
        bVar.C(i11);
        List<l70.u> list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list2, 10));
        for (l70.u uVar2 : list2) {
            Context context = lineCellView.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            arrayList.add(uVar2.i(context));
        }
        bVar.o((CharSequence[]) arrayList.toArray(new String[0]), indexOf, new p40.b(2, lVar, list));
        bVar.t(true);
        bVar.s();
    }

    public static void z3(UnitsActivity this$0, LineCellView this_with, om.a accountUnits) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(this_with, "$this_with");
        kotlin.jvm.internal.u.j(accountUnits, "$accountUnits");
        H3(this_with, C1987R.string._TEMPERATURE_, (List) this$0.f59803k.getValue(), accountUnits.d(), new e6(this$0));
    }

    @Override // com.withings.wiscale2.settings.Hilt_UnitsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LinearLayout b10 = G3().b();
        kotlin.jvm.internal.u.i(b10, "getRoot(...)");
        ay.b.t(b10);
        Toolbar toolbar = G3().f99545f;
        kotlin.jvm.internal.u.i(toolbar, "toolbar");
        ay.b.n(toolbar, true, false, 29);
        setSupportActionBar(G3().f99545f);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
            supportActionBar.q(true);
        }
        ((UnitsActivityViewModel) this.f59798f.getValue()).f0().observe(this, new d(new a6(this)));
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
