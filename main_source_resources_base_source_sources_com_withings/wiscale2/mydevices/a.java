package com.withings.wiscale2.mydevices;

import ah.e0;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.alarm.model.DeviceAlarm;
import com.withings.alarm.ui.TrackerMultipleAlarmActivity;
import com.withings.alarm.ui.TrackerSetAlarmActivity;
import com.withings.common.device.DeviceSettingsActivity;
import com.withings.common.device.reporting.InstallStateReporter;
import com.withings.device.Device;
import com.withings.device.details.wsd.programs.nap.WsdSleepNapActivity;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.device.common.onboarding.SleepApneaOnboardingActivity;
import com.withings.wiscale2.device.common.screen.ui.WorkoutScreenOrderDelegate;
import com.withings.wiscale2.device.common.ui.DeviceInfoActivity;
import com.withings.wiscale2.device.common.ui.TrackerPositionDelegate;
import com.withings.wiscale2.device.hwa08.postinstall.Hwa08PostInstallActivity;
import com.withings.wiscale2.device.wam02.ui.Wam02AutoSleepActivity;
import com.withings.wiscale2.device.wpa.wpa02.ui.measurement.Wpa02LaunchMeasurementActivity;
import com.withings.wiscale2.device.wpm.ui.Wpm0203StartMeasureActivity;
import com.withings.wiscale2.measure.accountmeasure.unknown.ui.UnknownMeasuresActivity;
import com.withings.zendesk.ui.DeviceGuideDisplayer;
import fl.p;
import gl.n0;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import zg.c;
/* compiled from: DeviceSettingsRedirection.kt */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final ch.d f58606a;

    /* compiled from: DeviceSettingsRedirection.kt */
    /* renamed from: com.withings.wiscale2.mydevices.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0757a {

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0758a implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            private final DeviceAlarm f58607a;

            public C0758a(DeviceAlarm deviceAlarm) {
                this.f58607a = deviceAlarm;
            }

            public final DeviceAlarm a() {
                return this.f58607a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0758a) && kotlin.jvm.internal.u.e(this.f58607a, ((C0758a) obj).f58607a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                DeviceAlarm deviceAlarm = this.f58607a;
                if (deviceAlarm == null) {
                    return 0;
                }
                return deviceAlarm.hashCode();
            }

            public final String toString() {
                return "Alarm(alarm=" + this.f58607a + ")";
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$a0 */
        /* loaded from: classes5.dex */
        public static final class a0 implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            public static final a0 f58608a = new a0();

            private a0() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a0)) {
                    return false;
                }
                a0 a0Var = (a0) obj;
                return true;
            }

            public final int hashCode() {
                return -884612214;
            }

            public final String toString() {
                return "WorkoutCustomization";
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$b */
        /* loaded from: classes5.dex */
        public static final class b implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f58609a = new b();

            private b() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return true;
            }

            public final int hashCode() {
                return 1126468960;
            }

            public final String toString() {
                return "CalibrateTime";
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$b0 */
        /* loaded from: classes5.dex */
        public static final class b0 implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            public static final b0 f58610a = new b0();

            private b0() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b0)) {
                    return false;
                }
                b0 b0Var = (b0) obj;
                return true;
            }

            public final int hashCode() {
                return 1295756031;
            }

            public final String toString() {
                return "X3MeasurementIntervalTime";
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$c */
        /* loaded from: classes5.dex */
        public static final class c implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f58611a = new c();

            private c() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return true;
            }

            public final int hashCode() {
                return 867042248;
            }

            public final String toString() {
                return "CleansingModeForWPA02";
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$d */
        /* loaded from: classes5.dex */
        public static final class d implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            private final User f58612a;

            public d(User user) {
                this.f58612a = user;
            }

            public final User a() {
                return this.f58612a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof d) && kotlin.jvm.internal.u.e(this.f58612a, ((d) obj).f58612a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f58612a.hashCode();
            }

            public final String toString() {
                return "ExplanationOfECGUseForHWA08(user=" + this.f58612a + ")";
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$e */
        /* loaded from: classes5.dex */
        public static final class e implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            public static final e f58613a = new e();

            private e() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return true;
            }

            public final int hashCode() {
                return 32861992;
            }

            public final String toString() {
                return "GlanceSetting";
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$f */
        /* loaded from: classes5.dex */
        public static final class f implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            private final boolean f58614a;

            public f(boolean z5) {
                this.f58614a = z5;
            }

            public final boolean a() {
                return this.f58614a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof f) && this.f58614a == ((f) obj).f58614a) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f58614a);
            }

            public final String toString() {
                return androidx.appcompat.app.h.d(new StringBuilder("GlanceToggle(newState="), this.f58614a, ")");
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$g */
        /* loaded from: classes5.dex */
        public static final class g implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            public static final g f58615a = new g();

            private g() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return true;
            }

            public final int hashCode() {
                return 1959007050;
            }

            public final String toString() {
                return "HelpCenter";
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$h */
        /* loaded from: classes5.dex */
        public static final class h implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            public static final h f58616a = new h();

            private h() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return true;
            }

            public final int hashCode() {
                return -320792861;
            }

            public final String toString() {
                return ConstantsWs.BRAND_REDIRECT_URI_NAME_IFTTT;
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$i */
        /* loaded from: classes5.dex */
        public static final class i implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            private final DeviceAlarm f58617a;

            public i(DeviceAlarm deviceAlarm) {
                this.f58617a = deviceAlarm;
            }

            public final DeviceAlarm a() {
                return this.f58617a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof i) && kotlin.jvm.internal.u.e(this.f58617a, ((i) obj).f58617a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                DeviceAlarm deviceAlarm = this.f58617a;
                if (deviceAlarm == null) {
                    return 0;
                }
                return deviceAlarm.hashCode();
            }

            public final String toString() {
                return "Nap(alarm=" + this.f58617a + ")";
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$j */
        /* loaded from: classes5.dex */
        public static final class j implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            public static final j f58618a = new j();

            private j() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return true;
            }

            public final int hashCode() {
                return -1258581571;
            }

            public final String toString() {
                return "NewMeasureForWPM";
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$k */
        /* loaded from: classes5.dex */
        public static final class k implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            public static final k f58619a = new k();

            private k() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof k)) {
                    return false;
                }
                k kVar = (k) obj;
                return true;
            }

            public final int hashCode() {
                return 1463844305;
            }

            public final String toString() {
                return "NewMeasurementForWPA02";
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$l */
        /* loaded from: classes5.dex */
        public static final class l implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            public static final l f58620a = new l();

            private l() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof l)) {
                    return false;
                }
                l lVar = (l) obj;
                return true;
            }

            public final int hashCode() {
                return -1979251692;
            }

            public final String toString() {
                return "Notifications";
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$m */
        /* loaded from: classes5.dex */
        public static final class m implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            public static final m f58621a = new m();

            private m() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof m)) {
                    return false;
                }
                m mVar = (m) obj;
                return true;
            }

            public final int hashCode() {
                return -13812048;
            }

            public final String toString() {
                return "Permissions";
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$n */
        /* loaded from: classes5.dex */
        public static final class n implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            private final List<User> f58622a;

            /* JADX WARN: Multi-variable type inference failed */
            public n(List<? extends User> users) {
                kotlin.jvm.internal.u.j(users, "users");
                this.f58622a = users;
            }

            public final List<User> a() {
                return this.f58622a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof n) && kotlin.jvm.internal.u.e(this.f58622a, ((n) obj).f58622a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f58622a.hashCode();
            }

            public final String toString() {
                return defpackage.d.i(new StringBuilder("PickUser(users="), this.f58622a, ")");
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$o */
        /* loaded from: classes5.dex */
        public static final class o implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            private final long f58623a;

            public o(long j5) {
                this.f58623a = j5;
            }

            public final long a() {
                return this.f58623a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof o) && this.f58623a == ((o) obj).f58623a) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return Long.hashCode(this.f58623a);
            }

            public final String toString() {
                return android.support.v4.media.session.c.c(new StringBuilder("ScaleModes(userId="), this.f58623a, ")");
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$p */
        /* loaded from: classes5.dex */
        public static final class p implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            private final User f58624a;

            public p(User user) {
                kotlin.jvm.internal.u.j(user, "user");
                this.f58624a = user;
            }

            public final User a() {
                return this.f58624a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof p) && kotlin.jvm.internal.u.e(this.f58624a, ((p) obj).f58624a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f58624a.hashCode();
            }

            public final String toString() {
                return "ScreensOrderCustomization(user=" + this.f58624a + ")";
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$q */
        /* loaded from: classes5.dex */
        public static final class q implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            public static final q f58625a = new q();

            private q() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof q)) {
                    return false;
                }
                q qVar = (q) obj;
                return true;
            }

            public final int hashCode() {
                return -1795391113;
            }

            public final String toString() {
                return "Settings";
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$r */
        /* loaded from: classes5.dex */
        public static final class r implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            private final DeviceAlarm f58626a;

            public r(DeviceAlarm deviceAlarm) {
                this.f58626a = deviceAlarm;
            }

            public final DeviceAlarm a() {
                return this.f58626a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof r) && kotlin.jvm.internal.u.e(this.f58626a, ((r) obj).f58626a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                DeviceAlarm deviceAlarm = this.f58626a;
                if (deviceAlarm == null) {
                    return 0;
                }
                return deviceAlarm.hashCode();
            }

            public final String toString() {
                return "Sleep(alarm=" + this.f58626a + ")";
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$s */
        /* loaded from: classes5.dex */
        public static final class s implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            public static final s f58627a = new s();

            private s() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof s)) {
                    return false;
                }
                s sVar = (s) obj;
                return true;
            }

            public final int hashCode() {
                return 797821624;
            }

            public final String toString() {
                return "SleepApnea";
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$t */
        /* loaded from: classes5.dex */
        public static final class t implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            public static final t f58628a = new t();

            private t() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof t)) {
                    return false;
                }
                t tVar = (t) obj;
                return true;
            }

            public final int hashCode() {
                return 1330062156;
            }

            public final String toString() {
                return "TrackerWearPosition";
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$u */
        /* loaded from: classes5.dex */
        public static final class u implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            public static final u f58629a = new u();

            private u() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof u)) {
                    return false;
                }
                u uVar = (u) obj;
                return true;
            }

            public final int hashCode() {
                return 350168577;
            }

            public final String toString() {
                return "Tutorials";
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$v */
        /* loaded from: classes5.dex */
        public static final class v implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            private final int f58630a;

            public v(int i11) {
                this.f58630a = i11;
            }

            public final int a() {
                return this.f58630a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof v) && this.f58630a == ((v) obj).f58630a) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f58630a);
            }

            public final String toString() {
                return androidx.camera.camera2.internal.e.c(new StringBuilder("UnknownMeasurements(measurementType="), this.f58630a, ")");
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$w */
        /* loaded from: classes5.dex */
        public static final class w implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            private final Setup f58631a;

            /* renamed from: b  reason: collision with root package name */
            private final cj.d f58632b;

            public w(cj.d dVar, Setup setup) {
                this.f58631a = setup;
                this.f58632b = dVar;
            }

            public final Setup a() {
                return this.f58631a;
            }

            public final cj.d b() {
                return this.f58632b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof w)) {
                    return false;
                }
                w wVar = (w) obj;
                if (kotlin.jvm.internal.u.e(this.f58631a, wVar.f58631a) && kotlin.jvm.internal.u.e(this.f58632b, wVar.f58632b)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                int hashCode;
                int i11 = 0;
                Setup setup = this.f58631a;
                if (setup == null) {
                    hashCode = 0;
                } else {
                    hashCode = setup.hashCode();
                }
                int i12 = hashCode * 31;
                cj.d dVar = this.f58632b;
                if (dVar != null) {
                    i11 = dVar.hashCode();
                }
                return i12 + i11;
            }

            public final String toString() {
                return "Update(upgrade=" + this.f58631a + ", wppDeviceIdentity=" + this.f58632b + ")";
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$x */
        /* loaded from: classes5.dex */
        public static final class x implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            public static final x f58633a = new x();

            private x() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof x)) {
                    return false;
                }
                x xVar = (x) obj;
                return true;
            }

            public final int hashCode() {
                return 2116802379;
            }

            public final String toString() {
                return "WPA02CartridgeActivation";
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$y */
        /* loaded from: classes5.dex */
        public static final class y implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            private final boolean f58634a;

            /* renamed from: b  reason: collision with root package name */
            private final long f58635b;

            public y(boolean z5, long j5) {
                this.f58634a = z5;
                this.f58635b = j5;
            }

            public final long a() {
                return this.f58635b;
            }

            public final boolean b() {
                return this.f58634a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof y)) {
                    return false;
                }
                y yVar = (y) obj;
                if (this.f58634a == yVar.f58634a && this.f58635b == yVar.f58635b) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return Long.hashCode(this.f58635b) + (Boolean.hashCode(this.f58634a) * 31);
            }

            public final String toString() {
                return "WallHandleMount(isActivated=" + this.f58634a + ", userId=" + this.f58635b + ")";
            }
        }

        /* compiled from: DeviceSettingsRedirection.kt */
        /* renamed from: com.withings.wiscale2.mydevices.a$a$z */
        /* loaded from: classes5.dex */
        public static final class z implements InterfaceC0757a {

            /* renamed from: a  reason: collision with root package name */
            public static final z f58636a = new z();

            private z() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof z)) {
                    return false;
                }
                z zVar = (z) obj;
                return true;
            }

            public final int hashCode() {
                return 43230612;
            }

            public final String toString() {
                return "WifiSetup";
            }
        }
    }

    /* compiled from: DeviceSettingsRedirection.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.mydevices.DeviceSettingsRedirection$onShortcutSettingClicked$1", f = "DeviceSettingsRedirection.kt", l = {76}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f58637a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f58639c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f58639c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new b(this.f58639c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f58637a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                this.f58637a = 1;
                a.this.getClass();
                Object b10 = new xg0.a(this.f58639c).b(this);
                if (b10 != coroutineSingletons) {
                    b10 = y.f85009a;
                }
                if (b10 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    @Inject
    public a(ch.d intentBuilder) {
        u.j(intentBuilder, "intentBuilder");
        this.f58606a = intentBuilder;
    }

    private static void b(Context context, Intent intent) {
        if (intent != null) {
            context.startActivity(intent);
            y yVar = y.f85009a;
        }
    }

    public final void a(Context context, Device device, InterfaceC0757a event) {
        Intent a11;
        Intent zendeskIntent$default;
        boolean z5;
        Intent c11;
        u.j(device, "device");
        u.j(event, "event");
        if (event instanceof InterfaceC0757a.w) {
            InterfaceC0757a.w wVar = (InterfaceC0757a.w) event;
            b(context, SetupActivity.P3(context, wVar.a(), wVar.b(), new InstallStateReporter(false)));
        } else if (event instanceof InterfaceC0757a.l) {
            b(context, zg.b.b(context, device, false));
        } else {
            boolean z11 = event instanceof InterfaceC0757a.C0758a;
            p.a aVar = fl.p.f67672b;
            Intent intent = null;
            gl.c cVar = null;
            if (z11) {
                InterfaceC0757a.C0758a c0758a = (InterfaceC0757a.C0758a) event;
                fl.o d11 = aVar.a().d(device.getModelId());
                if (d11 instanceof gl.c) {
                    cVar = (gl.c) d11;
                }
                if (cVar != null) {
                    z5 = cVar.m(device.getFirmware());
                } else {
                    z5 = false;
                }
                if (d11.a() == 60) {
                    c11 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(context.getPackageName(), "com.withings.device.details.wsd.programs.alarm.WsdMultipleAlarmActivity").putExtra("device", device);
                    u.i(c11, "putExtra(...)");
                } else if (!z5) {
                    DeviceAlarm a12 = c0758a.a();
                    if (a12 == null) {
                        a12 = new DeviceAlarm();
                        a12.A(device.getId());
                    }
                    c11 = TrackerSetAlarmActivity.O3(context, device, a12, false);
                } else {
                    DeviceSettingsActivity.c cVar2 = DeviceSettingsActivity.f35012e;
                    int i11 = TrackerMultipleAlarmActivity.f31120o;
                    Intent putExtra = new Intent(context, TrackerMultipleAlarmActivity.class).putExtra("device", device);
                    cVar2.getClass();
                    c11 = DeviceSettingsActivity.c.c(context, device, putExtra);
                }
                b(context, c11);
            } else if (event instanceof InterfaceC0757a.u) {
                b(context, c.a.a(context, device.getId(), true));
            } else {
                boolean z12 = event instanceof InterfaceC0757a.g;
                ch.d dVar = this.f58606a;
                if (z12) {
                    int i12 = v70.a.f103433b;
                    v70.a.b(String.format("help_center_%d", Arrays.copyOf(new Object[]{Integer.valueOf(device.getModelId())}, 1)), null, null);
                    fl.o g11 = aVar.a().g(device);
                    if (g11 instanceof n0) {
                        zendeskIntent$default = ((n0) g11).e(context);
                    } else {
                        zendeskIntent$default = DeviceGuideDisplayer.getZendeskIntent$default(dVar.t(), context, device, null, 8, null);
                    }
                    b(context, zendeskIntent$default);
                } else if (event instanceof InterfaceC0757a.q) {
                    DeviceInfoActivity.a aVar2 = DeviceInfoActivity.f53677i;
                    nn.i iVar = new nn.i(device, null, null);
                    aVar2.getClass();
                    b(context, DeviceInfoActivity.a.a(context, iVar));
                } else if (event instanceof InterfaceC0757a.v) {
                    int a13 = ((InterfaceC0757a.v) event).a();
                    if (a13 >= 0) {
                        UnknownMeasuresActivity.f58323h.getClass();
                        intent = UnknownMeasuresActivity.a.a(a13, context);
                    }
                    b(context, intent);
                } else if (event instanceof InterfaceC0757a.j) {
                    int i13 = Wpm0203StartMeasureActivity.f55678b;
                    b(context, new Intent(context, Wpm0203StartMeasureActivity.class).putExtra("device", device));
                } else if (event instanceof InterfaceC0757a.z) {
                    fl.o g12 = aVar.a().g(device);
                    u.h(g12, "null cannot be cast to non-null type com.withings.common.device.model.capabilities.DeviceModelWithNetworkConfiguration");
                    Intent P3 = SetupActivity.P3(context, ((gl.g) g12).p(device), jl.a.b(device), new InstallStateReporter(false));
                    u.i(P3, "createIntent(...)");
                    b(context, P3);
                } else {
                    boolean z13 = event instanceof InterfaceC0757a.r;
                    List list = i0.f76187a;
                    if (z13) {
                        DeviceAlarm a14 = ((InterfaceC0757a.r) event).a();
                        if (a14 != null) {
                            list = x.V(a14);
                        }
                        int i14 = WsdSleepNapActivity.M;
                        b(context, WsdSleepNapActivity.a.a(context, device, list, false));
                    } else if (event instanceof InterfaceC0757a.i) {
                        DeviceAlarm a15 = ((InterfaceC0757a.i) event).a();
                        if (a15 != null) {
                            list = x.V(a15);
                        }
                        int i15 = WsdSleepNapActivity.M;
                        b(context, WsdSleepNapActivity.a.a(context, device, list, true));
                    } else if (event instanceof InterfaceC0757a.b) {
                        zg.c.f110625a.getClass();
                        b(context, zg.c.b(context, device));
                    } else if (event instanceof InterfaceC0757a.t) {
                        if (device.getModelId() == 54) {
                            DeviceSettingsActivity.c cVar3 = DeviceSettingsActivity.f35012e;
                            Wam02AutoSleepActivity.f54877e.getClass();
                            Intent putExtra2 = new Intent(context, Wam02AutoSleepActivity.class).putExtra("EXTRA_DEVICE", device);
                            u.i(putExtra2, "putExtra(...)");
                            cVar3.getClass();
                            a11 = DeviceSettingsActivity.c.c(context, device, putExtra2);
                        } else {
                            DeviceSettingsActivity.c cVar4 = DeviceSettingsActivity.f35012e;
                            TrackerPositionDelegate trackerPositionDelegate = new TrackerPositionDelegate(device);
                            cVar4.getClass();
                            a11 = DeviceSettingsActivity.c.a(context, device, trackerPositionDelegate);
                        }
                        b(context, a11);
                    } else if (event instanceof InterfaceC0757a.d) {
                        DeviceSettingsActivity.c cVar5 = DeviceSettingsActivity.f35012e;
                        Hwa08PostInstallActivity.b bVar = Hwa08PostInstallActivity.f54404n;
                        User user = ((InterfaceC0757a.d) event).a();
                        bVar.getClass();
                        u.j(user, "user");
                        Intent putExtra3 = c.a.c(context, device, user, true).putExtra("only_ecg_informations", true);
                        u.i(putExtra3, "putExtra(...)");
                        cVar5.getClass();
                        b(context, DeviceSettingsActivity.c.c(context, device, putExtra3));
                    } else if (event instanceof InterfaceC0757a.a0) {
                        DeviceSettingsActivity.c cVar6 = DeviceSettingsActivity.f35012e;
                        WorkoutScreenOrderDelegate workoutScreenOrderDelegate = new WorkoutScreenOrderDelegate(device);
                        cVar6.getClass();
                        b(context, DeviceSettingsActivity.c.a(context, device, workoutScreenOrderDelegate));
                    } else if (event instanceof InterfaceC0757a.p) {
                        zg.c cVar7 = zg.c.f110625a;
                        User a16 = ((InterfaceC0757a.p) event).a();
                        cVar7.getClass();
                        b(context, zg.c.c(context, device, a16, false));
                    } else if (event instanceof InterfaceC0757a.e) {
                        b(context, DeviceSettingsActivity.c.b(DeviceSettingsActivity.f35012e, context, device));
                    } else if (event instanceof InterfaceC0757a.y) {
                        InterfaceC0757a.y yVar = (InterfaceC0757a.y) event;
                        b(context, zg.b.t(yVar.a(), context, device, yVar.b()));
                    } else if (event instanceof InterfaceC0757a.o) {
                        b(context, ((ah.u) dVar.getMode()).I(((InterfaceC0757a.o) event).a(), context, device));
                    } else if (event instanceof InterfaceC0757a.s) {
                        b(context, SleepApneaOnboardingActivity.a.a(SleepApneaOnboardingActivity.f53060m, context, device, false, true, 4));
                    } else if (event instanceof InterfaceC0757a.k) {
                        Wpa02LaunchMeasurementActivity.f55468g.getClass();
                        Intent intent2 = new Intent(context, Wpa02LaunchMeasurementActivity.class);
                        intent2.putExtra("extra_device", device);
                        b(context, intent2);
                    } else if (event instanceof InterfaceC0757a.c) {
                        ((e0) dVar.c()).getClass();
                        Intent putExtra4 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(context.getPackageName(), "com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing.Wpa02CleansingModeActivity").putExtra("device", device);
                        u.i(putExtra4, "putExtra(...)");
                        b(context, putExtra4);
                    } else if (event instanceof InterfaceC0757a.x) {
                        b(context, ch.m.b(dVar.c(), context, device));
                    } else if (event instanceof InterfaceC0757a.h) {
                        BuildersKt__BuildersKt.runBlocking$default(null, new b(context, null), 1, null);
                    } else if (!(event instanceof InterfaceC0757a.m) && !(event instanceof InterfaceC0757a.b0) && !(event instanceof InterfaceC0757a.f)) {
                        boolean z14 = event instanceof InterfaceC0757a.n;
                    }
                }
            }
        }
    }
}
