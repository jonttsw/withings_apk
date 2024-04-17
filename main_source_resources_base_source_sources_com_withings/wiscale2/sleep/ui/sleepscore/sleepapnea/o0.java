package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.graph.TimeGraphView;
import com.withings.measure.detail.ui.views.ArticlesView;
import com.withings.periodsbar.Period;
import com.withings.views.measure.detail.ui.views.DefinitionView;
import com.withings.views.view.BlockableViewPager;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.graph.DataPopUpView;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import org.joda.time.DateTime;
/* compiled from: SleepDisorderGraphFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/sleepapnea/o0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class o0 extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private androidx.lifecycle.k0<Integer> f61407c;

    /* renamed from: d  reason: collision with root package name */
    private BlockableViewPager.b f61408d;

    /* renamed from: e  reason: collision with root package name */
    private NestedScrollView f61409e;

    /* renamed from: f  reason: collision with root package name */
    private ArticlesView f61410f;

    /* renamed from: g  reason: collision with root package name */
    private DefinitionView f61411g;

    /* renamed from: h  reason: collision with root package name */
    private TimeGraphView f61412h;

    /* renamed from: i  reason: collision with root package name */
    private DataPopUpView f61413i;

    /* renamed from: j  reason: collision with root package name */
    private final g f61414j;

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f61415k;

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f61416l;

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f61417m;

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f61418n;

    /* renamed from: p  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f61406p = {androidx.camera.core.v.c(o0.class, "isSleepApnea", "isSleepApnea()Z", 0)};

    /* renamed from: o  reason: collision with root package name */
    public static final a f61405o = new Object();

    /* compiled from: SleepDisorderGraphFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: SleepDisorderGraphFragment.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<ArrayList<DatedValue>> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final ArrayList<DatedValue> invoke() {
            ArrayList<DatedValue> parcelableArrayList;
            Bundle a11 = yq.b.a(o0.this);
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableArrayList = a11.getParcelableArrayList("arg_ahi_values", DatedValue.class);
                return parcelableArrayList;
            }
            return a11.getParcelableArrayList("arg_ahi_values");
        }
    }

    /* compiled from: SleepDisorderGraphFragment.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<Period> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Period invoke() {
            Object obj;
            Bundle a11 = yq.b.a(o0.this);
            if (Build.VERSION.SDK_INT >= 33) {
                obj = a11.getSerializable("arg_display_type", Period.class);
            } else {
                Serializable serializable = a11.getSerializable("arg_display_type");
                if (!(serializable instanceof Period)) {
                    serializable = null;
                }
                obj = (Period) serializable;
            }
            kotlin.jvm.internal.u.g(obj);
            return (Period) obj;
        }
    }

    /* compiled from: SleepDisorderGraphFragment.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<DateTime> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final DateTime invoke() {
            Object obj;
            Bundle a11 = yq.b.a(o0.this);
            if (Build.VERSION.SDK_INT >= 33) {
                obj = a11.getSerializable("key_ref_date", DateTime.class);
            } else {
                Object serializable = a11.getSerializable("key_ref_date");
                if (!(serializable instanceof DateTime)) {
                    serializable = null;
                }
                obj = (DateTime) serializable;
            }
            return (DateTime) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SleepDisorderGraphFragment.kt */
    /* loaded from: classes5.dex */
    public static final class e implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f61422a;

        e(ym0.l lVar) {
            this.f61422a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f61422a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f61422a;
        }

        public final int hashCode() {
            return this.f61422a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f61422a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SleepDisorderGraphFragment.kt */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {
        f() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Integer num) {
            Integer num2 = num;
            NestedScrollView nestedScrollView = o0.this.f61409e;
            if (nestedScrollView != null) {
                kotlin.jvm.internal.u.g(num2);
                nestedScrollView.setScrollY(num2.intValue());
                return nm0.y.f85009a;
            }
            kotlin.jvm.internal.u.s("scrollView");
            throw null;
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class g implements bn0.d<Fragment, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f61424a = nm0.h.b(new u0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f61425b;

        public g(Fragment fragment) {
            this.f61425b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61424a.getValue();
        }
    }

    /* compiled from: SleepDisorderGraphFragment.kt */
    /* loaded from: classes5.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.a<com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.f> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.f invoke() {
            o0 o0Var = o0.this;
            return (com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.f) new androidx.lifecycle.k1(o0Var, new v0(o0Var)).a(com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.f.class);
        }
    }

    public o0() {
        super(C1987R.layout.fragment_graph_sleep_disorder);
        this.f61414j = new g(this);
        this.f61415k = nm0.h.b(new c());
        this.f61416l = nm0.h.b(new b());
        this.f61417m = nm0.h.b(new d());
        this.f61418n = nm0.h.b(new h());
    }

    public static void s1(o0 this$0, int i11) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        androidx.lifecycle.k0<Integer> k0Var = this$0.f61407c;
        if (k0Var != null) {
            k0Var.setValue(Integer.valueOf(i11));
        }
    }

    public static void t1(o0 this$0) {
        Integer value;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        androidx.lifecycle.k0<Integer> k0Var = this$0.f61407c;
        if (k0Var != null && (value = k0Var.getValue()) != null) {
            NestedScrollView nestedScrollView = this$0.f61409e;
            if (nestedScrollView != null) {
                nestedScrollView.setScrollY(value.intValue());
            } else {
                kotlin.jvm.internal.u.s("scrollView");
                throw null;
            }
        }
    }

    public static final Period w1(o0 o0Var) {
        return (Period) o0Var.f61415k.getValue();
    }

    public static final void y1(o0 o0Var, Context context) {
        int i11;
        if (o0Var.z1()) {
            i11 = C1987R.string.sleepApnea_ahiDetailViewHelpUrl;
        } else {
            i11 = C1987R.string.sleepApnea_breathingDisorderDetailViewHelpUrl;
        }
        o0Var.startActivity(HMWebActivity.f35395c.b(context, null, i11));
    }

    private final boolean z1() {
        return ((Boolean) this.f61414j.getValue(this, f61406p[0])).booleanValue();
    }

    public final void A1(androidx.lifecycle.k0<Integer> k0Var) {
        androidx.lifecycle.k0<Integer> k0Var2 = this.f61407c;
        if (k0Var2 != null) {
            k0Var2.removeObservers(this);
        }
        this.f61407c = k0Var;
        if (k0Var != null) {
            k0Var.observe(this, new e(new f()));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.f fVar = (com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.f) this.f61418n.getValue();
        if (z1()) {
            xw.d.c(this, fVar.f0(), new s0(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        kotlin.jvm.internal.u.h(parentFragment, "null cannot be cast to non-null type com.withings.views.view.BlockableViewPager.PagerCallback");
        this.f61408d = (BlockableViewPager.b) parentFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f61408d = null;
        super.onDetach();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0182  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.o0.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
