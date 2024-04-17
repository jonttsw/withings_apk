package com.withings.wiscale2.device.common.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
/* compiled from: DeviceBondingActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/ui/DeviceBondingActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class DeviceBondingActivity extends WithingsActivity {

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f53656c = {androidx.camera.core.v.c(DeviceBondingActivity.class, "macAddress", "getMacAddress()Ljava/lang/String;", 0)};

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f53657a = nm0.h.b(new d());

    /* renamed from: b  reason: collision with root package name */
    private final c f53658b = new c(this);

    /* compiled from: DeviceBondingActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Integer num) {
            int intValue;
            Integer num2 = num;
            if (num2 == null) {
                intValue = 0;
            } else {
                intValue = num2.intValue();
            }
            DeviceBondingActivity.A3(DeviceBondingActivity.this, intValue);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: DeviceBondingActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Boolean bool) {
            DeviceBondingActivity.this.finish();
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Activity, String> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f53661a = nm0.h.b(new x(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f53662b;

        public c(Activity activity) {
            this.f53662b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.String] */
        @Override // bn0.d
        public final String getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f53661a.getValue();
        }
    }

    /* compiled from: DeviceBondingActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<v> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final v invoke() {
            DeviceBondingActivity deviceBondingActivity = DeviceBondingActivity.this;
            return (v) new androidx.lifecycle.k1(deviceBondingActivity, new y(deviceBondingActivity)).a(v.class);
        }
    }

    public static final void A3(DeviceBondingActivity deviceBondingActivity, int i11) {
        kn.e c11 = kn.e.c();
        deviceBondingActivity.getClass();
        int modelId = c11.e((String) deviceBondingActivity.f53658b.getValue(deviceBondingActivity, f53656c[0])).getModelId();
        if (i11 != 11) {
            if (i11 != 22) {
                if (i11 != 33) {
                    if (i11 == 44) {
                        r rVar = new r();
                        rVar.setArguments(androidx.core.os.e.a(new nm0.j("extra_model_id", Integer.valueOf(modelId))));
                        deviceBondingActivity.B3(rVar);
                        return;
                    }
                    throw new IllegalArgumentException("unknown page for DeviceBondingActivity");
                }
                deviceBondingActivity.B3(new s());
                return;
            }
            t tVar = new t();
            tVar.setArguments(androidx.core.os.e.a(new nm0.j("extra_model_id", Integer.valueOf(modelId))));
            deviceBondingActivity.B3(tVar);
            return;
        }
        u uVar = new u();
        uVar.setArguments(androidx.core.os.e.a(new nm0.j("extra_model_id", Integer.valueOf(modelId))));
        deviceBondingActivity.B3(uVar);
    }

    private final void B3(Fragment fragment) {
        androidx.fragment.app.m0 m11 = getSupportFragmentManager().m();
        m11.l(C1987R.id.content, fragment, null);
        m11.f();
    }

    public static final String z3(DeviceBondingActivity deviceBondingActivity) {
        deviceBondingActivity.getClass();
        return (String) deviceBondingActivity.f53658b.getValue(deviceBondingActivity, f53656c[0]);
    }

    public final v C3() {
        return (v) this.f53657a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_bonding);
        setSupportActionBar((Toolbar) findViewById(C1987R.id.toolbar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.w("");
            supportActionBar.o(true);
            supportActionBar.s(y70.a.c(C1987R.drawable.icon_medium_navigation_close, this, ah.u.w(C1987R.attr.colorOnPrimary, this, -65281)));
        }
        xw.d.c(this, C3().m0(), new a());
        xw.d.c(this, C3().j0(), new b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C3().p0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C3().r0();
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
}
