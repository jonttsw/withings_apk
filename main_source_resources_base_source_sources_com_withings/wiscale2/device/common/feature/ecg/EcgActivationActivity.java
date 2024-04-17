package com.withings.wiscale2.device.common.feature.ecg;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.common.compose.component.VideoPlayer;
import com.withings.device.Device;
import com.withings.ecg.review.EcgReviewStatusValue;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.features.platform.model.RoomPlatformFeatureRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import x1.b;
/* compiled from: EcgActivationActivity.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0019²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u0004\u0018\u00010\t8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\f\u001a\u0004\u0018\u00010\u000b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\r\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0013\u001a\u0004\u0018\u00010\u00128\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0015\u001a\u0004\u0018\u00010\u00148\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u0004\u0018\u00010\t8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/ecg/EcgActivationActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "EcgMeasurementEndBroadcastReceiver", "", "needUserInfoUpdate", "", "shouldDisplayUserInfoDialog", "", "flowSpecificity", "Landroidx/navigation/d;", "navBackStackEntry", "openAlertDialogMeasurementNeeded", "Lcom/withings/wiscale2/device/common/feature/ecg/t5;", "selectedState", "", "states", "Lrq/e;", "ecgReviewStatusInfo", "Lcom/airbnb/lottie/i;", "composition", "videoVisible", "loading", "phoneNumber", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class EcgActivationActivity extends Hilt_EcgActivationActivity {

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f51062k = {androidx.camera.core.v.c(EcgActivationActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0)};
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public e5 f51066h;

    /* renamed from: j  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f51068j;

    /* renamed from: e  reason: collision with root package name */
    private final e f51063e = new e(this);

    /* renamed from: f  reason: collision with root package name */
    private final PlatformFeatureRepository f51064f = RoomPlatformFeatureRepository.Companion.get();

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f51065g = nm0.h.b(new b());

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f51067i = nm0.h.b(new f());

    /* compiled from: EcgActivationActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/ecg/EcgActivationActivity$EcgMeasurementEndBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public final class EcgMeasurementEndBroadcastReceiver extends BroadcastReceiver {
        public EcgMeasurementEndBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(intent, "intent");
            boolean e11 = kotlin.jvm.internal.u.e(intent, new Intent("ACTION_ECG_MEASUREMENT_STARTED"));
            EcgActivationActivity ecgActivationActivity = EcgActivationActivity.this;
            if (e11) {
                String j5 = androidx.health.connect.client.units.d.j(ecgActivationActivity.f51064f, EcgActivationActivity.O3(ecgActivationActivity).getId());
                if ("ecg_scanwatch".length() > 0 && "ecg_in_progress".length() > 0) {
                    int i11 = v70.a.f103433b;
                    v70.a.c("ecg_in_progress", kotlin.collections.s0.j(new nm0.j("flow", "ecg_scanwatch"), new nm0.j("flow_specificity", j5)), 2);
                }
            }
            ecgActivationActivity.U3().Z1(true);
        }
    }

    /* compiled from: EcgActivationActivity.kt */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f51070a;

        static {
            int[] iArr = new int[EcgReviewStatusValue.values().length];
            try {
                EcgReviewStatusValue ecgReviewStatusValue = EcgReviewStatusValue.f38854a;
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EcgReviewStatusValue ecgReviewStatusValue2 = EcgReviewStatusValue.f38854a;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EcgReviewStatusValue ecgReviewStatusValue3 = EcgReviewStatusValue.f38854a;
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EcgReviewStatusValue ecgReviewStatusValue4 = EcgReviewStatusValue.f38854a;
                iArr[6] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                EcgReviewStatusValue ecgReviewStatusValue5 = EcgReviewStatusValue.f38854a;
                iArr[7] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f51070a = iArr;
        }
    }

    /* compiled from: EcgActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<EcgMeasurementEndBroadcastReceiver> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final EcgMeasurementEndBroadcastReceiver invoke() {
            return new EcgMeasurementEndBroadcastReceiver();
        }
    }

    /* compiled from: EcgActivationActivity.kt */
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
                yk.o.b(false, s1.b.b(aVar2, 916676578, new w3(EcgActivationActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: EcgActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class d implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f51073a;

        d(ym0.l lVar) {
            this.f51073a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f51073a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f51073a;
        }

        public final int hashCode() {
            return this.f51073a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f51073a.invoke(obj);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class e implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f51074a = nm0.h.b(new y3(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f51075b;

        public e(Activity activity) {
            this.f51075b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f51074a.getValue();
        }
    }

    /* compiled from: EcgActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<o4> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final o4 invoke() {
            EcgActivationActivity ecgActivationActivity = EcgActivationActivity.this;
            return (o4) new androidx.lifecycle.k1(ecgActivationActivity, new m4(ecgActivationActivity)).a(o4.class);
        }
    }

    public EcgActivationActivity() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new g40.b(this, 2));
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f51068j = registerForActivityResult;
    }

    public static final void B3(EcgActivationActivity ecgActivationActivity, r8.n nVar, androidx.compose.runtime.a aVar, int i11) {
        ecgActivationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-1605552837);
        float o11 = yk.h.o();
        float c11 = yk.h.c();
        r0.x xVar = new r0.x(o11, c11, o11, c11);
        int i12 = androidx.compose.foundation.layout.e.f4229i;
        wk.c0.b(null, null, null, new com.withings.wiscale2.device.common.feature.ecg.d(nVar), com.withings.wiscale2.device.common.feature.ecg.b.f51187a, com.withings.wiscale2.device.common.feature.ecg.b.f51188b, null, null, 0L, false, xVar, androidx.compose.foundation.layout.e.o(yk.h.B()), 0.0f, false, s1.b.b(g11, -1950035019, new g(ecgActivationActivity)), g11, 221184, 24576, 13255);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new h(ecgActivationActivity, nVar, i11));
        }
    }

    public static final void C3(EcgActivationActivity ecgActivationActivity, r8.n nVar, xb.b bVar, androidx.compose.runtime.a aVar, int i11) {
        ecgActivationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(1614725213);
        e.a aVar2 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e d11 = androidx.compose.foundation.layout.e1.d(aVar2);
        g11.s(-483455358);
        androidx.compose.ui.layout.l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a11 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(d11);
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
            dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
            androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(aVar2, 1.0f);
            if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                androidx.compose.ui.e n11 = e11.n(new LayoutWeightElement(en0.r.f(1.0f, Float.MAX_VALUE), true));
                androidx.compose.ui.layout.l0 e12 = androidx.camera.camera2.internal.v0.e(g11, 733328855, false, g11, -1323940314);
                int G2 = g11.G();
                k1.v0 l6 = g11.l();
                ym0.a a12 = g.a.a();
                s1.a c12 = androidx.compose.ui.layout.y.c(n11);
                if (g11.i() instanceof k1.d) {
                    g11.A();
                    if (g11.e()) {
                        g11.F(a12);
                    } else {
                        g11.m();
                    }
                    ym0.p b12 = com.withings.authentication.e.b(g11, e12, g11, l6);
                    if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G2))) {
                        androidx.camera.camera2.internal.l0.d(G2, g11, G2, b12);
                    }
                    c12.invoke(k1.j1.a(g11), g11, 0);
                    g11.s(2058660585);
                    xb.a.a(bVar, null, null, 0.0f, 0L, 0L, 0L, s1.b.b(g11, -318607170, new w(nVar, ecgActivationActivity)), g11, 12582920 | ((i11 >> 3) & 14), 126);
                    g11.J();
                    g11.o();
                    g11.J();
                    g11.J();
                    wk.i.a(null, true, s1.b.b(g11, -214773196, new x(ecgActivationActivity)), s1.b.b(g11, -1215829067, new y(ecgActivationActivity)), g11, 3504, 1);
                    androidx.compose.runtime.v b13 = androidx.compose.material.h6.b(g11);
                    if (b13 != null) {
                        b13.G(new z(ecgActivationActivity, nVar, bVar, i11));
                        return;
                    }
                    return;
                }
                a3.g.s();
                throw null;
            }
            throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
        }
        a3.g.s();
        throw null;
    }

    public static final void D3(EcgActivationActivity ecgActivationActivity, int i11, int i12, int i13, ym0.a aVar, androidx.compose.runtime.a aVar2, int i14) {
        int i15;
        boolean z5;
        int i16;
        int i17;
        int i18;
        int i19;
        ecgActivationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar2.g(-607111633);
        if ((i14 & 14) == 0) {
            if (g11.c(i11)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i15 = i19 | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 112) == 0) {
            if (g11.c(i12)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i15 |= i18;
        }
        if ((i14 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.c(i13)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i15 |= i17;
        }
        if ((i14 & 7168) == 0) {
            if (g11.w(aVar)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i15 |= i16;
        }
        if ((i15 & 5851) == 1170 && g11.h()) {
            g11.C();
        } else {
            g11.s(927159617);
            if ((i15 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object t11 = g11.t();
            if (z5 || t11 == a.C0060a.a()) {
                t11 = new a0(aVar);
                g11.n(t11);
            }
            g11.J();
            s1.a b10 = s1.b.b(g11, 1166233570, new b0(i11));
            s1.a b11 = s1.b.b(g11, 125941731, new c0(i12));
            float o11 = yk.h.o();
            float q11 = yk.h.q();
            wk.c0.b(null, null, null, (ym0.a) t11, b10, b11, null, null, 0L, false, new r0.x(o11, q11, o11, q11), null, 0.0f, false, s1.b.b(g11, 1164360361, new d0(i13)), g11, 221184, 24576, 15303);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new e0(ecgActivationActivity, i11, i12, i13, aVar, i14));
        }
    }

    public static final void E3(EcgActivationActivity ecgActivationActivity, r8.n nVar, androidx.compose.runtime.a aVar, int i11) {
        ecgActivationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-1634674653);
        f0 f0Var = new f0(nVar);
        s1.a aVar2 = com.withings.wiscale2.device.common.feature.ecg.b.f51189c;
        s1.a aVar3 = com.withings.wiscale2.device.common.feature.ecg.b.f51190d;
        float o11 = yk.h.o();
        float q11 = yk.h.q();
        wk.c0.b(null, null, null, f0Var, aVar2, aVar3, null, null, 0L, false, new r0.x(o11, q11, o11, q11), null, 0.0f, false, com.withings.wiscale2.device.common.feature.ecg.b.f51191e, g11, 221184, 24576, 15303);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new g0(ecgActivationActivity, nVar, i11));
        }
    }

    public static final void F3(EcgActivationActivity ecgActivationActivity, r8.n nVar, i5 i5Var, boolean z5, ym0.a aVar, ym0.a aVar2, androidx.compose.runtime.a aVar3, int i11, int i12) {
        boolean z11;
        ym0.a aVar4;
        ecgActivationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar3.g(-1523715751);
        if ((i12 & 4) != 0) {
            z11 = true;
        } else {
            z11 = z5;
        }
        if ((i12 & 8) != 0) {
            aVar4 = null;
        } else {
            aVar4 = aVar;
        }
        k1.y.f(nm0.y.f85009a, new h0(ecgActivationActivity, aVar2, null), g11);
        androidx.compose.material.t5.b(null, null, null, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, ((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).a(), 0L, s1.b.b(g11, 1895963355, new k0(ecgActivationActivity, i5Var, z11, aVar4, nVar)), g11, 0, 12582912, 98303);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new l0(ecgActivationActivity, nVar, i5Var, z11, aVar4, aVar2, i11, i12));
        }
    }

    public static final void G3(EcgActivationActivity ecgActivationActivity, androidx.compose.runtime.a aVar, int i11) {
        long j5;
        ecgActivationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-1875366957);
        e.a aVar2 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e d11 = androidx.compose.foundation.layout.e1.d(aVar2);
        androidx.compose.ui.layout.l0 e11 = androidx.camera.camera2.internal.v0.e(g11, 733328855, false, g11, -1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a11 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(d11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a11);
            } else {
                g11.m();
            }
            ym0.p b10 = com.withings.authentication.e.b(g11, e11, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
            androidx.compose.foundation.layout.m mVar = androidx.compose.foundation.layout.m.f4307a;
            j5 = d2.f0.f63265i;
            com.withings.common.compose.component.c5.a(j5, 0L, null, false, null, null, null, null, false, new m0(ecgActivationActivity), g11, 6, ConstantsWs.WS_STATUS_ERROR_ARRAY_WAM);
            float f11 = 24;
            androidx.compose.material.f5.b(0.0f, 0, 0, 28, ((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).J(), 0L, g11, mVar.g(androidx.compose.foundation.layout.e1.o(aVar2, f11, f11), b.a.e()));
            androidx.compose.runtime.v b11 = androidx.compose.material.h6.b(g11);
            if (b11 != null) {
                b11.G(new n0(ecgActivationActivity, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    public static final void H3(EcgActivationActivity ecgActivationActivity, String str, int i11, int i12, ym0.a aVar, androidx.compose.runtime.a aVar2, int i13) {
        int i14;
        boolean z5;
        int i15;
        int i16;
        int i17;
        int i18;
        ecgActivationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar2.g(1246866083);
        if ((i13 & 14) == 0) {
            if (g11.K(str)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i14 = i18 | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            if (g11.c(i11)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i14 |= i17;
        }
        if ((i13 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.c(i12)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i14 |= i16;
        }
        if ((i13 & 7168) == 0) {
            if (g11.w(aVar)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i14 |= i15;
        }
        if ((i14 & 5851) == 1170 && g11.h()) {
            g11.C();
        } else {
            g11.s(-776087380);
            if ((i14 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object t11 = g11.t();
            if (z5 || t11 == a.C0060a.a()) {
                t11 = new o0(aVar);
                g11.n(t11);
            }
            g11.J();
            s1.a b10 = s1.b.b(g11, 212513494, new p0(str));
            s1.a b11 = s1.b.b(g11, 1497576023, new q0(i11));
            float o11 = yk.h.o();
            float q11 = yk.h.q();
            wk.c0.b(null, null, null, (ym0.a) t11, b10, b11, null, null, 0L, false, new r0.x(o11, q11, o11, q11), null, 0.0f, false, s1.b.b(g11, 1136484893, new r0(i12)), g11, 221184, 24576, 15303);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new s0(ecgActivationActivity, str, i11, i12, aVar, i13));
        }
    }

    public static final void I3(EcgActivationActivity ecgActivationActivity, r8.n nVar, androidx.compose.runtime.a aVar, int i11) {
        ecgActivationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-1018814265);
        t0 t0Var = new t0(nVar);
        s1.a aVar2 = com.withings.wiscale2.device.common.feature.ecg.b.f51194h;
        float o11 = yk.h.o();
        float q11 = yk.h.q();
        wk.c0.b(null, null, null, t0Var, null, aVar2, null, null, 0L, false, new r0.x(o11, q11, o11, q11), null, 0.0f, false, s1.b.b(g11, 589764033, new a1(ecgActivationActivity)), g11, 196608, 24576, 15319);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b1(ecgActivationActivity, nVar, i11));
        }
    }

    public static final void J3(EcgActivationActivity ecgActivationActivity, rq.e eVar, ym0.a aVar, androidx.compose.runtime.a aVar2, int i11) {
        ecgActivationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar2.g(-1537109244);
        androidx.compose.material.t5.b(ah.k.s(androidx.compose.ui.e.f8927a), null, s1.b.b(g11, 549078815, new d1(ecgActivationActivity)), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, s1.b.b(g11, 403944326, new i1(eVar, ecgActivationActivity, aVar)), g11, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 12582912, 131066);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new j1(ecgActivationActivity, eVar, aVar, i11));
        }
    }

    public static final void K3(EcgActivationActivity ecgActivationActivity, r8.n nVar, androidx.compose.runtime.a aVar, int i11) {
        ecgActivationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-519844931);
        g11.s(773894976);
        g11.s(-492369756);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.datastore.preferences.protobuf.e.b(k1.y.i(g11), g11);
        }
        g11.J();
        k1 k1Var = new k1(nVar);
        s1.a b10 = s1.b.b(g11, 1188178545, new l1(ecgActivationActivity));
        float o11 = yk.h.o();
        float q11 = yk.h.q();
        wk.c0.b(null, null, null, k1Var, null, b10, null, null, 0L, false, new r0.x(o11, q11, o11, q11), null, 0.0f, false, s1.b.b(g11, 1703225015, new p1(ecgActivationActivity, ((androidx.compose.runtime.k) t11).a(), (androidx.compose.ui.platform.k4) androidx.appcompat.view.menu.d.b(g11))), g11, 196608, 24576, 15319);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new q1(ecgActivationActivity, nVar, i11));
        }
    }

    public static final void L3(EcgActivationActivity ecgActivationActivity, r8.n nVar, t5 t5Var, ym0.a aVar, androidx.compose.runtime.a aVar2, int i11) {
        ecgActivationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar2.g(-631182227);
        r1 r1Var = new r1(nVar);
        s1.a aVar3 = com.withings.wiscale2.device.common.feature.ecg.b.f51192f;
        s1.a aVar4 = com.withings.wiscale2.device.common.feature.ecg.b.f51193g;
        float o11 = yk.h.o();
        float q11 = yk.h.q();
        wk.c0.b(null, null, null, r1Var, aVar3, aVar4, null, null, 0L, false, new r0.x(o11, q11, o11, q11), null, 0.0f, false, s1.b.b(g11, 905479475, new s1(t5Var, aVar)), g11, 221184, 24576, 15303);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new t1(ecgActivationActivity, nVar, t5Var, aVar, i11));
        }
    }

    public static final void M3(EcgActivationActivity ecgActivationActivity, androidx.compose.runtime.a aVar, int i11) {
        boolean z5;
        ecgActivationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(624276031);
        k1.r0 a11 = androidx.compose.runtime.l0.a(ecgActivationActivity.U3().t1(), -1L, null, g11, 2);
        long longValue = ((Number) a11.getValue()).longValue();
        g11.s(-1730531868);
        boolean d11 = g11.d(longValue);
        Object t11 = g11.t();
        if (d11 || t11 == a.C0060a.a()) {
            if (((Number) a11.getValue()).longValue() >= 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            t11 = androidx.compose.runtime.l0.f(Boolean.valueOf(z5), androidx.compose.runtime.v0.f8878a);
            g11.n(t11);
        }
        k1.r0 r0Var = (k1.r0) t11;
        g11.J();
        if (((Boolean) r0Var.getValue()).booleanValue()) {
            g11.s(-1730531665);
            boolean K = g11.K(r0Var);
            Object t12 = g11.t();
            if (K || t12 == a.C0060a.a()) {
                t12 = new u1(r0Var);
                g11.n(t12);
            }
            ym0.a aVar2 = (ym0.a) t12;
            g11.J();
            String u11 = ay.b.u(C1987R.string.beforeWeSetUpECG, g11);
            String u12 = ay.b.u(C1987R.string.beforeWeSetUpECG_description, g11);
            String u13 = ay.b.u(C1987R.string._EDIT_PROFILE_, g11);
            v1 v1Var = new v1(ecgActivationActivity, r0Var);
            String u14 = ay.b.u(C1987R.string._CANCEL_, g11);
            g11.s(-1730530967);
            boolean K2 = g11.K(r0Var);
            Object t13 = g11.t();
            if (K2 || t13 == a.C0060a.a()) {
                t13 = new w1(r0Var);
                g11.n(t13);
            }
            g11.J();
            wk.p.a(aVar2, u11, u12, u13, 0L, v1Var, u14, 0L, (ym0.a) t13, g11, 0, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new x1(ecgActivationActivity, i11));
        }
    }

    public static final void N3(EcgActivationActivity ecgActivationActivity, r8.n nVar, androidx.compose.runtime.a aVar, int i11) {
        androidx.navigation.t d11;
        ecgActivationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(913110650);
        k1.r0 a11 = t1.d.a(ecgActivationActivity.U3().l1(), g11);
        k1.r0 b10 = androidx.navigation.compose.r.b(nVar, g11);
        String str = (String) a11.getValue();
        g11.s(-2098892806);
        boolean K = g11.K(a11);
        Object t11 = g11.t();
        if (K || t11 == a.C0060a.a()) {
            t11 = new y1(a11, null);
            g11.n(t11);
        }
        g11.J();
        k1.y.f(str, (ym0.p) t11, g11);
        k1.y.f((androidx.navigation.d) b10.getValue(), new z1(ecgActivationActivity, a11, b10, null), g11);
        o4 U3 = ecgActivationActivity.U3();
        androidx.navigation.d dVar = (androidx.navigation.d) b10.getValue();
        String str2 = (dVar == null || (d11 = dVar.d()) == null || (str2 = d11.v()) == null) ? "Loading" : "Loading";
        U3.getClass();
        U3.j2();
        if (kotlin.jvm.internal.u.e(str2, "Instructions")) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(U3), null, null, new v4(U3, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(U3), Dispatchers.getIO(), null, new r4(U3, null), 2, null);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new a2(ecgActivationActivity, nVar, i11));
        }
    }

    public static final Device O3(EcgActivationActivity ecgActivationActivity) {
        return (Device) ecgActivationActivity.f51063e.getValue(ecgActivationActivity, f51062k[0]);
    }

    public static final void S3(EcgActivationActivity ecgActivationActivity) {
        ecgActivationActivity.U3().e1().observe(ecgActivationActivity, new d(new h3(ecgActivationActivity)));
        ecgActivationActivity.U3().n1().v(ecgActivationActivity, new i3(ecgActivationActivity));
        ecgActivationActivity.U3().v1().observe(ecgActivationActivity, new d(new j3(ecgActivationActivity)));
        androidx.lifecycle.e1.a(ecgActivationActivity.U3().g1()).observe(ecgActivationActivity, new d(new k3(ecgActivationActivity)));
        ecgActivationActivity.U3().C1().v(ecgActivationActivity, new l3(ecgActivationActivity));
    }

    public static final void T3(EcgActivationActivity ecgActivationActivity, String str, String str2, Bundle bundle) {
        EcgReviewStatusValue ecgReviewStatusValue;
        int i11;
        String string;
        ecgActivationActivity.getClass();
        switch (str2.hashCode()) {
            case -1751746413:
                if (str2.equals("VideoCallIntro")) {
                    int i12 = v70.a.f103433b;
                    v70.a.c("video_call", kotlin.collections.s0.j(new nm0.j("flow", "onboarding_ecg_scanwatch"), new nm0.j("flow_specificity", str)), 2);
                    return;
                }
                return;
            case -1479427822:
                if (str2.equals("ReviewExplanations")) {
                    int i13 = v70.a.f103433b;
                    v70.a.c("ecg_end", kotlin.collections.s0.j(new nm0.j("flow", "ecg_scanwatch"), new nm0.j("flow_specificity", str)), 2);
                    return;
                }
                return;
            case -1067437477:
                if (str2.equals("IntroForUs")) {
                    int i14 = v70.a.f103433b;
                    v70.a.c("ecg_start", kotlin.collections.s0.j(new nm0.j("flow", "ecg_scanwatch"), new nm0.j("flow_specificity", str)), 2);
                    return;
                }
                return;
            case -680498753:
                if (str2.equals("EcgReviewStatusScreen")) {
                    rq.b bVar = (rq.b) ecgActivationActivity.U3().i1().getValue();
                    String str3 = null;
                    if (bVar != null) {
                        ecgReviewStatusValue = bVar.d();
                    } else {
                        ecgReviewStatusValue = null;
                    }
                    if (ecgReviewStatusValue == null) {
                        i11 = -1;
                    } else {
                        i11 = a.f51070a[ecgReviewStatusValue.ordinal()];
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 == 5) {
                                        str3 = "rejected_status_network";
                                    }
                                } else {
                                    str3 = "rejected_status_noisy";
                                }
                            } else {
                                str3 = "needs_measure";
                            }
                        } else {
                            str3 = "rejected_status";
                        }
                    } else {
                        str3 = "awaiting_approval";
                    }
                    if (str3 != null && str3.length() > 0) {
                        int i15 = v70.a.f103433b;
                        v70.a.c(str3, kotlin.collections.s0.j(new nm0.j("flow", "onboarding_ecg_scanwatch"), new nm0.j("flow_specificity", str)), 2);
                        return;
                    }
                    return;
                }
                return;
            case 80208581:
                if (str2.equals("Step1")) {
                    int i16 = v70.a.f103433b;
                    v70.a.c("ecg_explanation", kotlin.collections.s0.j(new nm0.j("flow", "onboarding_ecg_scanwatch"), new nm0.j("flow_specificity", str)), 2);
                    return;
                }
                return;
            case 80208582:
                if (str2.equals("Step2")) {
                    int i17 = v70.a.f103433b;
                    v70.a.c("afib_explanation", kotlin.collections.s0.j(new nm0.j("flow", "onboarding_ecg_scanwatch"), new nm0.j("flow_specificity", str)), 2);
                    return;
                }
                return;
            case 80208583:
                if (str2.equals("Step3")) {
                    int i18 = v70.a.f103433b;
                    v70.a.c("heart_attack_disclaimer", kotlin.collections.s0.j(new nm0.j("flow", "onboarding_ecg_scanwatch"), new nm0.j("flow_specificity", str)), 2);
                    return;
                }
                return;
            case 82650203:
                if (str2.equals("Video")) {
                    int i19 = v70.a.f103433b;
                    v70.a.c("video_tutorial", kotlin.collections.s0.j(new nm0.j("flow", "ecg_scanwatch"), new nm0.j("flow_specificity", str)), 2);
                    return;
                }
                return;
            case 576465947:
                if (str2.equals("StateSelection")) {
                    int i21 = v70.a.f103433b;
                    v70.a.c("state_request", kotlin.collections.s0.j(new nm0.j("flow", "onboarding_ecg_scanwatch"), new nm0.j("flow_specificity", str)), 2);
                    return;
                }
                return;
            case 1228767006:
                if (str2.equals("Support/{title}/{description}/{screenLog}") && bundle != null && (string = bundle.getString("screenLog")) != null && string.length() > 0) {
                    int i22 = v70.a.f103433b;
                    v70.a.c(string, kotlin.collections.s0.j(new nm0.j("flow", "onboarding_ecg_scanwatch"), new nm0.j("flow_specificity", str)), 2);
                    return;
                }
                return;
            case 1480392378:
                if (str2.equals("AcceptationTerms")) {
                    int i23 = v70.a.f103433b;
                    v70.a.c("data_sharing_agreement", kotlin.collections.s0.j(new nm0.j("flow", "onboarding_ecg_scanwatch"), new nm0.j("flow_specificity", str)), 2);
                    return;
                }
                return;
            case 1973186678:
                if (str2.equals("HeartbeatExplanations")) {
                    int i24 = v70.a.f103433b;
                    v70.a.c("hh_will_contact_you", kotlin.collections.s0.j(new nm0.j("flow", "ecg_scanwatch"), new nm0.j("flow_specificity", str)), 2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o4 U3() {
        return (o4) this.f51067i.getValue();
    }

    public static void z3(EcgActivationActivity this$0, ActivityResult activityResult) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (activityResult.b() == -1) {
            this$0.U3().U1();
        } else {
            this$0.finish();
        }
    }

    public final void A3(int i11, int i12, int i13, androidx.compose.runtime.a aVar, androidx.compose.ui.e modifier) {
        boolean z5;
        kotlin.jvm.internal.u.j(modifier, "modifier");
        androidx.compose.runtime.b g11 = aVar.g(-1715671849);
        Context context = (Context) g11.D(androidx.compose.ui.platform.u0.d());
        kotlin.jvm.internal.l0 l0Var = new kotlin.jvm.internal.l0();
        l0Var.f76251a = true;
        kotlin.jvm.internal.n0 n0Var = new kotlin.jvm.internal.n0();
        kotlin.jvm.internal.o0 o0Var = new kotlin.jvm.internal.o0();
        g11.s(2119147748);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
            g11.n(t11);
        }
        k1.r0 r0Var = (k1.r0) t11;
        Object a11 = com.huawei.hms.health.a.a(g11, 2119147806);
        if (a11 == a.C0060a.a()) {
            a11 = androidx.compose.runtime.l0.f(Boolean.TRUE, androidx.compose.runtime.v0.f8878a);
            g11.n(a11);
        }
        k1.r0 r0Var2 = (k1.r0) a11;
        Object a12 = com.huawei.hms.health.a.a(g11, 2119147861);
        if (a12 == a.C0060a.a()) {
            VideoPlayer videoPlayer = new VideoPlayer();
            kotlin.jvm.internal.u.j(context, "context");
            androidx.media3.exoplayer.g a13 = videoPlayer.a(context);
            String string = context.getString(i11);
            kotlin.jvm.internal.u.i(string, "getString(...)");
            videoPlayer.b(context, Uri.parse(string), false);
            a13.n(l0Var.f76251a);
            a13.W(2);
            a13.A(n0Var.f76254a, o0Var.f76256a);
            g11.n(a13);
            a12 = a13;
        }
        androidx.media3.exoplayer.g gVar = (androidx.media3.exoplayer.g) a12;
        g11.J();
        l0.g.e(((Boolean) r0Var2.getValue()).booleanValue(), null, androidx.compose.animation.p.h(null, 0.0f, 3), androidx.compose.animation.p.i(m0.k.d(2000, 0, null, 6), 2), null, s1.b.b(g11, -1636070481, new b2(this)), g11, 200064, 18);
        if (!((Boolean) r0Var.getValue()).booleanValue() && !((Boolean) r0Var2.getValue()).booleanValue()) {
            z5 = true;
        } else {
            z5 = false;
        }
        l0.g.e(z5, null, androidx.compose.animation.p.h(null, 0.0f, 3), androidx.compose.animation.p.i(m0.k.d(1000, 0, null, 6), 2), null, s1.b.b(g11, 2071274406, new c2(i12, modifier)), g11, 200064, 18);
        l0.g.e(((Boolean) r0Var.getValue()).booleanValue(), null, androidx.compose.animation.p.h(null, 0.0f, 3), androidx.compose.animation.p.i(m0.k.d(1000, 0, null, 6), 2), null, s1.b.b(g11, -2030761689, new f2(modifier, context, this, gVar, l0Var, n0Var, o0Var)), g11, 200064, 18);
        k1.y.c(gVar, new i2(gVar, r0Var2, r0Var, l0Var, n0Var, o0Var), g11);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new j2(this, modifier, i11, i12, i13));
        }
    }

    @Override // com.withings.wiscale2.device.common.feature.ecg.Hilt_EcgActivationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ACTION_ECG_MEASUREMENT_STARTED");
        intentFilter.addAction("ACTION_ECG_MEASUREMENT_FINISHED");
        androidx.core.content.a.registerReceiver(this, (EcgMeasurementEndBroadcastReceiver) this.f51065g.getValue(), intentFilter, 4);
        e.k.a(this, new s1.a(true, -923777208, new c()));
    }

    @Override // com.withings.wiscale2.device.common.feature.ecg.Hilt_EcgActivationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onDestroy() {
        ay.b.w(this, (EcgMeasurementEndBroadcastReceiver) this.f51065g.getValue());
        super.onDestroy();
    }
}
