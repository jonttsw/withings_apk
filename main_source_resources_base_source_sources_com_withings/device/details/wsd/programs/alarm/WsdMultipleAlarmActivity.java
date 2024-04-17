package com.withings.device.details.wsd.programs.alarm;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.u0;
import androidx.fragment.app.Fragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.withings.alarm.model.DeviceAlarm;
import com.withings.alarm.model.WsdProgram;
import com.withings.alarm.ui.n;
import com.withings.comm.wpp.generated.object.AlarmEnabled;
import com.withings.device.Device;
import com.withings.device.details.wsd.conversation.WsdSetProgramConversation;
import com.withings.device.details.wsd.programs.WsdProgramActivity;
import com.withings.device.details.wsd.programs.WsdSetProgramActivity;
import com.withings.device.details.wsd.programs.nap.WsdSleepNapActivity;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import m0.t;
import nm0.l;
import nm0.y;
import qj.m;
import rg.b;
import ym0.p;
/* compiled from: WsdMultipleAlarmActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withings/device/details/wsd/programs/alarm/WsdMultipleAlarmActivity;", "Lcom/withings/device/details/wsd/programs/WsdSetProgramActivity;", "Lcom/withings/alarm/ui/n$b;", "Lrg/b$a;", "<init>", "()V", "device-details-wsd_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class WsdMultipleAlarmActivity extends WsdSetProgramActivity implements n.b, b.a {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f37121w = 0;

    /* renamed from: l  reason: collision with root package name */
    private WsdMultipleAlarmFragment f37124l;

    /* renamed from: n  reason: collision with root package name */
    private boolean f37126n;

    /* renamed from: o  reason: collision with root package name */
    private u70.d f37127o;

    /* renamed from: p  reason: collision with root package name */
    private TextView f37128p;

    /* renamed from: q  reason: collision with root package name */
    private TextView f37129q;

    /* renamed from: r  reason: collision with root package name */
    private View f37130r;

    /* renamed from: s  reason: collision with root package name */
    private View f37131s;

    /* renamed from: t  reason: collision with root package name */
    private FloatingActionButton f37132t;

    /* renamed from: j  reason: collision with root package name */
    private final short f37122j = 4;

    /* renamed from: k  reason: collision with root package name */
    private boolean f37123k = true;

    /* renamed from: m  reason: collision with root package name */
    private ArrayList f37125m = new ArrayList();

    /* renamed from: u  reason: collision with root package name */
    private final nm0.g f37133u = nm0.h.b(a.f37135a);

    /* renamed from: v  reason: collision with root package name */
    private final androidx.appcompat.app.e f37134v = new androidx.appcompat.app.e(this, 2);

    /* compiled from: WsdMultipleAlarmActivity.kt */
    /* loaded from: classes3.dex */
    static final class a extends w implements ym0.a<rg.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f37135a = new w(0);

        @Override // ym0.a
        public final rg.b invoke() {
            return rg.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WsdMultipleAlarmActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.wsd.programs.alarm.WsdMultipleAlarmActivity$loadDatas$1", f = "WsdMultipleAlarmActivity.kt", l = {124}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f37136a;

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
            int i11 = this.f37136a;
            WsdMultipleAlarmActivity wsdMultipleAlarmActivity = WsdMultipleAlarmActivity.this;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                this.f37136a = 1;
                obj = WsdMultipleAlarmActivity.Y3(wsdMultipleAlarmActivity, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            WsdMultipleAlarmActivity.i4(wsdMultipleAlarmActivity, (List) obj);
            return y.f85009a;
        }
    }

    /* compiled from: WsdMultipleAlarmActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.wsd.programs.alarm.WsdMultipleAlarmActivity$statusReceived$1", f = "WsdMultipleAlarmActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f37138a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WsdMultipleAlarmActivity f37139b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(m mVar, WsdMultipleAlarmActivity wsdMultipleAlarmActivity, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f37138a = mVar;
            this.f37139b = wsdMultipleAlarmActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new c(this.f37138a, this.f37139b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z5;
            int i11;
            int i12;
            WsdMultipleAlarmFragment wsdMultipleAlarmFragment;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            m mVar = this.f37138a;
            short s11 = mVar.b().status;
            int i13 = 0;
            WsdMultipleAlarmActivity wsdMultipleAlarmActivity = this.f37139b;
            if (s11 == 2 && (!wsdMultipleAlarmActivity.f37125m.isEmpty())) {
                int i14 = WsdSleepNapActivity.M;
                wsdMultipleAlarmActivity.startActivity(WsdSleepNapActivity.a.a(wsdMultipleAlarmActivity, wsdMultipleAlarmActivity.G3(), wsdMultipleAlarmActivity.f37125m, false));
                wsdMultipleAlarmActivity.z3();
            }
            AlarmEnabled a11 = mVar.a();
            u.i(a11, "getAlarmEnabled(...)");
            if (!wsdMultipleAlarmActivity.f37125m.isEmpty()) {
                boolean z11 = wsdMultipleAlarmActivity.f37123k;
                if (a11.state == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                wsdMultipleAlarmActivity.f37123k = z5;
                if (z11 != wsdMultipleAlarmActivity.f37123k) {
                    BuildersKt__Builders_commonKt.launch$default(t.l(wsdMultipleAlarmActivity), Dispatchers.getIO(), null, new com.withings.device.details.wsd.programs.alarm.c(wsdMultipleAlarmActivity, null), 2, null);
                }
                if (wsdMultipleAlarmActivity.f37125m.size() > 1) {
                    TextView textView = wsdMultipleAlarmActivity.f37128p;
                    if (textView != null) {
                        textView.setText(C1987R.string._ALARMS_SWITCH_CONTENT_PLURAL_);
                        TextView textView2 = wsdMultipleAlarmActivity.f37129q;
                        if (textView2 != null) {
                            textView2.setText(C1987R.string._ALARMS_SWITCH_TITLE_PLURAL_);
                        } else {
                            u.s("globalSwitchTitle");
                            throw null;
                        }
                    } else {
                        u.s("globalSwitchContent");
                        throw null;
                    }
                } else {
                    TextView textView3 = wsdMultipleAlarmActivity.f37128p;
                    if (textView3 != null) {
                        textView3.setText(C1987R.string._ALARMS_SWITCH_CONTENT_SINGLE_);
                        TextView textView4 = wsdMultipleAlarmActivity.f37129q;
                        if (textView4 != null) {
                            textView4.setText(C1987R.string._ALARMS_SWITCH_TITLE_SINGLE_);
                        } else {
                            u.s("globalSwitchTitle");
                            throw null;
                        }
                    } else {
                        u.s("globalSwitchContent");
                        throw null;
                    }
                }
                View view = wsdMultipleAlarmActivity.f37130r;
                if (view != null) {
                    if (!wsdMultipleAlarmActivity.f37123k) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    view.setVisibility(i11);
                    FloatingActionButton floatingActionButton = wsdMultipleAlarmActivity.f37132t;
                    if (floatingActionButton != null) {
                        if (wsdMultipleAlarmActivity.f37123k) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        floatingActionButton.setVisibility(i12);
                        View view2 = wsdMultipleAlarmActivity.f37131s;
                        if (view2 != null) {
                            if (!(!wsdMultipleAlarmActivity.f37123k)) {
                                i13 = 8;
                            }
                            view2.setVisibility(i13);
                            if (!wsdMultipleAlarmActivity.f37123k && (wsdMultipleAlarmFragment = wsdMultipleAlarmActivity.f37124l) != null) {
                                wsdMultipleAlarmFragment.x1();
                            }
                        } else {
                            u.s("fadeLayout");
                            throw null;
                        }
                    } else {
                        u.s("fab");
                        throw null;
                    }
                } else {
                    u.s("globalSwitchLayout");
                    throw null;
                }
            }
            return y.f85009a;
        }
    }

    public static void U3(WsdMultipleAlarmActivity this$0, DeviceAlarm deviceAlarm) {
        u.j(this$0, "this$0");
        u.j(deviceAlarm, "$deviceAlarm");
        ArrayList arrayList = this$0.f37125m;
        arrayList.remove(deviceAlarm);
        this$0.o4();
        WsdMultipleAlarmFragment wsdMultipleAlarmFragment = this$0.f37124l;
        if (wsdMultipleAlarmFragment != null) {
            wsdMultipleAlarmFragment.u1(deviceAlarm);
        }
        if (arrayList.isEmpty()) {
            this$0.z3();
        }
    }

    public static void V3(WsdMultipleAlarmActivity this$0) {
        Object obj;
        cj.b x11;
        u.j(this$0, "this$0");
        WsdSetProgramConversation E3 = this$0.E3();
        if (E3 != null && (x11 = E3.x()) != null) {
            obj = x11.e();
        } else {
            obj = null;
        }
        u.h(obj, "null cannot be cast to non-null type com.withings.alarm.MaxNumberOfAlarmsHolder");
        if (this$0.f37125m.size() >= ((pg.f) obj).d()) {
            qc.b bVar = new qc.b(this$0);
            bVar.C(C1987R.string._ALARMS_MAX_NUM_REACHED_TITLE_);
            bVar.g(C1987R.string._ALARMS_MAX_NUM_REACHED_MSG_);
            qc.b z5 = bVar.z(C1987R.string._OK_, null);
            z5.t(true);
            z5.s();
            return;
        }
        this$0.k4();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Y3(com.withings.device.details.wsd.programs.alarm.WsdMultipleAlarmActivity r5, qm0.d r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof com.withings.device.details.wsd.programs.alarm.a
            if (r0 == 0) goto L16
            r0 = r6
            com.withings.device.details.wsd.programs.alarm.a r0 = (com.withings.device.details.wsd.programs.alarm.a) r0
            int r1 = r0.f37156c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f37156c = r1
            goto L1b
        L16:
            com.withings.device.details.wsd.programs.alarm.a r0 = new com.withings.device.details.wsd.programs.alarm.a
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f37154a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f37156c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r6)
            goto L48
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            nm0.l.b(r6)
            kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.device.details.wsd.programs.alarm.b r2 = new com.withings.device.details.wsd.programs.alarm.b
            r4 = 0
            r2.<init>(r5, r4)
            r0.f37156c = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r6 != r1) goto L48
            goto L4e
        L48:
            java.lang.String r5 = "withContext(...)"
            kotlin.jvm.internal.u.i(r6, r5)
            r1 = r6
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.device.details.wsd.programs.alarm.WsdMultipleAlarmActivity.Y3(com.withings.device.details.wsd.programs.alarm.WsdMultipleAlarmActivity, qm0.d):java.lang.Object");
    }

    public static final void i4(WsdMultipleAlarmActivity wsdMultipleAlarmActivity, List list) {
        ArrayList arrayList = wsdMultipleAlarmActivity.f37125m;
        arrayList.clear();
        arrayList.addAll(list);
        if (list.isEmpty()) {
            wsdMultipleAlarmActivity.k4();
        }
        WsdMultipleAlarmFragment wsdMultipleAlarmFragment = wsdMultipleAlarmActivity.f37124l;
        if (wsdMultipleAlarmFragment != null) {
            wsdMultipleAlarmFragment.v1(arrayList, false, false, false);
        }
        if (wsdMultipleAlarmActivity.f37126n) {
            wsdMultipleAlarmActivity.K3();
        }
    }

    private final void k4() {
        Intent C3;
        DeviceAlarm deviceAlarm = new DeviceAlarm();
        deviceAlarm.A(G3().getId());
        Device device = G3();
        List<WsdProgram> programs = I3();
        u.j(device, "device");
        u.j(programs, "programs");
        C3 = WsdSetProgramActivity.C3(this, WsdSetAlarmActivity.class, device);
        Intent putExtra = C3.putParcelableArrayListExtra("programs", new ArrayList<>(programs)).putExtra("alarm", deviceAlarm);
        u.i(putExtra, "putExtra(...)");
        startActivityForResult(putExtra, 30);
    }

    private final void l4() {
        if (D3()) {
            Intent intent = new Intent();
            m4();
            intent.putExtra("alarm", rg.b.e(this.f37125m, false));
            setResult(-1, intent);
            finish();
            return;
        }
        z3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rg.b m4() {
        Object value = this.f37133u.getValue();
        u.i(value, "getValue(...)");
        return (rg.b) value;
    }

    private final void n4() {
        if (!I3().isEmpty()) {
            BuildersKt__Builders_commonKt.launch$default(t.l(this), null, null, new b(null), 3, null);
        }
    }

    private final void o4() {
        ArrayList arrayList = this.f37125m;
        ArrayList arrayList2 = new ArrayList(x.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(qg.e.b((DeviceAlarm) it.next(), 3, 1, 2, 4, 8, 6, 7));
        }
        WsdSetProgramConversation E3 = E3();
        if (E3 != null) {
            E3.W(arrayList2);
        }
    }

    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity
    public final short H3() {
        return this.f37122j;
    }

    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity
    public final void L3(u70.i iVar, WsdProgram programReceived) {
        u.j(programReceived, "programReceived");
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
    public final void P0(WsdSetProgramConversation conversation, m mVar) {
        u.j(conversation, "conversation");
        BuildersKt__Builders_commonKt.launch$default(t.l(this), Dispatchers.getMain(), null, new c(mVar, this, null), 2, null);
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
    public final void S1(WsdSetProgramConversation conversation, short s11) {
        u.j(conversation, "conversation");
    }

    @Override // com.withings.alarm.ui.n.b
    public final void U0(n multipleAlarmFragment, DeviceAlarm deviceAlarm) {
        u.j(multipleAlarmFragment, "multipleAlarmFragment");
        u.j(deviceAlarm, "deviceAlarm");
        WsdSetProgramConversation E3 = E3();
        if (E3 != null) {
            E3.d0(deviceAlarm, 0);
        }
    }

    @Override // com.withings.alarm.ui.n.b
    public final void V0(n multipleAlarmFragment, DeviceAlarm deviceAlarm) {
        u.j(multipleAlarmFragment, "multipleAlarmFragment");
        u.j(deviceAlarm, "deviceAlarm");
        WsdProgramActivity.a aVar = WsdProgramActivity.f37077s;
        Device G3 = G3();
        List<WsdProgram> I3 = I3();
        WsdProgram F3 = F3();
        u.g(F3);
        aVar.getClass();
        startActivityForResult(WsdProgramActivity.a.a(this, G3, I3, F3, (short) 4, deviceAlarm), 20);
    }

    @Override // com.withings.alarm.ui.n.b
    public final void W0(n multipleAlarmFragment, DeviceAlarm deviceAlarm) {
        Intent C3;
        u.j(multipleAlarmFragment, "multipleAlarmFragment");
        u.j(deviceAlarm, "deviceAlarm");
        Device device = G3();
        List<WsdProgram> programs = I3();
        u.j(device, "device");
        u.j(programs, "programs");
        C3 = WsdSetProgramActivity.C3(this, WsdSetAlarmActivity.class, device);
        Intent putExtra = C3.putParcelableArrayListExtra("programs", new ArrayList<>(programs)).putExtra("alarm", deviceAlarm);
        u.i(putExtra, "putExtra(...)");
        startActivityForResult(putExtra, 10);
    }

    @Override // rg.b.a
    public final void d0(Context context, Device device) {
        this.f37126n = true;
        n4();
    }

    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity, com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
    public final void f1(WsdSetProgramConversation conversation, ArrayList arrayList) {
        u.j(conversation, "conversation");
        super.f1(conversation, arrayList);
        n4();
    }

    @Override // com.withings.alarm.ui.n.b
    public final void f3(n multipleAlarmFragment, DeviceAlarm deviceAlarm) {
        u.j(multipleAlarmFragment, "multipleAlarmFragment");
        u.j(deviceAlarm, "deviceAlarm");
        qc.b bVar = new qc.b(this);
        bVar.g(C1987R.string._ALARMS_DELETE_CONFIRMATION_);
        bVar.z(C1987R.string._OK_, new vn.a(0, this, deviceAlarm)).w(C1987R.string._CANCEL_, null).s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        DeviceAlarm deviceAlarm;
        Object parcelableExtra;
        super.onActivityResult(i11, i12, intent);
        WsdSetProgramConversation E3 = E3();
        if (E3 != null) {
            E3.U(this);
        }
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = intent.getParcelableExtra("alarm", DeviceAlarm.class);
            } else {
                parcelableExtra = intent.getParcelableExtra("alarm");
            }
            deviceAlarm = (DeviceAlarm) parcelableExtra;
        } else {
            deviceAlarm = null;
        }
        if (i11 != 10) {
            if (i11 != 20) {
                if (i11 == 30) {
                    if (deviceAlarm != null) {
                        ArrayList arrayList = this.f37125m;
                        arrayList.add(deviceAlarm);
                        deviceAlarm.Y((short) arrayList.size());
                        WsdMultipleAlarmFragment wsdMultipleAlarmFragment = this.f37124l;
                        if (wsdMultipleAlarmFragment != null) {
                            wsdMultipleAlarmFragment.t1(deviceAlarm);
                        }
                        o4();
                        m4();
                        rg.b.i(this, deviceAlarm);
                        return;
                    }
                    z3();
                    return;
                }
                return;
            }
            J3(intent);
            n4();
            return;
        }
        n4();
    }

    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        l4();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_wsd_multiple_alarm);
        View findViewById = findViewById(C1987R.id.global_switch_content);
        u.i(findViewById, "findViewById(...)");
        this.f37128p = (TextView) findViewById;
        View findViewById2 = findViewById(C1987R.id.global_switch_title);
        u.i(findViewById2, "findViewById(...)");
        this.f37129q = (TextView) findViewById2;
        View findViewById3 = findViewById(C1987R.id.fab_add_alarm);
        u.i(findViewById3, "findViewById(...)");
        this.f37132t = (FloatingActionButton) findViewById3;
        View findViewById4 = findViewById(C1987R.id.global_switch_layout);
        u.i(findViewById4, "findViewById(...)");
        this.f37130r = findViewById4;
        View findViewById5 = findViewById(C1987R.id.fade_layout);
        u.i(findViewById5, "findViewById(...)");
        this.f37131s = findViewById5;
        findViewById(C1987R.id.activate_global_switch).setOnClickListener(new androidx.media3.ui.i(this, 2));
        FloatingActionButton floatingActionButton = this.f37132t;
        if (floatingActionButton != null) {
            floatingActionButton.setOnClickListener(new com.google.android.material.search.j(this, 2));
            R3();
            if (D3()) {
                this.f37126n = true;
                WsdSetProgramConversation E3 = E3();
                if (E3 != null) {
                    E3.U(this);
                }
                WsdSetProgramConversation E32 = E3();
                if (E32 != null) {
                    E32.Q((short) 4);
                }
            }
            Fragment Y = getSupportFragmentManager().Y("multiple_alarm_fragment");
            u.h(Y, "null cannot be cast to non-null type com.withings.device.details.wsd.programs.alarm.WsdMultipleAlarmFragment");
            WsdMultipleAlarmFragment wsdMultipleAlarmFragment = (WsdMultipleAlarmFragment) Y;
            wsdMultipleAlarmFragment.w1(this);
            this.f37124l = wsdMultipleAlarmFragment;
            this.f37127o = new u70.d(this.f37134v, 3000);
            setSupportActionBar((Toolbar) findViewById(C1987R.id.toolbar));
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.o(true);
            }
            FloatingActionButton floatingActionButton2 = this.f37132t;
            if (floatingActionButton2 != null) {
                u0.j0(floatingActionButton2, ah.g.k(8, this));
                return;
            } else {
                u.s("fab");
                throw null;
            }
        }
        u.s("fab");
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            l4();
        }
        return super.onOptionsItemSelected(item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        m4().j(this);
        u70.d dVar = this.f37127o;
        u.g(dVar);
        dVar.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        m4().g(this);
        u70.d dVar = this.f37127o;
        u.g(dVar);
        dVar.e();
    }

    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity
    public final void N3(qj.l lVar) {
    }

    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity
    public final void M3(u70.i iVar, ArrayList arrayList) {
    }
}
