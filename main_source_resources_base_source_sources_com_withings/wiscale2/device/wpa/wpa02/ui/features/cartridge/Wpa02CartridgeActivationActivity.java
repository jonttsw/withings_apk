package com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.k1;
import com.withings.device.Device;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.ui.EnablePermissionsForScanActivity;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import k1.r0;
import kotlin.Metadata;
/* compiled from: Wpa02CartridgeActivationActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/ui/features/cartridge/Wpa02CartridgeActivationActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "Lre0/a;", "cartridgeActivationState", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpa02CartridgeActivationActivity extends Hilt_Wpa02CartridgeActivationActivity {

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f55109j = {androidx.camera.core.v.c(Wpa02CartridgeActivationActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0)};
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public k0 f55110e;
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public ch.d f55111f;

    /* renamed from: g  reason: collision with root package name */
    private final b f55112g = new b(this);

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f55113h = nm0.h.b(new c());

    /* renamed from: i  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f55114i;

    /* compiled from: Wpa02CartridgeActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        a() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                Wpa02CartridgeActivationActivity wpa02CartridgeActivationActivity = Wpa02CartridgeActivationActivity.this;
                r0 c11 = h6.b.c(Wpa02CartridgeActivationActivity.D3(wpa02CartridgeActivationActivity).B0(), aVar2);
                e.j.a(0, 1, aVar2, new o(wpa02CartridgeActivationActivity), false);
                yk.o.b(false, s1.b.b(aVar2, 1730043340, new x(wpa02CartridgeActivationActivity, c11)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class b implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f55116a = nm0.h.b(new y(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f55117b;

        public b(Activity activity) {
            this.f55117b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f55116a.getValue();
        }
    }

    /* compiled from: Wpa02CartridgeActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<b0> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final b0 invoke() {
            Wpa02CartridgeActivationActivity wpa02CartridgeActivationActivity = Wpa02CartridgeActivationActivity.this;
            return (b0) new k1(wpa02CartridgeActivationActivity, new z(wpa02CartridgeActivationActivity)).a(b0.class);
        }
    }

    public Wpa02CartridgeActivationActivity() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new com.withings.authentication.verifyauthentication.q(this, 2));
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f55114i = registerForActivityResult;
    }

    public static void A3(Wpa02CartridgeActivationActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.setResult(0);
        ((b0) this$0.f55113h.getValue()).K0();
        this$0.finish();
    }

    public static final void B3(Wpa02CartridgeActivationActivity wpa02CartridgeActivationActivity) {
        wpa02CartridgeActivationActivity.getClass();
        qc.b bVar = new qc.b(wpa02CartridgeActivationActivity);
        bVar.g(C1987R.string._ANDROID_SETUP_CANCEL_WARNING_);
        bVar.z(C1987R.string._ANDROID_SETUP_CANCEL_WARNING_CONFIRM_, new dq.l(wpa02CartridgeActivationActivity, 4)).w(C1987R.string._NO_, null).s();
    }

    public static final Device C3(Wpa02CartridgeActivationActivity wpa02CartridgeActivationActivity) {
        return (Device) wpa02CartridgeActivationActivity.f55112g.getValue(wpa02CartridgeActivationActivity, f55109j[0]);
    }

    public static final b0 D3(Wpa02CartridgeActivationActivity wpa02CartridgeActivationActivity) {
        return (b0) wpa02CartridgeActivationActivity.f55113h.getValue();
    }

    public static final void E3(Wpa02CartridgeActivationActivity wpa02CartridgeActivationActivity, Setup setup) {
        wpa02CartridgeActivationActivity.getClass();
        EnablePermissionsForScanActivity.ScanningAbilityProvider.WithSetup withSetup = new EnablePermissionsForScanActivity.ScanningAbilityProvider.WithSetup(setup);
        Intent intent = new Intent(wpa02CartridgeActivationActivity, EnablePermissionsForScanActivity.class);
        intent.putExtra("extra_scanning_ability_provider", withSetup);
        wpa02CartridgeActivationActivity.f55114i.a(intent);
    }

    public static void z3(Wpa02CartridgeActivationActivity this$0, ActivityResult activityResult) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (activityResult.b() != -1) {
            this$0.finish();
        } else {
            ((b0) this$0.f55113h.getValue()).M0();
        }
    }

    @Override // com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.Hilt_Wpa02CartridgeActivationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        e.k.a(this, new s1.a(true, -1369404250, new a()));
    }
}
