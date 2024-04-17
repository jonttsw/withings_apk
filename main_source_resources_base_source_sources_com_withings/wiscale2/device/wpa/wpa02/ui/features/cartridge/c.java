package com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge;

import androidx.compose.foundation.layout.x0;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import com.withings.common.compose.component.y3;
import com.withings.wiscale2.C1987R;
import java.util.List;
/* compiled from: CartridgeMetadataScreen.kt */
/* loaded from: classes5.dex */
public final class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CartridgeMetadataScreen.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f55153a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final /* bridge */ /* synthetic */ nm0.y invoke() {
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CartridgeMetadataScreen.kt */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55154a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ym0.a<nm0.y> aVar) {
            super(2);
            this.f55154a = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string._DONE_, aVar2), null, false, null, null, false, this.f55154a, aVar2, 0, 125);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CartridgeMetadataScreen.kt */
    /* renamed from: com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0729c extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<nm0.j<String, String>> f55155a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f55156b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f55157c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0729c(String str, String str2, List list) {
            super(3);
            this.f55155a = list;
            this.f55156b = str;
            this.f55157c = str2;
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
                float f11 = 0;
                y3.d(null, null, null, 0.0f, f11, ((i1) aVar2.D(j1.e())).a(), s1.b.b(aVar2, 648287996, new com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.d(this.f55156b, this.f55157c)), aVar2, 1597440, 15);
                List<nm0.j<String, String>> list = this.f55155a;
                if (list != null) {
                    nk.a0.b(0, 0, 26, 0L, aVar2, x0.j(androidx.compose.ui.e.f8927a, 0.0f, yk.h.e(), 0.0f, yk.h.a(), 5), null, ay.b.u(C1987R.string.wpa02_cartridgeDesc_tests, aVar2));
                    y3.c(null, null, null, null, f11, ((i1) aVar2.D(j1.e())).a(), s1.b.b(aVar2, -2002441571, new e(list)), aVar2, 1597440, 15);
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CartridgeMetadataScreen.kt */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f55158a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f55159b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<nm0.j<String, String>> f55160c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55161d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f55162e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2, List<nm0.j<String, String>> list, ym0.a<nm0.y> aVar, int i11) {
            super(2);
            this.f55158a = str;
            this.f55159b = str2;
            this.f55160c = list;
            this.f55161d = aVar;
            this.f55162e = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f55162e | 1);
            List<nm0.j<String, String>> list = this.f55160c;
            ym0.a<nm0.y> aVar2 = this.f55161d;
            c.a(this.f55158a, this.f55159b, list, aVar2, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public static final void a(String str, String str2, List<nm0.j<String, String>> list, ym0.a<nm0.y> onDone, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(onDone, "onDone");
        androidx.compose.runtime.b g11 = aVar.g(1856703980);
        long O = ((i1) g11.D(j1.e())).O();
        r0.x xVar = new r0.x(yk.h.o(), yk.h.o(), yk.h.o(), yk.h.s());
        wk.c0.b(null, null, null, a.f55153a, k.f55196a, k.f55197b, s1.b.b(g11, -1539541865, new b(onDone)), null, O, false, xVar, null, 0.0f, false, s1.b.b(g11, 183023666, new C0729c(str, str2, list)), g11, 1797504, 24576, 14979);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d(str, str2, list, onDone, i11));
        }
    }
}
