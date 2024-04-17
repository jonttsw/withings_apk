package com.withings.tutorials.ui.screens.tab;

import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.ui.e;
import com.withings.common.compose.component.v4;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.w;
import n0.z;
import nm0.y;
import r0.d0;
/* compiled from: AchieveTabTutorial.kt */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f46259a = new s1.a(false, 1237460694, a.f46263a);

    /* renamed from: b  reason: collision with root package name */
    public static s1.a f46260b = new s1.a(false, -1672982971, b.f46264a);

    /* renamed from: c  reason: collision with root package name */
    public static s1.a f46261c = new s1.a(false, -105883543, c.f46265a);

    /* renamed from: d  reason: collision with root package name */
    public static s1.a f46262d = new s1.a(false, 194728733, C0636d.f46266a);

    /* compiled from: AchieveTabTutorial.kt */
    /* loaded from: classes4.dex */
    static final class a extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f46263a = new w(2);

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                d0.a(e1.n(androidx.compose.ui.e.f8927a, yk.h.B()), aVar2);
                v4.a(null, ay.b.u(C1987R.string.tutorial_achieve_tab_intro_title, aVar2), null, null, null, 0.0f, 0.0f, 0, 0, 1, aVar2, 805306368, ConstantsWs.WS_STATUS_NO_FILTER);
            }
            return y.f85009a;
        }
    }

    /* compiled from: AchieveTabTutorial.kt */
    /* loaded from: classes4.dex */
    static final class b extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f46264a = new w(2);

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                d0.a(e1.n(aVar3, yk.h.B()), aVar2);
                z.a(s2.d.a(C1987R.drawable.ic_withings_plus, aVar2), "withings plus logo", x0.h(aVar3, yk.h.o(), 0.0f, 2), null, null, 0.0f, null, aVar2, 56, 120);
                d0.a(e1.n(aVar3, yk.h.B()), aVar2);
                v4.b(null, ay.b.u(C1987R.string.tutorial_achieve_tab_goal_title, aVar2), null, null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_ACCOUNTSUSPENDED);
            }
            return y.f85009a;
        }
    }

    /* compiled from: AchieveTabTutorial.kt */
    /* loaded from: classes4.dex */
    static final class c extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f46265a = new w(2);

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                d0.a(e1.n(aVar3, yk.h.B()), aVar2);
                z.a(s2.d.a(C1987R.drawable.ic_withings_plus, aVar2), "withings plus logo", x0.h(aVar3, yk.h.o(), 0.0f, 2), null, null, 0.0f, null, aVar2, 56, 120);
                d0.a(e1.n(aVar3, yk.h.B()), aVar2);
                v4.b(null, ay.b.u(C1987R.string.tutorial_achieve_tab_programs_title, aVar2), null, null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_ACCOUNTSUSPENDED);
            }
            return y.f85009a;
        }
    }

    /* compiled from: AchieveTabTutorial.kt */
    /* renamed from: com.withings.tutorials.ui.screens.tab.d$d  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0636d extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0636d f46266a = new w(2);

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                d0.a(e1.n(aVar3, yk.h.B()), aVar2);
                z.a(s2.d.a(C1987R.drawable.ic_withings_plus, aVar2), "withings plus logo", x0.h(aVar3, yk.h.o(), 0.0f, 2), null, null, 0.0f, null, aVar2, 56, 120);
                d0.a(e1.n(aVar3, yk.h.B()), aVar2);
                v4.b(null, ay.b.u(C1987R.string.tutorial_achieve_tab_library_title, aVar2), null, null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_ACCOUNTSUSPENDED);
            }
            return y.f85009a;
        }
    }
}
