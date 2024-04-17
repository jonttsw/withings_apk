package com.withings.wiscale2.account.password;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m0;
import com.withings.account.network.ws.AccountRemoteRepository;
import com.withings.wiscale2.account.password.LinkForPasswordSentActivity;
import com.withings.wiscale2.account.password.i;
import com.withings.wiscale2.account.password.k;
import com.withings.wiscale2.account.password.q;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import m0.t;
import nm0.y;
/* compiled from: PasswordExpiredActivity.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/wiscale2/account/password/PasswordExpiredActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/wiscale2/account/password/i$a;", "Lcom/withings/wiscale2/account/password/q$a;", "Lcom/withings/wiscale2/account/password/k$a;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PasswordExpiredActivity extends Hilt_PasswordExpiredActivity implements i.a, q.a, k.a {

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f48125e = nm0.h.b(new a());

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f48126f = nm0.h.b(new b());
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public AccountRemoteRepository f48127g;
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public cg.l f48128h;

    /* compiled from: PasswordExpiredActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends w implements ym0.a<Boolean> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(PasswordExpiredActivity.this.getIntent().getBooleanExtra("extra_key_native_change", false));
        }
    }

    /* compiled from: PasswordExpiredActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends w implements ym0.a<String> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final String invoke() {
            return PasswordExpiredActivity.this.getIntent().getStringExtra("extra_key_email");
        }
    }

    /* compiled from: PasswordExpiredActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.account.password.PasswordExpiredActivity$onChangePasswordClicked$1$1", f = "PasswordExpiredActivity.kt", l = {77}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f48131a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f48133c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f48133c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new c(this.f48133c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f48131a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                AccountRemoteRepository accountRemoteRepository = PasswordExpiredActivity.this.f48127g;
                if (accountRemoteRepository != null) {
                    this.f48131a = 1;
                    if (accountRemoteRepository.requestNewPassword(this.f48133c, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    u.s("accountRemoteRepository");
                    throw null;
                }
            }
            return y.f85009a;
        }
    }

    private final void z3() {
        m0 m11 = getSupportFragmentManager().m();
        m11.l(16908290, new q(), null);
        m11.q();
        m11.f();
    }

    @Override // com.withings.wiscale2.account.password.k.a
    public final void A1(k fragment) {
        u.j(fragment, "fragment");
        z3();
    }

    @Override // com.withings.wiscale2.account.password.k.a
    public final void O0(k fragment) {
        u.j(fragment, "fragment");
        m0 m11 = getSupportFragmentManager().m();
        m11.l(16908290, new i(), null);
        m11.q();
        m11.f();
    }

    @Override // com.withings.wiscale2.account.password.i.a
    public final void P1(i fragment) {
        u.j(fragment, "fragment");
        setResult(-1);
        finish();
    }

    @Override // com.withings.wiscale2.account.password.k.a
    public final void j3(k fragment) {
        vf.c cVar;
        u.j(fragment, "fragment");
        LinkForPasswordSentActivity.a aVar = LinkForPasswordSentActivity.f48118h;
        Context applicationContext = getApplicationContext();
        u.i(applicationContext, "getApplicationContext(...)");
        cVar = vf.c.f103617d;
        if (cVar != null) {
            String email = cVar.h().b();
            aVar.getClass();
            u.j(email, "email");
            Intent putExtra = new Intent(applicationContext, LinkForPasswordSentActivity.class).putExtra("extra_key_email", email);
            u.i(putExtra, "putExtra(...)");
            startActivityForResult(putExtra, 111);
            return;
        }
        throw new IllegalArgumentException("You must call init before".toString());
    }

    @Override // com.withings.wiscale2.account.password.q.a
    public final void m1(q fragment) {
        u.j(fragment, "fragment");
        if (((Boolean) this.f48125e.getValue()).booleanValue()) {
            m0 m11 = getSupportFragmentManager().m();
            m11.l(16908290, new k(), null);
            m11.q();
            m11.f();
            return;
        }
        nm0.g gVar = this.f48126f;
        String str = (String) gVar.getValue();
        if (str != null) {
            BuildersKt__Builders_commonKt.launch$default(t.l(this), Dispatchers.getIO(), null, new c(str, null), 2, null);
        }
        LinkForPasswordSentActivity.a aVar = LinkForPasswordSentActivity.f48118h;
        String str2 = (String) gVar.getValue();
        if (str2 == null) {
            str2 = "";
        }
        aVar.getClass();
        Intent putExtra = new Intent(this, LinkForPasswordSentActivity.class).putExtra("extra_key_email", str2);
        u.i(putExtra, "putExtra(...)");
        startActivityForResult(putExtra, 111);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 111 && i12 == -1) {
            BuildersKt__BuildersKt.runBlocking$default(null, new o(this, null), 1, null);
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        List<Fragment> f02 = getSupportFragmentManager().f0();
        u.i(f02, "getFragments(...)");
        Fragment fragment = (Fragment) x.T(f02);
        if (fragment instanceof k) {
            z3();
        } else if (fragment instanceof i) {
            P1((i) fragment);
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.withings.wiscale2.account.password.Hilt_PasswordExpiredActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        z3();
    }
}
