package com.withings.wiscale2.device.common.tutorial;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.v;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.l1;
import androidx.lifecycle.l0;
import androidx.viewpager.widget.ViewPager;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.google.android.material.appbar.AppBarLayout;
import com.withings.android.activity.WithingsActivity;
import com.withings.authentication.n;
import com.withings.common.device.TutorialStateListener;
import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.tutorial.f;
import com.withings.wiscale2.device.common.tutorial.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import tb0.u0;
/* compiled from: LegacyTutorialActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/common/tutorial/LegacyTutorialActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LegacyTutorialActivity extends WithingsActivity {

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f53520a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f53521b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f53522c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f53523d;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f53524e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f53525f;

    /* renamed from: g  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f53526g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f53527h;

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f53528i;

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f53529j;

    /* renamed from: l  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f53519l = {v.c(LegacyTutorialActivity.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/ActivityTutorialV2Binding;", 0)};

    /* renamed from: k  reason: collision with root package name */
    public static final a f53518k = new Object();

    /* compiled from: LegacyTutorialActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context, int i11, boolean z5, Long l5) {
            Intent putExtra = n.a(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, context, LegacyTutorialActivity.class).putExtra("EXTRA_KEY_USER_ID", l5).putExtra("EXTRA_KEY_TUTORIAL_ID", i11).putExtra("EXTRA_KEY_ALLOW_BACK", z5);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: LegacyTutorialActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<Device> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final Device invoke() {
            Object obj;
            Intent intent = LegacyTutorialActivity.this.getIntent();
            u.i(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                obj = intent.getSerializableExtra("EXTRA_KEY_DEVICE", Device.class);
            } else {
                Object serializableExtra = intent.getSerializableExtra("EXTRA_KEY_DEVICE");
                if (!(serializableExtra instanceof Device)) {
                    serializableExtra = null;
                }
                obj = (Device) serializableExtra;
            }
            return (Device) obj;
        }
    }

    /* compiled from: LegacyTutorialActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.a<Boolean> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(LegacyTutorialActivity.this.getIntent().getBooleanExtra("EXTRA_KEY_AFTER_INSTALL", false));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LegacyTutorialActivity.kt */
    /* loaded from: classes5.dex */
    public static final class d implements l0, p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f53532a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(ym0.l lVar) {
            this.f53532a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof l0) || !(obj instanceof p)) {
                return false;
            }
            return u.e(this.f53532a, ((p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f53532a;
        }

        public final int hashCode() {
            return this.f53532a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f53532a.invoke(obj);
        }
    }

    /* compiled from: LegacyTutorialActivity.kt */
    /* loaded from: classes5.dex */
    static final class e extends w implements ym0.a<Boolean> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(LegacyTutorialActivity.this.getIntent().getBooleanExtra("EXTRA_KEY_ALLOW_BACK", true));
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class f extends w implements ym0.l<ComponentActivity, u0> {
        @Override // ym0.l
        public final u0 invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.root);
            u.i(e11, "requireViewById(this, id)");
            return u0.a(e11);
        }
    }

    /* compiled from: LegacyTutorialActivity.kt */
    /* loaded from: classes5.dex */
    static final class g extends w implements ym0.a<TutorialStateListener> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final TutorialStateListener invoke() {
            Object parcelableExtra;
            Intent intent = LegacyTutorialActivity.this.getIntent();
            u.i(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = intent.getParcelableExtra("EXTRA_KEY_STATE_LISTENER", TutorialStateListener.class);
            } else {
                parcelableExtra = intent.getParcelableExtra("EXTRA_KEY_STATE_LISTENER");
            }
            return (TutorialStateListener) parcelableExtra;
        }
    }

    /* compiled from: LegacyTutorialActivity.kt */
    /* loaded from: classes5.dex */
    static final class h extends w implements ym0.a<vc0.b> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final vc0.b invoke() {
            switch (LegacyTutorialActivity.I3(LegacyTutorialActivity.this)) {
                case 0:
                    return new nf0.a();
                case 1:
                    return new fi0.h();
                case 2:
                    return new nj0.d();
                case 3:
                    return new gi0.b();
                case 4:
                    return new fi0.a();
                case 5:
                    return new com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.g();
                case 6:
                    return kc0.b.f75846a;
                default:
                    throw new IllegalArgumentException("Unknown tutorial");
            }
        }
    }

    /* compiled from: LegacyTutorialActivity.kt */
    /* loaded from: classes5.dex */
    static final class i extends w implements ym0.a<Integer> {
        i() {
            super(0);
        }

        @Override // ym0.a
        public final Integer invoke() {
            return Integer.valueOf(LegacyTutorialActivity.this.getIntent().getIntExtra("EXTRA_KEY_TUTORIAL_ID", -1));
        }
    }

    /* compiled from: LegacyTutorialActivity.kt */
    /* loaded from: classes5.dex */
    static final class j extends w implements ym0.a<List<? extends vc0.c>> {
        j() {
            super(0);
        }

        @Override // ym0.a
        public final List<? extends vc0.c> invoke() {
            List<com.withings.wiscale2.device.common.tutorial.i> b10 = LegacyTutorialActivity.H3(LegacyTutorialActivity.this).b();
            ArrayList arrayList = new ArrayList(x.y(b10, 10));
            for (com.withings.wiscale2.device.common.tutorial.i content : b10) {
                int i11 = vc0.c.f103596d;
                u.j(content, "content");
                vc0.c cVar = new vc0.c();
                Bundle bundle = new Bundle();
                bundle.putSerializable("KEY_CONTENT", content);
                cVar.setArguments(bundle);
                arrayList.add(cVar);
            }
            return arrayList;
        }
    }

    /* compiled from: LegacyTutorialActivity.kt */
    /* loaded from: classes5.dex */
    static final class k extends w implements ym0.a<Long> {
        k() {
            super(0);
        }

        @Override // ym0.a
        public final Long invoke() {
            long longExtra = LegacyTutorialActivity.this.getIntent().getLongExtra("EXTRA_KEY_USER_ID", -1L);
            Long valueOf = Long.valueOf(longExtra);
            if (longExtra == -1) {
                return null;
            }
            return valueOf;
        }
    }

    /* compiled from: LegacyTutorialActivity.kt */
    /* loaded from: classes5.dex */
    static final class l extends w implements ym0.a<com.withings.wiscale2.device.common.tutorial.f> {
        l() {
            super(0);
        }

        @Override // ym0.a
        public final com.withings.wiscale2.device.common.tutorial.f invoke() {
            LegacyTutorialActivity legacyTutorialActivity = LegacyTutorialActivity.this;
            Application application = legacyTutorialActivity.getApplication();
            u.i(application, "getApplication(...)");
            return new com.withings.wiscale2.device.common.tutorial.f(application, LegacyTutorialActivity.K3(legacyTutorialActivity), LegacyTutorialActivity.F3(legacyTutorialActivity), LegacyTutorialActivity.L3(legacyTutorialActivity), LegacyTutorialActivity.G3(legacyTutorialActivity), LegacyTutorialActivity.H3(legacyTutorialActivity).b(), g.a.a(legacyTutorialActivity, LegacyTutorialActivity.I3(legacyTutorialActivity), LegacyTutorialActivity.K3(legacyTutorialActivity)));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public LegacyTutorialActivity() {
        super(C1987R.layout.activity_tutorial_v2);
        this.f53520a = nm0.h.b(new k());
        this.f53521b = nm0.h.b(new b());
        this.f53522c = nm0.h.b(new i());
        this.f53523d = nm0.h.b(new g());
        this.f53524e = nm0.h.b(new c());
        this.f53525f = nm0.h.b(new e());
        this.f53526g = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new w(1));
        this.f53527h = nm0.h.b(new h());
        this.f53528i = nm0.h.b(new j());
        this.f53529j = nm0.h.b(new l());
    }

    public static void A3(f.a controls, LegacyTutorialActivity this$0) {
        u.j(controls, "$controls");
        u.j(this$0, "this$0");
        if (controls.a()) {
            this$0.N3().A0();
        } else {
            this$0.N3().z0();
        }
    }

    public static void B3(f.a controls, LegacyTutorialActivity this$0) {
        u.j(controls, "$controls");
        u.j(this$0, "this$0");
        if (controls.a()) {
            this$0.N3().A0();
        } else {
            this$0.N3().z0();
        }
    }

    public static void C3(LegacyTutorialActivity this$0) {
        u.j(this$0, "this$0");
        this$0.N3().y0();
    }

    public static final void D3(LegacyTutorialActivity legacyTutorialActivity, f.a aVar) {
        int i11;
        int i12;
        int i13;
        TextView textView = legacyTutorialActivity.M3().f99526f;
        u.g(textView);
        int i14 = 8;
        if (aVar.g()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
        textView.setText(aVar.c());
        textView.setOnClickListener(new vn.d(legacyTutorialActivity, 5));
        TextView textView2 = legacyTutorialActivity.M3().f99523c;
        u.g(textView2);
        if (aVar.e()) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView2.setVisibility(i12);
        textView2.setText(aVar.b());
        textView2.setOnClickListener(new pq.d(1, aVar, legacyTutorialActivity));
        ImageView imageView = legacyTutorialActivity.M3().f99524d;
        u.g(imageView);
        if (aVar.f()) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(new gi.i(legacyTutorialActivity, 5));
        ImageView imageView2 = legacyTutorialActivity.M3().f99525e;
        u.g(imageView2);
        if (aVar.d()) {
            i14 = 0;
        }
        imageView2.setVisibility(i14);
        imageView2.setOnClickListener(new sg.a(3, aVar, legacyTutorialActivity));
    }

    public static final Device F3(LegacyTutorialActivity legacyTutorialActivity) {
        return (Device) legacyTutorialActivity.f53521b.getValue();
    }

    public static final TutorialStateListener G3(LegacyTutorialActivity legacyTutorialActivity) {
        return (TutorialStateListener) legacyTutorialActivity.f53523d.getValue();
    }

    public static final vc0.b H3(LegacyTutorialActivity legacyTutorialActivity) {
        return (vc0.b) legacyTutorialActivity.f53527h.getValue();
    }

    public static final int I3(LegacyTutorialActivity legacyTutorialActivity) {
        return ((Number) legacyTutorialActivity.f53522c.getValue()).intValue();
    }

    public static final List J3(LegacyTutorialActivity legacyTutorialActivity) {
        return (List) legacyTutorialActivity.f53528i.getValue();
    }

    public static final Long K3(LegacyTutorialActivity legacyTutorialActivity) {
        return (Long) legacyTutorialActivity.f53520a.getValue();
    }

    public static final boolean L3(LegacyTutorialActivity legacyTutorialActivity) {
        return ((Boolean) legacyTutorialActivity.f53524e.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u0 M3() {
        Object value = ((LifecycleViewBindingProperty) this.f53526g).getValue(this, f53519l[0]);
        u.i(value, "getValue(...)");
        return (u0) value;
    }

    private final com.withings.wiscale2.device.common.tutorial.f N3() {
        return (com.withings.wiscale2.device.common.tutorial.f) this.f53529j.getValue();
    }

    public static void z3(LegacyTutorialActivity this$0) {
        u.j(this$0, "this$0");
        this$0.N3().y0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (((Boolean) this.f53525f.getValue()).booleanValue()) {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        ConstraintLayout root = M3().f99527g;
        u.i(root, "root");
        ay.b.n(root, false, true, 23);
        AppBarLayout appbar = M3().f99521a;
        u.i(appbar, "appbar");
        ay.b.n(appbar, true, false, 29);
        setSupportActionBar((Toolbar) findViewById(C1987R.id.toolbar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(false);
            supportActionBar.o(((Boolean) this.f53525f.getValue()).booleanValue());
        }
        u0 M3 = M3();
        com.withings.wiscale2.device.common.tutorial.e eVar = new com.withings.wiscale2.device.common.tutorial.e(this, getSupportFragmentManager());
        ViewPager viewPager = M3.f99528h;
        viewPager.setAdapter(eVar);
        M3().f99522b.setViewPager(viewPager);
        viewPager.c(N3());
        N3().q0().observe(this, new d(new com.withings.wiscale2.device.common.tutorial.b(this)));
        N3().p0().observe(this, new d(new com.withings.wiscale2.device.common.tutorial.c(this)));
        N3().r0().observe(this, new d(new com.withings.wiscale2.device.common.tutorial.d(this)));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332 && ((Boolean) this.f53525f.getValue()).booleanValue()) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
