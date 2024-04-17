package com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.h1;
import androidx.lifecycle.k1;
import com.withings.device.Device;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.ui.EnablePermissionsForScanActivity;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: Wpa02ToiletInstallationActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/ui/features/toilet/Wpa02ToiletInstallationActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "Lse0/a;", "toiletDeviceState", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpa02ToiletInstallationActivity extends Hilt_Wpa02ToiletInstallationActivity {

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f55335j = {androidx.camera.core.v.c(Wpa02ToiletInstallationActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0)};
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public r f55337f;
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public ch.d f55339h;

    /* renamed from: i  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f55340i;

    /* renamed from: e  reason: collision with root package name */
    private final b f55336e = new b(this);

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f55338g = nm0.h.b(new c());

    /* compiled from: Wpa02ToiletInstallationActivity.kt */
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
                r8.n c11 = androidx.navigation.compose.r.c(new androidx.navigation.c0[0], aVar2);
                Wpa02ToiletInstallationActivity wpa02ToiletInstallationActivity = Wpa02ToiletInstallationActivity.this;
                k1.r0 c12 = h6.b.c(Wpa02ToiletInstallationActivity.D3(wpa02ToiletInstallationActivity).r0(), aVar2);
                e.j.a(0, 1, aVar2, new o0(wpa02ToiletInstallationActivity), false);
                yk.o.b(false, s1.b.b(aVar2, 290418978, new x0(wpa02ToiletInstallationActivity, c11, c12)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class b implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f55342a = nm0.h.b(new y0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f55343b;

        public b(Activity activity) {
            this.f55343b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f55342a.getValue();
        }
    }

    /* compiled from: Wpa02ToiletInstallationActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<k> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final k invoke() {
            Wpa02ToiletInstallationActivity wpa02ToiletInstallationActivity = Wpa02ToiletInstallationActivity.this;
            return (k) new k1(wpa02ToiletInstallationActivity, new z0(wpa02ToiletInstallationActivity)).a(k.class);
        }
    }

    public Wpa02ToiletInstallationActivity() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new com.withings.authentication.c(this, 3));
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f55340i = registerForActivityResult;
    }

    public static void A3(Wpa02ToiletInstallationActivity this$0, ActivityResult activityResult) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (activityResult.b() != -1) {
            this$0.finish();
        } else {
            ((k) this$0.f55338g.getValue()).y0();
        }
    }

    public static final void B3(Wpa02ToiletInstallationActivity wpa02ToiletInstallationActivity) {
        wpa02ToiletInstallationActivity.getClass();
        qc.b bVar = new qc.b(wpa02ToiletInstallationActivity);
        bVar.g(C1987R.string._ANDROID_SETUP_CANCEL_WARNING_);
        bVar.z(C1987R.string._ANDROID_SETUP_CANCEL_WARNING_CONFIRM_, new v10.b(wpa02ToiletInstallationActivity, 1)).w(C1987R.string._NO_, null).s();
    }

    public static final Device C3(Wpa02ToiletInstallationActivity wpa02ToiletInstallationActivity) {
        return (Device) wpa02ToiletInstallationActivity.f55336e.getValue(wpa02ToiletInstallationActivity, f55335j[0]);
    }

    public static final k D3(Wpa02ToiletInstallationActivity wpa02ToiletInstallationActivity) {
        return (k) wpa02ToiletInstallationActivity.f55338g.getValue();
    }

    public static final void E3(Wpa02ToiletInstallationActivity wpa02ToiletInstallationActivity, Setup setup) {
        wpa02ToiletInstallationActivity.getClass();
        EnablePermissionsForScanActivity.ScanningAbilityProvider.WithSetup withSetup = new EnablePermissionsForScanActivity.ScanningAbilityProvider.WithSetup(setup);
        Intent intent = new Intent(wpa02ToiletInstallationActivity, EnablePermissionsForScanActivity.class);
        intent.putExtra("extra_scanning_ability_provider", withSetup);
        wpa02ToiletInstallationActivity.f55340i.a(intent);
    }

    public static void z3(Wpa02ToiletInstallationActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.setResult(0);
        k kVar = (k) this$0.f55338g.getValue();
        kVar.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(kVar), Dispatchers.getIO(), null, new q(kVar, null), 2, null);
        this$0.finish();
    }

    @Override // com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet.Hilt_Wpa02ToiletInstallationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        e.k.a(this, new s1.a(true, -133307896, new a()));
    }
}
