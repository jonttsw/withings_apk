package com.withings.wiscale2.settings;

import android.os.Bundle;
import androidx.compose.material3.y7;
import androidx.compose.runtime.a;
import com.withings.common.compose.component.a3;
import com.withings.common.compose.component.l2;
import com.withings.library.authentication.api.ConstantsWs;
import i6.a;
import java.util.List;
import kotlin.Metadata;
import qk.wb;
/* compiled from: TracesLogsActivity.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/wiscale2/settings/TracesLogsActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "", "", "logs", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TracesLogsActivity extends Hilt_TracesLogsActivity {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f59781e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TracesLogsActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TracesLogsViewModel f59783b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(TracesLogsViewModel tracesLogsViewModel) {
            super(2);
            this.f59783b = tracesLogsViewModel;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                List V = kotlin.collections.x.V(new a3.a(new l2.c(wb.f93187a), new l5(this.f59783b)));
                aVar2.s(1510381665);
                TracesLogsActivity tracesLogsActivity = TracesLogsActivity.this;
                boolean K = aVar2.K(tracesLogsActivity);
                Object t11 = aVar2.t();
                if (K || t11 == a.C0060a.a()) {
                    t11 = new m5(tracesLogsActivity);
                    aVar2.n(t11);
                }
                aVar2.J();
                com.withings.common.compose.component.c5.a(0L, 0L, "Traces logs", false, null, V, null, null, false, (ym0.a) t11, aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 475);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TracesLogsActivity.kt */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.o1<List<String>> f59784a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k1.r0 r0Var) {
            super(3);
            this.f59784a = r0Var;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
            int i11;
            r0.w padding = wVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(padding, "padding");
            if ((intValue & 14) == 0) {
                if (aVar2.K(padding)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                intValue |= i11;
            }
            if ((intValue & 91) == 18 && aVar2.h()) {
                aVar2.C();
            } else {
                androidx.compose.ui.e e11 = androidx.compose.foundation.layout.x0.e(androidx.compose.foundation.layout.e1.d(androidx.compose.ui.e.f8927a), padding);
                aVar2.s(1510381862);
                k1.o1<List<String>> o1Var = this.f59784a;
                boolean K = aVar2.K(o1Var);
                Object t11 = aVar2.t();
                if (K || t11 == a.C0060a.a()) {
                    t11 = new q5(o1Var);
                    aVar2.n(t11);
                }
                aVar2.J();
                s0.a.a(e11, null, null, false, null, null, null, false, (ym0.l) t11, aVar2, 0, ConstantsWs.WS_STATUS_NOREPOUSER);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TracesLogsActivity.kt */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TracesLogsViewModel f59786b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f59787c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f59788d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(TracesLogsViewModel tracesLogsViewModel, int i11, int i12) {
            super(2);
            this.f59786b = tracesLogsViewModel;
            this.f59787c = i11;
            this.f59788d = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f59787c | 1);
            TracesLogsActivity.this.z3(this.f59786b, aVar, g11, this.f59788d);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: TracesLogsActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        d() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, 1826421275, new r5(TracesLogsActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    @Override // com.withings.wiscale2.settings.Hilt_TracesLogsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.k.a(this, new s1.a(true, 2031807861, new d()));
    }

    public final void z3(TracesLogsViewModel tracesLogsViewModel, androidx.compose.runtime.a aVar, int i11, int i12) {
        int i13;
        int i14;
        i6.a aVar2;
        TracesLogsViewModel tracesLogsViewModel2;
        TracesLogsViewModel tracesLogsViewModel3;
        androidx.compose.runtime.b g11 = aVar.g(559926839);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 2;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (g11.K(this)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i13 |= i14;
        }
        if (i15 == 1 && (i13 & 91) == 18 && g11.h()) {
            g11.C();
            tracesLogsViewModel3 = tracesLogsViewModel;
        } else {
            g11.M0();
            if ((i11 & 1) != 0 && !g11.v0()) {
                g11.C();
            } else if (i15 != 0) {
                g11.s(1890788296);
                androidx.lifecycle.n1 a11 = j6.a.a(g11);
                if (a11 != null) {
                    fk0.c a12 = e6.a.a(a11, g11);
                    g11.s(1729797275);
                    if (a11 instanceof androidx.lifecycle.u) {
                        aVar2 = ((androidx.lifecycle.u) a11).getDefaultViewModelCreationExtras();
                    } else {
                        aVar2 = a.C1058a.f71431b;
                    }
                    androidx.lifecycle.g1 a13 = j6.b.a(TracesLogsViewModel.class, a11, null, a12, aVar2, g11);
                    g11.J();
                    g11.J();
                    tracesLogsViewModel2 = (TracesLogsViewModel) a13;
                    g11.l0();
                    y7.b(null, s1.b.b(g11, 852447219, new a(tracesLogsViewModel2)), null, null, null, 0, 0L, 0L, null, s1.b.b(g11, -284762872, new b(h6.b.c(tracesLogsViewModel2.i0(), g11))), g11, 805306416, ConstantsWs.WS_STATUS_NO_FILTER);
                    tracesLogsViewModel3 = tracesLogsViewModel2;
                } else {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
            }
            tracesLogsViewModel2 = tracesLogsViewModel;
            g11.l0();
            y7.b(null, s1.b.b(g11, 852447219, new a(tracesLogsViewModel2)), null, null, null, 0, 0L, 0L, null, s1.b.b(g11, -284762872, new b(h6.b.c(tracesLogsViewModel2.i0(), g11))), g11, 805306416, ConstantsWs.WS_STATUS_NO_FILTER);
            tracesLogsViewModel3 = tracesLogsViewModel2;
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new c(tracesLogsViewModel3, i11, i12));
        }
    }
}
