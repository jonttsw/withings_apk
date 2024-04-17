package com.withings.badge.list;

import androidx.compose.material3.ga;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: BadgesScreen.kt */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f32843a = new s1.a(false, 686300476, a.f32844a);

    /* compiled from: BadgesScreen.kt */
    /* loaded from: classes3.dex */
    static final class a extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f32844a = new w(2);

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                ga.b(ay.b.u(C1987R.string._PROFILE_BADGES_, aVar2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2, 0, 0, 131070);
            }
            return y.f85009a;
        }
    }
}
