package com.withings.device.details.scale;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.m0;
import com.withings.device.Device;
import com.withings.device.details.scale.c0;
import com.withings.util.log.Fail;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
/* compiled from: ScaleSharingActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/withings/device/details/scale/ScaleSharingActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/device/details/scale/c0$a;", "<init>", "()V", "a", "device-details-scale_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ScaleSharingActivity extends Hilt_ScaleSharingActivity implements c0.a {

    /* renamed from: e  reason: collision with root package name */
    private final b f36895e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f36896f;

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f36894h = {androidx.camera.core.v.c(ScaleSharingActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0)};

    /* renamed from: g  reason: collision with root package name */
    public static final a f36893g = new Object();

    /* compiled from: ScaleSharingActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f36897a = nm0.h.b(new a0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f36898b;

        public b(Activity activity) {
            this.f36898b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f36897a.getValue();
        }
    }

    /* compiled from: ScaleSharingActivity.kt */
    /* loaded from: classes3.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<Toolbar> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Toolbar invoke() {
            return (Toolbar) ScaleSharingActivity.this.findViewById(C1987R.id.toolbar);
        }
    }

    public ScaleSharingActivity() {
        super(0);
        this.f36895e = new b(this);
        this.f36896f = nm0.h.b(new c());
    }

    @Override // com.withings.device.details.scale.Hilt_ScaleSharingActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        fn0.k<Object>[] kVarArr = f36894h;
        fn0.k<Object> kVar = kVarArr[0];
        b bVar = this.f36895e;
        Fail.h((Device) bVar.getValue(this, kVar), "Provided Device must not be null");
        Device device = (Device) bVar.getValue(this, kVarArr[0]);
        nm0.y yVar = null;
        if (device != null) {
            m0 m11 = getSupportFragmentManager().m();
            c0.f36913m.getClass();
            c0 c0Var = new c0();
            c0Var.setArguments(androidx.core.os.e.a(new nm0.j("EXTRA_DEVICE", device)));
            m11.l(C1987R.id.content, c0Var, null);
            m11.f();
            yVar = nm0.y.f85009a;
        }
        if (yVar == null) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        nm0.g gVar = this.f36896f;
        setSupportActionBar((Toolbar) gVar.getValue());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(false);
            supportActionBar.o(true);
        }
        ((Toolbar) gVar.getValue()).setNavigationOnClickListener(new z(this, 0));
    }

    @Override // com.withings.device.details.scale.c0.a
    public final void w1() {
        setResult(-1);
        finish();
    }
}
