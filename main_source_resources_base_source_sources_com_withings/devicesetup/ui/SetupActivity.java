package com.withings.devicesetup.ui;

import aj.b;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.m0;
import androidx.lifecycle.p0;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.android.activity.WithingsActivity;
import com.withings.comm.remote.exception.ConversationTimeoutException;
import com.withings.comm.remote.exception.FatalWebserviceException;
import com.withings.comm.remote.exception.RestartBluetoothException;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.bonding.BondingException;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.EnablePermissionsForScanActivity;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.devicesetup.ui.d;
import com.withings.devicesetup.ui.h;
import com.withings.devicesetup.ui.i;
import com.withings.devicesetup.ui.listener.EmptySetupStateListener;
import com.withings.webservices.legacy.common.exception.PartnerScaleAlreadyUsedException;
import com.withings.webservices.legacy.common.exception.ScaleSingleUserAutoAssignException;
import com.withings.wiscale2.C1987R;
import cq.a;
import dq.c0;
import dq.e0;
import dq.h0;
import dq.l;
import dq.m;
import dq.n;
import dq.o;
import dq.r;
import dq.s;
import e0.l0;
import e0.z;
import ej.w;
import gi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u;
import m0.t;
import xp.g;
import y.q;
import ym0.p;
/* loaded from: classes3.dex */
public class SetupActivity extends WithingsActivity implements g.a, h.b, a.c, i.b, i.c, d.a {

    /* renamed from: v */
    public static final /* synthetic */ int f37851v = 0;

    /* renamed from: b */
    private Setup f37853b;

    /* renamed from: c */
    private cj.d f37854c;

    /* renamed from: d */
    private Exception f37855d;

    /* renamed from: e */
    private SetupConversation f37856e;

    /* renamed from: f */
    private com.withings.devicesetup.ui.a f37857f;

    /* renamed from: g */
    private SetupStateListener f37858g;

    /* renamed from: h */
    private h0 f37859h;

    /* renamed from: i */
    private Toolbar f37860i;

    /* renamed from: j */
    private boolean f37861j;

    /* renamed from: m */
    private Fragment f37864m;

    /* renamed from: n */
    private xp.g f37865n;

    /* renamed from: o */
    private ej.k<SetupConversation> f37866o;

    /* renamed from: t */
    private int f37871t;

    /* renamed from: a */
    private final Handler f37852a = new Handler(Looper.getMainLooper());

    /* renamed from: k */
    private boolean f37862k = false;

    /* renamed from: l */
    private boolean f37863l = false;

    /* renamed from: p */
    private final ArrayList f37867p = new ArrayList();

    /* renamed from: q */
    private boolean f37868q = false;

    /* renamed from: r */
    private boolean f37869r = false;

    /* renamed from: s */
    private int f37870s = 0;

    /* renamed from: u */
    private final Handler f37872u = new Handler(Looper.getMainLooper());

    /* loaded from: classes3.dex */
    public interface a {

        /* renamed from: com.withings.devicesetup.ui.SetupActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC0497a extends a {
            void e(SetupActivity setupActivity, int i11, int i12, Intent intent);
        }

        /* loaded from: classes3.dex */
        public interface b extends a {
            boolean f(SetupActivity setupActivity);
        }

        void h(SetupActivity setupActivity);
    }

    public static /* synthetic */ void B3(SetupActivity setupActivity) {
        Fragment fragment = setupActivity.f37864m;
        if (fragment instanceof i) {
            ((i) fragment).t1();
        } else {
            setupActivity.f37865n.d();
        }
    }

