package com.withings.wiscale2.settings;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
import java.util.List;
import kotlin.Metadata;
/* compiled from: DebugDeeplinkActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/settings/DebugDeeplinkActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class DebugDeeplinkActivity extends WithingsActivity {

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f59723d = {androidx.camera.core.v.c(DebugDeeplinkActivity.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/ActivityDebugDeeplinksBinding;", 0)};

    /* renamed from: a  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f59724a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f59725b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f59726c;

    /* compiled from: DebugDeeplinkActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<c0> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final c0 invoke() {
            DebugDeeplinkActivity debugDeeplinkActivity = DebugDeeplinkActivity.this;
            return new c0(new x(debugDeeplinkActivity), new y(debugDeeplinkActivity));
        }
    }

    /* compiled from: DebugDeeplinkActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<List<? extends b0>, nm0.y> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(List<? extends b0> list) {
            List<? extends b0> it = list;
            kotlin.jvm.internal.u.j(it, "it");
            DebugDeeplinkActivity.A3(DebugDeeplinkActivity.this).submitList(it);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.l<ComponentActivity, tb0.e> {
        @Override // ym0.l
        public final tb0.e invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            kotlin.jvm.internal.u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.root);
            kotlin.jvm.internal.u.i(e11, "requireViewById(this, id)");
            return tb0.e.a(e11);
        }
    }

    /* compiled from: DebugDeeplinkActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<a0> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final a0 invoke() {
            DebugDeeplinkActivity debugDeeplinkActivity = DebugDeeplinkActivity.this;
            return (a0) new androidx.lifecycle.k1(debugDeeplinkActivity, new z(debugDeeplinkActivity)).a(a0.class);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public DebugDeeplinkActivity() {
        super(C1987R.layout.activity_debug_deeplinks);
        this.f59724a = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new kotlin.jvm.internal.w(1));
        this.f59725b = nm0.h.b(new d());
        this.f59726c = nm0.h.b(new a());
    }

    public static final c0 A3(DebugDeeplinkActivity debugDeeplinkActivity) {
        return (c0) debugDeeplinkActivity.f59726c.getValue();
    }

    public static final void B3(DebugDeeplinkActivity debugDeeplinkActivity, String str) {
        debugDeeplinkActivity.getClass();
        Toast.makeText(debugDeeplinkActivity, str, 1).show();
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.setData(Uri.parse(str));
        debugDeeplinkActivity.finishAffinity();
        debugDeeplinkActivity.startActivity(intent);
    }

    private final tb0.e C3() {
        Object value = ((LifecycleViewBindingProperty) this.f59724a).getValue(this, f59723d[0]);
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (tb0.e) value;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0032, code lost:
        if (r5 != null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void z3(com.withings.wiscale2.settings.e0 r3, com.withings.wiscale2.settings.DebugDeeplinkActivity r4, int r5) {
        /*
            java.lang.String r0 = "$deeplink"
            kotlin.jvm.internal.u.j(r3, r0)
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.u.j(r4, r0)
            java.util.List r0 = r3.b()
            java.lang.Object r5 = kotlin.collections.x.N(r5, r0)
            com.withings.user.User r5 = (com.withings.user.User) r5
            if (r5 == 0) goto L35
            java.lang.String r0 = r3.a()
            long r1 = r5.q()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = "?userid="
            r5.append(r0)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            if (r5 == 0) goto L35
            goto L39
        L35:
            java.lang.String r5 = r3.a()
        L39:
            r3 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r4, r5, r3)
            r3.show()
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.VIEW"
            r3.<init>(r0)
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r3.setData(r5)
            r4.finishAffinity()
            r4.startActivity(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.settings.DebugDeeplinkActivity.z3(com.withings.wiscale2.settings.e0, com.withings.wiscale2.settings.DebugDeeplinkActivity, int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setSupportActionBar(C3().f99006b);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        tb0.e C3 = C3();
        C3.f99005a.setLayoutManager(new LinearLayoutManager(1));
        C3().f99005a.setAdapter((c0) this.f59726c.getValue());
        xw.d.c(this, ((a0) this.f59725b.getValue()).f0(), new b());
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
