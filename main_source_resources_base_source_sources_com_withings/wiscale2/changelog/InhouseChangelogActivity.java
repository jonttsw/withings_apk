package com.withings.wiscale2.changelog;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.camera.core.v;
import androidx.core.view.l1;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import by.kirich1409.viewbindingdelegate.f;
import coil.memory.MemoryCache;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import fn0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.g;
import nm0.h;
import ql0.e;
import rl0.a;
import tb0.a0;
import w9.g;
import ym0.l;
/* compiled from: InhouseChangelogActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/changelog/InhouseChangelogActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class InhouseChangelogActivity extends WithingsActivity {

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f50312c = {v.c(InhouseChangelogActivity.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/ActivityInhouseChangelogBinding;", 0)};

    /* renamed from: a  reason: collision with root package name */
    private final g f50313a;

    /* renamed from: b  reason: collision with root package name */
    private final f f50314b;

    /* compiled from: InhouseChangelogActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends w implements ym0.a<String> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final String invoke() {
            return InhouseChangelogActivity.this.getIntent().getStringExtra("EXTRA_CHANGELOG");
        }
    }

    /* compiled from: InhouseChangelogActivity.kt */
    /* loaded from: classes4.dex */
    public static final class b extends ql0.a {
        b() {
        }

        @Override // ql0.a, ql0.i
        public final void d(a.C1584a c1584a) {
            c1584a.p(Color.parseColor("#ffD1E1FB"));
            c1584a.o(0);
            c1584a.m(wq.a.c(4, InhouseChangelogActivity.this));
        }
    }

    /* compiled from: InhouseChangelogActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends w implements ym0.a<MemoryCache> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final MemoryCache invoke() {
            MemoryCache.a aVar = new MemoryCache.a(InhouseChangelogActivity.this);
            aVar.b();
            return aVar.a();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes4.dex */
    public static final class d extends w implements l<ComponentActivity, a0> {
        @Override // ym0.l
        public final a0 invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.root);
            u.i(e11, "requireViewById(this, id)");
            return a0.a(e11);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public InhouseChangelogActivity() {
        super(C1987R.layout.activity_inhouse_changelog);
        this.f50313a = h.b(new a());
        this.f50314b = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new w(1));
    }

    private final a0 z3() {
        Object value = ((LifecycleViewBindingProperty) this.f50314b).getValue(this, f50312c[0]);
        u.i(value, "getValue(...)");
        return (a0) value;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        b0.s(this, false, ah.u.w(16843857, this, -65281));
        setSupportActionBar(z3().f98846c);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        String str = (String) this.f50313a.getValue();
        if (str != null) {
            e.a a11 = e.a(this);
            a11.a(new b());
            g.a aVar = new g.a(this);
            aVar.f(new c());
            aVar.d();
            a11.a(vl0.b.h(this, aVar.b()));
            a11.build().b(z3().f98845b, str);
        }
        TextView textview = z3().f98845b;
        u.i(textview, "textview");
        ay.b.n(textview, false, true, 23);
        LinearLayout root = z3().f98844a;
        u.i(root, "root");
        ay.b.n(root, true, false, 29);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
