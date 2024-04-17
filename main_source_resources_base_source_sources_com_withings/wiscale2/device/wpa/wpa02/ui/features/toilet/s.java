package com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet;

import androidx.lifecycle.h1;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: ToiletEndScreen.kt */
/* loaded from: classes5.dex */
public final class s {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToiletEndScreen.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f55444a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f55445b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55446c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, long j5, ym0.a<nm0.y> aVar) {
            super(0);
            this.f55444a = kVar;
            this.f55445b = j5;
            this.f55446c = aVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            k kVar = this.f55444a;
            kVar.getClass();
            BuildersKt__Builders_commonKt.launch$default(h1.a(kVar), Dispatchers.getIO(), null, new p(kVar, this.f55445b, null), 2, null);
            this.f55446c.invoke();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToiletEndScreen.kt */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f55447a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f55448b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55449c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55450d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f55451e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k kVar, long j5, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
            super(2);
            this.f55447a = kVar;
            this.f55448b = j5;
            this.f55449c = aVar;
            this.f55450d = aVar2;
            this.f55451e = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f55451e | 1);
            ym0.a<nm0.y> aVar2 = this.f55449c;
            ym0.a<nm0.y> aVar3 = this.f55450d;
            s.a(this.f55447a, this.f55448b, aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToiletEndScreen.kt */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55452a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ym0.a<nm0.y> aVar) {
            super(2);
            this.f55452a = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string._NEXT_, aVar2), null, false, null, null, false, this.f55452a, aVar2, 0, 125);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToiletEndScreen.kt */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55453a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55454b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f55455c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
            super(2);
            this.f55453a = aVar;
            this.f55454b = aVar2;
            this.f55455c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f55455c | 1);
            s.b(this.f55453a, this.f55454b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public static final void a(k toiletDeviceViewModel, long j5, ym0.a<nm0.y> onBackClick, ym0.a<nm0.y> onNextButtonClick, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(toiletDeviceViewModel, "toiletDeviceViewModel");
        kotlin.jvm.internal.u.j(onBackClick, "onBackClick");
        kotlin.jvm.internal.u.j(onNextButtonClick, "onNextButtonClick");
        androidx.compose.runtime.b g11 = aVar.g(1952927997);
        b(onBackClick, new a(toiletDeviceViewModel, j5, onNextButtonClick), g11, (i11 >> 6) & 14);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(toiletDeviceViewModel, j5, onBackClick, onNextButtonClick, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, androidx.compose.runtime.a aVar3, int i11) {
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar3.g(-1546393936);
        if ((i11 & 14) == 0) {
            if (g11.w(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(aVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            b70.t0.c(ay.b.u(C1987R.string.wpa02_installToilet_end_title, g11), s2.d.a(2131232934, g11), aVar, s1.b.b(g11, 1646477177, new c(aVar2)), null, 0.0f, null, com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet.d.f55357a, g11, ((i12 << 6) & ConstantsWs.HWFAILURE_ZERO) | 12586048, 112);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d(aVar, aVar2, i11));
        }
    }
}
