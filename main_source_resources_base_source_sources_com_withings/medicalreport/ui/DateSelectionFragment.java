package com.withings.medicalreport.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.h6;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.k1;
import androidx.lifecycle.l0;
import com.withings.common.compose.component.v4;
import com.withings.common.compose.component.y3;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import k1.j1;
import k1.r0;
import k1.v0;
import kotlin.Metadata;
import kotlin.collections.i0;
import n0.y0;
import org.joda.time.DateTime;
/* compiled from: DateSelectionFragment.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000f²\u0006\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\t\u001a\u0004\u0018\u00010\b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000b\u001a\u0004\u0018\u00010\n8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\r\u001a\u0004\u0018\u00010\f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000e\u001a\u0004\u0018\u00010\f8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/medicalreport/ui/DateSelectionFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "", "Lcom/withings/common/compose/component/e0;", "dateRangeInfos", "", "selectedIndex", "", "shouldDisplaySleepWarning", "Lorg/joda/time/DateTime;", "startDate", "endDate", "medicalreport_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DateSelectionFragment extends Fragment {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f42160e = 0;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f42161c = nm0.h.b(new f());

    /* renamed from: d  reason: collision with root package name */
    private a f42162d;

    /* compiled from: DateSelectionFragment.kt */
    /* loaded from: classes4.dex */
    public interface a {
        void r(DateTime dateTime, DateTime dateTime2);
    }

    /* compiled from: DateSelectionFragment.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<nm0.j<DateTime, DateTime>, nm0.y> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(nm0.j<DateTime, DateTime> jVar) {
            DateTime dateTime;
            nm0.j<DateTime, DateTime> jVar2 = jVar;
            a aVar = DateSelectionFragment.this.f42162d;
            if (aVar != null) {
                DateTime dateTime2 = null;
                if (jVar2 != null) {
                    dateTime = jVar2.c();
                } else {
                    dateTime = null;
                }
                if (jVar2 != null) {
                    dateTime2 = jVar2.d();
                }
                aVar.r(dateTime, dateTime2);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: DateSelectionFragment.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        c() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -1318102055, new l(DateSelectionFragment.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: DateSelectionFragment.kt */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            DateSelectionFragment dateSelectionFragment = DateSelectionFragment.this;
            qc.b bVar = new qc.b(dateSelectionFragment.requireContext());
            bVar.v(dateSelectionFragment.getString(C1987R.string.healthReport_customRange_warning, 92));
            bVar.x(C1987R.string._OK_, null);
            bVar.s();
            return nm0.y.f85009a;
        }
    }

    /* compiled from: DateSelectionFragment.kt */
    /* loaded from: classes4.dex */
    static final class e implements l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f42166a;

        e(ym0.l lVar) {
            this.f42166a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f42166a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f42166a;
        }

        public final int hashCode() {
            return this.f42166a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f42166a.invoke(obj);
        }
    }

    /* compiled from: DateSelectionFragment.kt */
    /* loaded from: classes4.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<u> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final u invoke() {
            DateSelectionFragment dateSelectionFragment = DateSelectionFragment.this;
            return (u) new k1(dateSelectionFragment, new m(dateSelectionFragment)).a(u.class);
        }
    }

    public static final void s1(DateSelectionFragment dateSelectionFragment, androidx.compose.runtime.a aVar, int i11) {
        dateSelectionFragment.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-1821919440);
        y3.d(null, ay.b.u(C1987R.string.profile_medicalReport_timeFrame_custom, g11), null, 0.0f, 0.0f, 0L, s1.b.b(g11, 95382906, new com.withings.medicalreport.ui.f(dateSelectionFragment)), g11, 1572864, 61);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new g(dateSelectionFragment, i11));
        }
    }

    public static final void t1(DateSelectionFragment dateSelectionFragment, androidx.compose.runtime.a aVar, int i11) {
        boolean z5;
        boolean z11;
        dateSelectionFragment.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-381281128);
        e.a aVar2 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e c11 = y0.c(aVar2, y0.b(g11), false, 14);
        g11.s(-483455358);
        androidx.compose.ui.layout.l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a11 = g.a.a();
        s1.a c12 = androidx.compose.ui.layout.y.c(c11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a11);
            } else {
                g11.m();
            }
            ym0.p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
            }
            dq.x.b(0, c12, j1.a(g11), g11, 2058660585);
            r0.i iVar = r0.i.f94242a;
            v4.b(null, ay.b.u(C1987R.string.profile_medicalReport_timeFrame_title, g11), ay.b.u(C1987R.string.profile_medicalReport_timeFrame_description, g11), null, 0.0f, 0.0f, 0, 0, g11, 0, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
            n0.z.a(s2.d.a(2131231662, g11), null, x0.g(e1.e(aVar2, 1.0f), yk.h.o(), yk.h.q()), null, null, 0.0f, null, g11, 56, 120);
            r0 b12 = t1.d.b(dateSelectionFragment.w1().j0(), i0.f76187a, g11);
            r0 a12 = t1.d.a(dateSelectionFragment.w1().p0(), g11);
            r0 a13 = t1.d.a(dateSelectionFragment.w1().r0(), g11);
            y3.c(null, ay.b.u(C1987R.string.profile_medicalReport_timeFrame_list, g11), null, null, 0.0f, 0L, s1.b.b(g11, -640393794, new i(b12, a12, dateSelectionFragment)), g11, 1572864, 61);
            Integer num = (Integer) a12.getValue();
            if (num != null && num.intValue() == 2) {
                z5 = true;
            } else {
                z5 = false;
            }
            l0.g.c(iVar, z5, null, null, null, null, s1.b.b(g11, 1212683914, new j(dateSelectionFragment)), g11, 1572870, 30);
            Boolean bool = (Boolean) a13.getValue();
            if (bool != null) {
                z11 = bool.booleanValue();
            } else {
                z11 = false;
            }
            l0.g.c(iVar, z11, null, null, null, null, com.withings.medicalreport.ui.a.f42228a, g11, 1572870, 30);
            androidx.compose.runtime.v b13 = h6.b(g11);
            if (b13 != null) {
                b13.G(new k(dateSelectionFragment, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u w1() {
        return (u) this.f42161c.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        a aVar;
        kotlin.jvm.internal.u.j(context, "context");
        super.onAttach(context);
        if (context instanceof a) {
            aVar = (a) context;
        } else {
            aVar = null;
        }
        this.f42162d = aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.u.j(inflater, "inflater");
        w1().q0().observe(getViewLifecycleOwner(), new e(new b()));
        Context requireContext = requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6, 0);
        composeView.setContent(new s1.a(true, -1841253185, new c()));
        xw.n<nm0.y> t02 = w1().t0();
        androidx.lifecycle.d0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.u.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        t02.v(viewLifecycleOwner, new d());
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f42162d = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        kotlin.jvm.internal.u.h(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ActionBar supportActionBar = ((AppCompatActivity) activity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
    }
}
