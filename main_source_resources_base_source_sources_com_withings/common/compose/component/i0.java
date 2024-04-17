package com.withings.common.compose.component;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
/* compiled from: Cells.kt */
/* loaded from: classes3.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f33855a = new s1.a(false, 445276668, a.f33856a);

    /* compiled from: Cells.kt */
    /* loaded from: classes3.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f33856a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(r0.c cVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.c CellsLayout = cVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(CellsLayout, "$this$CellsLayout");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                nk.a.a(u5.c(androidx.compose.ui.e.f8927a, true), ay.b.u(C1987R.string._LOADING_, aVar2), 0, 0L, 0, 0, null, null, aVar2, 0, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
            }
            return nm0.y.f85009a;
        }
    }
}
