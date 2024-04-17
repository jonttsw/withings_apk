package com.withings.wiscale2.device.wam02.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.camera.core.v;
import androidx.fragment.app.m0;
import com.withings.android.activity.WithingsActivity;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.WamAutoSleep;
import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.wam02.conversation.Wam02AutoSleepConversation;
import com.withings.wiscale2.device.wam02.ui.b;
import ej.k;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import m0.t;
import nm0.g;
import nm0.h;
import nm0.j;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: Wam02AutoSleepActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withings/wiscale2/device/wam02/ui/Wam02AutoSleepActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/wiscale2/device/wam02/conversation/Wam02AutoSleepConversation$a;", "Lcom/withings/wiscale2/device/wam02/ui/b$a;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wam02AutoSleepActivity extends WithingsActivity implements Wam02AutoSleepConversation.a, b.a {

    /* renamed from: a  reason: collision with root package name */
    private final c f54879a;

    /* renamed from: b  reason: collision with root package name */
    private final g f54880b;

    /* renamed from: c  reason: collision with root package name */
    private Wam02AutoSleepConversation f54881c;

    /* renamed from: d  reason: collision with root package name */
    private k<Wam02AutoSleepConversation> f54882d;

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f54878f = {v.c(Wam02AutoSleepActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0)};

    /* renamed from: e  reason: collision with root package name */
    public static final a f54877e = new Object();

    /* compiled from: Wam02AutoSleepActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: Wam02AutoSleepActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wam02.ui.Wam02AutoSleepActivity$onError$1", f = "Wam02AutoSleepActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class b extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {
        b(qm0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new b(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            Toast.makeText(Wam02AutoSleepActivity.this.getApplicationContext(), (int) C1987R.string._SETUP_ERROR_MESSAGE_UNKNOWN_ERROR_, 0).show();
            return y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final g f54884a = h.b(new com.withings.wiscale2.device.wam02.ui.a(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f54885b;

        public c(Activity activity) {
            this.f54885b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f54884a.getValue();
        }
    }

    /* compiled from: Wam02AutoSleepActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends w implements ym0.a<ej.w> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f54886a = new w(0);

        @Override // ym0.a
        public final ej.w invoke() {
            return ej.w.w();
        }
    }

    public Wam02AutoSleepActivity() {
        super(C1987R.layout.activity_auto_sleep);
        this.f54879a = new c(this);
        this.f54880b = h.b(d.f54886a);
    }

    @Override // com.withings.wiscale2.device.wam02.ui.b.a
    public final void I(com.withings.wiscale2.device.wam02.ui.b fragment, int i11) {
        u.j(fragment, "fragment");
        Wam02AutoSleepConversation wam02AutoSleepConversation = this.f54881c;
        if (wam02AutoSleepConversation != null) {
            wam02AutoSleepConversation.G(Integer.valueOf(i11));
        }
    }

    @Override // com.withings.wiscale2.device.wam02.conversation.Wam02AutoSleepConversation.a
    public final void b1(Wam02AutoSleepConversation conversation, WamAutoSleep wamAutoSleep) {
        u.j(conversation, "conversation");
        this.f54881c = conversation;
        int i11 = wamAutoSleep.autoSleep;
        m0 m11 = getSupportFragmentManager().m();
        com.withings.wiscale2.device.wam02.ui.b bVar = new com.withings.wiscale2.device.wam02.ui.b();
        bVar.setArguments(androidx.core.os.e.a(new j("KEY_KNOWN_AUTO_SLEEP", Integer.valueOf(i11))));
        m11.l(C1987R.id.content, bVar, null);
        m11.g();
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation.b
    public final void e3(WppDeviceConversation conversation, Exception exc) {
        u.j(conversation, "conversation");
        k<Wam02AutoSleepConversation> kVar = this.f54882d;
        if (kVar != null) {
            kVar.k();
        }
        this.f54882d = null;
        BuildersKt__Builders_commonKt.launch$default(t.l(this), Dispatchers.getIO(), null, new b(null), 2, null);
        Wam02AutoSleepConversation wam02AutoSleepConversation = this.f54881c;
        if (wam02AutoSleepConversation != null) {
            wam02AutoSleepConversation.G(null);
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Wam02AutoSleepConversation wam02AutoSleepConversation = this.f54881c;
        if (wam02AutoSleepConversation != null) {
            wam02AutoSleepConversation.G(null);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cj.d b10 = jl.a.b((Device) this.f54879a.getValue(this, f54878f[0]));
        Wam02AutoSleepConversation wam02AutoSleepConversation = new Wam02AutoSleepConversation(this, false);
        ej.w wVar = (ej.w) this.f54880b.getValue();
        wVar.getClass();
        k<Wam02AutoSleepConversation> u11 = wVar.u(b10, wam02AutoSleepConversation, Wam02AutoSleepConversation.class);
        this.f54882d = u11;
        u11.r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        Wam02AutoSleepConversation wam02AutoSleepConversation = this.f54881c;
        if (wam02AutoSleepConversation != null) {
            wam02AutoSleepConversation.p();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            Wam02AutoSleepConversation wam02AutoSleepConversation = this.f54881c;
            if (wam02AutoSleepConversation != null) {
                wam02AutoSleepConversation.G(null);
            }
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.withings.wiscale2.device.wam02.conversation.Wam02AutoSleepConversation.a
    public final void u1(Wam02AutoSleepConversation conversation) {
        u.j(conversation, "conversation");
        finish();
    }
}
