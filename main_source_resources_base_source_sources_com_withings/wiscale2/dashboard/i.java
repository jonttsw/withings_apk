package com.withings.wiscale2.dashboard;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v0;
import androidx.lifecycle.i1;
import androidx.lifecycle.k1;
import androidx.lifecycle.l0;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.measure.accountmeasure.unknown.ui.j;
import i6.a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
import tb0.u1;
/* compiled from: DashboardFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/dashboard/i;", "Landroidx/fragment/app/Fragment;", "Lcom/withings/wiscale2/measure/accountmeasure/unknown/ui/j$a;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class i extends s implements j.a {

    /* renamed from: h  reason: collision with root package name */
    private final c f50529h = new c(this);

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f50530i = nm0.h.b(j.f50542a);

    /* renamed from: j  reason: collision with root package name */
    private final LifecycleViewBindingProperty f50531j = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());

    /* renamed from: k  reason: collision with root package name */
    private final i1 f50532k;

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f50528m = {androidx.camera.core.v.c(i.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(i.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentAllMetricsBinding;", 0)};

    /* renamed from: l  reason: collision with root package name */
    public static final a f50527l = new Object();

    /* compiled from: DashboardFragment.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    /* compiled from: DashboardFragment.kt */
    /* loaded from: classes4.dex */
    static final class b implements l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f50533a;

        b(ym0.l lVar) {
            this.f50533a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f50533a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f50533a;
        }

        public final int hashCode() {
            return this.f50533a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f50533a.invoke(obj);
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes4.dex */
    public static final class c implements bn0.d<Fragment, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f50534a = nm0.h.b(new l(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f50535b;

        public c(Fragment fragment) {
            this.f50535b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f50534a.getValue();
        }
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.l<i, u1> {
        @Override // ym0.l
        public final u1 invoke(i iVar) {
            i fragment = iVar;
            kotlin.jvm.internal.u.j(fragment, "fragment");
            return u1.a(fragment.requireView());
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.a<Fragment> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f50536a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f50536a = fragment;
        }

        @Override // ym0.a
        public final Fragment invoke() {
            return this.f50536a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.a<n1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a f50537a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f50537a = eVar;
        }

        @Override // ym0.a
        public final n1 invoke() {
            return (n1) this.f50537a.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nm0.g f50538a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(nm0.g gVar) {
            super(0);
            this.f50538a = gVar;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return ((n1) this.f50538a.getValue()).getViewModelStore();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nm0.g f50539a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(nm0.g gVar) {
            super(0);
            this.f50539a = gVar;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            androidx.lifecycle.u uVar;
            n1 n1Var = (n1) this.f50539a.getValue();
            if (n1Var instanceof androidx.lifecycle.u) {
                uVar = (androidx.lifecycle.u) n1Var;
            } else {
                uVar = null;
            }
            if (uVar != null) {
                return uVar.getDefaultViewModelCreationExtras();
            }
            return a.C1058a.f71431b;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* renamed from: com.withings.wiscale2.dashboard.i$i  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0686i extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f50540a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ nm0.g f50541b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0686i(Fragment fragment, nm0.g gVar) {
            super(0);
            this.f50540a = fragment;
            this.f50541b = gVar;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            androidx.lifecycle.u uVar;
            k1.b defaultViewModelProviderFactory;
            n1 n1Var = (n1) this.f50541b.getValue();
            if (n1Var instanceof androidx.lifecycle.u) {
                uVar = (androidx.lifecycle.u) n1Var;
            } else {
                uVar = null;
            }
            if (uVar == null || (defaultViewModelProviderFactory = uVar.getDefaultViewModelProviderFactory()) == null) {
                k1.b defaultViewModelProviderFactory2 = this.f50540a.getDefaultViewModelProviderFactory();
                kotlin.jvm.internal.u.i(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
            return defaultViewModelProviderFactory;
        }
    }

    /* compiled from: DashboardFragment.kt */
    /* loaded from: classes4.dex */
    static final class j extends kotlin.jvm.internal.w implements ym0.a<u> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f50542a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final u invoke() {
            return new u();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public i() {
        nm0.g a11 = nm0.h.a(LazyThreadSafetyMode.f76138c, new f(new e(this)));
        this.f50532k = v0.a(this, q0.b(DashboardViewModel.class), new g(a11), new h(a11), new C0686i(this, a11));
    }

    public static void s1(i this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        ((DashboardViewModel) this$0.f50532k.getValue()).p0();
    }

    public static final u1 t1(i iVar) {
        iVar.getClass();
        return (u1) iVar.f50531j.getValue(iVar, f50528m[1]);
    }

    public static final u u1(i iVar) {
        return (u) iVar.f50530i.getValue();
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.unknown.ui.j.a
    public final void G2(User user) {
        ((DashboardViewModel) this.f50532k.getValue()).q0(user);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        i1 i1Var = this.f50532k;
        DashboardViewModel dashboardViewModel = (DashboardViewModel) i1Var.getValue();
        User value = ((DashboardViewModel) i1Var.getValue()).k0().getValue();
        if (value == null) {
            value = (User) this.f50529h.getValue(this, f50528m[0]);
        }
        kotlin.jvm.internal.u.g(value);
        dashboardViewModel.q0(value);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        fn0.k<?>[] kVarArr = f50528m;
        fn0.k<?> kVar = kVarArr[1];
        LifecycleViewBindingProperty lifecycleViewBindingProperty = this.f50531j;
        ((u1) lifecycleViewBindingProperty.getValue(this, kVar)).f99529a.setAdapter((u) this.f50530i.getValue());
        ((u1) lifecycleViewBindingProperty.getValue(this, kVarArr[1])).f99530b.setOnRefreshListener(new k7.h(this, 6));
        DashboardViewModel dashboardViewModel = (DashboardViewModel) this.f50532k.getValue();
        dashboardViewModel.q0((User) this.f50529h.getValue(this, kVarArr[0]));
        dashboardViewModel.m0().observe(getViewLifecycleOwner(), new b(new com.withings.wiscale2.dashboard.j(this)));
        dashboardViewModel.j0().observe(getViewLifecycleOwner(), new b(new k(this)));
    }
}
