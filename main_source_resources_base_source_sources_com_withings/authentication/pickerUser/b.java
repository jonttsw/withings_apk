package com.withings.authentication.pickerUser;

import a1.x;
import ah.o;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.f5;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import androidx.compose.runtime.a;
import androidx.compose.runtime.v;
import androidx.compose.runtime.v0;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.g1;
import androidx.compose.ui.layout.k0;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.layout.m0;
import androidx.compose.ui.layout.n0;
import androidx.compose.ui.platform.n1;
import androidx.constraintlayout.compose.c0;
import androidx.constraintlayout.compose.f0;
import androidx.constraintlayout.compose.j;
import androidx.constraintlayout.compose.m;
import com.withings.authentication.pickerUser.PickUserViewModel;
import com.withings.common.compose.component.w2;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import en0.r;
import java.util.List;
import java.util.Map;
import k1.o1;
import k1.r0;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import nk.a0;
import nm0.y;
import t2.b0;
import ym0.p;
import ym0.q;
/* compiled from: PickerUser.kt */
/* loaded from: classes3.dex */
public final class b {

    /* compiled from: ConstraintLayout.kt */
    /* loaded from: classes3.dex */
    public static final class a implements l0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0 f32280a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c0 f32281b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f32282c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r0 f32283d;

        /* compiled from: ConstraintLayout.kt */
        /* renamed from: com.withings.authentication.pickerUser.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0432a extends w implements ym0.l<g1.a, y> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c0 f32284a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f32285b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0432a(c0 c0Var, List list) {
                super(1);
                this.f32284a = c0Var;
                this.f32285b = list;
            }

            @Override // ym0.l
            public final y invoke(g1.a aVar) {
                this.f32284a.m(aVar, this.f32285b);
                return y.f85009a;
            }
        }

        public a(r0 r0Var, c0 c0Var, m mVar, r0 r0Var2) {
            this.f32280a = r0Var;
            this.f32281b = c0Var;
            this.f32282c = mVar;
            this.f32283d = r0Var2;
        }

        @Override // androidx.compose.ui.layout.l0
        public final m0 d(n0 n0Var, List<? extends k0> list, long j5) {
            Map<androidx.compose.ui.layout.a, Integer> map;
            this.f32280a.getValue();
            long n11 = this.f32281b.n(j5, n0Var.getLayoutDirection(), this.f32282c, list);
            this.f32283d.getValue();
            C0432a c0432a = new C0432a(this.f32281b, list);
            map = j0.f76190a;
            return n0Var.g1((int) (n11 >> 32), (int) (n11 & 4294967295L), map, c0432a);
        }
    }

    /* compiled from: ConstraintLayout.kt */
    /* renamed from: com.withings.authentication.pickerUser.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0433b extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0 f32286a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f32287b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0433b(r0 r0Var, m mVar) {
            super(0);
            this.f32286a = r0Var;
            this.f32287b = mVar;
        }

        @Override // ym0.a
        public final y invoke() {
            r0 r0Var = this.f32286a;
            r0Var.setValue(Boolean.valueOf(!((Boolean) r0Var.getValue()).booleanValue()));
            this.f32287b.k();
            return y.f85009a;
        }
    }

    /* compiled from: ConstraintLayout.kt */
    /* loaded from: classes3.dex */
    public static final class c extends w implements ym0.l<b0, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c0 f32288a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(c0 c0Var) {
            super(1);
            this.f32288a = c0Var;
        }

