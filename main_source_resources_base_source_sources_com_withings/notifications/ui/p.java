package com.withings.notifications.ui;

import android.content.Context;
import androidx.compose.foundation.layout.e1;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.node.g;
import c10.d;
import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.notifications.model.NotificationStyle;
import com.withings.partner.model.Partner;
import com.withings.webservices.legacy.withings.model.ImagesP4;
import com.withings.wiscale2.C1987R;
import d2.h1;
import ga.f;
import gl.b0;
import k1.j1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import qk.vb;
import x1.b;
import x9.c;
/* compiled from: NotificationUiMapper.kt */
/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private static final long f42984a = d2.h0.c(4294110954L);

    /* renamed from: b  reason: collision with root package name */
    private static final float f42985b = 64;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f42986c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f42987a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z5) {
            super(3);
            this.f42987a = z5;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.c cVar, androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.ui.e eVar;
            int i11;
            r0.c NotificationImage = cVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(NotificationImage, "$this$NotificationImage");
            if ((intValue & 14) == 0) {
                if (aVar2.K(NotificationImage)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                intValue |= i11;
            }
            if ((intValue & 91) == 18 && aVar2.h()) {
                aVar2.C();
            } else {
                boolean z5 = this.f42987a;
                if (z5) {
                    eVar = androidx.compose.foundation.c.b(androidx.compose.ui.e.f8927a, p.f42984a, h1.a());
                } else {
                    eVar = androidx.compose.ui.e.f8927a;
                }
                p.d(NotificationImage, eVar, s1.b.b(aVar2, 1309559061, new com.withings.notifications.ui.o(z5)), aVar2, (intValue & 14) | ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 0);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class a0 extends kotlin.jvm.internal.w implements ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f42988a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(boolean z5) {
            super(3);
            this.f42988a = z5;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.c cVar, androidx.compose.runtime.a aVar, Integer num) {
            int i11;
            r0.c NotificationImage = cVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(NotificationImage, "$this$NotificationImage");
            if ((intValue & 14) == 0) {
                if (aVar2.K(NotificationImage)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                intValue |= i11;
            }
            if ((intValue & 91) == 18 && aVar2.h()) {
                aVar2.C();
            } else {
                p.b(NotificationImage, this.f42988a, aVar2, intValue & 14);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0.c f42989a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f42990b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d.a f42991c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f42992d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(r0.c cVar, boolean z5, d.a aVar, int i11) {
            super(2);
            this.f42989a = cVar;
            this.f42990b = z5;
            this.f42991c = aVar;
            this.f42992d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f42992d | 1);
            boolean z5 = this.f42990b;
            d.a aVar2 = this.f42991c;
            p.a(this.f42989a, z5, aVar2, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class b0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0.c f42993a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f42994b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d.h f42995c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f42996d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(r0.c cVar, boolean z5, d.h hVar, int i11) {
            super(2);
            this.f42993a = cVar;
            this.f42994b = z5;
            this.f42995c = hVar;
            this.f42996d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f42996d | 1);
            boolean z5 = this.f42994b;
            d.h hVar = this.f42995c;
            p.r(this.f42993a, z5, hVar, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f42997a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z5) {
            super(3);
            this.f42997a = z5;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.c cVar, androidx.compose.runtime.a aVar, Integer num) {
            float n11;
            r0.c CenteredInBox = cVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(CenteredInBox, "$this$CenteredInBox");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                if (this.f42997a) {
                    n11 = p.f42985b;
                } else {
                    n11 = yk.h.n();
                }
                n0.z.a(s2.d.a(com.withings.wiscale2.device.hwa08.postinstall.b0.G(vb.f93172a), aVar2), null, e1.n(aVar3, n11), null, null, 0.0f, null, aVar2, 56, 120);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class c0 extends kotlin.jvm.internal.w implements ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f42998a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(boolean z5) {
            super(3);
            this.f42998a = z5;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.c cVar, androidx.compose.runtime.a aVar, Integer num) {
            int i11;
            r0.c CenteredInBox = cVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(CenteredInBox, "$this$CenteredInBox");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                if (this.f42998a) {
                    i11 = 2131231162;
                } else {
                    i11 = 2131231163;
                }
                n0.z.a(s2.d.a(i11, aVar2), null, null, null, null, 0.0f, null, aVar2, 56, 124);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0.c f42999a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f43000b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f43001c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(r0.c cVar, boolean z5, int i11) {
            super(2);
            this.f42999a = cVar;
            this.f43000b = z5;
            this.f43001c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43001c | 1);
            p.b(this.f42999a, this.f43000b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class d0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0.c f43002a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f43003b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f43004c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(r0.c cVar, boolean z5, int i11) {
            super(2);
            this.f43002a = cVar;
            this.f43003b = z5;
            this.f43004c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43004c | 1);
            p.s(this.f43002a, this.f43003b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0.c f43005a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f43006b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f43007c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(r0.c cVar, boolean z5, int i11) {
            super(2);
            this.f43005a = cVar;
            this.f43006b = z5;
            this.f43007c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43007c | 1);
            p.c(this.f43005a, this.f43006b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0.c f43008a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f43009b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> f43010c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f43011d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f43012e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(r0.c cVar, androidx.compose.ui.e eVar, ym0.q<? super r0.c, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> qVar, int i11, int i12) {
            super(2);
            this.f43008a = cVar;
            this.f43009b = eVar;
            this.f43010c = qVar;
            this.f43011d = i11;
            this.f43012e = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43011d | 1);
            androidx.compose.ui.e eVar = this.f43009b;
            ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> qVar = this.f43010c;
            p.d(this.f43008a, eVar, qVar, aVar, g11, this.f43012e);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.notifications.ui.NotificationUiMapperKt$DynamicDeviceImage$1", f = "NotificationUiMapper.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f43013a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.withings.notifications.ui.n f43014b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.r0<Long> f43015c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, com.withings.notifications.ui.n nVar, k1.r0<Long> r0Var, qm0.d<? super g> dVar) {
            super(2, dVar);
            this.f43013a = str;
            this.f43014b = nVar;
            this.f43015c = r0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new g(this.f43013a, this.f43014b, this.f43015c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((g) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Device e11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            String n11 = ah.t.n(this.f43013a);
            if (n11 != null && (e11 = this.f43014b.a().e(n11)) != null) {
                Long l5 = new Long(e11.getId());
                int i11 = p.f42986c;
                this.f43015c.setValue(l5);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0.c f43016a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f43017b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f43018c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f43019d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(r0.c cVar, String str, boolean z5, int i11) {
            super(2);
            this.f43016a = cVar;
            this.f43017b = str;
            this.f43018c = z5;
            this.f43019d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43019d | 1);
            String str = this.f43017b;
            boolean z5 = this.f43018c;
            p.f(this.f43016a, str, z5, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.notifications.ui.NotificationUiMapperKt$DynamicDeviceImage$5", f = "NotificationUiMapper.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.withings.notifications.ui.n f43020a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f43021b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.r0<Device> f43022c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k1.r0<Integer> f43023d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(com.withings.notifications.ui.n nVar, long j5, k1.r0<Device> r0Var, k1.r0<Integer> r0Var2, qm0.d<? super i> dVar) {
            super(2, dVar);
            this.f43020a = nVar;
            this.f43021b = j5;
            this.f43022c = r0Var;
            this.f43023d = r0Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new i(this.f43020a, this.f43021b, this.f43022c, this.f43023d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((i) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            com.withings.notifications.ui.n nVar = this.f43020a;
            Device d11 = nVar.a().d(this.f43021b);
            if (d11 != null) {
                int i11 = p.f42986c;
                this.f43022c.setValue(d11);
                this.f43023d.setValue(new Integer(nVar.q().g(d11).M(d11.getColor())));
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f43024a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k1.r0<Device> f43025b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.r0<Integer> f43026c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i11, k1.r0<Device> r0Var, k1.r0<Integer> r0Var2) {
            super(3);
            this.f43024a = i11;
            this.f43025b = r0Var;
            this.f43026c = r0Var2;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.c cVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.c CenteredInBox = cVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(CenteredInBox, "$this$CenteredInBox");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                f.a aVar3 = new f.a((Context) aVar2.D(androidx.compose.ui.platform.u0.d()));
                aVar3.d(Integer.valueOf(this.f43024a));
                aVar3.o(ha.e.f70341c);
                x9.o.a(aVar3.b(), null, null, null, null, s1.b.b(aVar2, 1340973059, new com.withings.notifications.ui.q(this.f43025b, this.f43026c)), null, null, null, null, f.a.e(), 0.0f, null, 0, aVar2, 196664, 6, 15324);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0.c f43027a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f43028b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f43029c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f43030d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(r0.c cVar, long j5, boolean z5, int i11) {
            super(2);
            this.f43027a = cVar;
            this.f43028b = j5;
            this.f43029c = z5;
            this.f43030d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43030d | 1);
            long j5 = this.f43028b;
            boolean z5 = this.f43029c;
            p.e(this.f43027a, j5, z5, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0.c f43031a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f43032b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f43033c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(r0.c cVar, boolean z5, int i11) {
            super(2);
            this.f43031a = cVar;
            this.f43032b = z5;
            this.f43033c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43033c | 1);
            p.g(this.f43031a, this.f43032b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0.c f43034a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f43035b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f43036c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(r0.c cVar, boolean z5, int i11) {
            super(2);
            this.f43034a = cVar;
            this.f43035b = z5;
            this.f43036c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43036c | 1);
            p.h(this.f43034a, this.f43035b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class n extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0.c f43037a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f43038b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f43039c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(r0.c cVar, boolean z5, int i11) {
            super(2);
            this.f43037a = cVar;
            this.f43038b = z5;
            this.f43039c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43039c | 1);
            p.i(this.f43037a, this.f43038b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class o extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c10.c<?> f43040a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r0.c f43041b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ NotificationStyle f43042c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f43043d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(c10.c<?> cVar, r0.c cVar2, NotificationStyle notificationStyle, int i11) {
            super(2);
            this.f43040a = cVar;
            this.f43041b = cVar2;
            this.f43042c = notificationStyle;
            this.f43043d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43043d | 1);
            r0.c cVar = this.f43041b;
            NotificationStyle notificationStyle = this.f43042c;
            p.j(this.f43040a, cVar, notificationStyle, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* renamed from: com.withings.notifications.ui.p$p  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0577p extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c10.c<?> f43044a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r0.c f43045b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ NotificationStyle f43046c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f43047d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0577p(c10.c<?> cVar, r0.c cVar2, NotificationStyle notificationStyle, int i11) {
            super(2);
            this.f43044a = cVar;
            this.f43045b = cVar2;
            this.f43046c = notificationStyle;
            this.f43047d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43047d | 1);
            r0.c cVar = this.f43045b;
            NotificationStyle notificationStyle = this.f43046c;
            p.j(this.f43044a, cVar, notificationStyle, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class q extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c10.c<?> f43048a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r0.c f43049b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ NotificationStyle f43050c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f43051d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(c10.c<?> cVar, r0.c cVar2, NotificationStyle notificationStyle, int i11) {
            super(2);
            this.f43048a = cVar;
            this.f43049b = cVar2;
            this.f43050c = notificationStyle;
            this.f43051d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43051d | 1);
            r0.c cVar = this.f43049b;
            NotificationStyle notificationStyle = this.f43050c;
            p.j(this.f43048a, cVar, notificationStyle, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class r extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c10.c<?> f43052a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r0.c f43053b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ NotificationStyle f43054c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f43055d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(c10.c<?> cVar, r0.c cVar2, NotificationStyle notificationStyle, int i11) {
            super(2);
            this.f43052a = cVar;
            this.f43053b = cVar2;
            this.f43054c = notificationStyle;
            this.f43055d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43055d | 1);
            r0.c cVar = this.f43053b;
            NotificationStyle notificationStyle = this.f43054c;
            p.j(this.f43052a, cVar, notificationStyle, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class s extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0.c f43056a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f43057b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f43058c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(r0.c cVar, boolean z5, int i11) {
            super(2);
            this.f43056a = cVar;
            this.f43057b = z5;
            this.f43058c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43058c | 1);
            p.k(this.f43056a, this.f43057b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class t extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0.c f43059a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d.c f43060b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f43061c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(r0.c cVar, d.c cVar2, int i11) {
            super(2);
            this.f43059a = cVar;
            this.f43060b = cVar2;
            this.f43061c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43061c | 1);
            p.l(this.f43059a, this.f43060b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class u extends kotlin.jvm.internal.w implements ym0.r<x9.r, c.b.C1857c, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> f43062a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        u(ym0.q<? super r0.c, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> qVar) {
            super(4);
            this.f43062a = qVar;
        }

        @Override // ym0.r
        public final nm0.y invoke(x9.r rVar, c.b.C1857c c1857c, androidx.compose.runtime.a aVar, Integer num) {
            int i11;
            x9.r SubcomposeAsyncImage = rVar;
            c.b.C1857c it = c1857c;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
            kotlin.jvm.internal.u.j(it, "it");
            if ((intValue & 14) == 0) {
                if (aVar2.K(SubcomposeAsyncImage)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                intValue |= i11;
            }
            if ((intValue & 651) == 130 && aVar2.h()) {
                aVar2.C();
            } else {
                this.f43062a.invoke(SubcomposeAsyncImage, aVar2, Integer.valueOf(intValue & 14));
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class v extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0.c f43063a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f43064b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f43065c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> f43066d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f43067e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f43068f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        v(r0.c cVar, String str, androidx.compose.ui.e eVar, ym0.q<? super r0.c, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> qVar, int i11, int i12) {
            super(2);
            this.f43063a = cVar;
            this.f43064b = str;
            this.f43065c = eVar;
            this.f43066d = qVar;
            this.f43067e = i11;
            this.f43068f = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43067e | 1);
            androidx.compose.ui.e eVar = this.f43065c;
            ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> qVar = this.f43066d;
            p.o(this.f43063a, this.f43064b, eVar, qVar, aVar, g11, this.f43068f);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class w extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0.c f43069a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g2.c f43070b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f43071c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f43072d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f43073e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(r0.c cVar, g2.c cVar2, androidx.compose.ui.e eVar, int i11, int i12) {
            super(2);
            this.f43069a = cVar;
            this.f43070b = cVar2;
            this.f43071c = eVar;
            this.f43072d = i11;
            this.f43073e = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43072d | 1);
            g2.c cVar = this.f43070b;
            androidx.compose.ui.e eVar = this.f43071c;
            p.n(this.f43069a, cVar, eVar, aVar, g11, this.f43073e);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class x extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0.c f43074a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f43075b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f43076c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f43077d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f43078e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f43079f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f43080g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(r0.c cVar, int i11, int i12, boolean z5, androidx.compose.ui.e eVar, int i13, int i14) {
            super(2);
            this.f43074a = cVar;
            this.f43075b = i11;
            this.f43076c = i12;
            this.f43077d = z5;
            this.f43078e = eVar;
            this.f43079f = i13;
            this.f43080g = i14;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43079f | 1);
            boolean z5 = this.f43077d;
            androidx.compose.ui.e eVar = this.f43078e;
            p.m(this.f43074a, this.f43075b, this.f43076c, z5, eVar, aVar, g11, this.f43080g);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class y extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0.c f43081a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d.e f43082b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f43083c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f43084d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(r0.c cVar, d.e eVar, boolean z5, int i11) {
            super(2);
            this.f43081a = cVar;
            this.f43082b = eVar;
            this.f43083c = z5;
            this.f43084d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43084d | 1);
            d.e eVar = this.f43082b;
            boolean z5 = this.f43083c;
            p.p(this.f43081a, eVar, z5, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationUiMapper.kt */
    /* loaded from: classes4.dex */
    public static final class z extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0.c f43085a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d.f f43086b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f43087c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f43088d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(r0.c cVar, d.f fVar, boolean z5, int i11) {
            super(2);
            this.f43085a = cVar;
            this.f43086b = fVar;
            this.f43087c = z5;
            this.f43088d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f43088d | 1);
            d.f fVar = this.f43086b;
            boolean z5 = this.f43087c;
            p.q(this.f43085a, fVar, z5, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public static final b0.a A(d.i data, androidx.compose.runtime.a aVar) {
        fl.o d11;
        gl.b0 b0Var;
        kotlin.jvm.internal.u.j(data, "data");
        aVar.s(-178583722);
        Integer c11 = data.c();
        aVar.s(-1466511205);
        b0.a aVar2 = null;
        if (c11 == null) {
            d11 = null;
        } else {
            d11 = v(aVar).q().d(c11.intValue());
        }
        aVar.J();
        aVar.s(-1466511131);
        if (d11 != null) {
            if (d11 instanceof gl.b0) {
                b0Var = (gl.b0) d11;
            } else {
                b0Var = null;
            }
            aVar.s(-1466511077);
            if (b0Var != null) {
                aVar2 = gl.b0.L((Context) aVar.D(androidx.compose.ui.platform.u0.d()), ay.b.u(d11.I(data.a()), aVar));
            }
            aVar.J();
        }
        aVar.J();
        if (aVar2 == null) {
            aVar2 = new b0.a(ay.b.u(C1987R.string.tutorial_importantItem_title, aVar), ay.b.u(C1987R.string.tutorial_importantItem_description, aVar));
        }
        aVar.J();
        return aVar2;
    }

    public static final void a(r0.c cVar, boolean z5, d.a data, androidx.compose.runtime.a aVar, int i11) {
        String str;
        kotlin.jvm.internal.u.j(cVar, "<this>");
        kotlin.jvm.internal.u.j(data, "data");
        androidx.compose.runtime.b g11 = aVar.g(835473722);
        String c11 = data.c();
        if (c11 != null) {
            str = bi.a.a(c11);
        } else {
            str = null;
        }
        o(cVar, str, null, s1.b.b(g11, -1218314298, new a(z5)), g11, (i11 & 14) | 3072, 2);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(cVar, z5, data, i11));
        }
    }

    public static final void b(r0.c cVar, boolean z5, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        androidx.compose.ui.e b10;
        int i13;
        int i14;
        kotlin.jvm.internal.u.j(cVar, "<this>");
        androidx.compose.runtime.b g11 = aVar.g(1504466786);
        if ((i11 & 14) == 0) {
            if (g11.K(cVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.a(z5)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) != 18 || !g11.h()) {
            b10 = androidx.compose.foundation.c.b(androidx.compose.ui.e.f8927a, f42984a, h1.a());
            d(cVar, b10, s1.b.b(g11, 1154128049, new c(z5)), g11, (i12 & 14) | 432, 0);
        } else {
            g11.C();
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d(cVar, z5, i11));
        }
    }

    public static final void c(r0.c cVar, boolean z5, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        kotlin.jvm.internal.u.j(cVar, "<this>");
        androidx.compose.runtime.b g11 = aVar.g(-1219587592);
        if ((i11 & 14) == 0) {
            if (g11.K(cVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.a(z5)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            m(cVar, 2131231141, 2131231142, z5, null, g11, (i12 & 14) | ((i12 << 6) & 7168), 8);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new e(cVar, z5, i11));
        }
    }

    public static final void d(r0.c cVar, androidx.compose.ui.e eVar, ym0.q<? super r0.c, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> content, androidx.compose.runtime.a aVar, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        kotlin.jvm.internal.u.j(cVar, "<this>");
        kotlin.jvm.internal.u.j(content, "content");
        androidx.compose.runtime.b g11 = aVar.g(-1157594587);
        if ((Integer.MIN_VALUE & i12) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (g11.K(cVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        int i17 = i12 & 1;
        if (i17 != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (g11.K(eVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i12 & 2) != 0) {
            i13 |= ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED;
        } else if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(content)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i13 |= i16;
        }
        if ((i13 & 731) == 146 && g11.h()) {
            g11.C();
        } else {
            if (i17 != 0) {
                eVar = androidx.compose.ui.e.f8927a;
            }
            androidx.compose.ui.e n11 = cVar.a(androidx.compose.ui.e.f8927a).n(eVar);
            x1.d e11 = b.a.e();
            int i18 = ((i13 << 3) & 7168) | 48;
            g11.s(733328855);
            androidx.compose.ui.layout.l0 d11 = androidx.compose.foundation.layout.k.d(e11, false, g11);
            g11.s(-1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(n11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a11);
                } else {
                    g11.m();
                }
                ym0.p b10 = com.withings.authentication.e.b(g11, d11, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
                }
                dq.x.b(0, c11, j1.a(g11), g11, 2058660585);
                content.invoke(androidx.compose.foundation.layout.m.f4307a, g11, Integer.valueOf(((i18 >> 6) & 112) | 6));
                g11.J();
                g11.o();
                g11.J();
                g11.J();
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.ui.e eVar2 = eVar;
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new f(cVar, eVar2, content, i11, i12));
        }
    }

    public static final void e(r0.c cVar, long j5, boolean z5, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        androidx.compose.ui.e b10;
        float b11;
        nm0.y yVar;
        int i13;
        int i14;
        int i15;
        kotlin.jvm.internal.u.j(cVar, "<this>");
        androidx.compose.runtime.b g11 = aVar.g(-1631718601);
        if ((i11 & 14) == 0) {
            if (g11.K(cVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.d(j5)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.a(z5)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && g11.h()) {
            g11.C();
        } else {
            g11.s(1628014098);
            Object t11 = g11.t();
            if (t11 == a.C0060a.a()) {
                t11 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
                g11.n(t11);
            }
            k1.r0 r0Var = (k1.r0) t11;
            g11.J();
            com.withings.notifications.ui.n v11 = v(g11);
            g11.s(1628014193);
            Object t12 = g11.t();
            if (t12 == a.C0060a.a()) {
                t12 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
                g11.n(t12);
            }
            k1.r0 r0Var2 = (k1.r0) t12;
            g11.J();
            int i16 = i12 >> 3;
            k1.y.f(Long.valueOf(j5), new i(v11, j5, r0Var2, r0Var, null), g11);
            Integer num = (Integer) r0Var.getValue();
            g11.s(1628014662);
            if (num == null) {
                yVar = null;
            } else {
                int intValue = num.intValue();
                b10 = androidx.compose.foundation.c.b(androidx.compose.ui.e.f8927a, f42984a, h1.a());
                if (z5) {
                    b11 = yk.h.t();
                } else {
                    b11 = yk.h.b();
                }
                d(cVar, androidx.compose.foundation.layout.x0.f(b10, b11), s1.b.b(g11, -870953081, new j(intValue, r0Var2, r0Var)), g11, (i12 & 14) | ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 0);
                yVar = nm0.y.f85009a;
            }
            g11.J();
            if (yVar == null) {
                b(cVar, z5, g11, i16 & 112);
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new k(cVar, j5, z5, i11));
        }
    }

    public static final void f(r0.c cVar, String str, boolean z5, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        kotlin.jvm.internal.u.j(cVar, "<this>");
        androidx.compose.runtime.b g11 = aVar.g(1048311436);
        if ((i11 & 14) == 0) {
            if (g11.K(cVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.K(str)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.a(z5)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && g11.h()) {
            g11.C();
        } else {
            com.withings.notifications.ui.n v11 = v(g11);
            g11.s(1628011731);
            Object t11 = g11.t();
            nm0.y yVar = null;
            if (t11 == a.C0060a.a()) {
                t11 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
                g11.n(t11);
            }
            k1.r0 r0Var = (k1.r0) t11;
            g11.J();
            int i16 = i12 >> 3;
            k1.y.f(str, new g(str, v11, r0Var, null), g11);
            Long l5 = (Long) r0Var.getValue();
            g11.s(1628012008);
            if (l5 != null) {
                e(cVar, l5.longValue(), z5, g11, (i12 & 14) | (i12 & ConstantsWs.HWFAILURE_ZERO));
                yVar = nm0.y.f85009a;
            }
            g11.J();
            if (yVar == null) {
                g(cVar, z5, g11, i16 & 112);
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new h(cVar, str, z5, i11));
        }
    }

    public static final void g(r0.c cVar, boolean z5, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        kotlin.jvm.internal.u.j(cVar, "<this>");
        androidx.compose.runtime.b g11 = aVar.g(456854521);
        if ((i11 & 14) == 0) {
            if (g11.K(cVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.a(z5)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            m(cVar, 2131231274, 2131231285, z5, null, g11, (i12 & 14) | ((i12 << 6) & 7168), 8);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new l(cVar, z5, i11));
        }
    }

    public static final void h(r0.c cVar, boolean z5, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        kotlin.jvm.internal.u.j(cVar, "<this>");
        androidx.compose.runtime.b g11 = aVar.g(853010126);
        if ((i11 & 14) == 0) {
            if (g11.K(cVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.a(z5)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            m(cVar, 2131231446, 2131231447, z5, null, g11, (i12 & 14) | ((i12 << 6) & 7168), 8);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new m(cVar, z5, i11));
        }
    }

    public static final void i(r0.c cVar, boolean z5, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        kotlin.jvm.internal.u.j(cVar, "<this>");
        androidx.compose.runtime.b g11 = aVar.g(2097568312);
        if ((i11 & 14) == 0) {
            if (g11.K(cVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.a(z5)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            m(cVar, 2131231466, 2131231467, z5, null, g11, (i12 & 14) | ((i12 << 6) & 7168), 8);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new n(cVar, z5, i11));
        }
    }

    public static final void j(c10.c<?> cVar, r0.c scope, NotificationStyle chosenStyle, androidx.compose.runtime.a aVar, int i11) {
        boolean z5;
        kotlin.jvm.internal.u.j(cVar, "<this>");
        kotlin.jvm.internal.u.j(scope, "scope");
        kotlin.jvm.internal.u.j(chosenStyle, "chosenStyle");
        androidx.compose.runtime.b g11 = aVar.g(204329209);
        if (chosenStyle == NotificationStyle.f42819a) {
            z5 = true;
        } else {
            z5 = false;
        }
        String i12 = cVar.i();
        int hashCode = i12.hashCode();
        if (hashCode != -1942246723) {
            if (hashCode != -1335157162) {
                if (hashCode == -1260450199 && i12.equals("unknown_measure")) {
                    g11.s(-231226445);
                    g(scope, z5, g11, 0);
                    g11.J();
                    androidx.compose.runtime.v o02 = g11.o0();
                    if (o02 != null) {
                        o02.G(new o(cVar, scope, chosenStyle, i11));
                        return;
                    }
                    return;
                }
            } else if (i12.equals("device")) {
                g11.s(-231226350);
                f(scope, cVar.b(), z5, g11, 0);
                g11.J();
                androidx.compose.runtime.v o03 = g11.o0();
                if (o03 != null) {
                    o03.G(new C0577p(cVar, scope, chosenStyle, i11));
                    return;
                }
                return;
            }
        } else if (i12.equals("wpm_error")) {
            g11.s(-231226231);
            s(scope, z5, g11, 0);
            g11.J();
            androidx.compose.runtime.v o04 = g11.o0();
            if (o04 != null) {
                o04.G(new q(cVar, scope, chosenStyle, i11));
                return;
            }
            return;
        }
        g11.s(-231226174);
        g11.J();
        Object e11 = cVar.e();
        if (e11 instanceof d.a) {
            g11.s(-231226037);
            a(scope, z5, (d.a) e11, g11, 512);
            g11.J();
        } else if (e11 instanceof d.b) {
            g11.s(-231225960);
            k(scope, z5, g11, 0);
            g11.J();
        } else if (e11 instanceof d.c) {
            g11.s(-231225872);
            l(scope, (d.c) e11, g11, 64);
            g11.J();
        } else if (e11 instanceof d.C0292d) {
            g11.s(-231225785);
            com.withings.notifications.ui.e.d((d.C0292d) e11, z5, null, g11, 8, 4);
            g11.J();
        } else if (e11 instanceof d.e) {
            g11.s(-231225683);
            p(scope, (d.e) e11, z5, g11, 64);
            g11.J();
        } else if (e11 instanceof d.f) {
            g11.s(-231225596);
            q(scope, (d.f) e11, z5, g11, 64);
            g11.J();
        } else if (e11 instanceof d.g) {
            g11.s(-231225510);
            b(scope, z5, g11, 0);
            g11.J();
        } else if (e11 instanceof d.h) {
            g11.s(-231225444);
            r(scope, z5, (d.h) e11, g11, 512);
            g11.J();
        } else if (e11 instanceof d.i) {
            g11.s(-231225359);
            e(scope, ((d.i) e11).b(), z5, g11, 0);
            g11.J();
        } else {
            g11.s(-231225291);
            b(scope, z5, g11, 0);
            g11.J();
        }
        androidx.compose.runtime.v o05 = g11.o0();
        if (o05 != null) {
            o05.G(new r(cVar, scope, chosenStyle, i11));
        }
    }

    public static final void k(r0.c cVar, boolean z5, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        kotlin.jvm.internal.u.j(cVar, "<this>");
        androidx.compose.runtime.b g11 = aVar.g(-511440607);
        if ((i11 & 14) == 0) {
            if (g11.K(cVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.a(z5)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            m(cVar, 2131231093, 2131231094, z5, null, g11, (i12 & 14) | ((i12 << 6) & 7168), 8);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new s(cVar, z5, i11));
        }
    }

    public static final void l(r0.c cVar, d.c data, androidx.compose.runtime.a aVar, int i11) {
        String str;
        String b10;
        kotlin.jvm.internal.u.j(cVar, "<this>");
        kotlin.jvm.internal.u.j(data, "data");
        androidx.compose.runtime.b g11 = aVar.g(-352213726);
        androidx.compose.ui.e g12 = cVar.g(androidx.compose.ui.e.f8927a, b.a.e());
        String d11 = data.d();
        String str2 = "?";
        if (d11 == null) {
            d11 = "?";
        }
        String g13 = data.g();
        if (g13 != null) {
            str2 = g13;
        }
        c10.b f11 = data.f();
        if (f11 != null && (b10 = f11.b()) != null) {
            str = ImagesP4.BASE_URL.concat(b10);
        } else {
            str = null;
        }
        com.withings.common.compose.component.c.b(g12, d11, str2, str, null, 0L, 0L, false, null, g11, 0, 496);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new t(cVar, data, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(r0.c r13, int r14, int r15, boolean r16, androidx.compose.ui.e r17, androidx.compose.runtime.a r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.notifications.ui.p.m(r0.c, int, int, boolean, androidx.compose.ui.e, androidx.compose.runtime.a, int, int):void");
    }

    public static final void n(r0.c cVar, g2.c painter, androidx.compose.ui.e eVar, androidx.compose.runtime.a aVar, int i11, int i12) {
        e.a aVar2;
        kotlin.jvm.internal.u.j(cVar, "<this>");
        kotlin.jvm.internal.u.j(painter, "painter");
        androidx.compose.runtime.b g11 = aVar.g(268061147);
        if ((i12 & 2) != 0) {
            aVar2 = androidx.compose.ui.e.f8927a;
        } else {
            aVar2 = eVar;
        }
        n0.z.a(painter, null, cVar.a(androidx.compose.ui.e.f8927a).n(aVar2), null, f.a.a(), 0.0f, null, g11, 24632, 104);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new w(cVar, painter, aVar2, i11, i12));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(r0.c r26, java.lang.String r27, androidx.compose.ui.e r28, ym0.q<? super r0.c, ? super androidx.compose.runtime.a, ? super java.lang.Integer, nm0.y> r29, androidx.compose.runtime.a r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.notifications.ui.p.o(r0.c, java.lang.String, androidx.compose.ui.e, ym0.q, androidx.compose.runtime.a, int, int):void");
    }

    public static final void p(r0.c cVar, d.e data, boolean z5, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(cVar, "<this>");
        kotlin.jvm.internal.u.j(data, "data");
        androidx.compose.runtime.b g11 = aVar.g(-1603930239);
        int b10 = data.b();
        if (b10 == Partner.f43456n.l()) {
            g11.s(-1233881348);
            h(cVar, z5, g11, (i11 & 14) | ((i11 >> 3) & 112));
            g11.J();
        } else if (b10 == Partner.f43457o.l()) {
            g11.s(-1233881256);
            i(cVar, z5, g11, (i11 & 14) | ((i11 >> 3) & 112));
            g11.J();
        } else {
            g11.s(-1233881194);
            b(cVar, z5, g11, (i11 & 14) | ((i11 >> 3) & 112));
            g11.J();
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new y(cVar, data, z5, i11));
        }
    }

    public static final void q(r0.c cVar, d.f data, boolean z5, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(cVar, "<this>");
        kotlin.jvm.internal.u.j(data, "data");
        androidx.compose.runtime.b g11 = aVar.g(-679797574);
        if (data.a() == 0) {
            g11.s(-1708147529);
            c(cVar, z5, g11, (i11 & 14) | ((i11 >> 3) & 112));
            g11.J();
        } else {
            g11.s(-1708147471);
            b(cVar, z5, g11, (i11 & 14) | ((i11 >> 3) & 112));
            g11.J();
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new z(cVar, data, z5, i11));
        }
    }

    public static final void r(r0.c cVar, boolean z5, d.h data, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(cVar, "<this>");
        kotlin.jvm.internal.u.j(data, "data");
        androidx.compose.runtime.b g11 = aVar.g(524562678);
        o(cVar, data.g(), null, s1.b.b(g11, -2025057662, new a0(z5)), g11, (i11 & 14) | 3072, 2);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b0(cVar, z5, data, i11));
        }
    }

    public static final void s(r0.c cVar, boolean z5, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        androidx.compose.ui.e b10;
        int i13;
        int i14;
        kotlin.jvm.internal.u.j(cVar, "<this>");
        androidx.compose.runtime.b g11 = aVar.g(-1531991566);
        if ((i11 & 14) == 0) {
            if (g11.K(cVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.a(z5)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) != 18 || !g11.h()) {
            b10 = androidx.compose.foundation.c.b(androidx.compose.ui.e.f8927a, f42984a, h1.a());
            d(cVar, b10, s1.b.b(g11, -754390335, new c0(z5)), g11, (i12 & 14) | 432, 0);
        } else {
            g11.C();
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d0(cVar, z5, i11));
        }
    }

    private static final com.withings.notifications.ui.n v(androidx.compose.runtime.a aVar) {
        aVar.s(-848120457);
        Context applicationContext = ((Context) aVar.D(androidx.compose.ui.platform.u0.d())).getApplicationContext();
        kotlin.jvm.internal.u.i(applicationContext, "getApplicationContext(...)");
        com.withings.notifications.ui.n nVar = (com.withings.notifications.ui.n) ah.o.c(applicationContext, com.withings.notifications.ui.n.class);
        aVar.J();
        return nVar;
    }

    private static final String w(String str, androidx.compose.runtime.a aVar) {
        aVar.s(1299704777);
        Context context = (Context) aVar.D(androidx.compose.ui.platform.u0.d());
        z2.c c11 = z2.f.a().a().c();
        aVar.s(1784038575);
        boolean K = aVar.K(c11) | aVar.K(str);
        Object t11 = aVar.t();
        if (K || t11 == a.C0060a.a()) {
            t11 = androidx.core.text.b.b(wq.a.i(context, str)).toString();
            aVar.n(t11);
        }
        String str2 = (String) t11;
        aVar.J();
        aVar.J();
        return str2;
    }

    public static final NotificationStyle x(c10.c<?> cVar) {
        kotlin.jvm.internal.u.j(cVar, "<this>");
        if (!cVar.l() && cVar.f().contains(ConstantsWs.APP_SECTION_WARNINGS)) {
            return NotificationStyle.f42819a;
        }
        return NotificationStyle.f42820b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0193, code lost:
        if (r5 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (r5 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
        r2 = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String y(c10.c r5, androidx.compose.runtime.a r6) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.notifications.ui.p.y(c10.c, androidx.compose.runtime.a):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x011f, code lost:
        if (r4 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (r4 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
        r2 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String z(c10.c r4, androidx.compose.runtime.a r5) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.notifications.ui.p.z(c10.c, androidx.compose.runtime.a):java.lang.String");
    }
}
