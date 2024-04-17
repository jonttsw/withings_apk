package com.withings.tutorials.ui.screens.explanations;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.tutorials.core.model.ExplanationsType;
import kotlin.NotImplementedError;
/* compiled from: ExplanationNavHost.kt */
/* loaded from: classes4.dex */
public final class n {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExplanationNavHost.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ExplanationsType f45204a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r8.n f45205b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45206c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45207d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f45208e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ExplanationsType explanationsType, r8.n nVar, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
            super(2);
            this.f45204a = explanationsType;
            this.f45205b = nVar;
            this.f45206c = aVar;
            this.f45207d = aVar2;
            this.f45208e = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45208e | 1);
            ym0.a<nm0.y> aVar2 = this.f45206c;
            ym0.a<nm0.y> aVar3 = this.f45207d;
            n.a(this.f45204a, this.f45205b, aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public static final void a(ExplanationsType explanationsType, r8.n navController, ym0.a<nm0.y> onBack, ym0.a<nm0.y> onDone, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(explanationsType, "explanationsType");
        kotlin.jvm.internal.u.j(navController, "navController");
        kotlin.jvm.internal.u.j(onBack, "onBack");
        kotlin.jvm.internal.u.j(onDone, "onDone");
        androidx.compose.runtime.b g11 = aVar.g(656629657);
        switch (explanationsType.ordinal()) {
            case 0:
                g11.s(-1221017498);
                int i12 = i11 >> 3;
                v1.f45269a.a(navController, onBack, onDone, g11, (i12 & 112) | 3080 | (i12 & ConstantsWs.HWFAILURE_ZERO));
                g11.J();
                break;
            case 1:
                g11.s(-1221017405);
                int i13 = i11 >> 3;
                m2.f45195a.a(navController, onBack, onDone, g11, (i13 & 112) | 3080 | (i13 & ConstantsWs.HWFAILURE_ZERO));
                g11.J();
                break;
            case 2:
                g11.s(-1221017283);
                int i14 = i11 >> 3;
                f.f45128a.a(navController, onBack, onDone, g11, (i14 & 112) | 3080 | (i14 & ConstantsWs.HWFAILURE_ZERO));
                g11.J();
                break;
            case 3:
                g11.s(-1221017172);
                int i15 = i11 >> 3;
                i1.f45157a.a(navController, onBack, onDone, g11, (i15 & 112) | 3080 | (i15 & ConstantsWs.HWFAILURE_ZERO));
                g11.J();
                break;
            case 4:
                g11.s(-1221017070);
                int i16 = i11 >> 3;
                n0.f45209a.a(navController, onBack, onDone, g11, (i16 & 112) | 3080 | (i16 & ConstantsWs.HWFAILURE_ZERO));
                g11.J();
                break;
            case 5:
                g11.s(-1221016978);
                g11.J();
                throw new NotImplementedError();
            case 6:
                g11.s(-1221016925);
                g11.J();
                throw new NotImplementedError();
            default:
                g11.s(-1221016913);
                g11.J();
                break;
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new a(explanationsType, navController, onBack, onDone, i11));
        }
    }
}
