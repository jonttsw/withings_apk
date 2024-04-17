package com.withings.scalesmodes.ui;

import androidx.compose.foundation.layout.e1;
import androidx.compose.material3.a5;
import androidx.compose.material3.ga;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: ScalesModeComposable.kt */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f43920a = new s1.a(false, -1276518383, C0599a.f43922a);

    /* renamed from: b  reason: collision with root package name */
    public static s1.a f43921b = new s1.a(false, -898871635, b.f43923a);

    /* compiled from: ScalesModeComposable.kt */
    /* renamed from: com.withings.scalesmodes.ui.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0599a extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0599a f43922a = new w(2);

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                a5.b(d1.j.a(), null, e1.d(androidx.compose.ui.e.f8927a), 0L, aVar2, 432, 8);
            }
            return y.f85009a;
        }
    }

    /* compiled from: ScalesModeComposable.kt */
    /* loaded from: classes4.dex */
    static final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f43923a = new w(2);

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                ga.b(ay.b.u(C1987R.string.modes_title, aVar2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2, 0, 0, 131070);
            }
            return y.f85009a;
        }
    }
}
