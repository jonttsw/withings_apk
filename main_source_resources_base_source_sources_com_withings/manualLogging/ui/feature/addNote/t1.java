package com.withings.manualLogging.ui.feature.addNote;

import com.withings.wiscale2.C1987R;
import d2.g0;
/* compiled from: AddManualLogActivity.kt */
/* loaded from: classes4.dex */
public final class t1 {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f41589a = new s1.a(false, -1425138200, a.f41591a);

    /* renamed from: b  reason: collision with root package name */
    public static s1.a f41590b = new s1.a(false, 1937181455, b.f41592a);

    /* compiled from: AddManualLogActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.q<r0.a0, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f41591a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(r0.a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
            r0.a0 LabelValueCell = a0Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(LabelValueCell, "$this$LabelValueCell");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                n0.z.a(s2.d.a(C1987R.drawable.ic_rounded_man3, aVar2), "Click to open patient id input", null, null, null, 0.0f, g0.a.a(5, ((androidx.compose.material3.i1) aVar2.D(androidx.compose.material3.j1.e())).J()), aVar2, 56, 60);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: AddManualLogActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f41592a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(r0.c cVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.c LabelValueCell = cVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(LabelValueCell, "$this$LabelValueCell");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                nk.a0.i(0, 48, 29, 0L, aVar2, null, null, "Patient id");
            }
            return nm0.y.f85009a;
        }
    }
}