        @Override // ym0.l
        public final y invoke(b0 b0Var) {
            f0.a(b0Var, this.f32288a);
            return y.f85009a;
        }
    }

    /* compiled from: ConstraintLayout.kt */
    /* loaded from: classes3.dex */
    public static final class d extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0 f32289a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.j f32290b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a f32291c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f32292d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PickUserViewModel f32293e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(r0 r0Var, androidx.constraintlayout.compose.j jVar, C0433b c0433b, boolean z5, PickUserViewModel pickUserViewModel) {
            super(2);
            this.f32289a = r0Var;
            this.f32290b = jVar;
            this.f32291c = c0433b;
            this.f32292d = z5;
            this.f32293e = pickUserViewModel;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.constraintlayout.compose.d dVar;
            androidx.constraintlayout.compose.d dVar2;
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                this.f32289a.setValue(y.f85009a);
                androidx.constraintlayout.compose.j jVar = this.f32290b;
                int e11 = jVar.e();
                jVar.f();
                aVar2.s(1392494389);
                j.b i11 = jVar.i();
                androidx.constraintlayout.compose.d a11 = i11.a();
                androidx.constraintlayout.compose.d b10 = i11.b();
                androidx.constraintlayout.compose.d c11 = i11.c();
                androidx.constraintlayout.compose.d d11 = i11.d();
                aVar2.s(1392494461);
                if (!this.f32292d) {
                    PickUserViewModel pickUserViewModel = this.f32293e;
                    String b11 = x.b((int) (r.f(((Integer) t1.d.b(pickUserViewModel.z0(), 0, aVar2).getValue()).intValue() / ((Integer) t1.d.b(pickUserViewModel.y0(), 100, aVar2).getValue()).intValue(), 1.0f) * 100), "%");
                    e.a aVar3 = androidx.compose.ui.e.f8927a;
                    aVar2.s(1392494870);
                    boolean K = aVar2.K(c11);
                    Object t11 = aVar2.t();
                    if (K || t11 == a.C0060a.a()) {
                        t11 = new f(c11);
                        aVar2.n(t11);
                    }
                    aVar2.J();
                    dVar = c11;
                    dVar2 = b10;
                    nk.a.g(0, 0, 0, 60, 0L, aVar2, androidx.constraintlayout.compose.j.g(aVar3, d11, (ym0.l) t11), null, b11);
                } else {
                    dVar = c11;
                    dVar2 = b10;
                }
                aVar2.J();
                String u11 = ay.b.u(C1987R.string._THANK_YOU_FOR_JOINING_WITHINGS_HEALTH_MATE_, aVar2);
                e.a aVar4 = androidx.compose.ui.e.f8927a;
                a0.e(0, 0, 24, 0L, aVar2, androidx.constraintlayout.compose.j.g(x0.h(aVar4, yk.h.o(), 0.0f, 2), a11, g.f32302a), d3.g.a(3), u11);
                String u12 = ay.b.u(C1987R.string._YOUR_APP_WILL_BE_READY_IN_A_MINUTE_, aVar2);
                aVar2.s(1392495617);
                boolean K2 = aVar2.K(a11);
                Object t12 = aVar2.t();
                if (K2 || t12 == a.C0060a.a()) {
                    t12 = new h(a11);
                    aVar2.n(t12);
                }
                aVar2.J();
                nk.a.d(androidx.constraintlayout.compose.j.g(aVar4, dVar2, (ym0.l) t12), u12, 0L, d3.g.a(3), 0, 0, null, aVar2, 0, 116);
                f5.b(0.0f, 0, 0, 28, ((i1) aVar2.D(j1.e())).J(), 0L, aVar2, androidx.constraintlayout.compose.j.g(aVar4, dVar, i.f32304a));
                aVar2.J();
                if (jVar.e() != e11) {
                    int i12 = k1.y.f75241b;
                    aVar2.B(this.f32291c);
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PickerUser.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.pickerUser.PickerUserKt$LoginProgress$1", f = "PickerUser.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32294a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PickUserViewModel f32295b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32296c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32297d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32298e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32299f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ o1<PickUserViewModel.a> f32300g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(ym0.a<y> aVar, PickUserViewModel pickUserViewModel, ym0.a<y> aVar2, ym0.a<y> aVar3, ym0.a<y> aVar4, ym0.a<y> aVar5, o1<? extends PickUserViewModel.a> o1Var, qm0.d<? super e> dVar) {
            super(2, dVar);
            this.f32294a = aVar;
            this.f32295b = pickUserViewModel;
            this.f32296c = aVar2;
            this.f32297d = aVar3;
            this.f32298e = aVar4;
            this.f32299f = aVar5;
            this.f32300g = o1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new e(this.f32294a, this.f32295b, this.f32296c, this.f32297d, this.f32298e, this.f32299f, this.f32300g, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            PickUserViewModel.a value = this.f32300g.getValue();
            boolean z5 = value instanceof PickUserViewModel.a.f;
            PickUserViewModel pickUserViewModel = this.f32295b;
            if (z5) {
                this.f32294a.invoke();
                pickUserViewModel.t0().setValue(PickUserViewModel.a.C0431a.f32266a);
            } else if (value instanceof PickUserViewModel.a.b) {
                this.f32296c.invoke();
                pickUserViewModel.t0().setValue(PickUserViewModel.a.C0431a.f32266a);
            } else if (value instanceof PickUserViewModel.a.c) {
                this.f32297d.invoke();
                pickUserViewModel.t0().setValue(PickUserViewModel.a.C0431a.f32266a);
            } else if (value instanceof PickUserViewModel.a.d) {
                this.f32298e.invoke();
                pickUserViewModel.t0().setValue(PickUserViewModel.a.C0431a.f32266a);
            } else if (value instanceof PickUserViewModel.a.e) {
                this.f32299f.invoke();
                pickUserViewModel.t0().setValue(PickUserViewModel.a.C0431a.f32266a);
            }
            return y.f85009a;
        }
    }

    /* compiled from: PickerUser.kt */
    /* loaded from: classes3.dex */
    static final class f extends w implements ym0.l<androidx.constraintlayout.compose.c, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.d f32301a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(androidx.constraintlayout.compose.d dVar) {
            super(1);
            this.f32301a = dVar;
        }

        @Override // ym0.l
        public final y invoke(androidx.constraintlayout.compose.c cVar) {
            androidx.constraintlayout.compose.c constrainAs = cVar;
            u.j(constrainAs, "$this$constrainAs");
            androidx.constraintlayout.compose.c.j(constrainAs, constrainAs.f().d(), constrainAs.f().c(), 0.0f, 124);
            androidx.constraintlayout.compose.x.a(constrainAs.h(), this.f32301a.b(), yk.h.c(), 4);
            return y.f85009a;
        }
    }

    /* compiled from: PickerUser.kt */
    /* loaded from: classes3.dex */
    static final class g extends w implements ym0.l<androidx.constraintlayout.compose.c, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f32302a = new w(1);

        @Override // ym0.l
        public final y invoke(androidx.constraintlayout.compose.c cVar) {
            androidx.constraintlayout.compose.c constrainAs = cVar;
            u.j(constrainAs, "$this$constrainAs");
            androidx.constraintlayout.compose.c.i(constrainAs, constrainAs.f().e(), constrainAs.f().b(), 0.0f, 0.2f, 60);
            androidx.constraintlayout.compose.c.j(constrainAs, constrainAs.f().d(), constrainAs.f().c(), 0.0f, 124);
            return y.f85009a;
        }
    }

    /* compiled from: PickerUser.kt */
    /* loaded from: classes3.dex */
    static final class h extends w implements ym0.l<androidx.constraintlayout.compose.c, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.d f32303a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(androidx.constraintlayout.compose.d dVar) {
            super(1);
            this.f32303a = dVar;
        }

        @Override // ym0.l
        public final y invoke(androidx.constraintlayout.compose.c cVar) {
            androidx.constraintlayout.compose.c constrainAs = cVar;
            u.j(constrainAs, "$this$constrainAs");
            androidx.constraintlayout.compose.x.a(constrainAs.h(), this.f32303a.b(), yk.h.d(), 4);
            androidx.constraintlayout.compose.c.j(constrainAs, constrainAs.f().d(), constrainAs.f().c(), 0.0f, 124);
            return y.f85009a;
        }
    }

    /* compiled from: PickerUser.kt */
    /* loaded from: classes3.dex */
    static final class i extends w implements ym0.l<androidx.constraintlayout.compose.c, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f32304a = new w(1);

        @Override // ym0.l
        public final y invoke(androidx.constraintlayout.compose.c cVar) {
            androidx.constraintlayout.compose.c constrainAs = cVar;
            u.j(constrainAs, "$this$constrainAs");
            androidx.constraintlayout.compose.c.i(constrainAs, constrainAs.f().e(), constrainAs.f().b(), 0.0f, 0.0f, 124);
            androidx.constraintlayout.compose.c.j(constrainAs, constrainAs.f().d(), constrainAs.f().c(), 0.0f, 124);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PickerUser.kt */
    /* loaded from: classes3.dex */
    public static final class j extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PickUserViewModel f32305a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f32306b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32307c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32308d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32309e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32310f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32311g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f32312h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(PickUserViewModel pickUserViewModel, boolean z5, ym0.a<y> aVar, ym0.a<y> aVar2, ym0.a<y> aVar3, ym0.a<y> aVar4, ym0.a<y> aVar5, int i11) {
            super(2);
            this.f32305a = pickUserViewModel;
            this.f32306b = z5;
            this.f32307c = aVar;
            this.f32308d = aVar2;
            this.f32309e = aVar3;
            this.f32310f = aVar4;
            this.f32311g = aVar5;
            this.f32312h = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f32312h | 1);
            ym0.a<y> aVar2 = this.f32310f;
            ym0.a<y> aVar3 = this.f32311g;
            b.a(this.f32305a, this.f32306b, this.f32307c, this.f32308d, this.f32309e, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PickerUser.kt */
    /* loaded from: classes3.dex */
    public static final class k extends w implements q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o1<List<User>> f32313a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<User, y> f32314b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(r0 r0Var, ym0.l lVar) {
            super(3);
            this.f32313a = r0Var;
            this.f32314b = lVar;
        }

        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            boolean z5;
            r0.h GuidedPresentation = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(GuidedPresentation, "$this$GuidedPresentation");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                o1<List<User>> o1Var = this.f32313a;
                int i11 = 0;
                for (Object obj : o1Var.getValue()) {
                    int i12 = i11 + 1;
                    if (i11 >= 0) {
                        User user = (User) obj;
                        if (i11 == kotlin.collections.x.M(o1Var.getValue())) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        aVar2.s(673690532);
                        ym0.l<User, y> lVar = this.f32314b;
                        boolean K = aVar2.K(lVar);
                        Object t11 = aVar2.t();
                        if (K || t11 == a.C0060a.a()) {
                            t11 = new com.withings.authentication.pickerUser.c(lVar);
                            aVar2.n(t11);
                        }
                        aVar2.J();
                        b.c(user, z5, (ym0.l) t11, aVar2, 8);
                        i11 = i12;
                    } else {
                        kotlin.collections.x.K0();
                        throw null;
                    }
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PickerUser.kt */
    /* loaded from: classes3.dex */
    public static final class l extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PickUserViewModel f32315a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32316b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<User, y> f32317c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f32318d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(PickUserViewModel pickUserViewModel, ym0.a<y> aVar, ym0.l<? super User, y> lVar, int i11) {
            super(2);
            this.f32315a = pickUserViewModel;
            this.f32316b = aVar;
            this.f32317c = lVar;
            this.f32318d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f32318d | 1);
            ym0.a<y> aVar2 = this.f32316b;
            ym0.l<User, y> lVar = this.f32317c;
            b.b(this.f32315a, aVar2, lVar, aVar, g11);
            return y.f85009a;
        }
    }

    public static final void a(PickUserViewModel pickUserViewModel, boolean z5, ym0.a<y> onNoneUser, ym0.a<y> onNeedSelectUser, ym0.a<y> onAccountDeactivated, ym0.a<y> onSuccess, ym0.a<y> onFail, androidx.compose.runtime.a aVar, int i11) {
        u.j(pickUserViewModel, "pickUserViewModel");
        u.j(onNoneUser, "onNoneUser");
        u.j(onNeedSelectUser, "onNeedSelectUser");
        u.j(onAccountDeactivated, "onAccountDeactivated");
        u.j(onSuccess, "onSuccess");
        u.j(onFail, "onFail");
        androidx.compose.runtime.b g11 = aVar.g(1861600516);
        w2.a(g11, 0);
        r0 a11 = t1.d.a(pickUserViewModel.t0(), g11);
        k1.y.f((PickUserViewModel.a) a11.getValue(), new e(onSuccess, pickUserViewModel, onFail, onNeedSelectUser, onNoneUser, onAccountDeactivated, a11, null), g11);
        androidx.compose.ui.e g12 = x0.g(e1.d(androidx.compose.ui.e.f8927a), yk.h.o(), yk.h.B());
        g11.s(-2033384074);
        m0.k.d(0, 0, null, 7);
        g11.s(-270254335);
        g11.J();
        k3.d dVar = (k3.d) g11.D(n1.e());
        g11.s(-492369756);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = new c0(dVar);
            g11.n(t11);
        }
        g11.J();
        c0 c0Var = (c0) t11;
        g11.s(-492369756);
        Object t12 = g11.t();
        if (t12 == a.C0060a.a()) {
            t12 = new androidx.constraintlayout.compose.j();
            g11.n(t12);
        }
        g11.J();
        androidx.constraintlayout.compose.j jVar = (androidx.constraintlayout.compose.j) t12;
        g11.s(-492369756);
        Object t13 = g11.t();
        if (t13 == a.C0060a.a()) {
            t13 = androidx.compose.runtime.l0.f(Boolean.FALSE, v0.f8878a);
            g11.n(t13);
        }
        g11.J();
        r0 r0Var = (r0) t13;
        g11.s(-492369756);
        Object t14 = g11.t();
        if (t14 == a.C0060a.a()) {
            t14 = new m(jVar);
            g11.n(t14);
        }
        g11.J();
        m mVar = (m) t14;
        g11.s(-492369756);
        Object t15 = g11.t();
        if (t15 == a.C0060a.a()) {
            t15 = androidx.compose.runtime.l0.f(y.f85009a, androidx.compose.runtime.l0.h());
            g11.n(t15);
        }
        g11.J();
        r0 r0Var2 = (r0) t15;
        androidx.compose.ui.layout.y.a(t2.o.c(g12, false, new c(c0Var)), s1.b.b(g11, -1908965773, new d(r0Var2, jVar, new C0433b(r0Var, mVar), z5, pickUserViewModel)), new a(r0Var2, c0Var, mVar, r0Var), g11, 48, 0);
        g11.J();
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new j(pickUserViewModel, z5, onNoneUser, onNeedSelectUser, onAccountDeactivated, onSuccess, onFail, i11));
        }
    }

    public static final void b(PickUserViewModel pickUserViewModel, ym0.a<y> onBackClicked, ym0.l<? super User, y> onUserSelected, androidx.compose.runtime.a aVar, int i11) {
        u.j(pickUserViewModel, "pickUserViewModel");
        u.j(onBackClicked, "onBackClicked");
        u.j(onUserSelected, "onUserSelected");
        androidx.compose.runtime.b g11 = aVar.g(-1687243215);
        r0 b10 = t1.d.b(pickUserViewModel.A0(), i0.f76187a, g11);
        s1.a aVar2 = qh.a.f92636a;
        float o11 = yk.h.o();
        float B = yk.h.B();
        wk.c0.b(null, null, null, onBackClicked, null, aVar2, null, null, 0L, false, new r0.x(o11, B, o11, B), null, 0.0f, false, s1.b.b(g11, -1315721941, new k(b10, onUserSelected)), g11, ((i11 << 6) & 7168) | 196608, 24576, 15319);
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new l(pickUserViewModel, onBackClicked, onUserSelected, i11));
        }
    }

    public static final void c(User user, boolean z5, ym0.l lVar, androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(214038515);
        s1.a b10 = s1.b.b(g11, 1743259185, new com.withings.authentication.pickerUser.d(user));
        String l5 = user.l();
        u.i(l5, "getFirstName(...)");
        com.withings.common.compose.component.o.g(null, b10, null, l5, null, false, !z5, false, null, null, new com.withings.authentication.pickerUser.e(lVar, user), g11, 48, 0, 949);
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new com.withings.authentication.pickerUser.f(user, z5, lVar, i11));
        }
    }
}
