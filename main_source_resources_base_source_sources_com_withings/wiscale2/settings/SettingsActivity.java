package com.withings.wiscale2.settings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.compose.material.w7;
import androidx.compose.runtime.a;
import com.withings.appnavigation.api.builder.SettingsDestinations;
import com.withings.common.compose.component.ColorStyle;
import com.withings.common.device.HelpCenterWebActivity;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: SettingsActivity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000e²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u000b\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\f\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\r\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/withings/wiscale2/settings/SettingsActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", com.huawei.hms.feature.dynamic.e.b.f28627a, "", "startDestination", "Lcom/withings/wiscale2/settings/SettingsViewModel;", "viewModel", "", "showEditPasswordDialog", "hasAccessToAccountAndSecuritySettings", "showLogoutConfirmationDialog", "themeStringValue", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SettingsActivity extends Hilt_SettingsActivity {
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public i10.o f59744e;
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public r70.c f59745f;

    /* renamed from: g  reason: collision with root package name */
    private final androidx.compose.ui.e f59746g = androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2);

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f59747h = nm0.h.b(new e());

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f59748i = nm0.h.b(new d());

    /* renamed from: j  reason: collision with root package name */
    private final f f59749j = new f(this);

    /* renamed from: l  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f59743l = {androidx.camera.core.v.c(SettingsActivity.class, "startDestination", "getStartDestination()Lcom/withings/appnavigation/api/builder/SettingsDestinations;", 0)};

    /* renamed from: k  reason: collision with root package name */
    public static final b f59742k = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SettingsActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f59751b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f59752c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, int i12) {
            super(2);
            this.f59751b = i11;
            this.f59752c = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f59752c | 1);
            SettingsActivity.this.z3(this.f59751b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SettingsActivity.kt */
    /* loaded from: classes5.dex */
    public static final class b {
        public static Intent a(b bVar, Context context, boolean z5, SettingsDestinations startDestination, int i11) {
            if ((i11 & 2) != 0) {
                z5 = false;
            }
            if ((i11 & 8) != 0) {
                startDestination = SettingsDestinations.f31277a;
            }
            bVar.getClass();
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(startDestination, "startDestination");
            Intent intent = new Intent(context, SettingsActivity.class);
            intent.putExtra("settingsStart", startDestination);
            intent.putExtra("OPEN_RECOVERY_CODE", false);
            intent.putExtra("OPEN_2FA", z5);
            return intent;
        }
    }

    /* compiled from: SettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        c() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                aVar2.s(1438963234);
                Object t11 = aVar2.t();
                if (t11 == a.C0060a.a()) {
                    t11 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
                    aVar2.n(t11);
                }
                k1.r0 r0Var = (k1.r0) t11;
                Object j5 = w7.j(aVar2, 1438963333);
                a.C0060a.C0061a a11 = a.C0060a.a();
                SettingsActivity settingsActivity = SettingsActivity.this;
                if (j5 == a11) {
                    String str = "multi-factor";
                    if (!SettingsActivity.H3(settingsActivity) && !SettingsActivity.G3(settingsActivity)) {
                        int ordinal = SettingsActivity.I3(settingsActivity).ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else {
                                    str = "notification-summary";
                                }
                            } else {
                                str = "privacy";
                            }
                        } else {
                            str = "home";
                        }
                    }
                    j5 = androidx.compose.runtime.l0.f(str, androidx.compose.runtime.v0.f8878a);
                    aVar2.n(j5);
                }
                k1.r0 r0Var2 = (k1.r0) j5;
                aVar2.J();
                androidx.lifecycle.i1 i1Var = new androidx.lifecycle.i1(kotlin.jvm.internal.q0.b(SettingsViewModel.class), new u4(settingsActivity), new t4(settingsActivity), new v4(settingsActivity));
                aVar2.s(1438963784);
                Object t12 = aVar2.t();
                if (t12 == a.C0060a.a()) {
                    t12 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
                    aVar2.n(t12);
                }
                aVar2.J();
                yk.o.b(false, s1.b.b(aVar2, -1311125477, new s4(SettingsActivity.this, (k1.r0) t12, i1Var, r0Var2, r0Var)), aVar2, 48, 1);
                b bVar = SettingsActivity.f59742k;
                settingsActivity.getClass();
                BuildersKt__Builders_commonKt.launch$default(m0.t.l(settingsActivity), null, null, new r3(r0Var, settingsActivity, (SettingsViewModel) i1Var.getValue(), null), 3, null);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<Boolean> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(SettingsActivity.this.getIntent().getBooleanExtra("OPEN_RECOVERY_CODE", false));
        }
    }

    /* compiled from: SettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<Boolean> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(SettingsActivity.this.getIntent().getBooleanExtra("OPEN_2FA", false));
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class f implements bn0.d<Activity, SettingsDestinations> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f59756a = nm0.h.b(new b5(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f59757b;

        public f(Activity activity) {
            this.f59757b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.appnavigation.api.builder.SettingsDestinations, java.lang.Object] */
        @Override // bn0.d
        public final SettingsDestinations getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f59756a.getValue();
        }
    }

    public static final void A3(SettingsActivity settingsActivity, boolean z5, ym0.a aVar, ym0.a aVar2, ym0.a aVar3, ym0.a aVar4, androidx.compose.runtime.a aVar5, int i11) {
        boolean z11;
        settingsActivity.getClass();
        androidx.compose.runtime.b g11 = aVar5.g(1325247397);
        g11.s(773894976);
        g11.s(-492369756);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.datastore.preferences.protobuf.e.b(k1.y.i(g11), g11);
        }
        g11.J();
        CoroutineScope a11 = ((androidx.compose.runtime.k) t11).a();
        g11.J();
        g.a aVar6 = new g.a();
        g11.s(-996658549);
        if ((((57344 & i11) ^ 24576) > 16384 && g11.K(aVar4)) || (i11 & 24576) == 16384) {
            z11 = true;
        } else {
            z11 = false;
        }
        Object t12 = g11.t();
        if (z11 || t12 == a.C0060a.a()) {
            t12 = new y1(aVar4);
            g11.n(t12);
        }
        g11.J();
        com.withings.common.compose.component.y3.d(null, null, null, 0.0f, 0.0f, 0L, s1.b.b(g11, -1036818789, new w1(settingsActivity, z5, aVar, aVar2, aVar3, a11, e.d.a(aVar6, (ym0.l) t12, g11, 8))), g11, 1572864, 63);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new x1(settingsActivity, z5, aVar, aVar2, aVar3, aVar4, i11));
        }
    }

    public static final void B3(SettingsActivity settingsActivity, androidx.compose.runtime.a aVar, int i11) {
        settingsActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(1350729444);
        com.withings.common.compose.component.y3.d(null, ay.b.u(C1987R.string._ADVANCED_SETTINGS_, g11), null, 0.0f, 0.0f, 0L, s1.b.b(g11, -163458002, new c2(settingsActivity)), g11, 1572864, 61);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d2(settingsActivity, i11));
        }
    }

    public static final void C3(SettingsActivity settingsActivity, SettingsViewModel settingsViewModel, androidx.compose.runtime.a aVar, int i11) {
        SettingsActivity settingsActivity2;
        settingsActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-1194791086);
        g11.s(773894976);
        g11.s(-492369756);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.datastore.preferences.protobuf.e.b(k1.y.i(g11), g11);
        }
        g11.J();
        CoroutineScope a11 = ((androidx.compose.runtime.k) t11).a();
        g11.J();
        g11.s(982004459);
        Object t12 = g11.t();
        if (t12 == a.C0060a.a()) {
            t12 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
            g11.n(t12);
        }
        k1.r0 r0Var = (k1.r0) t12;
        g11.J();
        ColorStyle colorStyle = ColorStyle.f33323b;
        androidx.compose.ui.e h11 = androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2);
        String u11 = ay.b.u(C1987R.string._DECONNECTER_, g11);
        g11.s(982004725);
        Object t13 = g11.t();
        if (t13 == a.C0060a.a()) {
            t13 = new e2(r0Var);
            g11.n(t13);
        }
        g11.J();
        com.withings.common.compose.component.l.a(h11, u11, null, false, colorStyle, null, false, (ym0.a) t13, g11, 12607488, 108);
        if (((Boolean) r0Var.getValue()).booleanValue()) {
            String u12 = ay.b.u(C1987R.string._CANCEL_, g11);
            String u13 = ay.b.u(C1987R.string._YES_, g11);
            String u14 = ay.b.u(C1987R.string._POPUP_DISCONNECT_CONFIRMATION_, g11);
            String u15 = ay.b.u(C1987R.string._DECONNECTER_, g11);
            g11.s(982005818);
            Object t14 = g11.t();
            if (t14 == a.C0060a.a()) {
                t14 = new f2(r0Var);
                g11.n(t14);
            }
            ym0.a aVar2 = (ym0.a) t14;
            g11.J();
            settingsActivity2 = settingsActivity;
            h2 h2Var = new h2(a11, r0Var, settingsViewModel, settingsActivity2);
            g11.s(982005383);
            Object t15 = g11.t();
            if (t15 == a.C0060a.a()) {
                t15 = new i2(r0Var);
                g11.n(t15);
            }
            g11.J();
            wk.p.a(aVar2, u15, u14, u13, 0L, h2Var, u12, 0L, (ym0.a) t15, g11, 100663302, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX);
        } else {
            settingsActivity2 = settingsActivity;
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new j2(settingsActivity2, settingsViewModel, i11));
        }
    }

    public static final void D3(SettingsActivity settingsActivity, androidx.compose.runtime.a aVar, int i11) {
        settingsActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-1644965451);
        com.withings.common.compose.component.y3.d(null, ay.b.u(C1987R.string._OTHER_, g11), null, 0.0f, 0.0f, 0L, s1.b.b(g11, 456451755, new o2(settingsActivity)), g11, 1572864, 61);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new p2(settingsActivity, i11));
        }
    }

    public static final void E3(SettingsActivity settingsActivity, boolean z5, ym0.a aVar, ym0.a aVar2, ym0.a aVar3, ym0.a aVar4, k1.r0 r0Var, com.withings.common.compose.component.z4 z4Var, SettingsViewModel settingsViewModel, androidx.compose.runtime.a aVar5, int i11) {
        settingsActivity.getClass();
        androidx.compose.runtime.b g11 = aVar5.g(-467548644);
        wk.m0.a(null, null, z4Var, null, s1.b.b(g11, 1839137696, new r2(settingsActivity)), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, s1.b.b(g11, -243152295, new t2(settingsActivity, z5, aVar, aVar2, aVar3, aVar4, settingsViewModel, r0Var)), g11, ((i11 >> 12) & ConstantsWs.HWFAILURE_ZERO) | 24576, 805306368, 524267);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new u2(settingsActivity, z5, aVar, aVar2, aVar3, aVar4, r0Var, z4Var, settingsViewModel, i11));
        }
    }

    public static final boolean G3(SettingsActivity settingsActivity) {
        return ((Boolean) settingsActivity.f59748i.getValue()).booleanValue();
    }

    public static final boolean H3(SettingsActivity settingsActivity) {
        return ((Boolean) settingsActivity.f59747h.getValue()).booleanValue();
    }

    public static final SettingsDestinations I3(SettingsActivity settingsActivity) {
        return (SettingsDestinations) settingsActivity.f59749j.getValue(settingsActivity, f59743l[0]);
    }

    public static final void J3(SettingsActivity settingsActivity, String str) {
        String string = settingsActivity.getString(C1987R.string._HELP_CENTER_);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        Intent c11 = HMWebActivity.f35395c.c(settingsActivity, string, str);
        c11.setClass(settingsActivity, HelpCenterWebActivity.class);
        settingsActivity.startActivity(c11);
    }

    public static final void K3(SettingsActivity settingsActivity, String str, String str2) {
        settingsActivity.getClass();
        Intent c11 = HMWebActivity.f35395c.c(settingsActivity, str2, str);
        c11.setClass(settingsActivity, HelpCenterWebActivity.class);
        settingsActivity.startActivity(c11);
    }

    @Override // com.withings.wiscale2.settings.Hilt_SettingsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.core.view.l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, -1048870795, new c()));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        v70.a.c("settings", null, 6);
    }

    public final void z3(int i11, androidx.compose.runtime.a aVar, int i12) {
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar.g(236489261);
        if ((i12 & 14) == 0) {
            if (g11.c(i11)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && g11.h()) {
            g11.C();
        } else {
            androidx.compose.material3.a5.a(s2.d.a(i11, g11), null, androidx.compose.foundation.layout.e1.n(androidx.compose.ui.e.f8927a, 24), ((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).J(), g11, 440, 0);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new a(i11, i12));
        }
    }
}
