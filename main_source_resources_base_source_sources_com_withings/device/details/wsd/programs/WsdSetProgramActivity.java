package com.withings.device.details.wsd.programs;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;
import androidx.camera.core.v;
import androidx.core.app.h0;
import com.withings.alarm.model.WsdProgram;
import com.withings.android.activity.WithingsActivity;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.Device;
import com.withings.device.details.wsd.conversation.DummyWsdSetProgramConversation;
import com.withings.device.details.wsd.conversation.WsdSetProgramConversation;
import com.withings.device.details.wsd.programs.WsdProgramActivity;
import com.withings.wiscale2.C1987R;
import ej.k;
import fn0.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import m0.t;
import nm0.l;
import nm0.y;
import u70.a;
import ym0.p;
/* compiled from: WsdSetProgramActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/withings/device/details/wsd/programs/WsdSetProgramActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/device/details/wsd/conversation/WsdSetProgramConversation$b;", "Lu70/a$c;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "device-details-wsd_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public abstract class WsdSetProgramActivity extends WithingsActivity implements WsdSetProgramConversation.b, a.c {

    /* renamed from: c  reason: collision with root package name */
    private boolean f37109c;

    /* renamed from: d  reason: collision with root package name */
    private WsdProgram f37110d;

    /* renamed from: f  reason: collision with root package name */
    private ProgressDialog f37112f;

    /* renamed from: i  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f37106i = {v.c(WsdSetProgramActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0)};

    /* renamed from: h  reason: collision with root package name */
    public static final a f37105h = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final f f37107a = new f(this);

    /* renamed from: b  reason: collision with root package name */
    private List<? extends WsdProgram> f37108b = i0.f76187a;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f37111e = nm0.h.b(new d());

    /* renamed from: g  reason: collision with root package name */
    private WsdSetProgramConversation f37113g = new DummyWsdSetProgramConversation();

    /* compiled from: WsdSetProgramActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* compiled from: WsdSetProgramActivity.kt */
    /* loaded from: classes3.dex */
    private final class b extends k.e<WsdSetProgramConversation> {
        public b() {
        }

        @Override // ej.k.e, ej.k.f
        public final void a(ej.k kVar, WppDeviceConversation wppDeviceConversation) {
            WsdSetProgramConversation wsdSetProgramConversation = (WsdSetProgramConversation) wppDeviceConversation;
            if (wsdSetProgramConversation != null) {
                WsdSetProgramActivity wsdSetProgramActivity = WsdSetProgramActivity.this;
                wsdSetProgramConversation.U(wsdSetProgramActivity);
                wsdSetProgramActivity.O3(wsdSetProgramConversation);
                wsdSetProgramActivity.K3();
            }
        }

        @Override // ej.k.e, ej.k.f
        public final void c(ej.k kVar, WppDeviceConversation wppDeviceConversation) {
            WsdSetProgramActivity.this.O3((WsdSetProgramConversation) wppDeviceConversation);
        }

        @Override // ej.k.e, ej.k.f
        public final void f(ej.k<WsdSetProgramConversation> kVar) {
            WsdSetProgramActivity.this.R3();
        }

        @Override // ej.k.e, ej.k.f
        public final void g(ej.k kVar, WppDeviceConversation wppDeviceConversation) {
            WsdSetProgramConversation wsdSetProgramConversation = (WsdSetProgramConversation) wppDeviceConversation;
            if (wsdSetProgramConversation != null) {
                WsdSetProgramActivity wsdSetProgramActivity = WsdSetProgramActivity.this;
                wsdSetProgramConversation.U(wsdSetProgramActivity);
                wsdSetProgramActivity.O3(wsdSetProgramConversation);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WsdSetProgramActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.wsd.programs.WsdSetProgramActivity$conversation$1", f = "WsdSetProgramActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {
        c(qm0.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new c(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            Toast.makeText(WsdSetProgramActivity.this, (int) C1987R.string._SETUP_ERROR_MESSAGE_CONNECTION_LOST_, 1).show();
            return y.f85009a;
        }
    }

    /* compiled from: WsdSetProgramActivity.kt */
    /* loaded from: classes3.dex */
    static final class d extends w implements ym0.a<ej.k<WsdSetProgramConversation>> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final ej.k<WsdSetProgramConversation> invoke() {
            ej.w w11 = ej.w.w();
            WsdSetProgramActivity wsdSetProgramActivity = WsdSetProgramActivity.this;
            ej.k<WsdSetProgramConversation> u11 = w11.u(jl.a.b(wsdSetProgramActivity.G3()), new WsdSetProgramConversation(wsdSetProgramActivity, wsdSetProgramActivity.H3()), WsdSetProgramConversation.class);
            u11.n(new b());
            return u11;
        }
    }

    /* compiled from: WsdSetProgramActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.wsd.programs.WsdSetProgramActivity$onError$1$1", f = "WsdSetProgramActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class e extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {
        e(qm0.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new e(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            WsdSetProgramActivity wsdSetProgramActivity = WsdSetProgramActivity.this;
            Toast.makeText(wsdSetProgramActivity, wsdSetProgramActivity.getString(C1987R.string._LOST_CONNECTION_), 0).show();
            return y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class f implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f37118a = nm0.h.b(new com.withings.device.details.wsd.programs.f(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f37119b;

        public f(Activity activity) {
            this.f37119b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f37118a.getValue();
        }
    }

    private final void A3() {
        u70.a.b().h(this);
        K3();
        Intent a11 = androidx.core.app.g.a(this);
        if (a11 != null && (androidx.core.app.g.f(this, a11) || isTaskRoot())) {
            h0 m11 = h0.m(this);
            m11.g(a11);
            m11.r();
            return;
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final Intent B3(Context context, Class<?> cls, Device device) {
        f37105h.getClass();
        u.j(context, "context");
        u.j(device, "device");
        Intent putExtra = new Intent(context, cls).putExtra("device", device);
        u.i(putExtra, "putExtra(...)");
        return putExtra;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final Intent C3(Context context, Class<?> cls, Device device) {
        f37105h.getClass();
        u.j(context, "context");
        Intent putExtra = B3(context, cls, device).putExtra("from", true);
        u.i(putExtra, "putExtra(...)");
        return putExtra;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean D3() {
        return this.f37109c;
    }

    public final WsdSetProgramConversation E3() {
        if (this.f37113g == null) {
            BuildersKt__Builders_commonKt.launch$default(t.l(this), Dispatchers.getMain(), null, new c(null), 2, null);
            A3();
        }
        return this.f37113g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final WsdProgram F3() {
        return this.f37110d;
    }

    public final Device G3() {
        return (Device) this.f37107a.getValue(this, f37106i[0]);
    }

    @Override // u70.a.c
    public final long H() {
        return 300000L;
    }

    public abstract short H3();

    /* JADX INFO: Access modifiers changed from: protected */
    public final List<WsdProgram> I3() {
        return this.f37108b;
    }

    public void J3(Intent intent) {
        ArrayList parcelableArrayListExtra;
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableArrayListExtra = intent.getParcelableArrayListExtra("programs", WsdProgram.class);
            } else {
                parcelableArrayListExtra = intent.getParcelableArrayListExtra("programs");
            }
            u.g(parcelableArrayListExtra);
            Q3(parcelableArrayListExtra);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void K3() {
        ProgressDialog progressDialog = this.f37112f;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f37112f = null;
    }

    public abstract void L3(u70.i iVar, WsdProgram wsdProgram);

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
    public final void M1(WsdSetProgramConversation conversation, qj.l lVar) {
        u.j(conversation, "conversation");
        N3(lVar);
    }

    public abstract void M3(u70.i iVar, ArrayList arrayList);

    public abstract void N3(qj.l lVar);

    public final void O3(WsdSetProgramConversation wsdSetProgramConversation) {
        this.f37113g = wsdSetProgramConversation;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void P3(WsdProgram wsdProgram) {
        this.f37110d = wsdProgram;
    }

    @Override // u70.a.c
    public final void Q2() {
        z3();
    }

    protected final void Q3(ArrayList arrayList) {
        Object obj;
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((WsdProgram) obj).r()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        WsdProgram wsdProgram = (WsdProgram) obj;
        if (wsdProgram == null) {
            wsdProgram = (WsdProgram) x.K(arrayList);
        }
        this.f37110d = wsdProgram;
        this.f37108b = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void R3() {
        if (this.f37112f == null) {
            String string = getString(C1987R.string._BT_POPUP_CONNECTING_TITLE_);
            u.i(string, "getString(...)");
            this.f37112f = ProgressDialog.show(this, null, string, true, true, new com.withings.device.details.wsd.programs.e(this, 0));
        }
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
    public final void S(WsdSetProgramConversation conversation, WsdProgram program) {
        u.j(conversation, "conversation");
        u.j(program, "program");
        u70.i v11 = conversation.v();
        u.i(v11, "getMacAddress(...)");
        L3(v11, program);
    }

    public final void S3() {
        ((ej.k) this.f37111e.getValue()).r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void T3(short s11) {
        WsdProgram wsdProgram = this.f37110d;
        if (wsdProgram != null) {
            WsdProgramActivity.a aVar = WsdProgramActivity.f37077s;
            Device G3 = G3();
            List<? extends WsdProgram> list = this.f37108b;
            aVar.getClass();
            startActivityForResult(WsdProgramActivity.a.a(this, G3, list, wsdProgram, s11, null), 1);
        }
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
    public final void a3(WsdSetProgramConversation conversation) {
        u.j(conversation, "conversation");
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation.b
    public final void e3(WppDeviceConversation conversation, Exception exc) {
        u.j(conversation, "conversation");
        if (E3() != null) {
            BuildersKt__Builders_commonKt.launch$default(t.l(this), Dispatchers.getMain(), null, new e(null), 2, null);
            finish();
        }
        z3();
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
    public void f1(WsdSetProgramConversation conversation, ArrayList arrayList) {
        u.j(conversation, "conversation");
        Q3(arrayList);
        u70.i v11 = conversation.v();
        u.i(v11, "getMacAddress(...)");
        M3(v11, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 1 && intent != null) {
            J3(intent);
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        z3();
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        ArrayList parcelableArrayListExtra;
        super.onCreate(bundle);
        this.f37109c = getIntent().getBooleanExtra("from", false);
        if (getIntent().hasExtra("programs")) {
            Intent intent = getIntent();
            u.i(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableArrayListExtra = intent.getParcelableArrayListExtra("programs", WsdProgram.class);
            } else {
                parcelableArrayListExtra = intent.getParcelableArrayListExtra("programs");
            }
            u.g(parcelableArrayListExtra);
            Q3(parcelableArrayListExtra);
        }
        S3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        u70.a.b().h(this);
        K3();
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        u70.a.b().a(this);
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
    public final void z2(WsdSetProgramConversation conversation) {
        u.j(conversation, "conversation");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void z3() {
        u70.a.b().h(this);
        if (!this.f37109c) {
            WsdSetProgramConversation E3 = E3();
            if (E3 != null) {
                E3.p();
            }
            this.f37113g = null;
            ((ej.k) this.f37111e.getValue()).k();
        }
        A3();
    }

    @Override // u70.a.c
    public final void f2(long j5) {
    }
}
