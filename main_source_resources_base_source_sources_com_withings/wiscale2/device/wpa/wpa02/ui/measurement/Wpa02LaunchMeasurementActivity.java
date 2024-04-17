package com.withings.wiscale2.device.wpa.wpa02.ui.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.b2;
import androidx.compose.material.c5;
import androidx.compose.material.f4;
import androidx.compose.material.f5;
import androidx.compose.material.g6;
import androidx.compose.material.h6;
import androidx.compose.material3.g9;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.android.activity.WithingsActivity;
import com.withings.common.compose.component.q2;
import com.withings.common.compose.component.v4;
import com.withings.device.Device;
import com.withings.device.DeviceModel;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.ui.EnablePermissionsForScanActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.wpa.wpa02.conversation.Wpa02LaunchMeasurementConversation;
import d2.h1;
import k1.j1;
import k1.r0;
import k1.v0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.CoroutineScope;
import x1.b;
/* compiled from: Wpa02LaunchMeasurementActivity.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n²\u0006\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/ui/measurement/Wpa02LaunchMeasurementActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", com.huawei.hms.feature.dynamic.e.b.f28627a, ConstantsWs.JSON_SESSION_KEY_GCONST, "Lne0/c;", "biomarker", "", "selected", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpa02LaunchMeasurementActivity extends WithingsActivity {

    /* renamed from: a  reason: collision with root package name */
    private final s f55470a = new s(this);

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f55471b = nm0.h.b(new o());

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f55472c = nm0.h.b(new p());

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f55473d = nm0.h.b(new r());

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f55474e = nm0.h.b(new t());

    /* renamed from: f  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f55475f;

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f55469h = {androidx.camera.core.v.c(Wpa02LaunchMeasurementActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0)};

    /* renamed from: g  reason: collision with root package name */
    public static final b f55468g = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wpa02LaunchMeasurementActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f55477b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f55478c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f55479d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f55480e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, nm0.y> f55481f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f55482g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f55483h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z5, int i11, boolean z11, boolean z12, ym0.l<? super Boolean, nm0.y> lVar, int i12, int i13) {
            super(2);
            this.f55477b = z5;
            this.f55478c = i11;
            this.f55479d = z11;
            this.f55480e = z12;
            this.f55481f = lVar;
            this.f55482g = i12;
            this.f55483h = i13;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f55482g | 1);
            boolean z5 = this.f55480e;
            ym0.l<Boolean, nm0.y> lVar = this.f55481f;
            Wpa02LaunchMeasurementActivity.this.A3(this.f55477b, this.f55478c, this.f55479d, z5, lVar, aVar, g11, this.f55483h);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Wpa02LaunchMeasurementActivity.kt */
    /* loaded from: classes5.dex */
    public static final class b {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wpa02LaunchMeasurementActivity.kt */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55484a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ym0.a<nm0.y> aVar) {
            super(0);
            this.f55484a = aVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f55484a.invoke();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wpa02LaunchMeasurementActivity.kt */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f55485a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(2);
            this.f55485a = str;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                v4.b(null, ay.b.u(C1987R.string._ERROR_, aVar2), this.f55485a, null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wpa02LaunchMeasurementActivity.kt */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55486a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ym0.a<nm0.y> aVar) {
            super(2);
            this.f55486a = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.c(null, ay.b.u(C1987R.string._CANCEL_, aVar2), null, false, null, null, false, this.f55486a, aVar2, 0, 125);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wpa02LaunchMeasurementActivity.kt */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f55488b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55489c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f55490d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, ym0.a<nm0.y> aVar, int i11) {
            super(2);
            this.f55488b = str;
            this.f55489c = aVar;
            this.f55490d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f55490d | 1);
            String str = this.f55488b;
            ym0.a<nm0.y> aVar2 = this.f55489c;
            Wpa02LaunchMeasurementActivity.this.B3(str, aVar2, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Wpa02LaunchMeasurementActivity.kt */
    /* loaded from: classes5.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        private final r8.n f55491a;

        /* compiled from: Wpa02LaunchMeasurementActivity.kt */
        /* loaded from: classes5.dex */
        static final class a extends kotlin.jvm.internal.w implements ym0.l<androidx.navigation.b0, nm0.y> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f55492a = new kotlin.jvm.internal.w(1);

            @Override // ym0.l
            public final nm0.y invoke(androidx.navigation.b0 b0Var) {
                androidx.navigation.b0 navigate = b0Var;
                kotlin.jvm.internal.u.j(navigate, "$this$navigate");
                navigate.d("SelectBiomarkersScreen", com.withings.wiscale2.device.wpa.wpa02.ui.measurement.t.f55585a);
                return nm0.y.f85009a;
            }
        }

        /* compiled from: Wpa02LaunchMeasurementActivity.kt */
        /* loaded from: classes5.dex */
        static final class b extends kotlin.jvm.internal.w implements ym0.l<androidx.navigation.b0, nm0.y> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f55493a = new kotlin.jvm.internal.w(1);

            @Override // ym0.l
            public final nm0.y invoke(androidx.navigation.b0 b0Var) {
                androidx.navigation.b0 navigate = b0Var;
                kotlin.jvm.internal.u.j(navigate, "$this$navigate");
                navigate.d("SelectBiomarkersScreen", u.f55586a);
                return nm0.y.f85009a;
            }
        }

        /* compiled from: Wpa02LaunchMeasurementActivity.kt */
        /* loaded from: classes5.dex */
        static final class c extends kotlin.jvm.internal.w implements ym0.l<androidx.navigation.b0, nm0.y> {

            /* renamed from: a  reason: collision with root package name */
            public static final c f55494a = new kotlin.jvm.internal.w(1);

            @Override // ym0.l
            public final nm0.y invoke(androidx.navigation.b0 b0Var) {
                androidx.navigation.b0 navigate = b0Var;
                kotlin.jvm.internal.u.j(navigate, "$this$navigate");
                navigate.d("SelectBiomarkersScreen", v.f55587a);
                return nm0.y.f85009a;
            }
        }

        public g(r8.n navController) {
            kotlin.jvm.internal.u.j(navController, "navController");
            this.f55491a = navController;
        }

        public final void a(String destination) {
            Object a11;
            kotlin.jvm.internal.u.j(destination, "destination");
            try {
                int hashCode = destination.hashCode();
                r8.n nVar = this.f55491a;
                switch (hashCode) {
                    case -302317959:
                        if (!destination.equals("SelectBiomarkersScreen")) {
                            break;
                        } else {
                            androidx.navigation.e.L(nVar, "SelectBiomarkersScreen", null, 6);
                            break;
                        }
                    case 754127182:
                        if (!destination.equals("DeviceMeasurementErrorScreen")) {
                            break;
                        } else {
                            nVar.J("DeviceMeasurementErrorScreen", b.f55493a);
                            break;
                        }
                    case 1622236617:
                        if (!destination.equals("DeviceConnectionStateScreen")) {
                            break;
                        } else {
                            nVar.J("DeviceConnectionStateScreen", a.f55492a);
                            break;
                        }
                    case 1865298670:
                        if (!destination.equals("DeviceReadyToCollectScreen")) {
                            break;
                        } else {
                            nVar.J("DeviceReadyToCollectScreen", c.f55494a);
                            break;
                        }
                }
                a11 = nm0.y.f85009a;
            } catch (Throwable th2) {
                a11 = nm0.l.a(th2);
            }
            Throwable b10 = nm0.k.b(a11);
            if (b10 != null) {
                x70.b.n(b10);
            }
        }
    }

    /* compiled from: Wpa02LaunchMeasurementActivity.kt */
    /* loaded from: classes5.dex */
    public /* synthetic */ class h {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f55495a;

        static {
            int[] iArr = new int[Wpa02LaunchMeasurementConversation.MeasurementError.values().length];
            try {
                Wpa02LaunchMeasurementConversation.MeasurementError measurementError = Wpa02LaunchMeasurementConversation.MeasurementError.f55035a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Wpa02LaunchMeasurementConversation.MeasurementError measurementError2 = Wpa02LaunchMeasurementConversation.MeasurementError.f55035a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Wpa02LaunchMeasurementConversation.MeasurementError measurementError3 = Wpa02LaunchMeasurementConversation.MeasurementError.f55035a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Wpa02LaunchMeasurementConversation.MeasurementError measurementError4 = Wpa02LaunchMeasurementConversation.MeasurementError.f55035a;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Wpa02LaunchMeasurementConversation.MeasurementError measurementError5 = Wpa02LaunchMeasurementConversation.MeasurementError.f55035a;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Wpa02LaunchMeasurementConversation.MeasurementError measurementError6 = Wpa02LaunchMeasurementConversation.MeasurementError.f55035a;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Wpa02LaunchMeasurementConversation.MeasurementError measurementError7 = Wpa02LaunchMeasurementConversation.MeasurementError.f55035a;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Wpa02LaunchMeasurementConversation.MeasurementError measurementError8 = Wpa02LaunchMeasurementConversation.MeasurementError.f55035a;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Wpa02LaunchMeasurementConversation.MeasurementError measurementError9 = Wpa02LaunchMeasurementConversation.MeasurementError.f55035a;
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f55495a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wpa02LaunchMeasurementActivity.kt */
    /* loaded from: classes5.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> {
        i() {
            super(3);
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.c cVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.c HeaderLabelCell = cVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(HeaderLabelCell, "$this$HeaderLabelCell");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                Wpa02LaunchMeasurementActivity.E3(Wpa02LaunchMeasurementActivity.this, aVar2, 8);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wpa02LaunchMeasurementActivity.kt */
    /* loaded from: classes5.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55497a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ym0.a<nm0.y> aVar) {
            super(0);
            this.f55497a = aVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f55497a.invoke();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wpa02LaunchMeasurementActivity.kt */
    /* loaded from: classes5.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ne0.c f55499b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f55500c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55501d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f55502e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ne0.c cVar, boolean z5, ym0.a<nm0.y> aVar, int i11) {
            super(2);
            this.f55499b = cVar;
            this.f55500c = z5;
            this.f55501d = aVar;
            this.f55502e = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f55502e | 1);
            boolean z5 = this.f55500c;
            ym0.a<nm0.y> aVar2 = this.f55501d;
            Wpa02LaunchMeasurementActivity.this.C3(this.f55499b, z5, aVar2, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wpa02LaunchMeasurementActivity.kt */
    /* loaded from: classes5.dex */
    public static final class l extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, nm0.y> f55503a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f55504b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(r0 r0Var, ym0.l lVar) {
            super(1);
            this.f55503a = lVar;
            this.f55504b = r0Var;
        }

        @Override // ym0.l
        public final nm0.y invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            b bVar = Wpa02LaunchMeasurementActivity.f55468g;
            this.f55504b.setValue(bool2);
            this.f55503a.invoke(bool2);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wpa02LaunchMeasurementActivity.kt */
    /* loaded from: classes5.dex */
    public static final class m extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<ne0.c, nm0.y> f55505a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ne0.c f55506b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m(ym0.l<? super ne0.c, nm0.y> lVar, ne0.c cVar) {
            super(0);
            this.f55505a = lVar;
            this.f55506b = cVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f55505a.invoke(this.f55506b);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wpa02LaunchMeasurementActivity.kt */
    /* loaded from: classes5.dex */
    public static final class n extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ne0.d f55508b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, nm0.y> f55509c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<ne0.c, nm0.y> f55510d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f55511e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(ne0.d dVar, ym0.l<? super Boolean, nm0.y> lVar, ym0.l<? super ne0.c, nm0.y> lVar2, int i11) {
            super(2);
            this.f55508b = dVar;
            this.f55509c = lVar;
            this.f55510d = lVar2;
            this.f55511e = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f55511e | 1);
            ym0.l<Boolean, nm0.y> lVar = this.f55509c;
            ym0.l<ne0.c, nm0.y> lVar2 = this.f55510d;
            Wpa02LaunchMeasurementActivity.this.D3(this.f55508b, lVar, lVar2, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Wpa02LaunchMeasurementActivity.kt */
    /* loaded from: classes5.dex */
    static final class o extends kotlin.jvm.internal.w implements ym0.a<fl.o> {
        o() {
            super(0);
        }

        @Override // ym0.a
        public final fl.o invoke() {
            return fl.p.f67672b.a().g(Wpa02LaunchMeasurementActivity.M3(Wpa02LaunchMeasurementActivity.this));
        }
    }

    /* compiled from: Wpa02LaunchMeasurementActivity.kt */
    /* loaded from: classes5.dex */
    static final class p extends kotlin.jvm.internal.w implements ym0.a<Setup> {
        p() {
            super(0);
        }

        @Override // ym0.a
        public final Setup invoke() {
            Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity = Wpa02LaunchMeasurementActivity.this;
            return Wpa02LaunchMeasurementActivity.N3(wpa02LaunchMeasurementActivity).e0(new DeviceModel(Wpa02LaunchMeasurementActivity.N3(wpa02LaunchMeasurementActivity).a(), null));
        }
    }

    /* compiled from: Wpa02LaunchMeasurementActivity.kt */
    /* loaded from: classes5.dex */
    static final class q extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        q() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -1139074100, new i0(Wpa02LaunchMeasurementActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Wpa02LaunchMeasurementActivity.kt */
    /* loaded from: classes5.dex */
    static final class r extends kotlin.jvm.internal.w implements ym0.a<yi.d> {
        r() {
            super(0);
        }

        @Override // ym0.a
        public final yi.d invoke() {
            Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity = Wpa02LaunchMeasurementActivity.this;
            Setup O3 = Wpa02LaunchMeasurementActivity.O3(wpa02LaunchMeasurementActivity);
            if (O3 != null) {
                return O3.x(wpa02LaunchMeasurementActivity);
            }
            return null;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class s implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f55516a = nm0.h.b(new j0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f55517b;

        public s(Activity activity) {
            this.f55517b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f55516a.getValue();
        }
    }

    /* compiled from: Wpa02LaunchMeasurementActivity.kt */
    /* loaded from: classes5.dex */
    static final class t extends kotlin.jvm.internal.w implements ym0.a<te0.c> {
        t() {
            super(0);
        }

        @Override // ym0.a
        public final te0.c invoke() {
            Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity = Wpa02LaunchMeasurementActivity.this;
            Application application = wpa02LaunchMeasurementActivity.getApplication();
            kotlin.jvm.internal.u.i(application, "getApplication(...)");
            te0.c cVar = new te0.c(application, Wpa02LaunchMeasurementActivity.M3(wpa02LaunchMeasurementActivity), Wpa02LaunchMeasurementActivity.N3(wpa02LaunchMeasurementActivity), Wpa02LaunchMeasurementActivity.P3(wpa02LaunchMeasurementActivity));
            xw.d.c(wpa02LaunchMeasurementActivity, cVar.t0(), new k0(wpa02LaunchMeasurementActivity));
            xw.d.c(wpa02LaunchMeasurementActivity, cVar.p0(), new l0(wpa02LaunchMeasurementActivity));
            return cVar;
        }
    }

    public Wpa02LaunchMeasurementActivity() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new com.withings.wiscale2.activity.workout.live.ui.g(this, 1));
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f55475f = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B3(String str, ym0.a<nm0.y> aVar, androidx.compose.runtime.a aVar2, int i11) {
        int i12;
        boolean z5;
        androidx.compose.runtime.b bVar;
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar2.g(1977596687);
        if ((i11 & 14) == 0) {
            if (g11.K(str)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(aVar)) {
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
            g11.s(1594106197);
            if ((i12 & 112) == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object t11 = g11.t();
            if (z5 || t11 == a.C0060a.a()) {
                t11 = new c(aVar);
                g11.n(t11);
            }
            g11.J();
            e.j.a(0, 1, g11, (ym0.a) t11, false);
            bVar = g11;
            wk.c0.b(null, null, null, aVar, null, s1.b.b(g11, 736104923, new d(str)), s1.b.b(g11, 251159674, new e(aVar)), null, 0L, false, null, null, 0.0f, false, te0.a.f99734d, bVar, ((i12 << 6) & 7168) | 1769472, 24576, 16279);
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new f(str, aVar, i11));
        }
    }

    public static final void E3(Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity, androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.ui.e b10;
        wpa02LaunchMeasurementActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-287137596);
        if ((i11 & 1) == 0 && g11.h()) {
            g11.C();
        } else {
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e g12 = androidx.collection.c.g(e1.n(aVar2, 24), x0.h.e());
            g11.s(615317871);
            g11.J();
            b10 = androidx.compose.foundation.c.b(g12, ((yk.w) g11.D(yk.o.g())).c().d(), h1.a());
            g11.s(733328855);
            androidx.compose.ui.layout.l0 d11 = g6.d(false, g11, -1323940314);
            int G = g11.G();
            v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(b10);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a11);
                } else {
                    g11.m();
                }
                ym0.p b11 = com.withings.authentication.e.b(g11, d11, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
                }
                dq.x.b(0, c11, j1.a(g11), g11, 2058660585);
                nk.a.g(0, 0, 48, 60, 0L, g11, androidx.compose.foundation.layout.m.f4307a.g(aVar2, b.a.e()), null, "i");
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new com.withings.wiscale2.device.wpa.wpa02.ui.measurement.a(wpa02LaunchMeasurementActivity, i11));
        }
    }

    public static final void F3(Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity, ym0.a aVar, androidx.compose.runtime.a aVar2, int i11) {
        boolean z5;
        wpa02LaunchMeasurementActivity.getClass();
        androidx.compose.runtime.b g11 = aVar2.g(342260045);
        e.a aVar3 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e d11 = e1.d(aVar3);
        androidx.compose.ui.layout.l0 e11 = androidx.camera.camera2.internal.v0.e(g11, 733328855, false, g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
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
            dq.x.b(0, c11, j1.a(g11), g11, 2058660585);
            androidx.compose.foundation.layout.m mVar = androidx.compose.foundation.layout.m.f4307a;
            g11.s(2072772571);
            if ((((i11 & 14) ^ 6) > 4 && g11.K(aVar)) || (i11 & 6) == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object t11 = g11.t();
            if (z5 || t11 == a.C0060a.a()) {
                t11 = new com.withings.wiscale2.device.wpa.wpa02.ui.measurement.b(aVar);
                g11.n(t11);
            }
            g11.J();
            e.j.a(0, 1, g11, (ym0.a) t11, false);
            wk.c0.b(null, null, null, aVar, null, s1.b.b(g11, 738596435, new com.withings.wiscale2.device.wpa.wpa02.ui.measurement.c(wpa02LaunchMeasurementActivity)), null, null, 0L, false, null, null, 0.0f, false, te0.a.f99733c, g11, ((i11 << 9) & 7168) | 196608, 24576, 16343);
            f5.b(0.0f, 0, 0, 30, 0L, 0L, g11, mVar.g(aVar3, b.a.e()));
            androidx.compose.runtime.v b11 = h6.b(g11);
            if (b11 != null) {
                b11.G(new com.withings.wiscale2.device.wpa.wpa02.ui.measurement.d(wpa02LaunchMeasurementActivity, aVar, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    public static final void H3(Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity, ym0.a aVar, androidx.compose.runtime.a aVar2, int i11) {
        int i12;
        String str;
        wpa02LaunchMeasurementActivity.getClass();
        androidx.compose.runtime.b g11 = aVar2.g(-1923326068);
        Wpa02LaunchMeasurementConversation.MeasurementError q02 = ((te0.c) wpa02LaunchMeasurementActivity.f55474e.getValue()).q0();
        if (q02 == null) {
            i12 = -1;
        } else {
            i12 = h.f55495a[q02.ordinal()];
        }
        switch (i12) {
            case -1:
                g11.s(-2122322544);
                g11.J();
                str = "";
                break;
            case 0:
            default:
                g11.s(1594088869);
                g11.J();
                throw new NoWhenBranchMatchedException();
            case 1:
                str = androidx.datastore.preferences.protobuf.e.c(g11, 1594104637, C1987R.string.wpa02_state_cartridge_unreadable, g11);
                break;
            case 2:
                str = androidx.datastore.preferences.protobuf.e.c(g11, 1594104794, C1987R.string.wpa02_state_cartridge_notValid, g11);
                break;
            case 3:
                str = androidx.datastore.preferences.protobuf.e.c(g11, 1594104950, C1987R.string.wpa02_state_cartridge_notActivated, g11);
                break;
            case 4:
                str = androidx.datastore.preferences.protobuf.e.c(g11, 1594105116, C1987R.string.wpa02_state_cartridge_being_activated, g11);
                break;
            case 5:
                str = androidx.datastore.preferences.protobuf.e.c(g11, 1594105272, C1987R.string.wpa02_state_device_lowBattery, g11);
                break;
            case 6:
                str = androidx.datastore.preferences.protobuf.e.c(g11, 1594105418, C1987R.string.wpa02_state_device_charging, g11);
                break;
            case 7:
                str = androidx.datastore.preferences.protobuf.e.c(g11, 1594105575, C1987R.string.wpa02_state_device_measureInProgress, g11);
                break;
            case 8:
                str = androidx.datastore.preferences.protobuf.e.c(g11, 1594105730, C1987R.string.wpa02_state_device_hoodOpen, g11);
                break;
            case 9:
                str = androidx.datastore.preferences.protobuf.e.c(g11, 1594105875, C1987R.string.wpa02_state_device_cleansingMode, g11);
                break;
        }
        wpa02LaunchMeasurementActivity.B3(str, aVar, g11, ((i11 << 3) & 112) | 512);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new com.withings.wiscale2.device.wpa.wpa02.ui.measurement.e(wpa02LaunchMeasurementActivity, aVar, i11));
        }
    }

    public static final void I3(Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity, androidx.compose.runtime.a aVar, int i11) {
        wpa02LaunchMeasurementActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-2002809908);
        e.j.a(0, 1, g11, new com.withings.wiscale2.device.wpa.wpa02.ui.measurement.f(wpa02LaunchMeasurementActivity), false);
        wk.c0.b(null, null, null, new com.withings.wiscale2.device.wpa.wpa02.ui.measurement.g(wpa02LaunchMeasurementActivity), null, te0.a.f99735e, s1.b.b(g11, 1926056439, new com.withings.wiscale2.device.wpa.wpa02.ui.measurement.i(wpa02LaunchMeasurementActivity)), null, 0L, false, null, null, 0.0f, false, te0.a.f99736f, g11, 1769472, 24576, 16279);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new com.withings.wiscale2.device.wpa.wpa02.ui.measurement.j(wpa02LaunchMeasurementActivity, i11));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
        if (r0.equals("noState") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
        if (r0.equals("searching") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
        r13.s(-988020671);
        com.withings.common.compose.component.v4.b(r1, ay.b.u(com.withings.wiscale2.C1987R.string._WPP_NOTIFICATION_SCANNING_, r13), ay.b.u(com.withings.wiscale2.C1987R.string.WPA_looking_for_device_description, r13), null, 0.0f, 0.0f, 0, 0, r13, 0, com.withings.library.authentication.api.ConstantsWs.WS_STATUS_WRONGDEVICETYPE);
        r13.J();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void J3(com.withings.wiscale2.device.wpa.wpa02.ui.measurement.Wpa02LaunchMeasurementActivity r12, androidx.compose.runtime.a r13, int r14) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.wpa.wpa02.ui.measurement.Wpa02LaunchMeasurementActivity.J3(com.withings.wiscale2.device.wpa.wpa02.ui.measurement.Wpa02LaunchMeasurementActivity, androidx.compose.runtime.a, int):void");
    }

    public static final void K3(Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity, String str, androidx.compose.runtime.a aVar, int i11, int i12) {
        String str2;
        wpa02LaunchMeasurementActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(-1242134184);
        if ((i12 & 1) != 0) {
            str2 = "DeviceConnectionStateScreen";
        } else {
            str2 = str;
        }
        r8.n c11 = androidx.navigation.compose.r.c(new androidx.navigation.c0[0], g11);
        g11.s(1956902641);
        boolean K = g11.K(c11);
        Object t11 = g11.t();
        if (K || t11 == a.C0060a.a()) {
            t11 = new g(c11);
            g11.n(t11);
        }
        g11.J();
        String str3 = str2;
        androidx.navigation.compose.s.b(c11, str2, null, null, null, null, null, null, null, new com.withings.wiscale2.device.wpa.wpa02.ui.measurement.p(wpa02LaunchMeasurementActivity, new com.withings.wiscale2.device.wpa.wpa02.ui.measurement.s(c11, wpa02LaunchMeasurementActivity)), g11, ((i11 << 3) & 112) | 8, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
        k1.y.f("navigation", new com.withings.wiscale2.device.wpa.wpa02.ui.measurement.q(wpa02LaunchMeasurementActivity, (g) t11, null), g11);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new com.withings.wiscale2.device.wpa.wpa02.ui.measurement.r(wpa02LaunchMeasurementActivity, str3, i11, i12));
        }
    }

    public static final void L3(Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity, ym0.a aVar, androidx.compose.runtime.a aVar2, int i11) {
        wpa02LaunchMeasurementActivity.getClass();
        androidx.compose.runtime.b g11 = aVar2.g(1373595841);
        g11.s(773894976);
        g11.s(-492369756);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.datastore.preferences.protobuf.e.b(k1.y.i(g11), g11);
        }
        g11.J();
        CoroutineScope a11 = ((androidx.compose.runtime.k) t11).a();
        g11.J();
        c5 f11 = f4.f(ModalBottomSheetValue.f4842a, null, false, g11, 14);
        g11.s(-1435325729);
        Object t12 = g11.t();
        if (t12 == a.C0060a.a()) {
            t12 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
            g11.n(t12);
        }
        r0 r0Var = (r0) t12;
        g11.J();
        wk.c0.d(a11, wpa02LaunchMeasurementActivity, aVar, null, null, te0.a.f99731a, s1.b.b(g11, 1872268444, new x(wpa02LaunchMeasurementActivity)), null, false, 0L, f11, s1.b.b(g11, 1683488778, new y(r0Var)), s1.b.b(g11, -492427543, new b0(f11, r0Var, a11)), null, null, null, false, s1.b.b(g11, 1224874196, new g0(wpa02LaunchMeasurementActivity, a11, r0Var, f11)), g11, ((i11 << 6) & ConstantsWs.HWFAILURE_ZERO) | 1769544, 12583352, 123800);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new h0(wpa02LaunchMeasurementActivity, aVar, i11));
        }
    }

    public static final Device M3(Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity) {
        return (Device) wpa02LaunchMeasurementActivity.f55470a.getValue(wpa02LaunchMeasurementActivity, f55469h[0]);
    }

    public static final fl.o N3(Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity) {
        return (fl.o) wpa02LaunchMeasurementActivity.f55471b.getValue();
    }

    public static final Setup O3(Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity) {
        return (Setup) wpa02LaunchMeasurementActivity.f55472c.getValue();
    }

    public static final yi.d P3(Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity) {
        return (yi.d) wpa02LaunchMeasurementActivity.f55473d.getValue();
    }

    public static final te0.c Q3(Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity) {
        return (te0.c) wpa02LaunchMeasurementActivity.f55474e.getValue();
    }

    public static final void R3(Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity) {
        Setup setup = (Setup) wpa02LaunchMeasurementActivity.f55472c.getValue();
        if (setup != null) {
            EnablePermissionsForScanActivity.ScanningAbilityProvider.WithSetup withSetup = new EnablePermissionsForScanActivity.ScanningAbilityProvider.WithSetup(setup);
            Intent intent = new Intent(wpa02LaunchMeasurementActivity, EnablePermissionsForScanActivity.class);
            intent.putExtra("extra_scanning_ability_provider", withSetup);
            wpa02LaunchMeasurementActivity.f55475f.a(intent);
        }
    }

    public static void z3(Wpa02LaunchMeasurementActivity this$0, ActivityResult activityResult) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (activityResult.b() != -1) {
            this$0.finish();
        } else {
            ((te0.c) this$0.f55474e.getValue()).B0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A3(boolean r37, int r38, boolean r39, boolean r40, ym0.l<? super java.lang.Boolean, nm0.y> r41, androidx.compose.runtime.a r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.wpa.wpa02.ui.measurement.Wpa02LaunchMeasurementActivity.A3(boolean, int, boolean, boolean, ym0.l, androidx.compose.runtime.a, int, int):void");
    }

    public final void C3(ne0.c biomarker, boolean z5, ym0.a<nm0.y> onClick, androidx.compose.runtime.a aVar, int i11) {
        boolean z11;
        kotlin.jvm.internal.u.j(biomarker, "biomarker");
        kotlin.jvm.internal.u.j(onClick, "onClick");
        androidx.compose.runtime.b g11 = aVar.g(-1793118403);
        androidx.compose.ui.e h11 = x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2);
        s1.a aVar2 = te0.a.f99732b;
        s1.a b10 = s1.b.b(g11, -1136542312, new i());
        String u11 = ay.b.u(biomarker.c(), g11);
        String u12 = ay.b.u(biomarker.a(), g11);
        g11.s(1005459503);
        if ((((i11 & ConstantsWs.HWFAILURE_ZERO) ^ ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) > 256 && g11.K(onClick)) || (i11 & ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) == 256) {
            z11 = true;
        } else {
            z11 = false;
        }
        Object t11 = g11.t();
        if (z11 || t11 == a.C0060a.a()) {
            t11 = new j(onClick);
            g11.n(t11);
        }
        g11.J();
        com.withings.common.compose.component.o.d(h11, aVar2, b10, u11, u12, false, z5, false, (ym0.a) t11, g11, ((i11 << 15) & 3670016) | 432, ConstantsWs.MEASURE_TYPE_BLOOD_GLUCOSE);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new k(biomarker, z5, onClick, i11));
        }
    }

    public final void D3(ne0.d measurementTest, ym0.l<? super Boolean, nm0.y> onSelect, ym0.l<? super ne0.c, nm0.y> onBiomarkerClick, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(measurementTest, "measurementTest");
        kotlin.jvm.internal.u.j(onSelect, "onSelect");
        kotlin.jvm.internal.u.j(onBiomarkerClick, "onBiomarkerClick");
        androidx.compose.runtime.b g11 = aVar.g(1392761029);
        g11.s(711043656);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.f(Boolean.valueOf(((te0.c) this.f55474e.getValue()).y0().contains(Integer.valueOf(measurementTest.d()))), androidx.compose.runtime.v0.f8878a);
            g11.n(t11);
        }
        r0 r0Var = (r0) t11;
        g11.J();
        boolean z5 = measurementTest.c() > 0;
        androidx.compose.ui.e e11 = e1.e(androidx.compose.ui.e.f8927a, 1.0f);
        g11.s(-483455358);
        androidx.compose.ui.layout.l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a11 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(e11);
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
            dq.x.b(0, c11, j1.a(g11), g11, 2058660585);
            boolean b12 = measurementTest.b();
            int c12 = measurementTest.c();
            boolean booleanValue = ((Boolean) r0Var.getValue()).booleanValue();
            g11.s(-1129486152);
            boolean z11 = (((i11 & 112) ^ 48) > 32 && g11.K(onSelect)) || (i11 & 48) == 32;
            Object t12 = g11.t();
            if (z11 || t12 == a.C0060a.a()) {
                t12 = new l(r0Var, onSelect);
                g11.n(t12);
            }
            g11.J();
            A3(b12, c12, booleanValue, z5, (ym0.l) t12, g11, 262144, 0);
            b2.a(0.0f, 0.0f, 0, 15, 0L, g11, null);
            g11.s(-1129486016);
            int i12 = 0;
            for (Object obj : measurementTest.a()) {
                int i13 = i12 + 1;
                if (i12 >= 0) {
                    ne0.c cVar = (ne0.c) obj;
                    boolean z12 = (i12 == kotlin.collections.x.M(measurementTest.a()) && measurementTest.e() == null) ? false : true;
                    g11.s(1873165644);
                    boolean K = g11.K(cVar) | ((((i11 & ConstantsWs.HWFAILURE_ZERO) ^ ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) > 256 && g11.K(onBiomarkerClick)) || (i11 & ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) == 256);
                    Object t13 = g11.t();
                    if (K || t13 == a.C0060a.a()) {
                        t13 = new m(onBiomarkerClick, cVar);
                        g11.n(t13);
                    }
                    g11.J();
                    C3(cVar, z12, (ym0.a) t13, g11, 4096);
                    i12 = i13;
                } else {
                    kotlin.collections.x.K0();
                    throw null;
                }
            }
            g11.J();
            Integer e12 = measurementTest.e();
            g11.s(711044583);
            if (e12 != null) {
                int intValue = e12.intValue();
                androidx.compose.ui.e g12 = x0.g(androidx.compose.ui.e.f8927a, yk.h.o(), yk.h.q());
                String u11 = ay.b.u(C1987R.string.WhenToTest_Title, g11);
                String u12 = ay.b.u(intValue, g11);
                g11.J();
                q2.a(g12, u11, u12, ((yk.w) androidx.appcompat.app.h.b(g11, 615317871)).g().e(), g11, 0);
            }
            androidx.compose.runtime.v a12 = com.withings.authentication.mfa.resolve.components.h.a(g11);
            if (a12 != null) {
                a12.G(new n(measurementTest, onSelect, onBiomarkerClick, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.k.a(this, new s1.a(true, 1797370162, new q()));
    }
}
