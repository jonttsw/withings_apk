package com.withings.device.details.wsd.programs;

import ah.c0;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.v;
import androidx.lifecycle.k1;
import androidx.lifecycle.l0;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.alarm.model.DeviceAlarm;
import com.withings.alarm.model.WsdProgram;
import com.withings.alarm.model.WsdProgramElement;
import com.withings.alarm.ui.VolumeSeekBar;
import com.withings.android.activity.WithingsActivity;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.generated.object.AlarmId;
import com.withings.device.Device;
import com.withings.device.details.wsd.conversation.WsdSetProgramConversation;
import com.withings.device.details.wsd.programs.WsdProgramActivity;
import com.withings.device.details.wsd.programs.d;
import com.withings.device.details.wsd.programs.spotify.WsdSpotifyActivity;
import com.withings.device.details.wsd.programs.webradio.WsdWebRadioActivity;
import com.withings.wiscale2.C1987R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import u70.a;
import un.k;
import ym0.l;
/* compiled from: WsdProgramActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withings/device/details/wsd/programs/WsdProgramActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/device/details/wsd/programs/d$a;", "Lu70/a$c;", "<init>", "()V", "a", "device-details-wsd_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class WsdProgramActivity extends WithingsActivity implements d.a, a.c {

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f37079a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f37080b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f37081c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList f37082d;

    /* renamed from: e  reason: collision with root package name */
    private WsdProgram f37083e;

    /* renamed from: f  reason: collision with root package name */
    private k f37084f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f37085g;

    /* renamed from: h  reason: collision with root package name */
    private WsdProgram f37086h;

    /* renamed from: i  reason: collision with root package name */
    private Integer f37087i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f37088j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f37089k;

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f37090l;

    /* renamed from: m  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f37091m;

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f37092n;

    /* renamed from: o  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f37093o;

    /* renamed from: p  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f37094p;

    /* renamed from: q  reason: collision with root package name */
    private final nm0.g f37095q;

    /* renamed from: r  reason: collision with root package name */
    private final f f37096r;

    /* renamed from: t  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f37078t = {v.c(WsdProgramActivity.class, "binding", "getBinding()Lcom/withings/device/details/wsd/databinding/ActivityWsdProgramBinding;", 0)};

    /* renamed from: s  reason: collision with root package name */
    public static final a f37077s = new Object();

    /* compiled from: WsdProgramActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static Intent a(Context context, Device device, List programs, WsdProgram wsdProgram, short s11, DeviceAlarm deviceAlarm) {
            u.j(context, "context");
            u.j(device, "device");
            u.j(programs, "programs");
            Intent putExtra = new Intent(context, WsdProgramActivity.class).putExtra("device", device).putParcelableArrayListExtra("programs", new ArrayList<>(programs)).putExtra("program", wsdProgram).putExtra("program_type", s11).putExtra("alarm", deviceAlarm);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: WsdProgramActivity.kt */
    /* loaded from: classes3.dex */
    static final class b extends w implements ym0.a<com.withings.device.details.wsd.programs.d> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final com.withings.device.details.wsd.programs.d invoke() {
            return new com.withings.device.details.wsd.programs.d(WsdProgramActivity.this);
        }
    }

    /* compiled from: WsdProgramActivity.kt */
    /* loaded from: classes3.dex */
    static final class c extends w implements ym0.a<WsdSetProgramConversation> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final WsdSetProgramConversation invoke() {
            return (WsdSetProgramConversation) ej.w.w().y(WsdProgramActivity.G3(WsdProgramActivity.this).getMacAddress(), WsdSetProgramConversation.class);
        }
    }

    /* compiled from: WsdProgramActivity.kt */
    /* loaded from: classes3.dex */
    static final class d extends w implements ym0.a<Device> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final Device invoke() {
            Object obj;
            Intent intent = WsdProgramActivity.this.getIntent();
            u.i(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                obj = intent.getSerializableExtra("device", Device.class);
            } else {
                Serializable serializableExtra = intent.getSerializableExtra("device");
                if (!(serializableExtra instanceof Device)) {
                    serializableExtra = null;
                }
                obj = (Device) serializableExtra;
            }
            u.g(obj);
            return (Device) obj;
        }
    }

    /* compiled from: WsdProgramActivity.kt */
    /* loaded from: classes3.dex */
    static final class e extends w implements ym0.a<DeviceAlarm> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final DeviceAlarm invoke() {
            Object parcelableExtra;
            Intent intent = WsdProgramActivity.this.getIntent();
            u.i(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = intent.getParcelableExtra("alarm", DeviceAlarm.class);
            } else {
                parcelableExtra = intent.getParcelableExtra("alarm");
            }
            return (DeviceAlarm) parcelableExtra;
        }
    }

    /* compiled from: WsdProgramActivity.kt */
    /* loaded from: classes3.dex */
    public static final class f implements SeekBar.OnSeekBarChangeListener {
        f() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i11, boolean z5) {
            u.j(seekBar, "seekBar");
            WsdProgramActivity wsdProgramActivity = WsdProgramActivity.this;
            k kVar = wsdProgramActivity.f37084f;
            if (kVar != null) {
                WsdProgram wsdProgram = (WsdProgram) kVar.g0().getValue();
                if (wsdProgramActivity.f37089k && wsdProgram != null) {
                    wsdProgramActivity.f37087i = Integer.valueOf(wsdProgram.i());
                    wsdProgramActivity.f37088j = Integer.valueOf(wsdProgram.c());
                    return;
                }
                return;
            }
            u.s("viewModel");
            throw null;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            u.j(seekBar, "seekBar");
            WsdProgramActivity.this.f37089k = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            u.j(seekBar, "seekBar");
            WsdProgramActivity wsdProgramActivity = WsdProgramActivity.this;
            wsdProgramActivity.f37089k = false;
            k kVar = wsdProgramActivity.f37084f;
            if (kVar != null) {
                WsdProgram wsdProgram = (WsdProgram) kVar.g0().getValue();
                if (wsdProgram != null) {
                    wsdProgram.F((short) seekBar.getProgress());
                    wsdProgramActivity.W3(wsdProgram, (short) 1);
                    wsdProgram.u((short) seekBar.getProgress());
                    wsdProgramActivity.W3(wsdProgram, (short) 2);
                    return;
                }
                return;
            }
            u.s("viewModel");
            throw null;
        }
    }

    /* compiled from: WsdProgramActivity.kt */
    /* loaded from: classes3.dex */
    static final class g extends w implements ym0.a<u70.d> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final u70.d invoke() {
            final WsdProgramActivity wsdProgramActivity = WsdProgramActivity.this;
            return new u70.d(new Runnable() { // from class: un.h
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z5;
                    DeviceAlarm V3;
                    WsdSetProgramConversation U3;
                    WsdSetProgramConversation U32;
                    WsdProgram wsdProgram;
                    WsdProgramActivity this$0 = WsdProgramActivity.this;
                    u.j(this$0, "this$0");
                    z5 = this$0.f37085g;
                    if (z5) {
                        V3 = this$0.V3();
                        y yVar = null;
                        if (V3 != null) {
                            AlarmId alarmId = new AlarmId();
                            alarmId.f33236id = V3.j();
                            U32 = this$0.U3();
                            wsdProgram = this$0.f37083e;
                            if (wsdProgram != null) {
                                U32.P(wsdProgram, alarmId);
                                yVar = y.f85009a;
                            } else {
                                u.s("currentProgram");
                                throw null;
                            }
                        }
                        if (yVar == null) {
                            U3 = this$0.U3();
                            U3.Q(WsdProgramActivity.J3(this$0));
                        }
                    }
                }
            }, 3000);
        }
    }

    /* compiled from: WsdProgramActivity.kt */
    /* loaded from: classes3.dex */
    static final class h implements l0, p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f37103a;

        h(l lVar) {
            this.f37103a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof l0) || !(obj instanceof p)) {
                return false;
            }
            return u.e(this.f37103a, ((p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f37103a;
        }

        public final int hashCode() {
            return this.f37103a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37103a.invoke(obj);
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes3.dex */
    public static final class i extends w implements l<ComponentActivity, tn.c> {
        @Override // ym0.l
        public final tn.c invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.mainLayout);
            u.i(e11, "requireViewById(this, id)");
            return tn.c.a(e11);
        }
    }

    /* compiled from: WsdProgramActivity.kt */
    /* loaded from: classes3.dex */
    static final class j extends w implements ym0.a<Short> {
        j() {
            super(0);
        }

        @Override // ym0.a
        public final Short invoke() {
            return Short.valueOf(WsdProgramActivity.this.getIntent().getShortExtra("program_type", (short) 4));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public WsdProgramActivity() {
        super(C1987R.layout.activity_wsd_program);
        this.f37079a = nm0.h.b(new d());
        this.f37080b = nm0.h.b(new e());
        this.f37081c = nm0.h.b(new j());
        this.f37085g = true;
        this.f37090l = nm0.h.b(new b());
        this.f37091m = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new w(1));
        this.f37092n = nm0.h.b(new c());
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new un.c(this, 0));
        u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f37093o = registerForActivityResult;
        androidx.activity.result.b<Intent> registerForActivityResult2 = registerForActivityResult(new g.a(), new androidx.activity.result.a() { // from class: un.d
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                WsdProgramActivity.z3(WsdProgramActivity.this, (ActivityResult) obj);
            }
        });
        u.i(registerForActivityResult2, "registerForActivityResult(...)");
        this.f37094p = registerForActivityResult2;
        this.f37095q = nm0.h.b(new g());
        this.f37096r = new f();
    }

    public static void A3(WsdProgramActivity this$0) {
        u.j(this$0, "this$0");
        if (c0.d()) {
            boolean z5 = !this$0.f37085g;
            this$0.f37085g = z5;
            Toast.makeText(this$0, "auto refresh : " + z5, 0).show();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
        if (r14 == null) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void B3(com.withings.device.details.wsd.programs.WsdProgramActivity r13, androidx.activity.result.ActivityResult r14) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.device.details.wsd.programs.WsdProgramActivity.B3(com.withings.device.details.wsd.programs.WsdProgramActivity, androidx.activity.result.ActivityResult):void");
    }

    public static void C3(WsdProgramActivity this$0, List withingsPrograms, int i11) {
        u.j(this$0, "this$0");
        u.j(withingsPrograms, "$withingsPrograms");
        WsdProgram wsdProgram = (WsdProgram) withingsPrograms.get(i11);
        k kVar = this$0.f37084f;
        if (kVar != null) {
            kVar.j0(wsdProgram.d());
            this$0.W3(wsdProgram, (short) 3);
            k kVar2 = this$0.f37084f;
            if (kVar2 != null) {
                ArrayList arrayList = this$0.f37082d;
                if (arrayList != null) {
                    kVar2.k0(arrayList);
                    return;
                } else {
                    u.s("programs");
                    throw null;
                }
            }
            u.s("viewModel");
            throw null;
        }
        u.s("viewModel");
        throw null;
    }

    public static final com.withings.device.details.wsd.programs.d D3(WsdProgramActivity wsdProgramActivity) {
        return (com.withings.device.details.wsd.programs.d) wsdProgramActivity.f37090l.getValue();
    }

    public static final Device G3(WsdProgramActivity wsdProgramActivity) {
        return (Device) wsdProgramActivity.f37079a.getValue();
    }

    public static final short J3(WsdProgramActivity wsdProgramActivity) {
        return ((Number) wsdProgramActivity.f37081c.getValue()).shortValue();
    }

    public static final void R3(WsdProgramActivity wsdProgramActivity) {
        k kVar = wsdProgramActivity.f37084f;
        if (kVar != null) {
            WsdProgram wsdProgram = (WsdProgram) kVar.g0().getValue();
            if (wsdProgram == null) {
                wsdProgramActivity.T3().f100302d.setProgress(wsdProgramActivity.T3().f100302d.getMax() / 2);
                wsdProgramActivity.T3().f100299a.setProgress(wsdProgramActivity.T3().f100299a.getMax() / 2);
                return;
            } else if (wsdProgramActivity.f37087i == null) {
                wsdProgramActivity.T3().f100302d.setProgress(wsdProgram.i());
                return;
            } else if (wsdProgramActivity.f37088j == null) {
                wsdProgramActivity.T3().f100299a.setProgress(wsdProgram.c());
                return;
            } else {
                return;
            }
        }
        u.s("viewModel");
        throw null;
    }

    private final void S3(int i11) {
        this.f37087i = Integer.valueOf(i11);
        k kVar = this.f37084f;
        if (kVar != null) {
            WsdProgram wsdProgram = (WsdProgram) kVar.g0().getValue();
            if (wsdProgram != null) {
                wsdProgram.F((short) i11);
                W3(wsdProgram, (short) 1);
                return;
            }
            return;
        }
        u.s("viewModel");
        throw null;
    }

    private final tn.c T3() {
        Object value = ((LifecycleViewBindingProperty) this.f37091m).getValue(this, f37078t[0]);
        u.i(value, "getValue(...)");
        return (tn.c) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WsdSetProgramConversation U3() {
        return (WsdSetProgramConversation) this.f37092n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceAlarm V3() {
        return (DeviceAlarm) this.f37080b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:
        if (r0 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W3(com.withings.alarm.model.WsdProgram r9, short r10) {
        /*
            r8 = this;
            com.withings.alarm.model.DeviceAlarm r0 = r8.V3()
            if (r0 == 0) goto L32
            short r1 = r9.d()
            r0.l0(r1)
            short r1 = r9.i()
            r0.H0(r1)
            short r1 = r9.c()
            r0.G(r1)
            androidx.lifecycle.LifecycleCoroutineScopeImpl r2 = m0.t.l(r8)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.device.details.wsd.programs.c r5 = new com.withings.device.details.wsd.programs.c
            r1 = 0
            r5.<init>(r8, r0, r10, r1)
            r4 = 0
            r6 = 2
            r7 = 0
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.BuildersKt.launch$default(r2, r3, r4, r5, r6, r7)
            if (r0 != 0) goto L41
        L32:
            com.withings.device.details.wsd.conversation.WsdSetProgramConversation r0 = r8.U3()
            r1 = 1
            short[] r1 = new short[r1]
            r2 = 0
            r1[r2] = r10
            r0.e0(r9, r1)
            nm0.y r0 = nm0.y.f85009a
        L41:
            r0 = 3
            if (r10 != r0) goto L86
            short r10 = r9.d()
            r0 = 129(0x81, float:1.81E-43)
            if (r10 != r0) goto L56
            boolean r0 = r9.p()
            if (r0 != 0) goto L56
            r8.X3()
            goto L86
        L56:
            r0 = 128(0x80, float:1.794E-43)
            if (r10 != r0) goto L86
            boolean r9 = r9.o()
            if (r9 != 0) goto L86
            com.withings.device.details.wsd.programs.spotify.WsdSpotifyActivity$a r9 = com.withings.device.details.wsd.programs.spotify.WsdSpotifyActivity.f37250q
            nm0.g r10 = r8.f37079a
            java.lang.Object r10 = r10.getValue()
            com.withings.device.Device r10 = (com.withings.device.Device) r10
            nm0.g r0 = r8.f37081c
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            short r0 = r0.shortValue()
            com.withings.alarm.model.DeviceAlarm r1 = r8.V3()
            r9.getClass()
            android.content.Intent r9 = com.withings.device.details.wsd.programs.spotify.WsdSpotifyActivity.a.a(r8, r10, r0, r1)
            androidx.activity.result.b<android.content.Intent> r10 = r8.f37094p
            r10.a(r9)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.device.details.wsd.programs.WsdProgramActivity.W3(com.withings.alarm.model.WsdProgram, short):void");
    }

    private final void X3() {
        Device device = (Device) this.f37079a.getValue();
        short shortValue = ((Number) this.f37081c.getValue()).shortValue();
        DeviceAlarm V3 = V3();
        WsdProgram wsdProgram = this.f37083e;
        if (wsdProgram != null) {
            u.j(device, "device");
            Intent putExtra = new Intent(this, WsdWebRadioActivity.class).putExtra("device", device).putExtra("current_program", wsdProgram).putExtra("program_type", (int) shortValue).putExtra("alarm", V3);
            u.i(putExtra, "putExtra(...)");
            this.f37093o.a(putExtra);
            return;
        }
        u.s("currentProgram");
        throw null;
    }

    public static void z3(WsdProgramActivity this$0, ActivityResult activityResult) {
        y yVar;
        boolean z5;
        u.j(this$0, "this$0");
        Intent a11 = activityResult.a();
        y yVar2 = null;
        if (this$0.U3() == null) {
            a11 = null;
        }
        if (a11 != null) {
            String stringExtra = a11.getStringExtra("preset_name");
            if (stringExtra != null && stringExtra.length() != 0) {
                DeviceAlarm V3 = this$0.V3();
                if (V3 != null) {
                    V3.w0("");
                    V3.u0(stringExtra);
                    V3.l0(Wpp.SPOTIFY_ID);
                    this$0.U3().d0(V3, 3, 7, 7);
                    rg.b.b().k(this$0, this$0.V3(), (Device) this$0.f37079a.getValue());
                    yVar = y.f85009a;
                } else {
                    yVar = null;
                }
                if (yVar == null) {
                    WsdSetProgramConversation U3 = this$0.U3();
                    WsdProgram wsdProgram = this$0.f37083e;
                    if (wsdProgram != null) {
                        U3.e0(wsdProgram, 7);
                    } else {
                        u.s("currentProgram");
                        throw null;
                    }
                }
                ArrayList<WsdProgram> arrayList = this$0.f37082d;
                if (arrayList != null) {
                    for (WsdProgram wsdProgram2 : arrayList) {
                        if (wsdProgram2.d() == 128) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        wsdProgram2.B(z5);
                        if (wsdProgram2.d() == 128) {
                            wsdProgram2.C(stringExtra);
                            WsdProgram wsdProgram3 = this$0.f37083e;
                            if (wsdProgram3 != null) {
                                wsdProgram3.D("");
                            } else {
                                u.s("currentProgram");
                                throw null;
                            }
                        }
                    }
                    k kVar = this$0.f37084f;
                    if (kVar != null) {
                        ArrayList arrayList2 = this$0.f37082d;
                        if (arrayList2 != null) {
                            kVar.k0(arrayList2);
                        } else {
                            u.s("programs");
                            throw null;
                        }
                    } else {
                        u.s("viewModel");
                        throw null;
                    }
                } else {
                    u.s("programs");
                    throw null;
                }
            }
            yVar2 = y.f85009a;
        }
        if (yVar2 == null) {
            this$0.finish();
        }
    }

    @Override // u70.a.c
    public final long H() {
        return 300000L;
    }

    @Override // u70.a.c
    public final void Q2() {
        u70.a.b().h(this);
        finish();
    }

    @Override // com.withings.device.details.wsd.programs.d.a
    public final void R0(com.withings.device.details.wsd.programs.h programView, WsdProgram program) {
        WsdProgram wsdProgram;
        u.j(programView, "programView");
        u.j(program, "program");
        WsdProgram wsdProgram2 = this.f37086h;
        if (wsdProgram2 != null) {
            wsdProgram2.y(false);
        }
        boolean z5 = !u.e(program, this.f37086h);
        if (z5) {
            wsdProgram = program;
        } else {
            wsdProgram = null;
        }
        this.f37086h = wsdProgram;
        program.y(z5);
        if (z5) {
            U3().X(program);
        } else {
            U3().b0();
        }
    }

    @Override // com.withings.device.details.wsd.programs.d.a
    public final void Z(un.l categoryView, WsdProgramElement.CategoryType categoryType) {
        u.j(categoryView, "categoryView");
        int ordinal = categoryType.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    k kVar = this.f37084f;
                    if (kVar != null) {
                        List<WsdProgram> value = kVar.i0().getValue();
                        if (value != null) {
                            List<WsdProgram> list = value;
                            ArrayList arrayList = new ArrayList(x.y(list, 10));
                            for (WsdProgram wsdProgram : list) {
                                arrayList.add(wsdProgram.f(this));
                            }
                            qc.b bVar = new qc.b(this);
                            bVar.u((String[]) arrayList.toArray(new String[0]), new com.withings.alarm.ui.k(1, this, value));
                            bVar.s();
                            return;
                        }
                        return;
                    }
                    u.s("viewModel");
                    throw null;
                }
                return;
            }
            WsdSpotifyActivity.a aVar = WsdSpotifyActivity.f37250q;
            short shortValue = ((Number) this.f37081c.getValue()).shortValue();
            DeviceAlarm V3 = V3();
            aVar.getClass();
            this.f37094p.a(WsdSpotifyActivity.a.a(this, (Device) this.f37079a.getValue(), shortValue, V3));
            return;
        }
        X3();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent event) {
        u.j(event, "event");
        int keyCode = event.getKeyCode();
        if (keyCode != 24) {
            if (keyCode != 25) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() != 0) {
                return true;
            }
            S3(T3().f100302d.b());
            return true;
        } else if (event.getAction() != 0) {
            return true;
        } else {
            S3(T3().f100302d.c());
            return true;
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        Intent putExtra = new Intent().putExtra("device", (Device) this.f37079a.getValue());
        ArrayList arrayList = this.f37082d;
        if (arrayList != null) {
            Intent putParcelableArrayListExtra = putExtra.putParcelableArrayListExtra("programs", new ArrayList<>(arrayList));
            u.i(putParcelableArrayListExtra, "putParcelableArrayListExtra(...)");
            setResult(-1, putParcelableArrayListExtra);
            U3().b0();
            super.finish();
            return;
        }
        u.s("programs");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ArrayList parcelableArrayListExtra;
        Object parcelableExtra;
        boolean z5;
        super.onCreate(bundle);
        Intent intent = getIntent();
        u.i(intent, "getIntent(...)");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("programs", WsdProgram.class);
        } else {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("programs");
        }
        u.g(parcelableArrayListExtra);
        this.f37082d = parcelableArrayListExtra;
        Intent intent2 = getIntent();
        u.i(intent2, "getIntent(...)");
        if (i11 >= 33) {
            parcelableExtra = intent2.getParcelableExtra("program", WsdProgram.class);
        } else {
            parcelableExtra = intent2.getParcelableExtra("program");
        }
        u.g(parcelableExtra);
        this.f37083e = (WsdProgram) parcelableExtra;
        DeviceAlarm V3 = V3();
        if (V3 != null) {
            ArrayList<WsdProgram> arrayList = this.f37082d;
            if (arrayList != null) {
                for (WsdProgram wsdProgram : arrayList) {
                    if (wsdProgram.d() == 129) {
                        wsdProgram.G(V3.y());
                        wsdProgram.H(V3.v());
                    } else if (wsdProgram.d() == 128) {
                        wsdProgram.D(V3.s());
                        wsdProgram.C(V3.r());
                    }
                    wsdProgram.F(V3.u());
                    wsdProgram.u(V3.c());
                    if (V3.p() == wsdProgram.d()) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    wsdProgram.B(z5);
                }
            } else {
                u.s("programs");
                throw null;
            }
        }
        Toolbar toolbar = T3().f100301c;
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        toolbar.setNavigationIcon(2131231755);
        getWindow().setStatusBarColor(androidx.core.content.a.getColor(this, C1987R.color.datavizMonochromaticNeutral5));
        tn.c T3 = T3();
        T3.f100300b.setAdapter((com.withings.device.details.wsd.programs.d) this.f37090l.getValue());
        VolumeSeekBar volumeSeekBar = T3.f100302d;
        f fVar = this.f37096r;
        volumeSeekBar.setOnSeekBarChangeListener(fVar);
        T3.f100299a.setOnSeekBarChangeListener(fVar);
        T3.f100303e.setOnClickListener(new androidx.viewpager.widget.c(this, 3));
        k kVar = (k) new k1(this, new un.g(this)).a(k.class);
        kVar.f0().observe(this, new h(new com.withings.device.details.wsd.programs.b(this)));
        this.f37084f = kVar;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        u70.a.b().h(this);
        ((u70.d) this.f37095q.getValue()).f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        u70.a.b().a(this);
        ((u70.d) this.f37095q.getValue()).e();
        k kVar = this.f37084f;
        if (kVar != null) {
            ArrayList arrayList = this.f37082d;
            if (arrayList != null) {
                kVar.k0(arrayList);
                return;
            } else {
                u.s("programs");
                throw null;
            }
        }
        u.s("viewModel");
        throw null;
    }

    @Override // com.withings.device.details.wsd.programs.d.a
    public final void u2(com.withings.device.details.wsd.programs.h wsdProgramView, com.withings.alarm.model.b wsdProgramHolder) {
        u.j(wsdProgramView, "wsdProgramView");
        u.j(wsdProgramHolder, "wsdProgramHolder");
        if (wsdProgramHolder.d() == null) {
            WsdProgramElement.CategoryType a11 = wsdProgramHolder.a();
            u.i(a11, "getCategoryType(...)");
            Z(wsdProgramView, a11);
            return;
        }
        k kVar = this.f37084f;
        if (kVar != null) {
            kVar.j0(wsdProgramHolder.d().d());
            WsdProgram d11 = wsdProgramHolder.d();
            u.i(d11, "getWsdProgram(...)");
            W3(d11, (short) 3);
            return;
        }
        u.s("viewModel");
        throw null;
    }

    @Override // u70.a.c
    public final void f2(long j5) {
    }
}
