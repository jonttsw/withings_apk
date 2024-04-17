package com.withings.device.details.wsd.programs.spotify;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.camera.core.v;
import androidx.core.app.r;
import bj.a;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.google.android.gms.common.ConnectionResult;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.alarm.model.DeviceAlarm;
import com.withings.alarm.model.WsdProgram;
import com.withings.android.activity.WithingsActivity;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.ProgramType;
import com.withings.device.Device;
import com.withings.device.details.wsd.conversation.WsdSetProgramConversation;
import com.withings.device.details.wsd.programs.spotify.WsdSpotifyActivity;
import com.withings.webservices.legacy.withings.model.timeline.ConversationItemData;
import com.withings.wiscale2.C1987R;
import fn0.k;
import java.util.ArrayList;
import java.util.Arrays;
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
import nm0.y;
import qj.m;
import u70.a;
import x.o;
import ym0.l;
import ym0.p;
/* compiled from: WsdSpotifyActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/withings/device/details/wsd/programs/spotify/WsdSpotifyActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/device/details/wsd/conversation/WsdSetProgramConversation$b;", "Lu70/a$c;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "device-details-wsd_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class WsdSpotifyActivity extends WithingsActivity implements WsdSetProgramConversation.b, a.c {

    /* renamed from: a  reason: collision with root package name */
    private final d f37252a;

    /* renamed from: b  reason: collision with root package name */
    private int f37253b;

    /* renamed from: c  reason: collision with root package name */
    private DeviceAlarm f37254c;

    /* renamed from: d  reason: collision with root package name */
    private WsdSetProgramConversation f37255d;

    /* renamed from: e  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f37256e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f37257f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f37258g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f37259h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f37260i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f37261j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f37262k;

    /* renamed from: l  reason: collision with root package name */
    private androidx.appcompat.app.c f37263l;

    /* renamed from: m  reason: collision with root package name */
    private bj.a<WsdSetProgramConversation> f37264m;

    /* renamed from: n  reason: collision with root package name */
    private ProgressDialog f37265n;

    /* renamed from: o  reason: collision with root package name */
    private ProgressDialog f37266o;

    /* renamed from: p  reason: collision with root package name */
    private final g f37267p;

    /* renamed from: r  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f37251r = {v.c(WsdSpotifyActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0), v.c(WsdSpotifyActivity.class, "binding", "getBinding()Lcom/withings/device/details/wsd/databinding/ActivityWsdSpotifyBinding;", 0)};

    /* renamed from: q  reason: collision with root package name */
    public static final a f37250q = new Object();

    /* compiled from: WsdSpotifyActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static Intent a(Context context, Device device, int i11, DeviceAlarm deviceAlarm) {
            u.j(context, "context");
            u.j(device, "device");
            Intent putExtra = new Intent(context, WsdSpotifyActivity.class).putExtra("device", device).putExtra("program_type", i11).putExtra("device_alarm", deviceAlarm);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: WsdSpotifyActivity.kt */
    /* loaded from: classes3.dex */
    private final class b extends a.b<WsdSetProgramConversation> {
        public b() {
        }

        @Override // bj.a.c
        public final void Y0(Object obj) {
            WsdSetProgramConversation conversation = (WsdSetProgramConversation) obj;
            u.j(conversation, "conversation");
            WsdSpotifyActivity.this.f37255d = conversation;
        }

        @Override // bj.a.c
        public final void a0(Object obj) {
            WsdSetProgramConversation conversation = (WsdSetProgramConversation) obj;
            u.j(conversation, "conversation");
            WsdSpotifyActivity wsdSpotifyActivity = WsdSpotifyActivity.this;
            conversation.U(wsdSpotifyActivity);
            wsdSpotifyActivity.f37255d = conversation;
            wsdSpotifyActivity.H3();
        }

        @Override // bj.a.c
        public final void c1() {
            WsdSpotifyActivity.this.J3();
        }

        @Override // bj.a.c
        public final void w2(Object obj) {
            WsdSetProgramConversation conversation = (WsdSetProgramConversation) obj;
            u.j(conversation, "conversation");
            WsdSpotifyActivity wsdSpotifyActivity = WsdSpotifyActivity.this;
            conversation.U(wsdSpotifyActivity);
            wsdSpotifyActivity.f37255d = conversation;
            wsdSpotifyActivity.H3();
        }
    }

    /* compiled from: WsdSpotifyActivity.kt */
    /* loaded from: classes3.dex */
    static final class c extends w implements ym0.a<u70.d> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final u70.d invoke() {
            final WsdSpotifyActivity wsdSpotifyActivity = WsdSpotifyActivity.this;
            return new u70.d(new Runnable() { // from class: zn.e
                @Override // java.lang.Runnable
                public final void run() {
                    WsdSetProgramConversation wsdSetProgramConversation;
                    WsdSpotifyActivity this$0 = WsdSpotifyActivity.this;
                    u.j(this$0, "this$0");
                    wsdSetProgramConversation = this$0.f37255d;
                    if (wsdSetProgramConversation != null) {
                        wsdSetProgramConversation.R();
                    } else {
                        u.s(ConversationItemData.WS_TYPE);
                        throw null;
                    }
                }
            }, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class d implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final g f37270a = h.b(new com.withings.device.details.wsd.programs.spotify.a(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f37271b;

        public d(Activity activity) {
            this.f37271b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f37270a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes3.dex */
    public static final class e extends w implements l<ComponentActivity, tn.f> {
        @Override // ym0.l
        public final tn.f invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.mainLayout);
            u.i(e11, "requireViewById(this, id)");
            return tn.f.a(e11);
        }
    }

    /* compiled from: WsdSpotifyActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.wsd.programs.spotify.WsdSpotifyActivity$spotifyConfirmationSent$1", f = "WsdSpotifyActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class f extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f37272a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WsdSpotifyActivity f37273b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j5, WsdSpotifyActivity wsdSpotifyActivity, qm0.d<? super f> dVar) {
            super(2, dVar);
            this.f37272a = j5;
            this.f37273b = wsdSpotifyActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new f(this.f37272a, this.f37273b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((f) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String string;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            long j5 = this.f37272a;
            int i11 = (int) j5;
            WsdSpotifyActivity wsdSpotifyActivity = this.f37273b;
            if (i11 != 13) {
                if (i11 != 14) {
                    String string2 = wsdSpotifyActivity.getString(C1987R.string._SPOTIFY_SAVE_STATUS_ERROR__d_);
                    u.i(string2, "getString(...)");
                    string = String.format(string2, Arrays.copyOf(new Object[]{new Long(j5)}, 1));
                } else {
                    string = wsdSpotifyActivity.getString(C1987R.string._SPOTIFY_SAVE_STATUS_NO_STREAM_ERROR_);
                    u.i(string, "getString(...)");
                }
            } else {
                string = wsdSpotifyActivity.getString(C1987R.string._SPOTIFY_SAVE_STATUS_NOT_PLAYLIST_ERROR_);
                u.i(string, "getString(...)");
            }
            Toast.makeText(wsdSpotifyActivity, string, 1).show();
            return y.f85009a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public WsdSpotifyActivity() {
        super(C1987R.layout.activity_wsd_spotify);
        this.f37252a = new d(this);
        this.f37256e = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new w(1));
        this.f37267p = h.b(new c());
    }

    public static void A3(WsdSpotifyActivity this$0) {
        u.j(this$0, "this$0");
        this$0.f37261j = false;
        Intent a11 = u70.e.a(this$0, C1987R.string.spotify_appPackage, null);
        if (a11 != null) {
            this$0.f37257f = true;
            this$0.startActivity(a11);
            Intent putExtra = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(this$0.getPackageName(), "com.withings.wiscale2.alarm.ui.wsd.WsdSpotifyActivity").setFlags(67108864).putExtra("come_from_notification", true);
            u.i(putExtra, "putExtra(...)");
            PendingIntent activity = PendingIntent.getActivity(this$0, 0, putExtra, 201326592);
            r rVar = new r(this$0, "other_channel_other");
            rVar.u(true);
            rVar.w();
            rVar.l(this$0.getString(C1987R.string._SPOTIFY_NOTIFICATION_CONTENT_));
            rVar.m(this$0.getString(C1987R.string._APP_NAME_));
            rVar.y(0);
            rVar.h(androidx.core.content.a.getColor(this$0, C1987R.color.statusInfo));
            rVar.B(2131231550);
            rVar.k(activity);
            rVar.e(true);
            androidx.core.app.y.c(this$0).e(null, -123456, rVar.c());
            return;
        }
        String string = this$0.getString(C1987R.string.spotify_appPackage);
        u.i(string, "getString(...)");
        try {
            this$0.startActivity(u70.e.b(string, null));
        } catch (ActivityNotFoundException unused) {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("http://play.google.com/store/apps/details?id=".concat(string)));
            intent.setFlags(268435456);
            this$0.startActivity(intent);
        }
    }

    public static void B3(WsdSpotifyActivity this$0) {
        u.j(this$0, "this$0");
        if (!this$0.f37260i && !this$0.f37261j) {
            this$0.I3();
        }
    }

    public static void C3(WsdSpotifyActivity this$0) {
        u.j(this$0, "this$0");
        this$0.f37261j = true;
        this$0.f37260i = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H3() {
        ProgressDialog progressDialog = this.f37265n;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f37265n = null;
        }
        WsdSetProgramConversation wsdSetProgramConversation = this.f37255d;
        if (wsdSetProgramConversation != null) {
            wsdSetProgramConversation.R();
            if (this.f37257f) {
                I3();
            }
            ((u70.d) this.f37267p.getValue()).e();
            androidx.core.app.y.c(this).b(-123456, null);
            WsdSetProgramConversation wsdSetProgramConversation2 = this.f37255d;
            if (wsdSetProgramConversation2 != null) {
                wsdSetProgramConversation2.U(this);
                return;
            } else {
                u.s(ConversationItemData.WS_TYPE);
                throw null;
            }
        }
        u.s(ConversationItemData.WS_TYPE);
        throw null;
    }

    private final void I3() {
        if (!this.f37257f) {
            return;
        }
        if (!this.f37258g) {
            String string = getString(C1987R.string._SPOTIFY_SAVE_STATUS_NO_STREAM_ERROR_);
            u.i(string, "getString(...)");
            androidx.appcompat.app.c cVar = this.f37263l;
            if (cVar != null) {
                cVar.hide();
            }
            qc.b bVar = new qc.b(this);
            bVar.v(string);
            androidx.appcompat.app.c create = bVar.z(C1987R.string._OK_, null).create();
            this.f37263l = create;
            create.show();
            return;
        }
        androidx.appcompat.app.c cVar2 = this.f37263l;
        if (cVar2 != null) {
            cVar2.hide();
        }
        this.f37260i = true;
        androidx.core.app.y.c(this).b(-123456, null);
        this.f37257f = false;
        qc.b bVar2 = new qc.b(this);
        bVar2.g(C1987R.string._SPOTIFY_SELECT_PLAYLIST_);
        bVar2.z(C1987R.string._OK_, new DialogInterface.OnClickListener() { // from class: zn.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                WsdSpotifyActivity.z3(WsdSpotifyActivity.this);
            }
        }).w(C1987R.string._CANCEL_, new zn.b(this, 0)).s();
    }

    public static void z3(final WsdSpotifyActivity this$0) {
        u.j(this$0, "this$0");
        this$0.f37260i = false;
        ProgramType programType = new ProgramType();
        programType.program = (short) this$0.f37253b;
        DeviceAlarm deviceAlarm = this$0.f37254c;
        if (deviceAlarm != null) {
            programType.subProgram = deviceAlarm.j();
            WsdSetProgramConversation wsdSetProgramConversation = this$0.f37255d;
            if (wsdSetProgramConversation != null) {
                wsdSetProgramConversation.f0(programType);
                this$0.f37266o = ProgressDialog.show(this$0, null, this$0.getString(C1987R.string._LOADING_), true, true, new DialogInterface.OnCancelListener() { // from class: zn.d
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        WsdSpotifyActivity.a aVar = WsdSpotifyActivity.f37250q;
                        WsdSpotifyActivity this$02 = WsdSpotifyActivity.this;
                        u.j(this$02, "this$0");
                        this$02.finish();
                    }
                });
                return;
            }
            u.s(ConversationItemData.WS_TYPE);
            throw null;
        }
        u.s("deviceAlarm");
        throw null;
    }

    public final void G3() {
        u70.a.b().h(this);
        WsdSetProgramConversation wsdSetProgramConversation = this.f37255d;
        if (wsdSetProgramConversation != null) {
            wsdSetProgramConversation.p();
            bj.a<WsdSetProgramConversation> aVar = this.f37264m;
            if (aVar != null) {
                aVar.a();
            }
            this.f37264m = null;
            ProgressDialog progressDialog = this.f37265n;
            if (progressDialog != null) {
                progressDialog.dismiss();
                this.f37265n = null;
            }
            finish();
            return;
        }
        u.s(ConversationItemData.WS_TYPE);
        throw null;
    }

    @Override // u70.a.c
    public final long H() {
        return 300000L;
    }

    public final void J3() {
        if (this.f37265n == null) {
            String string = getString(C1987R.string._BT_POPUP_CONNECTING_TITLE_);
            u.i(string, "getString(...)");
            this.f37265n = ProgressDialog.show(this, null, string, true, true, new DialogInterface.OnCancelListener() { // from class: zn.c
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    WsdSpotifyActivity.a aVar = WsdSpotifyActivity.f37250q;
                    WsdSpotifyActivity this$0 = WsdSpotifyActivity.this;
                    u.j(this$0, "this$0");
                    this$0.G3();
                }
            });
        }
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
    public final void M1(WsdSetProgramConversation conversation, qj.l lVar) {
        u.j(conversation, "conversation");
        ProgressDialog progressDialog = this.f37266o;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f37266o = null;
        long j5 = lVar.b().f33265rc;
        if (j5 != 0) {
            BuildersKt__Builders_commonKt.launch$default(t.l(this), Dispatchers.getMain(), null, new f(j5, this, null), 2, null);
            return;
        }
        String a11 = lVar.a();
        u.i(a11, "getPresetName(...)");
        Intent putExtra = new Intent().putExtra("preset_name", a11);
        u.i(putExtra, "putExtra(...)");
        setResult(-1, putExtra);
        G3();
        finish();
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
    public final void P0(WsdSetProgramConversation conversation, m mVar) {
        u.j(conversation, "conversation");
        if (mVar.b().status == 6) {
            this.f37258g = true;
            if (this.f37259h && this.f37262k) {
                new Handler(Looper.getMainLooper()).post(new o(this, 1));
            }
        }
    }

    @Override // u70.a.c
    public final void Q2() {
        u70.a.b().h(this);
        G3();
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
    public final void S(WsdSetProgramConversation conversation, WsdProgram program) {
        u.j(conversation, "conversation");
        u.j(program, "program");
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
    public final void S1(WsdSetProgramConversation conversation, short s11) {
        u.j(conversation, "conversation");
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
    public final void a3(WsdSetProgramConversation conversation) {
        u.j(conversation, "conversation");
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation.b
    public final void e3(WppDeviceConversation conversation, Exception exc) {
        u.j(conversation, "conversation");
        Toast.makeText(this, getString(C1987R.string._LOST_CONNECTION_), 0).show();
        G3();
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
    public final void f1(WsdSetProgramConversation conversation, ArrayList arrayList) {
        u.j(conversation, "conversation");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object parcelableExtra;
        super.onCreate(bundle);
        ej.w w11 = ej.w.w();
        k<Object>[] kVarArr = f37251r;
        WppDeviceConversation y11 = w11.y(((Device) this.f37252a.getValue(this, kVarArr[0])).getMacAddress(), WsdSetProgramConversation.class);
        u.i(y11, "getConversation(...)");
        this.f37255d = (WsdSetProgramConversation) y11;
        this.f37253b = getIntent().getIntExtra("program_type", -1);
        Intent intent = getIntent();
        u.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("device_alarm", DeviceAlarm.class);
        } else {
            parcelableExtra = intent.getParcelableExtra("device_alarm");
        }
        u.g(parcelableExtra);
        this.f37254c = (DeviceAlarm) parcelableExtra;
        androidx.core.app.y.c(this).b(-123456, null);
        if (getIntent().hasExtra("come_from_notification")) {
            I3();
        }
        by.kirich1409.viewbindingdelegate.f fVar = this.f37256e;
        Object value = ((LifecycleViewBindingProperty) fVar).getValue(this, kVarArr[1]);
        u.i(value, "getValue(...)");
        ((tn.f) value).f100320a.setOnClickListener(new com.withings.alarm.ui.f(this, 2));
        Object value2 = ((LifecycleViewBindingProperty) fVar).getValue(this, kVarArr[1]);
        u.i(value2, "getValue(...)");
        setSupportActionBar(((tn.f) value2).f100321b);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((u70.d) this.f37267p.getValue()).f();
        u70.a.b().h(this);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f37262k = true;
        this.f37259h = false;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        u70.a.b().a(this);
        this.f37259h = true;
        ej.w w11 = ej.w.w();
        k<Object>[] kVarArr = f37251r;
        k<Object> kVar = kVarArr[0];
        d dVar = this.f37252a;
        if (w11.y(((Device) dVar.getValue(this, kVar)).getMacAddress(), WsdSetProgramConversation.class) == null) {
            J3();
            bj.a<WsdSetProgramConversation> aVar = new bj.a<>(jl.a.b((Device) dVar.getValue(this, kVarArr[0])), new WsdSetProgramConversation(this, (short) this.f37253b), WsdSetProgramConversation.class);
            this.f37264m = aVar;
            aVar.c(new b());
            bj.a<WsdSetProgramConversation> aVar2 = this.f37264m;
            if (aVar2 != null) {
                aVar2.e();
                return;
            }
            return;
        }
        H3();
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
    public final void z2(WsdSetProgramConversation conversation) {
        u.j(conversation, "conversation");
    }

    @Override // u70.a.c
    public final void f2(long j5) {
    }
}
