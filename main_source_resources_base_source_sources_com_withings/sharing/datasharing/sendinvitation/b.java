package com.withings.sharing.datasharing.sendinvitation;

import androidx.compose.foundation.layout.x0;
import androidx.compose.runtime.a;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v0;
import androidx.lifecycle.g1;
import androidx.lifecycle.n1;
import com.withings.sharing.datasharing.sendinvitation.a;
import com.withings.wiscale2.C1987R;
import i6.a;
import java.util.Collection;
import java.util.List;
import k1.o1;
import k1.r0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: SelectDataScreen.kt */
/* loaded from: classes4.dex */
public final class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectDataScreen.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f44112a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f44113b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ym0.a aVar, boolean z5) {
            super(2);
            this.f44112a = z5;
            this.f44113b = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string._NEXT_, aVar2), null, this.f44112a, null, null, false, this.f44113b, aVar2, 0, 117);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectDataScreen.kt */
    /* renamed from: com.withings.sharing.datasharing.sendinvitation.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0611b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f44114a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0611b(ym0.a<nm0.y> aVar) {
            super(2);
            this.f44114a = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.c(null, ay.b.u(C1987R.string._CANCEL_, aVar2), null, false, null, null, false, this.f44114a, aVar2, 0, 125);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectDataScreen.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<y40.a> f44115a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<y40.a, nm0.y> f44116b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, nm0.y> f44117c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<y40.a> list, ym0.l<? super y40.a, nm0.y> lVar, ym0.l<? super Boolean, nm0.y> lVar2) {
            super(3);
            this.f44115a = list;
            this.f44116b = lVar;
            this.f44117c = lVar2;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h GuidedPresentation = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(GuidedPresentation, "$this$GuidedPresentation");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                androidx.compose.ui.e g11 = x0.g(androidx.compose.ui.e.f8927a, yk.h.o(), yk.h.B());
                y40.h.b(this.f44115a, this.f44116b, this.f44117c, g11, aVar2, 8, 0);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectDataScreen.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<y40.a> f44118a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<y40.a, nm0.y> f44119b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, nm0.y> f44120c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f44121d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f44122e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f44123f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f44124g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(List<y40.a> list, ym0.l<? super y40.a, nm0.y> lVar, ym0.l<? super Boolean, nm0.y> lVar2, boolean z5, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
            super(2);
            this.f44118a = list;
            this.f44119b = lVar;
            this.f44120c = lVar2;
            this.f44121d = z5;
            this.f44122e = aVar;
            this.f44123f = aVar2;
            this.f44124g = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f44124g | 1);
            ym0.a<nm0.y> aVar2 = this.f44122e;
            ym0.a<nm0.y> aVar3 = this.f44123f;
            b.a(this.f44118a, this.f44119b, this.f44120c, this.f44121d, aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectDataScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.sharing.datasharing.sendinvitation.SelectDataScreenKt$SelectDataScreen$1", f = "SelectDataScreen.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SelectDataViewModel f44125a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List<y40.a> f44126b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(SelectDataViewModel selectDataViewModel, List<y40.a> list, qm0.d<? super e> dVar) {
            super(2, dVar);
            this.f44125a = selectDataViewModel;
            this.f44126b = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new e(this.f44125a, this.f44126b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            this.f44125a.i0(new a.c(this.f44126b));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectDataScreen.kt */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.l<y40.a, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SelectDataViewModel f44127a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(SelectDataViewModel selectDataViewModel) {
            super(1);
            this.f44127a = selectDataViewModel;
        }

        @Override // ym0.l
        public final nm0.y invoke(y40.a aVar) {
            y40.a it = aVar;
            kotlin.jvm.internal.u.j(it, "it");
            this.f44127a.i0(new a.b(it));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectDataScreen.kt */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SelectDataViewModel f44128a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(SelectDataViewModel selectDataViewModel) {
            super(1);
            this.f44128a = selectDataViewModel;
        }

        @Override // ym0.l
        public final nm0.y invoke(Boolean bool) {
            this.f44128a.i0(new a.C0610a(bool.booleanValue()));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectDataScreen.kt */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<List<y40.a>, nm0.y> f44129a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1<z40.e> f44130b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(r0 r0Var, ym0.l lVar) {
            super(0);
            this.f44129a = lVar;
            this.f44130b = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f44129a.invoke(this.f44130b.getValue().a());
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectDataScreen.kt */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SelectDataViewModel f44131a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List<y40.a> f44132b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f44133c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<List<y40.a>, nm0.y> f44134d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f44135e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f44136f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(SelectDataViewModel selectDataViewModel, List<y40.a> list, ym0.a<nm0.y> aVar, ym0.l<? super List<y40.a>, nm0.y> lVar, int i11, int i12) {
            super(2);
            this.f44131a = selectDataViewModel;
            this.f44132b = list;
            this.f44133c = aVar;
            this.f44134d = lVar;
            this.f44135e = i11;
            this.f44136f = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f44135e | 1);
            ym0.a<nm0.y> aVar2 = this.f44133c;
            ym0.l<List<y40.a>, nm0.y> lVar = this.f44134d;
            b.b(this.f44131a, this.f44132b, aVar2, lVar, aVar, g11, this.f44136f);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(List<y40.a> list, ym0.l<? super y40.a, nm0.y> lVar, ym0.l<? super Boolean, nm0.y> lVar2, boolean z5, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, androidx.compose.runtime.a aVar3, int i11) {
        androidx.compose.runtime.b g11 = aVar3.g(-2030871108);
        wk.c0.b(null, null, null, aVar, null, z40.a.f109971a, s1.b.b(g11, 410284839, new a(aVar2, z5)), s1.b.b(g11, -263781946, new C0611b(aVar)), 0L, false, null, null, 0.0f, false, s1.b.b(g11, 1761796482, new c(list, lVar, lVar2)), g11, ((i11 >> 3) & 7168) | 14352384, 24576, 16151);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d(list, lVar, lVar2, z5, aVar, aVar2, i11));
        }
    }

    public static final void b(SelectDataViewModel selectDataViewModel, List<y40.a> initialData, ym0.a<nm0.y> back, ym0.l<? super List<y40.a>, nm0.y> next, androidx.compose.runtime.a aVar, int i11, int i12) {
        SelectDataViewModel selectDataViewModel2;
        int i13;
        boolean z5;
        i6.a aVar2;
        kotlin.jvm.internal.u.j(initialData, "initialData");
        kotlin.jvm.internal.u.j(back, "back");
        kotlin.jvm.internal.u.j(next, "next");
        androidx.compose.runtime.b g11 = aVar.g(-1382902022);
        if ((i12 & 1) != 0) {
            g11.s(1890788296);
            n1 a11 = j6.a.a(g11);
            if (a11 != null) {
                fk0.c a12 = e6.a.a(a11, g11);
                g11.s(1729797275);
                if (a11 instanceof androidx.lifecycle.u) {
                    aVar2 = ((androidx.lifecycle.u) a11).getDefaultViewModelCreationExtras();
                } else {
                    aVar2 = a.C1058a.f71431b;
                }
                g1 a13 = j6.b.a(SelectDataViewModel.class, a11, null, a12, aVar2, g11);
                g11.J();
                g11.J();
                selectDataViewModel2 = (SelectDataViewModel) a13;
                i13 = i11 & (-15);
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        } else {
            selectDataViewModel2 = selectDataViewModel;
            i13 = i11;
        }
        r0 b10 = l0.b(selectDataViewModel2.g0(), g11);
        List<y40.a> a14 = ((z40.e) b10.getValue()).a();
        g11.s(957873418);
        boolean K = g11.K(a14);
        Object t11 = g11.t();
        boolean z11 = true;
        if (K || t11 == a.C0060a.a()) {
            List<y40.a> a15 = ((z40.e) b10.getValue()).a();
            if (!(a15 instanceof Collection) || !a15.isEmpty()) {
                for (y40.a aVar3 : a15) {
                    if (aVar3.c()) {
                        z5 = true;
                        break;
                    }
                }
            }
            z5 = false;
            t11 = l0.f(Boolean.valueOf(z5), v0.f8878a);
            g11.n(t11);
        }
        g11.J();
        k1.y.f(initialData, new e(selectDataViewModel2, initialData, null), g11);
        boolean booleanValue = ((Boolean) ((r0) t11).getValue()).booleanValue();
        List<y40.a> a16 = ((z40.e) b10.getValue()).a();
        f fVar = new f(selectDataViewModel2);
        g gVar = new g(selectDataViewModel2);
        g11.s(957873685);
        if ((((i11 & 7168) ^ 3072) <= 2048 || !g11.K(next)) && (i11 & 3072) != 2048) {
            z11 = false;
        }
        boolean K2 = z11 | g11.K(b10);
        Object t12 = g11.t();
        if (K2 || t12 == a.C0060a.a()) {
            t12 = new h(b10, next);
            g11.n(t12);
        }
        g11.J();
        a(a16, fVar, gVar, booleanValue, back, (ym0.a) t12, g11, ((i13 << 6) & 57344) | 8);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new i(selectDataViewModel2, initialData, back, next, i11, i12));
        }
    }
}
