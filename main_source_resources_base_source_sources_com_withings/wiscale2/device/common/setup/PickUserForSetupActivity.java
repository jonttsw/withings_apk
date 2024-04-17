package com.withings.wiscale2.device.common.setup;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.b;
import androidx.fragment.app.m0;
import com.withings.android.activity.WithingsActivity;
import com.withings.device.Device;
import com.withings.device.setup.ui.SetupWithUser;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.setup.a;
import com.withings.wiscale2.user.ui.profile.EditProfileActivity;
import dq.l;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import un.c;
/* compiled from: PickUserForSetupActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/common/setup/PickUserForSetupActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/wiscale2/device/common/setup/a$a;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PickUserForSetupActivity extends WithingsActivity implements a.InterfaceC0717a {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f53510f = 0;

    /* renamed from: a  reason: collision with root package name */
    private SetupWithUser f53511a;

    /* renamed from: b  reason: collision with root package name */
    private User f53512b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f53513c;

    /* renamed from: d  reason: collision with root package name */
    private String f53514d;

    /* renamed from: e  reason: collision with root package name */
    private final b<Intent> f53515e;

    public PickUserForSetupActivity() {
        b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new c(this, 2));
        u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f53515e = registerForActivityResult;
    }

    public static void A3(PickUserForSetupActivity this$0, ActivityResult activityResult) {
        u.j(this$0, "this$0");
        if (activityResult.b() == -1) {
            this$0.f53513c = true;
        }
    }

    private final void B3() {
        qc.b bVar = new qc.b(this);
        bVar.g(C1987R.string._ANDROID_SETUP_CANCEL_WARNING_);
        bVar.z(C1987R.string._ANDROID_SETUP_CANCEL_WARNING_CONFIRM_, new l(this, 3)).w(C1987R.string._NO_, null).s();
    }

    private final void C3() {
        String str;
        SetupWithUser setupWithUser = this.f53511a;
        User user = this.f53512b;
        if (setupWithUser != null && user != null && !setupWithUser.j2()) {
            List<Device> i11 = e.c().i(user.q());
            int deviceType = setupWithUser.getDeviceType();
            u.g(i11);
            List<Device> list = i11;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (Device device : list) {
                    if (device.getType() == deviceType) {
                        String iVar = device.getMacAddress().toString();
                        u.i(iVar, "toString(...)");
                        String lowerCase = iVar.toLowerCase(Locale.ROOT);
                        u.i(lowerCase, "toLowerCase(...)");
                        if (!u.e(lowerCase, this.f53514d)) {
                            SetupWithUser setupWithUser2 = this.f53511a;
                            if (setupWithUser2 != null) {
                                int s12 = setupWithUser2.s1();
                                Object[] objArr = new Object[1];
                                User user2 = this.f53512b;
                                if (user2 != null) {
                                    str = user2.l();
                                } else {
                                    str = null;
                                }
                                objArr[0] = str;
                                String string = getString(s12, objArr);
                                u.i(string, "getString(...)");
                                qc.b bVar = new qc.b(this);
                                bVar.v(string);
                                bVar.z(C1987R.string._OK_, new com.withings.reminder.details.a(this, 2)).w(C1987R.string._CANCEL_, null).s();
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        Intent intent = new Intent();
        User user3 = this.f53512b;
        u.g(user3);
        intent.putExtra(NavigationArguments.USER_ID, user3.q());
        setResult(-1, intent);
        finish();
    }

    public static void z3(PickUserForSetupActivity this$0) {
        u.j(this$0, "this$0");
        Intent intent = new Intent();
        User user = this$0.f53512b;
        u.g(user);
        intent.putExtra(NavigationArguments.USER_ID, user.q());
        this$0.setResult(-1, intent);
        this$0.finish();
    }

    @Override // com.withings.wiscale2.device.common.setup.a.InterfaceC0717a
    public final void G() {
        B3();
    }

    @Override // com.withings.wiscale2.device.common.setup.a.InterfaceC0717a
    public final void P2(User user) {
        u.j(user, "user");
        this.f53512b = user;
        if (ej0.b.e().j(Long.valueOf(user.q()))) {
            User user2 = this.f53512b;
            if (user2 != null) {
                EditProfileActivity.a aVar = EditProfileActivity.f61841i;
                long q11 = user2.q();
                aVar.getClass();
                this.f53515e.a(new Intent(EditProfileActivity.a.a(this, q11, true)));
                return;
            }
            return;
        }
        C3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i12 == 0 && i11 != 3) {
            setResult(0);
            finish();
            return;
        }
        m0 m11 = getSupportFragmentManager().m();
        m11.l(C1987R.id.content, new a(), a.class.getSimpleName());
        m11.g();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        B3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object parcelableExtra;
        super.onCreate(bundle);
        Intent intent = getIntent();
        u.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("setup", SetupWithUser.class);
        } else {
            parcelableExtra = intent.getParcelableExtra("setup");
        }
        this.f53511a = (SetupWithUser) parcelableExtra;
        this.f53514d = getIntent().getStringExtra("EXTRA_DEVICE_MAC");
        setContentView(C1987R.layout.activity_setup);
        if (bundle == null) {
            m0 m11 = getSupportFragmentManager().m();
            m11.l(C1987R.id.content, new a(), a.class.getSimpleName());
            m11.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        findViewById(C1987R.id.toolbar).setVisibility(4);
        if (this.f53513c) {
            this.f53513c = false;
            C3();
        }
    }
}
