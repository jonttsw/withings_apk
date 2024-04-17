package com.withings.wiscale2.device.wpm.wpm04.tutorial.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.v;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m0;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.wpm.wpm04.tutorial.ErrorInfo;
import com.withings.wiscale2.device.wpm.wpm04.tutorial.Wpm04TutorialScreen;
import com.withings.wiscale2.device.wpm.wpm04.tutorial.ui.i;
import com.withings.wiscale2.device.wpm.wpm04.tutorial.ui.k;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: Wpm04TutorialActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withings/wiscale2/device/wpm/wpm04/tutorial/ui/Wpm04TutorialActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/wiscale2/device/wpm/wpm04/tutorial/ui/k$b;", "Lcom/withings/wiscale2/device/wpm/wpm04/tutorial/ui/i$b;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpm04TutorialActivity extends WithingsActivity implements k.b, i.b {

    /* renamed from: a  reason: collision with root package name */
    private final b f55850a = new b(this);

    /* renamed from: b  reason: collision with root package name */
    private final c f55851b = new c(this);

    /* renamed from: c  reason: collision with root package name */
    private ze0.c f55852c;

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f55849e = {v.c(Wpm04TutorialActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0), v.c(Wpm04TutorialActivity.class, "isPostInstall", "isPostInstall()Z", 0)};

    /* renamed from: d  reason: collision with root package name */
    public static final a f55848d = new Object();

    /* compiled from: Wpm04TutorialActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class b implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f55853a = nm0.h.b(new g(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f55854b;

        public b(Activity activity) {
            this.f55854b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f55853a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f55855a = nm0.h.b(new h(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f55856b;

        public c(Activity activity) {
            this.f55856b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f55855a.getValue();
        }
    }

    public static final boolean A3(Wpm04TutorialActivity wpm04TutorialActivity) {
        return ((Boolean) wpm04TutorialActivity.f55851b.getValue(wpm04TutorialActivity, f55849e[1])).booleanValue();
    }

    public static final void B3(Wpm04TutorialActivity wpm04TutorialActivity, ErrorInfo errorInfo) {
        wpm04TutorialActivity.getClass();
        i.f55865e.getClass();
        u.j(errorInfo, "errorInfo");
        i iVar = new i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg_error", errorInfo);
        iVar.setArguments(bundle);
        iVar.f55867c = wpm04TutorialActivity;
        wpm04TutorialActivity.E3(iVar);
    }

    public static final void C3(Wpm04TutorialActivity wpm04TutorialActivity, ProcessingTextInfo info) {
        wpm04TutorialActivity.getClass();
        m.f55881d.getClass();
        u.j(info, "info");
        m mVar = new m();
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg_info", info);
        mVar.setArguments(bundle);
        wpm04TutorialActivity.E3(mVar);
    }

    public static final void D3(Wpm04TutorialActivity wpm04TutorialActivity, Wpm04TutorialScreen screenInfo) {
        wpm04TutorialActivity.getClass();
        k.f55872g.getClass();
        u.j(screenInfo, "screenInfo");
        k kVar = new k();
        kVar.setArguments(androidx.core.os.e.a(new nm0.j("arg_screen", screenInfo)));
        kVar.f55877f = wpm04TutorialActivity;
        wpm04TutorialActivity.E3(kVar);
    }

    private final void E3(Fragment fragment) {
        m0 m11 = getSupportFragmentManager().m();
        m11.l(C1987R.id.content, fragment, null);
        m11.e(null);
        m11.g();
    }

    public static final Device z3(Wpm04TutorialActivity wpm04TutorialActivity) {
        return (Device) wpm04TutorialActivity.f55850a.getValue(wpm04TutorialActivity, f55849e[0]);
    }

    @Override // com.withings.wiscale2.device.wpm.wpm04.tutorial.ui.k.b
    public final void g() {
        ze0.c cVar = this.f55852c;
        if (cVar != null) {
            cVar.A0();
        } else {
            u.s("viewModel");
            throw null;
        }
    }

    @Override // com.withings.wiscale2.device.wpm.wpm04.tutorial.ui.i.b
    public final void k1() {
        ze0.c cVar = this.f55852c;
        if (cVar != null) {
            cVar.F0();
        } else {
            u.s("viewModel");
            throw null;
        }
    }

    @Override // com.withings.wiscale2.device.wpm.wpm04.tutorial.ui.i.b
    public final void o1() {
        ze0.c cVar = this.f55852c;
        if (cVar != null) {
            cVar.j0();
        } else {
            u.s("viewModel");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        ze0.c cVar = this.f55852c;
        if (cVar != null) {
            cVar.y0(i11, i12);
        } else {
            u.s("viewModel");
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        ze0.c cVar = this.f55852c;
        if (cVar != null) {
            cVar.i0();
        } else {
            u.s("viewModel");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_wpm04_tutorial);
        setSupportActionBar((Toolbar) findViewById(C1987R.id.toolbar));
        ze0.c cVar = (ze0.c) new k1(this, new af0.a(this)).a(ze0.c.class);
        xw.d.c(this, cVar.t0(), new com.withings.wiscale2.device.wpm.wpm04.tutorial.ui.a(this));
        xw.d.c(this, cVar.r0(), new com.withings.wiscale2.device.wpm.wpm04.tutorial.ui.b(this));
        xw.d.c(this, cVar.q0(), new com.withings.wiscale2.device.wpm.wpm04.tutorial.ui.c(this));
        xw.d.d(this, cVar.p0(), new d(this));
        xw.d.c(this, cVar.m0(), new e(this));
        xw.d.d(this, cVar.k0(), new f(this));
        this.f55852c = cVar;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            ze0.c cVar = this.f55852c;
            if (cVar != null) {
                cVar.i0();
                return true;
            }
            u.s("viewModel");
            throw null;
        }
        return super.onOptionsItemSelected(item);
    }
}
