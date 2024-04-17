package com.withings.ecg.details;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.withings.ecg.core.HeartDiagnostic;
import com.withings.ecg.details.b0;
import com.withings.ecg.details.g;
import com.withings.ecg.model.HeartDiagnosticUIKt;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
/* compiled from: EcgResultActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/ecg/details/EcgResultActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class EcgResultActivity extends Hilt_EcgResultActivity {
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public w0 f38026e;

    /* renamed from: f  reason: collision with root package name */
    private final e f38027f;

    /* renamed from: g  reason: collision with root package name */
    private final f f38028g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f38029h;

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f38030i;

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f38031j;

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f38032k;

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f38025m = {androidx.camera.core.v.c(EcgResultActivity.class, "ecgId", "getEcgId()J", 0), androidx.camera.core.v.c(EcgResultActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0)};

    /* renamed from: l  reason: collision with root package name */
    public static final a f38024l = new Object();

    /* compiled from: EcgResultActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* compiled from: EcgResultActivity.kt */
    /* loaded from: classes3.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<AppBarLayout> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final AppBarLayout invoke() {
            return (AppBarLayout) EcgResultActivity.this.findViewById(C1987R.id.app_bar);
        }
    }

    /* compiled from: EcgResultActivity.kt */
    /* loaded from: classes3.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<Button> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Button invoke() {
            return (Button) EcgResultActivity.this.findViewById(C1987R.id.summary_close);
        }
    }

    /* compiled from: EcgResultActivity.kt */
    /* loaded from: classes3.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<Button> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final Button invoke() {
            return (Button) EcgResultActivity.this.findViewById(C1987R.id.summary_retry);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class e implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f38036a = nm0.h.b(new k2(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f38037b;

        public e(Activity activity) {
            this.f38037b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f38036a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class f implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f38038a = nm0.h.b(new l2(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f38039b;

        public f(Activity activity) {
            this.f38039b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f38038a.getValue();
        }
    }

    /* compiled from: EcgResultActivity.kt */
    /* loaded from: classes3.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<Toolbar> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final Toolbar invoke() {
            return (Toolbar) EcgResultActivity.this.findViewById(C1987R.id.ecg_details_toolbar);
        }
    }

    public EcgResultActivity() {
        super(0);
        this.f38027f = new e(this);
        this.f38028g = new f(this);
        this.f38029h = nm0.h.b(new g());
        this.f38030i = nm0.h.b(new b());
        this.f38031j = nm0.h.b(new c());
        this.f38032k = nm0.h.b(new d());
    }

    public static final Button A3(EcgResultActivity ecgResultActivity) {
        return (Button) ecgResultActivity.f38032k.getValue();
    }

    public static final User B3(EcgResultActivity ecgResultActivity) {
        ecgResultActivity.getClass();
        return (User) ecgResultActivity.f38028g.getValue(ecgResultActivity, f38025m[1]);
    }

    public static final void C3(EcgResultActivity ecgResultActivity, b0.a aVar) {
        boolean z5;
        ecgResultActivity.getClass();
        if (aVar.a() != 11 && aVar.a() != 9) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (aVar.a() == 12 || aVar.a() == 13) {
            HeartDiagnostic heartDiagnostic = aVar.c().getHeartDiagnostic();
            HeartDiagnostic heartDiagnostic2 = HeartDiagnostic.f37986c;
            if (heartDiagnostic == heartDiagnostic2) {
                ecgResultActivity.D3(HeartDiagnosticUIKt.toUI(heartDiagnostic2).getColorRes());
                return;
            }
        }
        if (z5) {
            ecgResultActivity.D3(HeartDiagnosticUIKt.toUI(HeartDiagnostic.f37985b).getColorRes());
        } else {
            ecgResultActivity.D3(aVar.c().getColorRes());
        }
    }

    private final void D3(int i11) {
        int color = androidx.core.content.a.getColor(this, i11);
        ((AppBarLayout) this.f38030i.getValue()).setBackgroundColor(color);
        com.withings.wiscale2.device.hwa08.postinstall.b0.s(this, false, color);
        int color2 = androidx.core.content.a.getColor(this, androidx.health.connect.client.units.d.b(i11));
        nm0.g gVar = this.f38029h;
        ((Toolbar) gVar.getValue()).setTitleTextColor(color2);
        Drawable navigationIcon = ((Toolbar) gVar.getValue()).getNavigationIcon();
        if (navigationIcon != null) {
            Drawable mutate = navigationIcon.mutate();
            kotlin.jvm.internal.u.i(mutate, "wrap(...)");
            androidx.core.graphics.drawable.a.l(mutate, color2);
            ((Toolbar) gVar.getValue()).setNavigationIcon(mutate);
        }
    }

    public static final long z3(EcgResultActivity ecgResultActivity) {
        ecgResultActivity.getClass();
        return ((Number) ecgResultActivity.f38027f.getValue(ecgResultActivity, f38025m[0])).longValue();
    }

    @Override // com.withings.ecg.details.Hilt_EcgResultActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.core.view.l1.a(getWindow(), false);
        setSupportActionBar((Toolbar) this.f38029h.getValue());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.p(true);
            supportActionBar.o(true);
            supportActionBar.q(true);
        }
        View findViewById = findViewById(C1987R.id.root);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        ay.b.n(findViewById, true, false, 29);
        View findViewById2 = findViewById(C1987R.id.summary_actions);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        ay.b.n(findViewById2, false, true, 23);
        g.a aVar = com.withings.ecg.details.g.f38200q;
        fn0.k<Object>[] kVarArr = f38025m;
        com.withings.ecg.details.g a11 = g.a.a(aVar, ((User) this.f38028g.getValue(this, kVarArr[1])).q(), ((Number) this.f38027f.getValue(this, kVarArr[0])).longValue(), true, null, 8);
        androidx.fragment.app.m0 m11 = getSupportFragmentManager().m();
        m11.l(C1987R.id.fragment_container, a11, null);
        m11.f();
        b0 b0Var = (b0) new androidx.lifecycle.k1(this, new g2(this)).a(b0.class);
        xw.d.c(this, b0Var.F0(), new h2(this));
        xw.d.c(this, b0Var.G0(), new j2(this));
        ((Button) this.f38031j.getValue()).setOnClickListener(new gi.i(this, 2));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
