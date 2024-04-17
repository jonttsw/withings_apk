package com.withings.notifications.ui;

import androidx.camera.camera2.internal.v1;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import com.withings.common.compose.component.card.stack.CardTextSize;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.notifications.model.NotificationStyle;
import com.withings.wiscale2.C1987R;
import kotlin.collections.c1;
import mk.c;
/* compiled from: NotificationCards.kt */
/* loaded from: classes4.dex */
public final class h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationCards.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<c10.c<?>, nm0.y> f42927a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c10.c<?> f42928b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ym0.l<? super c10.c<?>, nm0.y> lVar, c10.c<?> cVar) {
            super(1);
            this.f42927a = lVar;
            this.f42928b = cVar;
        }

        @Override // ym0.l
        public final nm0.y invoke(Integer num) {
            num.intValue();
            this.f42927a.invoke(this.f42928b);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationCards.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c10.c<?> f42929a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CardTextSize f42930b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<c10.c<?>, nm0.y> f42931c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(c10.c<?> cVar, CardTextSize cardTextSize, ym0.l<? super c10.c<?>, nm0.y> lVar) {
            super(2);
            this.f42929a = cVar;
            this.f42930b = cardTextSize;
            this.f42931c = lVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                ym0.l<c10.c<?>, nm0.y> lVar = this.f42931c;
                c10.c<?> cVar = this.f42929a;
                h.b(8, 4, aVar2, null, this.f42930b, cVar, new i(lVar, cVar));
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationCards.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c10.c<?> f42932a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<c10.c<?>, nm0.y> f42933b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<c10.c<?>, nm0.y> f42934c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f42935d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CardTextSize f42936e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f42937f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f42938g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(c10.c<?> cVar, ym0.l<? super c10.c<?>, nm0.y> lVar, ym0.l<? super c10.c<?>, nm0.y> lVar2, androidx.compose.ui.e eVar, CardTextSize cardTextSize, int i11, int i12) {
            super(2);
            this.f42932a = cVar;
            this.f42933b = lVar;
            this.f42934c = lVar2;
            this.f42935d = eVar;
            this.f42936e = cardTextSize;
            this.f42937f = i11;
            this.f42938g = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f42937f | 1);
            androidx.compose.ui.e eVar = this.f42935d;
            CardTextSize cardTextSize = this.f42936e;
            h.c(this.f42932a, this.f42933b, this.f42934c, eVar, cardTextSize, aVar, g11, this.f42938g);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationCards.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c10.c<?> f42939a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(c10.c<?> cVar) {
            super(3);
            this.f42939a = cVar;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.c cVar, androidx.compose.runtime.a aVar, Integer num) {
            int i11;
            r0.c SmallRoundedSquareCard = cVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(SmallRoundedSquareCard, "$this$SmallRoundedSquareCard");
            if ((intValue & 14) == 0) {
                if (aVar2.K(SmallRoundedSquareCard)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                intValue |= i11;
            }
            if ((intValue & 91) == 18 && aVar2.h()) {
                aVar2.C();
            } else {
                p.j(this.f42939a, SmallRoundedSquareCard, NotificationStyle.f42820b, aVar2, ((intValue << 3) & 112) | ConstantsWs.WS_STATUS_FIRMWARE_NOT_VALIDATED);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationCards.kt */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c10.c<?> f42940a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f42941b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f42942c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f42943d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f42944e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ CardTextSize f42945f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f42946g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f42947h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(c10.c<?> cVar, androidx.compose.ui.e eVar, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, float f11, CardTextSize cardTextSize, int i11, int i12) {
            super(2);
            this.f42940a = cVar;
            this.f42941b = eVar;
            this.f42942c = aVar;
            this.f42943d = aVar2;
            this.f42944e = f11;
            this.f42945f = cardTextSize;
            this.f42946g = i11;
            this.f42947h = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f42946g | 1);
            float f11 = this.f42944e;
            CardTextSize cardTextSize = this.f42945f;
            h.d(this.f42940a, this.f42941b, this.f42942c, this.f42943d, f11, cardTextSize, aVar, g11, this.f42947h);
            return nm0.y.f85009a;
        }
    }

    public static final void a(int i11, int i12, androidx.compose.runtime.a aVar, androidx.compose.ui.e eVar, CardTextSize cardTextSize, c10.c notification, ym0.a aVar2) {
        e.a aVar3;
        CardTextSize cardTextSize2;
        kotlin.jvm.internal.u.j(notification, "notification");
        androidx.compose.runtime.b g11 = aVar.g(-2034606891);
        if ((i12 & 2) != 0) {
            aVar3 = androidx.compose.ui.e.f8927a;
        } else {
            aVar3 = eVar;
        }
        if ((i12 & 8) != 0) {
            cardTextSize2 = CardTextSize.f33629b;
        } else {
            cardTextSize2 = cardTextSize;
        }
        wj.a.a(p.z(notification, g11), p.y(notification, g11), v1.B(notification.h(), g11), s1.b.b(g11, -1736281866, new f(notification)), aVar3, cardTextSize2, null, 0.0f, aVar2, g11, ((i11 << 9) & 57344) | 3072 | ((i11 << 6) & 458752) | ((i11 << 18) & 234881024), 192);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new g(i11, i12, aVar3, cardTextSize2, notification, aVar2));
        }
    }

    public static final void b(int i11, int i12, androidx.compose.runtime.a aVar, androidx.compose.ui.e eVar, CardTextSize cardTextSize, c10.c notification, ym0.a aVar2) {
        e.a aVar3;
        CardTextSize cardTextSize2;
        kotlin.jvm.internal.u.j(notification, "notification");
        androidx.compose.runtime.b g11 = aVar.g(919756229);
        if ((i12 & 4) != 0) {
            aVar3 = androidx.compose.ui.e.f8927a;
        } else {
            aVar3 = eVar;
        }
        if ((i12 & 8) != 0) {
            cardTextSize2 = CardTextSize.f33629b;
        } else {
            cardTextSize2 = cardTextSize;
        }
        int ordinal = p.x(notification).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                g11.s(1937348488);
                g11.J();
            } else {
                g11.s(1937348307);
                d(notification, aVar3, aVar2, null, 0.0f, cardTextSize2, g11, ((i11 >> 3) & 112) | 8 | ((i11 << 3) & ConstantsWs.HWFAILURE_ZERO) | ((i11 << 6) & 458752), 24);
                g11.J();
            }
        } else {
            g11.s(1937348087);
            a(((i11 >> 3) & 112) | 8 | ((i11 << 3) & ConstantsWs.HWFAILURE_ZERO) | (i11 & 7168), 0, g11, aVar3, cardTextSize2, notification, aVar2);
            g11.J();
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new j(i11, i12, aVar3, cardTextSize2, notification, aVar2));
        }
    }

    public static final void c(c10.c<?> notification, ym0.l<? super c10.c<?>, nm0.y> onItemClick, ym0.l<? super c10.c<?>, nm0.y> onItemDelete, androidx.compose.ui.e eVar, CardTextSize cardTextSize, androidx.compose.runtime.a aVar, int i11, int i12) {
        e.a aVar2;
        CardTextSize cardTextSize2;
        mk.c cVar;
        kotlin.jvm.internal.u.j(notification, "notification");
        kotlin.jvm.internal.u.j(onItemClick, "onItemClick");
        kotlin.jvm.internal.u.j(onItemDelete, "onItemDelete");
        androidx.compose.runtime.b g11 = aVar.g(-889823689);
        if ((i12 & 8) != 0) {
            aVar2 = androidx.compose.ui.e.f8927a;
        } else {
            aVar2 = eVar;
        }
        if ((i12 & 16) != 0) {
            cardTextSize2 = CardTextSize.f33629b;
        } else {
            cardTextSize2 = cardTextSize;
        }
        g11.s(-377847519);
        String i13 = notification.i();
        g11.s(1366605464);
        boolean K = g11.K(i13);
        Object t11 = g11.t();
        if (K || t11 == a.C0060a.a()) {
            t11 = Boolean.valueOf(!c1.h("device", "in_app_update", "jailbroken_rooted_phone", "required_interaction", "tutorial_flow").contains(notification.i()));
            g11.n(t11);
        }
        boolean booleanValue = ((Boolean) t11).booleanValue();
        g11.J();
        g11.J();
        if (booleanValue) {
            cVar = c.C1318c.f82203a;
        } else {
            cVar = c.b.f82202a;
        }
        mk.c cVar2 = cVar;
        mk.d.c(aVar2, cVar2, kotlin.collections.x.V(new mk.b(C1987R.drawable.ic_utilitary_delete, 0, Integer.valueOf((int) C1987R.string._TM_DELETE_))), new a(onItemDelete, notification), false, s1.b.b(g11, -1990667076, new b(notification, cardTextSize2, onItemClick)), g11, ((i11 >> 9) & 14) | 196608, 16);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new c(notification, onItemClick, onItemDelete, aVar2, cardTextSize2, i11, i12));
        }
    }

    public static final void d(c10.c<?> notification, androidx.compose.ui.e eVar, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, float f11, CardTextSize cardTextSize, androidx.compose.runtime.a aVar3, int i11, int i12) {
        e.a aVar4;
        ym0.a<nm0.y> aVar5;
        float f12;
        CardTextSize cardTextSize2;
        kotlin.jvm.internal.u.j(notification, "notification");
        androidx.compose.runtime.b g11 = aVar3.g(-1000940243);
        if ((i12 & 2) != 0) {
            aVar4 = androidx.compose.ui.e.f8927a;
        } else {
            aVar4 = eVar;
        }
        if ((i12 & 8) != 0) {
            aVar5 = null;
        } else {
            aVar5 = aVar2;
        }
        if ((i12 & 16) != 0) {
            f12 = 0;
        } else {
            f12 = f11;
        }
        if ((i12 & 32) != 0) {
            cardTextSize2 = CardTextSize.f33629b;
        } else {
            cardTextSize2 = cardTextSize;
        }
        int i13 = i11 << 3;
        int i14 = ((i11 >> 3) & 14) | 24576 | (458752 & i13) | (i13 & 3670016);
        int i15 = i11 << 18;
        wj.g.a(aVar4, p.z(notification, g11), p.y(notification, g11), v1.B(notification.h(), g11), s1.b.b(g11, -1798057368, new d(notification)), f12, cardTextSize2, null, aVar, aVar5, g11, i14 | (234881024 & i15) | (i15 & 1879048192), 128);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new e(notification, aVar4, aVar, aVar5, f12, cardTextSize2, i11, i12));
        }
    }
}
