package com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing;

import com.withings.wiscale2.C1987R;
/* compiled from: PourGlassScreen.kt */
/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f55314a = new s1.a(false, -1361420426, a.f55315a);

    /* compiled from: PourGlassScreen.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f55315a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h ImageTutorialScreen = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(ImageTutorialScreen, "$this$ImageTutorialScreen");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                nk.a.d(null, ay.b.u(C1987R.string.wpa_tutorial_cleansingMode_pourGlass_description, aVar2), 0L, null, 0, 0, null, aVar2, 0, 125);
            }
            return nm0.y.f85009a;
        }
    }
}
