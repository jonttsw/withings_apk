package com.withings.device.details.wsm;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RadioGroup;
import androidx.appcompat.app.ActionBar;
import androidx.camera.core.v;
import com.withings.android.activity.WithingsActivity;
import com.withings.device.Device;
import com.withings.device.details.wsm.SoundSensorActivity;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import m0.t;
/* compiled from: SoundSensorActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/device/details/wsm/SoundSensorActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "device-details-wsm_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SoundSensorActivity extends WithingsActivity {

    /* renamed from: a  reason: collision with root package name */
    private final c f37306a = new c(this);

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f37307b = nm0.h.b(new b());

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f37305d = {v.c(SoundSensorActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0)};

    /* renamed from: c  reason: collision with root package name */
    public static final a f37304c = new Object();

    /* compiled from: SoundSensorActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* compiled from: SoundSensorActivity.kt */
    /* loaded from: classes3.dex */
    static final class b extends w implements ym0.a<bo.a> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final bo.a invoke() {
            return bo.a.b(SoundSensorActivity.this.getLayoutInflater());
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class c implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f37309a = nm0.h.b(new com.withings.device.details.wsm.c(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f37310b;

        public c(Activity activity) {
            this.f37310b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f37309a.getValue();
        }
    }

    public static void A3(SoundSensorActivity this$0, DialogInterface dialogInterface) {
        u.j(this$0, "this$0");
        ((bo.a) this$0.f37307b.getValue()).f21695b.setOnCheckedChangeListener(null);
        this$0.E3();
        dialogInterface.dismiss();
    }

    public static void B3(SoundSensorActivity this$0, DialogInterface dialogInterface) {
        u.j(this$0, "this$0");
        ((Device) this$0.f37306a.getValue(this$0, f37305d[0])).setIsMicMuted(true);
        BuildersKt__Builders_commonKt.launch$default(t.l(this$0), Dispatchers.getIO(), null, new com.withings.device.details.wsm.b(this$0, null), 2, null);
        dialogInterface.dismiss();
    }

    public static void C3(SoundSensorActivity this$0) {
        u.j(this$0, "this$0");
        ((bo.a) this$0.f37307b.getValue()).f21695b.setOnCheckedChangeListener(null);
        this$0.E3();
    }

    public static final Device D3(SoundSensorActivity soundSensorActivity) {
        soundSensorActivity.getClass();
        return (Device) soundSensorActivity.f37306a.getValue(soundSensorActivity, f37305d[0]);
    }

    private final void E3() {
        int i11;
        nm0.g gVar = this.f37307b;
        RadioGroup radioGroup = ((bo.a) gVar.getValue()).f21695b;
        if (((Device) this.f37306a.getValue(this, f37305d[0])).isMicMuted()) {
            i11 = C1987R.id.status_off;
        } else {
            i11 = C1987R.id.status_on;
        }
        radioGroup.check(i11);
        ((bo.a) gVar.getValue()).f21695b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: ao.b
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i12) {
                SoundSensorActivity.z3(SoundSensorActivity.this, i12);
            }
        });
    }

    public static void z3(final SoundSensorActivity this$0, int i11) {
        u.j(this$0, "this$0");
        if (i11 == C1987R.id.status_off) {
            qc.b bVar = new qc.b(this$0);
            bVar.C(C1987R.string.wsm02Detail_soundSensor_deActivation_popup);
            bVar.g(C1987R.string.wsm02Detail_soundSensor_deActivation_description);
            qc.b z5 = bVar.w(C1987R.string._CANCEL_, new ao.c(this$0, 0)).z(C1987R.string._OK_, new ao.d(this$0, 0));
            z5.y(new DialogInterface.OnCancelListener() { // from class: ao.e
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    SoundSensorActivity.C3(SoundSensorActivity.this);
                }
            });
            z5.s();
            return;
        }
        ((Device) this$0.f37306a.getValue(this$0, f37305d[0])).setIsMicMuted(false);
        BuildersKt__Builders_commonKt.launch$default(t.l(this$0), Dispatchers.getIO(), null, new com.withings.device.details.wsm.b(this$0, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        nm0.g gVar = this.f37307b;
        setContentView(((bo.a) gVar.getValue()).a());
        setSupportActionBar(((bo.a) gVar.getValue()).f21696c);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
            supportActionBar.q(true);
        }
        E3();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
