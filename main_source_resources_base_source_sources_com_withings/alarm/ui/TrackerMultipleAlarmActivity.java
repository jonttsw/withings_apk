package com.withings.alarm.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.u0;
import com.withings.alarm.conversation.TrackerSetAlarmsConversation;
import com.withings.alarm.model.DeviceAlarm;
import com.withings.alarm.ui.TrackerMultipleAlarmActivity;
import com.withings.alarm.ui.n;
import com.withings.device.Device;
import com.withings.util.log.Fail;
import com.withings.wiscale2.C1987R;
import e0.a0;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class TrackerMultipleAlarmActivity extends TrackerSetAlarmAbstractActivity implements n.b {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f31120o = 0;

    /* renamed from: g  reason: collision with root package name */
    private View f31121g;

    /* renamed from: h  reason: collision with root package name */
    private View f31122h;

    /* renamed from: i  reason: collision with root package name */
    private View f31123i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f31124j;

    /* renamed from: k  reason: collision with root package name */
    private TrackerMultipleAlarmFragment f31125k;

    /* renamed from: l  reason: collision with root package name */
    private List<DeviceAlarm> f31126l;

    /* renamed from: m  reason: collision with root package name */
    private u70.d f31127m;

    /* renamed from: n  reason: collision with root package name */
    private final a0 f31128n = new a0(this, 2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class a extends pm.h<List<DeviceAlarm>> {
        a() {
        }

        @Override // vh.m.b
        public final void onResult(Object obj) {
            TrackerMultipleAlarmActivity.N3(TrackerMultipleAlarmActivity.this, (List) obj);
        }
    }

    public static void K3(TrackerMultipleAlarmActivity trackerMultipleAlarmActivity) {
        if (trackerMultipleAlarmActivity.f31126l.size() >= trackerMultipleAlarmActivity.D3()) {
            qc.b bVar = new qc.b(trackerMultipleAlarmActivity);
            bVar.C(C1987R.string._ALARMS_MAX_NUM_REACHED_TITLE_);
            bVar.g(C1987R.string._ALARMS_MAX_NUM_REACHED_MSG_);
            qc.b z5 = bVar.z(C1987R.string._OK_, null);
            z5.t(true);
            z5.s();
            return;
        }
        trackerMultipleAlarmActivity.O3();
    }

    public static void L3(TrackerMultipleAlarmActivity trackerMultipleAlarmActivity, DeviceAlarm deviceAlarm) {
        trackerMultipleAlarmActivity.f31126l.remove(deviceAlarm);
        int i11 = 0;
        while (i11 < trackerMultipleAlarmActivity.f31126l.size()) {
            i11++;
            trackerMultipleAlarmActivity.f31126l.get(i11).Y((short) i11);
        }
        trackerMultipleAlarmActivity.B3().Q(deviceAlarm, trackerMultipleAlarmActivity.f31126l);
        trackerMultipleAlarmActivity.f31125k.u1(deviceAlarm);
    }

    static void N3(TrackerMultipleAlarmActivity trackerMultipleAlarmActivity, List list) {
        boolean z5;
        boolean z11;
        DeviceAlarm deviceAlarm;
        boolean z12 = false;
        if (trackerMultipleAlarmActivity.D3() < 2) {
            if (list.isEmpty()) {
                deviceAlarm = new DeviceAlarm();
                deviceAlarm.A(trackerMultipleAlarmActivity.C3().getId());
            } else {
                deviceAlarm = (DeviceAlarm) list.get(0);
            }
            trackerMultipleAlarmActivity.H3(null);
            trackerMultipleAlarmActivity.startActivity(TrackerSetAlarmActivity.O3(trackerMultipleAlarmActivity, trackerMultipleAlarmActivity.C3(), deviceAlarm, false));
            trackerMultipleAlarmActivity.finish();
            return;
        }
        trackerMultipleAlarmActivity.f31121g.setVisibility(0);
        trackerMultipleAlarmActivity.f31126l = list;
        if (list.size() == 0) {
            trackerMultipleAlarmActivity.O3();
        }
        Object e11 = trackerMultipleAlarmActivity.B3().x().e();
        if (e11 instanceof pg.e) {
            pg.e eVar = (pg.e) e11;
            Boolean bool = Boolean.TRUE;
            z12 = bool.equals(eVar.i());
            z11 = bool.equals(eVar.a());
            z5 = bool.equals(eVar.c());
        } else {
            z5 = false;
            z11 = false;
        }
        trackerMultipleAlarmActivity.f31125k.v1(trackerMultipleAlarmActivity.f31126l, z12, z11, z5);
        trackerMultipleAlarmActivity.P3(trackerMultipleAlarmActivity.C3().areAlarmsEnabled());
        trackerMultipleAlarmActivity.E3();
    }

    private void O3() {
        if (this.f31126l.size() >= D3()) {
            Toast.makeText(this, (int) C1987R.string._ALARMS_MAX_NUM_REACHED_MSG_, 1).show();
            return;
        }
        DeviceAlarm deviceAlarm = new DeviceAlarm();
        deviceAlarm.A(C3().getId());
        startActivityForResult(TrackerSetAlarmActivity.O3(this, C3(), deviceAlarm, true), 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P3(boolean z5) {
        int i11;
        int i12;
        if (this.f31126l.size() > 1) {
            this.f31124j.setText(getString(C1987R.string._ALARMS_SWITCH_TITLE_PLURAL_));
        } else {
            this.f31124j.setText(getString(C1987R.string._ALARMS_SWITCH_TITLE_SINGLE_));
        }
        View view = this.f31122h;
        int i13 = 0;
        if (z5) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        view.setVisibility(i11);
        View view2 = this.f31121g;
        if (z5) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        view2.setVisibility(i12);
        View view3 = this.f31123i;
        if (z5) {
            i13 = 8;
        }
        view3.setVisibility(i13);
        if (!z5) {
            TrackerMultipleAlarmFragment trackerMultipleAlarmFragment = this.f31125k;
            trackerMultipleAlarmFragment.f31194f = -1;
            trackerMultipleAlarmFragment.f31192d.notifyDataSetChanged();
        }
    }

    @Override // com.withings.alarm.conversation.TrackerSetAlarmsConversation.b
    public final void B1(final boolean z5) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: sg.k
            @Override // java.lang.Runnable
            public final void run() {
                TrackerMultipleAlarmActivity.this.P3(z5);
            }
        });
    }

    @Override // com.withings.alarm.ui.TrackerSetAlarmAbstractActivity
    protected final void F3() {
        vh.o c11 = vh.h.h().c(new vh.m() { // from class: sg.i
            @Override // vh.m
            public final Object call() {
                boolean z5;
                int i11 = TrackerMultipleAlarmActivity.f31120o;
                TrackerMultipleAlarmActivity trackerMultipleAlarmActivity = TrackerMultipleAlarmActivity.this;
                if (trackerMultipleAlarmActivity.C3() == null) {
                    Fail.j("Device is null, fix this error if it comes back !");
                    return new ArrayList();
                }
                List<DeviceAlarm> c12 = rg.b.b().c(trackerMultipleAlarmActivity.C3().getId());
                int i12 = 0;
                while (i12 < c12.size()) {
                    DeviceAlarm deviceAlarm = c12.get(i12);
                    i12++;
                    deviceAlarm.Y((short) i12);
                    if (deviceAlarm.f31069o + deviceAlarm.f31070p + deviceAlarm.f31071q > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    deviceAlarm.f0(z5);
                }
                return c12;
            }
        });
        c11.q(new a());
        c11.p(this);
    }

    @Override // com.withings.alarm.ui.n.b
    public final void U0(n nVar, DeviceAlarm deviceAlarm) {
        List<DeviceAlarm> list = this.f31126l;
        ArrayList arrayList = new ArrayList();
        for (DeviceAlarm deviceAlarm2 : list) {
            if (!deviceAlarm2.i().equals(deviceAlarm.i())) {
                arrayList.add(deviceAlarm2);
            }
        }
        arrayList.add(deviceAlarm);
        B3().V(deviceAlarm, arrayList);
    }

    @Override // com.withings.alarm.ui.TrackerSetAlarmAbstractActivity, com.withings.alarm.conversation.TrackerSetAlarmsConversation.b
    public final void U2(TrackerSetAlarmsConversation trackerSetAlarmsConversation) {
        if (this.f31126l.isEmpty()) {
            A3();
        }
        rg.b.b().h(this, C3(), this.f31126l);
    }

    @Override // com.withings.alarm.ui.n.b
    public final void W0(n nVar, DeviceAlarm deviceAlarm) {
        startActivityForResult(TrackerSetAlarmActivity.O3(this, C3(), deviceAlarm, true), 10);
    }

    @Override // com.withings.alarm.ui.n.b
    public final void f3(n nVar, DeviceAlarm deviceAlarm) {
        qc.b bVar = new qc.b(this);
        bVar.g(C1987R.string._ALARMS_DELETE_CONFIRMATION_);
        bVar.z(C1987R.string._OK_, new sg.l(0, this, deviceAlarm)).w(C1987R.string._CANCEL_, null).s();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        DeviceAlarm deviceAlarm;
        super.onActivityResult(i11, i12, intent);
        if (B3() == null) {
            A3();
            return;
        }
        B3().T(this);
        if (intent != null) {
            deviceAlarm = (DeviceAlarm) intent.getParcelableExtra("alarm");
        } else {
            deviceAlarm = null;
        }
        if (i11 != 10) {
            if (i11 == 30) {
                if (i12 == -1) {
                    if (deviceAlarm != null) {
                        this.f31126l.add(deviceAlarm);
                        deviceAlarm.Y((short) this.f31126l.size());
                        TrackerMultipleAlarmFragment trackerMultipleAlarmFragment = this.f31125k;
                        trackerMultipleAlarmFragment.f31194f = -1;
                        trackerMultipleAlarmFragment.f31192d.notifyDataSetChanged();
                        this.f31125k.t1(deviceAlarm);
                        rg.b.b().getClass();
                        rg.b.i(this, deviceAlarm);
                        B3().O(deviceAlarm, this.f31126l);
                        return;
                    }
                    A3();
                    return;
                } else if (this.f31126l.size() == 0) {
                    A3();
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        if (deviceAlarm != null) {
            List<DeviceAlarm> list = this.f31126l;
            ArrayList arrayList = new ArrayList();
            for (DeviceAlarm deviceAlarm2 : list) {
                if (!deviceAlarm2.i().equals(deviceAlarm.i())) {
                    arrayList.add(deviceAlarm2);
                }
            }
            arrayList.add(deviceAlarm);
            B3().V(deviceAlarm, arrayList);
        }
        F3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.withings.alarm.ui.TrackerSetAlarmAbstractActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        I3((Device) getIntent().getSerializableExtra("device"));
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_multiple_alarm);
        this.f31121g = findViewById(C1987R.id.fab_add_alarm);
        this.f31122h = findViewById(C1987R.id.global_switch_layout);
        this.f31123i = findViewById(C1987R.id.fade_layout);
        this.f31124j = (TextView) findViewById(C1987R.id.global_switch_title);
        this.f31121g.setOnClickListener(new sg.j(this, 0));
        findViewById(C1987R.id.activate_global_switch).setOnClickListener(new e(this, 1));
        this.f31122h.setOnClickListener(new f(this, 1));
        TrackerMultipleAlarmFragment trackerMultipleAlarmFragment = (TrackerMultipleAlarmFragment) getSupportFragmentManager().Y("multiple_alarm_fragment");
        this.f31125k = trackerMultipleAlarmFragment;
        trackerMultipleAlarmFragment.f31193e = this;
        u0.j0(this.f31121g, ah.g.k(8, this));
        this.f31121g.setVisibility(8);
        this.f31127m = new u70.d(this.f31128n, 3000);
        setSupportActionBar((Toolbar) findViewById(C1987R.id.toolbar));
        getSupportActionBar().o(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        vh.h.b(this);
        A3();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            A3();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        u70.d dVar = this.f31127m;
        if (dVar != null) {
            dVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.withings.alarm.ui.TrackerSetAlarmAbstractActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        u70.d dVar = this.f31127m;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // com.withings.alarm.ui.n.b
    public final void V0(n nVar, DeviceAlarm deviceAlarm) {
    }
}
