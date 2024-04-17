package com.withings.wiscale2.account.password;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.v;
import com.withings.account.network.ws.AccountRemoteRepository;
import com.withings.wiscale2.C1987R;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import m0.t;
/* compiled from: LinkForPasswordSentActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/account/password/LinkForPasswordSentActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LinkForPasswordSentActivity extends Hilt_LinkForPasswordSentActivity {

    /* renamed from: e  reason: collision with root package name */
    private final b f48120e = new b(this);

    /* renamed from: f  reason: collision with root package name */
    private long f48121f;
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public AccountRemoteRepository f48122g;

    /* renamed from: i  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f48119i = {v.c(LinkForPasswordSentActivity.class, "email", "getEmail()Ljava/lang/String;", 0)};

    /* renamed from: h  reason: collision with root package name */
    public static final a f48118h = new Object();

    /* compiled from: LinkForPasswordSentActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class b implements bn0.d<Activity, String> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f48123a = nm0.h.b(new g(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f48124b;

        public b(Activity activity) {
            this.f48124b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.String] */
        @Override // bn0.d
        public final String getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f48123a.getValue();
        }
    }

    public static final String A3(LinkForPasswordSentActivity linkForPasswordSentActivity) {
        return (String) linkForPasswordSentActivity.f48120e.getValue(linkForPasswordSentActivity, f48119i[0]);
    }

    public static void z3(LinkForPasswordSentActivity this$0) {
        u.j(this$0, "this$0");
        if (new Date().getTime() - this$0.f48121f >= 30000) {
            this$0.f48121f = new Date().getTime();
            BuildersKt__Builders_commonKt.launch$default(t.l(this$0), Dispatchers.getIO(), null, new f(this$0, null), 2, null);
        }
    }

    @Override // com.withings.wiscale2.account.password.Hilt_LinkForPasswordSentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_link_for_password_sent);
        setSupportActionBar((Toolbar) findViewById(C1987R.id.toolbar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(false);
            supportActionBar.o(true);
        }
        ((Button) findViewById(C1987R.id.button_send_again)).setOnClickListener(new sg.j(this, 4));
        ((Button) findViewById(C1987R.id.button_try_login)).setOnClickListener(new com.google.android.material.search.g(this, 5));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        finish();
        return super.onOptionsItemSelected(item);
    }
}
