package com.withings.tutorials.ui.screens.modes.eyesclosed;

import androidx.compose.foundation.layout.e1;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import r0.d0;
import ym0.q;
/* compiled from: EyesClosedMode.kt */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f45628a = new s1.a(false, 408973394, C0627a.f45629a);

    /* compiled from: EyesClosedMode.kt */
    /* renamed from: com.withings.tutorials.ui.screens.modes.eyesclosed.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0627a extends w implements q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0627a f45629a = new w(3);

        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h ImageTutorialScreen = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(ImageTutorialScreen, "$this$ImageTutorialScreen");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                nk.a.d(null, ay.b.u(C1987R.string.eyesClosed_mode_page_description, aVar2), 0L, null, 0, 0, null, aVar2, 0, 125);
                d0.a(e1.f(androidx.compose.ui.e.f8927a, yk.h.q()), aVar2);
                nk.a.g(0, 0, 0, 61, 0L, aVar2, null, null, ay.b.u(C1987R.string.eye_close_mode_page_note, aVar2));
            }
            return y.f85009a;
        }
    }
}
