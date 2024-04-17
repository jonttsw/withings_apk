package com.withings.wiscale2.device.common.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.android.activity.WithingsActivity;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.LuminosityLevel;
import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.conversation.DeviceBrightnessConversation;
import com.withings.wiscale2.device.common.ui.a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: DeviceBrightnessActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withings/wiscale2/device/common/ui/DeviceBrightnessActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/wiscale2/device/common/conversation/DeviceBrightnessConversation$a;", "Lcom/withings/wiscale2/device/common/ui/a0$a;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class DeviceBrightnessActivity extends WithingsActivity implements DeviceBrightnessConversation.a, a0.a {

    /* renamed from: a  reason: collision with root package name */
    private final d f53666a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f53667b;

    /* renamed from: c  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f53668c;

    /* renamed from: d  reason: collision with root package name */
    private DeviceBrightnessConversation f53669d;

    /* renamed from: e  reason: collision with root package name */
    private ej.k<DeviceBrightnessConversation> f53670e;

    /* renamed from: g  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f53665g = {androidx.camera.core.v.c(DeviceBrightnessActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0), androidx.camera.core.v.c(DeviceBrightnessActivity.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/BrightnessActivityBinding;", 0)};

    /* renamed from: f  reason: collision with root package name */
    public static final a f53664f = new Object();

    /* compiled from: DeviceBrightnessActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context, Device device) {
            Intent putExtra = new Intent(context, DeviceBrightnessActivity.class).putExtra("EXTRA_DEVICE", device);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: DeviceBrightnessActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.ui.DeviceBrightnessActivity$onError$1", f = "DeviceBrightnessActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {
        b(qm0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new b(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            Toast.makeText(DeviceBrightnessActivity.this.getApplicationContext(), (int) C1987R.string._SETUP_ERROR_MESSAGE_UNKNOWN_ERROR_, 0).show();
            return nm0.y.f85009a;
        }
    }

    /* compiled from: DeviceBrightnessActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.ui.DeviceBrightnessActivity$onLuminosityReceived$1", f = "DeviceBrightnessActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LuminosityLevel f53673b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(LuminosityLevel luminosityLevel, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f53673b = luminosityLevel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new c(this.f53673b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Short sh2;
            Short sh3;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            a aVar = DeviceBrightnessActivity.f53664f;
            androidx.fragment.app.m0 m11 = DeviceBrightnessActivity.this.getSupportFragmentManager().m();
            a0 a0Var = new a0();
            nm0.j[] jVarArr = new nm0.j[2];
            LuminosityLevel luminosityLevel = this.f53673b;
            if (luminosityLevel != null) {
                sh2 = Short.valueOf(luminosityLevel.mode);
            } else {
                sh2 = null;
            }
            jVarArr[0] = new nm0.j("mode", sh2);
            if (luminosityLevel != null) {
                sh3 = Short.valueOf(luminosityLevel.level);
            } else {
                sh3 = null;
            }
            jVarArr[1] = new nm0.j("brightness", sh3);
            a0Var.setArguments(androidx.core.os.e.a(jVarArr));
            m11.l(C1987R.id.content, a0Var, null);
            m11.g();
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class d implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f53674a = nm0.h.b(new z(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f53675b;

        public d(Activity activity) {
            this.f53675b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f53674a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.l<ComponentActivity, tb0.c1> {
        @Override // ym0.l
        public final tb0.c1 invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            kotlin.jvm.internal.u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.container);
            kotlin.jvm.internal.u.i(e11, "requireViewById(this, id)");
            return tb0.c1.a(e11);
        }
    }

    /* compiled from: DeviceBrightnessActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<ej.w> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f53676a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final ej.w invoke() {
            return ej.w.w();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public DeviceBrightnessActivity() {
        super(C1987R.layout.brightness_activity);
        this.f53666a = new d(this);
        this.f53667b = nm0.h.b(f.f53676a);
        this.f53668c = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new kotlin.jvm.internal.w(1));
    }

    @Override // com.withings.wiscale2.device.common.ui.a0.a
    public final void U(a0 fragment, LuminosityLevel luminosityLevel) {
        nm0.y yVar;
        kotlin.jvm.internal.u.j(fragment, "fragment");
        DeviceBrightnessConversation deviceBrightnessConversation = this.f53669d;
        if (deviceBrightnessConversation != null) {
            deviceBrightnessConversation.L(luminosityLevel);
            yVar = nm0.y.f85009a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            DeviceBrightnessConversation deviceBrightnessConversation2 = this.f53669d;
            if (deviceBrightnessConversation2 != null) {
                deviceBrightnessConversation2.p();
            }
            finish();
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation.b
    public final void e3(WppDeviceConversation conversation, Exception exc) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        ej.k<DeviceBrightnessConversation> kVar = this.f53670e;
        if (kVar != null) {
            kVar.k();
        }
        this.f53670e = null;
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), Dispatchers.getMain(), null, new b(null), 2, null);
        DeviceBrightnessConversation deviceBrightnessConversation = this.f53669d;
        if (deviceBrightnessConversation != null) {
            deviceBrightnessConversation.p();
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        DeviceBrightnessConversation deviceBrightnessConversation = this.f53669d;
        if (deviceBrightnessConversation != null) {
            deviceBrightnessConversation.p();
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.core.view.l1.a(getWindow(), false);
        by.kirich1409.viewbindingdelegate.f fVar = this.f53668c;
        fn0.k<Object>[] kVarArr = f53665g;
        Object value = ((LifecycleViewBindingProperty) fVar).getValue(this, kVarArr[1]);
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        LinearLayout b10 = ((tb0.c1) value).b();
        kotlin.jvm.internal.u.i(b10, "getRoot(...)");
        ay.b.n(b10, true, false, 29);
        Object value2 = ((LifecycleViewBindingProperty) fVar).getValue(this, kVarArr[1]);
        kotlin.jvm.internal.u.i(value2, "getValue(...)");
        setSupportActionBar(((tb0.c1) value2).f98897b);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        cj.d b11 = jl.a.b((Device) this.f53666a.getValue(this, kVarArr[0]));
        DeviceBrightnessConversation deviceBrightnessConversation = new DeviceBrightnessConversation(this);
        ej.w wVar = (ej.w) this.f53667b.getValue();
        wVar.getClass();
        ej.k<DeviceBrightnessConversation> u11 = wVar.u(b11, deviceBrightnessConversation, DeviceBrightnessConversation.class);
        this.f53670e = u11;
        u11.r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        DeviceBrightnessConversation deviceBrightnessConversation = this.f53669d;
        if (deviceBrightnessConversation != null) {
            deviceBrightnessConversation.p();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == 16908332) {
            DeviceBrightnessConversation deviceBrightnessConversation = this.f53669d;
            if (deviceBrightnessConversation != null) {
                deviceBrightnessConversation.p();
            }
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.withings.wiscale2.device.common.conversation.DeviceBrightnessConversation.a
    public final void r3(DeviceBrightnessConversation conversation, LuminosityLevel luminosityLevel) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        this.f53669d = conversation;
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), Dispatchers.getMain(), null, new c(luminosityLevel, null), 2, null);
    }
}
