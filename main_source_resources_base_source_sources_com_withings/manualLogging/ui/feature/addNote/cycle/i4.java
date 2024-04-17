package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
/* compiled from: CycleTutorialIntroductionScreen.kt */
/* loaded from: classes4.dex */
public final class i4 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTutorialIntroductionScreen.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f41047a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ym0.a<nm0.y> aVar) {
            super(2);
            this.f41047a = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string.cycle_tutorial_discoverFeature_begin, aVar2), null, false, null, null, false, this.f41047a, aVar2, 0, 125);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTutorialIntroductionScreen.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f41048a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ym0.a<nm0.y> aVar) {
            super(2);
            this.f41048a = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.c(null, ay.b.u(C1987R.string.cycle_tutorial_discoverFeature_notInterested_button, aVar2), null, false, null, null, false, this.f41048a, aVar2, 0, 125);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTutorialIntroductionScreen.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f41049a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f41050b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f41051c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f41052d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, int i11) {
            super(2);
            this.f41049a = aVar;
            this.f41050b = aVar2;
            this.f41051c = aVar3;
            this.f41052d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f41052d | 1);
            ym0.a<nm0.y> aVar2 = this.f41050b;
            ym0.a<nm0.y> aVar3 = this.f41051c;
            i4.a(this.f41049a, aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public static final void a(ym0.a<nm0.y> onBackClicked, ym0.a<nm0.y> onNextClicked, ym0.a<nm0.y> onNotInterestedClicked, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        androidx.compose.runtime.b bVar;
        int i13;
        int i14;
        int i15;
        kotlin.jvm.internal.u.j(onBackClicked, "onBackClicked");
        kotlin.jvm.internal.u.j(onNextClicked, "onNextClicked");
        kotlin.jvm.internal.u.j(onNotInterestedClicked, "onNotInterestedClicked");
        androidx.compose.runtime.b g11 = aVar.g(402063104);
        if ((i11 & 14) == 0) {
            if (g11.w(onBackClicked)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onNextClicked)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(onNotInterestedClicked)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && g11.h()) {
            g11.C();
            bVar = g11;
        } else {
            long O = ((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).O();
            r0.x xVar = new r0.x(yk.h.o(), yk.h.o(), yk.h.o(), yk.h.s());
            int i16 = androidx.compose.foundation.layout.e.f4229i;
            bVar = g11;
            wk.c0.b(null, null, null, onBackClicked, d.f40961a, d.f40962b, s1.b.b(g11, 2054720171, new a(onNextClicked)), s1.b.b(g11, -1996710262, new b(onNotInterestedClicked)), O, false, xVar, androidx.compose.foundation.layout.e.o(yk.h.B()), 0.0f, true, d.f40965e, bVar, ((i12 << 9) & 7168) | 14376960, 27648, 4615);
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new c(onBackClicked, onNextClicked, onNotInterestedClicked, i11));
        }
    }
}
