package com.withings.common.device;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Toast;
import androidx.camera.core.v;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m0;
import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.withings.android.activity.WithingsActivity;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.common.device.j;
import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: DeviceSettingsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n"}, d2 = {"Lcom/withings/common/device/DeviceSettingsActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "ActivityLauncherSettingsDelegate", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "c", "DeviceSettingsDelegate", "EmptySettingsDelegate", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class DeviceSettingsActivity extends WithingsActivity {

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f35014a;

    /* renamed from: b  reason: collision with root package name */
    private final j f35015b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f35016c;

    /* renamed from: d  reason: collision with root package name */
    private Fragment f35017d;

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f35013f = {v.c(DeviceSettingsActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0)};

    /* renamed from: e  reason: collision with root package name */
    public static final c f35012e = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DeviceSettingsActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/device/DeviceSettingsActivity$ActivityLauncherSettingsDelegate;", "Lcom/withings/common/device/DeviceSettingsActivity$DeviceSettingsDelegate;", "common-device_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class ActivityLauncherSettingsDelegate implements DeviceSettingsDelegate {
        public static final Parcelable.Creator<ActivityLauncherSettingsDelegate> CREATOR = new Object();

        /* renamed from: a  reason: collision with root package name */
        private final Intent f35018a;

        /* compiled from: DeviceSettingsActivity.kt */
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<ActivityLauncherSettingsDelegate> {
            @Override // android.os.Parcelable.Creator
            public final ActivityLauncherSettingsDelegate createFromParcel(Parcel parcel) {
                u.j(parcel, "parcel");
                return new ActivityLauncherSettingsDelegate((Intent) parcel.readParcelable(ActivityLauncherSettingsDelegate.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ActivityLauncherSettingsDelegate[] newArray(int i11) {
                return new ActivityLauncherSettingsDelegate[i11];
            }
        }

        public ActivityLauncherSettingsDelegate(Intent intent) {
            this.f35018a = intent;
        }

        @Override // com.withings.common.device.DeviceSettingsActivity.DeviceSettingsDelegate
        public final Fragment H1() {
            int i11 = a.f35019d;
            a aVar = new a();
            aVar.setArguments(androidx.core.os.e.a(new nm0.j(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, this.f35018a)));
            return aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.withings.common.device.DeviceSettingsActivity.DeviceSettingsDelegate
        public final WppDeviceConversation n0() {
            return new WppDeviceConversation() { // from class: com.withings.common.device.DeviceSettingsActivity$ActivityLauncherSettingsDelegate$createConversation$1
                @Override // com.withings.comm.remote.conversation.WppDeviceConversation
                public final void D() {
                }
            };
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i11) {
            u.j(out, "out");
            out.writeParcelable(this.f35018a, i11);
        }
    }

    /* compiled from: DeviceSettingsActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/withings/common/device/DeviceSettingsActivity$DeviceSettingsDelegate;", "Landroid/os/Parcelable;", "common-device_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public interface DeviceSettingsDelegate extends Parcelable {
        Fragment H1();

        WppDeviceConversation n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DeviceSettingsActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/common/device/DeviceSettingsActivity$EmptySettingsDelegate;", "Lcom/withings/common/device/DeviceSettingsActivity$DeviceSettingsDelegate;", "<init>", "()V", "common-device_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class EmptySettingsDelegate implements DeviceSettingsDelegate {
        public static final Parcelable.Creator<EmptySettingsDelegate> CREATOR = new Object();

        /* compiled from: DeviceSettingsActivity.kt */
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<EmptySettingsDelegate> {
            @Override // android.os.Parcelable.Creator
            public final EmptySettingsDelegate createFromParcel(Parcel parcel) {
                u.j(parcel, "parcel");
                parcel.readInt();
                return new EmptySettingsDelegate();
            }

            @Override // android.os.Parcelable.Creator
            public final EmptySettingsDelegate[] newArray(int i11) {
                return new EmptySettingsDelegate[i11];
            }
        }

        @Override // com.withings.common.device.DeviceSettingsActivity.DeviceSettingsDelegate
        public final Fragment H1() {
            return new Fragment();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.withings.common.device.DeviceSettingsActivity.DeviceSettingsDelegate
        public final WppDeviceConversation n0() {
            return new WppDeviceConversation() { // from class: com.withings.common.device.DeviceSettingsActivity$EmptySettingsDelegate$createConversation$1
                @Override // com.withings.comm.remote.conversation.WppDeviceConversation
                public final void D() {
                }
            };
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i11) {
            u.j(out, "out");
            out.writeInt(1);
        }
    }

    /* compiled from: DeviceSettingsActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/common/device/DeviceSettingsActivity$a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "common-device_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class a extends Fragment {

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int f35019d = 0;

        /* renamed from: c  reason: collision with root package name */
        private final nm0.g f35020c = nm0.h.b(new C0454a());

        /* compiled from: DeviceSettingsActivity.kt */
        /* renamed from: com.withings.common.device.DeviceSettingsActivity$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0454a extends w implements ym0.a<Intent> {
            C0454a() {
                super(0);
            }

            @Override // ym0.a
            public final Intent invoke() {
                Intent intent;
                Object parcelable;
                Bundle arguments = a.this.getArguments();
                if (arguments != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = arguments.getParcelable(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, Intent.class);
                    } else {
                        parcelable = arguments.getParcelable(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                    }
                    intent = (Intent) parcelable;
                } else {
                    intent = null;
                }
                if (!(intent instanceof Intent)) {
                    return null;
                }
                return intent;
            }
        }

        @Override // androidx.fragment.app.Fragment
        public final void onAttach(Context context) {
            u.j(context, "context");
            super.onAttach(context);
            Intent intent = (Intent) this.f35020c.getValue();
            if (intent != null) {
                context.startActivity(intent);
            }
            requireActivity().finish();
        }
    }

    /* compiled from: DeviceSettingsActivity.kt */
    /* loaded from: classes3.dex */
    public interface b {
        void s0(Activity activity);
    }

    /* compiled from: DeviceSettingsActivity.kt */
    /* loaded from: classes3.dex */
    public static final class c {
        public static Intent a(Context context, Device device, DeviceSettingsDelegate settingsDelegate) {
            u.j(context, "context");
            u.j(device, "device");
            u.j(settingsDelegate, "settingsDelegate");
            Intent putExtra = new Intent(context, DeviceSettingsActivity.class).putExtra("device", device).putExtra("extra_settings_delegate", settingsDelegate);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }

        public static /* synthetic */ Intent b(c cVar, Context context, Device device) {
            EmptySettingsDelegate emptySettingsDelegate = new EmptySettingsDelegate();
            cVar.getClass();
            return a(context, device, emptySettingsDelegate);
        }

        public static Intent c(Context context, Device device, Intent intent) {
            u.j(context, "context");
            u.j(device, "device");
            return a(context, device, new ActivityLauncherSettingsDelegate(intent));
        }
    }

    /* compiled from: DeviceSettingsActivity.kt */
    /* loaded from: classes3.dex */
    static final class d extends w implements ym0.a<com.withings.common.device.j> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final com.withings.common.device.j invoke() {
            j.a aVar = com.withings.common.device.j.f35193h;
            Device device = DeviceSettingsActivity.this.A3();
            aVar.getClass();
            u.j(device, "device");
            com.withings.common.device.j jVar = new com.withings.common.device.j();
            jVar.setArguments(androidx.core.os.e.a(new nm0.j("device", device)));
            return jVar;
        }
    }

    /* compiled from: Extensions.kt */
    /* loaded from: classes3.dex */
    public static final class e implements k1.b {
        public e() {
        }

        @Override // androidx.lifecycle.k1.b
        public final <U extends g1> U create(Class<U> modelClass) {
            u.j(modelClass, "modelClass");
            ej.w w11 = ej.w.w();
            u.i(w11, "get(...)");
            DeviceSettingsActivity deviceSettingsActivity = DeviceSettingsActivity.this;
            return new p(w11, deviceSettingsActivity.A3(), deviceSettingsActivity.B3().n0());
        }
    }

    /* compiled from: DeviceSettingsActivity.kt */
    /* loaded from: classes3.dex */
    static final class f extends w implements ym0.l<Boolean, y> {
        f() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null) {
                DeviceSettingsActivity.z3(DeviceSettingsActivity.this, bool2.booleanValue());
            }
            return y.f85009a;
        }
    }

    /* compiled from: DeviceSettingsActivity.kt */
    /* loaded from: classes3.dex */
    static final class g extends w implements ym0.a<y> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final y invoke() {
            c cVar = DeviceSettingsActivity.f35012e;
            DeviceSettingsActivity deviceSettingsActivity = DeviceSettingsActivity.this;
            deviceSettingsActivity.setResult(0);
            Toast.makeText(deviceSettingsActivity, (int) C1987R.string._LOST_CONNECTION_, 1).show();
            return y.f85009a;
        }
    }

    /* compiled from: DeviceSettingsActivity.kt */
    /* loaded from: classes3.dex */
    static final class h extends w implements ym0.a<y> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final y invoke() {
            DeviceSettingsActivity.this.finish();
            return y.f85009a;
        }
    }

    /* compiled from: DeviceSettingsActivity.kt */
    /* loaded from: classes3.dex */
    static final class i extends w implements ym0.a<DeviceSettingsDelegate> {
        i() {
            super(0);
        }

        @Override // ym0.a
        public final DeviceSettingsDelegate invoke() {
            Intent intent;
            Object parcelable;
            DeviceSettingsActivity deviceSettingsActivity = DeviceSettingsActivity.this;
            if (deviceSettingsActivity.getIntent().hasExtra("extra_settings_delegate")) {
                return (DeviceSettingsDelegate) b0.F(deviceSettingsActivity, "extra_settings_delegate");
            }
            Bundle extras = deviceSettingsActivity.getIntent().getExtras();
            if (extras != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = extras.getParcelable(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, Intent.class);
                } else {
                    parcelable = extras.getParcelable(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                }
                intent = (Intent) parcelable;
            } else {
                intent = null;
            }
            return new ActivityLauncherSettingsDelegate(intent);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class j implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f35028a = nm0.h.b(new o(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f35029b;

        public j(Activity activity) {
            this.f35029b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f35028a.getValue();
        }
    }

    public DeviceSettingsActivity() {
        super(C1987R.layout.activity_device_setting);
        this.f35014a = nm0.h.b(new i());
        this.f35015b = new j(this);
        this.f35016c = nm0.h.b(new d());
    }

    public static final void z3(DeviceSettingsActivity deviceSettingsActivity, boolean z5) {
        Fragment fragment;
        if (z5) {
            deviceSettingsActivity.setResult(-1);
            fragment = deviceSettingsActivity.f35017d;
            if (fragment == null) {
                fragment = deviceSettingsActivity.B3().H1();
                deviceSettingsActivity.f35017d = fragment;
            }
        } else {
            fragment = (Fragment) deviceSettingsActivity.f35016c.getValue();
        }
        m0 m11 = deviceSettingsActivity.getSupportFragmentManager().m();
        m11.l(C1987R.id.content, fragment, null);
        m11.g();
    }

    protected final Device A3() {
        return (Device) this.f35015b.getValue(this, f35013f[0]);
    }

    public final DeviceSettingsDelegate B3() {
        return (DeviceSettingsDelegate) this.f35014a.getValue();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        b bVar;
        Fragment fragment = this.f35017d;
        y yVar = null;
        if (fragment instanceof b) {
            bVar = (b) fragment;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            bVar.s0(this);
            yVar = y.f85009a;
        }
        if (yVar == null) {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = findViewById(C1987R.id.content);
        u.i(findViewById, "findViewById(...)");
        ay.b.t(findViewById);
        p pVar = (p) new k1(this, new e()).a(p.class);
        xw.d.c(this, pVar.i0(), new f());
        xw.d.d(this, pVar.g0(), new g());
        xw.d.d(this, pVar.f0(), new h());
    }
}
