package com.withings.wiscale2.partner.ui;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.google.android.gms.fitness.FitnessOptions;
import com.huawei.hms.hihealth.HuaweiHiHealth;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.exchanges.google.healthconnect.HealthConnect;
import com.withings.partner.model.Partner;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.partner.ui.d2;
import com.withings.wiscale2.partner.ui.f2;
import gi.j;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import x10.a;
/* compiled from: PartnerActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withings/wiscale2/partner/ui/PartnerActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lni0/a;", "Lcom/withings/wiscale2/partner/ui/c0;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PartnerActivity extends Hilt_PartnerActivity implements ni0.a, c0 {

    /* renamed from: e  reason: collision with root package name */
    private final f f58862e;

    /* renamed from: f  reason: collision with root package name */
    private final g f58863f;

    /* renamed from: g  reason: collision with root package name */
    private final h f58864g;

    /* renamed from: h  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f58865h;

    /* renamed from: i  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f58866i;
    @Inject

    /* renamed from: j  reason: collision with root package name */
    public a10.a f58867j;
    @Inject

    /* renamed from: k  reason: collision with root package name */
    public ch.d f58868k;

    /* renamed from: l  reason: collision with root package name */
    private Fragment f58869l;

    /* renamed from: m  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f58870m;

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f58871n;

    /* renamed from: o  reason: collision with root package name */
    private final androidx.constraintlayout.widget.b f58872o;

    /* renamed from: p  reason: collision with root package name */
    private final androidx.constraintlayout.widget.b f58873p;

    /* renamed from: r  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f58861r = {androidx.camera.core.v.c(PartnerActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(PartnerActivity.class, "partnerConsumerId", "getPartnerConsumerId()I", 0), androidx.camera.core.v.c(PartnerActivity.class, "isFitActivationFlow", "isFitActivationFlow()Z", 0), androidx.camera.core.v.c(PartnerActivity.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/ActivityPartnerBinding;", 0)};

    /* renamed from: q  reason: collision with root package name */
    public static final a f58860q = new Object();

    /* compiled from: PartnerActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(int i11, Context context, User user, boolean z5) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(user, "user");
            Intent putExtra = new Intent(context, PartnerActivity.class).putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user).putExtra("EXTRA_PARTNER_ID", i11).putExtra("EXTRA_IS_FIT_FLOW", z5);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartnerActivity.kt */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<com.google.android.material.bottomsheet.l, View, nm0.y> {

        /* compiled from: PartnerActivity.kt */
        /* loaded from: classes5.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ sm0.a<Partner> f58875a = sm0.b.a(Partner.values());
        }

        b() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(com.google.android.material.bottomsheet.l lVar, View view) {
            View customView = view;
            kotlin.jvm.internal.u.j(lVar, "<anonymous parameter 0>");
            kotlin.jvm.internal.u.j(customView, "customView");
            Iterator it = ((kotlin.collections.c) a.f58875a).iterator();
            while (it.hasNext()) {
                Partner partner = (Partner) it.next();
                int l5 = partner.l();
                PartnerActivity partnerActivity = PartnerActivity.this;
                if (l5 == partnerActivity.M3()) {
                    String string = partnerActivity.getString(C1987R.string.partner_permissions_exitDescription, partnerActivity.getString(partner.w()));
                    kotlin.jvm.internal.u.i(string, "getString(...)");
                    ((TextView) customView.findViewById(C1987R.id.description)).setText(string);
                    return nm0.y.f85009a;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* compiled from: PartnerActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            PartnerActivity.this.finish();
            return nm0.y.f85009a;
        }
    }

    /* compiled from: PartnerActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerActivity$huaweiSignInLauncher$1$1", f = "PartnerActivity.kt", l = {103}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f58877a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ActivityResult f58879c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ActivityResult activityResult, qm0.d<? super d> dVar) {
            super(2, dVar);
            this.f58879c = activityResult;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new d(this.f58879c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f58877a;
            PartnerActivity partnerActivity = PartnerActivity.this;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                x10.a aVar = x10.a.f106384a;
                Intent a11 = this.f58879c.a();
                this.f58877a = 1;
                obj = aVar.f(partnerActivity, a11, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                partnerActivity.finish();
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: PartnerActivity.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.l<f2.a, nm0.y> {
        e() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(f2.a aVar) {
            f2.a aVar2 = aVar;
            kotlin.jvm.internal.u.g(aVar2);
            PartnerActivity.G3(PartnerActivity.this, aVar2);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class f implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f58881a = nm0.h.b(new u(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f58882b;

        public f(Activity activity) {
            this.f58882b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f58881a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class g implements bn0.d<Activity, Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f58883a = nm0.h.b(new v(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f58884b;

        public g(Activity activity) {
            this.f58884b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Integer] */
        @Override // bn0.d
        public final Integer getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f58883a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class h implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f58885a = nm0.h.b(new w(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f58886b;

        public h(Activity activity) {
            this.f58886b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f58885a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.l<ComponentActivity, tb0.g0> {
        @Override // ym0.l
        public final tb0.g0 invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            kotlin.jvm.internal.u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.container);
            kotlin.jvm.internal.u.i(e11, "requireViewById(this, id)");
            return tb0.g0.a(e11);
        }
    }

    /* compiled from: PartnerActivity.kt */
    /* loaded from: classes5.dex */
    static final class j extends kotlin.jvm.internal.w implements ym0.a<f2> {
        j() {
            super(0);
        }

        @Override // ym0.a
        public final f2 invoke() {
            PartnerActivity partnerActivity = PartnerActivity.this;
            Application application = partnerActivity.getApplication();
            kotlin.jvm.internal.u.i(application, "getApplication(...)");
            User F3 = PartnerActivity.F3(partnerActivity);
            int M3 = partnerActivity.M3();
            boolean H3 = PartnerActivity.H3(partnerActivity);
            a10.a aVar = partnerActivity.f58867j;
            if (aVar != null) {
                t10.e a11 = t10.e.a();
                if (a11 != null) {
                    return new f2(application, partnerActivity, F3, M3, H3, aVar, a11);
                }
                throw new IllegalArgumentException("you must call init before using get".toString());
            }
            kotlin.jvm.internal.u.s("notificationRepository");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ym0.l, kotlin.jvm.internal.w] */
    public PartnerActivity() {
        super(0);
        this.f58862e = new f(this);
        this.f58863f = new g(this);
        this.f58864g = new h(this);
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new Object());
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f58865h = registerForActivityResult;
        androidx.activity.result.b<Intent> registerForActivityResult2 = registerForActivityResult(new g.a(), new wn.g(this, 1));
        kotlin.jvm.internal.u.i(registerForActivityResult2, "registerForActivityResult(...)");
        this.f58866i = registerForActivityResult2;
        this.f58870m = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new kotlin.jvm.internal.w(1));
        this.f58871n = nm0.h.b(new j());
        this.f58872o = new androidx.constraintlayout.widget.b();
        this.f58873p = new androidx.constraintlayout.widget.b();
    }

    public static void A3(PartnerActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.N3().z0(false);
    }

    public static void B3(PartnerActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        FrameLayout nextButtonContainer = this$0.L3().f99103c;
        kotlin.jvm.internal.u.i(nextButtonContainer, "nextButtonContainer");
        nextButtonContainer.setVisibility(0);
        this$0.N3().z0(true);
    }

    public static void C3(PartnerActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        FrameLayout nextButtonContainer = this$0.L3().f99103c;
        kotlin.jvm.internal.u.i(nextButtonContainer, "nextButtonContainer");
        nextButtonContainer.setVisibility(0);
    }

    public static void D3(PartnerActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        FrameLayout nextButtonContainer = this$0.L3().f99103c;
        kotlin.jvm.internal.u.i(nextButtonContainer, "nextButtonContainer");
        nextButtonContainer.setVisibility(0);
        this$0.N3().A0(new c());
    }

    public static final User F3(PartnerActivity partnerActivity) {
        partnerActivity.getClass();
        return (User) partnerActivity.f58862e.getValue(partnerActivity, f58861r[0]);
    }

    public static final void G3(PartnerActivity partnerActivity, f2.a aVar) {
        partnerActivity.getClass();
        if (kotlin.jvm.internal.u.e(aVar, f2.a.C0765a.f59022a)) {
            HealthConnect.f43375a.getClass();
            partnerActivity.f58865h.a(new Intent(HealthConnect.e()));
        } else if (kotlin.jvm.internal.u.e(aVar, f2.a.b.f59023a)) {
            x10.a aVar2 = x10.a.f106384a;
            a.e eVar = a.e.f106397a;
            Intent requestAuthorizationIntent = HuaweiHiHealth.getSettingController((Context) partnerActivity).requestAuthorizationIntent((String[]) a.e.b().toArray(new String[0]), true);
            kotlin.jvm.internal.u.i(requestAuthorizationIntent, "requestAuthorizationIntent(...)");
            partnerActivity.f58866i.a(requestAuthorizationIntent);
        }
    }

    public static final boolean H3(PartnerActivity partnerActivity) {
        return ((Boolean) partnerActivity.f58864g.getValue(partnerActivity, f58861r[2])).booleanValue();
    }

    public static final void I3(PartnerActivity partnerActivity, List list) {
        androidx.transition.w.a(partnerActivity.L3().f99102b, null);
        if (!list.isEmpty()) {
            partnerActivity.f58873p.e(partnerActivity.L3().f99102b);
            return;
        }
        partnerActivity.f58872o.e(partnerActivity.L3().f99102b);
    }

    public static final void J3(PartnerActivity partnerActivity, Partner partner, d2 d2Var) {
        Fragment k1Var;
        partnerActivity.getClass();
        User user = (User) partnerActivity.f58862e.getValue(partnerActivity, f58861r[0]);
        d2Var.getClass();
        kotlin.jvm.internal.u.j(partner, "partner");
        kotlin.jvm.internal.u.j(user, "user");
        if ((d2Var instanceof d2.g) || (d2Var instanceof d2.f) || (d2Var instanceof d2.a)) {
            k1.f59134o.getClass();
            k1Var = new k1();
            k1Var.setArguments(androidx.core.os.e.a(new nm0.j("ARG_USER", user), new nm0.j("ARG_PARTNER", partner)));
        } else if (d2Var instanceof d2.c) {
            e0.f58960f.getClass();
            k1Var = new e0();
            k1Var.setArguments(androidx.core.os.e.a(new nm0.j("ARG_USER", user), new nm0.j("ARG_PARTNER", partner)));
        } else if (d2Var instanceof d2.b) {
            z.f59245g.getClass();
            k1Var = new z();
            k1Var.setArguments(androidx.core.os.e.a(new nm0.j("EXTRA_USER", user), new nm0.j("EXTRA_PARTNER", partner)));
        } else if (d2Var instanceof d2.e) {
            com.withings.wiscale2.partner.ui.i.f59101g.getClass();
            k1Var = new com.withings.wiscale2.partner.ui.i();
            k1Var.setArguments(androidx.core.os.e.a(new nm0.j("ARG_USER", user), new nm0.j("ARG_PARTNER", partner)));
        } else if (d2Var instanceof d2.d) {
            k1Var = new com.withings.wiscale2.partner.ui.h();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        partnerActivity.f58869l = k1Var;
        androidx.fragment.app.m0 m11 = partnerActivity.getSupportFragmentManager().m();
        m11.m(C1987R.anim.in_from_right, C1987R.anim.out_to_left, C1987R.anim.in_from_left, C1987R.anim.out_to_right);
        Fragment fragment = partnerActivity.f58869l;
        if (fragment != null) {
            m11.l(C1987R.id.content, fragment, null);
            m11.f();
            return;
        }
        kotlin.jvm.internal.u.s("fragment");
        throw null;
    }

    private final void K3() {
        List<? extends u10.u> value = N3().G0().getValue();
        if (value != null && !value.isEmpty()) {
            FrameLayout nextButtonContainer = L3().f99103c;
            kotlin.jvm.internal.u.i(nextButtonContainer, "nextButtonContainer");
            nextButtonContainer.setVisibility(8);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            kotlin.jvm.internal.u.i(supportFragmentManager, "getSupportFragmentManager(...)");
            j.a aVar = new j.a(supportFragmentManager);
            aVar.y(getString(C1987R.string.googleFit_permissions_exitTitle));
            aVar.v(C1987R.layout.bottom_sheet_partner_permissions, new b());
            String string = getString(C1987R.string._ALLOW_);
            kotlin.jvm.internal.u.i(string, "getString(...)");
            aVar.w(new gi.l(string, new dq.a(this, 10)));
            String string2 = getString(C1987R.string._DISCARD_);
            kotlin.jvm.internal.u.i(string2, "getString(...)");
            aVar.t(new gi.l(string2, new gi.e(this, 10)));
            aVar.u(new p40.c(this, 1));
            aVar.x();
            return;
        }
        finish();
    }

    private final tb0.g0 L3() {
        Object value = ((LifecycleViewBindingProperty) this.f58870m).getValue(this, f58861r[3]);
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (tb0.g0) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int M3() {
        return ((Number) this.f58863f.getValue(this, f58861r[1])).intValue();
    }

    private final f2 N3() {
        return (f2) this.f58871n.getValue();
    }

    public static void z3(PartnerActivity this$0, ActivityResult activityResult) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this$0), null, null, new d(activityResult, null), 3, null);
    }

    public final void O3() {
        N3().W0(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        boolean z5 = false;
        if (i11 != 4097) {
            if (i11 == 4100) {
                f2 N3 = N3();
                if (i12 == -1) {
                    z5 = true;
                }
                N3.V0(z5);
                return;
            }
            return;
        }
        f2 N32 = N3();
        if (i12 == -1) {
            z5 = true;
        }
        N32.W0(z5);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        K3();
    }

    @Override // com.withings.wiscale2.partner.ui.Hilt_PartnerActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.core.view.l1.a(getWindow(), false);
        ConstraintLayout constraintLayout = L3().f99102b;
        androidx.constraintlayout.widget.b bVar = this.f58872o;
        bVar.k(constraintLayout);
        androidx.constraintlayout.widget.b bVar2 = this.f58873p;
        bVar2.l(bVar);
        bVar2.j(C1987R.id.next_button_container, 3);
        bVar2.n(C1987R.id.next_button_container, 4, 0, 4);
        f2 N3 = N3();
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new p(N3, this, null), 3, null);
        N3.O0().observe(this, new x(new q(this)));
        N3.G0().observe(this, new x(new r(this)));
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new s(N3, this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new t(N3, this, null), 3, null);
        View findViewById = findViewById(C1987R.id.next_button_container);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        ay.b.n(findViewById, false, true, 23);
        tb0.g0 L3 = L3();
        L3.f99101a.setOnClickListener(new sg.g(this, 17));
        N3().F0().observe(this, new x(new e()));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == 16908332) {
            K3();
        }
        return super.onOptionsItemSelected(item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (N3().R0()) {
            androidx.fragment.app.m0 m11 = getSupportFragmentManager().m();
            Fragment fragment = this.f58869l;
            if (fragment != null) {
                m11.k(fragment);
                m11.h();
            } else {
                kotlin.jvm.internal.u.s("fragment");
                throw null;
            }
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i11, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.u.j(permissions, "permissions");
        kotlin.jvm.internal.u.j(grantResults, "grantResults");
        super.onRequestPermissionsResult(i11, permissions, grantResults);
        if (i11 == 4100) {
            int length = grantResults.length;
            boolean z5 = false;
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    if (grantResults[i12] != 0) {
                        break;
                    }
                    i12++;
                } else {
                    z5 = true;
                    break;
                }
            }
            N3().V0(z5);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        N3().X0();
    }

    @Override // com.withings.wiscale2.partner.ui.c0
    public final void r0() {
        if (M3() == Partner.f43456n.l()) {
            f2 N3 = N3();
            FitnessOptions build = FitnessOptions.builder().build();
            kotlin.jvm.internal.u.i(build, "build(...)");
            N3.Y0(build);
            return;
        }
        x70.b.d(this, androidx.camera.camera2.internal.o0.a("resolve for partner id ", M3(), " is not handled by PartnerActivity"), new Object[0]);
    }
}
