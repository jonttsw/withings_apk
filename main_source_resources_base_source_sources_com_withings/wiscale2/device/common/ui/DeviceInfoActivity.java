package com.withings.wiscale2.device.common.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
/* compiled from: DeviceInfoActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/device/common/ui/DeviceInfoActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lnn/c;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class DeviceInfoActivity extends Hilt_DeviceInfoActivity implements nn.c {

    /* renamed from: e  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f53679e;

    /* renamed from: f  reason: collision with root package name */
    private final e f53680f;
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public h0 f53681g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f53682h;

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f53678j = {androidx.camera.core.v.c(DeviceInfoActivity.class, "layout", "getLayout()Lcom/withings/wiscale2/databinding/ActivityDeviceInfoBinding;", 0), androidx.camera.core.v.c(DeviceInfoActivity.class, "deviceInfo", "getDeviceInfo()Lcom/withings/device/details/DeviceInfo;", 0)};

    /* renamed from: i  reason: collision with root package name */
    public static final a f53677i = new Object();

    /* compiled from: DeviceInfoActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context, nn.i iVar) {
            Intent putExtra = com.withings.authentication.n.a(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, context, DeviceInfoActivity.class).putExtra("device_info", iVar);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: DeviceInfoActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Integer num) {
            Integer num2 = num;
            kotlin.jvm.internal.u.g(num2);
            DeviceInfoActivity.this.setTitle(num2.intValue());
            return nm0.y.f85009a;
        }
    }

    /* compiled from: DeviceInfoActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<Fragment, nm0.y> {
        c() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Fragment fragment) {
            Fragment fragment2 = fragment;
            if (fragment2 != null) {
                a aVar = DeviceInfoActivity.f53677i;
                androidx.fragment.app.m0 m11 = DeviceInfoActivity.this.getSupportFragmentManager().m();
                m11.l(C1987R.id.content, fragment2, null);
                m11.g();
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: DeviceInfoActivity.kt */
    /* loaded from: classes5.dex */
    static final class d implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f53685a;

        d(ym0.l lVar) {
            this.f53685a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f53685a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f53685a;
        }

        public final int hashCode() {
            return this.f53685a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f53685a.invoke(obj);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class e implements bn0.d<Activity, nn.i> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f53686a = nm0.h.b(new d0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f53687b;

        public e(Activity activity) {
            this.f53687b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [nn.i, java.lang.Object] */
        @Override // bn0.d
        public final nn.i getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f53686a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.l<ComponentActivity, tb0.f> {
        @Override // ym0.l
        public final tb0.f invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            kotlin.jvm.internal.u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.container);
            kotlin.jvm.internal.u.i(e11, "requireViewById(this, id)");
            return tb0.f.a(e11);
        }
    }

    /* compiled from: DeviceInfoActivity.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<g0> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final g0 invoke() {
            DeviceInfoActivity deviceInfoActivity = DeviceInfoActivity.this;
            return (g0) new androidx.lifecycle.k1(deviceInfoActivity, new e0(deviceInfoActivity)).a(g0.class);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public DeviceInfoActivity() {
        super(0);
        this.f53679e = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new kotlin.jvm.internal.w(1));
        this.f53680f = new e(this);
        this.f53682h = nm0.h.b(new g());
    }

    public static final nn.i z3(DeviceInfoActivity deviceInfoActivity) {
        return (nn.i) deviceInfoActivity.f53680f.getValue(deviceInfoActivity, f53678j[1]);
    }

    @Override // com.withings.wiscale2.device.common.ui.Hilt_DeviceInfoActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.core.view.l1.a(getWindow(), false);
        by.kirich1409.viewbindingdelegate.f fVar = this.f53679e;
        fn0.k<Object>[] kVarArr = f53678j;
        Object value = ((LifecycleViewBindingProperty) fVar).getValue(this, kVarArr[0]);
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        Toolbar toolbar = ((tb0.f) value).f99053a;
        kotlin.jvm.internal.u.i(toolbar, "toolbar");
        ay.b.n(toolbar, true, false, 29);
        Object value2 = ((LifecycleViewBindingProperty) fVar).getValue(this, kVarArr[0]);
        kotlin.jvm.internal.u.i(value2, "getValue(...)");
        setSupportActionBar(((tb0.f) value2).f99053a);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        g0 g0Var = (g0) this.f53682h.getValue();
        g0Var.g0().observe(this, new d(new b()));
        g0Var.f0().observe(this, new d(new c()));
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
