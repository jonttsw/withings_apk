package com.withings.tutorials.ui.screens.tab;

import androidx.compose.runtime.v;
import b70.t0;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import okhttp3.internal.http2.Http2;
import ym0.q;
/* compiled from: TabTutorialContentScreen.kt */
/* loaded from: classes4.dex */
public final class o {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TabTutorialContentScreen.kt */
    /* loaded from: classes4.dex */
    public static final class a extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f46287a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f46288b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ym0.a aVar, int i11) {
            super(2);
            this.f46287a = i11;
            this.f46288b = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.a(null, ay.b.u(this.f46287a, aVar2), null, false, null, null, false, this.f46288b, aVar2, 0, 125);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TabTutorialContentScreen.kt */
    /* loaded from: classes4.dex */
    public static final class b extends w implements q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f46289a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11) {
            super(3);
            this.f46289a = i11;
        }

        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h ImageTutorialScreen = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(ImageTutorialScreen, "$this$ImageTutorialScreen");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                nk.a.d(null, ay.b.u(this.f46289a, aVar2), 0L, null, 0, 0, null, aVar2, 0, 125);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TabTutorialContentScreen.kt */
    /* loaded from: classes4.dex */
    public static final class c extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f46290a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f46291b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f46292c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f46293d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f46294e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, y> f46295f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f46296g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(int i11, int i12, int i13, ym0.a<y> aVar, ym0.a<y> aVar2, ym0.p<? super androidx.compose.runtime.a, ? super Integer, y> pVar, int i14) {
            super(2);
            this.f46290a = i11;
            this.f46291b = i12;
            this.f46292c = i13;
            this.f46293d = aVar;
            this.f46294e = aVar2;
            this.f46295f = pVar;
            this.f46296g = i14;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f46296g | 1);
            ym0.a<y> aVar2 = this.f46294e;
            ym0.p<androidx.compose.runtime.a, Integer, y> pVar = this.f46295f;
            o.a(this.f46290a, this.f46291b, this.f46292c, this.f46293d, aVar2, pVar, aVar, g11);
            return y.f85009a;
        }
    }

    public static final void a(int i11, int i12, int i13, ym0.a<y> onBackClicked, ym0.a<y> onClick, ym0.p<? super androidx.compose.runtime.a, ? super Integer, y> title, androidx.compose.runtime.a aVar, int i14) {
        int i15;
        androidx.compose.runtime.b bVar;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        u.j(onBackClicked, "onBackClicked");
        u.j(onClick, "onClick");
        u.j(title, "title");
        androidx.compose.runtime.b g11 = aVar.g(1022138935);
        if ((i14 & 14) == 0) {
            if (g11.c(i11)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i15 = i22 | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 112) == 0) {
            if (g11.c(i12)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i15 |= i21;
        }
        if ((i14 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.c(i13)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i15 |= i19;
        }
        if ((i14 & 7168) == 0) {
            if (g11.w(onBackClicked)) {
                i18 = ModuleCopy.f28574b;
            } else {
                i18 = 1024;
            }
            i15 |= i18;
        }
        if ((57344 & i14) == 0) {
            if (g11.w(onClick)) {
                i17 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i15 |= i17;
        }
        if ((458752 & i14) == 0) {
            if (g11.w(title)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i15 |= i16;
        }
        if ((374491 & i15) == 74898 && g11.h()) {
            g11.C();
            bVar = g11;
        } else {
            bVar = g11;
            t0.d(title, s2.d.a(i11, g11), onBackClicked, s1.b.b(g11, 873075598, new a(onClick, i13)), null, 0.0f, null, s1.b.b(g11, 852287610, new b(i12)), g11, ((i15 >> 15) & 14) | 12586048 | ((i15 >> 3) & ConstantsWs.HWFAILURE_ZERO), 112);
        }
        v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new c(i11, i12, i13, onBackClicked, onClick, title, i14));
        }
    }
}
