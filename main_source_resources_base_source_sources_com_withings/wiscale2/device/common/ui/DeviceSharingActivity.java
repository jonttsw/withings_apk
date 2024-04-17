package com.withings.wiscale2.device.common.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import com.withings.android.activity.WithingsActivity;
import com.withings.device.DeviceModel;
import com.withings.util.log.Fail;
import com.withings.views.view.WorkflowBar;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.ui.p0;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import retrofit.RetrofitError;
/* compiled from: DeviceSharingActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/common/ui/DeviceSharingActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class DeviceSharingActivity extends WithingsActivity {

    /* renamed from: a  reason: collision with root package name */
    private TextView f53691a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f53692b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f53693c;

    /* renamed from: d  reason: collision with root package name */
    private WorkflowBar f53694d;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f53695e = nm0.h.b(new b());

    /* renamed from: f  reason: collision with root package name */
    private final c f53696f = new c(this);

    /* renamed from: g  reason: collision with root package name */
    private final d f53697g = new d(this);

    /* renamed from: h  reason: collision with root package name */
    private p0 f53698h;

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f53690j = {androidx.camera.core.v.c(DeviceSharingActivity.class, "macAddress", "getMacAddress()Lcom/withings/util/MacAddress;", 0), androidx.camera.core.v.c(DeviceSharingActivity.class, "deviceModel", "getDeviceModel()Lcom/withings/device/DeviceModel;", 0)};

    /* renamed from: i  reason: collision with root package name */
    public static final a f53689i = new Object();

    /* compiled from: DeviceSharingActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context, DeviceModel deviceModel, u70.i iVar) {
            Intent intent = new Intent(context, DeviceSharingActivity.class);
            intent.putExtra("EXTRA_MAC_ADDRESS", iVar);
            intent.putExtra("EXTRA_DEVICE_MODEL", deviceModel);
            return intent;
        }
    }

    /* compiled from: DeviceSharingActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<ProgressDialog> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final ProgressDialog invoke() {
            DeviceSharingActivity deviceSharingActivity = DeviceSharingActivity.this;
            return ProgressDialog.show(deviceSharingActivity, null, deviceSharingActivity.getString(C1987R.string._LOADING_), true, false);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Activity, u70.i> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f53700a = nm0.h.b(new n0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f53701b;

        public c(Activity activity) {
            this.f53701b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [u70.i, java.lang.Object] */
        @Override // bn0.d
        public final u70.i getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f53700a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class d implements bn0.d<Activity, DeviceModel> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f53702a = nm0.h.b(new o0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f53703b;

        public d(Activity activity) {
            this.f53703b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, com.withings.device.DeviceModel] */
        @Override // bn0.d
        public final DeviceModel getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f53702a.getValue();
        }
    }

    public static void A3(DeviceSharingActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        nm0.g gVar = this$0.f53695e;
        if (((ProgressDialog) gVar.getValue()).isShowing()) {
            ((ProgressDialog) gVar.getValue()).dismiss();
        }
        this$0.finish();
    }

    public static final DeviceModel C3(DeviceSharingActivity deviceSharingActivity) {
        deviceSharingActivity.getClass();
        return (DeviceModel) deviceSharingActivity.f53697g.getValue(deviceSharingActivity, f53690j[1]);
    }

    public static final u70.i E3(DeviceSharingActivity deviceSharingActivity) {
        deviceSharingActivity.getClass();
        return (u70.i) deviceSharingActivity.f53696f.getValue(deviceSharingActivity, f53690j[0]);
    }

    public static final void G3(DeviceSharingActivity deviceSharingActivity, p0.a aVar) {
        ((ProgressDialog) deviceSharingActivity.f53695e.getValue()).dismiss();
        Exception a11 = aVar.a();
        if (a11 != null) {
            if ((a11 instanceof RetrofitError) && ((RetrofitError) a11).getKind() == RetrofitError.Kind.NETWORK) {
                Toast.makeText(deviceSharingActivity, deviceSharingActivity.getString(C1987R.string._INTERNET_NEEDED_TEXT_), 0).show();
                return;
            } else {
                Toast.makeText(deviceSharingActivity, deviceSharingActivity.getString(C1987R.string._ERROR_), 0).show();
                return;
            }
        }
        String b10 = aVar.b();
        if (b10 != null) {
            u70.e.e(deviceSharingActivity, b10);
        }
    }

    public static void z3(DeviceSharingActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        ((ProgressDialog) this$0.f53695e.getValue()).show();
        p0 p0Var = this$0.f53698h;
        if (p0Var != null) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(p0Var), null, null, new u0(p0Var, this$0, null), 3, null);
        } else {
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_device_sharing);
        Toolbar toolbar = (Toolbar) findViewById(C1987R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        toolbar.setNavigationOnClickListener(new sg.j(this, 7));
        View findViewById = findViewById(C1987R.id.device_sharing_title);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f53691a = (TextView) findViewById;
        View findViewById2 = findViewById(C1987R.id.device_sharing_description);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f53692b = (TextView) findViewById2;
        View findViewById3 = findViewById(C1987R.id.device_sharing_image);
        kotlin.jvm.internal.u.i(findViewById3, "findViewById(...)");
        this.f53693c = (ImageView) findViewById3;
        View findViewById4 = findViewById(C1987R.id.workflowBar);
        kotlin.jvm.internal.u.i(findViewById4, "findViewById(...)");
        WorkflowBar workflowBar = (WorkflowBar) findViewById4;
        this.f53694d = workflowBar;
        workflowBar.setRightText(C1987R.string._INVITE_);
        WorkflowBar workflowBar2 = this.f53694d;
        if (workflowBar2 != null) {
            workflowBar2.setRightClickListener(new sg.d(this, 8));
            WorkflowBar workflowBar3 = this.f53694d;
            if (workflowBar3 != null) {
                workflowBar3.setLeftText(C1987R.string._DONE_);
                WorkflowBar workflowBar4 = this.f53694d;
                if (workflowBar4 != null) {
                    workflowBar4.setLeftClickListener(new com.google.android.material.datepicker.q(this, 6));
                    getWindow().addFlags(128);
                    fn0.k<Object>[] kVarArr = f53690j;
                    fn0.k<Object> kVar = kVarArr[0];
                    c cVar = this.f53696f;
                    Fail.h((u70.i) cVar.getValue(this, kVar), "Provided MacAddress must not be null");
                    fn0.k<Object> kVar2 = kVarArr[1];
                    d dVar = this.f53697g;
                    Fail.h((DeviceModel) dVar.getValue(this, kVar2), "Provided DeviceModel must not be null");
                    if (((DeviceModel) dVar.getValue(this, kVarArr[1])) != null && ((u70.i) cVar.getValue(this, kVarArr[0])) != null) {
                        p0 p0Var = (p0) new androidx.lifecycle.k1(this, new i0(this)).a(p0.class);
                        xw.d.c(this, p0Var.p0(), new j0(this));
                        xw.d.c(this, p0Var.f0(), new k0(this));
                        xw.d.c(this, p0Var.j0(), new l0(this));
                        xw.d.c(this, p0Var.m0(), new m0(this));
                        this.f53698h = p0Var;
                        return;
                    }
                    finish();
                    return;
                }
                kotlin.jvm.internal.u.s("workflowBar");
                throw null;
            }
            kotlin.jvm.internal.u.s("workflowBar");
            throw null;
        }
        kotlin.jvm.internal.u.s("workflowBar");
        throw null;
    }
}
