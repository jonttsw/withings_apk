package com.withings.wiscale2.device.common.feature.ecg;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.appbar.AppBarLayout;
import com.withings.common.device.DeviceSettingsActivity;
import com.withings.core.webcontent.HMWebViewDelegate;
import com.withings.device.Device;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.feature.ecg.EcgSettingsActivity;
import com.withings.wiscale2.device.common.feature.ecg.p5;
import gi.j;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: EcgSettingsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/ecg/EcgSettingsActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class EcgSettingsActivity extends Hilt_EcgSettingsActivity {
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public q5 f51080f;
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public ch.d f51081g;

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f51078k = {androidx.camera.core.v.c(EcgSettingsActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0)};

    /* renamed from: j  reason: collision with root package name */
    public static final a f51077j = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final f f51079e = new f(this);

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f51082h = nm0.h.b(new g());

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f51083i = nm0.h.b(new b());

    /* compiled from: EcgSettingsActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context, Device device) {
            DeviceSettingsActivity.c cVar = DeviceSettingsActivity.f35012e;
            Intent putExtra = new Intent(context, EcgSettingsActivity.class).putExtra("device", device);
            cVar.getClass();
            return DeviceSettingsActivity.c.c(context, device, putExtra);
        }
    }

    /* compiled from: EcgSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<tb0.m0> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final tb0.m0 invoke() {
            return tb0.m0.b(EcgSettingsActivity.this.getLayoutInflater());
        }
    }

    /* compiled from: EcgSettingsActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.EcgSettingsActivity$onCreate$1", f = "EcgSettingsActivity.kt", l = {75}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f51085a;

        c(qm0.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new c(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i11;
            final Integer valueOf;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i12 = this.f51085a;
            final EcgSettingsActivity ecgSettingsActivity = EcgSettingsActivity.this;
            if (i12 != 0) {
                if (i12 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                p5.a g02 = EcgSettingsActivity.D3(ecgSettingsActivity).g0();
                this.f51085a = 1;
                obj = FlowKt.first(g02, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Device C3 = EcgSettingsActivity.C3(ecgSettingsActivity);
            kotlin.jvm.internal.u.j(C3, "<this>");
            int modelId = C3.getModelId();
            if (modelId != 93) {
                valueOf = null;
                if (modelId == 94) {
                    if (booleanValue) {
                        if (ah.g.p(C3) == 1) {
                            valueOf = Integer.valueOf((int) C1987R.string.hwa10_ecgsw2_instructionsURL_us);
                        }
                    } else if (ah.g.p(C3) != 1) {
                        valueOf = Integer.valueOf((int) C1987R.string.hwa10_scanMonitor_instructionsURL_eu);
                    }
                }
            } else {
                if (ah.g.p(C3) == 1) {
                    i11 = C1987R.string.hwa09_reg_url;
                } else {
                    i11 = C1987R.string.scanMonitor_instructionsURL;
                }
                valueOf = Integer.valueOf(i11);
            }
            if (valueOf != null) {
                ecgSettingsActivity.F3().f99325c.setOnClickListener(new View.OnClickListener() { // from class: com.withings.wiscale2.device.common.feature.ecg.k5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        EcgSettingsActivity ecgSettingsActivity2 = EcgSettingsActivity.this;
                        ch.d dVar = ecgSettingsActivity2.f51081g;
                        if (dVar != null) {
                            ch.h m11 = dVar.m();
                            Context context = view.getContext();
                            kotlin.jvm.internal.u.i(context, "getContext(...)");
                            String string = ecgSettingsActivity2.getString(valueOf.intValue());
                            kotlin.jvm.internal.u.i(string, "getString(...)");
                            ecgSettingsActivity2.startActivity(((ah.z) m11).b(context, Uri.parse(string), true, new HMWebViewDelegate()));
                            return;
                        }
                        kotlin.jvm.internal.u.s("intentBuilder");
                        throw null;
                    }
                });
            } else {
                LineCellView instructionOfUse = ecgSettingsActivity.F3().f99325c;
                kotlin.jvm.internal.u.i(instructionOfUse, "instructionOfUse");
                instructionOfUse.setVisibility(8);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: EcgSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.l<Device, nm0.y> {
        d() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Device device) {
            Device device2 = device;
            if (device2 != null) {
                EcgSettingsActivity.this.E3(device2.getTrackerWearPosition());
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: EcgSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class e implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f51088a;

        e(ym0.l lVar) {
            this.f51088a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f51088a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f51088a;
        }

        public final int hashCode() {
            return this.f51088a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f51088a.invoke(obj);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class f implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f51089a = nm0.h.b(new m5(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f51090b;

        public f(Activity activity) {
            this.f51090b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f51089a.getValue();
        }
    }

    /* compiled from: EcgSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<p5> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final p5 invoke() {
            EcgSettingsActivity ecgSettingsActivity = EcgSettingsActivity.this;
            return (p5) new androidx.lifecycle.k1(ecgSettingsActivity, new n5(ecgSettingsActivity)).a(p5.class);
        }
    }

    public static final Device C3(EcgSettingsActivity ecgSettingsActivity) {
        ecgSettingsActivity.getClass();
        return (Device) ecgSettingsActivity.f51079e.getValue(ecgSettingsActivity, f51078k[0]);
    }

    public static final p5 D3(EcgSettingsActivity ecgSettingsActivity) {
        return (p5) ecgSettingsActivity.f51082h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E3(final int i11) {
        String string;
        LineCellView lineCellView = F3().f99327e;
        if (i11 != 0) {
            if (i11 != 1) {
                string = "";
            } else {
                string = getString(C1987R.string.ecg_leftWristUsed);
            }
        } else {
            string = getString(C1987R.string.ecg_rightWristUsed);
        }
        lineCellView.setValue(string);
        F3().f99327e.setOnClickListener(new View.OnClickListener() { // from class: com.withings.wiscale2.device.common.feature.ecg.j5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z5;
                boolean z11;
                EcgSettingsActivity.a aVar = EcgSettingsActivity.f51077j;
                EcgSettingsActivity this$0 = EcgSettingsActivity.this;
                kotlin.jvm.internal.u.j(this$0, "this$0");
                gi.b[] bVarArr = new gi.b[2];
                String string2 = this$0.getString(C1987R.string.deviceDetailView_wristUsed_left);
                kotlin.jvm.internal.u.i(string2, "getString(...)");
                int i12 = i11;
                if (i12 == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                bVarArr[0] = new gi.b(8, string2, null, z5, false);
                String string3 = this$0.getString(C1987R.string.deviceDetailView_wristUsed_right);
                kotlin.jvm.internal.u.i(string3, "getString(...)");
                if (i12 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVarArr[1] = new gi.b(8, string3, null, z11, false);
                List W = kotlin.collections.x.W(bVarArr);
                FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
                kotlin.jvm.internal.u.i(supportFragmentManager, "getSupportFragmentManager(...)");
                j.a aVar2 = new j.a(supportFragmentManager);
                aVar2.y(this$0.getString(C1987R.string.deviceDetailView_wristUsed));
                aVar2.a(this$0.getString(C1987R.string.ecg_settings_wrist_description));
                aVar2.r(new l5(this$0), W);
                aVar2.x();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tb0.m0 F3() {
        return (tb0.m0) this.f51083i.getValue();
    }

    public static final void z3(EcgSettingsActivity ecgSettingsActivity, int i11) {
        int i12;
        p5 p5Var = (p5) ecgSettingsActivity.f51082h.getValue();
        if (i11 == 0) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        p5Var.i0(i12);
    }

    @Override // com.withings.wiscale2.device.common.feature.ecg.Hilt_EcgSettingsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(F3().a());
        CoordinatorLayout a11 = F3().a();
        kotlin.jvm.internal.u.i(a11, "getRoot(...)");
        ay.b.t(a11);
        AppBarLayout appBarLayout = F3().f99324b;
        kotlin.jvm.internal.u.i(appBarLayout, "appBarLayout");
        ay.b.n(appBarLayout, true, false, 29);
        CoordinatorLayout a12 = F3().a();
        kotlin.jvm.internal.u.i(a12, "getRoot(...)");
        ay.b.n(a12, false, true, 23);
        setSupportActionBar(F3().f99326d);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(true);
            supportActionBar.o(true);
        }
        E3(((Device) this.f51079e.getValue(this, f51078k[0])).getTrackerWearPosition());
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new c(null), 3, null);
        ((p5) this.f51082h.getValue()).f0().observe(this, new e(new d()));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        finish();
        return super.onOptionsItemSelected(item);
    }
}
