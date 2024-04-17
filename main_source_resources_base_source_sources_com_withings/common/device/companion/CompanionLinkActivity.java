package com.withings.common.device.companion;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.camera.core.v;
import androidx.lifecycle.k1;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.android.activity.WithingsActivity;
import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: CompanionLinkActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/common/device/companion/CompanionLinkActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CompanionLinkActivity extends WithingsActivity {

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f35061e = {v.c(CompanionLinkActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0), v.c(CompanionLinkActivity.class, "layout", "getLayout()Lcom/withings/common/device/databinding/ActivityCompanionLinkBinding;", 0)};

    /* renamed from: a  reason: collision with root package name */
    private final b f35062a;

    /* renamed from: b  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f35063b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f35064c;

    /* renamed from: d  reason: collision with root package name */
    private g f35065d;

    /* compiled from: CompanionLinkActivity.kt */
    /* loaded from: classes3.dex */
    static final class a extends w implements ym0.a<DeviceCompanionLinkProvider> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final DeviceCompanionLinkProvider invoke() {
            return new DeviceCompanionLinkProvider(CompanionLinkActivity.this);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f35067a = nm0.h.b(new f(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f35068b;

        public b(Activity activity) {
            this.f35068b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f35067a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes3.dex */
    public static final class c extends w implements ym0.l<ComponentActivity, cl.a> {
        @Override // ym0.l
        public final cl.a invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.root);
            u.i(e11, "requireViewById(this, id)");
            return cl.a.a(e11);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public CompanionLinkActivity() {
        super(C1987R.layout.activity_companion_link);
        this.f35062a = new b(this);
        this.f35063b = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new w(1));
        this.f35064c = nm0.h.b(new a());
    }

    public static final DeviceCompanionLinkProvider A3(CompanionLinkActivity companionLinkActivity) {
        return (DeviceCompanionLinkProvider) companionLinkActivity.f35064c.getValue();
    }

    public static final Device z3(CompanionLinkActivity companionLinkActivity) {
        return (Device) companionLinkActivity.f35062a.getValue(companionLinkActivity, f35061e[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Object value = ((LifecycleViewBindingProperty) this.f35063b).getValue(this, f35061e[1]);
        u.i(value, "getValue(...)");
        setSupportActionBar(((cl.a) value).f22986a);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        g gVar = (g) new k1(this, new zk.a(this)).a(g.class);
        xw.d.c(this, gVar.t0(), new com.withings.common.device.companion.a(this));
        xw.d.c(this, gVar.r0(), new com.withings.common.device.companion.b(this));
        this.f35065d = gVar;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
            y yVar = y.f85009a;
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
