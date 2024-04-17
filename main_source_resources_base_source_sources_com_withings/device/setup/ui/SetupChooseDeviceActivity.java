package com.withings.device.setup.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.camera.core.v;
import androidx.compose.material.r3;
import androidx.core.view.l1;
import com.withings.common.device.reporting.InstallStateReporter;
import com.withings.device.Device;
import com.withings.device.DeviceModel;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.devicesetup.ui.SetupStateListener;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import fl.p;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import yk.o;
/* compiled from: SetupChooseDeviceActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/device/setup/ui/SetupChooseDeviceActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SetupChooseDeviceActivity extends Hilt_SetupChooseDeviceActivity {

    /* renamed from: e  reason: collision with root package name */
    private final d f37483e = new d(this);

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f37484f = nm0.h.b(new c());
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public p f37485g;
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public kn.e f37486h;

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f37482j = {v.c(SetupChooseDeviceActivity.class, "isAccountCreation", "isAccountCreation()Z", 0)};

    /* renamed from: i  reason: collision with root package name */
    public static final a f37481i = new Object();

    /* compiled from: SetupChooseDeviceActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static Intent a(Context context, boolean z5, InstallStateReporter installStateReporter) {
            Intent putExtra = com.withings.authentication.n.a(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, context, SetupChooseDeviceActivity.class).putExtra("extra_account_creation", z5).putExtra("extra_setup_state_listener", installStateReporter);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: SetupChooseDeviceActivity.kt */
    /* loaded from: classes3.dex */
    static final class b extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {
        b() {
            super(2);
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                o.b(false, s1.b.b(aVar2, -1877290835, new h(SetupChooseDeviceActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: SetupChooseDeviceActivity.kt */
    /* loaded from: classes3.dex */
    static final class c extends w implements ym0.a<SetupStateListener> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final SetupStateListener invoke() {
            Object parcelableExtra;
            Intent intent = SetupChooseDeviceActivity.this.getIntent();
            u.i(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = intent.getParcelableExtra("extra_setup_state_listener", SetupStateListener.class);
            } else {
                parcelableExtra = intent.getParcelableExtra("extra_setup_state_listener");
            }
            return (SetupStateListener) parcelableExtra;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class d implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f37489a = nm0.h.b(new j(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f37490b;

        public d(Activity activity) {
            this.f37490b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f37489a.getValue();
        }
    }

    public static final SetupStateListener A3(SetupChooseDeviceActivity setupChooseDeviceActivity) {
        return (SetupStateListener) setupChooseDeviceActivity.f37484f.getValue();
    }

    public static final void B3(SetupChooseDeviceActivity setupChooseDeviceActivity) {
        kn.e eVar = setupChooseDeviceActivity.f37486h;
        if (eVar != null) {
            List<Device> g11 = eVar.g(60);
            if (g11.size() == 1) {
                Object I = x.I(g11);
                u.i(I, "first(...)");
                setupChooseDeviceActivity.D3((Device) I);
                return;
            }
            List<Device> list = g11;
            ArrayList arrayList = new ArrayList(x.y(list, 10));
            for (Device device : list) {
                String string = setupChooseDeviceActivity.getString(p.f67672b.a().g(device).I(device.getColor()));
                u.i(string, "getString(...)");
                String iVar = device.getMacAddress().toString();
                u.i(iVar, "toString(...)");
                String b10 = r3.b(iVar, 2, "substring(...)");
                arrayList.add(string + " " + b10);
            }
            qc.b bVar = new qc.b(setupChooseDeviceActivity);
            bVar.t(true);
            bVar.u((CharSequence[]) arrayList.toArray(new String[0]), new com.withings.device.setup.ui.c(0, setupChooseDeviceActivity, g11));
            bVar.s();
            return;
        }
        u.s("deviceManager");
        throw null;
    }

    public static final boolean C3(SetupChooseDeviceActivity setupChooseDeviceActivity) {
        return ((Boolean) setupChooseDeviceActivity.f37483e.getValue(setupChooseDeviceActivity, f37482j[0])).booleanValue();
    }

    private final void D3(Device device) {
        p pVar = this.f37485g;
        if (pVar != null) {
            startActivity(SetupActivity.P3(this, pVar.d(61).e0(new DeviceModel(61, null)), jl.a.b(device), (SetupStateListener) this.f37484f.getValue()));
        } else {
            u.s("hmModelFactory");
            throw null;
        }
    }

    public static void z3(SetupChooseDeviceActivity this$0, List wsd01s, int i11) {
        u.j(this$0, "this$0");
        u.j(wsd01s, "$wsd01s");
        this$0.D3((Device) wsd01s.get(i11));
    }

    @Override // com.withings.device.setup.ui.Hilt_SetupChooseDeviceActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, 1645513991, new b()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!new ui.b(this).b()) {
            qc.b bVar = new qc.b(this);
            bVar.C(C1987R.string._INTERNET_NEEDED_TITLE_);
            bVar.g(C1987R.string._INTERNET_NEEDED_TEXT_);
            qc.b z5 = bVar.z(C1987R.string._OK_, new ao.i(this, 1));
            z5.t(false);
            z5.s();
        }
    }
}
