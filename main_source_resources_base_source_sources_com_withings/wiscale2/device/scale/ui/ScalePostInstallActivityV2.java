package com.withings.wiscale2.device.scale.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.l1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m0;
import com.withings.android.activity.WithingsActivity;
import com.withings.common.device.TutorialStateListener;
import com.withings.common.device.reporting.InstallStateReporter;
import com.withings.device.Device;
import com.withings.devicesetup.ui.SetupStateListener;
import com.withings.target.WeightGoal;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.scale.ui.b;
import com.withings.wiscale2.device.scale.ui.c;
import com.withings.wiscale2.measure.goal.ui.WeightGoalActivity;
import fl.p;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import m0.t;
import m70.i;
/* compiled from: ScalePostInstallActivityV2.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/device/scale/ui/ScalePostInstallActivityV2;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/wiscale2/device/scale/ui/b$a;", "Lcom/withings/wiscale2/device/scale/ui/c$a;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ScalePostInstallActivityV2 extends WithingsActivity implements b.a, c.a {

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f54661a = nm0.h.b(new g());

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f54662b = nm0.h.b(new a());

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f54663c = nm0.h.b(new h());

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f54664d = nm0.h.b(new b());

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f54665e = nm0.h.b(new e());

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f54666f = nm0.h.b(new d());

    /* renamed from: g  reason: collision with root package name */
    private boolean f54667g = true;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f54668h = nm0.h.b(f.f54676a);

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f54669i = nm0.h.b(c.f54673a);

    /* renamed from: j  reason: collision with root package name */
    private SparseArray<b.c> f54670j;

    /* compiled from: ScalePostInstallActivityV2.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<String> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final String invoke() {
            return ScalePostInstallActivityV2.this.getIntent().getStringExtra("KEY_COLOR");
        }
    }

    /* compiled from: ScalePostInstallActivityV2.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<Device> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final Device invoke() {
            Object obj;
            Intent intent = ScalePostInstallActivityV2.this.getIntent();
            u.i(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                obj = intent.getSerializableExtra("KEY_DEVICE", Device.class);
            } else {
                Serializable serializableExtra = intent.getSerializableExtra("KEY_DEVICE");
                if (!(serializableExtra instanceof Device)) {
                    serializableExtra = null;
                }
                obj = (Device) serializableExtra;
            }
            u.g(obj);
            return (Device) obj;
        }
    }

    /* compiled from: ScalePostInstallActivityV2.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f54673a = new w(0);

        @Override // ym0.a
        public final p invoke() {
            return p.f67672b.a();
        }
    }

    /* compiled from: ScalePostInstallActivityV2.kt */
    /* loaded from: classes5.dex */
    static final class d extends w implements ym0.a<SetupStateListener> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final SetupStateListener invoke() {
            Object parcelableExtra;
            ScalePostInstallActivityV2 scalePostInstallActivityV2 = ScalePostInstallActivityV2.this;
            Intent intent = scalePostInstallActivityV2.getIntent();
            u.i(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = intent.getParcelableExtra("KEY_INSTALL_STATE_REPORTER", SetupStateListener.class);
            } else {
                parcelableExtra = intent.getParcelableExtra("KEY_INSTALL_STATE_REPORTER");
            }
            SetupStateListener setupStateListener = (SetupStateListener) parcelableExtra;
            if (setupStateListener == null) {
                return new InstallStateReporter(ScalePostInstallActivityV2.F3(scalePostInstallActivityV2));
            }
            return setupStateListener;
        }
    }

    /* compiled from: ScalePostInstallActivityV2.kt */
    /* loaded from: classes5.dex */
    static final class e extends w implements ym0.a<Boolean> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(ScalePostInstallActivityV2.this.getIntent().getBooleanExtra("KEY_IS_DURING_INSTALL", false));
        }
    }

    /* compiled from: ScalePostInstallActivityV2.kt */
    /* loaded from: classes5.dex */
    static final class f extends w implements ym0.a<User> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f54676a = new w(0);

        @Override // ym0.a
        public final User invoke() {
            return i.b().e();
        }
    }

    /* compiled from: ScalePostInstallActivityV2.kt */
    /* loaded from: classes5.dex */
    static final class g extends w implements ym0.a<Integer> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final Integer invoke() {
            return Integer.valueOf(ScalePostInstallActivityV2.this.getIntent().getIntExtra("KEY_MODEL", -1));
        }
    }

    /* compiled from: ScalePostInstallActivityV2.kt */
    /* loaded from: classes5.dex */
    static final class h extends w implements ym0.a<Boolean> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(ScalePostInstallActivityV2.this.getIntent().getBooleanExtra("KEY_SKIP_GOAL", false));
        }
    }

    public static final Device A3(ScalePostInstallActivityV2 scalePostInstallActivityV2) {
        return (Device) scalePostInstallActivityV2.f54664d.getValue();
    }

    public static final p B3(ScalePostInstallActivityV2 scalePostInstallActivityV2) {
        return (p) scalePostInstallActivityV2.f54669i.getValue();
    }

    public static final boolean D3(ScalePostInstallActivityV2 scalePostInstallActivityV2) {
        return ((Boolean) scalePostInstallActivityV2.f54663c.getValue()).booleanValue();
    }

    public static final boolean F3(ScalePostInstallActivityV2 scalePostInstallActivityV2) {
        return ((Boolean) scalePostInstallActivityV2.f54665e.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int I3() {
        return ((Number) this.f54661a.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J3(Fragment fragment) {
        m0 m11 = getSupportFragmentManager().m();
        m11.l(C1987R.id.content, fragment, null);
        m11.e(null);
        m11.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e7, code lost:
        if (r9 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e9, code lost:
        r10 = com.withings.wiscale2.C1987R.string.scaleOnboarding_KGurl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ff, code lost:
        if (r9 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.util.SparseArray z3(com.withings.wiscale2.device.scale.ui.ScalePostInstallActivityV2 r12, boolean r13, int r14) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.scale.ui.ScalePostInstallActivityV2.z3(com.withings.wiscale2.device.scale.ui.ScalePostInstallActivityV2, boolean, int):android.util.SparseArray");
    }

    @Override // com.withings.wiscale2.device.scale.ui.b.a
    public final void G1(com.withings.wiscale2.device.scale.ui.b fragment, boolean z5) {
        u.j(fragment, "fragment");
        this.f54667g = z5;
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(!this.f54667g);
        }
    }

    @Override // com.withings.wiscale2.device.scale.ui.b.a
    public final void T2(com.withings.wiscale2.device.scale.ui.b fragment, int i11) {
        u.j(fragment, "fragment");
        if (i11 == 0) {
            int I3 = I3();
            if (I3 != 5 && I3 != 6 && I3 != 13 && I3 != 15 && I3 != 17) {
                int i12 = com.withings.wiscale2.device.scale.ui.b.f54683k;
                SparseArray<b.c> sparseArray = this.f54670j;
                if (sparseArray != null) {
                    b.c cVar = sparseArray.get(3);
                    u.i(cVar, "get(...)");
                    J3(b.C0722b.a(cVar));
                    return;
                }
                u.s("tutorialContentList");
                throw null;
            }
            int i13 = com.withings.wiscale2.device.scale.ui.b.f54683k;
            SparseArray<b.c> sparseArray2 = this.f54670j;
            if (sparseArray2 != null) {
                b.c cVar2 = sparseArray2.get(2);
                u.i(cVar2, "get(...)");
                J3(b.C0722b.a(cVar2));
                return;
            }
            u.s("tutorialContentList");
            throw null;
        }
        int i14 = com.withings.wiscale2.device.scale.ui.b.f54683k;
        SparseArray<b.c> sparseArray3 = this.f54670j;
        if (sparseArray3 != null) {
            b.c cVar3 = sparseArray3.get(4);
            u.i(cVar3, "get(...)");
            J3(b.C0722b.a(cVar3));
            return;
        }
        u.s("tutorialContentList");
        throw null;
    }

    @Override // com.withings.wiscale2.device.scale.ui.c.a
    public final void d2(com.withings.wiscale2.device.scale.ui.c fragment) {
        u.j(fragment, "fragment");
        int I3 = I3();
        if (I3 != 5 && I3 != 6 && I3 != 13 && I3 != 15) {
            int i11 = com.withings.wiscale2.device.scale.ui.b.f54683k;
            SparseArray<b.c> sparseArray = this.f54670j;
            if (sparseArray != null) {
                b.c cVar = sparseArray.get(3);
                u.i(cVar, "get(...)");
                J3(b.C0722b.a(cVar));
                return;
            }
            u.s("tutorialContentList");
            throw null;
        }
        int i12 = com.withings.wiscale2.device.scale.ui.b.f54683k;
        SparseArray<b.c> sparseArray2 = this.f54670j;
        if (sparseArray2 != null) {
            b.c cVar2 = sparseArray2.get(2);
            u.i(cVar2, "get(...)");
            J3(b.C0722b.a(cVar2));
            return;
        }
        u.s("tutorialContentList");
        throw null;
    }

    @Override // com.withings.wiscale2.device.scale.ui.c.a
    public final void e1(com.withings.wiscale2.device.scale.ui.c fragment) {
        u.j(fragment, "fragment");
        Intent D3 = WeightGoalActivity.D3(this, (User) this.f54668h.getValue());
        D3.putExtra("EXTRA_REDIRECT_TO_MFP", false);
        startActivityForResult(D3, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        Serializable serializable;
        super.onActivityResult(i11, i12, intent);
        if (i11 == 0 && i12 == -1) {
            Serializable serializable2 = null;
            if (intent != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = intent.getSerializableExtra("weightGoal", WeightGoal.class);
                } else {
                    Serializable serializableExtra = intent.getSerializableExtra("weightGoal");
                    if (serializableExtra instanceof WeightGoal) {
                        serializable2 = serializableExtra;
                    }
                    serializable = (WeightGoal) serializable2;
                }
                serializable2 = (WeightGoal) serializable;
            }
            u.g(serializable2);
            com.withings.wiscale2.device.scale.ui.c cVar = new com.withings.wiscale2.device.scale.ui.c();
            Bundle bundle = new Bundle();
            bundle.putSerializable("GOAL_KEY", serializable2);
            cVar.setArguments(bundle);
            J3(cVar);
            this.f54667g = false;
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.o(!this.f54667g);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!this.f54667g) {
            if (getSupportFragmentManager().a0() > 1) {
                getSupportFragmentManager().C0();
            } else if (((Boolean) this.f54663c.getValue()).booleanValue()) {
                finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        setContentView(C1987R.layout.activity_scale_tutorial);
        getWindow().addFlags(128);
        Toolbar toolbar = (Toolbar) findViewById(C1987R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(!this.f54667g);
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.q(false);
        }
        u.g(toolbar);
        ay.b.n(toolbar, true, false, 29);
        BuildersKt__Builders_commonKt.launch$default(t.l(this), null, null, new com.withings.wiscale2.device.scale.ui.a(this, null), 3, null);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.withings.wiscale2.device.scale.ui.b.a
    public final void v1(com.withings.wiscale2.device.scale.ui.b fragment, int i11) {
        u.j(fragment, "fragment");
        if (i11 != 0) {
            switch (i11) {
                case 2:
                    int i12 = com.withings.wiscale2.device.scale.ui.b.f54683k;
                    SparseArray<b.c> sparseArray = this.f54670j;
                    if (sparseArray != null) {
                        b.c cVar = sparseArray.get(3);
                        u.i(cVar, "get(...)");
                        J3(b.C0722b.a(cVar));
                        return;
                    }
                    u.s("tutorialContentList");
                    throw null;
                case 3:
                    SparseArray<b.c> sparseArray2 = this.f54670j;
                    if (sparseArray2 != null) {
                        if (sparseArray2.indexOfKey(5) >= 0) {
                            int i13 = com.withings.wiscale2.device.scale.ui.b.f54683k;
                            SparseArray<b.c> sparseArray3 = this.f54670j;
                            if (sparseArray3 != null) {
                                b.c cVar2 = sparseArray3.get(5);
                                u.i(cVar2, "get(...)");
                                J3(b.C0722b.a(cVar2));
                                return;
                            }
                            u.s("tutorialContentList");
                            throw null;
                        }
                        int i14 = com.withings.wiscale2.device.scale.ui.b.f54683k;
                        SparseArray<b.c> sparseArray4 = this.f54670j;
                        if (sparseArray4 != null) {
                            b.c cVar3 = sparseArray4.get(4);
                            u.i(cVar3, "get(...)");
                            J3(b.C0722b.a(cVar3));
                            return;
                        }
                        u.s("tutorialContentList");
                        throw null;
                    }
                    u.s("tutorialContentList");
                    throw null;
                case 4:
                    SetupStateListener setupStateListener = (SetupStateListener) this.f54666f.getValue();
                    if (setupStateListener instanceof TutorialStateListener) {
                        ((Boolean) this.f54665e.getValue()).booleanValue();
                        ((TutorialStateListener) setupStateListener).N(this, (Device) this.f54664d.getValue());
                    }
                    finish();
                    return;
                case 5:
                    int i15 = com.withings.wiscale2.device.scale.ui.b.f54683k;
                    SparseArray<b.c> sparseArray5 = this.f54670j;
                    if (sparseArray5 != null) {
                        b.c cVar4 = sparseArray5.get(6);
                        u.i(cVar4, "get(...)");
                        J3(b.C0722b.a(cVar4));
                        return;
                    }
                    u.s("tutorialContentList");
                    throw null;
                case 6:
                    int i16 = com.withings.wiscale2.device.scale.ui.b.f54683k;
                    SparseArray<b.c> sparseArray6 = this.f54670j;
                    if (sparseArray6 != null) {
                        b.c cVar5 = sparseArray6.get(7);
                        u.i(cVar5, "get(...)");
                        J3(b.C0722b.a(cVar5));
                        return;
                    }
                    u.s("tutorialContentList");
                    throw null;
                case 7:
                    int i17 = com.withings.wiscale2.device.scale.ui.b.f54683k;
                    SparseArray<b.c> sparseArray7 = this.f54670j;
                    if (sparseArray7 != null) {
                        b.c cVar6 = sparseArray7.get(8);
                        u.i(cVar6, "get(...)");
                        J3(b.C0722b.a(cVar6));
                        return;
                    }
                    u.s("tutorialContentList");
                    throw null;
                case 8:
                    int i18 = com.withings.wiscale2.device.scale.ui.b.f54683k;
                    SparseArray<b.c> sparseArray8 = this.f54670j;
                    if (sparseArray8 != null) {
                        b.c cVar7 = sparseArray8.get(9);
                        u.i(cVar7, "get(...)");
                        J3(b.C0722b.a(cVar7));
                        return;
                    }
                    u.s("tutorialContentList");
                    throw null;
                case 9:
                    int i19 = com.withings.wiscale2.device.scale.ui.b.f54683k;
                    SparseArray<b.c> sparseArray9 = this.f54670j;
                    if (sparseArray9 != null) {
                        b.c cVar8 = sparseArray9.get(10);
                        u.i(cVar8, "get(...)");
                        J3(b.C0722b.a(cVar8));
                        return;
                    }
                    u.s("tutorialContentList");
                    throw null;
                case 10:
                    int i21 = com.withings.wiscale2.device.scale.ui.b.f54683k;
                    SparseArray<b.c> sparseArray10 = this.f54670j;
                    if (sparseArray10 != null) {
                        b.c cVar9 = sparseArray10.get(4);
                        u.i(cVar9, "get(...)");
                        J3(b.C0722b.a(cVar9));
                        return;
                    }
                    u.s("tutorialContentList");
                    throw null;
                default:
                    return;
            }
        }
        Intent D3 = WeightGoalActivity.D3(this, (User) this.f54668h.getValue());
        D3.putExtra("EXTRA_REDIRECT_TO_MFP", false);
        startActivityForResult(D3, 0);
    }
}
