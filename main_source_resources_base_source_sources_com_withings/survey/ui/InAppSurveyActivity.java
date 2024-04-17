package com.withings.survey.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.material.c5;
import androidx.compose.material.f5;
import androidx.compose.material3.g9;
import androidx.compose.material3.y7;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import androidx.lifecycle.k1;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.common.compose.component.z4;
import com.withings.survey.viewModel.InAppSurveyViewModel;
import com.withings.wiscale2.C1987R;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;
import x1.b;
import x1.d;
/* compiled from: InAppSurveyActivity.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0014²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010\t\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\f\u001a\u0004\u0018\u00010\u000b8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\nX\u008a\u0084\u0002²\u0006\u0014\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0011\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0013\u001a\u0004\u0018\u00010\u00128\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/survey/ui/InAppSurveyActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "", "finishSurveyEvent", "Lf50/a;", "stateUi", "showQuitDialog", "loading", "", "currentQuestionId", "", "questionsPath", "Lz50/a;", "preSelectedOptions", "buttonNextEnabled", "Lt50/a;", "nextButton", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class InAppSurveyActivity extends Hilt_InAppSurveyActivity {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f44288f = 0;

    /* renamed from: e  reason: collision with root package name */
    private final androidx.lifecycle.i1 f44289e = new androidx.lifecycle.i1(kotlin.jvm.internal.q0.b(InAppSurveyViewModel.class), new d(this), new c(this), new e(this));

    /* compiled from: InAppSurveyActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static Intent a(Context context, String surveyId, long j5) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(surveyId, "surveyId");
            Intent putExtra = new Intent(context, InAppSurveyActivity.class).putExtra("survey_id", surveyId).putExtra(HealthUserProfile.USER_PROFILE_KEY_USER_ID, j5);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: InAppSurveyActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        b() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, 893545088, new t1(InAppSurveyActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f44291a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f44291a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f44291a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.a<androidx.lifecycle.m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f44292a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f44292a = componentActivity;
        }

        @Override // ym0.a
        public final androidx.lifecycle.m1 invoke() {
            return this.f44292a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f44293a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f44293a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f44293a.getDefaultViewModelCreationExtras();
        }
    }

    public static final void A3(InAppSurveyActivity inAppSurveyActivity, androidx.compose.runtime.a aVar, int i11) {
        inAppSurveyActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-402600931);
        if ((i11 & 1) == 0 && g11.h()) {
            g11.C();
        } else {
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e d11 = androidx.compose.foundation.layout.e1.d(aVar2);
            androidx.compose.ui.layout.l0 e11 = androidx.camera.camera2.internal.v0.e(g11, 733328855, false, g11, -1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(d11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a11);
                } else {
                    g11.m();
                }
                ym0.p b10 = com.withings.authentication.e.b(g11, e11, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
                }
                dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
                androidx.compose.ui.e u11 = androidx.compose.foundation.layout.e1.u(androidx.compose.foundation.layout.m.f4307a.g(aVar2, b.a.e()), null, 3);
                d.a g12 = b.a.g();
                g11.s(-483455358);
                androidx.compose.ui.layout.l0 a12 = androidx.compose.foundation.layout.n.a(androidx.compose.foundation.layout.e.h(), g12, g11);
                g11.s(-1323940314);
                int G2 = g11.G();
                k1.v0 l6 = g11.l();
                ym0.a a13 = g.a.a();
                s1.a c12 = androidx.compose.ui.layout.y.c(u11);
                if (g11.i() instanceof k1.d) {
                    g11.A();
                    if (g11.e()) {
                        g11.F(a13);
                    } else {
                        g11.m();
                    }
                    ym0.p b11 = com.withings.authentication.e.b(g11, a12, g11, l6);
                    if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G2))) {
                        androidx.camera.camera2.internal.l0.d(G2, g11, G2, b11);
                    }
                    dq.x.b(0, c12, k1.j1.a(g11), g11, 2058660585);
                    nk.a0.i(0, 0, 29, 0L, g11, null, null, ay.b.u(C1987R.string.programsError_generic_title, g11));
                    nk.a.d(null, ay.b.u(C1987R.string.programsError_generic_description, g11), 0L, d3.g.a(3), 0, 0, null, g11, 0, 117);
                    g11.J();
                    g11.o();
                    g11.J();
                    g11.J();
                    g11.J();
                    g11.o();
                    g11.J();
                    g11.J();
                } else {
                    a3.g.s();
                    throw null;
                }
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new g0(inAppSurveyActivity, i11));
        }
    }

    public static final void B3(InAppSurveyActivity inAppSurveyActivity, androidx.compose.runtime.a aVar, int i11) {
        inAppSurveyActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-324449327);
        if ((i11 & 1) == 0 && g11.h()) {
            g11.C();
        } else {
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e d11 = androidx.compose.foundation.layout.e1.d(aVar2);
            androidx.compose.ui.layout.l0 e11 = androidx.camera.camera2.internal.v0.e(g11, 733328855, false, g11, -1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(d11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a11);
                } else {
                    g11.m();
                }
                ym0.p b10 = com.withings.authentication.e.b(g11, e11, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
                }
                dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
                f5.b(0.0f, 0, 0, 30, 0L, 0L, g11, androidx.compose.foundation.layout.m.f4307a.g(aVar2, b.a.e()));
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new h0(inAppSurveyActivity, i11));
        }
    }

    public static final void C3(InAppSurveyActivity inAppSurveyActivity, y50.a aVar, ym0.a aVar2, r8.n nVar, c5 c5Var, z4 z4Var, androidx.compose.runtime.a aVar3, int i11) {
        inAppSurveyActivity.getClass();
        androidx.compose.runtime.b g11 = aVar3.g(-417266056);
        g11.s(773894976);
        g11.s(-492369756);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.datastore.preferences.protobuf.e.b(k1.y.i(g11), g11);
        }
        g11.J();
        CoroutineScope a11 = ((androidx.compose.runtime.k) t11).a();
        g11.J();
        g11.s(-1645059039);
        Object t12 = g11.t();
        if (t12 == a.C0060a.a()) {
            t12 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
            g11.n(t12);
        }
        k1.r0 r0Var = (k1.r0) t12;
        g11.J();
        k1.r0 b10 = androidx.compose.runtime.l0.b(inAppSurveyActivity.E3().O0(), g11);
        k1.r0 b11 = androidx.compose.runtime.l0.b(inAppSurveyActivity.E3().V0(), g11);
        k1.r0 a12 = androidx.compose.runtime.l0.a(inAppSurveyActivity.E3().U0(), kotlin.collections.i0.f76187a, null, g11, 2);
        String u11 = ay.b.u(C1987R.string._INTERNET_NEEDED_TITLE_, g11);
        k1.r0 a13 = androidx.compose.runtime.l0.a(inAppSurveyActivity.E3().M0(), 300, null, g11, 2);
        k1.r0 a14 = androidx.compose.runtime.l0.a(inAppSurveyActivity.E3().Z0(), Boolean.TRUE, null, g11, 2);
        g11.s(-1645058446);
        boolean K = g11.K((Integer) b10.getValue());
        Object t13 = g11.t();
        if (K || t13 == a.C0060a.a()) {
            t13 = androidx.compose.runtime.l0.e(new l1(aVar, b10));
            g11.n(t13);
        }
        g11.J();
        Context context = (Context) g11.D(androidx.compose.ui.platform.u0.d());
        k1.y.f((Integer) b10.getValue(), new i0(b10, nVar, null), g11);
        y7.b(null, s1.b.b(g11, -164805828, new k0(aVar2, aVar)), s1.b.b(g11, -1205097667, new t0((k1.o1) t13, r0Var, a14, inAppSurveyActivity, a11, context, z4Var, u11, b11)), null, null, 0, 0L, 0L, null, s1.b.b(g11, -194953209, new j1(aVar, nVar, a13, inAppSurveyActivity, a12, a11, c5Var)), g11, 805306800, 505);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new k1(inAppSurveyActivity, aVar, aVar2, nVar, c5Var, z4Var, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InAppSurveyViewModel E3() {
        return (InAppSurveyViewModel) this.f44289e.getValue();
    }

    public static final void z3(InAppSurveyActivity inAppSurveyActivity, t50.a aVar, List list, ym0.a aVar2, ym0.a aVar3, ym0.a aVar4, ym0.l lVar, androidx.compose.runtime.a aVar5, int i11) {
        boolean z5;
        inAppSurveyActivity.getClass();
        androidx.compose.runtime.b g11 = aVar5.g(520741942);
        g11.s(-1328596177);
        if ((((57344 & i11) ^ 24576) > 16384 && g11.K(aVar4)) || (i11 & 24576) == 16384) {
            z5 = true;
        } else {
            z5 = false;
        }
        Object t11 = g11.t();
        if (z5 || t11 == a.C0060a.a()) {
            t11 = new s(aVar4);
            g11.n(t11);
        }
        g11.J();
        e.j.a(0, 1, g11, (ym0.a) t11, false);
        xk.c.a(androidx.compose.foundation.layout.e1.d(androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2)), aVar.f(), aVar.e(), s1.b.b(g11, 740690218, new e0(aVar, lVar, list, inAppSurveyActivity, aVar3, aVar2)), g11, 3072, 0);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new f0(inAppSurveyActivity, aVar, list, aVar2, aVar3, aVar4, lVar, i11));
        }
    }

    @Override // com.withings.survey.ui.Hilt_InAppSurveyActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.k.a(this, new s1.a(true, -160929446, new b()));
    }
}
