package com.withings.device.details;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.h6;
import androidx.compose.material.w7;
import androidx.compose.material3.f8;
import androidx.compose.material3.g8;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.withings.common.compose.component.ColorStyle;
import com.withings.common.compose.component.d3;
import com.withings.common.compose.component.input.InputFieldType;
import com.withings.common.device.HelpCenterWebActivity;
import com.withings.common.device.reporting.InstallStateReporter;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.device.Device;
import com.withings.device.DevicePictures;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import gl.g0;
import java.util.ArrayList;
import javax.inject.Inject;
import k1.j1;
import k1.r0;
import k1.v0;
import kotlin.Metadata;
import kotlin.collections.s0;
/* compiled from: DeviceDetailFragment.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/withings/device/details/h;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "dissociateInProgress", "isDissociateDisabled", "nameDialog", "", "input", "", "id", "device-details-common_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public abstract class h extends d0 {

    /* renamed from: o  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f36821o = {androidx.camera.core.v.c(h.class, "device", "getDevice()Lcom/withings/device/Device;", 0)};

    /* renamed from: h  reason: collision with root package name */
    private nn.c f36822h;

    /* renamed from: i  reason: collision with root package name */
    private final i f36823i = new i(this);

    /* renamed from: j  reason: collision with root package name */
    private final fl.p f36824j = fl.p.f67672b.a();

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f36825k = nm0.h.b(new C0484h());
    @Inject

    /* renamed from: l  reason: collision with root package name */
    public ch.d f36826l;
    @Inject

    /* renamed from: m  reason: collision with root package name */
    public c0 f36827m;
    @Inject

    /* renamed from: n  reason: collision with root package name */
    public il.a f36828n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceDetailFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Device f36829a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ nn.f f36830b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Device device, nn.f fVar) {
            super(1);
            this.f36829a = device;
            this.f36830b = fVar;
        }

        @Override // ym0.l
        public final nm0.y invoke(String str) {
            String it = str;
            kotlin.jvm.internal.u.j(it, "it");
            Device device = this.f36829a;
            device.setName(it);
            this.f36830b.O0(device);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceDetailFragment.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f36831a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(r0<Boolean> r0Var) {
            super(0);
            this.f36831a = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            fn0.k<Object>[] kVarArr = h.f36821o;
            this.f36831a.setValue(Boolean.FALSE);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceDetailFragment.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f36832a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(r0<Boolean> r0Var) {
            super(0);
            this.f36832a = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            fn0.k<Object>[] kVarArr = h.f36821o;
            this.f36832a.setValue(Boolean.TRUE);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceDetailFragment.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36834b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Device f36835c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ nn.f f36836d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f36837e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Device device, nn.f fVar, int i11) {
            super(2);
            this.f36834b = str;
            this.f36835c = device;
            this.f36836d = fVar;
            this.f36837e = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f36837e | 1);
            Device device = this.f36835c;
            nn.f fVar = this.f36836d;
            h.this.t1(this.f36834b, device, fVar, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceDetailFragment.kt */
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36838a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, nm0.y> f36839b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r0<String> f36840c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(ym0.a<nm0.y> aVar, ym0.l<? super String, nm0.y> lVar, r0<String> r0Var) {
            super(2);
            this.f36838a = aVar;
            this.f36839b = lVar;
            this.f36840c = r0Var;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                InputFieldType inputFieldType = InputFieldType.f33876d;
                String u11 = ay.b.u(C1987R.string._NAME_, aVar2);
                fn0.k<Object>[] kVarArr = h.f36821o;
                r0<String> r0Var = this.f36840c;
                String value = r0Var.getValue();
                aVar2.s(756649855);
                ym0.a<nm0.y> aVar3 = this.f36838a;
                boolean K = aVar2.K(aVar3);
                ym0.l<String, nm0.y> lVar = this.f36839b;
                boolean K2 = K | aVar2.K(lVar);
                Object t11 = aVar2.t();
                if (K2 || t11 == a.C0060a.a()) {
                    t11 = new com.withings.device.details.i(aVar3, lVar, r0Var);
                    aVar2.n(t11);
                }
                ym0.a aVar4 = (ym0.a) t11;
                Object j5 = w7.j(aVar2, 756650011);
                if (j5 == a.C0060a.a()) {
                    j5 = new j(r0Var);
                    aVar2.n(j5);
                }
                aVar2.J();
                fk.q.b(null, inputFieldType, null, u11, value, null, null, null, null, null, null, false, null, null, 7, null, false, aVar4, (ym0.l) j5, aVar2, 48, 100687872, 114661);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceDetailFragment.kt */
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36841a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, nm0.y> f36842b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r0<String> f36843c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(ym0.a<nm0.y> aVar, ym0.l<? super String, nm0.y> lVar, r0<String> r0Var) {
            super(0);
            this.f36841a = aVar;
            this.f36842b = lVar;
            this.f36843c = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f36841a.invoke();
            fn0.k<Object>[] kVarArr = h.f36821o;
            this.f36842b.invoke(this.f36843c.getValue());
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceDetailFragment.kt */
    /* loaded from: classes3.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36845b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, nm0.y> f36846c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f36847d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f36848e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(String str, ym0.l<? super String, nm0.y> lVar, ym0.a<nm0.y> aVar, int i11) {
            super(2);
            this.f36845b = str;
            this.f36846c = lVar;
            this.f36847d = aVar;
            this.f36848e = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f36848e | 1);
            ym0.l<String, nm0.y> lVar = this.f36846c;
            ym0.a<nm0.y> aVar2 = this.f36847d;
            h.this.u1(this.f36845b, lVar, aVar2, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: DeviceDetailFragment.kt */
    /* renamed from: com.withings.device.details.h$h  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0484h extends kotlin.jvm.internal.w implements ym0.a<fl.o> {
        C0484h() {
            super(0);
        }

        @Override // ym0.a
        public final fl.o invoke() {
            h hVar = h.this;
            return hVar.f36824j.g(hVar.A1());
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes3.dex */
    public static final class i implements bn0.d<Fragment, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f36850a = nm0.h.b(new b0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f36851b;

        public i(Fragment fragment) {
            this.f36851b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f36850a.getValue();
        }
    }

    public static final void v1(h hVar, ym0.a aVar, ym0.a aVar2, ym0.a aVar3, androidx.compose.runtime.a aVar4, int i11) {
        boolean z5;
        hVar.getClass();
        androidx.compose.runtime.b g11 = aVar4.g(540164092);
        g11.s(-483455358);
        e.a aVar5 = androidx.compose.ui.e.f8927a;
        l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a11 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(aVar5);
        String str = null;
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a11);
            } else {
                g11.m();
            }
            ym0.p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
            }
            boolean z11 = false;
            c11.invoke(j1.a(g11), g11, 0);
            g11.s(2058660585);
            kn.e c12 = kn.e.c();
            DevicePictures pictures = hVar.A1().getPictures();
            if (pictures != null) {
                str = pictures.getUrl(1);
            }
            androidx.compose.ui.e b12 = androidx.compose.foundation.c.b(x0.g(aVar5, yk.h.o(), yk.h.q()), s2.b.a(C1987R.color.backgroundPrimary, g11), ((f8) g11.D(g8.a())).d());
            Device A1 = hVar.A1();
            Context requireContext = hVar.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            kotlin.jvm.internal.u.g(c12);
            com.withings.common.compose.component.o.g(b12, s1.b.b(g11, -1333337212, new com.withings.device.details.d(str, hVar)), null, m0.t.n(A1, requireContext, hVar.f36824j, c12), null, false, false, false, null, null, null, g11, 48, 0, 2036);
            if (hVar.B1() instanceof g0) {
                Object c13 = androidx.compose.material.o.c(g11, 1178926707, 1178926723);
                if (c13 == a.C0060a.a()) {
                    c13 = androidx.compose.runtime.l0.f(0, androidx.compose.runtime.v0.f8878a);
                    g11.n(c13);
                }
                r0 r0Var = (r0) c13;
                g11.J();
                ArrayList d11 = d3.d(kotlin.collections.x.W(ay.b.u(C1987R.string.deviceTab_dissociate_my_account, g11), ay.b.u(C1987R.string.deviceTab_dissociate_all_other_accounts, g11)));
                Integer num = (Integer) r0Var.getValue();
                g11.s(1178927114);
                Object t11 = g11.t();
                if (t11 == a.C0060a.a()) {
                    t11 = new com.withings.device.details.e(r0Var);
                    g11.n(t11);
                }
                g11.J();
                d3.a(null, d11, num, false, 0L, null, (ym0.l) t11, g11, 1572928, 57);
                String u11 = ay.b.u(C1987R.string.deviceTab_dissociate, g11);
                ColorStyle colorStyle = ColorStyle.f33323b;
                androidx.compose.ui.e f11 = x0.f(aVar5, yk.h.r());
                g11.s(1178927450);
                if ((((i11 & 112) ^ 48) > 32 && g11.K(aVar2)) || (i11 & 48) == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((((i11 & ConstantsWs.HWFAILURE_ZERO) ^ ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) > 256 && g11.K(aVar3)) || (i11 & ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) == 256) {
                    z11 = true;
                }
                boolean z12 = z5 | z11;
                Object t12 = g11.t();
                if (z12 || t12 == a.C0060a.a()) {
                    t12 = new com.withings.device.details.f(r0Var, aVar2, aVar3);
                    g11.n(t12);
                }
                g11.J();
                com.withings.common.compose.component.l.a(f11, u11, null, false, colorStyle, null, false, (ym0.a) t12, g11, 24576, 108);
                g11.J();
            } else {
                g11.s(1178927709);
                com.withings.common.compose.component.l.a(x0.f(aVar5, yk.h.r()), ay.b.u(C1987R.string._DISSOCIATE_PRODUCT_, g11), null, false, ColorStyle.f33323b, null, false, aVar, g11, ((i11 << 21) & 29360128) | 24576, 108);
                g11.J();
            }
            androidx.compose.runtime.v b13 = h6.b(g11);
            if (b13 != null) {
                b13.G(new com.withings.device.details.g(hVar, aVar, aVar2, aVar3, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:3|(12:5|6|7|(1:(2:10|11)(2:26|27))(3:28|29|(2:31|(2:33|34))(2:35|36))|12|(1:14)|15|(1:17)|18|(1:22)|23|24))|39|6|7|(0)(0)|12|(0)|15|(0)|18|(2:20|22)|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
        r3 = nm0.l.a(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:12:0x0029, B:24:0x004d, B:26:0x0051, B:27:0x0054, B:29:0x005a, B:19:0x003a, B:21:0x003e, B:30:0x0067, B:31:0x006c), top: B:40:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:12:0x0029, B:24:0x004d, B:26:0x0051, B:27:0x0054, B:29:0x005a, B:19:0x003a, B:21:0x003e, B:30:0x0067, B:31:0x006c), top: B:40:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w1(com.withings.device.details.h r7, com.withings.device.Device r8, qm0.d r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof com.withings.device.details.k
            if (r0 == 0) goto L16
            r0 = r9
            com.withings.device.details.k r0 = (com.withings.device.details.k) r0
            int r1 = r0.f36859d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f36859d = r1
            goto L1b
        L16:
            com.withings.device.details.k r0 = new com.withings.device.details.k
            r0.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r0.f36857b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f36859d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            com.withings.device.details.h r7 = r0.f36856a
            nm0.l.b(r9)     // Catch: java.lang.Throwable -> L2d
            goto L4d
        L2d:
            r8 = move-exception
            goto L6d
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            nm0.l.b(r9)
            com.withings.device.details.c0 r9 = r7.f36827m     // Catch: java.lang.Throwable -> L2d
            if (r9 == 0) goto L67
            long r5 = r8.getId()     // Catch: java.lang.Throwable -> L2d
            r0.f36856a = r7     // Catch: java.lang.Throwable -> L2d
            r0.f36859d = r4     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r8 = r9.c(r5, r0)     // Catch: java.lang.Throwable -> L2d
            if (r8 != r1) goto L4d
            goto L89
        L4d:
            nn.c r8 = r7.f36822h     // Catch: java.lang.Throwable -> L2d
            if (r8 == 0) goto L54
            r8.U1()     // Catch: java.lang.Throwable -> L2d
        L54:
            android.content.Context r8 = r7.getContext()     // Catch: java.lang.Throwable -> L2d
            if (r8 == 0) goto L71
            r9 = 2132021725(0x7f1411dd, float:1.968185E38)
            android.widget.Toast r8 = android.widget.Toast.makeText(r8, r9, r4)     // Catch: java.lang.Throwable -> L2d
            r8.show()     // Catch: java.lang.Throwable -> L2d
            nm0.y r3 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L2d
            goto L71
        L67:
            java.lang.String r8 = "dissociateDeviceUseCase"
            kotlin.jvm.internal.u.s(r8)     // Catch: java.lang.Throwable -> L2d
            throw r3     // Catch: java.lang.Throwable -> L2d
        L6d:
            nm0.k$a r3 = nm0.l.a(r8)
        L71:
            java.lang.Throwable r8 = nm0.k.b(r3)
            if (r8 == 0) goto L87
            android.content.Context r7 = r7.getContext()
            if (r7 == 0) goto L87
            r8 = 2132021723(0x7f1411db, float:1.9681845E38)
            android.widget.Toast r7 = android.widget.Toast.makeText(r7, r8, r4)
            r7.show()
        L87:
            nm0.y r1 = nm0.y.f85009a
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.device.details.h.w1(com.withings.device.details.h, com.withings.device.Device, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056 A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #1 {all -> 0x002f, blocks: (B:12:0x002b, B:25:0x0052, B:27:0x0056), top: B:42:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y1(com.withings.device.details.h r8, com.withings.device.Device r9, qm0.d r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof com.withings.device.details.z
            if (r0 == 0) goto L16
            r0 = r10
            com.withings.device.details.z r0 = (com.withings.device.details.z) r0
            int r1 = r0.f37364e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f37364e = r1
            goto L1b
        L16:
            com.withings.device.details.z r0 = new com.withings.device.details.z
            r0.<init>(r8, r10)
        L1b:
            java.lang.Object r10 = r0.f37362c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f37364e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            com.withings.device.details.h r8 = r0.f37361b
            com.withings.device.details.h r9 = r0.f37360a
            nm0.l.b(r10)     // Catch: java.lang.Throwable -> L2f
            goto L52
        L2f:
            r8 = move-exception
            goto L67
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            nm0.l.b(r10)
            com.withings.device.details.c0 r10 = r8.f36827m     // Catch: java.lang.Throwable -> L5c
            if (r10 == 0) goto L61
            long r5 = r9.getId()     // Catch: java.lang.Throwable -> L5c
            r0.f37360a = r8     // Catch: java.lang.Throwable -> L5c
            r0.f37361b = r8     // Catch: java.lang.Throwable -> L5c
            r0.f37364e = r4     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r9 = r10.b(r5, r0)     // Catch: java.lang.Throwable -> L5c
            if (r9 != r1) goto L51
            goto L83
        L51:
            r9 = r8
        L52:
            nn.c r8 = r8.f36822h     // Catch: java.lang.Throwable -> L2f
            if (r8 == 0) goto L6b
            r8.U1()     // Catch: java.lang.Throwable -> L2f
            nm0.y r3 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L2f
            goto L6b
        L5c:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L67
        L61:
            java.lang.String r9 = "dissociateDeviceUseCase"
            kotlin.jvm.internal.u.s(r9)     // Catch: java.lang.Throwable -> L5c
            throw r3     // Catch: java.lang.Throwable -> L5c
        L67:
            nm0.k$a r3 = nm0.l.a(r8)
        L6b:
            java.lang.Throwable r8 = nm0.k.b(r3)
            if (r8 == 0) goto L81
            android.content.Context r8 = r9.getContext()
            if (r8 == 0) goto L81
            r9 = 2132021721(0x7f1411d9, float:1.9681841E38)
            android.widget.Toast r8 = android.widget.Toast.makeText(r8, r9, r4)
            r8.show()
        L81:
            nm0.y r1 = nm0.y.f85009a
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.device.details.h.y1(com.withings.device.details.h, com.withings.device.Device, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z1(com.withings.device.details.h r12, qm0.d r13) {
        /*
            r12.getClass()
            boolean r0 = r13 instanceof com.withings.device.details.a0
            if (r0 == 0) goto L16
            r0 = r13
            com.withings.device.details.a0 r0 = (com.withings.device.details.a0) r0
            int r1 = r0.f36659d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f36659d = r1
            goto L1b
        L16:
            com.withings.device.details.a0 r0 = new com.withings.device.details.a0
            r0.<init>(r12, r13)
        L1b:
            java.lang.Object r13 = r0.f36657b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f36659d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            com.withings.device.details.h r12 = r0.f36656a
            nm0.l.b(r13)
            goto L4f
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            nm0.l.b(r13)
            com.withings.device.details.c0 r13 = r12.f36827m
            if (r13 == 0) goto Lb9
            com.withings.device.Device r2 = r12.A1()
            long r5 = r2.getId()
            r0.f36656a = r12
            r0.f36659d = r4
            java.lang.Object r13 = r13.d(r5, r0)
            if (r13 != r1) goto L4f
            goto Lb8
        L4f:
            com.withings.device.details.c0$a r13 = (com.withings.device.details.c0.a) r13
            com.withings.device.details.c0$a$c r0 = com.withings.device.details.c0.a.c.f36762a
            boolean r0 = kotlin.jvm.internal.u.e(r13, r0)
            if (r0 == 0) goto L61
            nn.c r12 = r12.f36822h
            if (r12 == 0) goto Lb6
            r12.U1()
            goto Lb6
        L61:
            com.withings.device.details.c0$a$b r0 = com.withings.device.details.c0.a.b.f36761a
            boolean r0 = kotlin.jvm.internal.u.e(r13, r0)
            if (r0 == 0) goto La2
            android.content.Context r13 = r12.getContext()
            if (r13 == 0) goto L9a
            ch.d r0 = r12.f36826l
            if (r0 == 0) goto L94
            ch.l r5 = r0.t()
            r0 = 2132021748(0x7f1411f4, float:1.9681896E38)
            java.lang.String r9 = r13.getString(r0)
            java.lang.String r0 = "getString(...)"
            kotlin.jvm.internal.u.i(r9, r0)
            com.withings.core.webcontent.HMWebViewDelegate r10 = new com.withings.core.webcontent.HMWebViewDelegate
            r10.<init>()
            r8 = 0
            r11 = 6
            r7 = 0
            r6 = r13
            android.content.Intent r0 = ch.l.a(r5, r6, r7, r8, r9, r10, r11)
            r13.startActivity(r0)
            goto L9a
        L94:
            java.lang.String r12 = "intentBuilder"
            kotlin.jvm.internal.u.s(r12)
            throw r3
        L9a:
            nn.c r12 = r12.f36822h
            if (r12 == 0) goto Lb6
            r12.U1()
            goto Lb6
        La2:
            boolean r13 = r13 instanceof com.withings.device.details.c0.a.C0483a
            if (r13 == 0) goto Lb6
            android.content.Context r12 = r12.getContext()
            if (r12 == 0) goto Lb6
            r13 = 2132021721(0x7f1411d9, float:1.9681841E38)
            android.widget.Toast r12 = android.widget.Toast.makeText(r12, r13, r4)
            r12.show()
        Lb6:
            nm0.y r1 = nm0.y.f85009a
        Lb8:
            return r1
        Lb9:
            java.lang.String r12 = "dissociateDeviceUseCase"
            kotlin.jvm.internal.u.s(r12)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.device.details.h.z1(com.withings.device.details.h, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Device A1() {
        return (Device) this.f36823i.getValue(this, f36821o[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final fl.o B1() {
        return (fl.o) this.f36825k.getValue();
    }

    public abstract boolean C1();

    public boolean D1() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void E1() {
        if (B1() instanceof gl.f) {
            fl.o B1 = B1();
            kotlin.jvm.internal.u.h(B1, "null cannot be cast to non-null type com.withings.common.device.model.capabilities.DeviceModelWithInAppUpgrade");
            Setup U = ((gl.f) B1).U(A1());
            cj.d b10 = jl.a.b(A1());
            int i11 = v70.a.f103433b;
            v70.a.e("device_settings_look_for_update", "device_settings_look_for_update", s0.i(new nm0.j("device_model", Integer.valueOf(B1().a()))), false, 8);
            startActivity(SetupActivity.P3(getContext(), U, b10, new InstallStateReporter(false)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void F1() {
        String string;
        int E = B1().E(A1().getColor());
        if (E > 0) {
            if (D1()) {
                String color = A1().getColor();
                if (color == null || (string = w6.o.a(getString(E), "?color=", color)) == null) {
                    string = getString(E);
                    kotlin.jvm.internal.u.i(string, "getString(...)");
                }
            } else {
                string = getString(E);
                kotlin.jvm.internal.u.i(string, "getString(...)");
            }
            HMWebActivity.a aVar = HMWebActivity.f35395c;
            Context requireContext = requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            Intent c11 = aVar.c(requireContext, getString(B1().I(A1().getColor())), string);
            c11.setClass(requireContext(), HelpCenterWebActivity.class);
            Context requireContext2 = requireContext();
            kotlin.jvm.internal.u.i(requireContext2, "requireContext(...)");
            if (wq.b.a(requireContext2, c11)) {
                startActivity(c11);
            }
        }
    }

    @Override // com.withings.device.details.d0, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        super.onAttach(context);
        this.f36822h = (nn.c) context;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.u.j(inflater, "inflater");
        Context requireContext = requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6, 0);
        composeView.setContent(new s1.a(true, -1976882072, new y(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f36822h = null;
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void s1(r0.h hVar, androidx.compose.runtime.a aVar, int i11);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t1(String deviceName, Device updatedDevice, nn.f viewModel, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(deviceName, "deviceName");
        kotlin.jvm.internal.u.j(updatedDevice, "updatedDevice");
        kotlin.jvm.internal.u.j(viewModel, "viewModel");
        androidx.compose.runtime.b g11 = aVar.g(989056801);
        g11.s(48142273);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
            g11.n(t11);
        }
        r0 r0Var = (r0) t11;
        g11.J();
        g11.s(48142316);
        if (((Boolean) r0Var.getValue()).booleanValue()) {
            a aVar2 = new a(updatedDevice, viewModel);
            g11.s(48142575);
            Object t12 = g11.t();
            if (t12 == a.C0060a.a()) {
                t12 = new b(r0Var);
                g11.n(t12);
            }
            g11.J();
            u1(deviceName, aVar2, (ym0.a) t12, g11, (i11 & 14) | 4480);
        }
        g11.J();
        androidx.compose.ui.e h11 = x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2);
        String u11 = ay.b.u(C1987R.string._NAME_, g11);
        g11.s(48142833);
        Object t13 = g11.t();
        if (t13 == a.C0060a.a()) {
            t13 = new c(r0Var);
            g11.n(t13);
        }
        g11.J();
        com.withings.common.compose.component.o.o(h11, null, u11, null, deviceName, false, false, false, null, null, null, (ym0.a) t13, null, g11, (i11 << 12) & 57344, 48, 6122);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d(deviceName, updatedDevice, viewModel, i11));
        }
    }

    public final void u1(String text, ym0.l<? super String, nm0.y> onValueChange, ym0.a<nm0.y> onDismiss, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        boolean z5;
        androidx.compose.runtime.b bVar;
        int i13;
        int i14;
        int i15;
        kotlin.jvm.internal.u.j(text, "text");
        kotlin.jvm.internal.u.j(onValueChange, "onValueChange");
        kotlin.jvm.internal.u.j(onDismiss, "onDismiss");
        androidx.compose.runtime.b g11 = aVar.g(273426279);
        if ((i11 & 14) == 0) {
            if (g11.K(text)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onValueChange)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(onDismiss)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && g11.h()) {
            g11.C();
            bVar = g11;
        } else {
            g11.s(-1469304352);
            Object t11 = g11.t();
            if (t11 == a.C0060a.a()) {
                t11 = androidx.compose.runtime.l0.f(text, androidx.compose.runtime.v0.f8878a);
                g11.n(t11);
            }
            r0 r0Var = (r0) t11;
            g11.J();
            s1.a b10 = s1.b.b(g11, 192683643, new e(onDismiss, onValueChange, r0Var));
            String u11 = ay.b.u(17039370, g11);
            g11.s(-1469303668);
            boolean z11 = true;
            if ((i12 & ConstantsWs.HWFAILURE_ZERO) == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((i12 & 112) != 32) {
                z11 = false;
            }
            boolean z12 = z5 | z11;
            Object t12 = g11.t();
            if (z12 || t12 == a.C0060a.a()) {
                t12 = new f(onDismiss, onValueChange, r0Var);
                g11.n(t12);
            }
            g11.J();
            bVar = g11;
            wk.p.b(onDismiss, null, b10, u11, 0L, (ym0.a) t12, ay.b.u(C1987R.string._CANCEL_, g11), 0L, onDismiss, g11, ((i12 >> 6) & 14) | ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED | ((i12 << 18) & 234881024), ConstantsWs.MEASURE_TYPE_VIRUS_SARS_COV_2);
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new g(text, onValueChange, onDismiss, i11));
        }
    }
}
