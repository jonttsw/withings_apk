package com.withings.authentication.mfa.main.components;

import androidx.compose.foundation.layout.x0;
import androidx.compose.material3.d1;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import androidx.compose.runtime.a;
import androidx.compose.runtime.v;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.authentication.mfa.PhoneFactor;
import com.withings.common.compose.component.o;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import d2.h1;
import java.util.HashMap;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nk.a0;
import nm0.y;
import ym0.p;
import ym0.q;
/* compiled from: PhoneComponent.kt */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final com.withings.authentication.mfa.main.components.f f31681a = new com.withings.authentication.mfa.main.components.f(C1987R.string.mfa_type_whatsapp, C1987R.string.mfa_type_whatsapp_description, 2131232895);

    /* renamed from: b  reason: collision with root package name */
    private static final com.withings.authentication.mfa.main.components.f f31682b = new com.withings.authentication.mfa.main.components.f(C1987R.string.mfa_type_sms, C1987R.string.mfa_type_sms_description, 2131232674);

    /* renamed from: c  reason: collision with root package name */
    private static final com.withings.authentication.mfa.main.components.f f31683c = new com.withings.authentication.mfa.main.components.f(C1987R.string.mfa_type_phoneCall, C1987R.string.mfa_type_phoneCall_description, 2131232399);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneComponent.kt */
    /* loaded from: classes3.dex */
    public static final class a extends w implements q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31684a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ym0.a<y> aVar) {
            super(3);
            this.f31684a = aVar;
        }

        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h Card = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(Card, "$this$Card");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                androidx.compose.ui.e h11 = x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2);
                aVar2.s(1661765490);
                ym0.a<y> aVar3 = this.f31684a;
                boolean K = aVar2.K(aVar3);
                Object t11 = aVar2.t();
                if (K || t11 == a.C0060a.a()) {
                    t11 = new com.withings.authentication.mfa.main.components.g(aVar3);
                    aVar2.n(t11);
                }
                aVar2.J();
                o.o(androidx.compose.foundation.h.b(h11, false, (ym0.a) t11, 7), null, ay.b.u(C1987R.string.mfa_type_phoneBased, aVar2), ay.b.u(C1987R.string.mfa_type_phoneBased_description, aVar2), null, false, false, true, null, null, null, null, null, aVar2, 12582912, 0, 8050);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneComponent.kt */
    /* loaded from: classes3.dex */
    public static final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31685a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31686b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ym0.a<y> aVar, int i11) {
            super(2);
            this.f31685a = aVar;
            this.f31686b = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f31686b | 1);
            h.a(this.f31685a, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneComponent.kt */
    /* loaded from: classes3.dex */
    public static final class c extends w implements q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.withings.authentication.mfa.main.components.f f31687a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f31688b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31689c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31690d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.withings.authentication.mfa.main.components.f fVar, boolean z5, ym0.a<y> aVar, ym0.a<y> aVar2) {
            super(3);
            this.f31687a = fVar;
            this.f31688b = z5;
            this.f31689c = aVar;
            this.f31690d = aVar2;
        }

        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h Card = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(Card, "$this$Card");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                androidx.compose.ui.e g11 = x0.g(androidx.compose.ui.e.f8927a, yk.h.o(), yk.h.b());
                com.withings.authentication.mfa.main.components.f fVar = this.f31687a;
                String u11 = ay.b.u(fVar.c(), aVar2);
                String u12 = ay.b.u(fVar.a(), aVar2);
                aVar2.s(1600645268);
                ym0.a<y> aVar3 = this.f31689c;
                boolean K = aVar2.K(aVar3);
                ym0.a<y> aVar4 = this.f31690d;
                boolean K2 = K | aVar2.K(aVar4);
                Object t11 = aVar2.t();
                if (K2 || t11 == a.C0060a.a()) {
                    t11 = new i(aVar3, aVar4);
                    aVar2.n(t11);
                }
                aVar2.J();
                s1.a b10 = s1.b.b(aVar2, -1113897747, new j(fVar));
                o.l(g11, this.f31688b, (ym0.l) t11, b10, u11, u12, false, false, false, null, aVar2, 3072, 960);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneComponent.kt */
    /* loaded from: classes3.dex */
    public static final class d extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.withings.authentication.mfa.main.components.f f31691a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f31692b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31693c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31694d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f31695e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.withings.authentication.mfa.main.components.f fVar, boolean z5, ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f31691a = fVar;
            this.f31692b = z5;
            this.f31693c = aVar;
            this.f31694d = aVar2;
            this.f31695e = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f31695e | 1);
            ym0.a<y> aVar2 = this.f31693c;
            ym0.a<y> aVar3 = this.f31694d;
            h.b(this.f31691a, this.f31692b, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneComponent.kt */
    /* loaded from: classes3.dex */
    public static final class e extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<PhoneFactor, y> f31696a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(ym0.l<? super PhoneFactor, y> lVar) {
            super(0);
            this.f31696a = lVar;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f31696a.invoke(PhoneFactor.f31561a);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneComponent.kt */
    /* loaded from: classes3.dex */
    public static final class f extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<PhoneFactor, y> f31697a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(ym0.l<? super PhoneFactor, y> lVar) {
            super(0);
            this.f31697a = lVar;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f31697a.invoke(PhoneFactor.f31562b);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneComponent.kt */
    /* loaded from: classes3.dex */
    public static final class g extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<PhoneFactor, y> f31698a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(ym0.l<? super PhoneFactor, y> lVar) {
            super(0);
            this.f31698a = lVar;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f31698a.invoke(PhoneFactor.f31563c);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneComponent.kt */
    /* renamed from: com.withings.authentication.mfa.main.components.h$h  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0412h extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HashMap<PhoneFactor, String> f31699a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31700b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31701c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<PhoneFactor, y> f31702d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f31703e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0412h(HashMap<PhoneFactor, String> hashMap, ym0.a<y> aVar, ym0.a<y> aVar2, ym0.l<? super PhoneFactor, y> lVar, int i11) {
            super(2);
            this.f31699a = hashMap;
            this.f31700b = aVar;
            this.f31701c = aVar2;
            this.f31702d = lVar;
            this.f31703e = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f31703e | 1);
            ym0.a<y> aVar2 = this.f31701c;
            ym0.l<PhoneFactor, y> lVar = this.f31702d;
            h.c(this.f31699a, this.f31700b, aVar2, lVar, aVar, g11);
            return y.f85009a;
        }
    }

    public static final void a(ym0.a<y> onEnableClick, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        u.j(onEnableClick, "onEnableClick");
        androidx.compose.runtime.b g11 = aVar.g(633346649);
        if ((i11 & 14) == 0) {
            if (g11.w(onEnableClick)) {
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
            a0.f(0, 0, 28, 0L, g11, x0.j(androidx.compose.ui.e.f8927a, 0.0f, 0.0f, 0.0f, yk.h.c(), 7), null, ay.b.u(C1987R.string.mfa_settings_phoneBasedSection_title, g11));
            d1.a(null, null, null, null, null, s1.b.b(g11, 1120219047, new a(onEnableClick)), g11, 196608, 31);
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(onEnableClick, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.withings.authentication.mfa.main.components.f fVar, boolean z5, ym0.a<y> aVar, ym0.a<y> aVar2, androidx.compose.runtime.a aVar3, int i11) {
        int i12;
        androidx.compose.ui.e b10;
        int i13;
        int i14;
        int i15;
        int i16;
        androidx.compose.runtime.b g11 = aVar3.g(-881391501);
        if ((i11 & 14) == 0) {
            if (g11.K(fVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.a(z5)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(aVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 7168) == 0) {
            if (g11.w(aVar2)) {
                i13 = ModuleCopy.f28574b;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) != 1170 || !g11.h()) {
            b10 = androidx.compose.foundation.c.b(androidx.compose.ui.e.f8927a, ((i1) g11.D(j1.e())).a(), h1.a());
            d1.a(b10, null, null, null, null, s1.b.b(g11, -747958463, new c(fVar, z5, aVar, aVar2)), g11, 196608, 30);
        } else {
            g11.C();
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d(fVar, z5, aVar, aVar2, i11));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0217, code lost:
        if (r7 == null) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.util.HashMap<com.withings.authentication.mfa.PhoneFactor, java.lang.String> r28, ym0.a<nm0.y> r29, ym0.a<nm0.y> r30, ym0.l<? super com.withings.authentication.mfa.PhoneFactor, nm0.y> r31, androidx.compose.runtime.a r32, int r33) {
        /*
            Method dump skipped, instructions count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.mfa.main.components.h.c(java.util.HashMap, ym0.a, ym0.a, ym0.l, androidx.compose.runtime.a, int):void");
    }

    public static final boolean e(HashMap<PhoneFactor, String> hashMap) {
        u.j(hashMap, "<this>");
        if (hashMap.get(PhoneFactor.f31561a) == null && hashMap.get(PhoneFactor.f31562b) == null && hashMap.get(PhoneFactor.f31563c) == null) {
            return true;
        }
        return false;
    }
}
