package com.withings.device.details.wsd.programs.alarm;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.internal.s2;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.withings.alarm.model.DeviceAlarm;
import com.withings.alarm.model.WsdProgram;
import com.withings.device.details.wsd.conversation.WsdSetProgramConversation;
import com.withings.device.details.wsd.programs.WsdSetProgramActivity;
import com.withings.device.details.wsd.programs.alarm.WsdSetAlarmFragment;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import kotlin.Metadata;
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
import ym0.p;
/* compiled from: WsdSetAlarmActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/device/details/wsd/programs/alarm/WsdSetAlarmActivity;", "Lcom/withings/device/details/wsd/programs/WsdSetProgramActivity;", "Lcom/withings/device/details/wsd/programs/alarm/WsdSetAlarmFragment$a;", "<init>", "()V", "device-details-wsd_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class WsdSetAlarmActivity extends WsdSetProgramActivity implements WsdSetAlarmFragment.a {

    /* renamed from: j  reason: collision with root package name */
    private tn.d f37141j;

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f37142k = nm0.h.b(new a());

    /* renamed from: l  reason: collision with root package name */
    private DeviceAlarm f37143l;

    /* renamed from: m  reason: collision with root package name */
    private DeviceAlarm f37144m;

    /* compiled from: WsdSetAlarmActivity.kt */
    /* loaded from: classes3.dex */
    static final class a extends w implements ym0.a<WsdSetAlarmFragment> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final WsdSetAlarmFragment invoke() {
            Fragment Y = WsdSetAlarmActivity.this.getSupportFragmentManager().Y("set_alarm_fragment");
            u.h(Y, "null cannot be cast to non-null type com.withings.device.details.wsd.programs.alarm.WsdSetAlarmFragment");
            return (WsdSetAlarmFragment) Y;
        }
    }

    /* compiled from: WsdSetAlarmActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.wsd.programs.alarm.WsdSetAlarmActivity$statusReceived$1", f = "WsdSetAlarmActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {
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
            WsdSetAlarmActivity.this.K3();
            return y.f85009a;
        }
    }

    public static void U3(WsdSetAlarmActivity this$0) {
        u.j(this$0, "this$0");
        this$0.setResult(0);
        this$0.z3();
    }

    public static void V3(WsdSetAlarmActivity this$0, boolean z5) {
        u.j(this$0, "this$0");
        DeviceAlarm deviceAlarm = this$0.f37143l;
        if (deviceAlarm != null) {
            deviceAlarm.K(z5);
            DeviceAlarm deviceAlarm2 = this$0.f37143l;
            if (deviceAlarm2 != null) {
                this$0.f37143l = deviceAlarm2;
                return;
            } else {
                u.s("alarm");
                throw null;
            }
        }
        u.s("alarm");
        throw null;
    }

    private final WsdSetAlarmFragment Y3() {
        return (WsdSetAlarmFragment) this.f37142k.getValue();
    }

    private final void Z3() {
        DeviceAlarm deviceAlarm = this.f37143l;
        if (deviceAlarm != null) {
            if (!u.e(deviceAlarm, this.f37144m)) {
                qc.b bVar = new qc.b(this);
                bVar.g(C1987R.string._DISCARD_CHANGES_);
                bVar.z(C1987R.string._OK_, new vn.c(this, 0)).w(C1987R.string._CANCEL_, null).s();
                return;
            }
            setResult(0);
            z3();
            return;
        }
        u.s("alarm");
        throw null;
    }

    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity
    public final short H3() {
        return (short) 4;
    }

    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity
    public final void J3(Intent intent) {
        super.J3(intent);
        WsdProgram F3 = F3();
        if (F3 != null) {
            DeviceAlarm deviceAlarm = this.f37143l;
            if (deviceAlarm != null) {
                deviceAlarm.l0(F3.d());
            } else {
                u.s("alarm");
                throw null;
            }
        }
        Y3().C1(F3());
        DeviceAlarm deviceAlarm2 = this.f37143l;
        if (deviceAlarm2 != null) {
            this.f37143l = deviceAlarm2;
        } else {
            u.s("alarm");
            throw null;
        }
    }

    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity
    public final void L3(u70.i iVar, WsdProgram programReceived) {
        u.j(programReceived, "programReceived");
    }

    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity
    public final void M3(u70.i iVar, ArrayList arrayList) {
        Y3().C1(F3());
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
    public final void P0(WsdSetProgramConversation conversation, m mVar) {
        u.j(conversation, "conversation");
        BuildersKt__Builders_commonKt.launch$default(t.l(this), Dispatchers.getMain(), null, new b(null), 2, null);
    }

    @Override // com.withings.device.details.wsd.programs.alarm.WsdSetAlarmFragment.a
    public final void R2(DeviceAlarm alarmDevice) {
        u.j(alarmDevice, "alarmDevice");
        this.f37143l = alarmDevice;
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
    public final void S1(WsdSetProgramConversation conversation, short s11) {
        u.j(conversation, "conversation");
    }

    @Override // com.withings.device.details.wsd.programs.alarm.WsdSetAlarmFragment.a
    public final void Z2(WsdSetAlarmFragment fragment) {
        WsdSetProgramConversation E3;
        WsdSetProgramConversation E32;
        u.j(fragment, "fragment");
        PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("wsdAlarmTutorial", false).apply();
        DeviceAlarm deviceAlarm = this.f37143l;
        if (deviceAlarm != null) {
            if (deviceAlarm.j() > 0 && (E32 = E3()) != null) {
                DeviceAlarm deviceAlarm2 = this.f37143l;
                if (deviceAlarm2 != null) {
                    E32.d0(deviceAlarm2, 0);
                } else {
                    u.s("alarm");
                    throw null;
                }
            }
            if (!D3() && (E3 = E3()) != null) {
                E3.a0();
            }
            Intent intent = new Intent();
            DeviceAlarm deviceAlarm3 = this.f37143l;
            if (deviceAlarm3 != null) {
                intent.putExtra("alarm", deviceAlarm3);
                intent.putParcelableArrayListExtra("programs", new ArrayList<>(I3()));
                setResult(-1, intent);
                rg.b b10 = rg.b.b();
                DeviceAlarm deviceAlarm4 = this.f37143l;
                if (deviceAlarm4 != null) {
                    b10.getClass();
                    rg.b.i(this, deviceAlarm4);
                    finish();
                    return;
                }
                u.s("alarm");
                throw null;
            }
            u.s("alarm");
            throw null;
        }
        u.s("alarm");
        throw null;
    }

    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Z3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object parcelableExtra;
        super.onCreate(bundle);
        Intent intent = getIntent();
        u.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("alarm", DeviceAlarm.class);
        } else {
            parcelableExtra = intent.getParcelableExtra("alarm");
        }
        u.g(parcelableExtra);
        this.f37143l = (DeviceAlarm) parcelableExtra;
        View inflate = getLayoutInflater().inflate(C1987R.layout.activity_wsd_set_alarm, (ViewGroup) null, false);
        LinearLayout linearLayout = (LinearLayout) inflate;
        int i11 = C1987R.id.set_alarm_fragment;
        if (((FragmentContainerView) s2.g(inflate, C1987R.id.set_alarm_fragment)) != null) {
            i11 = C1987R.id.toolbar;
            Toolbar toolbar = (Toolbar) s2.g(inflate, C1987R.id.toolbar);
            if (toolbar != null) {
                tn.d dVar = new tn.d(linearLayout, toolbar);
                this.f37141j = dVar;
                setContentView(dVar.a());
                tn.d dVar2 = this.f37141j;
                if (dVar2 != null) {
                    setSupportActionBar((Toolbar) dVar2.f100305b);
                    ActionBar supportActionBar = getSupportActionBar();
                    if (supportActionBar != null) {
                        supportActionBar.o(true);
                    }
                    int w11 = ah.u.w(C1987R.attr.colorOnSurface, this, -65281);
                    tn.d dVar3 = this.f37141j;
                    if (dVar3 != null) {
                        ((Toolbar) dVar3.f100305b).setNavigationIcon(y70.a.c(C1987R.drawable.icon_medium_navigation_close, this, w11));
                        boolean z5 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("wsdAlarmTutorial", true);
                        DeviceAlarm deviceAlarm = this.f37143l;
                        if (deviceAlarm != null) {
                            this.f37144m = deviceAlarm.a();
                            if (z5) {
                                DeviceAlarm deviceAlarm2 = this.f37143l;
                                if (deviceAlarm2 != null) {
                                    deviceAlarm2.p0(0);
                                } else {
                                    u.s("alarm");
                                    throw null;
                                }
                            }
                            WsdSetAlarmFragment Y3 = Y3();
                            DeviceAlarm deviceAlarm3 = this.f37143l;
                            if (deviceAlarm3 != null) {
                                Y3.D1(deviceAlarm3);
                                Y3().B1(this);
                                Y3().y1();
                                Y3().E1();
                                if (z5) {
                                    Y3().H1();
                                }
                                if (I3().isEmpty()) {
                                    R3();
                                }
                                WsdSetProgramConversation E3 = E3();
                                if (E3 != null) {
                                    E3.Q((short) 4);
                                    return;
                                }
                                return;
                            }
                            u.s("alarm");
                            throw null;
                        }
                        u.s("alarm");
                        throw null;
                    }
                    u.s("binding");
                    throw null;
                }
                u.s("binding");
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        SwitchMaterial switchMaterial;
        u.j(menu, "menu");
        getMenuInflater().inflate(C1987R.menu.menu_hwa_alarm, menu);
        MenuItem findItem = menu.findItem(C1987R.id.alarm_switch);
        findItem.setVisible(false);
        DeviceAlarm deviceAlarm = this.f37143l;
        if (deviceAlarm != null) {
            findItem.setChecked(deviceAlarm.B());
            View actionView = findItem.getActionView();
            if (actionView != null) {
                switchMaterial = (SwitchMaterial) actionView.findViewById(C1987R.id.toolbar_switch);
            } else {
                switchMaterial = null;
            }
            if (!(switchMaterial instanceof SwitchMaterial)) {
                switchMaterial = null;
            }
            if (switchMaterial != null) {
                DeviceAlarm deviceAlarm2 = this.f37143l;
                if (deviceAlarm2 != null) {
                    switchMaterial.setChecked(deviceAlarm2.B());
                    switchMaterial.setOnCheckedChangeListener(new vn.b(this, 0));
                } else {
                    u.s("alarm");
                    throw null;
                }
            }
            return super.onCreateOptionsMenu(menu);
        }
        u.s("alarm");
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            Z3();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.withings.device.details.wsd.programs.alarm.WsdSetAlarmFragment.a
    public final void p2(WsdSetAlarmFragment fragment) {
        u.j(fragment, "fragment");
        T3((short) 4);
    }

    @Override // com.withings.device.details.wsd.programs.WsdSetProgramActivity
    public final void N3(qj.l lVar) {
    }
}
