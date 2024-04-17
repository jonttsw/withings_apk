package com.withings.measurements.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.measurement.model.MeasurementsVertical;
import com.withings.user.User;
import gz.j0;
import i6.a;
import javax.inject.Inject;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: MeasurementsFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/measurements/ui/i2;", "Landroidx/fragment/app/Fragment;", "Ly70/c;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class i2 extends r1 implements y70.c {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f42049k = 0;

    /* renamed from: h  reason: collision with root package name */
    private final androidx.lifecycle.i1 f42050h;
    @Inject

    /* renamed from: i  reason: collision with root package name */
    public ch.d f42051i;
    @Inject

    /* renamed from: j  reason: collision with root package name */
    public s1 f42052j;

    /* compiled from: MeasurementsFragment.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        a() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, 416306907, new h2(i2.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.a<Fragment> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f42054a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f42054a = fragment;
        }

        @Override // ym0.a
        public final Fragment invoke() {
            return this.f42054a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.a<androidx.lifecycle.n1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a f42055a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f42055a = bVar;
        }

        @Override // ym0.a
        public final androidx.lifecycle.n1 invoke() {
            return (androidx.lifecycle.n1) this.f42055a.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.a<androidx.lifecycle.m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nm0.g f42056a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(nm0.g gVar) {
            super(0);
            this.f42056a = gVar;
        }

        @Override // ym0.a
        public final androidx.lifecycle.m1 invoke() {
            return ((androidx.lifecycle.n1) this.f42056a.getValue()).getViewModelStore();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nm0.g f42057a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(nm0.g gVar) {
            super(0);
            this.f42057a = gVar;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            androidx.lifecycle.u uVar;
            androidx.lifecycle.n1 n1Var = (androidx.lifecycle.n1) this.f42057a.getValue();
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
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f42058a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ nm0.g f42059b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment, nm0.g gVar) {
            super(0);
            this.f42058a = fragment;
            this.f42059b = gVar;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            androidx.lifecycle.u uVar;
            k1.b defaultViewModelProviderFactory;
            androidx.lifecycle.n1 n1Var = (androidx.lifecycle.n1) this.f42059b.getValue();
            if (n1Var instanceof androidx.lifecycle.u) {
                uVar = (androidx.lifecycle.u) n1Var;
            } else {
                uVar = null;
            }
            if (uVar == null || (defaultViewModelProviderFactory = uVar.getDefaultViewModelProviderFactory()) == null) {
                k1.b defaultViewModelProviderFactory2 = this.f42058a.getDefaultViewModelProviderFactory();
                kotlin.jvm.internal.u.i(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
            return defaultViewModelProviderFactory;
        }
    }

    public i2() {
        nm0.g a11 = nm0.h.a(LazyThreadSafetyMode.f76138c, new c(new b(this)));
        this.f42050h = androidx.fragment.app.v0.a(this, kotlin.jvm.internal.q0.b(MeasurementsViewModel.class), new d(a11), new e(a11), new f(this, a11));
    }

    public static final void s1(i2 i2Var) {
        ah.q i11 = i2Var.A1().i();
        Context requireContext = i2Var.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        long q11 = o70.a.e(((MeasurementsViewModel) i2Var.f42050h.getValue()).R0().getValue().a()).q();
        i11.getClass();
        i2Var.startActivity(ah.q.c(requireContext, q11));
    }

    public static final MeasurementsViewModel t1(i2 i2Var) {
        return (MeasurementsViewModel) i2Var.f42050h.getValue();
    }

    public static final void u1(i2 i2Var, j0.a measurement) {
        MeasurementsViewModel measurementsViewModel = (MeasurementsViewModel) i2Var.f42050h.getValue();
        kotlin.jvm.internal.u.j(measurement, "measurement");
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(measurementsViewModel), Dispatchers.getIO(), null, new k2(measurementsViewModel, measurement, null), 2, null);
        s1 s1Var = i2Var.f42052j;
        if (s1Var != null) {
            Context requireContext = i2Var.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            s1Var.a(requireContext, measurement, o70.a.e(((MeasurementsViewModel) i2Var.f42050h.getValue()).R0().getValue().a()));
            return;
        }
        kotlin.jvm.internal.u.s("measurementRedirection");
        throw null;
    }

    public static final void v1(i2 i2Var) {
        i2Var.getClass();
        int i11 = v70.a.f103433b;
        v70.a.c("explore_data_view", kotlin.collections.s0.i(new nm0.j("view_type", "his")), 2);
        ah.k g11 = i2Var.A1().g();
        Context requireContext = i2Var.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        long id2 = ((MeasurementsViewModel) i2Var.f42050h.getValue()).R0().getValue().a().getId();
        g11.getClass();
        i2Var.startActivity(ah.k.l(requireContext, id2, null));
    }

    public static final void w1(i2 i2Var, j0.a aVar) {
        s1 s1Var = i2Var.f42052j;
        if (s1Var != null) {
            Context requireContext = i2Var.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            s1Var.b(requireContext, aVar, o70.a.e(((MeasurementsViewModel) i2Var.f42050h.getValue()).R0().getValue().a()));
            return;
        }
        kotlin.jvm.internal.u.s("measurementRedirection");
        throw null;
    }

    public static final void x1(i2 i2Var) {
        ah.h w11 = i2Var.A1().w();
        Context requireContext = i2Var.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        User e11 = o70.a.e(((MeasurementsViewModel) i2Var.f42050h.getValue()).R0().getValue().a());
        w11.getClass();
        Intent a11 = ah.a.a(requireContext, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL), "com.withings.wiscale2.dashboard.DashboardActivity", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, e11);
        kotlin.jvm.internal.u.i(a11, "putExtra(...)");
        i2Var.startActivity(a11);
    }

    public static final void y1(i2 i2Var) {
        ah.m user = i2Var.A1().getUser();
        Context requireContext = i2Var.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        User e11 = o70.a.e(((MeasurementsViewModel) i2Var.f42050h.getValue()).M0().getValue());
        user.getClass();
        i2Var.startActivity(ah.m.B(requireContext, e11));
    }

    public static final void z1(i2 i2Var, MeasurementsVertical measurementsVertical, boolean z5) {
        ah.s C = i2Var.A1().C();
        Context requireContext = i2Var.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        int ordinal = measurementsVertical.ordinal();
        com.withings.user.core.models.User user = ((MeasurementsViewModel) i2Var.f42050h.getValue()).R0().getValue().a();
        Boolean valueOf = Boolean.valueOf(z5);
        C.getClass();
        kotlin.jvm.internal.u.j(user, "user");
        Intent putExtra = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(requireContext.getPackageName(), "com.withings.measurements.ui.HealthVerticalActivity").putExtra("measurement_vertical", ordinal).putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user).putExtra("has_data", valueOf);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        i2Var.startActivity(putExtra);
    }

    public final ch.d A1() {
        ch.d dVar = this.f42051i;
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }

    @Override // y70.c
    public final void i1() {
        MeasurementsViewModel measurementsViewModel = (MeasurementsViewModel) this.f42050h.getValue();
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(measurementsViewModel), null, null, new l2(measurementsViewModel, null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.u.j(inflater, "inflater");
        Context requireContext = requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6, 0);
        composeView.setContent(new s1.a(true, 2030704565, new a()));
        return composeView;
    }
}
