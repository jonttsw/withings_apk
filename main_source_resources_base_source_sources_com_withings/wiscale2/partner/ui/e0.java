package com.withings.wiscale2.partner.ui;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.camera.camera2.internal.p2;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.c5;
import androidx.compose.material.c6;
import androidx.compose.material.d6;
import androidx.compose.material.f4;
import androidx.compose.material.h6;
import androidx.compose.material.p8;
import androidx.compose.material.w7;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k1;
import com.withings.common.compose.component.ButtonSize;
import com.withings.common.compose.component.ColorStyle;
import com.withings.common.compose.component.y3;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import d2.g0;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import x1.b;
import x1.d;
/* compiled from: PartnerExchangesFragment.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0012²\u0006\u0014\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0011\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/wiscale2/partner/ui/e0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "", "kotlin.jvm.PlatformType", "toastMessage", "Lcom/withings/partner/model/Partner;", "partner", "", "hasAssociationError", "", "Lcom/withings/wiscale2/partner/ui/d0;", "list", "Lorg/joda/time/DateTime;", "syncDate", "isAllActivated", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class e0 extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private final l f58962c = new l(this);

    /* renamed from: d  reason: collision with root package name */
    private final m f58963d = new m(this);

    /* renamed from: e  reason: collision with root package name */
    private b1 f58964e;

    /* renamed from: g  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f58961g = {androidx.camera.core.v.c(e0.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(e0.class, "partner", "getPartner()Lcom/withings/partner/model/Partner;", 0)};

    /* renamed from: f  reason: collision with root package name */
    public static final a f58960f = new Object();

    /* compiled from: PartnerExchangesFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartnerExchangesFragment.kt */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<d0> f58965a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e0 f58966b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<d0> list, e0 e0Var) {
            super(3);
            this.f58965a = list;
            this.f58966b = e0Var;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            b bVar = this;
            r0.h SectionCardColumn = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(SectionCardColumn, "$this$SectionCardColumn");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                List<d0> list = bVar.f58965a;
                int i11 = 0;
                int i12 = 0;
                for (Object obj : list) {
                    int i13 = i12 + 1;
                    if (i12 >= 0) {
                        d0 d0Var = (d0) obj;
                        int i14 = i12;
                        int i15 = i11;
                        com.withings.common.compose.component.o.l(androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), d0Var.c(), new g0(bVar.f58966b, d0Var), null, ay.b.u(d0Var.b().getTitle(), aVar2), null, false, false, false, null, aVar2, 0, 1000);
                        aVar2.s(1672371471);
                        if (i14 != kotlin.collections.x.M(list)) {
                            com.withings.common.compose.component.v0.b(0.0f, aVar2, i15, 1);
                        }
                        aVar2.J();
                        i11 = i15;
                        i12 = i13;
                        bVar = this;
                    } else {
                        kotlin.collections.x.K0();
                        throw null;
                    }
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartnerExchangesFragment.kt */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58968b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<d0> f58969c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f58970d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, List<d0> list, int i11) {
            super(2);
            this.f58968b = str;
            this.f58969c = list;
            this.f58970d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f58970d | 1);
            String str = this.f58968b;
            List<d0> list = this.f58969c;
            e0.this.s1(str, list, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartnerExchangesFragment.kt */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Partner f58972b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f58973c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f58974d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Partner partner, boolean z5, int i11) {
            super(2);
            this.f58972b = partner;
            this.f58973c = z5;
            this.f58974d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f58974d | 1);
            Partner partner = this.f58972b;
            boolean z5 = this.f58973c;
            e0.this.t1(partner, z5, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartnerExchangesFragment.kt */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f58975a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f58976b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e.n<Intent, ActivityResult> f58977c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z5, CoroutineScope coroutineScope, e.n<Intent, ActivityResult> nVar) {
            super(2);
            this.f58975a = z5;
            this.f58976b = coroutineScope;
            this.f58977c = nVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2;
            e.a aVar3;
            androidx.compose.ui.e b10;
            long j5;
            androidx.compose.runtime.a aVar4 = aVar;
            if ((num.intValue() & 11) == 2 && aVar4.h()) {
                aVar4.C();
            } else {
                e.a aVar5 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e g11 = androidx.compose.foundation.layout.x0.g(aVar5, yk.h.o(), yk.h.B());
                aVar4.s(-483455358);
                androidx.compose.ui.layout.l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar4, -1323940314);
                int G = aVar4.G();
                k1.v0 l5 = aVar4.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(g11);
                if (aVar4.i() instanceof k1.d) {
                    aVar4.A();
                    if (aVar4.e()) {
                        aVar4.F(a12);
                    } else {
                        aVar4.m();
                    }
                    ym0.p c12 = com.google.protobuf.t.c(aVar4, a11, aVar4, l5);
                    if (aVar4.e() || !kotlin.jvm.internal.u.e(aVar4.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar4, G, c12);
                    }
                    l0.r.c(0, c11, k1.j1.a(aVar4), aVar4, 2058660585);
                    nk.a0.g(0, 0, 29, 0L, aVar4, null, null, ay.b.u(C1987R.string._WTA_AUTHORIZE_HEALTH_TITLE_UPDATE_, aVar4));
                    androidx.compose.ui.e f11 = androidx.compose.foundation.layout.x0.f(aVar5, yk.h.c());
                    aVar4.s(693286680);
                    androidx.compose.ui.layout.l0 i11 = w7.i(androidx.compose.foundation.layout.e.g(), aVar4, -1323940314);
                    int G2 = aVar4.G();
                    k1.v0 l6 = aVar4.l();
                    ym0.a a13 = g.a.a();
                    s1.a c13 = androidx.compose.ui.layout.y.c(f11);
                    if (aVar4.i() instanceof k1.d) {
                        aVar4.A();
                        if (aVar4.e()) {
                            aVar4.F(a13);
                        } else {
                            aVar4.m();
                        }
                        ym0.p c14 = com.google.protobuf.t.c(aVar4, i11, aVar4, l6);
                        if (aVar4.e() || !kotlin.jvm.internal.u.e(aVar4.t(), Integer.valueOf(G2))) {
                            l0.q.a(G2, aVar4, G2, c14);
                        }
                        l0.r.c(0, c13, k1.j1.a(aVar4), aVar4, 2058660585);
                        if (this.f58975a) {
                            aVar4.s(1402149544);
                            androidx.compose.ui.e g12 = androidx.collection.c.g(aVar5, x0.h.e());
                            aVar4.s(615317871);
                            aVar4.J();
                            b10 = androidx.compose.foundation.c.b(g12, ((yk.w) aVar4.D(yk.o.g())).g().b(), d2.h1.a());
                            androidx.compose.ui.e n11 = androidx.compose.foundation.layout.e1.n(b10, yk.h.q());
                            g2.c a14 = s2.d.a(C1987R.drawable.icon_medium_status_moderate, aVar4);
                            j5 = d2.f0.f63261e;
                            n0.z.a(a14, null, n11, null, null, 0.0f, g0.a.a(5, j5), aVar4, 1572920, 56);
                            aVar4.J();
                            aVar2 = aVar4;
                            aVar3 = aVar5;
                        } else {
                            aVar4.s(1402150087);
                            aVar2 = aVar4;
                            aVar3 = aVar5;
                            p8.b("•", androidx.compose.foundation.layout.x0.h(aVar5, yk.h.b(), 0.0f, 2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2, 6, 0, 131068);
                            aVar2.J();
                        }
                        e.a aVar6 = aVar3;
                        androidx.compose.runtime.a aVar7 = aVar2;
                        r0.d0.a(androidx.compose.foundation.layout.e1.n(aVar6, yk.h.o()), aVar7);
                        nk.a.g(0, 0, 0, 61, 0L, aVar7, null, null, ay.b.u(C1987R.string.googleFit_settingsPromptDescription, aVar7));
                        aVar7.J();
                        aVar7.o();
                        aVar7.J();
                        aVar7.J();
                        r0.d0.a(androidx.compose.foundation.layout.e1.n(aVar6, yk.h.c()), aVar7);
                        com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string._OPEN_APP_, aVar7), null, false, ColorStyle.f33324c, null, false, new j0(this.f58976b, this.f58977c), aVar7, 24576, 109);
                        defpackage.d.j(aVar7);
                    } else {
                        a3.g.s();
                        throw null;
                    }
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartnerExchangesFragment.kt */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f58979b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f58980c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z5, int i11) {
            super(2);
            this.f58979b = z5;
            this.f58980c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f58980c | 1);
            e0.this.u1(this.f58979b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartnerExchangesFragment.kt */
    /* loaded from: classes5.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.l<ActivityResult, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f58981a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final nm0.y invoke(ActivityResult activityResult) {
            ActivityResult it = activityResult;
            kotlin.jvm.internal.u.j(it, "it");
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartnerExchangesFragment.kt */
    /* loaded from: classes5.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k1.o1<Boolean> f58983b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(k1.r0 r0Var) {
            super(0);
            this.f58983b = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            b1 b1Var = e0.this.f58964e;
            if (b1Var != null) {
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(b1Var), Dispatchers.getIO(), null, new g1(b1Var, !e0.E1(this.f58983b), null), 2, null);
                return nm0.y.f85009a;
            }
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartnerExchangesFragment.kt */
    /* loaded from: classes5.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f58985b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i11) {
            super(2);
            this.f58985b = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f58985b | 1);
            e0.this.v1(aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Extensions.kt */
    /* loaded from: classes5.dex */
    public static final class j implements k1.b {
        public j() {
        }

        @Override // androidx.lifecycle.k1.b
        public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
            t10.e eVar;
            kotlin.jvm.internal.u.j(modelClass, "modelClass");
            e0 e0Var = e0.this;
            Application application = e0Var.requireActivity().getApplication();
            kotlin.jvm.internal.u.i(application, "getApplication(...)");
            User H1 = e0.H1(e0Var);
            Partner J1 = e0Var.J1();
            eVar = t10.e.f97966j;
            if (eVar != null) {
                return new b1(application, H1, J1, eVar);
            }
            throw new IllegalArgumentException("you must call init before using get".toString());
        }
    }

    /* compiled from: PartnerExchangesFragment.kt */
    /* loaded from: classes5.dex */
    static final class k extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        k() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -7921384, new w0(e0.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class l implements bn0.d<Fragment, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f58988a = nm0.h.b(new x0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f58989b;

        public l(Fragment fragment) {
            this.f58989b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f58988a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class m implements bn0.d<Fragment, Partner> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f58990a = nm0.h.b(new y0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f58991b;

        public m(Fragment fragment) {
            this.f58991b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.partner.model.Partner, java.lang.Object] */
        @Override // bn0.d
        public final Partner getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f58990a.getValue();
        }
    }

    public static final void A1(e0 e0Var, androidx.compose.runtime.a aVar, int i11) {
        e0Var.getClass();
        androidx.compose.runtime.b g11 = aVar.g(555682382);
        b1 b1Var = e0Var.f58964e;
        if (b1Var != null) {
            k1.r0 b10 = t1.d.b(b1Var.t0(), kotlin.collections.i0.f76187a, g11);
            if (e0Var.J1().F() && !com.withings.partner.model.c.c(e0Var.J1()) && (!((List) b10.getValue()).isEmpty())) {
                e0Var.s1(ay.b.v(C1987R.string.partner_importDescription, new Object[]{ay.b.u(e0Var.J1().w(), g11)}, g11), (List) b10.getValue(), g11, 576);
            }
            androidx.compose.runtime.v o02 = g11.o0();
            if (o02 != null) {
                o02.G(new k0(e0Var, i11));
                return;
            }
            return;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    public static final void B1(e0 e0Var, androidx.compose.runtime.a aVar, int i11) {
        e0Var.getClass();
        androidx.compose.runtime.b g11 = aVar.g(1561290334);
        b1 b1Var = e0Var.f58964e;
        if (b1Var != null) {
            k1.r0 b10 = t1.d.b(b1Var.p0(), 0, g11);
            b1 b1Var2 = e0Var.f58964e;
            if (b1Var2 != null) {
                k1.r0 b11 = t1.d.b(b1Var2.y0(), e0Var.J1(), g11);
                b1 b1Var3 = e0Var.f58964e;
                if (b1Var3 != null) {
                    k1.r0 b12 = t1.d.b(b1Var3.q0(), Boolean.FALSE, g11);
                    g11.s(470065172);
                    Integer num = (Integer) b10.getValue();
                    if (num == null || num.intValue() != 0) {
                        Context requireContext = e0Var.requireContext();
                        Integer num2 = (Integer) b10.getValue();
                        kotlin.jvm.internal.u.i(num2, "PartnerExchangesScreen$lambda$2(...)");
                        Toast.makeText(requireContext, ay.b.u(num2.intValue(), g11), 0).show();
                    }
                    g11.J();
                    g11.s(773894976);
                    g11.s(-492369756);
                    Object t11 = g11.t();
                    if (t11 == a.C0060a.a()) {
                        t11 = androidx.datastore.preferences.protobuf.e.b(k1.y.i(g11), g11);
                    }
                    g11.J();
                    CoroutineScope a11 = ((androidx.compose.runtime.k) t11).a();
                    g11.J();
                    c5 f11 = f4.f(ModalBottomSheetValue.f4842a, null, false, g11, 14);
                    wk.h.a(null, f11, com.withings.wiscale2.partner.ui.a.f58888a, s1.b.b(g11, 1449982212, new o0(e0Var, a11, f11)), s1.b.b(g11, -1897818141, new s0(b11, e0Var, b12, a11, f11)), g11, 28096, 1);
                    androidx.compose.runtime.v o02 = g11.o0();
                    if (o02 != null) {
                        o02.G(new t0(e0Var, i11));
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.u.s("viewModel");
                throw null;
            }
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    public static final void C1(e0 e0Var, androidx.compose.ui.e eVar, Partner partner, boolean z5, androidx.compose.runtime.a aVar, int i11, int i12) {
        androidx.compose.ui.e eVar2;
        e0Var.getClass();
        androidx.compose.runtime.b g11 = aVar.g(420566458);
        if ((i12 & 1) != 0) {
            eVar2 = androidx.compose.ui.e.f8927a;
        } else {
            eVar2 = eVar;
        }
        androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(eVar2, 1.0f);
        d.a g12 = b.a.g();
        g11.s(-483455358);
        androidx.compose.ui.layout.l0 a11 = androidx.compose.foundation.layout.n.a(androidx.compose.foundation.layout.e.h(), g12, g11);
        g11.s(-1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(e11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            ym0.p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
            g2.c a13 = s2.d.a(partner.v(), g11);
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            n0.z.a(a13, null, androidx.compose.foundation.layout.w0.a(androidx.compose.foundation.layout.e1.e(aVar2, 0.3f), 1.0f), null, null, 0.0f, null, g11, 440, 120);
            nk.a0.e(0, 0, 28, 0L, g11, androidx.compose.foundation.layout.x0.j(aVar2, 0.0f, yk.h.q(), 0.0f, 0.0f, 13), null, ay.b.u(partner.w(), g11));
            b1 b1Var = e0Var.f58964e;
            if (b1Var != null) {
                t10.c y02 = b1Var.y0();
                g11.s(1425678982);
                boolean K = g11.K(y02);
                Object t11 = g11.t();
                if (K || t11 == a.C0060a.a()) {
                    t11 = androidx.compose.runtime.l0.e(new u0(partner, e0Var));
                    g11.n(t11);
                }
                k1.o1 o1Var = (k1.o1) t11;
                g11.J();
                g11.s(1425679123);
                if (((DateTime) o1Var.getValue()) != null) {
                    androidx.compose.ui.e j5 = androidx.compose.foundation.layout.x0.j(aVar2, 0.0f, yk.h.q(), 0.0f, 0.0f, 13);
                    DateTime dateTime = (DateTime) o1Var.getValue();
                    kotlin.jvm.internal.u.g(dateTime);
                    String abstractInstant = dateTime.toString(DateTimeFormat.forPattern("dd/MM/yy HH:mm:ss"));
                    kotlin.jvm.internal.u.i(abstractInstant, "toString(...)");
                    nk.a.d(j5, ay.b.v(C1987R.string.googleFit_lastSyncFormat, new Object[]{abstractInstant}, g11), 0L, null, 0, 0, null, g11, 0, 124);
                }
                g11.J();
                if (com.withings.partner.model.c.c(partner)) {
                    g11.s(1425679567);
                    int i13 = i11 >> 3;
                    e0Var.t1(partner, z5, g11, (i13 & 112) | (i13 & 14) | 512);
                    g11.J();
                } else {
                    g11.s(1425679702);
                    e0Var.v1(g11, 8);
                    g11.J();
                }
                androidx.compose.runtime.v b11 = h6.b(g11);
                if (b11 != null) {
                    b11.G(new v0(e0Var, eVar2, partner, z5, i11, i12));
                    return;
                }
                return;
            }
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
        a3.g.s();
        throw null;
    }

    public static final boolean E1(k1.o1 o1Var) {
        return ((Boolean) o1Var.getValue()).booleanValue();
    }

    public static final int F1(e0 e0Var) {
        int ordinal = e0Var.J1().ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal == 7) {
                        return C1987R.string.samsungHealth_askConfirmation;
                    }
                    throw new IllegalStateException("Only samsung and googlefit are InApp partner");
                }
                return C1987R.string.huaweiHealth_askConfirmation;
            }
            return C1987R.string._DISCONNECT_SERVICE_CONFIRMATION_HEALTHKIT_;
        }
        return C1987R.string._DISCONNECT_GOOGLE_FIT_CONFIRMATION_;
    }

    public static final User H1(e0 e0Var) {
        return (User) e0Var.f58962c.getValue(e0Var, f58961g[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Partner J1() {
        return (Partner) this.f58963d.getValue(this, f58961g[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s1(String str, List<d0> list, androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(211103165);
        y3.d(null, str, null, 0.0f, 0.0f, 0L, s1.b.b(g11, 634064903, new b(list, this)), g11, ((i11 << 3) & 112) | 1572864, 61);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new c(str, list, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u1(boolean z5, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        androidx.compose.runtime.b g11 = aVar.g(-1947722206);
        if ((i11 & 14) == 0) {
            if (g11.a(z5)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && g11.h()) {
            g11.C();
        } else {
            Object c11 = androidx.compose.material.o.c(g11, 773894976, -492369756);
            if (c11 == a.C0060a.a()) {
                c11 = androidx.datastore.preferences.protobuf.e.b(k1.y.i(g11), g11);
            }
            g11.J();
            CoroutineScope a11 = ((androidx.compose.runtime.k) c11).a();
            g11.J();
            e.n a12 = e.d.a(new g.a(), g.f58981a, g11, 56);
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            nk.u.d(0, 0, 0, 60, 0L, g11, androidx.compose.foundation.layout.x0.g(aVar2, yk.h.o(), yk.h.B()), null, p2.c(ay.b.u(C1987R.string.googleHealthPlatform_description, g11), " ", ay.b.u(C1987R.string.googleFit_reactivateNotificationMessage, g11), "."));
            androidx.compose.material.x0.a(androidx.compose.foundation.layout.x0.g(androidx.compose.foundation.layout.e1.e(aVar2, 1.0f), yk.h.o(), yk.h.B()), ((c6) g11.D(d6.a())).b(), ((androidx.compose.material.c1) g11.D(androidx.compose.material.d1.c())).l(), 0, s1.b.b(g11, -717384545, new e(z5, a11, a12)), g11, 1769472, 24);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new f(z5, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v1(androidx.compose.runtime.a aVar, int i11) {
        int i12;
        androidx.compose.runtime.b g11 = aVar.g(1890009061);
        r0.d0.a(androidx.compose.foundation.layout.e1.f(androidx.compose.ui.e.f8927a, yk.h.B()), g11);
        b1 b1Var = this.f58964e;
        if (b1Var != null) {
            k1.r0 b10 = t1.d.b(b1Var.z0(), Boolean.FALSE, g11);
            if (((Boolean) b10.getValue()).booleanValue()) {
                i12 = C1987R.string.settings_connnectedApps_turnAllCategoriesOff;
            } else {
                i12 = C1987R.string.settings_connnectedApps_turnAllCategoriesOn;
            }
            com.withings.common.compose.component.l.a(null, ay.b.u(i12, g11), null, false, ColorStyle.f33324c, ButtonSize.f33303e, false, new h(b10), g11, 221184, 77);
            androidx.compose.runtime.v o02 = g11.o0();
            if (o02 != null) {
                o02.G(new i(i11));
                return;
            }
            return;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    public static final void w1(e0 e0Var, ym0.a aVar, androidx.compose.runtime.a aVar2, int i11) {
        int i12;
        int i13;
        e0Var.getClass();
        androidx.compose.runtime.b g11 = aVar2.g(953226698);
        if ((i11 & 14) == 0) {
            if (g11.w(aVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && g11.h()) {
            g11.C();
        } else {
            com.withings.common.compose.component.l.a(androidx.compose.foundation.layout.x0.g(androidx.compose.ui.e.f8927a, yk.h.o(), yk.h.B()), ay.b.u(C1987R.string.partner_deactivate, g11), null, false, ColorStyle.f33323b, null, false, aVar, g11, ((i12 << 21) & 29360128) | 24576, 108);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new f0(e0Var, aVar, i11));
        }
    }

    public static final void y1(e0 e0Var, androidx.compose.runtime.a aVar, int i11) {
        e0Var.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-16027491);
        b1 b1Var = e0Var.f58964e;
        if (b1Var != null) {
            k1.r0 b10 = t1.d.b(b1Var.r0(), kotlin.collections.i0.f76187a, g11);
            if (e0Var.J1().E() && !com.withings.partner.model.c.c(e0Var.J1()) && (!((List) b10.getValue()).isEmpty())) {
                e0Var.s1(ay.b.v(C1987R.string.partner_exportDescription, new Object[]{ay.b.u(e0Var.J1().w(), g11)}, g11), (List) b10.getValue(), g11, 576);
            }
            androidx.compose.runtime.v o02 = g11.o0();
            if (o02 != null) {
                o02.G(new h0(e0Var, i11));
                return;
            }
            return;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f58964e = (b1) new androidx.lifecycle.k1(this, new j()).a(b1.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.u.j(inflater, "inflater");
        Context requireContext = requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6, 0);
        composeView.setContent(new s1.a(true, 850684658, new k()));
        return composeView;
    }

    public final void t1(Partner partner, boolean z5, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(partner, "partner");
        androidx.compose.runtime.b g11 = aVar.g(-1923973051);
        if (partner == Partner.f43457o) {
            u1(z5, g11, ((i11 >> 3) & 14) | 64);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d(partner, z5, i11));
        }
    }
}
