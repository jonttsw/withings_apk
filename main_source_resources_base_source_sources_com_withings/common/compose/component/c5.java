package com.withings.common.compose.component;

import androidx.compose.material3.ha;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import com.withings.common.compose.component.a3;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import java.util.Locale;
/* compiled from: TopAppBar.kt */
/* loaded from: classes3.dex */
public final class c5 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TopAppBar.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h2.d f33563a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f33564b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f33565c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h2.d dVar, ym0.a<nm0.y> aVar, boolean z5) {
            super(2);
            this.f33563a = dVar;
            this.f33564b = aVar;
            this.f33565c = z5;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                c5.e(this.f33563a, this.f33564b, this.f33565c, aVar2, 0);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TopAppBar.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f33566a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f33567b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f33568c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f33569d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h2.d f33570e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List<a3> f33571f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ List<a3.b> f33572g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f33573h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f33574i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f33575j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f33576k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f33577l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(long j5, long j11, String str, boolean z5, h2.d dVar, List<? extends a3> list, List<a3.b> list2, ym0.a<nm0.y> aVar, boolean z11, ym0.a<nm0.y> aVar2, int i11, int i12) {
            super(2);
            this.f33566a = j5;
            this.f33567b = j11;
            this.f33568c = str;
            this.f33569d = z5;
            this.f33570e = dVar;
            this.f33571f = list;
            this.f33572g = list2;
            this.f33573h = aVar;
            this.f33574i = z11;
            this.f33575j = aVar2;
            this.f33576k = i11;
            this.f33577l = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33576k | 1);
            boolean z5 = this.f33574i;
            ym0.a<nm0.y> aVar2 = this.f33575j;
            c5.a(this.f33566a, this.f33567b, this.f33568c, this.f33569d, this.f33570e, this.f33571f, this.f33572g, this.f33573h, z5, aVar2, aVar, g11, this.f33577l);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TopAppBar.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f33578a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(2);
            this.f33578a = str;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                nk.a0.i(0, 0, 29, 0L, aVar2, null, null, this.f33578a);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TopAppBar.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f33579a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f33580b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f33581c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f33582d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f33583e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List<a3> f33584f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ List<a3.b> f33585g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f33586h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f33587i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f33588j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(long j5, long j11, String str, boolean z5, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar, List<? extends a3> list, List<a3.b> list2, ym0.a<nm0.y> aVar, int i11, int i12) {
            super(2);
            this.f33579a = j5;
            this.f33580b = j11;
            this.f33581c = str;
            this.f33582d = z5;
            this.f33583e = pVar;
            this.f33584f = list;
            this.f33585g = list2;
            this.f33586h = aVar;
            this.f33587i = i11;
            this.f33588j = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33587i | 1);
            List<a3.b> list = this.f33585g;
            ym0.a<nm0.y> aVar2 = this.f33586h;
            c5.b(this.f33579a, this.f33580b, this.f33581c, this.f33582d, this.f33583e, this.f33584f, list, aVar2, aVar, g11, this.f33588j);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TopAppBar.kt */
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h2.d f33589a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f33590b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f33591c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(h2.d dVar, ym0.a<nm0.y> aVar, boolean z5) {
            super(2);
            this.f33589a = dVar;
            this.f33590b = aVar;
            this.f33591c = z5;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                c5.e(this.f33589a, this.f33590b, this.f33591c, aVar2, 0);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TopAppBar.kt */
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f33592a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ha f33593b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f33594c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h2.d f33595d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<a3> f33596e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List<a3.b> f33597f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f33598g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f33599h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f33600i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f33601j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f33602k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(androidx.compose.ui.e eVar, ha haVar, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar, h2.d dVar, List<? extends a3> list, List<a3.b> list2, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, boolean z5, int i11, int i12) {
            super(2);
            this.f33592a = eVar;
            this.f33593b = haVar;
            this.f33594c = pVar;
            this.f33595d = dVar;
            this.f33596e = list;
            this.f33597f = list2;
            this.f33598g = aVar;
            this.f33599h = aVar2;
            this.f33600i = z5;
            this.f33601j = i11;
            this.f33602k = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33601j | 1);
            ym0.a<nm0.y> aVar2 = this.f33599h;
            boolean z5 = this.f33600i;
            c5.c(this.f33592a, this.f33593b, this.f33594c, this.f33595d, this.f33596e, this.f33597f, this.f33598g, aVar2, z5, aVar, g11, this.f33602k);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TopAppBar.kt */
    /* loaded from: classes3.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.q<r0.a0, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<a3> f33603a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List<a3.b> f33604b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f33605c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f33606d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(List<? extends a3> list, List<a3.b> list2, ym0.a<nm0.y> aVar, k1.r0<Boolean> r0Var) {
            super(3);
            this.f33603a = list;
            this.f33604b = list2;
            this.f33605c = aVar;
            this.f33606d = r0Var;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
            List<a3.b> list;
            androidx.compose.ui.text.d0 d0Var;
            r0.a0 TopAppBar = a0Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(TopAppBar, "$this$TopAppBar");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                aVar2.s(740010323);
                for (a3 a3Var : this.f33603a) {
                    if (a3Var instanceof a3.b) {
                        aVar2.s(-1383724017);
                        androidx.compose.ui.e f11 = androidx.compose.foundation.layout.x0.f(androidx.compose.ui.e.f8927a, yk.h.a());
                        d0Var = androidx.compose.ui.text.d0.f10245d;
                        androidx.compose.ui.text.d0 b10 = androidx.compose.ui.text.d0.b(16777214, ((androidx.compose.material3.i1) aVar2.D(androidx.compose.material3.j1.e())).D(), 0L, 0L, 0L, null, d0Var, null, null, null);
                        String upperCase = ay.b.u(((a3.b) a3Var).b(), aVar2).toUpperCase(Locale.ROOT);
                        kotlin.jvm.internal.u.i(upperCase, "toUpperCase(...)");
                        androidx.compose.ui.text.b bVar = new androidx.compose.ui.text.b(upperCase, null, 6);
                        aVar2.s(-1383723754);
                        boolean K = aVar2.K(a3Var);
                        Object t11 = aVar2.t();
                        if (K || t11 == a.C0060a.a()) {
                            t11 = new h5(a3Var);
                            aVar2.n(t11);
                        }
                        aVar2.J();
                        y0.j.a(bVar, f11, b10, false, 0, 0, null, (ym0.l) t11, aVar2, 48, 120);
                        aVar2.J();
                    } else if (a3Var instanceof a3.a) {
                        aVar2.s(-1383723663);
                        androidx.compose.material3.z4.b(a3Var.a(), null, false, null, null, s1.b.b(aVar2, -1203095098, new i5(a3Var)), aVar2, 196608, 30);
                        aVar2.J();
                    } else {
                        aVar2.s(-1383722597);
                        aVar2.J();
                    }
                }
                aVar2.J();
                List<a3.b> list2 = this.f33604b;
                boolean z5 = !list2.isEmpty();
                ym0.a<nm0.y> aVar3 = this.f33605c;
                if (z5 || aVar3 != null) {
                    aVar2.s(740012043);
                    boolean K2 = aVar2.K(aVar3);
                    Object t12 = aVar2.t();
                    k1.r0<Boolean> r0Var = this.f33606d;
                    if (K2 || t12 == a.C0060a.a()) {
                        t12 = new j5(r0Var, aVar3);
                        aVar2.n(t12);
                    }
                    aVar2.J();
                    androidx.compose.material3.z4.b((ym0.a) t12, null, false, null, null, r0.f34631d, aVar2, 196608, 30);
                    if (!list.isEmpty()) {
                        boolean booleanValue = r0Var.getValue().booleanValue();
                        aVar2.s(740012654);
                        Object t13 = aVar2.t();
                        if (t13 == a.C0060a.a()) {
                            t13 = new k5(r0Var);
                            aVar2.n(t13);
                        }
                        aVar2.J();
                        c5.f(list2, booleanValue, (ym0.a) t13, aVar2, ConstantsWs.WS_STATUS_FIRMWARE_NOT_VALIDATED);
                    }
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TopAppBar.kt */
    /* loaded from: classes3.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f33607a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ha f33608b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f33609c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f33610d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<a3> f33611e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List<a3.b> f33612f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f33613g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f33614h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f33615i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(androidx.compose.ui.e eVar, ha haVar, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar2, List<? extends a3> list, List<a3.b> list2, ym0.a<nm0.y> aVar, int i11, int i12) {
            super(2);
            this.f33607a = eVar;
            this.f33608b = haVar;
            this.f33609c = pVar;
            this.f33610d = pVar2;
            this.f33611e = list;
            this.f33612f = list2;
            this.f33613g = aVar;
            this.f33614h = i11;
            this.f33615i = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33614h | 1);
            List<a3.b> list = this.f33612f;
            ym0.a<nm0.y> aVar2 = this.f33613g;
            c5.d(this.f33607a, this.f33608b, this.f33609c, this.f33610d, this.f33611e, list, aVar2, aVar, g11, this.f33615i);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TopAppBar.kt */
    /* loaded from: classes3.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h2.d f33616a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f33617b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(h2.d dVar, boolean z5) {
            super(2);
            this.f33616a = dVar;
            this.f33617b = z5;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                aVar2.s(-816056611);
                androidx.compose.ui.e eVar = androidx.compose.ui.e.f8927a;
                aVar2.s(-816056581);
                if (this.f33617b) {
                    eVar = androidx.compose.foundation.layout.x0.f(androidx.collection.c.g(androidx.compose.foundation.c.b(eVar, ((androidx.compose.material3.i1) aVar2.D(androidx.compose.material3.j1.e())).O(), x0.h.e()), x0.h.e()), 6);
                }
                androidx.compose.ui.e eVar2 = eVar;
                aVar2.J();
                aVar2.J();
                androidx.compose.material3.a5.b(this.f33616a, "Back button", eVar2, ((androidx.compose.material3.i1) aVar2.D(androidx.compose.material3.j1.e())).D(), aVar2, 48, 0);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TopAppBar.kt */
    /* loaded from: classes3.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h2.d f33618a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f33619b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f33620c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f33621d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(h2.d dVar, ym0.a<nm0.y> aVar, boolean z5, int i11) {
            super(2);
            this.f33618a = dVar;
            this.f33619b = aVar;
            this.f33620c = z5;
            this.f33621d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33621d | 1);
            ym0.a<nm0.y> aVar2 = this.f33619b;
            boolean z5 = this.f33620c;
            c5.e(this.f33618a, aVar2, z5, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(long r32, long r34, java.lang.String r36, boolean r37, h2.d r38, java.util.List<? extends com.withings.common.compose.component.a3> r39, java.util.List<com.withings.common.compose.component.a3.b> r40, ym0.a<nm0.y> r41, boolean r42, ym0.a<nm0.y> r43, androidx.compose.runtime.a r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.c5.a(long, long, java.lang.String, boolean, h2.d, java.util.List, java.util.List, ym0.a, boolean, ym0.a, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(long r21, long r23, java.lang.String r25, boolean r26, ym0.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, nm0.y> r27, java.util.List<? extends com.withings.common.compose.component.a3> r28, java.util.List<com.withings.common.compose.component.a3.b> r29, ym0.a<nm0.y> r30, androidx.compose.runtime.a r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.c5.b(long, long, java.lang.String, boolean, ym0.p, java.util.List, java.util.List, ym0.a, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(androidx.compose.ui.e r23, androidx.compose.material3.ha r24, ym0.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, nm0.y> r25, h2.d r26, java.util.List<? extends com.withings.common.compose.component.a3> r27, java.util.List<com.withings.common.compose.component.a3.b> r28, ym0.a<nm0.y> r29, ym0.a<nm0.y> r30, boolean r31, androidx.compose.runtime.a r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.c5.c(androidx.compose.ui.e, androidx.compose.material3.ha, ym0.p, h2.d, java.util.List, java.util.List, ym0.a, ym0.a, boolean, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(androidx.compose.ui.e r21, androidx.compose.material3.ha r22, ym0.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, nm0.y> r23, ym0.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, nm0.y> r24, java.util.List<? extends com.withings.common.compose.component.a3> r25, java.util.List<com.withings.common.compose.component.a3.b> r26, ym0.a<nm0.y> r27, androidx.compose.runtime.a r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.c5.d(androidx.compose.ui.e, androidx.compose.material3.ha, ym0.p, ym0.p, java.util.List, java.util.List, ym0.a, androidx.compose.runtime.a, int, int):void");
    }

    public static final void e(h2.d dVar, ym0.a<nm0.y> onBackClick, boolean z5, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        float f11;
        int i13;
        int i14;
        int i15;
        kotlin.jvm.internal.u.j(onBackClick, "onBackClick");
        androidx.compose.runtime.b g11 = aVar.g(1229764883);
        if ((i11 & 14) == 0) {
            if (g11.K(dVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onBackClick)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.a(z5)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && g11.h()) {
            g11.C();
        } else if (dVar != null) {
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            if (z5) {
                f11 = yk.h.b();
            } else {
                f11 = 0;
            }
            androidx.compose.material3.z4.b(onBackClick, androidx.compose.foundation.layout.x0.f(aVar2, f11), false, null, null, s1.b.b(g11, 613560201, new i(dVar, z5)), g11, ((i12 >> 3) & 14) | 196608, 28);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new j(dVar, onBackClick, z5, i11));
        }
    }

    public static final void f(List list, boolean z5, ym0.a aVar, androidx.compose.runtime.a aVar2, int i11) {
        androidx.compose.runtime.b g11 = aVar2.g(816856235);
        int i12 = i11 >> 3;
        androidx.compose.material3.a0.a(z5, aVar, null, 0L, null, null, s1.b.b(g11, 153798616, new f5(list, aVar)), g11, (i12 & 14) | 1572864 | (i12 & 112), 60);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new g5(list, z5, aVar, i11));
        }
    }
}
