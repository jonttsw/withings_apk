package com.withings.wiscale2.device.common.tutorial.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.v;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.l0;
import androidx.navigation.e;
import androidx.navigation.t;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.google.android.material.button.MaterialButton;
import com.withings.android.activity.WithingsActivity;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import tb0.e0;
import un.o;
/* compiled from: MediaTutorialActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/device/common/tutorial/media/MediaTutorialActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Landroidx/navigation/e$b;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class MediaTutorialActivity extends WithingsActivity implements e.b {

    /* renamed from: a  reason: collision with root package name */
    private final e f53589a;

    /* renamed from: b  reason: collision with root package name */
    private final f f53590b;

    /* renamed from: c  reason: collision with root package name */
    private final g f53591c;

    /* renamed from: d  reason: collision with root package name */
    private final h f53592d;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f53593e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f53594f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f53595g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f53596h;

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f53597i;

    /* renamed from: j  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f53598j;

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f53599k;

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f53588m = {v.c(MediaTutorialActivity.class, "navigationGraphResId", "getNavigationGraphResId()I", 0), v.c(MediaTutorialActivity.class, "startDestinationId", "getStartDestinationId()I", 0), v.c(MediaTutorialActivity.class, "navigationActionMapResId", "getNavigationActionMapResId()Ljava/util/HashMap;", 0), v.c(MediaTutorialActivity.class, "tutorialId", "getTutorialId()Ljava/lang/Integer;", 0), v.c(MediaTutorialActivity.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/ActivityMediaTutorialBinding;", 0)};

    /* renamed from: l  reason: collision with root package name */
    public static final a f53587l = new Object();

    /* compiled from: MediaTutorialActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(a aVar, Context context, Map map, int i11, String str) {
            aVar.getClass();
            u.j(context, "context");
            Intent putExtra = new Intent(context, MediaTutorialActivity.class).putExtra("EXTRA_NAVIGATION_GRAPH", C1987R.navigation.vascular_age_feature_nav_graph).putExtra("EXTRA_NAVIGATION_ACTION_MAP", (Serializable) map).putExtra("EXTRA_START_DESTINATION", i11).putExtra("EXTRA_TUTORIAL_ID", 6).putExtra("EXTRA_ANALYTICS_FLOW_NAME", (String) null).putExtra("EXTRA_WARNING_ITEM_ID", str);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: MediaTutorialActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<String> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final String invoke() {
            return MediaTutorialActivity.this.getIntent().getStringExtra("EXTRA_ANALYTICS_FLOW_NAME");
        }
    }

    /* compiled from: MediaTutorialActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.a<androidx.navigation.e> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final androidx.navigation.e invoke() {
            return b50.b.d(MediaTutorialActivity.this, C1987R.id.nav_host_fragment);
        }
    }

    /* compiled from: MediaTutorialActivity.kt */
    /* loaded from: classes5.dex */
    static final class d implements l0, p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f53602a;

        d(ym0.l lVar) {
            this.f53602a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof l0) || !(obj instanceof p)) {
                return false;
            }
            return u.e(this.f53602a, ((p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f53602a;
        }

        public final int hashCode() {
            return this.f53602a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f53602a.invoke(obj);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class e implements bn0.d<Activity, Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f53603a = nm0.h.b(new com.withings.wiscale2.device.common.tutorial.media.f(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f53604b;

        public e(Activity activity) {
            this.f53604b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Integer] */
        @Override // bn0.d
        public final Integer getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f53603a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class f implements bn0.d<Activity, Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f53605a = nm0.h.b(new com.withings.wiscale2.device.common.tutorial.media.g(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f53606b;

        public f(Activity activity) {
            this.f53606b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Integer] */
        @Override // bn0.d
        public final Integer getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f53605a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class g implements bn0.d<Activity, HashMap<Integer, Integer>> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f53607a = nm0.h.b(new com.withings.wiscale2.device.common.tutorial.media.h(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f53608b;

        public g(Activity activity) {
            this.f53608b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.util.HashMap<java.lang.Integer, java.lang.Integer>, java.lang.Object] */
        @Override // bn0.d
        public final HashMap<Integer, Integer> getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f53607a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class h implements bn0.d<Activity, Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f53609a = nm0.h.b(new com.withings.wiscale2.device.common.tutorial.media.i(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f53610b;

        public h(Activity activity) {
            this.f53610b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Integer] */
        @Override // bn0.d
        public final Integer getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f53609a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class i extends w implements ym0.l<ComponentActivity, e0> {
        @Override // ym0.l
        public final e0 invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.root);
            u.i(e11, "requireViewById(this, id)");
            return e0.a(e11);
        }
    }

    /* compiled from: MediaTutorialActivity.kt */
    /* loaded from: classes5.dex */
    static final class j extends w implements ym0.a<vc0.b> {
        j() {
            super(0);
        }

        @Override // ym0.a
        public final vc0.b invoke() {
            return MediaTutorialActivity.H3(MediaTutorialActivity.this);
        }
    }

    /* compiled from: MediaTutorialActivity.kt */
    /* loaded from: classes5.dex */
    static final class k extends w implements ym0.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f53612a = new w(0);

        @Override // ym0.a
        public final Long invoke() {
            User f11 = m70.i.b().f();
            if (f11 != null) {
                return Long.valueOf(f11.q());
            }
            return null;
        }
    }

    /* compiled from: MediaTutorialActivity.kt */
    /* loaded from: classes5.dex */
    static final class l extends w implements ym0.a<wc0.e> {
        l() {
            super(0);
        }

        @Override // ym0.a
        public final wc0.e invoke() {
            MediaTutorialActivity mediaTutorialActivity = MediaTutorialActivity.this;
            Application application = mediaTutorialActivity.getApplication();
            u.i(application, "getApplication(...)");
            Integer E3 = MediaTutorialActivity.E3(mediaTutorialActivity);
            vc0.b D3 = MediaTutorialActivity.D3(mediaTutorialActivity);
            Long F3 = MediaTutorialActivity.F3(mediaTutorialActivity);
            String C3 = MediaTutorialActivity.C3(mediaTutorialActivity);
            MediaTutorialActivity.G3(mediaTutorialActivity);
            return new wc0.e(application, E3, D3, F3, C3);
        }
    }

    /* compiled from: MediaTutorialActivity.kt */
    /* loaded from: classes5.dex */
    static final class m extends w implements ym0.a<String> {
        m() {
            super(0);
        }

        @Override // ym0.a
        public final String invoke() {
            return MediaTutorialActivity.this.getIntent().getStringExtra("EXTRA_WARNING_ITEM_ID");
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public MediaTutorialActivity() {
        super(C1987R.layout.activity_media_tutorial);
        this.f53589a = new e(this);
        this.f53590b = new f(this);
        this.f53591c = new g(this);
        this.f53592d = new h(this);
        this.f53593e = nm0.h.b(new j());
        this.f53594f = nm0.h.b(k.f53612a);
        this.f53595g = nm0.h.b(new b());
        this.f53596h = nm0.h.b(new m());
        this.f53597i = nm0.h.b(new c());
        this.f53598j = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new w(1));
        this.f53599k = nm0.h.b(new l());
    }

    public static final void A3(MediaTutorialActivity mediaTutorialActivity, vc0.d dVar) {
        int i11;
        MaterialButton materialButton = mediaTutorialActivity.K3().f99011e;
        u.g(materialButton);
        if (dVar != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        materialButton.setVisibility(i11);
        if (dVar != null) {
            materialButton.setText(dVar.b());
        }
        materialButton.setOnClickListener(new o(2, dVar, mediaTutorialActivity));
    }

    public static final String C3(MediaTutorialActivity mediaTutorialActivity) {
        return (String) mediaTutorialActivity.f53595g.getValue();
    }

    public static final vc0.b D3(MediaTutorialActivity mediaTutorialActivity) {
        return (vc0.b) mediaTutorialActivity.f53593e.getValue();
    }

    public static final Integer E3(MediaTutorialActivity mediaTutorialActivity) {
        mediaTutorialActivity.getClass();
        return (Integer) mediaTutorialActivity.f53592d.getValue(mediaTutorialActivity, f53588m[3]);
    }

    public static final Long F3(MediaTutorialActivity mediaTutorialActivity) {
        return (Long) mediaTutorialActivity.f53594f.getValue();
    }

    public static final String G3(MediaTutorialActivity mediaTutorialActivity) {
        return (String) mediaTutorialActivity.f53596h.getValue();
    }

    public static final vc0.b H3(MediaTutorialActivity mediaTutorialActivity) {
        Object parcelableExtra;
        Object aVar;
        Intent intent = mediaTutorialActivity.getIntent();
        u.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("EXTRA_TUTORIAL", vc0.b.class);
        } else {
            parcelableExtra = intent.getParcelableExtra("EXTRA_TUTORIAL");
        }
        fn0.k<Object>[] kVarArr = f53588m;
        fn0.k<Object> kVar = kVarArr[3];
        h hVar = mediaTutorialActivity.f53592d;
        Integer num = (Integer) hVar.getValue(mediaTutorialActivity, kVar);
        if (num != null) {
            int intValue = num.intValue();
            if (parcelableExtra == null) {
                try {
                    switch (intValue) {
                        case 0:
                            aVar = new nf0.a();
                            parcelableExtra = aVar;
                            break;
                        case 1:
                            aVar = new fi0.h();
                            parcelableExtra = aVar;
                            break;
                        case 2:
                            aVar = new nj0.d();
                            parcelableExtra = aVar;
                            break;
                        case 3:
                            aVar = new gi0.b();
                            parcelableExtra = aVar;
                            break;
                        case 4:
                            aVar = new fi0.a();
                            parcelableExtra = aVar;
                            break;
                        case 5:
                            aVar = new com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.g();
                            parcelableExtra = aVar;
                            break;
                        case 6:
                            parcelableExtra = kc0.b.f75846a;
                            break;
                        default:
                            throw new IllegalArgumentException("Unknown tutorial");
                    }
                } catch (Exception e11) {
                    x70.b.d(mediaTutorialActivity, "Unknown tutorial with id " + ((Integer) hVar.getValue(mediaTutorialActivity, kVarArr[3])), e11.toString());
                }
            }
        }
        return (vc0.b) parcelableExtra;
    }

    public static final void I3(MediaTutorialActivity mediaTutorialActivity, boolean z5) {
        int i11;
        ProgressBar loading = mediaTutorialActivity.K3().f99008b;
        u.i(loading, "loading");
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        loading.setVisibility(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e0 K3() {
        Object value = ((LifecycleViewBindingProperty) this.f53598j).getValue(this, f53588m[4]);
        u.i(value, "getValue(...)");
        return (e0) value;
    }

    private final HashMap<Integer, Integer> L3() {
        return this.f53591c.getValue(this, f53588m[2]);
    }

    private final wc0.e M3() {
        return (wc0.e) this.f53599k.getValue();
    }

    public static final void z3(MediaTutorialActivity mediaTutorialActivity, vc0.d dVar) {
        MaterialButton materialButton = mediaTutorialActivity.K3().f99009c;
        if (dVar != null) {
            materialButton.setText(dVar.b());
        }
        materialButton.setOnClickListener(new uk.a(2, dVar, mediaTutorialActivity));
    }

    public final void J3() {
        M3().q0();
        finish();
    }

    public final void N3() {
        Integer num;
        nm0.g gVar = this.f53597i;
        t y11 = ((androidx.navigation.e) gVar.getValue()).y();
        if (y11 != null) {
            num = Integer.valueOf(y11.r());
        } else {
            num = null;
        }
        if (num != null && L3().containsKey(num)) {
            Integer num2 = L3().get(num);
            if (num2 != null) {
                ((androidx.navigation.e) gVar.getValue()).H(num2.intValue(), null);
                return;
            } else {
                finish();
                return;
            }
        }
        finish();
    }

    public final void O3(vc0.d dVar) {
        M3().g0().postValue(dVar);
    }

    public final void P3(vc0.d dVar) {
        M3().j0().postValue(dVar);
    }

    @Override // androidx.navigation.e.b
    public final void X0(androidx.navigation.e controller, t destination, Bundle bundle) {
        u.j(controller, "controller");
        u.j(destination, "destination");
        boolean z5 = true;
        M3().r0(!L3().containsKey(Integer.valueOf(destination.r())));
        if (destination.r() != controller.A().N()) {
            z5 = false;
        }
        CharSequence s11 = destination.s();
        if (s11 != null) {
            M3().p0(s11);
        }
        MaterialButton secondaryButton = K3().f99011e;
        u.i(secondaryButton, "secondaryButton");
        secondaryButton.setVisibility(8);
        M3().t0(z5);
        if (z5) {
            M3().y0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Toolbar toolbar = K3().f99012f;
        u.i(toolbar, "toolbar");
        ay.b.m(toolbar, true, false, 29);
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(false);
            supportActionBar.o(true);
            Context context = toolbar.getContext();
            u.i(context, "getContext(...)");
            int w11 = ah.u.w(C1987R.attr.colorOnBackground, context, -65281);
            Context context2 = toolbar.getContext();
            u.i(context2, "getContext(...)");
            supportActionBar.s(y70.a.c(C1987R.drawable.icon_medium_navigation_close, context2, w11));
        }
        e0 K3 = K3();
        ConstraintLayout root = K3.f99010d;
        u.i(root, "root");
        ay.b.t(root);
        View hackSpacingBottom = K3.f99007a;
        u.i(hackSpacingBottom, "hackSpacingBottom");
        ay.b.m(hackSpacingBottom, false, true, 23);
        K3.f99009c.setOnClickListener(new com.google.android.material.search.g(this, 9));
        M3().m0().observe(this, new d(new com.withings.wiscale2.device.common.tutorial.media.a(this)));
        M3().g0().observe(this, new d(new com.withings.wiscale2.device.common.tutorial.media.b(this)));
        M3().j0().observe(this, new d(new com.withings.wiscale2.device.common.tutorial.media.c(this)));
        M3().i0().observe(this, new d(new com.withings.wiscale2.device.common.tutorial.media.d(this)));
        M3().k0().observe(this, new d(new com.withings.wiscale2.device.common.tutorial.media.e(this)));
        androidx.navigation.e eVar = (androidx.navigation.e) this.f53597i.getValue();
        fn0.k<Object>[] kVarArr = f53588m;
        fn0.k<Object> kVar = kVarArr[1];
        f fVar = this.f53590b;
        int intValue = ((Number) fVar.getValue(this, kVar)).intValue();
        e eVar2 = this.f53589a;
        if (intValue != -1 && L3().keySet().contains(Integer.valueOf(((Number) fVar.getValue(this, kVarArr[1])).intValue()))) {
            androidx.navigation.v b10 = eVar.C().b(((Number) eVar2.getValue(this, kVarArr[0])).intValue());
            b10.Q(b10.N());
            eVar.a0(b10, null);
        } else {
            eVar.a0(eVar.C().b(((Number) eVar2.getValue(this, kVarArr[0])).intValue()), null);
        }
        eVar.p(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        ((androidx.navigation.e) this.f53597i.getValue()).W(this);
        super.onDestroy();
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
