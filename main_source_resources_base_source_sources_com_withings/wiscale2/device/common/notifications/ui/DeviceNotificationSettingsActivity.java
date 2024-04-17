package com.withings.wiscale2.device.common.notifications.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.AncsStatus;
import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.notifications.conversation.DeviceNotificationConversation;
import com.withings.wiscale2.device.common.notifications.ui.m;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: DeviceNotificationSettingsActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/device/common/notifications/ui/DeviceNotificationSettingsActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/wiscale2/device/common/notifications/conversation/DeviceNotificationConversation$a;", "Lcom/withings/wiscale2/device/common/notifications/ui/m$a;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class DeviceNotificationSettingsActivity extends Hilt_DeviceNotificationSettingsActivity implements DeviceNotificationConversation.a, m.a {

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f52804m = {androidx.camera.core.v.c(DeviceNotificationSettingsActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0), androidx.camera.core.v.c(DeviceNotificationSettingsActivity.class, "isInstall", "isInstall()Z", 0), androidx.camera.core.v.c(DeviceNotificationSettingsActivity.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/ActivitySettingsAncsBinding;", 0)};
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public s20.b f52805e;

    /* renamed from: f  reason: collision with root package name */
    private final e f52806f;

    /* renamed from: g  reason: collision with root package name */
    private final f f52807g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f52808h;

    /* renamed from: i  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f52809i;

    /* renamed from: j  reason: collision with root package name */
    private DeviceNotificationConversation f52810j;

    /* renamed from: k  reason: collision with root package name */
    private ej.k<DeviceNotificationConversation> f52811k;

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f52812l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceNotificationSettingsActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.notifications.ui.DeviceNotificationSettingsActivity$leaveActivityAndConversation$1", f = "DeviceNotificationSettingsActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {
        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            DeviceNotificationSettingsActivity deviceNotificationSettingsActivity = DeviceNotificationSettingsActivity.this;
            DeviceNotificationSettingsActivity.A3(deviceNotificationSettingsActivity).a(DeviceNotificationSettingsActivity.z3(deviceNotificationSettingsActivity));
            return nm0.y.f85009a;
        }
    }

    /* compiled from: DeviceNotificationSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<nc0.a> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final nc0.a invoke() {
            com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
            kotlin.jvm.internal.u.i(a11, "get(...)");
            DeviceNotificationSettingsActivity deviceNotificationSettingsActivity = DeviceNotificationSettingsActivity.this;
            th0.i iVar = new th0.i(deviceNotificationSettingsActivity);
            fb0.b g11 = fb0.b.g();
            if (g11 != null) {
                s20.b bVar = deviceNotificationSettingsActivity.f52805e;
                if (bVar != null) {
                    gb0.c cVar = new gb0.c(deviceNotificationSettingsActivity, bVar);
                    u70.i macAddress = DeviceNotificationSettingsActivity.z3(deviceNotificationSettingsActivity).getMacAddress();
                    kotlin.jvm.internal.u.i(macAddress, "getMacAddress(...)");
                    return new nc0.a(a11, iVar, g11, cVar, macAddress);
                }
                kotlin.jvm.internal.u.s("getPopularAppsPrefUseCase");
                throw null;
            }
            kotlin.jvm.internal.u.s("instance");
            throw null;
        }
    }

    /* compiled from: DeviceNotificationSettingsActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.notifications.ui.DeviceNotificationSettingsActivity$onConversationReady$1", f = "DeviceNotificationSettingsActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {
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
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            DeviceNotificationSettingsActivity.B3(DeviceNotificationSettingsActivity.this);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: DeviceNotificationSettingsActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.notifications.ui.DeviceNotificationSettingsActivity$onError$1", f = "DeviceNotificationSettingsActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {
        d(qm0.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new d(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            Toast.makeText(DeviceNotificationSettingsActivity.this.getApplicationContext(), (int) C1987R.string._SETUP_ERROR_MESSAGE_UNKNOWN_ERROR_, 0).show();
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class e implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f52817a = nm0.h.b(new com.withings.wiscale2.device.common.notifications.ui.d(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f52818b;

        public e(Activity activity) {
            this.f52818b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f52817a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class f implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f52819a = nm0.h.b(new com.withings.wiscale2.device.common.notifications.ui.e(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f52820b;

        public f(Activity activity) {
            this.f52820b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f52819a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.l<ComponentActivity, tb0.l0> {
        @Override // ym0.l
        public final tb0.l0 invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            kotlin.jvm.internal.u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.container);
            kotlin.jvm.internal.u.i(e11, "requireViewById(this, id)");
            return tb0.l0.a(e11);
        }
    }

    /* compiled from: DeviceNotificationSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.a<ej.w> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f52821a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final ej.w invoke() {
            return ej.w.w();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public DeviceNotificationSettingsActivity() {
        super(0);
        this.f52806f = new e(this);
        this.f52807g = new f(this);
        this.f52808h = nm0.h.b(h.f52821a);
        this.f52809i = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new kotlin.jvm.internal.w(1));
        this.f52812l = nm0.h.b(new b());
    }

    public static final nc0.a A3(DeviceNotificationSettingsActivity deviceNotificationSettingsActivity) {
        return (nc0.a) deviceNotificationSettingsActivity.f52812l.getValue();
    }

    public static final void B3(DeviceNotificationSettingsActivity deviceNotificationSettingsActivity) {
        deviceNotificationSettingsActivity.getClass();
        m.b bVar = m.f52947s;
        Device device = (Device) deviceNotificationSettingsActivity.f52806f.getValue(deviceNotificationSettingsActivity, f52804m[0]);
        boolean C3 = deviceNotificationSettingsActivity.C3();
        bVar.getClass();
        kotlin.jvm.internal.u.j(device, "device");
        m mVar = new m();
        mVar.setArguments(androidx.core.os.e.a(new nm0.j("device", device), new nm0.j("from_install", Boolean.valueOf(C3))));
        androidx.fragment.app.m0 m11 = deviceNotificationSettingsActivity.getSupportFragmentManager().m();
        m11.l(C1987R.id.content, mVar, null);
        m11.g();
    }

    private final boolean C3() {
        return ((Boolean) this.f52807g.getValue(this, f52804m[1])).booleanValue();
    }

    private final void D3() {
        DeviceNotificationConversation deviceNotificationConversation;
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), Dispatchers.getIO(), null, new a(null), 2, null);
        DeviceNotificationConversation deviceNotificationConversation2 = this.f52810j;
        if (deviceNotificationConversation2 != null) {
            deviceNotificationConversation2.L();
        }
        if (!C3() && (deviceNotificationConversation = this.f52810j) != null) {
            deviceNotificationConversation.p();
        }
        setResult(-1);
        finish();
    }

    public static final Device z3(DeviceNotificationSettingsActivity deviceNotificationSettingsActivity) {
        deviceNotificationSettingsActivity.getClass();
        return (Device) deviceNotificationSettingsActivity.f52806f.getValue(deviceNotificationSettingsActivity, f52804m[0]);
    }

    @Override // com.withings.wiscale2.device.common.notifications.ui.m.a
    public final void C1(AncsStatus ancsStatus) {
        DeviceNotificationConversation deviceNotificationConversation = this.f52810j;
        if (deviceNotificationConversation != null) {
            deviceNotificationConversation.M(ancsStatus);
        }
    }

    @Override // com.withings.wiscale2.device.common.notifications.conversation.DeviceNotificationConversation.a
    public final void R(DeviceNotificationConversation conversation) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        this.f52810j = conversation;
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), Dispatchers.getMain(), null, new c(null), 2, null);
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation.b
    public final void e3(WppDeviceConversation conversation, Exception exc) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        ej.k<DeviceNotificationConversation> kVar = this.f52811k;
        if (kVar != null) {
            kVar.k();
        }
        this.f52811k = null;
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), Dispatchers.getMain(), null, new d(null), 2, null);
        D3();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        D3();
    }

    @Override // com.withings.wiscale2.device.common.notifications.ui.Hilt_DeviceNotificationSettingsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.core.view.l1.a(getWindow(), false);
        by.kirich1409.viewbindingdelegate.f fVar = this.f52809i;
        fn0.k<Object>[] kVarArr = f52804m;
        Object value = ((LifecycleViewBindingProperty) fVar).getValue(this, kVarArr[2]);
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        LinearLayout b10 = ((tb0.l0) value).b();
        kotlin.jvm.internal.u.i(b10, "getRoot(...)");
        ay.b.n(b10, true, false, 29);
        if (C3()) {
            getWindow().addFlags(128);
        }
        Object value2 = ((LifecycleViewBindingProperty) fVar).getValue(this, kVarArr[2]);
        kotlin.jvm.internal.u.i(value2, "getValue(...)");
        setSupportActionBar(((tb0.l0) value2).f99298b);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        cj.d b11 = jl.a.b((Device) this.f52806f.getValue(this, kVarArr[0]));
        DeviceNotificationConversation deviceNotificationConversation = new DeviceNotificationConversation(this);
        ej.w wVar = (ej.w) this.f52808h.getValue();
        wVar.getClass();
        ej.k<DeviceNotificationConversation> u11 = wVar.u(b11, deviceNotificationConversation, DeviceNotificationConversation.class);
        this.f52811k = u11;
        u11.r();
    }

    @Override // com.withings.wiscale2.device.common.notifications.ui.Hilt_DeviceNotificationSettingsActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onDestroy() {
        ej.k<DeviceNotificationConversation> kVar = this.f52811k;
        if (kVar != null) {
            kVar.k();
        }
        DeviceNotificationConversation deviceNotificationConversation = this.f52810j;
        if (deviceNotificationConversation != null) {
            if (!C3()) {
                deviceNotificationConversation = null;
            }
            if (deviceNotificationConversation != null) {
                deviceNotificationConversation.p();
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == 16908332) {
            D3();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.withings.wiscale2.device.common.notifications.ui.m.a
    public final void s1(m fragment) {
        kotlin.jvm.internal.u.j(fragment, "fragment");
        D3();
    }

    @Override // com.withings.wiscale2.device.common.notifications.ui.m.a
    public final void x() {
        DeviceNotificationConversation deviceNotificationConversation = this.f52810j;
        if (deviceNotificationConversation != null) {
            deviceNotificationConversation.L();
        }
    }
}
