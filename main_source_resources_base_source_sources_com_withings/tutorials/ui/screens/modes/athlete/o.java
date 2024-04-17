package com.withings.tutorials.ui.screens.modes.athlete;

import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.q;
/* compiled from: AthleteMode.kt */
/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f45606a = new s1.a(false, -886106571, a.f45607a);

    /* compiled from: AthleteMode.kt */
    /* loaded from: classes4.dex */
    static final class a extends w implements q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f45607a = new w(3);

        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h ImageTutorialScreen = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(ImageTutorialScreen, "$this$ImageTutorialScreen");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.tutorials.ui.screens.modes.athlete.a.g(com.withings.tutorials.ui.screens.modes.athlete.a.f45543a, aVar2, 6);
            }
            return y.f85009a;
        }
    }
}
