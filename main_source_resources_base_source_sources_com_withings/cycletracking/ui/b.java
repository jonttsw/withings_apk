package com.withings.cycletracking.ui;

import androidx.compose.material3.a5;
import androidx.compose.material3.ga;
import com.withings.wiscale2.C1987R;
/* compiled from: CycleTrackingHistoryScreen.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f35498a = new s1.a(false, -537943606, a.f35502a);

    /* renamed from: b  reason: collision with root package name */
    public static s1.a f35499b = new s1.a(false, 46190859, C0468b.f35503a);

    /* renamed from: c  reason: collision with root package name */
    public static s1.a f35500c = new s1.a(false, 583991266, c.f35504a);

    /* renamed from: d  reason: collision with root package name */
    public static s1.a f35501d = new s1.a(false, 1826631686, d.f35505a);

    /* compiled from: CycleTrackingHistoryScreen.kt */
    /* loaded from: classes3.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f35502a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                ga.b(ay.b.u(C1987R.string.cycleTracking_history_title, aVar2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2, 0, 0, 131070);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: CycleTrackingHistoryScreen.kt */
    /* renamed from: com.withings.cycletracking.ui.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0468b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0468b f35503a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                a5.b(f1.b.a(), null, null, 0L, aVar2, 48, 12);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: CycleTrackingHistoryScreen.kt */
    /* loaded from: classes3.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.q<s0.b, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f35504a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(s0.b bVar, androidx.compose.runtime.a aVar, Integer num) {
            s0.b item = bVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(item, "$this$item");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                nk.a.g(0, 0, 0, 60, 0L, aVar2, androidx.compose.foundation.layout.x0.h(androidx.compose.foundation.layout.x0.j(androidx.compose.ui.e.f8927a, 0.0f, yk.h.a(), 0.0f, 0.0f, 13), yk.h.o(), 0.0f, 2), null, ay.b.u(C1987R.string.cycleTracking_history_pastCycleSection_emptyState_description, aVar2));
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: CycleTrackingHistoryScreen.kt */
    /* loaded from: classes3.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.q<s0.b, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f35505a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(s0.b bVar, androidx.compose.runtime.a aVar, Integer num) {
            s0.b item = bVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(item, "$this$item");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                r0.d0.a(androidx.compose.foundation.layout.x0.j(androidx.compose.ui.e.f8927a, 0.0f, 0.0f, 0.0f, yk.h.B(), 7), aVar2);
            }
            return nm0.y.f85009a;
        }
    }
}
