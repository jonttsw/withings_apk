package com.withings.tutorials.ui;

import android.app.Activity;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.core.view.l1;
import androidx.lifecycle.i1;
import androidx.lifecycle.k1;
import androidx.lifecycle.m1;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
/* compiled from: DeviceIntroductionActivity.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0019²\u0006\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\nX\u008a\u0084\u0002²\u0006\u000e\u0010\t\u001a\u0004\u0018\u00010\b8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\n8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\f\u0010\u0014\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0016\u001a\u0004\u0018\u00010\u00158\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0018\u001a\u0004\u0018\u00010\u00178\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/tutorials/ui/DeviceIntroductionActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "Lcom/withings/device/Device;", "device", "", NavigationArguments.USER_ID, "", "deviceNameRes", "", "Lo60/d;", "featuresCards", "Lo60/f;", "setupTutorials", "setupCards", "Lo60/h;", "utilityCards", "", "isFlowUncompleted", "isButtonEnabled", "", "deviceColor", "Ll70/v;", "unitPreferences", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DeviceIntroductionActivity extends Hilt_DeviceIntroductionActivity {

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f44592k = {androidx.camera.core.v.c(DeviceIntroductionActivity.class, "shouldConditionButtonEnabled", "getShouldConditionButtonEnabled()Z", 0)};

    /* renamed from: e  reason: collision with root package name */
    private final c f44593e = new c(this);

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f44594f = nm0.h.b(new a());

    /* renamed from: g  reason: collision with root package name */
    private final i1 f44595g = new i1(q0.b(DeviceIntroductionViewModel.class), new e(this), new d(this), new f(this));
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public h70.b f44596h;
    @Inject

    /* renamed from: i  reason: collision with root package name */
    public h70.d f44597i;
    @Inject

    /* renamed from: j  reason: collision with root package name */
    public ch.d f44598j;

    /* compiled from: DeviceIntroductionActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<Boolean> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(DeviceIntroductionActivity.this.getIntent().getBooleanExtra("extra_allow_quit", true));
        }
    }

    /* compiled from: DeviceIntroductionActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        b() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, 2104422669, new o(DeviceIntroductionActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class c implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f44601a = nm0.h.b(new p(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f44602b;

        public c(Activity activity) {
            this.f44602b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f44601a.getValue();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f44603a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f44603a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f44603a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f44604a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f44604a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f44604a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f44605a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f44605a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f44605a.getDefaultViewModelCreationExtras();
        }
    }

    public static final boolean A3(DeviceIntroductionActivity deviceIntroductionActivity) {
        return ((Boolean) deviceIntroductionActivity.f44593e.getValue(deviceIntroductionActivity, f44592k[0])).booleanValue();
    }

    public static final DeviceIntroductionViewModel B3(DeviceIntroductionActivity deviceIntroductionActivity) {
        return (DeviceIntroductionViewModel) deviceIntroductionActivity.f44595g.getValue();
    }

    public static final boolean z3(DeviceIntroductionActivity deviceIntroductionActivity) {
        return ((Boolean) deviceIntroductionActivity.f44594f.getValue()).booleanValue();
    }

    @Override // com.withings.tutorials.ui.Hilt_DeviceIntroductionActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, -1384169101, new b()));
    }
}