    public static void C3(SetupActivity setupActivity, List list, List list2) {
        Object obj;
        setupActivity.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((gi.b) obj).b()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Setup.c cVar = (Setup.c) list2.get(list.indexOf((gi.b) obj));
        if (cVar.c() != null) {
            Setup.d c11 = cVar.c();
            Intent b10 = cVar.b();
            SetupScreen l5 = setupActivity.f37859h.l(Integer.valueOf(c11.b()), c11.e(), c11.a(), c11.c(), c11.d());
            c0.f64134y.getClass();
            c0 a11 = c0.a.a(l5);
            a11.G1(new dq.j(setupActivity));
            a11.I1(new dq.k(setupActivity, b10));
            setupActivity.c4(a11, 1);
            return;
        }
        setupActivity.startActivity(cVar.b());
    }

    public static /* synthetic */ void D3(SetupActivity setupActivity) {
        setupActivity.f37862k = false;
        setupActivity.f37872u.removeCallbacksAndMessages(null);
        xp.g gVar = setupActivity.f37865n;
        if (gVar != null) {
            gVar.stop();
        }
        setupActivity.s4();
    }

    public static void E3(SetupActivity setupActivity) {
        SetupConversation setupConversation = setupActivity.f37856e;
        if (setupConversation != null) {
            setupConversation.G(Boolean.TRUE);
        }
        setupActivity.m4();
    }

    public static void F3(SetupActivity setupActivity, cj.b bVar) {
        setupActivity.getClass();
        String name = bVar.j().getName();
        setupActivity.V3();
        SetupScreen f11 = setupActivity.f37859h.f(setupActivity.f37853b, name);
        c0.f64134y.getClass();
        c0 a11 = c0.a.a(f11);
        a11.E1(new r(setupActivity));
        setupActivity.c4(a11, 3);
    }

    public static /* synthetic */ void H3(SetupActivity setupActivity) {
        setupActivity.f37862k = false;
        setupActivity.f37872u.removeCallbacksAndMessages(null);
        xp.g gVar = setupActivity.f37865n;
        if (gVar != null) {
            gVar.stop();
        }
        setupActivity.startActivity(((Setup.l) setupActivity.f37853b).s(setupActivity));
    }

    public static void K3(SetupActivity setupActivity) {
        setupActivity.f37853b.r0(setupActivity);
    }

    public static void L3(SetupActivity setupActivity) {
        if (setupActivity.f37867p.isEmpty()) {
            setupActivity.L1(new RestartBluetoothException());
        } else {
            setupActivity.H2();
        }
    }

    public static void M3(SetupActivity setupActivity) {
        Fragment fragment = setupActivity.f37864m;
        if (fragment instanceof i) {
            ((i) fragment).u1();
            return;
        }
        Setup setup = setupActivity.f37853b;
        int i11 = i.f37930k;
        Bundle bundle = new Bundle();
        bundle.putParcelable("setup", setup);
        i iVar = new i();
        iVar.setArguments(bundle);
        setupActivity.c4(iVar, setupActivity.f37871t);
    }

    public void N3() {
        qc.b bVar = new qc.b(this);
        bVar.g(C1987R.string._ANDROID_SETUP_CANCEL_WARNING_);
        bVar.z(C1987R.string._ANDROID_SETUP_CANCEL_WARNING_CONFIRM_, new l(this, 0)).w(C1987R.string._NO_, null).create().show();
    }

    private void O3(u70.i iVar) {
        this.f37858g.P(this.f37860i.getContext(), this.f37853b.w(), iVar);
        e eVar = new e(this, this.f37853b, this.f37858g);
        com.withings.devicesetup.ui.a j12 = eVar.j1();
        this.f37857f = j12;
        j12.e(this);
        this.f37856e = new SetupConversation(this.f37853b, eVar);
    }

    public static Intent P3(Context context, Setup setup, cj.d dVar, SetupStateListener setupStateListener) {
        Intent Q3;
        if (dVar != null) {
            Q3 = Q3(context, setup).putExtra("mfgId", dVar.e().b()).putExtra("macAddress", dVar.d()).putExtra("klSecret", dVar.c());
        } else {
            Q3 = Q3(context, setup);
        }
        return Q3.putExtra("setupStateListener", setupStateListener);
    }

    public static Intent Q3(Context context, Setup setup) {
        return new Intent(context, SetupActivity.class).putExtra("setup", setup);
    }

