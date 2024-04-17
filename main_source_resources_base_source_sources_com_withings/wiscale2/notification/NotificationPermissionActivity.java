package com.withings.wiscale2.notification;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import com.withings.android.activity.WithingsActivity;
import com.withings.authentication.n;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: NotificationPermission.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/notification/NotificationPermissionActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class NotificationPermissionActivity extends WithingsActivity {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f58729d = 0;

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f58730a = nm0.h.b(new c());

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f58731b = nm0.h.b(new b());

    /* renamed from: c  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f58732c;

    /* compiled from: NotificationPermission.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context) {
            return n.a(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, context, NotificationPermissionActivity.class);
        }
    }

    /* compiled from: NotificationPermission.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<th0.i> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final th0.i invoke() {
            return new th0.i(NotificationPermissionActivity.this);
        }
    }

    /* compiled from: NotificationPermission.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.a<Toolbar> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Toolbar invoke() {
            return (Toolbar) NotificationPermissionActivity.this.findViewById(C1987R.id.toolbar);
        }
    }

    public NotificationPermissionActivity() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new com.withings.authentication.c(this, 5));
        u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f58732c = registerForActivityResult;
    }

    public static void A3(NotificationPermissionActivity this$0) {
        int i11;
        u.j(this$0, "this$0");
        if (((th0.i) this$0.f58731b.getValue()).b()) {
            i11 = -1;
        } else {
            i11 = 0;
        }
        this$0.setResult(i11);
        this$0.finish();
    }

    public static void z3(NotificationPermissionActivity this$0) {
        u.j(this$0, "this$0");
        this$0.f58732c.a(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_android_notification_permission);
        setSupportActionBar((Toolbar) this.f58730a.getValue());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        findViewById(C1987R.id.button).setOnClickListener(new sg.d(this, 17));
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
