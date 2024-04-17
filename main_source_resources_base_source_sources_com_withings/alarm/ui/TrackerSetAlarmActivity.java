package com.withings.alarm.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.p0;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.withings.alarm.conversation.TrackerSetAlarmsConversation;
import com.withings.alarm.model.DeviceAlarm;
import com.withings.alarm.ui.SetAlarmFragment;
import com.withings.alarm.ui.TrackerSetAlarmActivity;
import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public class TrackerSetAlarmActivity extends TrackerSetAlarmAbstractActivity implements SetAlarmFragment.a {

    /* renamed from: m */
    public static final /* synthetic */ int f31138m = 0;

    /* renamed from: g */
    private Toolbar f31139g;

    /* renamed from: h */
    private View f31140h;

    /* renamed from: i */
    private SwitchMaterial f31141i;

    /* renamed from: j */
    private DeviceAlarm f31142j;

    /* renamed from: k */
    private SetAlarmFragment f31143k;

    /* renamed from: l */
    private boolean f31144l = false;

    public static /* synthetic */ void L3(TrackerSetAlarmActivity trackerSetAlarmActivity) {
        rg.b b10 = rg.b.b();
        Context context = trackerSetAlarmActivity.f31140h.getContext();
        DeviceAlarm deviceAlarm = trackerSetAlarmActivity.f31142j;
        b10.getClass();
        rg.b.i(context, deviceAlarm);
    }

    public static Intent O3(Context context, Device device, DeviceAlarm deviceAlarm, boolean z5) {
        Intent intent = new Intent(context, TrackerSetAlarmActivity.class);
        intent.putExtra("device", device);
        intent.putExtra("alarm", deviceAlarm);
        intent.putExtra("EXTRA_IS_MULTI_ALARM", z5);
        return intent;
    }

    public void P3(boolean z5) {
        if (z5) {
            Intent intent = new Intent();
            intent.putExtra("alarm", this.f31142j);
            setResult(-1, intent);
        } else {
            setResult(0);
        }
        finish();
    }

    public final void Q3(final DeviceAlarm deviceAlarm) {
        this.f31142j = deviceAlarm;
        if (this.f31144l) {
            vh.c a11 = vh.h.h().a(new vh.a() { // from class: sg.o
                @Override // vh.a
                public final void run() {
                    int i11 = TrackerSetAlarmActivity.f31138m;
                    rg.b b10 = rg.b.b();
                    TrackerSetAlarmActivity trackerSetAlarmActivity = TrackerSetAlarmActivity.this;
                    b10.k(trackerSetAlarmActivity.getApplicationContext(), deviceAlarm, trackerSetAlarmActivity.C3());
                }
            });
            a11.q(new r(this));
            a11.p(this);
            return;
        }
        B3().V(deviceAlarm, new ArrayList());
    }

    @Override // com.withings.alarm.ui.TrackerSetAlarmAbstractActivity, com.withings.alarm.conversation.TrackerSetAlarmsConversation.b
    public final void U2(TrackerSetAlarmsConversation trackerSetAlarmsConversation) {
        runOnUiThread(new p0(this, 1));
        trackerSetAlarmsConversation.G(Boolean.FALSE);
        P3(true);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.f31144l) {
            P3(false);
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.withings.alarm.ui.TrackerSetAlarmAbstractActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_set_alarm);
        this.f31139g = (Toolbar) findViewById(C1987R.id.toolbar);
        this.f31140h = findViewById(C1987R.id.mainLayout);
        this.f31144l = getIntent().getBooleanExtra("EXTRA_IS_MULTI_ALARM", true);
        this.f31142j = (DeviceAlarm) getIntent().getParcelableExtra("alarm");
        setSupportActionBar(this.f31139g);
        getSupportActionBar().o(true);
        Drawable drawable = androidx.core.content.a.getDrawable(this, C1987R.drawable.icon_medium_navigation_close);
        if (drawable != null) {
            drawable.setTint(getColor(C1987R.color.textPrimary));
        }
        this.f31139g.setNavigationIcon(drawable);
        this.f31139g.setNavigationOnClickListener(new androidx.viewpager.widget.c(this, 1));
        SetAlarmFragment setAlarmFragment = (SetAlarmFragment) getSupportFragmentManager().Y("set_alarm_fragment");
        this.f31143k = setAlarmFragment;
        setAlarmFragment.y1(this);
        this.f31143k.z1(C3());
        this.f31143k.x1(this.f31142j);
        this.f31143k.A1(!this.f31144l);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C1987R.menu.menu_hwa_alarm, menu);
        MenuItem findItem = menu.findItem(C1987R.id.alarm_switch);
        findItem.setVisible(!this.f31144l);
        SwitchMaterial switchMaterial = (SwitchMaterial) findItem.getActionView().findViewById(C1987R.id.toolbar_switch);
        this.f31141i = switchMaterial;
        switchMaterial.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: sg.n
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z5) {
                TrackerSetAlarmActivity.this.f31143k.w1(z5);
            }
        });
        this.f31141i.setChecked(this.f31142j.B());
        return super.onCreateOptionsMenu(menu);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        vh.h.b(this);
        if (!this.f31144l) {
            A3();
            E3();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            A3();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.withings.alarm.conversation.TrackerSetAlarmsConversation.b
    public final void B1(boolean z5) {
    }
}
