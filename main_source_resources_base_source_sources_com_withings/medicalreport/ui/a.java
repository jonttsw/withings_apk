package com.withings.medicalreport.ui;

import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.t3;
import androidx.compose.ui.e;
import com.withings.wiscale2.C1987R;
/* compiled from: DateSelectionFragment.kt */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f42228a = new s1.a(false, 1690540403, C0561a.f42231a);

    /* renamed from: b  reason: collision with root package name */
    public static s1.a f42229b = new s1.a(false, -257673752, b.f42232a);

    /* renamed from: c  reason: collision with root package name */
    public static s1.a f42230c = new s1.a(false, 960701137, c.f42233a);

    /* compiled from: DateSelectionFragment.kt */
    /* renamed from: com.withings.medicalreport.ui.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0561a extends kotlin.jvm.internal.w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0561a f42231a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
            l0.i AnimatedVisibility = iVar;
            androidx.compose.runtime.a aVar2 = aVar;
            num.intValue();
            kotlin.jvm.internal.u.j(AnimatedVisibility, "$this$AnimatedVisibility");
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            r0.d0.a(e1.f(aVar3, yk.h.q()), aVar2);
            nk.a.g(0, 0, 0, 60, 0L, aVar2, x0.g(e1.e(aVar3, 1.0f), yk.h.o(), yk.h.B()), null, ay.b.u(C1987R.string.profile_medicalReport_timeFrame_warning_only_30_days, aVar2));
            return nm0.y.f85009a;
        }
    }

    /* compiled from: DateSelectionFragment.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f42232a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(r0.c cVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.c LabelCell = cVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(LabelCell, "$this$LabelCell");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                t3.b(f1.e.a(), null, null, 0L, aVar2, 48, 12);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: DateSelectionFragment.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f42233a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(r0.c cVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.c LabelCell = cVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(LabelCell, "$this$LabelCell");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                t3.b(f1.e.a(), null, null, 0L, aVar2, 48, 12);
            }
            return nm0.y.f85009a;
        }
    }
}
