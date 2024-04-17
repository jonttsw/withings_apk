package com.withings.device.details.wsd.programs.moon;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.internal.n0;
import androidx.camera.core.v;
import bj.a;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.larswerkman.holocolorpicker.ColorPicker;
import com.withings.android.activity.WithingsActivity;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.Device;
import com.withings.device.details.wsd.conversation.WsdSetColorConversation;
import com.withings.device.details.wsd.programs.moon.WsdMoodLightActivity;
import com.withings.wiscale2.C1987R;
import fn0.k;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import m0.t;
import nm0.g;
import nm0.h;
import nm0.l;
import nm0.y;
import qj.j;
import y.o;
import ym0.p;
/* compiled from: WsdMoodLightActivity.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/withings/device/details/wsd/programs/moon/WsdMoodLightActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lbj/a$c;", "Lcom/withings/device/details/wsd/conversation/WsdSetColorConversation;", "Lcom/withings/device/details/wsd/conversation/WsdSetColorConversation$a;", "<init>", "()V", "a", "device-details-wsd_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class WsdMoodLightActivity extends WithingsActivity implements a.c<WsdSetColorConversation>, WsdSetColorConversation.a {

    /* renamed from: a  reason: collision with root package name */
    private final e f37207a;

    /* renamed from: b  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f37208b;

    /* renamed from: c  reason: collision with root package name */
    private final g f37209c;

    /* renamed from: d  reason: collision with root package name */
    private WsdSetColorConversation f37210d;

    /* renamed from: e  reason: collision with root package name */
    private ProgressDialog f37211e;

    /* renamed from: f  reason: collision with root package name */
    private long f37212f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f37213g;

    /* renamed from: i  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f37206i = {v.c(WsdMoodLightActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0), v.c(WsdMoodLightActivity.class, "binding", "getBinding()Lcom/withings/device/details/wsd/databinding/ActivityMoodLightBinding;", 0)};

    /* renamed from: h  reason: collision with root package name */
    public static final a f37205h = new Object();

    /* compiled from: WsdMoodLightActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* compiled from: WsdMoodLightActivity.kt */
    /* loaded from: classes3.dex */
    static final class b extends w implements ym0.a<bj.a<WsdSetColorConversation>> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final bj.a<WsdSetColorConversation> invoke() {
            WsdMoodLightActivity wsdMoodLightActivity = WsdMoodLightActivity.this;
            return new bj.a<>(jl.a.b(WsdMoodLightActivity.G3(wsdMoodLightActivity)), new WsdSetColorConversation(wsdMoodLightActivity), WsdSetColorConversation.class);
        }
    }

    /* compiled from: WsdMoodLightActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.wsd.programs.moon.WsdMoodLightActivity$onAuraLightOn$1", f = "WsdMoodLightActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class c extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f37216b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f37217c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f37218d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11, int i12, j jVar, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f37216b = i11;
            this.f37217c = i12;
            this.f37218d = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new c(this.f37216b, this.f37217c, this.f37218d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            long currentTimeMillis = System.currentTimeMillis();
            WsdMoodLightActivity wsdMoodLightActivity = WsdMoodLightActivity.this;
            wsdMoodLightActivity.f37212f = currentTimeMillis;
            wsdMoodLightActivity.J3().f100277b.setColor(this.f37216b);
            wsdMoodLightActivity.J3().f100276a.setProgress(this.f37217c);
            tn.a J3 = wsdMoodLightActivity.J3();
            boolean z5 = true;
            if (this.f37218d.d().state != 1) {
                z5 = false;
            }
            J3.f100278c.setChecked(z5);
            return y.f85009a;
        }
    }

    /* compiled from: WsdMoodLightActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.wsd.programs.moon.WsdMoodLightActivity$onError$1$1", f = "WsdMoodLightActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class d extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {
        d(qm0.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new d(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            WsdMoodLightActivity wsdMoodLightActivity = WsdMoodLightActivity.this;
            Toast.makeText(wsdMoodLightActivity, wsdMoodLightActivity.getString(C1987R.string._LOST_CONNECTION_), 0).show();
            return y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class e implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final g f37220a = h.b(new com.withings.device.details.wsd.programs.moon.b(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f37221b;

        public e(Activity activity) {
            this.f37221b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f37220a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes3.dex */
    public static final class f extends w implements ym0.l<ComponentActivity, tn.a> {
        @Override // ym0.l
        public final tn.a invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.mainLayout);
            u.i(e11, "requireViewById(this, id)");
            return tn.a.a(e11);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public WsdMoodLightActivity() {
        super(C1987R.layout.activity_mood_light);
        this.f37207a = new e(this);
        this.f37208b = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new w(1));
        this.f37209c = h.b(new b());
    }

    public static void A3(tn.a this_initViews, WsdMoodLightActivity this$0) {
        u.j(this_initViews, "$this_initViews");
        u.j(this$0, "this$0");
        this_initViews.f100278c.setChecked(true);
        j K3 = K3(false, 0, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        WsdSetColorConversation wsdSetColorConversation = this$0.f37210d;
        if (wsdSetColorConversation != null) {
            wsdSetColorConversation.G(K3);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new com.google.android.material.checkbox.a(this$0, 3), 100L);
    }

    public static void B3(WsdMoodLightActivity this$0) {
        u.j(this$0, "this$0");
        L3(this$0);
    }

    public static void C3(WsdMoodLightActivity this$0) {
        u.j(this$0, "this$0");
        this$0.f37212f = 0L;
        L3(this$0);
    }

    public static void D3(WsdMoodLightActivity this$0) {
        u.j(this$0, "this$0");
        this$0.I3();
    }

    public static void E3(WsdMoodLightActivity this$0) {
        u.j(this$0, "this$0");
        L3(this$0);
    }

    public static final Device G3(WsdMoodLightActivity wsdMoodLightActivity) {
        return (Device) wsdMoodLightActivity.f37207a.getValue(wsdMoodLightActivity, f37206i[0]);
    }

    private final void I3() {
        WsdSetColorConversation wsdSetColorConversation = this.f37210d;
        if (wsdSetColorConversation != null) {
            wsdSetColorConversation.p();
        }
        ((bj.a) this.f37209c.getValue()).a();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tn.a J3() {
        Object value = ((LifecycleViewBindingProperty) this.f37208b).getValue(this, f37206i[1]);
        u.i(value, "getValue(...)");
        return (tn.a) value;
    }

    private static j K3(boolean z5, int i11, double d11) {
        double d12 = d11 * 65535.0d;
        return new j(an0.a.a((Color.red(i11) * d12) / 255.0d), an0.a.a((Color.green(i11) * d12) / 255.0d), an0.a.a((Color.blue(i11) * d12) / 255.0d), z5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void L3(WsdMoodLightActivity wsdMoodLightActivity) {
        int color = wsdMoodLightActivity.J3().f100277b.getColor();
        wsdMoodLightActivity.getClass();
        if (System.currentTimeMillis() - wsdMoodLightActivity.f37212f > 200) {
            int progress = wsdMoodLightActivity.J3().f100276a.getProgress();
            if (progress == 0) {
                progress++;
            }
            j K3 = K3(wsdMoodLightActivity.J3().f100278c.isChecked(), color, progress / wsdMoodLightActivity.J3().f100276a.getMax());
            WsdSetColorConversation wsdSetColorConversation = wsdMoodLightActivity.f37210d;
            if (wsdSetColorConversation != null) {
                wsdSetColorConversation.G(K3);
            }
            wsdMoodLightActivity.f37212f = System.currentTimeMillis();
        }
    }

    public static void z3(WsdMoodLightActivity this$0) {
        u.j(this$0, "this$0");
        j K3 = K3(true, 0, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        WsdSetColorConversation wsdSetColorConversation = this$0.f37210d;
        if (wsdSetColorConversation != null) {
            wsdSetColorConversation.G(K3);
        }
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetColorConversation.a
    public final void X(WsdSetColorConversation conversation) {
        u.j(conversation, "conversation");
        if (!this.f37213g) {
            this.f37213g = true;
        }
    }

    @Override // bj.a.c
    public final void Y0(WsdSetColorConversation wsdSetColorConversation) {
        WsdSetColorConversation conversation = wsdSetColorConversation;
        u.j(conversation, "conversation");
    }

    @Override // bj.a.c
    public final void a0(WsdSetColorConversation wsdSetColorConversation) {
        WsdSetColorConversation conversation = wsdSetColorConversation;
        u.j(conversation, "conversation");
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation.b
    public final void e3(WppDeviceConversation conversation, Exception exc) {
        u.j(conversation, "conversation");
        if (this.f37210d != null) {
            BuildersKt.launch$default(t.l(this), Dispatchers.getMain(), null, new d(null), 2, null);
        }
        I3();
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetColorConversation.a
    public final void o0(WsdSetColorConversation conversation, j jVar) {
        u.j(conversation, "conversation");
        this.f37210d = conversation;
        ProgressDialog progressDialog = this.f37211e;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f37211e = null;
        }
        int b10 = jVar.b();
        int a11 = jVar.a();
        if (a11 == 0) {
            a11 = 50;
        }
        BuildersKt.launch$default(t.l(this), Dispatchers.getMain(), null, new c(b10, a11, jVar, null), 2, null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        I3();
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Toolbar toolbar = J3().f100279d;
        toolbar.setNavigationIcon(2131231755);
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        tn.a J3 = J3();
        J3.f100278c.setOnCheckedChangeListener(new vn.b(this, 1));
        ColorPicker colorPicker = J3.f100277b;
        colorPicker.setColor(0);
        SeekBar seekBar = J3.f100276a;
        seekBar.setProgress(50);
        colorPicker.setShowOldCenterColor(false);
        colorPicker.setOnColorSelectedListener(new n0(this));
        colorPicker.setOnColorChangedListener(new o(this));
        seekBar.setOnSeekBarChangeListener(new com.withings.device.details.wsd.programs.moon.a(this));
        J3.f100280e.setOnClickListener(new xn.b(J3, this, 0));
        if (this.f37211e == null) {
            this.f37211e = ProgressDialog.show(this, null, getString(C1987R.string._BT_POPUP_CONNECTING_TITLE_), true, true, new DialogInterface.OnCancelListener() { // from class: xn.a
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    WsdMoodLightActivity.D3(WsdMoodLightActivity.this);
                }
            });
        }
        g gVar = this.f37209c;
        ((bj.a) gVar.getValue()).c(this);
        ((bj.a) gVar.getValue()).e();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            I3();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // bj.a.c
    public final void w2(WsdSetColorConversation wsdSetColorConversation) {
        WsdSetColorConversation conversation = wsdSetColorConversation;
        u.j(conversation, "conversation");
    }

    @Override // bj.a.c
    public final void c1() {
    }
}
