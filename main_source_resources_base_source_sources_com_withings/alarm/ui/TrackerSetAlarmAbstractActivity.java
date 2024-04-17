package com.withings.alarm.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;
import com.withings.alarm.conversation.TrackerSetAlarmsConversation;
import com.withings.alarm.ui.TrackerSetAlarmAbstractActivity;
import com.withings.android.activity.WithingsActivity;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
import e0.f0;
import ej.k;
import ej.w;
/* loaded from: classes3.dex */
public abstract class TrackerSetAlarmAbstractActivity extends WithingsActivity implements TrackerSetAlarmsConversation.b {

    /* renamed from: f */
    public static final /* synthetic */ int f31131f = 0;

    /* renamed from: a */
    private ej.k<TrackerSetAlarmsConversation> f31132a;

    /* renamed from: b */
    private TrackerSetAlarmsConversation f31133b;

    /* renamed from: c */
    private ProgressDialog f31134c;

    /* renamed from: d */
    private Device f31135d;

    /* renamed from: e */
    private int f31136e = 10;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class a extends k.e<TrackerSetAlarmsConversation> {
        a() {
            TrackerSetAlarmAbstractActivity.this = r1;
        }

        @Override // ej.k.e, ej.k.f
        public final void a(ej.k kVar, WppDeviceConversation wppDeviceConversation) {
            TrackerSetAlarmAbstractActivity trackerSetAlarmAbstractActivity = TrackerSetAlarmAbstractActivity.this;
            ((TrackerSetAlarmsConversation) wppDeviceConversation).T(trackerSetAlarmAbstractActivity);
            trackerSetAlarmAbstractActivity.E3();
        }

        @Override // ej.k.e, ej.k.f
        public final void c(ej.k kVar, WppDeviceConversation wppDeviceConversation) {
            TrackerSetAlarmsConversation trackerSetAlarmsConversation = (TrackerSetAlarmsConversation) wppDeviceConversation;
            TrackerSetAlarmAbstractActivity.this.J3();
        }

        @Override // ej.k.e, ej.k.f
        public final void f(ej.k<TrackerSetAlarmsConversation> kVar) {
            TrackerSetAlarmAbstractActivity.this.J3();
        }

        @Override // ej.k.e, ej.k.f
        public final void g(ej.k kVar, WppDeviceConversation wppDeviceConversation) {
            TrackerSetAlarmsConversation trackerSetAlarmsConversation = (TrackerSetAlarmsConversation) wppDeviceConversation;
            TrackerSetAlarmAbstractActivity trackerSetAlarmAbstractActivity = TrackerSetAlarmAbstractActivity.this;
            trackerSetAlarmsConversation.T(trackerSetAlarmAbstractActivity);
            trackerSetAlarmAbstractActivity.H3(trackerSetAlarmsConversation);
            trackerSetAlarmAbstractActivity.E3();
        }
    }

    public final void A3() {
        ej.k<TrackerSetAlarmsConversation> kVar = this.f31132a;
        if (kVar != null) {
            kVar.k();
        }
        TrackerSetAlarmsConversation trackerSetAlarmsConversation = this.f31133b;
        if (trackerSetAlarmsConversation != null) {
            trackerSetAlarmsConversation.T(null);
            this.f31133b.p();
        }
        E3();
        finish();
    }

    public final TrackerSetAlarmsConversation B3() {
        if (this.f31133b == null) {
            runOnUiThread(new f0(this, 5));
            A3();
        }
        return this.f31133b;
    }

    public final Device C3() {
        return this.f31135d;
    }

    public final int D3() {
        return this.f31136e;
    }

    public final void E3() {
        ProgressDialog progressDialog = this.f31134c;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f31134c = null;
        }
    }

    public final void G3(TrackerSetAlarmsConversation trackerSetAlarmsConversation) {
        runOnUiThread(new androidx.core.widget.c(this, 5));
        H3(trackerSetAlarmsConversation);
        F3();
    }

    public final void H3(TrackerSetAlarmsConversation trackerSetAlarmsConversation) {
        this.f31133b = trackerSetAlarmsConversation;
        if (trackerSetAlarmsConversation != null) {
            Object e11 = trackerSetAlarmsConversation.x().e();
            if (e11 instanceof pg.f) {
                this.f31136e = ((pg.f) e11).d();
            }
        }
    }

    public final void I3(Device device) {
        this.f31135d = device;
    }

    protected final void J3() {
        if (this.f31134c == null && !isFinishing()) {
            this.f31134c = ProgressDialog.show(this, null, getString(C1987R.string._WBS_ACTIVATING_TEXT_), true, true, new DialogInterface.OnCancelListener() { // from class: com.withings.alarm.ui.q
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    int i11 = TrackerSetAlarmAbstractActivity.f31131f;
                    TrackerSetAlarmAbstractActivity.this.A3();
                }
            });
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation.b
    public final void e3(WppDeviceConversation wppDeviceConversation, Exception exc) {
        if (this.f31133b != null) {
            runOnUiThread(new Runnable() { // from class: sg.m
                @Override // java.lang.Runnable
                public final void run() {
                    int i11 = TrackerSetAlarmAbstractActivity.f31131f;
                    TrackerSetAlarmAbstractActivity trackerSetAlarmAbstractActivity = TrackerSetAlarmAbstractActivity.this;
                    trackerSetAlarmAbstractActivity.getClass();
                    Toast.makeText(trackerSetAlarmAbstractActivity, (int) C1987R.string._LOST_CONNECTION_, 1).show();
                }
            });
        }
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f31135d = (Device) getIntent().getSerializableExtra("device");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ej.k<TrackerSetAlarmsConversation> u11 = w.w().u(jl.a.b(this.f31135d), new TrackerSetAlarmsConversation(this, rg.b.b(), kn.e.c()), TrackerSetAlarmsConversation.class);
        this.f31132a = u11;
        u11.n(new a());
        this.f31132a.r();
    }

    protected void F3() {
    }

    public void U2(TrackerSetAlarmsConversation trackerSetAlarmsConversation) {
    }
}
