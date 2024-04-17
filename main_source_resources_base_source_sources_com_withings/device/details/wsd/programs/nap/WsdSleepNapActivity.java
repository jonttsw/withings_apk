package com.withings.device.details.wsd.programs.nap;

import ah.c0;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import com.withings.alarm.model.DeviceAlarm;
import com.withings.alarm.model.WsdProgram;
import com.withings.alarm.ui.VolumeSeekBar;
import com.withings.comm.wpp.generated.object.WsdSubstatus;
import com.withings.device.Device;
import com.withings.device.details.scale.z;
import com.withings.device.details.wsd.conversation.WsdSetProgramConversation;
import com.withings.device.details.wsd.programs.WsdSetProgramActivity;
import com.withings.device.details.wsd.programs.alarm.WsdMultipleAlarmActivity;
import com.withings.device.details.wsd.programs.nap.WsdSleepNapActivity;
import com.withings.wiscale2.C1987R;
import dp0.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
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
import org.joda.time.DateTime;
import org.joda.time.Seconds;
import qj.m;
import ym0.p;
/* compiled from: WsdSleepNapActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/device/details/wsd/programs/nap/WsdSleepNapActivity;", "Lcom/withings/device/details/wsd/programs/WsdSetProgramActivity;", "<init>", "()V", "a", "device-details-wsd_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class WsdSleepNapActivity extends WsdSetProgramActivity {
    public static final /* synthetic */ int M = 0;
    private final short A;
    private final androidx.activity.result.b<Intent> B;
    private final e F;
    private final nm0.g G;

    /* renamed from: j  reason: collision with root package name */
    private List<? extends DeviceAlarm> f37224j;

    /* renamed from: k  reason: collision with root package name */
    private DeviceAlarm f37225k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f37226l;

    /* renamed from: m  reason: collision with root package name */
    private tn.e f37227m;

    /* renamed from: p  reason: collision with root package name */
    private boolean f37230p;

    /* renamed from: r  reason: collision with root package name */
    private boolean f37232r;

    /* renamed from: t  reason: collision with root package name */
    private Integer f37234t;

    /* renamed from: u  reason: collision with root package name */
    private Integer f37235u;

    /* renamed from: w  reason: collision with root package name */
    private Boolean f37237w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f37238x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f37239y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f37240z;

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f37228n = nm0.h.b(new d());

    /* renamed from: o  reason: collision with root package name */
    private final nm0.g f37229o = nm0.h.b(b.f37241a);

    /* renamed from: q  reason: collision with root package name */
    private boolean f37231q = true;

    /* renamed from: s  reason: collision with root package name */
    private final nm0.g f37233s = nm0.h.b(new c());

    /* renamed from: v  reason: collision with root package name */
    private boolean f37236v = true;

    /* compiled from: WsdSleepNapActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static Intent a(Context context, Device device, List alarms, boolean z5) {
            u.j(context, "context");
            u.j(device, "device");
            u.j(alarms, "alarms");
            WsdSetProgramActivity.a aVar = WsdSetProgramActivity.f37105h;
            Intent putExtra = WsdSetProgramActivity.B3(context, WsdSleepNapActivity.class, device).putParcelableArrayListExtra("alarm", new ArrayList<>(alarms)).putExtra("isNap", z5);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: WsdSleepNapActivity.kt */
    /* loaded from: classes3.dex */
    static final class b extends w implements ym0.a<rg.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f37241a = new w(0);

        @Override // ym0.a
        public final rg.b invoke() {
            return rg.b.b();
        }
    }

    /* compiled from: WsdSleepNapActivity.kt */
    /* loaded from: classes3.dex */
    static final class c extends w implements ym0.a<Boolean> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(DateFormat.is24HourFormat(WsdSleepNapActivity.this));
        }
    }

    /* compiled from: WsdSleepNapActivity.kt */
    /* loaded from: classes3.dex */
    static final class d extends w implements ym0.a<yn.a> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final yn.a invoke() {
            return new yn.a(WsdSleepNapActivity.this);
        }
    }

    /* compiled from: WsdSleepNapActivity.kt */
    /* loaded from: classes3.dex */
    public static final class e implements SeekBar.OnSeekBarChangeListener {
        e() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i11, boolean z5) {
            u.j(seekBar, "seekBar");
            WsdSleepNapActivity wsdSleepNapActivity = WsdSleepNapActivity.this;
            WsdProgram F3 = wsdSleepNapActivity.F3();
            if (!wsdSleepNapActivity.f37230p) {
                F3 = null;
            }
            if (F3 != null) {
                wsdSleepNapActivity.f37234t = Integer.valueOf(F3.i());
                wsdSleepNapActivity.f37235u = Integer.valueOf(F3.c());
            }
            WsdProgram F32 = wsdSleepNapActivity.F3();
            if (F32 != null) {
                tn.e eVar = wsdSleepNapActivity.f37227m;
                if (eVar != null) {
                    F32.F((short) eVar.f100315j.getProgress());
                } else {
                    u.s("binding");
                    throw null;
                }
            }
            WsdProgram F33 = wsdSleepNapActivity.F3();
            if (F33 != null) {
                tn.e eVar2 = wsdSleepNapActivity.f37227m;
                if (eVar2 != null) {
                    F33.u((short) eVar2.f100308c.getProgress());
                } else {
                    u.s("binding");
                    throw null;
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            u.j(seekBar, "seekBar");
            WsdSleepNapActivity.this.f37230p = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            u.j(seekBar, "seekBar");
            WsdSleepNapActivity wsdSleepNapActivity = WsdSleepNapActivity.this;
            wsdSleepNapActivity.f37230p = false;
            WsdProgram F3 = wsdSleepNapActivity.F3();
            if (F3 != null) {
                wsdSleepNapActivity.f37234t = Integer.valueOf(F3.i());
                wsdSleepNapActivity.f37235u = Integer.valueOf(F3.c());
                tn.e eVar = wsdSleepNapActivity.f37227m;
                if (eVar != null) {
                    if (eVar.f100315j == seekBar) {
                        WsdSleepNapActivity.i4(wsdSleepNapActivity, (short) 1);
                        return;
                    } else {
                        WsdSleepNapActivity.i4(wsdSleepNapActivity, (short) 2);
                        return;
                    }
                }
                u.s("binding");
                throw null;
            }
        }
    }

    /* compiled from: WsdSleepNapActivity.kt */
    /* loaded from: classes3.dex */
    static final class f extends w implements ym0.a<u70.d> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final u70.d invoke() {
            final WsdSleepNapActivity wsdSleepNapActivity = WsdSleepNapActivity.this;
            return new u70.d(new Runnable() { // from class: com.withings.device.details.wsd.programs.nap.a
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z5;
                    WsdSleepNapActivity this$0 = WsdSleepNapActivity.this;
                    u.j(this$0, "this$0");
                    this$0.x4(this$0.s4());
                    z5 = this$0.f37231q;
                    if (z5) {
                        WsdSetProgramConversation E3 = this$0.E3();
                        if (E3 != null) {
                            E3.Q(this$0.H3());
                        }
                        WsdSetProgramConversation E32 = this$0.E3();
                        if (E32 != null) {
                            E32.R();
                        }
                    }
                }
            }, 1000);
        }
    }

    /* compiled from: WsdSleepNapActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.wsd.programs.nap.WsdSleepNapActivity$statusReceived$1", f = "WsdSleepNapActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class g extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {
        g(qm0.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new g(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((g) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            WsdSleepNapActivity.this.K3();
            return y.f85009a;
        }
    }

    /* compiled from: WsdSleepNapActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.wsd.programs.nap.WsdSleepNapActivity$statusReceived$2", f = "WsdSleepNapActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class h extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f37248b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z5, qm0.d<? super h> dVar) {
            super(2, dVar);
            this.f37248b = z5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new h(this.f37248b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((h) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z5;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            boolean z11 = this.f37248b;
            int i11 = 0;
            WsdSleepNapActivity wsdSleepNapActivity = WsdSleepNapActivity.this;
            if (!z11 && !wsdSleepNapActivity.f37239y && !wsdSleepNapActivity.f37240z) {
                z5 = false;
            } else {
                z5 = true;
            }
            wsdSleepNapActivity.v4(z5);
            tn.e eVar = wsdSleepNapActivity.f37227m;
            if (eVar != null) {
                LinearLayout snooze = eVar.f100312g;
                u.i(snooze, "snooze");
                if (!wsdSleepNapActivity.f37239y) {
                    i11 = 8;
                }
                snooze.setVisibility(i11);
                wsdSleepNapActivity.w4();
                wsdSleepNapActivity.f37238x = true;
                WsdSleepNapActivity.m4(wsdSleepNapActivity);
                return y.f85009a;
            }
            u.s("binding");
            throw null;
        }
    }

    public WsdSleepNapActivity() {
        short s11;
        if (this.f37232r) {
            s11 = 4;
        } else if (this.f37226l) {
            s11 = 2;
        } else {
            s11 = 3;
        }
        this.A = s11;
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new androidx.activity.result.a() { // from class: yn.b
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                WsdSleepNapActivity.W3(WsdSleepNapActivity.this, (ActivityResult) obj);
            }
        });
        u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.B = registerForActivityResult;
        this.F = new e();
        this.G = nm0.h.b(new f());
    }

    public static void U3(WsdSleepNapActivity this$0) {
        u.j(this$0, "this$0");
        new yn.a(this$0).d();
        this$0.u4();
        boolean z5 = !this$0.f37236v;
        this$0.f37236v = z5;
        this$0.v4(z5);
        this$0.f37237w = Boolean.valueOf(this$0.f37236v);
        if (this$0.f37236v) {
            WsdProgram F3 = this$0.F3();
            if (F3 != null) {
                WsdSetProgramConversation E3 = this$0.E3();
                if (E3 != null) {
                    E3.Z(F3);
                }
                if (this$0.f37226l) {
                    this$0.t4().f();
                    this$0.t4().e(F3);
                    return;
                }
                return;
            }
            return;
        }
        WsdSetProgramConversation E32 = this$0.E3();
        if (E32 != null) {
            E32.c0();
        }
    }

    public static void V3(WsdSleepNapActivity this$0) {
        Intent C3;
        u.j(this$0, "this$0");
        if (!this$0.f37232r && !this$0.f37226l) {
            Device device = this$0.G3();
            u.j(device, "device");
            C3 = WsdSetProgramActivity.C3(this$0, WsdMultipleAlarmActivity.class, device);
            this$0.B.a(C3);
        }
    }

    public static void W3(WsdSleepNapActivity this$0, ActivityResult activityResult) {
        DeviceAlarm deviceAlarm;
        Object parcelableExtra;
        u.j(this$0, "this$0");
        if (activityResult.b() == -1) {
            Intent a11 = activityResult.a();
            if (a11 != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra = a11.getParcelableExtra("alarm", DeviceAlarm.class);
                } else {
                    parcelableExtra = a11.getParcelableExtra("alarm");
                }
                deviceAlarm = (DeviceAlarm) parcelableExtra;
            } else {
                deviceAlarm = null;
            }
            u.g(deviceAlarm);
            this$0.f37225k = deviceAlarm;
            this$0.w4();
        }
    }

    public static void X3(WsdSleepNapActivity this$0) {
        u.j(this$0, "this$0");
        this$0.T3(this$0.A);
    }

    public static void Y3(WsdSleepNapActivity this$0) {
        u.j(this$0, "this$0");
        if (c0.d()) {
            boolean z5 = !this$0.f37231q;
            this$0.f37231q = z5;
            Toast.makeText(this$0, "auto refresh : " + z5, 0).show();
        }
    }

    public static void Z3(WsdSleepNapActivity this$0) {
        u.j(this$0, "this$0");
        tn.e eVar = this$0.f37227m;
        if (eVar != null) {
            eVar.f100312g.setVisibility(8);
            WsdSetProgramConversation E3 = this$0.E3();
            if (E3 != null) {
                E3.S();
                return;
            }
            return;
        }
        u.s("binding");
        throw null;
    }

    public static final void i4(WsdSleepNapActivity wsdSleepNapActivity, short s11) {
        WsdSetProgramConversation E3;
        WsdProgram F3 = wsdSleepNapActivity.F3();
        if (F3 != null && (E3 = wsdSleepNapActivity.E3()) != null) {
            E3.e0(F3, s11);
        }
    }

    public static final void m4(WsdSleepNapActivity wsdSleepNapActivity) {
        int i11;
        if (wsdSleepNapActivity.f37232r) {
            i11 = C1987R.string._TIME_TO_WAKE_UP_;
        } else if (wsdSleepNapActivity.f37226l) {
            i11 = C1987R.string._NAP_;
        } else {
            i11 = C1987R.string._GOOD_NIGHT_;
        }
        wsdSleepNapActivity.setTitle(i11);
    }

    private final void q4() {
        WsdProgram F3;
        WsdProgram F32;
        if (F3() != null) {
            if (this.f37234t == null && (F32 = F3()) != null) {
                tn.e eVar = this.f37227m;
                if (eVar != null) {
                    eVar.f100315j.a(F32.i());
                } else {
                    u.s("binding");
                    throw null;
                }
            }
            if (this.f37235u == null && (F3 = F3()) != null) {
                tn.e eVar2 = this.f37227m;
                if (eVar2 != null) {
                    SeekBar brightness = eVar2.f100308c;
                    u.i(brightness, "brightness");
                    int c11 = F3.c();
                    if (brightness.getProgress() != c11) {
                        ObjectAnimator duration = ObjectAnimator.ofInt(brightness, "progress", brightness.getProgress(), c11).setDuration(300L);
                        u.i(duration, "setDuration(...)");
                        duration.setInterpolator(new DecelerateInterpolator());
                        duration.start();
                        return;
                    }
                    return;
                }
                u.s("binding");
                throw null;
            }
            return;
        }
        tn.e eVar3 = this.f37227m;
        if (eVar3 != null) {
            eVar3.f100315j.setProgress(50);
            tn.e eVar4 = this.f37227m;
            if (eVar4 != null) {
                eVar4.f100308c.setProgress(50);
                return;
            } else {
                u.s("binding");
                throw null;
            }
        }
        u.s("binding");
        throw null;
    }

    private final void r4(int i11) {
        WsdSetProgramConversation E3;
        WsdProgram F3 = F3();
        if (F3 != null) {
            F3.F((short) i11);
        }
        this.f37234t = Integer.valueOf(i11);
        WsdProgram F32 = F3();
        if (F32 != null) {
            tn.e eVar = this.f37227m;
            if (eVar != null) {
                F32.F((short) eVar.f100315j.getProgress());
            } else {
                u.s("binding");
                throw null;
            }
        }
        WsdProgram F33 = F3();
        if (F33 != null) {
            tn.e eVar2 = this.f37227m;
            if (eVar2 != null) {
                F33.u((short) eVar2.f100308c.getProgress());
            } else {
                u.s("binding");
                throw null;
            }
        }
        WsdProgram F34 = F3();
        if (F34 != null && (E3 = E3()) != null) {
            E3.e0(F34, 1);
        }
    }

    private final DateTime s4() {
        DateTime plusSeconds;
        DeviceAlarm deviceAlarm;
        DeviceAlarm deviceAlarm2;
        if (!this.f37226l && (deviceAlarm = this.f37225k) != null && deviceAlarm.B() && (deviceAlarm2 = this.f37225k) != null) {
            u.i(DateTime.now().withTimeAtStartOfDay().plusDays(1).plusHours(deviceAlarm2.h()).plusMinutes(deviceAlarm2.k()), "plusMinutes(...)");
            tn.e eVar = this.f37227m;
            if (eVar != null) {
                int o11 = deviceAlarm2.o();
                TextView textView = eVar.f100317l;
                if (o11 != 0) {
                    String string = textView.getContext().getString(o11);
                    textView.setText((string.substring(0, 1).toUpperCase() + string.substring(1)) + ",");
                } else {
                    textView.setText("");
                }
            } else {
                u.s("binding");
                throw null;
            }
        }
        if (this.f37226l) {
            DateTime dateTime = new DateTime(t4().b());
            long seconds = Seconds.secondsBetween(dateTime, DateTime.now()).getSeconds();
            if (seconds < t4().a() * 60) {
                DateTime minusSeconds = DateTime.now().plusMinutes(t4().c(F3())).minusSeconds((int) seconds);
                u.g(minusSeconds);
                return minusSeconds;
            }
            if (t4().b() == 0) {
                plusSeconds = DateTime.now().plusMinutes(t4().c(F3()));
            } else {
                plusSeconds = dateTime.plusSeconds(t4().a());
            }
            u.g(plusSeconds);
            return plusSeconds;
        }
        DateTime now = DateTime.now();
        u.i(now, "now(...)");
        return now;
    }

    private final yn.a t4() {
        return (yn.a) this.f37228n.getValue();
    }

    private final void u4() {
        DateTime s42;
        DeviceAlarm deviceAlarm;
        int i11;
        CharSequence charSequence;
        int i12;
        boolean z5;
        if (this.f37232r) {
            s42 = DateTime.now();
        } else {
            s42 = s4();
        }
        if (s42 != null && (deviceAlarm = this.f37225k) != null && deviceAlarm.B()) {
            tn.e eVar = this.f37227m;
            if (eVar != null) {
                if (this.f37232r) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                eVar.f100317l.setVisibility(i11);
                tn.e eVar2 = this.f37227m;
                if (eVar2 != null) {
                    eVar2.f100318m.setTextSize(2, 36.0f);
                    if (((Boolean) this.f37233s.getValue()).booleanValue()) {
                        tn.e eVar3 = this.f37227m;
                        if (eVar3 != null) {
                            eVar3.f100307b.setVisibility(8);
                            tn.e eVar4 = this.f37227m;
                            if (eVar4 != null) {
                                eVar4.f100318m.setText(s42.toString("HH:mm"));
                            } else {
                                u.s("binding");
                                throw null;
                            }
                        } else {
                            u.s("binding");
                            throw null;
                        }
                    } else {
                        int hourOfDay = s42.getHourOfDay();
                        tn.e eVar5 = this.f37227m;
                        if (eVar5 != null) {
                            if (hourOfDay == 24 || hourOfDay < 12) {
                                charSequence = "AM";
                            } else {
                                charSequence = "PM";
                            }
                            eVar5.f100307b.setText(charSequence);
                            tn.e eVar6 = this.f37227m;
                            if (eVar6 != null) {
                                eVar6.f100307b.setVisibility(0);
                                String formatDateTime = DateUtils.formatDateTime(this, s42.getMillis(), 1);
                                u.g(formatDateTime);
                                String O = j.O(j.O(formatDateTime, "AM", "", false), "PM", "", false);
                                int length = O.length() - 1;
                                int i13 = 0;
                                boolean z11 = false;
                                while (i13 <= length) {
                                    if (!z11) {
                                        i12 = i13;
                                    } else {
                                        i12 = length;
                                    }
                                    if (u.l(O.charAt(i12), 32) <= 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (!z11) {
                                        if (!z5) {
                                            z11 = true;
                                        } else {
                                            i13++;
                                        }
                                    } else if (!z5) {
                                        break;
                                    } else {
                                        length--;
                                    }
                                }
                                String obj = O.subSequence(i13, length + 1).toString();
                                tn.e eVar7 = this.f37227m;
                                if (eVar7 != null) {
                                    eVar7.f100318m.setText(obj);
                                } else {
                                    u.s("binding");
                                    throw null;
                                }
                            } else {
                                u.s("binding");
                                throw null;
                            }
                        } else {
                            u.s("binding");
                            throw null;
                        }
                    }
                } else {
                    u.s("binding");
                    throw null;
                }
            } else {
                u.s("binding");
                throw null;
            }
        } else {
            tn.e eVar8 = this.f37227m;
            if (eVar8 != null) {
                eVar8.f100318m.setText(C1987R.string._SET_YOUR_ALARM_);
                tn.e eVar9 = this.f37227m;
                if (eVar9 != null) {
                    eVar9.f100318m.setTextSize(2, 24.0f);
                    tn.e eVar10 = this.f37227m;
                    if (eVar10 != null) {
                        eVar10.f100307b.setVisibility(8);
                        tn.e eVar11 = this.f37227m;
                        if (eVar11 != null) {
                            eVar11.f100317l.setVisibility(8);
                        } else {
                            u.s("binding");
                            throw null;
                        }
                    } else {
                        u.s("binding");
                        throw null;
                    }
                } else {
                    u.s("binding");
                    throw null;
                }
            } else {
                u.s("binding");
                throw null;
            }
        }
        x4(s42);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v4(boolean z5) {
        int i11;
        if (this.f37237w != null && u.e(Boolean.valueOf(z5), this.f37237w)) {
            this.f37237w = null;
        }
        if (this.f37237w == null) {
            this.f37236v = z5;
            tn.e eVar = this.f37227m;
            if (eVar != null) {
                if (z5) {
                    i11 = C1987R.string.glyph_stop;
                } else {
                    i11 = C1987R.string.glyph_play;
                }
                eVar.f100311f.setText(i11);
                return;
            }
            u.s("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w4() {
        int i11;
        WsdProgram F3 = F3();
        if (F3 != null) {
            tn.e eVar = this.f37227m;
            if (eVar != null) {
                eVar.f100310e.setEnabled(!this.f37232r);
                tn.e eVar2 = this.f37227m;
                if (eVar2 != null) {
                    if (this.f37232r) {
                        i11 = C1987R.color.light_alpha60;
                    } else {
                        i11 = 17170443;
                    }
                    eVar2.f100309d.setTextColor(androidx.core.content.a.getColor(this, i11));
                    q4();
                    u4();
                    tn.e eVar3 = this.f37227m;
                    if (eVar3 != null) {
                        eVar3.f100309d.setText(F3.f(this));
                        return;
                    } else {
                        u.s("binding");
                        throw null;
                    }
                }
                u.s("binding");
                throw null;
            }
            u.s("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x4(org.joda.time.DateTime r12) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.device.details.wsd.programs.nap.WsdSleepNapActivity.x4(org.joda.time.DateTime):void");
    }

    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity
    public final short H3() {
        return this.A;
    }

    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity
    public final void J3(Intent intent) {
        DeviceAlarm deviceAlarm;
        super.J3(intent);
        WsdProgram F3 = F3();
        if (F3 != null && (deviceAlarm = this.f37225k) != null) {
            deviceAlarm.l0(F3.d());
        }
        w4();
    }

    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity
    public final void L3(u70.i iVar, WsdProgram programReceived) {
        WsdProgram F3;
        WsdProgram F32;
        u.j(programReceived, "programReceived");
        WsdProgram F33 = F3();
        if (F33 != null) {
            if (programReceived.d() == F33.d()) {
                if (this.f37234t == null && (F32 = F3()) != null) {
                    F32.F(programReceived.i());
                }
                if (this.f37235u == null && (F3 = F3()) != null) {
                    F3.u(programReceived.c());
                }
                if (this.f37235u == null || this.f37234t == null) {
                    q4();
                }
                if (this.f37234t != null) {
                    short i11 = programReceived.i();
                    Integer num = this.f37234t;
                    if (num != null && i11 == num.intValue()) {
                        this.f37234t = null;
                    }
                }
                if (this.f37235u != null) {
                    short c11 = programReceived.c();
                    Integer num2 = this.f37235u;
                    if (num2 != null && c11 == num2.intValue()) {
                        this.f37235u = null;
                    }
                }
            }
        }
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
    public final void P0(WsdSetProgramConversation conversation, m mVar) {
        boolean z5;
        boolean z11;
        boolean z12;
        u.j(conversation, "conversation");
        short s11 = mVar.b().status;
        boolean z13 = this.f37232r;
        boolean z14 = false;
        if (!this.f37226l ? s11 == 1 : s11 == 3) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (mVar.b().status == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f37232r = z11;
        WsdSubstatus c11 = mVar.c();
        u.i(c11, "getWsdSubstatus(...)");
        if (!z5 && c11.substatus == 1 && s11 == 2) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f37239y = z12;
        if (c11.substatus == 2) {
            z14 = true;
        }
        this.f37240z = z14;
        if (z13 == this.f37232r) {
            BuildersKt__Builders_commonKt.launch$default(t.l(this), Dispatchers.getMain(), null, new g(null), 2, null);
        } else {
            conversation.Q(this.A);
        }
        BuildersKt__Builders_commonKt.launch$default(t.l(this), Dispatchers.getMain(), null, new h(z5, null), 2, null);
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
    public final void S1(WsdSetProgramConversation conversation, short s11) {
        u.j(conversation, "conversation");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent event) {
        u.j(event, "event");
        int action = event.getAction();
        int keyCode = event.getKeyCode();
        if (keyCode != 24) {
            if (keyCode != 25) {
                return super.dispatchKeyEvent(event);
            }
            if (action != 0) {
                return true;
            }
            tn.e eVar = this.f37227m;
            if (eVar != null) {
                r4(eVar.f100315j.b());
                return true;
            }
            u.s("binding");
            throw null;
        } else if (action != 0) {
            return true;
        } else {
            tn.e eVar2 = this.f37227m;
            if (eVar2 != null) {
                r4(eVar2.f100315j.c());
                return true;
            }
            u.s("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        List<? extends DeviceAlarm> parcelableArrayListExtra;
        super.onCreate(bundle);
        tn.e b10 = tn.e.b(getLayoutInflater());
        this.f37227m = b10;
        setContentView(b10.a());
        this.f37226l = getIntent().getBooleanExtra("isNap", false);
        R3();
        Intent intent = getIntent();
        u.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("alarm", DeviceAlarm.class);
        } else {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("alarm");
        }
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = i0.f76187a;
        }
        this.f37224j = parcelableArrayListExtra;
        rg.b bVar = (rg.b) this.f37229o.getValue();
        List<? extends DeviceAlarm> list = this.f37224j;
        if (list != null) {
            bVar.getClass();
            this.f37225k = rg.b.e(list, false);
            tn.e eVar = this.f37227m;
            if (eVar != null) {
                Toolbar toolbar = eVar.f100313h;
                setSupportActionBar(toolbar);
                ActionBar supportActionBar = getSupportActionBar();
                if (supportActionBar != null) {
                    supportActionBar.o(true);
                }
                toolbar.setNavigationIcon(2131231755);
                tn.e eVar2 = this.f37227m;
                if (eVar2 != null) {
                    VolumeSeekBar volumeSeekBar = eVar2.f100315j;
                    e eVar3 = this.F;
                    volumeSeekBar.setOnSeekBarChangeListener(eVar3);
                    eVar2.f100308c.setOnSeekBarChangeListener(eVar3);
                    eVar2.f100310e.setOnClickListener(new z(this, 2));
                    eVar2.f100319n.setOnClickListener(new sg.b(this, 3));
                    eVar2.f100311f.setOnClickListener(new sg.c(this, 4));
                    eVar2.f100312g.setOnClickListener(new sg.d(this, 3));
                    eVar2.f100316k.setOnLongClickListener(new View.OnLongClickListener() { // from class: yn.c
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view) {
                            WsdSleepNapActivity.Y3(WsdSleepNapActivity.this);
                            return true;
                        }
                    });
                    w4();
                    v4(true);
                    return;
                }
                u.s("binding");
                throw null;
            }
            u.s("binding");
            throw null;
        }
        u.s("alarms");
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            z3();
        }
        return super.onOptionsItemSelected(item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        ((u70.d) this.G.getValue()).f();
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        WsdSetProgramConversation E3 = E3();
        if (E3 != null) {
            E3.U(this);
        }
        ((u70.d) this.G.getValue()).e();
    }

    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity
    public final void N3(qj.l lVar) {
    }

    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity
    public final void M3(u70.i iVar, ArrayList arrayList) {
    }
}
