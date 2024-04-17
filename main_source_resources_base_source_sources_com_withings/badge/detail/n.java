package com.withings.badge.detail;

import androidx.camera.camera2.internal.p2;
import androidx.compose.foundation.layout.e1;
import androidx.compose.material.t3;
import com.withings.common.compose.component.n1;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import qk.la;
import r0.a0;
import ym0.p;
import ym0.q;
/* compiled from: BadgeDetailScreen.kt */
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f32786a = new s1.a(false, 1580046413, a.f32789a);

    /* renamed from: b  reason: collision with root package name */
    public static s1.a f32787b = new s1.a(false, -810327394, b.f32790a);

    /* renamed from: c  reason: collision with root package name */
    public static s1.a f32788c = new s1.a(false, -1430334379, c.f32791a);

    /* compiled from: BadgeDetailScreen.kt */
    /* loaded from: classes3.dex */
    static final class a extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f32789a = new w(2);

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                t3.b(f1.b.a(), null, null, s2.b.a(C1987R.color.textPrimary, aVar2), aVar2, 48, 4);
            }
            return y.f85009a;
        }
    }

    /* compiled from: BadgeDetailScreen.kt */
    /* loaded from: classes3.dex */
    static final class b extends w implements q<a0, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f32790a = new w(3);

        @Override // ym0.q
        public final y invoke(a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
            a0 LabelCell = a0Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(LabelCell, "$this$LabelCell");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                t3.a(s2.d.a(C1987R.drawable.ic_menu_book2_default, aVar2), null, e1.n(androidx.compose.ui.e.f8927a, yk.h.r()), s2.b.a(C1987R.color.statusInfo, aVar2), aVar2, 56, 0);
            }
            return y.f85009a;
        }
    }

    /* compiled from: BadgeDetailScreen.kt */
    /* loaded from: classes3.dex */
    static final class c extends w implements q<a0, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f32791a = new w(3);

        @Override // ym0.q
        public final y invoke(a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
            a0 LabelCell = a0Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(LabelCell, "$this$LabelCell");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                androidx.compose.ui.e n11 = e1.n(androidx.compose.ui.e.f8927a, yk.h.r());
                la laVar = la.f93021a;
                aVar2.J();
                n1.b(laVar, n11, ((yk.w) p2.b(aVar2, 615317871)).g().d(), 0, aVar2, 0, 8);
            }
            return y.f85009a;
        }
    }
}
