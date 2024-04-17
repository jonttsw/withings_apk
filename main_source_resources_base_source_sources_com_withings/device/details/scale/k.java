package com.withings.device.details.scale;

import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.layout.x0;
import androidx.compose.runtime.a;
import androidx.compose.runtime.l0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.l1;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.platform.u0;
import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.common.compose.component.y3;
import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import i6.a;
import javax.inject.Inject;
import k1.o1;
import k1.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
import org.joda.time.DateTime;
/* compiled from: ScaleDetailFragment.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u001a²\u0006\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\nX\u008a\u0084\u0002²\u0006\u000e\u0010\t\u001a\u0004\u0018\u00010\b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000b\u001a\u0004\u0018\u00010\n8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0010\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0013\u001a\u0004\u0018\u00010\u00128\nX\u008a\u0084\u0002²\u0006\f\u0010\u0014\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0016\u001a\u0004\u0018\u00010\u00158\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0018\u001a\u0004\u0018\u00010\u00178\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0019\u001a\u0004\u0018\u00010\u00178\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/device/details/scale/k;", "Lcom/withings/device/details/h;", "Lcom/withings/device/Device;", "observedDevice", "", "helpCenterVisible", "Lcom/withings/device/details/scale/g0;", "shareButtonData", "Lnn/k;", "localizeButtonData", "", "nameData", "isB2BDeviceRestricted", "Lnn/l;", "reInstallData", "isDebugEnabled", "isDebugVisible", "isWallHandleMountInstalled", "Lcom/withings/device/details/scale/f;", "impedanceToggleData", "shouldShowAdvancedSettings", "Lcom/withings/device/details/scale/h0;", "walkThroughData", "Landroid/content/Intent;", "trainingIntent", "scalesModeIntent", "device-details-scale_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class k extends com.withings.device.details.scale.c {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f36948v = 0;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f36949s;
    @Inject

    /* renamed from: t  reason: collision with root package name */
    public y f36950t;
    @Inject

    /* renamed from: u  reason: collision with root package name */
    public m70.i f36951u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScaleDetailFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f36952a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Device f36953b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DateTime f36954c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f36955d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f36956e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z5, Device device, DateTime dateTime, boolean z11, k kVar) {
            super(3);
            this.f36952a = z5;
            this.f36953b = device;
            this.f36954c = dateTime;
            this.f36955d = z11;
            this.f36956e = kVar;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            int i11;
            k kVar;
            androidx.compose.runtime.a aVar2;
            r0.h SectionCardColumn = hVar;
            androidx.compose.runtime.a aVar3 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(SectionCardColumn, "$this$SectionCardColumn");
            if ((intValue & 81) == 16 && aVar3.h()) {
                aVar3.C();
            } else {
                aVar3.s(574515091);
                boolean z5 = this.f36952a;
                k kVar2 = this.f36956e;
                if (z5) {
                    i11 = 2;
                    kVar = kVar2;
                    aVar2 = aVar3;
                    com.withings.common.compose.component.o.g(x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), null, null, ay.b.u(C1987R.string._CHECK_FOR_UPDATE_, aVar3), null, false, false, true, null, null, new com.withings.device.details.scale.g(kVar2), aVar3, 12582912, 0, 886);
                } else {
                    i11 = 2;
                    kVar = kVar2;
                    aVar2 = aVar3;
                }
                aVar2.J();
                androidx.compose.runtime.a aVar4 = aVar2;
                l1 l1Var = (l1) aVar4.D(n1.d());
                e.a aVar5 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e h11 = x0.h(aVar5, yk.h.o(), 0.0f, i11);
                String u11 = ay.b.u(C1987R.string._SL_SERIAL_, aVar4);
                Device device = this.f36953b;
                k kVar3 = kVar;
                com.withings.common.compose.component.o.o(h11, null, u11, null, null, this.f36952a, false, false, null, null, null, new com.withings.device.details.scale.h(l1Var, device, kVar3), s1.b.b(aVar4, 1232907367, new com.withings.device.details.scale.i(device)), aVar4, 0, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, CommonConstant.RETCODE.CLEAR_ACCESSTOKEN_FAIL_NOT_MATCH);
                com.withings.common.compose.component.o.o(x0.h(aVar5, yk.h.o(), 0.0f, i11), null, ay.b.u(C1987R.string._SL_FIRMWARE_, aVar4), null, String.valueOf(device.getFirmware()), true, false, false, null, null, null, null, null, aVar4, 196608, 0, 8138);
                androidx.compose.ui.e h12 = x0.h(aVar5, yk.h.o(), 0.0f, i11);
                String u12 = ay.b.u(C1987R.string.ANDROID_LAST_SYNCHRONIZATION, aVar4);
                DateTime lastUpdate = this.f36954c;
                kotlin.jvm.internal.u.i(lastUpdate, "$lastUpdate");
                com.withings.common.compose.component.o.o(h12, null, u12, null, b50.b.l((Context) aVar4.D(u0.d()), lastUpdate), true, false, false, null, null, null, null, null, aVar4, 196608, 0, 8138);
                if (this.f36955d) {
                    com.withings.common.compose.component.o.g(x0.h(aVar5, yk.h.o(), 0.0f, i11), null, null, androidx.collection.c.r(C1987R.plurals.elabel_regulatory_title, 0, new Object[0], aVar4, ConstantsWs.WS_STATUS_NEW_PASSWORD_REQUIRED), null, true, false, true, null, null, new com.withings.device.details.scale.j(kVar3, device), aVar4, 12779520, 0, 854);
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScaleDetailFragment.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w f36958b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Device f36959c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f36960d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(w wVar, Device device, int i11) {
            super(2);
            this.f36958b = wVar;
            this.f36959c = device;
            this.f36960d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f36960d | 1);
            w wVar = this.f36958b;
            Device device = this.f36959c;
            k.this.G1(wVar, device, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScaleDetailFragment.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1<nn.l> f36962b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f36963c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ o1<Boolean> f36964d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ o1<Boolean> f36965e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ o1<Boolean> f36966f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Device f36967g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ w f36968h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ o1<com.withings.device.details.scale.f> f36969i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(r0 r0Var, Context context, r0 r0Var2, r0 r0Var3, r0 r0Var4, Device device, w wVar, r0 r0Var5) {
            super(3);
            this.f36962b = r0Var;
            this.f36963c = context;
            this.f36964d = r0Var2;
            this.f36965e = r0Var3;
            this.f36966f = r0Var4;
            this.f36967g = device;
            this.f36968h = wVar;
            this.f36969i = r0Var5;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            Context context;
            androidx.compose.runtime.a aVar2;
            String a11;
            k kVar;
            androidx.compose.runtime.a aVar3;
            Device device;
            w wVar;
            int i11;
            boolean isDebugEnabled;
            r0.h SectionCardColumn = hVar;
            androidx.compose.runtime.a aVar4 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(SectionCardColumn, "$this$SectionCardColumn");
            if ((intValue & 81) == 16 && aVar4.h()) {
                aVar4.C();
            } else {
                aVar4.s(612990952);
                int i12 = k.f36948v;
                o1<nn.l> o1Var = this.f36962b;
                boolean c11 = o1Var.getValue().c();
                Context context2 = this.f36963c;
                if (c11) {
                    context = context2;
                    aVar2 = aVar4;
                    com.withings.common.compose.component.o.g(x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), null, null, ay.b.u(C1987R.string._WBS_MENU_CONFIGURATION_, aVar4), null, false, false, true, null, null, new l(context2, o1Var), aVar4, 12582912, 0, 886);
                } else {
                    context = context2;
                    aVar2 = aVar4;
                }
                aVar2.J();
                Boolean value = this.f36964d.getValue();
                androidx.compose.runtime.a aVar5 = aVar2;
                aVar5.s(612991395);
                k kVar2 = k.this;
                if (value == null) {
                    kVar = kVar2;
                    aVar3 = aVar5;
                } else {
                    boolean booleanValue = value.booleanValue();
                    if (booleanValue) {
                        a11 = bn.d.a(aVar5, 1853181388, C1987R.string.wbs08_WallHandleMount_installed, aVar5);
                    } else {
                        a11 = bn.d.a(aVar5, 1853181482, C1987R.string.wbs08_WallHandleMount_notInstalled, aVar5);
                    }
                    String str = a11;
                    androidx.compose.ui.e h11 = x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2);
                    String u11 = ay.b.u(C1987R.string.wbs08_WallHandleMount_title, aVar5);
                    m mVar = new m(context, kVar2, booleanValue);
                    kVar = kVar2;
                    aVar3 = aVar5;
                    com.withings.common.compose.component.o.o(h11, null, u11, null, str, true, false, false, null, null, null, mVar, null, aVar5, 196608, 0, 6090);
                    nm0.y yVar = nm0.y.f85009a;
                }
                aVar3.J();
                androidx.compose.runtime.a aVar6 = aVar3;
                aVar6.s(612992543);
                boolean M1 = k.M1(this.f36965e);
                w wVar2 = this.f36968h;
                Device device2 = this.f36967g;
                if (M1) {
                    androidx.compose.ui.e h12 = x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2);
                    Boolean value2 = this.f36966f.getValue();
                    if (value2 != null) {
                        isDebugEnabled = value2.booleanValue();
                    } else {
                        isDebugEnabled = kVar.A1().isDebugEnabled();
                    }
                    device = device2;
                    wVar = wVar2;
                    com.withings.common.compose.component.o.l(h12, isDebugEnabled, new n(device2, wVar2, kVar), null, ay.b.u(C1987R.string._SL_DEBUG_, aVar6), null, true, false, false, null, aVar6, 1572864, 936);
                } else {
                    device = device2;
                    wVar = wVar2;
                }
                aVar6.J();
                com.withings.device.details.scale.f value3 = this.f36969i.getValue();
                if (value3 == null || !value3.c()) {
                    value3 = null;
                }
                if (value3 != null) {
                    androidx.compose.ui.e h13 = x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2);
                    boolean a12 = value3.a();
                    if (value3.b()) {
                        i11 = C1987R.string._SL_IMPEDANCE_HEARTRATE_;
                    } else {
                        i11 = C1987R.string._SL_IMPEDANCE_;
                    }
                    com.withings.common.compose.component.o.l(h13, a12, new o(device, wVar, kVar), null, ay.b.u(i11, aVar6), null, true, false, false, null, aVar6, 1572864, 936);
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScaleDetailFragment.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w f36971b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f36972c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(w wVar, int i11) {
            super(2);
            this.f36971b = wVar;
            this.f36972c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f36972c | 1);
            k.this.H1(this.f36971b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScaleDetailFragment.kt */
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o1<nn.l> f36973a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1<Boolean> f36974b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o1<com.withings.device.details.scale.f> f36975c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(r0 r0Var, r0 r0Var2, r0 r0Var3) {
            super(0);
            this.f36973a = r0Var;
            this.f36974b = r0Var2;
            this.f36975c = r0Var3;
        }

        @Override // ym0.a
        public final Boolean invoke() {
            com.withings.device.details.scale.f value;
            int i11 = k.f36948v;
            boolean z5 = true;
            if (!this.f36973a.getValue().c() && !k.M1(this.f36974b) && ((value = this.f36975c.getValue()) == null || !value.c())) {
                z5 = false;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScaleDetailFragment.kt */
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r0.h f36977b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f36978c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(r0.h hVar, int i11) {
            super(2);
            this.f36977b = hVar;
            this.f36978c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f36978c | 1);
            k.this.s1(this.f36977b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScaleDetailFragment.kt */
    /* loaded from: classes3.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.l<i6.a, w> {
        g() {
            super(1);
        }

        @Override // ym0.l
        public final w invoke(i6.a aVar) {
            i6.a viewModel = aVar;
            kotlin.jvm.internal.u.j(viewModel, "$this$viewModel");
            k kVar = k.this;
            y yVar = kVar.f36950t;
            if (yVar != null) {
                return yVar.a(kVar.A1());
            }
            kotlin.jvm.internal.u.s("scaleDetailViewModelFactory");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScaleDetailFragment.kt */
    /* loaded from: classes3.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f36980a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f36981b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(w wVar, k kVar) {
            super(3);
            this.f36980a = wVar;
            this.f36981b = kVar;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            k kVar;
            androidx.compose.runtime.a aVar2;
            boolean z5;
            k kVar2;
            androidx.compose.runtime.a aVar3;
            boolean z11;
            r0.h SectionCardColumn = hVar;
            androidx.compose.runtime.a aVar4 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(SectionCardColumn, "$this$SectionCardColumn");
            if ((intValue & 81) == 16 && aVar4.h()) {
                aVar4.C();
            } else {
                w wVar = this.f36980a;
                r0 a11 = t1.d.a(wVar.Y0(), aVar4);
                r0 a12 = t1.d.a(wVar.X0(), aVar4);
                r0 a13 = l0.a(wVar.V0(), null, null, aVar4, 2);
                h0 h0Var = (h0) a11.getValue();
                aVar4.s(-1051912226);
                k kVar3 = this.f36981b;
                if (h0Var == null) {
                    kVar = kVar3;
                    aVar2 = aVar4;
                } else {
                    kVar = kVar3;
                    aVar2 = aVar4;
                    com.withings.common.compose.component.o.g(x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), null, null, ay.b.u(C1987R.string._WALKTRHOUGH_, aVar4), null, false, false, true, null, null, new p(h0Var, kVar3), aVar4, 12582912, 0, 886);
                    nm0.y yVar = nm0.y.f85009a;
                }
                aVar2.J();
                Intent intent = (Intent) a12.getValue();
                androidx.compose.runtime.a aVar5 = aVar2;
                aVar5.s(-1051911236);
                if (intent == null) {
                    aVar3 = aVar5;
                    kVar2 = kVar;
                } else {
                    androidx.compose.ui.e h11 = x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2);
                    if (((h0) a11.getValue()) != null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    k kVar4 = kVar;
                    kVar2 = kVar4;
                    aVar3 = aVar5;
                    com.withings.common.compose.component.o.g(h11, null, null, ay.b.u(C1987R.string.deviceDetailView_tutorial, aVar5), null, z5, false, true, null, null, new q(kVar4, intent), aVar5, 12582912, 0, 854);
                    nm0.y yVar2 = nm0.y.f85009a;
                }
                aVar3.J();
                Intent intent2 = (Intent) a13.getValue();
                if (intent2 != null) {
                    androidx.compose.ui.e h12 = x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2);
                    if (((h0) a11.getValue()) == null && ((Intent) a12.getValue()) == null) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    androidx.compose.runtime.a aVar6 = aVar3;
                    com.withings.common.compose.component.o.g(h12, null, null, ay.b.u(C1987R.string.modes_title, aVar6), null, z11, false, true, null, null, new r(kVar2, intent2), aVar6, 12582912, 0, 854);
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScaleDetailFragment.kt */
    /* loaded from: classes3.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w f36983b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f36984c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(w wVar, int i11) {
            super(2);
            this.f36983b = wVar;
            this.f36984c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f36984c | 1);
            k.this.I1(this.f36983b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScaleDetailFragment.kt */
    /* loaded from: classes3.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Device f36985a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1<String> f36986b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f36987c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ w f36988d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ o1<g0> f36989e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ o1<Boolean> f36990f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Context f36991g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ o1<nn.k> f36992h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Device device, r0 r0Var, k kVar, w wVar, r0 r0Var2, r0 r0Var3, Context context, r0 r0Var4) {
            super(3);
            this.f36985a = device;
            this.f36986b = r0Var;
            this.f36987c = kVar;
            this.f36988d = wVar;
            this.f36989e = r0Var2;
            this.f36990f = r0Var3;
            this.f36991g = context;
            this.f36992h = r0Var4;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            float f11;
            k kVar;
            Context context;
            androidx.compose.runtime.a aVar2;
            k kVar2;
            androidx.compose.runtime.a aVar3;
            r0.h SectionCardColumn = hVar;
            androidx.compose.runtime.a aVar4 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(SectionCardColumn, "$this$SectionCardColumn");
            if ((intValue & 81) == 16 && aVar4.h()) {
                aVar4.C();
            } else {
                int i11 = k.f36948v;
                String value = this.f36986b.getValue();
                aVar4.s(646692124);
                w wVar = this.f36988d;
                Device device = this.f36985a;
                k kVar3 = this.f36987c;
                if (value != null) {
                    kVar3.t1(value, device, wVar, aVar4, 4672);
                    nm0.y yVar = nm0.y.f85009a;
                }
                aVar4.J();
                aVar4.s(646692239);
                if (l2.d.e()) {
                    f11 = 0.0f;
                    kVar = kVar3;
                    com.withings.common.compose.component.o.l(x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), device.isSyncDisabled(), new s(device, wVar), null, ay.b.u(C1987R.string.setting_disableSync, aVar4), null, true, false, false, null, aVar4, 1572864, 936);
                } else {
                    f11 = 0.0f;
                    kVar = kVar3;
                }
                aVar4.J();
                g0 value2 = this.f36989e.getValue();
                aVar4.s(646692820);
                Context context2 = this.f36991g;
                if (value2 == null) {
                    context = context2;
                    aVar2 = aVar4;
                    kVar2 = kVar;
                } else {
                    aVar4.s(646692857);
                    if (value2.b() && !this.f36990f.getValue().booleanValue()) {
                        k kVar4 = kVar;
                        kVar2 = kVar4;
                        context = context2;
                        aVar2 = aVar4;
                        com.withings.common.compose.component.o.g(x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), f11, 2), null, null, ay.b.u(C1987R.string._WBS_MENU_SHARING_, aVar4), null, true, false, true, null, null, new t(kVar4, context2, value2), aVar4, 12779520, 0, 854);
                    } else {
                        context = context2;
                        aVar2 = aVar4;
                        kVar2 = kVar;
                    }
                    aVar2.J();
                    nm0.y yVar2 = nm0.y.f85009a;
                }
                aVar2.J();
                nn.k value3 = this.f36992h.getValue();
                if (value3 != null) {
                    androidx.compose.runtime.a aVar5 = aVar2;
                    aVar5.s(646693496);
                    if (value3.b()) {
                        aVar3 = aVar5;
                        com.withings.common.compose.component.o.g(x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), f11, 2), null, null, ay.b.u(C1987R.string._WS50_SETUP_LOCATION_TITLE_, aVar5), null, true, false, true, null, null, new u(kVar2, context, value3), aVar5, 12779520, 0, 854);
                    } else {
                        aVar3 = aVar5;
                    }
                    aVar3.J();
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScaleDetailFragment.kt */
    /* renamed from: com.withings.device.details.scale.k$k  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0488k extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w f36994b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f36995c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0488k(w wVar, int i11) {
            super(2);
            this.f36994b = wVar;
            this.f36995c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f36995c | 1);
            k.this.J1(this.f36994b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public k() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G1(w wVar, Device device, androidx.compose.runtime.a aVar, int i11) {
        boolean z5;
        androidx.compose.runtime.b g11 = aVar.g(1107662251);
        DateTime dateTime = (DateTime) t1.d.a(wVar.z0(), g11).getValue();
        if (dateTime == null) {
            dateTime = device.getAssociationDate();
        }
        DateTime dateTime2 = dateTime;
        r0 a11 = l0.a(wVar.Z0(), Boolean.TRUE, null, g11, 2);
        if (((Boolean) t1.d.b(wVar.g0(), Boolean.FALSE, g11).getValue()).booleanValue() && !((Boolean) a11.getValue()).booleanValue()) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean z11 = z5;
        y3.d(null, ay.b.u(C1987R.string._SETTINGS_ABOUT_, g11), null, 0.0f, 0.0f, 0L, s1.b.b(g11, 764232437, new a(z11, device, dateTime2, wVar.a1(), this)), g11, 1572864, 61);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(wVar, device, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H1(w wVar, androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(-1063268538);
        Device device = (Device) t1.d.b(wVar.k0(), A1(), g11).getValue();
        if (device == null) {
            device = A1();
        }
        Device device2 = device;
        r0 b10 = t1.d.b(wVar.A0(), new nn.l(0), g11);
        r0 a11 = l0.a(wVar.Z0(), Boolean.TRUE, null, g11, 2);
        r0 a12 = t1.d.a(wVar.F0(), g11);
        r0 b11 = t1.d.b(wVar.G0(), Boolean.FALSE, g11);
        r0 b12 = t1.d.b(wVar.K0(), null, g11);
        r0 a13 = t1.d.a(wVar.U0(), g11);
        Context context = (Context) g11.D(u0.d());
        boolean booleanValue = ((Boolean) b11.getValue()).booleanValue();
        g11.s(-1661335195);
        boolean K = g11.K((nn.l) b10.getValue()) | g11.K((Boolean) a12.getValue()) | g11.a(booleanValue);
        Object t11 = g11.t();
        if (K || t11 == a.C0060a.a()) {
            t11 = l0.e(new e(b10, b11, a13));
            g11.n(t11);
        }
        g11.J();
        if (((Boolean) ((o1) t11).getValue()).booleanValue() && !((Boolean) a11.getValue()).booleanValue()) {
            y3.d(null, ay.b.u(C1987R.string._ADVANCED_SETTINGS_, g11), null, 0.0f, 0.0f, 0L, s1.b.b(g11, -464862741, new c(b10, context, b12, b11, a12, device2, wVar, a13)), g11, 1572864, 61);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d(wVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I1(w wVar, androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(-200893049);
        y3.d(null, ay.b.u(C1987R.string._HELP_, g11), null, 0.0f, 0.0f, 0L, s1.b.b(g11, 1280128209, new h(wVar, this)), g11, 1572864, 61);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new i(wVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J1(w wVar, androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(-1634274587);
        Device device = (Device) t1.d.b(wVar.k0(), A1(), g11).getValue();
        if (device == null) {
            device = A1();
        }
        Device device2 = device;
        r0 a11 = t1.d.a(wVar.W0(), g11);
        fl.h deviceLiveData = wVar.k0();
        kotlin.jvm.internal.u.j(deviceLiveData, "deviceLiveData");
        r0 a12 = t1.d.a(e1.b(deviceLiveData, new x(wVar)), g11);
        r0 a13 = t1.d.a(wVar.r0(), g11);
        Context context = (Context) g11.D(u0.d());
        y3.d(null, ay.b.u(C1987R.string._SETTINGS_, g11), null, 0.0f, 0.0f, 0L, s1.b.b(g11, -1211312849, new j(device2, a13, this, wVar, a11, l0.a(wVar.Z0(), Boolean.TRUE, null, g11, 2), context, a12)), g11, 1572864, 61);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new C0488k(wVar, i11));
        }
    }

    public static final boolean M1(o1 o1Var) {
        return ((Boolean) o1Var.getValue()).booleanValue();
    }

    @Override // com.withings.device.details.h
    public final boolean C1() {
        return this.f36949s;
    }

    @Override // com.withings.device.details.h
    protected final void s1(r0.h hVar, androidx.compose.runtime.a aVar, int i11) {
        i6.a aVar2;
        kotlin.jvm.internal.u.j(hVar, "<this>");
        androidx.compose.runtime.b g11 = aVar.g(-1779038603);
        g gVar = new g();
        g11.s(419377738);
        androidx.lifecycle.n1 a11 = j6.a.a(g11);
        if (a11 != null) {
            i6.c cVar = new i6.c();
            cVar.a(q0.b(w.class), gVar);
            i6.b b10 = cVar.b();
            if (a11 instanceof androidx.lifecycle.u) {
                aVar2 = ((androidx.lifecycle.u) a11).getDefaultViewModelCreationExtras();
            } else {
                aVar2 = a.C1058a.f71431b;
            }
            g1 a12 = j6.b.a(w.class, a11, null, b10, aVar2, g11);
            g11.J();
            w wVar = (w) a12;
            Device device = (Device) t1.d.b(wVar.k0(), A1(), g11).getValue();
            if (device == null) {
                device = A1();
            }
            J1(wVar, g11, 72);
            H1(wVar, g11, 72);
            r0 b11 = t1.d.b(wVar.y0(), Boolean.FALSE, g11);
            g11.s(1634598627);
            if (((Boolean) b11.getValue()).booleanValue()) {
                I1(wVar, g11, 72);
            }
            g11.J();
            G1(wVar, device, g11, 584);
            androidx.compose.runtime.v o02 = g11.o0();
            if (o02 != null) {
                o02.G(new f(hVar, i11));
                return;
            }
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }

    public k(int i11) {
        this.f36949s = true;
    }
}
