package com.withings.device.details.wsm;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.a;
import androidx.compose.runtime.v;
import androidx.compose.ui.platform.l1;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.platform.u0;
import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import androidx.lifecycle.j0;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.common.compose.component.y3;
import com.withings.device.Device;
import com.withings.device.details.wsm.SoundSensorActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import i6.a;
import k1.o1;
import k1.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import org.joda.time.DateTime;
import ym0.q;
/* compiled from: Wsm02DetailFragment.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001¨\u0006\n²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\t\u001a\u0004\u0018\u00010\b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/device/details/wsm/i;", "Lcom/withings/device/details/h;", "Lnn/l;", "reInstallData", "", "isApneaEligible", "isMicMuted", "isSensitivityIncreased", "Lnn/k;", "localizeButtonData", "device-details-wsm_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class i extends com.withings.device.details.h {

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ int f37323r = 0;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f37324p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f37325q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wsm02DetailFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a extends w implements q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao.k f37326a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f37327b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DateTime f37328c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f37329d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ao.k kVar, i iVar, DateTime dateTime, boolean z5) {
            super(3);
            this.f37326a = kVar;
            this.f37327b = iVar;
            this.f37328c = dateTime;
            this.f37329d = z5;
        }

        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            i iVar;
            androidx.compose.runtime.a aVar2;
            r0.h SectionCardColumn = hVar;
            androidx.compose.runtime.a aVar3 = aVar;
            int intValue = num.intValue();
            u.j(SectionCardColumn, "$this$SectionCardColumn");
            if ((intValue & 81) == 16 && aVar3.h()) {
                aVar3.C();
            } else {
                aVar3.s(-1492072690);
                boolean booleanValue = ((Boolean) t1.d.b(this.f37326a.g0(), Boolean.FALSE, aVar3).getValue()).booleanValue();
                i iVar2 = this.f37327b;
                if (booleanValue) {
                    androidx.compose.ui.e a11 = nn.d.a();
                    String u11 = ay.b.u(C1987R.string._CHECK_FOR_UPDATE_, aVar3);
                    aVar3.s(-1492072417);
                    boolean K = aVar3.K(iVar2);
                    Object t11 = aVar3.t();
                    if (K || t11 == a.C0060a.a()) {
                        t11 = new com.withings.device.details.wsm.d(iVar2);
                        aVar3.n(t11);
                    }
                    aVar3.J();
                    iVar = iVar2;
                    aVar2 = aVar3;
                    com.withings.common.compose.component.o.g(a11, null, null, u11, null, false, false, false, null, null, (ym0.a) t11, aVar3, 0, 0, 1014);
                } else {
                    iVar = iVar2;
                    aVar2 = aVar3;
                }
                aVar2.J();
                androidx.compose.runtime.a aVar4 = aVar2;
                Context context = (Context) aVar4.D(u0.d());
                i iVar3 = iVar;
                com.withings.common.compose.component.o.o(nn.d.a(), null, ay.b.u(C1987R.string._SL_SERIAL_, aVar4), null, null, true, false, false, null, null, null, new com.withings.device.details.wsm.e((l1) aVar4.D(n1.d()), iVar3), s1.b.b(aVar4, 1346780875, new com.withings.device.details.wsm.f(iVar3)), aVar4, 196608, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, CommonConstant.RETCODE.CLEAR_ACCESSTOKEN_FAIL_NOT_MATCH);
                com.withings.common.compose.component.o.o(nn.d.a(), null, ay.b.u(C1987R.string._SL_FIRMWARE_, aVar4), null, String.valueOf(iVar.A1().getFirmware()), true, false, false, null, null, null, null, null, aVar4, 196608, 0, 8138);
                androidx.compose.ui.e a12 = nn.d.a();
                String u12 = ay.b.u(C1987R.string.ANDROID_LAST_SYNCHRONIZATION, aVar4);
                DateTime lastUpdate = this.f37328c;
                u.i(lastUpdate, "$lastUpdate");
                com.withings.common.compose.component.o.o(a12, null, u12, null, b50.b.l((Context) aVar4.D(u0.d()), lastUpdate), true, false, false, null, null, null, null, null, aVar4, 196608, 0, 8138);
                if (this.f37329d) {
                    androidx.compose.runtime.a aVar5 = aVar2;
                    i iVar4 = iVar;
                    com.withings.common.compose.component.o.g(nn.d.a(), null, null, ay.b.u(C1987R.string.device_settings_instructionForUse, aVar5), null, true, false, false, null, null, new com.withings.device.details.wsm.g(context, iVar4), aVar5, 196608, 0, 982);
                    androidx.compose.ui.e a13 = nn.d.a();
                    String r7 = androidx.collection.c.r(C1987R.plurals.elabel_regulatory_title, 0, new Object[0], aVar5, ConstantsWs.WS_STATUS_NEW_PASSWORD_REQUIRED);
                    aVar5.s(-1492070255);
                    boolean K2 = aVar5.K(iVar4);
                    Object t12 = aVar5.t();
                    if (K2 || t12 == a.C0060a.a()) {
                        t12 = new h(iVar4);
                        aVar5.n(t12);
                    }
                    aVar5.J();
                    com.withings.common.compose.component.o.g(a13, null, null, r7, null, true, false, true, null, null, (ym0.a) t12, aVar5, 12779520, 0, 854);
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wsm02DetailFragment.kt */
    /* loaded from: classes3.dex */
    public static final class b extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ao.k f37331b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f37332c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ao.k kVar, int i11) {
            super(2);
            this.f37331b = kVar;
            this.f37332c = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f37332c | 1);
            i.this.G1(this.f37331b, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wsm02DetailFragment.kt */
    /* loaded from: classes3.dex */
    public static final class c extends w implements q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao.k f37333a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f37334b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(i iVar, ao.k kVar) {
            super(3);
            this.f37333a = kVar;
            this.f37334b = iVar;
        }

        public static final boolean a(o1 o1Var) {
            return ((Boolean) o1Var.getValue()).booleanValue();
        }

        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            int i11;
            String str;
            int i12;
            i iVar;
            androidx.compose.runtime.a aVar2;
            ao.k kVar;
            int i13;
            r0.h SectionCardColumn = hVar;
            androidx.compose.runtime.a aVar3 = aVar;
            int intValue = num.intValue();
            u.j(SectionCardColumn, "$this$SectionCardColumn");
            if ((intValue & 81) == 16 && aVar3.h()) {
                aVar3.C();
            } else {
                Context context = (Context) aVar3.D(u0.d());
                ao.k kVar2 = this.f37333a;
                com.withings.common.compose.component.o.g(nn.d.a(), null, null, ay.b.u(C1987R.string.wsm02Detail_wifiConfiguration, aVar3), ay.b.u(C1987R.string.wsm02Detail_wifiConfiguration_description, aVar3), false, false, true, null, null, new j(context, t1.d.b(kVar2.A0(), new nn.l(0), aVar3)), aVar3, 12582912, 0, 870);
                r0 b10 = t1.d.b(kVar2.R0(), Boolean.FALSE, aVar3);
                j0 T0 = kVar2.T0();
                i iVar2 = this.f37334b;
                r0 b11 = t1.d.b(T0, Boolean.valueOf(iVar2.A1().isMicMuted()), aVar3);
                r0 b12 = t1.d.b(kVar2.U0(), Boolean.valueOf(iVar2.A1().isExtraSensitivityEnabled()), aVar3);
                androidx.compose.ui.e a11 = nn.d.a();
                if (((Boolean) b10.getValue()).booleanValue()) {
                    i11 = C1987R.string.wsm02Detail_soundSensor;
                } else {
                    i11 = C1987R.string.snoringDetectionToggle;
                }
                String u11 = ay.b.u(i11, aVar3);
                aVar3.s(-873966311);
                if (((Boolean) b10.getValue()).booleanValue()) {
                    str = ay.b.u(C1987R.string.wsm02Detail_soundSensor_description_short, aVar3);
                } else {
                    str = "";
                }
                String str2 = str;
                aVar3.J();
                if (!((Boolean) b11.getValue()).booleanValue()) {
                    i12 = C1987R.string.status_on;
                } else {
                    i12 = C1987R.string.status_off;
                }
                com.withings.common.compose.component.o.o(a11, null, u11, str2, iVar2.getString(i12), true, false, true, null, null, null, new k(iVar2, kVar2, b10), null, aVar3, 12779520, 0, 5954);
                aVar3.s(-873965934);
                if (iVar2.A1().getFirmware() > 1661) {
                    androidx.compose.ui.e a12 = nn.d.a();
                    String u12 = ay.b.u(C1987R.string.wsm02Sensivity_title, aVar3);
                    String u13 = ay.b.u(C1987R.string.wsm02Sensitivity_description, aVar3);
                    if (((Boolean) b12.getValue()).booleanValue()) {
                        i13 = C1987R.string.status_on;
                    } else {
                        i13 = C1987R.string.status_off;
                    }
                    iVar = iVar2;
                    kVar = kVar2;
                    aVar2 = aVar3;
                    com.withings.common.compose.component.o.o(a12, null, u12, u13, ay.b.u(i13, aVar3), true, false, true, null, null, null, new l(iVar2, kVar2), null, aVar3, 12779520, 0, 5954);
                } else {
                    iVar = iVar2;
                    aVar2 = aVar3;
                    kVar = kVar2;
                }
                aVar2.J();
                fl.h deviceLiveData = kVar.k0();
                u.j(deviceLiveData, "deviceLiveData");
                androidx.compose.runtime.a aVar4 = aVar2;
                nn.k kVar3 = (nn.k) t1.d.a(e1.b(deviceLiveData, p.f37357a), aVar4).getValue();
                nn.k kVar4 = null;
                if (kVar3 != null && kVar3.b()) {
                    kVar4 = kVar3;
                }
                if (kVar4 != null) {
                    com.withings.common.compose.component.o.o(nn.d.a(), null, ay.b.u(C1987R.string.wsm02_locationOfYourSleepSensor, aVar4), ay.b.u(C1987R.string.wsm02_locationOfYourSensor_description, aVar4), null, true, false, true, null, null, null, new m(iVar, context, kVar4), null, aVar4, 12779520, 0, 5970);
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wsm02DetailFragment.kt */
    /* loaded from: classes3.dex */
    public static final class d extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ao.k f37336b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f37337c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ao.k kVar, int i11) {
            super(2);
            this.f37336b = kVar;
            this.f37337c = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f37337c | 1);
            i.this.H1(this.f37336b, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wsm02DetailFragment.kt */
    /* loaded from: classes3.dex */
    public static final class e extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r0.h f37339b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f37340c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(r0.h hVar, int i11) {
            super(2);
            this.f37339b = hVar;
            this.f37340c = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f37340c | 1);
            i.this.s1(this.f37339b, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wsm02DetailFragment.kt */
    /* loaded from: classes3.dex */
    public static final class f extends w implements q<r0.h, androidx.compose.runtime.a, Integer, y> {
        f() {
            super(3);
        }

        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h SectionCardColumn = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(SectionCardColumn, "$this$SectionCardColumn");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                Context context = (Context) aVar2.D(u0.d());
                androidx.compose.ui.e a11 = nn.d.a();
                String u11 = ay.b.u(C1987R.string._WALKTRHOUGH_, aVar2);
                aVar2.s(-1534222506);
                i iVar = i.this;
                boolean K = aVar2.K(iVar);
                Object t11 = aVar2.t();
                if (K || t11 == a.C0060a.a()) {
                    t11 = new n(iVar);
                    aVar2.n(t11);
                }
                aVar2.J();
                com.withings.common.compose.component.o.g(a11, null, null, u11, null, false, false, true, null, null, (ym0.a) t11, aVar2, 12582912, 0, 886);
                com.withings.common.compose.component.o.g(nn.d.a(), null, null, ay.b.u(C1987R.string.deviceDetailView_homeAutomationWithIFTTT, aVar2), null, true, false, true, null, null, new o(context, iVar), aVar2, 12779520, 0, 854);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wsm02DetailFragment.kt */
    /* loaded from: classes3.dex */
    public static final class g extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f37343b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i11) {
            super(2);
            this.f37343b = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f37343b | 1);
            i.this.I1(aVar, g11);
            return y.f85009a;
        }
    }

    public i() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G1(ao.k kVar, androidx.compose.runtime.a aVar, int i11) {
        boolean z5;
        androidx.compose.runtime.b g11 = aVar.g(-309782265);
        DateTime dateTime = (DateTime) t1.d.a(kVar.z0(), g11).getValue();
        if (dateTime == null) {
            dateTime = A1().getAssociationDate();
        }
        Boolean bool = (Boolean) t1.d.a(kVar.R0(), g11).getValue();
        if (bool != null) {
            z5 = bool.booleanValue();
        } else {
            z5 = false;
        }
        y3.d(null, ay.b.u(C1987R.string._SETTINGS_ABOUT_, g11), null, 0.0f, 0.0f, 0L, s1.b.b(g11, -1647480707, new a(kVar, this, dateTime, z5)), g11, 1572864, 61);
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(kVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H1(ao.k kVar, androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(-1848924362);
        y3.d(null, ay.b.u(C1987R.string._ADVANCED_SETTINGS_, g11), null, 0.0f, 0.0f, 0L, s1.b.b(g11, -221670400, new c(this, kVar)), g11, 1572864, 61);
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d(kVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I1(androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        androidx.compose.runtime.b g11 = aVar.g(-1361010761);
        if ((i11 & 14) == 0) {
            if (g11.K(this)) {
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
            y3.d(null, ay.b.u(C1987R.string._HELP_, g11), null, 0.0f, 0.0f, 0L, s1.b.b(g11, -501233023, new f()), g11, 1572864, 61);
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new g(i11));
        }
    }

    public static final void N1(i iVar, ao.k kVar, boolean z5) {
        if (z5) {
            iVar.getClass();
            Device value = kVar.k0().getValue();
            if (value != null) {
                SoundSensorActivity.a aVar = SoundSensorActivity.f37304c;
                Context requireContext = iVar.requireContext();
                u.i(requireContext, "requireContext(...)");
                aVar.getClass();
                Intent putExtra = new Intent(requireContext, SoundSensorActivity.class).putExtra("EXTRA_DEVICE", value);
                u.i(putExtra, "putExtra(...)");
                iVar.startActivity(putExtra);
            }
        } else if (!iVar.A1().isMicMuted()) {
            qc.b B = new qc.b(iVar.requireContext()).B(iVar.getString(C1987R.string.snoringDetectionToggleSelectedTitle));
            B.v(iVar.getString(C1987R.string.snoringDetectionToggleSelected));
            B.z(C1987R.string.snoringDetectionToggleSelected_okButton, new ao.f(0)).w(C1987R.string.snoringDetectionToggleSelected_cancelButton, new ao.g(kVar, 0)).s();
        } else {
            Device value2 = kVar.k0().getValue();
            if (value2 != null) {
                value2.setIsMicMuted(false);
                kVar.O0(value2);
            }
        }
    }

    @Override // com.withings.device.details.h
    public final boolean C1() {
        return this.f37324p;
    }

    @Override // com.withings.device.details.h
    public final boolean D1() {
        return this.f37325q;
    }

    @Override // com.withings.device.details.h
    protected final void s1(r0.h hVar, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        i6.a aVar2;
        int i13;
        u.j(hVar, "<this>");
        androidx.compose.runtime.b g11 = aVar.g(1629496412);
        if ((i11 & 112) == 0) {
            if (g11.K(this)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 81) == 16 && g11.h()) {
            g11.C();
        } else {
            Application application = requireActivity().getApplication();
            u.i(application, "getApplication(...)");
            fl.p a11 = fl.p.f67672b.a();
            kn.e c11 = kn.e.c();
            u.i(c11, "get(...)");
            ao.m mVar = new ao.m(application, a11, c11, A1());
            g11.s(1729797275);
            androidx.lifecycle.n1 a12 = j6.a.a(g11);
            if (a12 != null) {
                if (a12 instanceof androidx.lifecycle.u) {
                    aVar2 = ((androidx.lifecycle.u) a12).getDefaultViewModelCreationExtras();
                } else {
                    aVar2 = a.C1058a.f71431b;
                }
                g1 a13 = j6.b.a(ao.k.class, a12, null, mVar, aVar2, g11);
                g11.J();
                ao.k kVar = (ao.k) a13;
                int i14 = (i12 & 112) | 8;
                H1(kVar, g11, i14);
                I1(g11, (i12 >> 3) & 14);
                G1(kVar, g11, i14);
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new e(hVar, i11));
        }
    }

    public i(int i11) {
        this.f37324p = true;
        this.f37325q = true;
    }
}