    private void T3() {
        com.withings.devicesetup.ui.a aVar;
        this.f37853b = (Setup) getIntent().getParcelableExtra("setup");
        aj.b a11 = b.a.a(getIntent().getIntExtra("mfgId", -1));
        u70.i iVar = (u70.i) getIntent().getSerializableExtra("macAddress");
        String stringExtra = getIntent().getStringExtra("klSecret");
        SetupStateListener setupStateListener = (SetupStateListener) getIntent().getParcelableExtra("setupStateListener");
        if (setupStateListener == null) {
            setupStateListener = new EmptySetupStateListener();
        }
        this.f37858g = setupStateListener;
        if (a11 != null && iVar != null) {
            this.f37854c = new cj.d(a11, iVar, stringExtra);
            SetupConversation setupConversation = (SetupConversation) w.w().y(iVar, SetupConversation.class);
            this.f37856e = setupConversation;
            if (setupConversation != null) {
                aVar = setupConversation.N().j1();
            } else {
                aVar = null;
            }
            this.f37857f = aVar;
        }
        this.f37855d = (Exception) getIntent().getSerializableExtra("error");
        this.f37863l = getIntent().getBooleanExtra("skipInstructions", false);
    }

    public void Z3(boolean z5) {
        int i11;
        if (this.f37870s == 0) {
            this.f37858g.U1(this.f37860i.getContext(), this.f37853b.w());
        }
        Setup setup = this.f37853b;
        if (setup instanceof Setup.i) {
            i11 = ((Setup.i) setup).g(this.f37870s, z5);
        } else {
            i11 = this.f37870s + 1;
        }
        Setup setup2 = this.f37853b;
        if ((setup2 instanceof Setup.i) && i11 < ((Setup.i) setup2).c()) {
            this.f37870s = i11;
            i4();
            return;
        }
        Setup setup3 = this.f37853b;
        if (setup3 instanceof Setup.n) {
            Setup.n nVar = (Setup.n) setup3;
            if (!z5) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                u.j(fragmentManager, "fragmentManager");
                j.a aVar = new j.a(fragmentManager);
                nVar.getClass();
                aVar.y(getString(C1987R.string.install_troubleshooting_watchScreen_title));
                aVar.a(getString(C1987R.string.install_troubleshooting_watchScreen_description));
                final List<Setup.c> c11 = nVar.c(this);
                final ArrayList y11 = t.y(c11, new e2.t(this, 4));
                if (!y11.isEmpty()) {
                    ((gi.b) y11.get(0)).e(true);
                }
                aVar.r(new p() { // from class: dq.c
                    @Override // ym0.p
                    public final Object invoke(Object obj, Object obj2) {
                        Integer num = (Integer) obj;
                        gi.b bVar = (gi.b) obj2;
                        int i12 = SetupActivity.f37851v;
                        List<gi.b> list = y11;
                        for (gi.b bVar2 : list) {
                            bVar2.e(false);
                        }
                        ((gi.b) list.get(num.intValue())).e(true);
                        return null;
                    }
                }, y11);
                aVar.q(getString(C1987R.string._NEXT_), new ym0.l() { // from class: dq.d
                    @Override // ym0.l
                    public final Object invoke(Object obj) {
                        View view = (View) obj;
                        SetupActivity.C3(SetupActivity.this, y11, c11);
                        return null;
                    }
                });
                aVar.x();
                return;
            }
        }
        this.f37868q = false;
        s4();
    }

    private void c4(Fragment fragment, int i11) {
        if (!fragment.equals(this.f37864m)) {
            this.f37864m = fragment;
            this.f37871t = i11;
            m0 m11 = getSupportFragmentManager().m();
            m11.l(C1987R.id.content, fragment, null);
            m11.g();
        }
    }

    private void j4(int i11, int i12, final int i13) {
        qc.b z5 = new qc.b(this).w(C1987R.string._CANCEL_, new dq.f(this, 0)).z(C1987R.string._HELP_, new DialogInterface.OnClickListener() { // from class: dq.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i14) {
                int i15 = SetupActivity.f37851v;
                SetupActivity setupActivity = SetupActivity.this;
                setupActivity.q4();
                setupActivity.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("withings-bd2://wtweb?url=" + setupActivity.getString(i13))));
            }
        });
        z5.C(i11);
        z5.g(i12);
        z5.s();
    }

    public void p4(cj.b bVar) {
        this.f37862k = false;
        O3(bVar.g());
        w.w().O(bVar, this.f37856e, SetupConversation.class);
        this.f37853b.Z1(this);
        runOnUiThread(new androidx.core.content.res.h(1, this, bVar));
    }

    private void r4() {
        this.f37862k = false;
        xp.g gVar = this.f37865n;
        if (gVar != null) {
            gVar.stop();
        }
        ej.k<SetupConversation> kVar = this.f37866o;
        if (kVar != null) {
            kVar.k();
        }
        SetupConversation setupConversation = this.f37856e;
        if (setupConversation != null) {
            setupConversation.p();
            if (this.f37854c != null) {
                w.w().s(this.f37854c.d());
            }
        }
    }

    private void s4() {
        if (!this.f37862k && this.f37853b.x(this).e()) {
            V3();
            SetupScreen i11 = this.f37859h.i(this.f37853b);
            c0.f64134y.getClass();
            c0 a11 = c0.a.a(i11);
            a11.E1(new r(this));
            c4(a11, 2);
            this.f37867p.clear();
            this.f37862k = true;
            cj.d dVar = this.f37854c;
            if (dVar != null && !(this.f37853b instanceof Setup.e)) {
                O3(dVar.d());
                ej.k<SetupConversation> t11 = w.w().t(this.f37854c, this.f37856e);
                this.f37866o = t11;
                t11.p();
                this.f37866o.r();
                this.f37872u.postDelayed(new z(this, 3), 40000L);
                return;
            }
            xp.g gVar = this.f37865n;
            if (gVar != null) {
                gVar.d();
                return;
            }
            xp.g J0 = this.f37853b.J0(this);
            this.f37865n = J0;
            J0.start();
            return;
        }
        Parcelable withSetup = new EnablePermissionsForScanActivity.ScanningAbilityProvider.WithSetup(this.f37853b);
        Intent intent = new Intent(this, EnablePermissionsForScanActivity.class);
        intent.putExtra("extra_scanning_ability_provider", withSetup);
        startActivityForResult(intent, 4165);
    }

    @Override // com.withings.devicesetup.ui.i.b
    public final ArrayList D() {
        return this.f37867p;
    }

    @Override // xp.g.a
    public final void H2() {
        runOnUiThread(new e0(this, 1));
    }

    @Override // com.withings.devicesetup.ui.i.c
    public final void J2() {
        N3();
    }

    @Override // xp.g.a
    public final void L1(RestartBluetoothException restartBluetoothException) {
        Setup setup = this.f37853b;
        if (setup instanceof Setup.l) {
            SetupScreen j5 = this.f37859h.j((Setup.l) setup);
            c0.f64134y.getClass();
            c0 a11 = c0.a.a(j5);
            a11.I1(new s(this));
            a11.G1(new dq.t(this, 0));
            c4(a11, 12);
            return;
        }
        g4(restartBluetoothException);
    }

    @Override // xp.g.a
    public final void M0(cj.b bVar) {
        runOnUiThread(new q(8, this, bVar));
    }

    @Override // com.withings.devicesetup.ui.d.a
    public final void Q() {
        N3();
    }

    public final void R3() {
        this.f37852a.postDelayed(new l0(this, 4), 5000L);
    }

    public final SetupConversation S3() {
        return this.f37856e;
    }

    public final u70.i U3() {
        return this.f37854c.d();
    }

    public final void V3() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.g();
        }
    }

    public final boolean W3() {
        return this.f37861j;
    }

    public final void X3() {
        ((Setup.g) this.f37853b).c(this);
    }

    @Override // com.withings.devicesetup.ui.i.c
    public final void Y2(xi.b bVar) {
        this.f37872u.removeCallbacksAndMessages(null);
        xp.g gVar = this.f37865n;
        if (gVar != null) {
            gVar.stop();
        }
        p4(new cj.b(this.f37853b.w().c(), bVar, null, null));
    }

    public final void Y3(int i11) {
        this.f37856e.R(i11);
    }

    @Override // xp.g.a
    public final void Z1(xi.b bVar) {
        this.f37867p.add(bVar);
        this.f37872u.removeCallbacksAndMessages(null);
        if (this.f37868q) {
            runOnUiThread(new p0(this, 4));
            return;
        }
        xp.g gVar = this.f37865n;
        if (gVar != null) {
            gVar.stop();
        }
        if (this.f37862k) {
            p4(new cj.b(this.f37853b.w().c(), bVar, null, null));
        }
    }

    public final void a4() {
        this.f37868q = true;
        s4();
    }

    public final void b4() {
        this.f37856e.G(Boolean.FALSE);
        r4();
        this.f37856e = null;
        this.f37865n = null;
        this.f37854c = null;
        this.f37857f = null;
        this.f37868q = true;
        s4();
    }

    @Override // com.withings.devicesetup.ui.h.b
    public final void c() {
        SetupStateListener setupStateListener = this.f37858g;
        this.f37860i.getContext();
        this.f37853b.w();
        setupStateListener.getClass();
        this.f37855d = null;
        getIntent().removeExtra("error");
        s4();
    }

    public final void d4() {
        Exception exc = this.f37855d;
        if (exc != null) {
            g4(exc);
            return;
        }
        com.withings.devicesetup.ui.a aVar = this.f37857f;
        if (aVar != null) {
            a d11 = aVar.d();
            if (d11 != null) {
                ActionBar supportActionBar = getSupportActionBar();
                if (supportActionBar != null) {
                    supportActionBar.y();
                }
                d11.h(this);
                return;
            }
            m4();
        } else if (!this.f37862k && this.f37853b.x(this).e() && this.f37853b.J1() && !this.f37863l) {
            this.f37870s = 0;
            i4();
        } else {
            s4();
        }
    }

    public final void e4() {
        cq.a aVar = new cq.a();
        aVar.v1(this);
        c4(aVar, this.f37871t);
    }

    public final void f4() {
        d dVar = new d();
        Bundle bundle = new Bundle();
        bundle.putParcelable("setup", (Setup.WithBatteryCheck) this.f37853b);
        dVar.setArguments(bundle);
        c4(dVar, this.f37871t);
    }

    @Override // com.withings.devicesetup.ui.h.b
    public final void g0() {
        N3();
    }

    public final void g4(Exception exc) {
        String str;
        if (this.f37869r) {
            return;
        }
        this.f37857f = null;
        SetupConversation setupConversation = this.f37856e;
        if (setupConversation != null && setupConversation.x() != null) {
            str = this.f37856e.x().j().getName();
        } else {
            str = null;
        }
        this.f37856e = null;
        r4();
        if (exc instanceof FatalWebserviceException) {
            FatalWebserviceException fatalWebserviceException = (FatalWebserviceException) exc;
            if (fatalWebserviceException.getCause() instanceof PartnerScaleAlreadyUsedException) {
                j4(C1987R.string.partner_assignation_deviceAlreadyInstalledWithPartner_title, C1987R.string.partner_assignation_deviceAlreadyInstalledWithPartner_description, C1987R.string.partner_assignation_deviceAlreadyInstalledWithPartner_url);
                return;
            } else if (fatalWebserviceException.getCause() instanceof ScaleSingleUserAutoAssignException) {
                j4(C1987R.string.partner_assignation_deviceAlreadyInstalledWithHM_title, C1987R.string.partner_assignation_deviceAlreadyInstalledWithHM_description, C1987R.string.partner_assignation_deviceAlreadyInstalledWithHM_url);
                return;
            }
        }
        if (!(this.f37864m instanceof h)) {
            V3();
            if (exc instanceof BondingException) {
                SetupScreen e11 = this.f37859h.e((Setup.WithBonding) this.f37853b);
                c0.f64134y.getClass();
                c0 a11 = c0.a.a(e11);
                a11.G1(new dq.b(this, a11));
                c4(a11, this.f37871t);
                return;
            }
            boolean L = this.f37853b.L();
            h hVar = new h();
            Bundle bundle = new Bundle();
            bundle.putSerializable("exception", exc);
            bundle.putBoolean("showStacktrace", L);
            bundle.putString("EXTRA_DEVICE_NAME", str);
            if (u70.a.b().d(0L) && (exc instanceof ConversationTimeoutException)) {
                bundle.putBoolean("EXTRA_IMMEDIATE_RETRY", true);
            }
            hVar.setArguments(bundle);
            hVar.w1(this);
            c4(hVar, this.f37871t);
        }
    }

    public final void h4(Fragment fragment, int i11) {
        c4(fragment, i11);
    }

    public final void i4() {
        String str;
        SetupScreen h11;
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.y();
        }
        Setup setup = this.f37853b;
        if (setup instanceof Setup.g) {
            ((Setup.g) setup).getClass();
            str = getString(C1987R.string._WAM_NOT_TURN_ON_);
        } else {
            str = null;
        }
        String str2 = str;
        Setup setup2 = this.f37853b;
        if (setup2 instanceof Setup.i) {
            Setup.i iVar = (Setup.i) setup2;
            h11 = this.f37859h.h(iVar.k()[this.f37870s], iVar.l()[this.f37870s], iVar.i()[this.f37870s], iVar.d().get(this.f37870s), str2);
        } else if (setup2 instanceof Setup.n) {
            h0 h0Var = this.f37859h;
            int f12 = setup2.f1();
            int M = this.f37853b.M();
            Object d02 = this.f37853b.d0();
            ((Setup.n) setup2).getClass();
            h11 = h0Var.m(d02, f12, M, C1987R.string.deviceInstall_iSeeSetup, C1987R.string.deviceInstall_iSeeElse);
        } else {
            h11 = this.f37859h.h(setup2.f1(), this.f37853b.M(), this.f37853b.d0(), null, str2);
        }
        c0.f64134y.getClass();
        c0 a11 = c0.a.a(h11);
        a11.G1(new m(this));
        a11.I1(new n(this));
        a11.E1(new o(this));
        Setup setup3 = this.f37853b;
        if (setup3 instanceof Setup.i) {
            int c11 = ((Setup.i) setup3).c() - 1;
            int i11 = this.f37870s;
        }
        Setup setup4 = this.f37853b;
        if (setup4 instanceof Setup.k) {
            ((Setup.k) setup4).getClass();
        }
        if (this.f37853b instanceof Setup.g) {
            a11.F1(new dq.q(this));
        }
        c4(a11, 1);
    }

    public final void k4(cj.b bVar) {
        V3();
        this.f37872u.removeCallbacksAndMessages(null);
        SetupScreen g11 = this.f37859h.g(this.f37853b, bVar.j().getName());
        c0.f64134y.getClass();
        c0 a11 = c0.a.a(g11);
        a11.G1(new dq.h(this));
        a11.E1(new dq.i(this));
        c4(a11, 5);
    }

    public final void l4() {
        V3();
        SetupScreen k11 = this.f37859h.k(this.f37853b);
        c0.f64134y.getClass();
        c0 a11 = c0.a.a(k11);
        a11.G1(new dq.e(this));
        c4(a11, 10);
    }

    public final void m4() {
        V3();
        SetupScreen a11 = this.f37859h.a(this.f37853b);
        c0.f64134y.getClass();
        c4(c0.a.a(a11), 6);
    }

    public final void n4(float f11, int i11) {
        c0 a11;
        Setup.WithUpgrade withUpgrade = (Setup.WithUpgrade) this.f37853b;
        if (this.f37871t == 7) {
            a11 = (c0) this.f37864m;
        } else {
            SetupScreen n11 = this.f37859h.n(withUpgrade);
            c0.f64134y.getClass();
            a11 = c0.a.a(n11);
            c4(a11, 7);
        }
        this.f37859h.o(a11, withUpgrade, i11, f11);
    }

    public final void o4() {
        if (this.f37871t == 8) {
            this.f37852a.removeCallbacksAndMessages(null);
            SetupScreen d11 = this.f37859h.d((Setup.WithBonding) this.f37853b);
            c0.f64134y.getClass();
            c4(c0.a.a(d11), 8);
            this.f37856e.G(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (this.f37856e == null) {
            T3();
        }
        if (i11 == 432) {
            if (i12 == -1 && this.f37871t != 1) {
                d4();
            } else if (i12 != -1) {
                q4();
            }
        } else if (i11 == 4165) {
            if (i12 == -1 && this.f37871t != 1) {
                d4();
            } else if (i12 != -1) {
                q4();
            }
        } else {
            if (i11 == 1250) {
                s4();
            }
            com.withings.devicesetup.ui.a aVar = this.f37857f;
            if (aVar != null && (aVar.d() instanceof a.InterfaceC0497a)) {
                ((a.InterfaceC0497a) this.f37857f.d()).e(this, i11, i12, intent);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        com.withings.devicesetup.ui.a aVar = this.f37857f;
        if ((aVar != null && (aVar.d() instanceof a.b) && ((a.b) this.f37857f.d()).f(this)) || this.f37871t == 10) {
            return;
        }
        N3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        T3();
        if (bundle != null) {
            this.f37862k = bundle.getBoolean("scanning");
        }
        setContentView(C1987R.layout.activity_setup);
        Toolbar toolbar = (Toolbar) findViewById(C1987R.id.toolbar);
        this.f37860i = toolbar;
        setSupportActionBar(toolbar);
        this.f37859h = new h0(this);
        com.withings.devicesetup.ui.a aVar = this.f37857f;
        if (aVar != null) {
            aVar.e(this);
        }
        if (bundle == null && !w.w().A().b()) {
            qc.b bVar = new qc.b(this);
            bVar.C(C1987R.string._INTERNET_NEEDED_TITLE_);
            bVar.g(C1987R.string._INTERNET_NEEDED_TEXT_);
            qc.b z5 = bVar.z(C1987R.string._REAL_OK_, null);
            z5.t(false);
            z5.s();
        }
        d4();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        SetupConversation setupConversation = this.f37856e;
        if (setupConversation != null) {
            setupConversation.p();
        }
        sendBroadcast(new Intent("SETUP_ENDING"));
        com.withings.devicesetup.ui.a aVar = this.f37857f;
        if (aVar != null) {
            aVar.e(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        d4();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (16908332 == menuItem.getItemId()) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        this.f37861j = true;
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getSupportActionBar().o(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f37861j = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("scanning", this.f37862k);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        sendBroadcast(new Intent("SETUP_STARTING"));
    }

    @Override // com.withings.devicesetup.ui.i.c
    public final void q1() {
        V3();
        SetupScreen i11 = this.f37859h.i(this.f37853b);
        c0.f64134y.getClass();
        c0 a11 = c0.a.a(i11);
        a11.E1(new r(this));
        c4(a11, 2);
        this.f37867p.clear();
        this.f37865n.d();
    }

    public final void q4() {
        this.f37872u.removeCallbacksAndMessages(null);
        this.f37869r = true;
        this.f37858g.g0(this.f37856e, false);
        r4();
        finish();
    }

    @Override // android.app.Activity
    public final void setIntent(Intent intent) {
        super.setIntent(intent);
        T3();
    }
}
