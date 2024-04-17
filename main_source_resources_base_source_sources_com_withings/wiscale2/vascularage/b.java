package com.withings.wiscale2.vascularage;

import com.withings.common.compose.component.Status;
import com.withings.common.compose.component.n4;
import com.withings.common.compose.component.p4;
import com.withings.wiscale2.C1987R;
/* compiled from: VascularAgeScreen.kt */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f62247a = new s1.a(false, 1170803951, a.f62248a);

    /* compiled from: VascularAgeScreen.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.q<p4, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f62248a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(p4 p4Var, androidx.compose.runtime.a aVar, Integer num) {
            p4 listOf = p4Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(listOf, "$this$listOf");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                n4.b(null, ay.b.u(C1987R.string._AVERAGE_, aVar2), null, ay.b.u(C1987R.string.status_standBy, aVar2), Status.Icon.f33334h, false, aVar2, 24576, 37);
            }
            return nm0.y.f85009a;
        }
    }
}
