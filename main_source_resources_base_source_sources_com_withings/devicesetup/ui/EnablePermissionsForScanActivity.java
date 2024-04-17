package com.withings.devicesetup.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.withings.android.activity.WithingsActivity;
import com.withings.authentication.n;
import com.withings.devicesetup.Setup;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: EnablePermissionsForScanActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/withings/devicesetup/ui/EnablePermissionsForScanActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "ScanningAbilityProvider", "device-setup-legacy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class EnablePermissionsForScanActivity extends WithingsActivity {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f37827j = 0;

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f37828a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f37829b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f37830c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f37831d;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f37832e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f37833f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f37834g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f37835h;

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f37836i;

    /* compiled from: EnablePermissionsForScanActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lcom/withings/devicesetup/ui/EnablePermissionsForScanActivity$ScanningAbilityProvider;", "Landroid/os/Parcelable;", "WithSetup", "device-setup-legacy_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public interface ScanningAbilityProvider extends Parcelable {

        /* compiled from: EnablePermissionsForScanActivity.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/devicesetup/ui/EnablePermissionsForScanActivity$ScanningAbilityProvider$WithSetup;", "Lcom/withings/devicesetup/ui/EnablePermissionsForScanActivity$ScanningAbilityProvider;", "device-setup-legacy_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes3.dex */
        public static final class WithSetup implements ScanningAbilityProvider {
            public static final Parcelable.Creator<WithSetup> CREATOR = new Object();

            /* renamed from: a  reason: collision with root package name */
            private final Setup f37837a;

            /* compiled from: EnablePermissionsForScanActivity.kt */
            /* loaded from: classes3.dex */
            public static final class a implements Parcelable.Creator<WithSetup> {
                @Override // android.os.Parcelable.Creator
                public final WithSetup createFromParcel(Parcel parcel) {
                    u.j(parcel, "parcel");
                    return new WithSetup((Setup) parcel.readParcelable(WithSetup.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final WithSetup[] newArray(int i11) {
                    return new WithSetup[i11];
                }
            }

            public WithSetup(Setup setup) {
                u.j(setup, "setup");
                this.f37837a = setup;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel out, int i11) {
                u.j(out, "out");
                out.writeParcelable(this.f37837a, i11);
            }

            @Override // com.withings.devicesetup.ui.EnablePermissionsForScanActivity.ScanningAbilityProvider
            public final yi.d x(Context context) {
                u.j(context, "context");
                return this.f37837a.x(context);
            }
        }

        yi.d x(Context context);
    }

    /* compiled from: EnablePermissionsForScanActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static Intent a(Context context, ScanningAbilityProvider scanningAbilityProvider) {
            Intent a11 = n.a(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, context, EnablePermissionsForScanActivity.class);
            a11.putExtra("extra_scanning_ability_provider", scanningAbilityProvider);
            return a11;
        }
    }

    /* compiled from: EnablePermissionsForScanActivity.kt */
    /* loaded from: classes3.dex */
    static final class b extends w implements ym0.a<Button> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final Button invoke() {
            return (Button) EnablePermissionsForScanActivity.this.findViewById(C1987R.id.button_allow);
        }
    }

    /* compiled from: EnablePermissionsForScanActivity.kt */
    /* loaded from: classes3.dex */
    static final class c extends w implements ym0.a<aq.a> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final aq.a invoke() {
            return new aq.a(EnablePermissionsForScanActivity.this);
        }
    }

    /* compiled from: EnablePermissionsForScanActivity.kt */
    /* loaded from: classes3.dex */
    static final class d extends w implements ym0.a<ImageView> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final ImageView invoke() {
            return (ImageView) EnablePermissionsForScanActivity.this.findViewById(C1987R.id.image);
        }
    }

    /* compiled from: EnablePermissionsForScanActivity.kt */
    /* loaded from: classes3.dex */
    static final class e extends w implements ym0.a<Button> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final Button invoke() {
            return (Button) EnablePermissionsForScanActivity.this.findViewById(C1987R.id.button_learn_more);
        }
    }

    /* compiled from: EnablePermissionsForScanActivity.kt */
    /* loaded from: classes3.dex */
    static final class f extends w implements ym0.a<TextView> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) EnablePermissionsForScanActivity.this.findViewById(C1987R.id.message);
        }
    }

    /* compiled from: EnablePermissionsForScanActivity.kt */
    /* loaded from: classes3.dex */
    static final class g extends w implements ym0.a<u70.k> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final u70.k invoke() {
            return new u70.k(EnablePermissionsForScanActivity.this);
        }
    }

    /* compiled from: EnablePermissionsForScanActivity.kt */
    /* loaded from: classes3.dex */
    static final class h extends w implements ym0.a<ScanningAbilityProvider> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final ScanningAbilityProvider invoke() {
            return (ScanningAbilityProvider) EnablePermissionsForScanActivity.this.getIntent().getParcelableExtra("extra_scanning_ability_provider");
        }
    }

    /* compiled from: EnablePermissionsForScanActivity.kt */
    /* loaded from: classes3.dex */
    static final class i extends w implements ym0.a<Integer> {
        i() {
            super(0);
        }

        @Override // ym0.a
        public final Integer invoke() {
            EnablePermissionsForScanActivity enablePermissionsForScanActivity = EnablePermissionsForScanActivity.this;
            Integer valueOf = Integer.valueOf(enablePermissionsForScanActivity.getIntent().getIntExtra("extra_scanning_ability_state", -1));
            if (!enablePermissionsForScanActivity.getIntent().hasExtra("extra_scanning_ability_state")) {
                return null;
            }
            return valueOf;
        }
    }

    /* compiled from: EnablePermissionsForScanActivity.kt */
    /* loaded from: classes3.dex */
    static final class j extends w implements ym0.a<TextView> {
        j() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) EnablePermissionsForScanActivity.this.findViewById(C1987R.id.title);
        }
    }

    public EnablePermissionsForScanActivity() {
        super(C1987R.layout.activity_setup_bluetooth_location);
        this.f37828a = nm0.h.b(new j());
        this.f37829b = nm0.h.b(new f());
        this.f37830c = nm0.h.b(new d());
        this.f37831d = nm0.h.b(new b());
        this.f37832e = nm0.h.b(new e());
        this.f37833f = nm0.h.b(new h());
        this.f37834g = nm0.h.b(new i());
        this.f37835h = nm0.h.b(new c());
        this.f37836i = nm0.h.b(new g());
    }

    public static void A3(EnablePermissionsForScanActivity this$0) {
        u.j(this$0, "this$0");
        boolean a11 = ((u70.k) this$0.f37836i.getValue()).a("android.permission.BLUETOOTH_SCAN");
        boolean h11 = androidx.core.app.a.h(this$0, "android.permission.BLUETOOTH_SCAN");
        if (!a11 && !h11) {
            this$0.F3().getClass();
            this$0.startActivity(aq.a.b(this$0));
            return;
        }
        this$0.F3().g(this$0, 4165);
    }

    public static void B3(EnablePermissionsForScanActivity this$0) {
        u.j(this$0, "this$0");
        this$0.D3();
    }

    public static void C3(EnablePermissionsForScanActivity this$0, View view) {
        u.j(this$0, "this$0");
        Context context = view.getContext();
        aq.a F3 = this$0.F3();
        Context context2 = view.getContext();
        u.i(context2, "getContext(...)");
        F3.getClass();
        context.startActivity(aq.a.b(context2));
    }

    private final void D3() {
        yi.d dVar;
        int i11;
        ScanningAbilityProvider scanningAbilityProvider = (ScanningAbilityProvider) this.f37833f.getValue();
        if (scanningAbilityProvider != null) {
            dVar = scanningAbilityProvider.x(this);
        } else {
            dVar = null;
        }
        if (dVar != null && dVar.e()) {
            i11 = -1;
        } else {
            i11 = 0;
        }
        setResult(i11);
        finish();
    }

    private final Button E3() {
        return (Button) this.f37831d.getValue();
    }

    private final aq.a F3() {
        return (aq.a) this.f37835h.getValue();
    }

    private final int G3() {
        yi.d dVar;
        ScanningAbilityProvider scanningAbilityProvider = (ScanningAbilityProvider) this.f37833f.getValue();
        if (scanningAbilityProvider != null) {
            dVar = scanningAbilityProvider.x(this);
        } else {
            dVar = null;
        }
        if (dVar != null) {
            return dVar.getState();
        }
        Integer num = (Integer) this.f37834g.getValue();
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("EnablePermissionsForScanActivity needs a ScanningAbilityProvider or a valid ScanningAbility.State (as int)".toString());
    }

    private final void H3() {
        ((TextView) this.f37828a.getValue()).setText(getString(C1987R.string.installation_gpsAlreadyTitle_android));
        String string = getString(C1987R.string.installation_gpsAlreadyDescription_android);
        u.i(string, "getString(...)");
        ((TextView) this.f37829b.getValue()).setText(androidx.core.text.b.b(string));
        ((ImageView) this.f37830c.getValue()).setImageResource(2131231451);
        E3().setText(getString(C1987R.string._NEXT_));
        Button button = (Button) this.f37832e.getValue();
        u.i(button, "<get-learnMoreButton>(...)");
        button.setVisibility(8);
        E3().setOnClickListener(new sg.g(this, 1));
    }

    private final void I3() {
        int G3 = G3();
        nm0.g gVar = this.f37830c;
        nm0.g gVar2 = this.f37829b;
        nm0.g gVar3 = this.f37828a;
        if (G3 != 3) {
            if (G3 != 4) {
                if (G3 != 5) {
                    if (G3 != 8) {
                        D3();
                        return;
                    }
                    ((TextView) gVar3.getValue()).setText(C1987R.string.installation_NearbyDevicesPermission_title);
                    String string = getString(C1987R.string.installation_NearbyDevicesPermission_description);
                    u.i(string, "getString(...)");
                    ((TextView) gVar2.getValue()).setText(androidx.core.text.b.b(string));
                    ((ImageView) gVar.getValue()).setImageDrawable(androidx.core.content.a.getDrawable(this, 2131232366));
                    E3().setText(C1987R.string._ALLOW_);
                    E3().setOnClickListener(new com.google.android.material.search.j(this, 3));
                    return;
                }
                H3();
                return;
            }
            ((TextView) gVar3.getValue()).setText(getString(C1987R.string.bluetoothOff_title));
            String string2 = getString(C1987R.string.bluetoothOff_textAndroid);
            u.i(string2, "getString(...)");
            ((TextView) gVar2.getValue()).setText(androidx.core.text.b.b(string2));
            ((ImageView) gVar.getValue()).setImageDrawable(androidx.core.content.a.getDrawable(this, 2131232743));
            E3().setText(getString(C1987R.string._ALLOW_));
            E3().setOnClickListener(new androidx.media3.ui.i(this, 3));
            return;
        }
        boolean a11 = ((u70.k) this.f37836i.getValue()).a("android.permission.ACCESS_FINE_LOCATION");
        boolean h11 = androidx.core.app.a.h(this, "android.permission.ACCESS_FINE_LOCATION");
        if (!a11 && !h11) {
            ((TextView) gVar3.getValue()).setText(getString(C1987R.string.installation_gpsAlreadyTitle_android));
            String string3 = getString(C1987R.string.installation_gpsAlreadyDescription_android);
            u.i(string3, "getString(...)");
            ((TextView) gVar2.getValue()).setText(androidx.core.text.b.b(string3));
            ((ImageView) gVar.getValue()).setImageResource(2131231451);
            E3().setText(getString(C1987R.string._NEXT_));
            E3().setOnClickListener(new com.google.android.material.search.k(this, 3));
            nm0.g gVar4 = this.f37832e;
            Button button = (Button) gVar4.getValue();
            u.i(button, "<get-learnMoreButton>(...)");
            button.setVisibility(0);
            ((Button) gVar4.getValue()).setText(C1987R.string.not_now);
            ((Button) gVar4.getValue()).setOnClickListener(new sg.f(this, 2));
            return;
        }
        H3();
    }

    public static void z3(EnablePermissionsForScanActivity this$0) {
        u.j(this$0, "this$0");
        int G3 = this$0.G3();
        if (G3 != 0) {
            if (G3 != 3) {
                if (G3 != 5) {
                    if (G3 == 7) {
                        this$0.F3().f(this$0);
                        return;
                    }
                    return;
                }
                this$0.F3().getClass();
                xp.f.b(this$0);
                return;
            }
            this$0.F3().h(this$0);
            return;
        }
        this$0.I3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 432) {
            if (G3() == 4) {
                D3();
                return;
            } else {
                I3();
                return;
            }
        }
        I3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        ((Button) this.f37832e.getValue()).setOnClickListener(new dq.a(this, 0));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (16908332 == item.getItemId()) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i11, String[] permissions, int[] grantResults) {
        u.j(permissions, "permissions");
        u.j(grantResults, "grantResults");
        if (i11 == 4165) {
            if (grantResults[0] == 0) {
                if (G3() == 5) {
                    F3().getClass();
                    xp.f.b(this);
                    I3();
                    return;
                }
                D3();
                return;
            }
            D3();
            return;
        }
        super.onRequestPermissionsResult(i11, permissions, grantResults);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        I3();
    }
}
