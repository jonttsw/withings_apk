package com.withings.device.details.wsd.programs.media;

import ah.c0;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.ActionBar;
import com.google.android.material.datepicker.q;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.withings.alarm.model.WsdProgram;
import com.withings.alarm.ui.VolumeSeekBar;
import com.withings.device.Device;
import com.withings.device.details.scale.z;
import com.withings.device.details.wsd.conversation.WsdSetProgramConversation;
import com.withings.device.details.wsd.programs.WsdSetProgramActivity;
import com.withings.device.details.wsd.programs.media.WsdMediaActivity;
import com.withings.device.details.wsd.programs.moon.WsdMoodLightActivity;
import com.withings.device.details.wsd.programs.spotify.WsdSpotifyActivity;
import com.withings.device.details.wsd.programs.webradio.WsdWebRadioActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.util.log.Fail;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import m0.t;
import nm0.l;
import nm0.y;
import qj.m;
import sg.c;
import sg.j;
import u70.d;
import wn.f;
import wn.g;
import ym0.p;
/* compiled from: WsdMediaActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/device/details/wsd/programs/media/WsdMediaActivity;", "Lcom/withings/device/details/wsd/programs/WsdSetProgramActivity;", "<init>", "()V", "device-details-wsd_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class WsdMediaActivity extends WsdSetProgramActivity {
    public static final /* synthetic */ int B = 0;
    private final a A;

    /* renamed from: j */
    private tn.b f37185j;

    /* renamed from: k */
    private boolean f37186k;

    /* renamed from: l */
    private boolean f37187l;

    /* renamed from: m */
    private boolean f37188m;

    /* renamed from: n */
    private Boolean f37189n;

    /* renamed from: o */
    private Integer f37190o;

    /* renamed from: p */
    private Integer f37191p;

    /* renamed from: q */
    private boolean f37192q;

    /* renamed from: r */
    private boolean f37193r;

    /* renamed from: s */
    private Boolean f37194s;

    /* renamed from: u */
    private d f37196u;

    /* renamed from: x */
    private final androidx.activity.result.b<Intent> f37199x;

    /* renamed from: y */
    private final androidx.activity.result.b<Intent> f37200y;

    /* renamed from: z */
    private final androidx.activity.result.b<Intent> f37201z;

    /* renamed from: t */
    private boolean f37195t = true;

    /* renamed from: v */
    private final wn.d f37197v = new wn.d(this, 0);

    /* renamed from: w */
    private final short f37198w = 6;

    /* compiled from: WsdMediaActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a implements SeekBar.OnSeekBarChangeListener {
        a() {
            WsdMediaActivity.this = r1;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i11, boolean z5) {
            u.j(seekBar, "seekBar");
            WsdMediaActivity wsdMediaActivity = WsdMediaActivity.this;
            WsdProgram F3 = wsdMediaActivity.F3();
            if (!wsdMediaActivity.f37186k) {
                F3 = null;
            }
            if (F3 != null) {
                wsdMediaActivity.f37190o = Integer.valueOf(F3.i());
            }
            WsdProgram F32 = wsdMediaActivity.F3();
            if (F32 != null) {
                tn.b bVar = wsdMediaActivity.f37185j;
                if (bVar != null) {
                    F32.F((short) bVar.f100297q.getProgress());
                } else {
                    u.s("binding");
                    throw null;
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            u.j(seekBar, "seekBar");
            WsdMediaActivity.this.f37186k = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            u.j(seekBar, "seekBar");
            WsdMediaActivity wsdMediaActivity = WsdMediaActivity.this;
            wsdMediaActivity.f37186k = false;
            WsdProgram F3 = wsdMediaActivity.F3();
            if (F3 != null) {
                wsdMediaActivity.f37190o = Integer.valueOf(F3.i());
                WsdMediaActivity.p4(wsdMediaActivity);
            }
        }
    }

    /* compiled from: WsdMediaActivity.kt */
    @e(c = "com.withings.device.details.wsd.programs.media.WsdMediaActivity$statusReceived$1", f = "WsdMediaActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(qm0.d<? super b> dVar) {
            super(2, dVar);
            WsdMediaActivity.this = r1;
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
            WsdMediaActivity wsdMediaActivity = WsdMediaActivity.this;
            wsdMediaActivity.z4(wsdMediaActivity.f37188m);
            tn.b bVar = wsdMediaActivity.f37185j;
            if (bVar != null) {
                bVar.f100294n.setVisibility(8);
                wsdMediaActivity.y4();
                wsdMediaActivity.K3();
                return y.f85009a;
            }
            u.s("binding");
            throw null;
        }
    }

    public WsdMediaActivity() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new wn.e(this, 0));
        u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f37199x = registerForActivityResult;
        androidx.activity.result.b<Intent> registerForActivityResult2 = registerForActivityResult(new g.a(), new f(this, 0));
        u.i(registerForActivityResult2, "registerForActivityResult(...)");
        this.f37200y = registerForActivityResult2;
        androidx.activity.result.b<Intent> registerForActivityResult3 = registerForActivityResult(new g.a(), new g(this, 0));
        u.i(registerForActivityResult3, "registerForActivityResult(...)");
        this.f37201z = registerForActivityResult3;
        this.A = new a();
    }

    private final void A4(boolean z5) {
        int i11;
        if (this.f37189n == null) {
            tn.b bVar = this.f37185j;
            if (bVar != null) {
                if (z5) {
                    i11 = C1987R.string.glyph_stop;
                } else {
                    i11 = C1987R.string.glyph_play;
                }
                bVar.f100295o.setText(i11);
                return;
            }
            u.s("binding");
            throw null;
        }
    }

    public static void U3(WsdMediaActivity this$0) {
        Object obj;
        u.j(this$0, "this$0");
        Iterator<T> it = this$0.I3().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((WsdProgram) obj).o()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        WsdProgram wsdProgram = (WsdProgram) obj;
        if (wsdProgram != null) {
            this$0.x4(wsdProgram);
        }
        this$0.f37191p = 128;
    }

    public static void V3(WsdMediaActivity this$0) {
        u.j(this$0, "this$0");
        if (this$0.f37195t) {
            WsdSetProgramConversation E3 = this$0.E3();
            if (E3 != null) {
                E3.Q(this$0.f37198w);
            }
            WsdSetProgramConversation E32 = this$0.E3();
            if (E32 != null) {
                E32.R();
            }
        }
    }

    public static void W3(WsdMediaActivity this$0, boolean z5) {
        u.j(this$0, "this$0");
        if (!this$0.f37193r) {
            this$0.f37194s = Boolean.valueOf(z5);
            WsdSetProgramConversation E3 = this$0.E3();
            if (E3 != null) {
                E3.V(z5 ? (short) 1 : (short) 0);
            }
            WsdSetProgramConversation E32 = this$0.E3();
            if (E32 != null) {
                E32.O();
                return;
            }
            return;
        }
        this$0.f37193r = false;
    }

    public static void X3(WsdMediaActivity this$0, ActivityResult activityResult) {
        Object parcelableExtra;
        u.j(this$0, "this$0");
        Intent a11 = activityResult.a();
        y yVar = null;
        if (this$0.E3() == null) {
            a11 = null;
        }
        if (a11 != null) {
            String stringExtra = a11.getStringExtra("webradio_selected");
            if (stringExtra == null) {
                stringExtra = "";
            }
            String stringExtra2 = a11.getStringExtra("radio_name");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = a11.getParcelableExtra("result_program", WsdProgram.class);
            } else {
                parcelableExtra = a11.getParcelableExtra("result_program");
            }
            WsdProgram wsdProgram = (WsdProgram) parcelableExtra;
            if (wsdProgram == null) {
                Fail.j("Returned program is null, this should not happen !");
                this$0.finish();
            }
            this$0.P3(wsdProgram);
            u.g(wsdProgram);
            this$0.w4(wsdProgram.i());
            if (stringExtra.length() > 0) {
                WsdSetProgramConversation E3 = this$0.E3();
                if (E3 != null) {
                    WsdProgram F3 = this$0.F3();
                    u.g(F3);
                    E3.e0(F3, 4, 8);
                }
                for (WsdProgram wsdProgram2 : this$0.I3()) {
                    if (wsdProgram2.d() == 129) {
                        wsdProgram2.B(true);
                        wsdProgram2.G(stringExtra);
                        wsdProgram2.H(stringExtra2);
                    } else {
                        wsdProgram2.B(false);
                    }
                }
            }
            yVar = y.f85009a;
        }
        if (yVar == null) {
            this$0.finish();
        }
    }

    public static void Y3(WsdMediaActivity this$0) {
        u.j(this$0, "this$0");
        this$0.A4(!this$0.f37188m);
        this$0.f37189n = Boolean.valueOf(!this$0.f37188m);
        if (this$0.f37188m) {
            WsdSetProgramConversation E3 = this$0.E3();
            if (E3 != null) {
                E3.c0();
                return;
            }
            return;
        }
        WsdSetProgramConversation E32 = this$0.E3();
        if (E32 != null) {
            WsdProgram F3 = this$0.F3();
            u.g(F3);
            E32.Z(F3);
        }
    }

    public static void Z3(WsdMediaActivity this$0) {
        Object obj;
        u.j(this$0, "this$0");
        Iterator<T> it = this$0.I3().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((WsdProgram) obj).p()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        WsdProgram wsdProgram = (WsdProgram) obj;
        if (wsdProgram != null) {
            this$0.x4(wsdProgram);
        }
        this$0.f37191p = Integer.valueOf((int) ConstantsWs.MEASURE_TYPE_BREATHING_EVENT_PROBABILITY);
    }

    public static void a4(WsdMediaActivity this$0, ActivityResult activityResult) {
        u.j(this$0, "this$0");
        Intent a11 = activityResult.a();
        y yVar = null;
        if (this$0.E3() == null) {
            a11 = null;
        }
        if (a11 != null) {
            String stringExtra = a11.getStringExtra("preset_name");
            if (stringExtra == null) {
                stringExtra = "";
            }
            if (stringExtra.length() > 0) {
                WsdSetProgramConversation E3 = this$0.E3();
                if (E3 != null) {
                    WsdProgram F3 = this$0.F3();
                    u.g(F3);
                    E3.e0(F3, 7);
                }
                for (WsdProgram wsdProgram : this$0.I3()) {
                    if (wsdProgram.d() == 128) {
                        wsdProgram.C(stringExtra);
                        wsdProgram.D("");
                    } else {
                        wsdProgram.B(false);
                    }
                }
            }
            yVar = y.f85009a;
        }
        if (yVar == null) {
            this$0.finish();
        }
    }

    public static void b4(WsdMediaActivity this$0) {
        u.j(this$0, "this$0");
        WsdSetProgramConversation E3 = this$0.E3();
        if (E3 != null) {
            E3.p();
        }
        WsdMoodLightActivity.a aVar = WsdMoodLightActivity.f37205h;
        Device device = this$0.G3();
        aVar.getClass();
        u.j(device, "device");
        Intent putExtra = new Intent(this$0, WsdMoodLightActivity.class).putExtra("device", device);
        u.i(putExtra, "putExtra(...)");
        this$0.f37201z.a(putExtra);
    }

    public static void c4(WsdMediaActivity this$0) {
        u.j(this$0, "this$0");
        if (c0.d()) {
            boolean z5 = !this$0.f37195t;
            this$0.f37195t = z5;
            Toast.makeText(this$0, "auto refresh : " + z5, 0).show();
        }
    }

    public static void d4(WsdMediaActivity this$0) {
        u.j(this$0, "this$0");
        if (androidx.core.content.a.checkSelfPermission(this$0, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            androidx.core.app.a.d(this$0, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, 44);
            return;
        }
        Device device = this$0.G3();
        WsdProgram F3 = this$0.F3();
        u.j(device, "device");
        Intent putExtra = new Intent(this$0, WsdWebRadioActivity.class).putExtra("device", device).putExtra("current_program", F3).putExtra("program_type", (int) this$0.f37198w).putExtra("alarm", (Parcelable) null);
        u.i(putExtra, "putExtra(...)");
        this$0.f37200y.a(putExtra);
    }

    public static void e4(WsdMediaActivity this$0) {
        u.j(this$0, "this$0");
        WsdSetProgramConversation E3 = this$0.E3();
        if (E3 != null) {
            E3.V((short) 2);
        }
        WsdSetProgramConversation E32 = this$0.E3();
        if (E32 != null) {
            E32.O();
        }
    }

    public static void f4(WsdMediaActivity this$0) {
        u.j(this$0, "this$0");
        WsdSpotifyActivity.a aVar = WsdSpotifyActivity.f37250q;
        Device G3 = this$0.G3();
        aVar.getClass();
        this$0.f37199x.a(WsdSpotifyActivity.a.a(this$0, G3, this$0.f37198w, null));
    }

    public static final /* synthetic */ Intent h4(Context context, Device device) {
        return WsdSetProgramActivity.B3(context, WsdMediaActivity.class, device);
    }

    public static final void p4(WsdMediaActivity wsdMediaActivity) {
        WsdSetProgramConversation E3;
        WsdProgram F3 = wsdMediaActivity.F3();
        if (F3 != null && (E3 = wsdMediaActivity.E3()) != null) {
            E3.e0(F3, 1);
        }
    }

    public final void u4(VolumeSeekBar volumeSeekBar) {
        if (F3() != null) {
            WsdProgram F3 = F3();
            if (F3 != null && this.f37190o == null) {
                v4(volumeSeekBar, F3.i());
                return;
            }
            return;
        }
        volumeSeekBar.setProgress(volumeSeekBar.getMax() / 2);
    }

    private static void v4(VolumeSeekBar volumeSeekBar, int i11) {
        if (volumeSeekBar.getProgress() != i11) {
            ObjectAnimator ofInt = ObjectAnimator.ofInt(volumeSeekBar, "progress", volumeSeekBar.getProgress(), i11);
            ofInt.setDuration(300L);
            ofInt.setInterpolator(new DecelerateInterpolator());
            ofInt.start();
        }
    }

    private final void w4(int i11) {
        WsdSetProgramConversation E3;
        WsdProgram F3 = F3();
        if (F3 != null) {
            F3.F((short) i11);
        }
        this.f37190o = Integer.valueOf(i11);
        WsdProgram F32 = F3();
        if (F32 != null) {
            tn.b bVar = this.f37185j;
            if (bVar != null) {
                F32.F((short) bVar.f100297q.getProgress());
            } else {
                u.s("binding");
                throw null;
            }
        }
        WsdProgram F33 = F3();
        if (F33 != null && (E3 = E3()) != null) {
            E3.e0(F33, 1);
        }
    }

    private final void x4(WsdProgram wsdProgram) {
        boolean z5;
        P3(wsdProgram);
        for (WsdProgram wsdProgram2 : I3()) {
            if (wsdProgram2.d() == wsdProgram.d()) {
                z5 = true;
            } else {
                z5 = false;
            }
            wsdProgram2.B(z5);
        }
        WsdSetProgramConversation E3 = E3();
        if (E3 != null) {
            E3.e0(wsdProgram, 3);
        }
        y4();
    }

    public final void y4() {
        A4(this.f37188m);
        tn.b bVar = this.f37185j;
        if (bVar != null) {
            VolumeSeekBar volume = bVar.f100297q;
            u.i(volume, "volume");
            WsdProgram F3 = F3();
            u.g(F3);
            v4(volume, F3.i());
            if (this.f37191p == null) {
                WsdProgram F32 = F3();
                u.g(F32);
                if (F32.o()) {
                    tn.b bVar2 = this.f37185j;
                    if (bVar2 != null) {
                        bVar2.f100282b.setVisibility(0);
                        bVar2.f100283c.setVisibility(4);
                        bVar2.f100293m.setBackgroundColor(androidx.core.content.a.getColor(bVar2.a().getContext(), 0));
                        bVar2.f100292l.setBackgroundColor(-1);
                        bVar2.f100290j.setTextColor(-1);
                        bVar2.f100285e.setTextColor(-1);
                        bVar2.f100288h.setTextColor(-1);
                        int color = androidx.core.content.a.getColor(bVar2.a().getContext(), C1987R.color.statusInfo);
                        bVar2.f100289i.setTextColor(color);
                        bVar2.f100284d.setTextColor(color);
                        bVar2.f100287g.setTextColor(color);
                        return;
                    }
                    u.s("binding");
                    throw null;
                }
                tn.b bVar3 = this.f37185j;
                if (bVar3 != null) {
                    bVar3.f100282b.setVisibility(4);
                    bVar3.f100283c.setVisibility(0);
                    bVar3.f100293m.setBackgroundColor(-1);
                    bVar3.f100292l.setBackgroundColor(androidx.core.content.a.getColor(bVar3.a().getContext(), 0));
                    int color2 = androidx.core.content.a.getColor(bVar3.a().getContext(), C1987R.color.statusInfo);
                    bVar3.f100290j.setTextColor(color2);
                    bVar3.f100285e.setTextColor(color2);
                    bVar3.f100288h.setTextColor(color2);
                    bVar3.f100289i.setTextColor(-1);
                    bVar3.f100284d.setTextColor(-1);
                    bVar3.f100287g.setTextColor(-1);
                    return;
                }
                u.s("binding");
                throw null;
            }
            WsdProgram F33 = F3();
            u.g(F33);
            short d11 = F33.d();
            Integer num = this.f37191p;
            if (num != null && d11 == num.intValue()) {
                this.f37191p = null;
                return;
            }
            return;
        }
        u.s("binding");
        throw null;
    }

    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity
    public final short H3() {
        return this.f37198w;
    }

    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity
    public final void L3(u70.i iVar, WsdProgram programReceived) {
        u.j(programReceived, "programReceived");
        WsdProgram F3 = F3();
        if (F3 != null && programReceived.d() == F3.d()) {
            if (this.f37190o == null) {
                F3.F(programReceived.i());
            }
            if (this.f37190o == null) {
                tn.b bVar = this.f37185j;
                if (bVar != null) {
                    VolumeSeekBar volume = bVar.f100297q;
                    u.i(volume, "volume");
                    u4(volume);
                } else {
                    u.s("binding");
                    throw null;
                }
            }
            if (this.f37190o != null) {
                short i11 = programReceived.i();
                Integer num = this.f37190o;
                if (num != null && i11 == num.intValue()) {
                    this.f37190o = null;
                }
            }
        }
    }

    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity
    public final void M3(u70.i iVar, ArrayList arrayList) {
        String string;
        String string2;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            WsdProgram wsdProgram = (WsdProgram) it.next();
            tn.b bVar = this.f37185j;
            if (bVar != null) {
                if (wsdProgram.d() == 128) {
                    if (wsdProgram.o()) {
                        string = wsdProgram.h();
                    } else {
                        string = getString(C1987R.string._SPOTIFY_ADD_PLAYLIST_);
                    }
                    bVar.f100284d.setText(string);
                } else if (wsdProgram.d() == 129) {
                    if (wsdProgram.p()) {
                        string2 = wsdProgram.k();
                    } else {
                        string2 = getString(C1987R.string._WEBRADIO_ADD_);
                    }
                    bVar.f100285e.setText(string2);
                }
            } else {
                u.s("binding");
                throw null;
            }
        }
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
    public final void P0(WsdSetProgramConversation conversation, m mVar) {
        boolean z5;
        u.j(conversation, "conversation");
        if (mVar.b().status == 6) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f37188m = z5;
        BuildersKt__Builders_commonKt.launch$default(t.l(this), Dispatchers.getMain(), null, new b(null), 2, null);
        if (!this.f37187l) {
            conversation.O();
        }
        this.f37187l = true;
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
    public final void S1(WsdSetProgramConversation conversation, short s11) {
        boolean z5;
        u.j(conversation, "conversation");
        if (s11 != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (this.f37194s != null && u.e(Boolean.valueOf(z5), this.f37194s)) {
            this.f37194s = null;
        }
        this.f37192q = z5;
        BuildersKt__Builders_commonKt.launch$default(t.l(this), Dispatchers.getMain(), null, new com.withings.device.details.wsd.programs.media.a(this, null), 2, null);
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
            tn.b bVar = this.f37185j;
            if (bVar != null) {
                w4(bVar.f100297q.b());
                return true;
            }
            u.s("binding");
            throw null;
        } else if (action != 0) {
            return true;
        } else {
            tn.b bVar2 = this.f37185j;
            if (bVar2 != null) {
                w4(bVar2.f100297q.c());
                return true;
            }
            u.s("binding");
            throw null;
        }
    }

    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R3();
        tn.b b10 = tn.b.b(getLayoutInflater());
        this.f37185j = b10;
        setContentView(b10.a());
        z4(true);
        this.f37196u = new d(this.f37197v, 1000);
        tn.b bVar = this.f37185j;
        if (bVar != null) {
            bVar.f100296p.setNavigationIcon(2131231755);
            tn.b bVar2 = this.f37185j;
            if (bVar2 != null) {
                setSupportActionBar(bVar2.f100296p);
                ActionBar supportActionBar = getSupportActionBar();
                if (supportActionBar != null) {
                    supportActionBar.o(true);
                }
                tn.b bVar3 = this.f37185j;
                if (bVar3 != null) {
                    bVar3.f100297q.setOnSeekBarChangeListener(this.A);
                    bVar3.f100295o.setOnClickListener(new z(this, 1));
                    bVar3.f100293m.setOnClickListener(new sg.b(this, 2));
                    bVar3.f100292l.setOnClickListener(new c(this, 3));
                    bVar3.f100287g.setOnClickListener(new sg.d(this, 2));
                    bVar3.f100288h.setOnClickListener(new q(this, 2));
                    bVar3.f100291k.setOnClickListener(new j(this, 1));
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: wn.a
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z5) {
                            WsdMediaActivity.W3(WsdMediaActivity.this, z5);
                        }
                    };
                    SwitchMaterial switchMaterial = bVar3.f100286f;
                    switchMaterial.setOnCheckedChangeListener(onCheckedChangeListener);
                    switchMaterial.setOnLongClickListener(new View.OnLongClickListener() { // from class: wn.b
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view) {
                            WsdMediaActivity.e4(WsdMediaActivity.this);
                            return true;
                        }
                    });
                    bVar3.f100298r.setOnLongClickListener(new View.OnLongClickListener() { // from class: wn.c
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view) {
                            WsdMediaActivity.c4(WsdMediaActivity.this);
                            return true;
                        }
                    });
                    return;
                }
                u.s("binding");
                throw null;
            }
            u.s("binding");
            throw null;
        }
        u.s("binding");
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

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        d dVar = this.f37196u;
        if (dVar != null) {
            dVar.f();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i11, String[] permissions, int[] grantResults) {
        boolean z5;
        u.j(permissions, "permissions");
        u.j(grantResults, "grantResults");
        super.onRequestPermissionsResult(i11, permissions, grantResults);
        if (i11 == 44) {
            if (grantResults.length == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((!z5) && grantResults[0] == 0) {
                Device device = G3();
                WsdProgram F3 = F3();
                u.j(device, "device");
                Intent putExtra = new Intent(this, WsdWebRadioActivity.class).putExtra("device", device).putExtra("current_program", F3).putExtra("program_type", (int) this.f37198w).putExtra("alarm", (Parcelable) null);
                u.i(putExtra, "putExtra(...)");
                this.f37200y.a(putExtra);
            }
        }
    }

    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        WsdSetProgramConversation E3 = E3();
        if (E3 != null) {
            E3.U(this);
        }
        d dVar = this.f37196u;
        if (dVar != null) {
            dVar.e();
        }
    }

    public final void z4(boolean z5) {
        this.f37188m = z5;
        if (this.f37189n != null && u.e(Boolean.valueOf(z5), this.f37189n)) {
            this.f37189n = null;
        }
        A4(this.f37188m);
    }

    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity
    public final void N3(qj.l lVar) {
    }
}
