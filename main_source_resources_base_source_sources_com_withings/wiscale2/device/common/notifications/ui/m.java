package com.withings.wiscale2.device.common.notifications.ui;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material3.a9;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n1;
import com.withings.comm.wpp.generated.object.AncsStatus;
import com.withings.common.compose.component.v4;
import com.withings.common.device.DeviceSettingsActivity;
import com.withings.device.Device;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.feature.afib.AfibSettingsActivity;
import com.withings.wiscale2.device.common.feature.highlowhr.HighLowHRSettingsActivity;
import com.withings.wiscale2.device.common.feature.irregularHeartBeat.IrregularHeartBeatSettingsActivity;
import com.withings.wiscale2.device.common.notifications.ui.l1;
import com.withings.wiscale2.notification.NotificationPermissionActivity;
import i6.a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
/* compiled from: DeviceNotificationSettingsFragment.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0011²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000e\u001a\u0004\u0018\u00010\r8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/notifications/ui/m;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "Lcom/withings/wiscale2/device/common/notifications/ui/l1;", "screenState", "", "", "defaultAppEnabled", "", "androidAppEnabled", "Lcom/withings/wiscale2/device/common/notifications/ui/k1;", "permissionsNeededInfo", "", "needAppPermission", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class m extends j1 {
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public s20.b f52949h;
    @Inject

    /* renamed from: i  reason: collision with root package name */
    public m70.i f52950i;
    @Inject

    /* renamed from: j  reason: collision with root package name */
    public kn.e f52951j;
    @Inject

    /* renamed from: k  reason: collision with root package name */
    public PlatformFeatureRepository f52952k;
    @Inject

    /* renamed from: l  reason: collision with root package name */
    public fl.i f52953l;
    @Inject

    /* renamed from: m  reason: collision with root package name */
    public u60.a f52954m;

    /* renamed from: n  reason: collision with root package name */
    private a f52955n;

    /* renamed from: o  reason: collision with root package name */
    private final nm0.g f52956o = nm0.h.b(new d());

    /* renamed from: p  reason: collision with root package name */
    private final nm0.g f52957p = nm0.h.b(new g());

    /* renamed from: q  reason: collision with root package name */
    private final f f52958q = new f(this);

    /* renamed from: r  reason: collision with root package name */
    private final nm0.g f52959r = nm0.h.b(new c());

    /* renamed from: t  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f52948t = {androidx.camera.core.v.c(m.class, "device", "getDevice()Lcom/withings/device/Device;", 0)};

    /* renamed from: s  reason: collision with root package name */
    public static final b f52947s = new Object();

    /* compiled from: DeviceNotificationSettingsFragment.kt */
    /* loaded from: classes5.dex */
    public interface a {
        void C1(AncsStatus ancsStatus);

        void s1(m mVar);

        void x();
    }

    /* compiled from: DeviceNotificationSettingsFragment.kt */
    /* loaded from: classes5.dex */
    public static final class b {
    }

    /* compiled from: DeviceNotificationSettingsFragment.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<gb0.c> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final gb0.c invoke() {
            m mVar = m.this;
            Context requireContext = mVar.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            s20.b bVar = mVar.f52949h;
            if (bVar != null) {
                return new gb0.c(requireContext, bVar);
            }
            kotlin.jvm.internal.u.s("getPopularAppsPrefUseCase");
            throw null;
        }
    }

    /* compiled from: DeviceNotificationSettingsFragment.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<Boolean> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            Bundle arguments = m.this.getArguments();
            boolean z5 = false;
            if (arguments != null) {
                z5 = arguments.getBoolean("from_install", false);
            }
            return Boolean.valueOf(z5);
        }
    }

    /* compiled from: DeviceNotificationSettingsFragment.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        e() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            i6.a aVar2;
            androidx.compose.runtime.a aVar3 = aVar;
            if ((num.intValue() & 11) == 2 && aVar3.h()) {
                aVar3.C();
            } else {
                m mVar = m.this;
                Application application = mVar.requireActivity().getApplication();
                kotlin.jvm.internal.u.i(application, "getApplication(...)");
                User E1 = m.E1(mVar);
                kotlin.jvm.internal.u.i(E1, "access$getUser(...)");
                Device H1 = mVar.H1();
                gb0.c B1 = m.B1(mVar);
                PlatformFeatureRepository platformFeatureRepository = mVar.f52952k;
                if (platformFeatureRepository != null) {
                    kn.e eVar = mVar.f52951j;
                    if (eVar != null) {
                        fl.i iVar = mVar.f52953l;
                        if (iVar != null) {
                            u60.a aVar4 = mVar.f52954m;
                            if (aVar4 != null) {
                                g1 g1Var = new g1(application, E1, H1, B1, platformFeatureRepository, eVar, iVar, aVar4);
                                aVar3.s(1729797275);
                                n1 a11 = j6.a.a(aVar3);
                                if (a11 != null) {
                                    if (a11 instanceof androidx.lifecycle.u) {
                                        aVar2 = ((androidx.lifecycle.u) a11).getDefaultViewModelCreationExtras();
                                    } else {
                                        aVar2 = a.C1058a.f71431b;
                                    }
                                    androidx.lifecycle.g1 a12 = j6.b.a(f1.class, a11, null, g1Var, aVar2, aVar3);
                                    aVar3.J();
                                    f1 f1Var = (f1) a12;
                                    k1.y.f("start", new p0(f1Var, null), aVar3);
                                    k1.r0 a13 = androidx.compose.runtime.l0.a(f1Var.V0(), l1.b.f52946a, null, aVar3, 2);
                                    Flow<List<Short>> R0 = f1Var.R0();
                                    kotlin.collections.i0 i0Var = kotlin.collections.i0.f76187a;
                                    k1.r0 a14 = androidx.compose.runtime.l0.a(R0, i0Var, null, aVar3, 2);
                                    k1.r0 a15 = androidx.compose.runtime.l0.a(f1Var.O0(), i0Var, null, aVar3, 2);
                                    m.z1(mVar, f1Var, aVar3, 72);
                                    m.y1(mVar, f1Var, aVar3, 72);
                                    yk.o.b(false, s1.b.b(aVar3, -1307636147, new r0(m.this, f1Var, a13, a14, a15)), aVar3, 48, 1);
                                } else {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                                }
                            } else {
                                kotlin.jvm.internal.u.s("featureActivationUseCase");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.u.s("deviceModelRepository");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.u.s("deviceManager");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.u.s("platformFeatureRepository");
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class f implements bn0.d<Fragment, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f52963a = nm0.h.b(new s0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f52964b;

        public f(Fragment fragment) {
            this.f52964b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f52963a.getValue();
        }
    }

    /* compiled from: DeviceNotificationSettingsFragment.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<User> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final User invoke() {
            m70.i iVar = m.this.f52950i;
            if (iVar != null) {
                return iVar.e();
            }
            kotlin.jvm.internal.u.s("userManager");
            throw null;
        }
    }

    public static final void A1(m mVar, f1 f1Var, l1.a aVar, List list, List list2, androidx.compose.runtime.a aVar2, int i11) {
        mVar.getClass();
        androidx.compose.runtime.b g11 = aVar2.g(1966443737);
        s0.a.a(null, null, null, false, null, null, null, false, new n0(mVar, f1Var, aVar, list, list2), g11, 0, 255);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new o0(mVar, f1Var, aVar, list, list2, i11));
        }
    }

    public static final gb0.c B1(m mVar) {
        return (gb0.c) mVar.f52959r.getValue();
    }

    public static final User E1(m mVar) {
        return (User) mVar.f52957p.getValue();
    }

    public static final void F1(m mVar, h1 h1Var) {
        Intent intent;
        a aVar = mVar.f52955n;
        if (aVar != null) {
            aVar.x();
        }
        if (h1Var.a()) {
            int i11 = AfibSettingsActivity.f50991j;
            Context requireContext = mVar.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            intent = AfibSettingsActivity.a.a(requireContext, mVar.H1());
        } else if (h1Var.c()) {
            int i12 = IrregularHeartBeatSettingsActivity.f52345i;
            Context requireContext2 = mVar.requireContext();
            kotlin.jvm.internal.u.i(requireContext2, "requireContext(...)");
            intent = IrregularHeartBeatSettingsActivity.a.a(requireContext2, mVar.H1());
        } else {
            intent = null;
        }
        if (intent != null) {
            DeviceSettingsActivity.c cVar = DeviceSettingsActivity.f35012e;
            Context requireContext3 = mVar.requireContext();
            kotlin.jvm.internal.u.i(requireContext3, "requireContext(...)");
            Device H1 = mVar.H1();
            cVar.getClass();
            mVar.startActivity(DeviceSettingsActivity.c.c(requireContext3, H1, intent));
        }
    }

    public static final void G1(m mVar) {
        a aVar = mVar.f52955n;
        if (aVar != null) {
            aVar.x();
        }
        HighLowHRSettingsActivity.a aVar2 = HighLowHRSettingsActivity.f52195k;
        Context requireContext = mVar.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        Device H1 = mVar.H1();
        User user = (User) mVar.f52957p.getValue();
        kotlin.jvm.internal.u.i(user, "<get-user>(...)");
        aVar2.getClass();
        mVar.startActivity(HighLowHRSettingsActivity.a.a(requireContext, H1, user));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Device H1() {
        return (Device) this.f52958q.getValue(this, f52948t[0]);
    }

    public static final void s1(m mVar, boolean z5, com.withings.wiscale2.device.common.notifications.ui.a aVar, List list, boolean z11, ym0.l lVar, androidx.compose.runtime.a aVar2, int i11) {
        mVar.getClass();
        androidx.compose.runtime.b g11 = aVar2.g(-1832535868);
        com.withings.common.compose.component.o.l(androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), list.contains(aVar.c()), lVar, s1.b.b(g11, -978560144, new com.withings.wiscale2.device.common.notifications.ui.g(aVar)), aVar.a(), null, false, z11, z5, null, g11, ((i11 >> 6) & ConstantsWs.HWFAILURE_ZERO) | 3072 | ((i11 << 12) & 29360128) | ((i11 << 24) & 234881024), 608);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new h(mVar, z5, aVar, list, z11, lVar, i11));
        }
    }

    public static final void t1(m mVar, ym0.l lVar, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        mVar.getClass();
        androidx.compose.runtime.b g11 = aVar.g(1414738147);
        if ((i11 & 14) == 0) {
            if (g11.w(lVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && g11.h()) {
            g11.C();
        } else {
            a9.a(null, null, 0L, 0L, 0.0f, 0.0f, null, s1.b.b(g11, 1877590270, new k(lVar)), g11, 12582912, 127);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new l(mVar, lVar, i11));
        }
    }

    public static final void u1(m mVar, boolean z5, com.withings.wiscale2.device.common.notifications.ui.b bVar, List list, boolean z11, ym0.l lVar, androidx.compose.runtime.a aVar, int i11) {
        mVar.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-2008218675);
        com.withings.common.compose.component.o.l(androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), list.contains(Short.valueOf(Short.parseShort(bVar.a()))), lVar, null, bVar.b(), null, z11, false, z5, null, g11, ((i11 >> 6) & ConstantsWs.HWFAILURE_ZERO) | ((i11 << 9) & 3670016) | ((i11 << 24) & 234881024), 680);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new n(mVar, z5, bVar, list, z11, lVar, i11));
        }
    }

    public static final void v1(m mVar, boolean z5, ym0.l lVar, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        androidx.compose.runtime.b bVar;
        int i13;
        int i14;
        mVar.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-2106226762);
        if ((i11 & 14) == 0) {
            if (g11.a(z5)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(lVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
            bVar = g11;
        } else {
            int i15 = i12 << 3;
            bVar = g11;
            com.withings.common.compose.component.o.l(androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), z5, lVar, null, ay.b.u(C1987R.string._HWA03_ENABLE_NOTIFICATION_TITLE_, g11), ay.b.u(C1987R.string._HWA03_ENABLE_NOTIFICATION_DETAIL_, g11), false, false, false, null, g11, (i15 & 112) | (i15 & ConstantsWs.HWFAILURE_ZERO), 968);
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new o(mVar, z5, lVar, i11));
        }
    }

    public static final void w1(m mVar, h1 h1Var, androidx.compose.runtime.a aVar, int i11) {
        boolean z5;
        e.a aVar2;
        int i12;
        mVar.getClass();
        androidx.compose.runtime.b g11 = aVar.g(1093442215);
        g11.s(-483455358);
        e.a aVar3 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.layout.l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a11 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(aVar3);
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
            c11.invoke(k1.j1.a(g11), g11, 0);
            g11.s(2058660585);
            v4.d(androidx.compose.foundation.layout.x0.h(aVar3, 0.0f, yk.h.q(), 1), ay.b.u(C1987R.string.notifications_health_title, g11), ay.b.u(C1987R.string.notifications_health_description, g11), 0.0f, 0.0f, 0, 0, g11, 0, 120);
            if (!h1Var.a() && !h1Var.c()) {
                z5 = false;
            } else {
                z5 = true;
            }
            g11.s(-1053779956);
            if (z5) {
                androidx.compose.ui.e h11 = androidx.compose.foundation.layout.x0.h(aVar3, yk.h.o(), 0.0f, 2);
                if (h1Var.a()) {
                    i12 = C1987R.string.heartEvents_afib_title;
                } else {
                    i12 = C1987R.string.heartEvents_nonMedical_title;
                }
                aVar2 = aVar3;
                com.withings.common.compose.component.o.g(h11, null, null, ay.b.u(i12, g11), null, false, false, true, null, null, new p(mVar, h1Var), g11, 12582912, 0, 886);
            } else {
                aVar2 = aVar3;
            }
            g11.J();
            g11.s(-1053779373);
            if (h1Var.b()) {
                com.withings.common.compose.component.o.g(androidx.compose.foundation.layout.x0.h(aVar2, yk.h.o(), 0.0f, 2), null, null, ay.b.u(C1987R.string.highLowHeartRate_title, g11), null, z5, false, true, null, null, new q(mVar), g11, 12582912, 0, 854);
            }
            g11.J();
            com.withings.common.compose.component.v0.a(g11, 0);
            g11.J();
            g11.o();
            g11.J();
            g11.J();
            androidx.compose.runtime.v o02 = g11.o0();
            if (o02 != null) {
                o02.G(new r(mVar, h1Var, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    public static final void x1(m mVar, androidx.compose.runtime.a aVar, int i11) {
        mVar.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-1257773272);
        if (((Boolean) mVar.f52956o.getValue()).booleanValue()) {
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            r0.d0.a(androidx.compose.foundation.layout.e1.f(aVar2, yk.h.q()), g11);
            com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string._WTI_NEXT_, g11), null, false, null, null, false, new s(mVar), g11, 0, 125);
            r0.d0.a(androidx.compose.foundation.layout.e1.f(aVar2, yk.h.q()), g11);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new t(mVar, i11));
        }
    }

    public static final void y1(m mVar, f1 f1Var, androidx.compose.runtime.a aVar, int i11) {
        mVar.getClass();
        androidx.compose.runtime.b g11 = aVar.g(1953639659);
        k1.r0 a11 = androidx.compose.runtime.l0.a(f1Var.U0(), null, null, g11, 2);
        e.n a12 = e.d.a(new g.a(), new v(f1Var, mVar, a11), g11, 8);
        k1 k1Var = (k1) a11.getValue();
        if (k1Var != null) {
            a12.a(k1Var.b().toArray(new String[0]));
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new u(mVar, f1Var, i11));
        }
    }

    public static final void z1(m mVar, f1 f1Var, androidx.compose.runtime.a aVar, int i11) {
        mVar.getClass();
        androidx.compose.runtime.b g11 = aVar.g(1630267015);
        k1.r0 a11 = androidx.compose.runtime.l0.a(f1Var.T0(), Boolean.FALSE, null, g11, 2);
        e.n a12 = e.d.a(new g.a(), new x(f1Var), g11, 8);
        if (((Boolean) a11.getValue()).booleanValue()) {
            int i12 = NotificationPermissionActivity.f58729d;
            a12.a(NotificationPermissionActivity.a.a((Context) g11.D(androidx.compose.ui.platform.u0.d())));
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new w(mVar, f1Var, i11));
        }
    }

    @Override // com.withings.wiscale2.device.common.notifications.ui.j1, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        super.onAttach(context);
        this.f52955n = (a) context;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.u.j(inflater, "inflater");
        Context requireContext = requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6, 0);
        composeView.setContent(new s1.a(true, -521931225, new e()));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f52955n = null;
        super.onDetach();
    }
}
