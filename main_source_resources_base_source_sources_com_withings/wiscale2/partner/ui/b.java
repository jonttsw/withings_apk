package com.withings.wiscale2.partner.ui;

import com.withings.common.compose.component.b4;
import com.withings.wiscale2.C1987R;
/* compiled from: PartnerIntroFragment.kt */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f58907a = new s1.a(false, -2083657615, a.f58908a);

    /* compiled from: PartnerIntroFragment.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f58908a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                b4.a(ay.b.u(C1987R.string.partner_deactivate, aVar2), null, null, null, aVar2, 0, 14);
            }
            return nm0.y.f85009a;
        }
    }
}
