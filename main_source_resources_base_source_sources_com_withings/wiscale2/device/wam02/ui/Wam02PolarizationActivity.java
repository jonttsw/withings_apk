package com.withings.wiscale2.device.wam02.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.camera.core.v;
import androidx.fragment.app.m0;
import com.withings.android.activity.WithingsActivity;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.ui.s2;
import com.withings.wiscale2.device.wam02.conversation.Wam02PolarizationConversation;
import com.withings.wiscale2.device.wam02.ui.e;
import ej.k;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
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
import tb0.h0;
import u70.i;
import ym0.p;
/* compiled from: Wam02PolarizationActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withings/wiscale2/device/wam02/ui/Wam02PolarizationActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/wiscale2/device/wam02/conversation/Wam02PolarizationConversation$a;", "Lcom/withings/wiscale2/device/wam02/ui/e$a;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wam02PolarizationActivity extends WithingsActivity implements Wam02PolarizationConversation.a, e.a {

    /* renamed from: a  reason: collision with root package name */
    private final d f54889a = new d();

    /* renamed from: b  reason: collision with root package name */
    private final c f54890b = new c(this);

    /* renamed from: c  reason: collision with root package name */
    private final g f54891c = h.b(new b());

    /* renamed from: d  reason: collision with root package name */
    private h0 f54892d;

    /* renamed from: e  reason: collision with root package name */
    private k<Wam02PolarizationConversation> f54893e;

    /* renamed from: f  reason: collision with root package name */
    private Wam02PolarizationConversation f54894f;

    /* renamed from: g  reason: collision with root package name */
    private int f54895g;

    /* renamed from: i  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f54888i = {v.c(Wam02PolarizationActivity.class, "macAddress", "getMacAddress()Lcom/withings/util/MacAddress;", 0)};

    /* renamed from: h  reason: collision with root package name */
    public static final a f54887h = new Object();

    /* compiled from: Wam02PolarizationActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: Wam02PolarizationActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<Device> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final Device invoke() {
            return kn.e.c().f(Wam02PolarizationActivity.z3(Wam02PolarizationActivity.this));
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Activity, i> {

        /* renamed from: a  reason: collision with root package name */
        private final g f54897a = h.b(new com.withings.wiscale2.device.wam02.ui.d(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f54898b;

        public c(Activity activity) {
            this.f54898b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [u70.i, java.lang.Object] */
        @Override // bn0.d
        public final i getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f54897a.getValue();
        }
    }

    /* compiled from: Wam02PolarizationActivity.kt */
    /* loaded from: classes5.dex */
    public static final class d extends k.e<Wam02PolarizationConversation> {

        /* compiled from: Wam02PolarizationActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wam02.ui.Wam02PolarizationActivity$submitterListener$1$onRemoteDeviceFound$1", f = "Wam02PolarizationActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        static final class a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Wam02PolarizationActivity f54900a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Wam02PolarizationActivity wam02PolarizationActivity, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f54900a = wam02PolarizationActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f54900a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                l.b(obj);
                Wam02PolarizationActivity.D3(this.f54900a);
                return y.f85009a;
            }
        }

        d() {
        }

        @Override // ej.k.e, ej.k.f
        public final void a(k conversationSubmitter, WppDeviceConversation wppDeviceConversation) {
            Wam02PolarizationConversation conversation = (Wam02PolarizationConversation) wppDeviceConversation;
            u.j(conversationSubmitter, "conversationSubmitter");
            u.j(conversation, "conversation");
            Wam02PolarizationActivity wam02PolarizationActivity = Wam02PolarizationActivity.this;
            wam02PolarizationActivity.f54894f = conversation;
            wam02PolarizationActivity.f54895g = conversation.L();
            Wam02PolarizationActivity.C3(wam02PolarizationActivity);
        }

        @Override // ej.k.e, ej.k.f
        public final void d(k<Wam02PolarizationConversation> conversationSubmitter) {
            u.j(conversationSubmitter, "conversationSubmitter");
            Wam02PolarizationActivity wam02PolarizationActivity = Wam02PolarizationActivity.this;
            BuildersKt__Builders_commonKt.launch$default(t.l(wam02PolarizationActivity), Dispatchers.getIO(), null, new a(wam02PolarizationActivity, null), 2, null);
        }
    }

    public static final void C3(Wam02PolarizationActivity wam02PolarizationActivity) {
        m0 m11 = wam02PolarizationActivity.getSupportFragmentManager().m();
        int i11 = e.f54908f;
        int i12 = wam02PolarizationActivity.f54895g;
        e eVar = new e();
        eVar.setArguments(androidx.core.os.e.a(new j("polarization", Integer.valueOf(i12))));
        m11.l(C1987R.id.content, eVar, null);
        m11.g();
    }

    public static final void D3(Wam02PolarizationActivity wam02PolarizationActivity) {
        m0 m11 = wam02PolarizationActivity.getSupportFragmentManager().m();
        m11.l(C1987R.id.content, s2.s1(((Device) wam02PolarizationActivity.f54891c.getValue()).getModel()), null);
        m11.g();
    }

    private final void E3() {
        Wam02PolarizationConversation wam02PolarizationConversation = this.f54894f;
        if (wam02PolarizationConversation != null) {
            wam02PolarizationConversation.G(null);
        }
        k<Wam02PolarizationConversation> kVar = this.f54893e;
        if (kVar != null) {
            kVar.k();
        }
        finish();
    }

    public static final i z3(Wam02PolarizationActivity wam02PolarizationActivity) {
        wam02PolarizationActivity.getClass();
        return (i) wam02PolarizationActivity.f54890b.getValue(wam02PolarizationActivity, f54888i[0]);
    }

    @Override // com.withings.wiscale2.device.wam02.conversation.Wam02PolarizationConversation.a
    public final void H0(Wam02PolarizationConversation conversation) {
        u.j(conversation, "conversation");
    }

    @Override // com.withings.wiscale2.device.wam02.conversation.Wam02PolarizationConversation.a
    public final void O2(Wam02PolarizationConversation conversation, int i11) {
        u.j(conversation, "conversation");
        this.f54894f = conversation;
        this.f54895g = i11;
        m0 m11 = getSupportFragmentManager().m();
        int i12 = e.f54908f;
        int i13 = this.f54895g;
        e eVar = new e();
        eVar.setArguments(androidx.core.os.e.a(new j("polarization", Integer.valueOf(i13))));
        m11.l(C1987R.id.content, eVar, null);
        m11.g();
    }

    @Override // com.withings.wiscale2.device.wam02.ui.e.a
    public final void c0() {
        Wam02PolarizationConversation wam02PolarizationConversation = this.f54894f;
        if (wam02PolarizationConversation != null) {
            wam02PolarizationConversation.G(1);
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation.b
    public final void e3(WppDeviceConversation conversation, Exception exc) {
        u.j(conversation, "conversation");
        Toast.makeText(this, (int) C1987R.string._SETUP_ERROR_MESSAGE_UNKNOWN_ERROR_, 0).show();
        finish();
    }

    @Override // com.withings.wiscale2.device.wam02.ui.e.a
    public final void i0() {
        E3();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        E3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h0 a11 = h0.a(getLayoutInflater());
        this.f54892d = a11;
        setContentView(a11.f99127a);
        getWindow().addFlags(128);
        h0 h0Var = this.f54892d;
        if (h0Var != null) {
            setSupportActionBar(h0Var.f99128b);
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.o(true);
            }
            cj.d dVar = new cj.d(new ie0.a().w(), (i) this.f54890b.getValue(this, f54888i[0]), ((Device) this.f54891c.getValue()).getKlSecret());
            Wam02PolarizationConversation wam02PolarizationConversation = new Wam02PolarizationConversation(this, false);
            ej.w w11 = ej.w.w();
            w11.getClass();
            k<Wam02PolarizationConversation> u11 = w11.u(dVar, wam02PolarizationConversation, Wam02PolarizationConversation.class);
            this.f54893e = u11;
            u11.n(this.f54889a);
            k<Wam02PolarizationConversation> kVar = this.f54893e;
            if (kVar != null) {
                kVar.r();
                return;
            }
            return;
        }
        u.s("binding");
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            E3();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.withings.wiscale2.device.wam02.ui.e.a
    public final void t0() {
        Wam02PolarizationConversation wam02PolarizationConversation = this.f54894f;
        if (wam02PolarizationConversation != null) {
            wam02PolarizationConversation.G(0);
        }
    }
}
