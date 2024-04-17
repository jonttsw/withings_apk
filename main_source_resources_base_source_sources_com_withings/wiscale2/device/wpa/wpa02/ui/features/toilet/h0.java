package com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet;

import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
/* compiled from: ToiletNavigation.kt */
/* loaded from: classes5.dex */
public final class h0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToiletNavigation.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r8.n f55385a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f55386b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Device f55387c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55388d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r8.n nVar, Device device, k kVar, ym0.a aVar) {
            super(1);
            this.f55385a = nVar;
            this.f55386b = kVar;
            this.f55387c = device;
            this.f55388d = aVar;
        }

        @Override // ym0.l
        public final nm0.y invoke(r8.m mVar) {
            r8.m NavHost = mVar;
            kotlin.jvm.internal.u.j(NavHost, "$this$NavHost");
            r8.n nVar = this.f55385a;
            androidx.navigation.compose.n.b(NavHost, "SelectArmSize", null, null, null, null, null, null, new s1.a(true, 1294833476, new u(nVar)), 126);
            androidx.navigation.compose.n.b(NavHost, "large_toilet_arms_size", null, null, null, null, null, null, new s1.a(true, 1908698669, new x(nVar)), 126);
            androidx.navigation.compose.n.b(NavHost, "medium_toilet_arms_size", null, null, null, null, null, null, new s1.a(true, 573324940, new a0(nVar)), 126);
            androidx.navigation.compose.n.b(NavHost, "toilet_attach", null, null, null, null, null, null, new s1.a(true, -762048789, new d0(nVar)), 126);
            androidx.navigation.compose.n.b(NavHost, "toilet_end", null, null, null, null, null, null, new s1.a(true, -2097422518, new g0(nVar, this.f55387c, this.f55386b, this.f55388d)), 126);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToiletNavigation.kt */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r8.n f55389a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f55390b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Device f55391c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55392d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f55393e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(r8.n nVar, k kVar, Device device, ym0.a<nm0.y> aVar, int i11) {
            super(2);
            this.f55389a = nVar;
            this.f55390b = kVar;
            this.f55391c = device;
            this.f55392d = aVar;
            this.f55393e = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f55393e | 1);
            Device device = this.f55391c;
            ym0.a<nm0.y> aVar2 = this.f55392d;
            h0.a(this.f55389a, this.f55390b, device, aVar2, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public static final void a(r8.n navController, k toiletDeviceViewModel, Device device, ym0.a<nm0.y> finish, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(navController, "navController");
        kotlin.jvm.internal.u.j(toiletDeviceViewModel, "toiletDeviceViewModel");
        kotlin.jvm.internal.u.j(device, "device");
        kotlin.jvm.internal.u.j(finish, "finish");
        androidx.compose.runtime.b g11 = aVar.g(1914780262);
        androidx.navigation.compose.s.b(navController, "SelectArmSize", null, null, null, null, null, null, null, new a(navController, device, toiletDeviceViewModel, finish), g11, 56, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(navController, toiletDeviceViewModel, device, finish, i11));
        }
    }
}
