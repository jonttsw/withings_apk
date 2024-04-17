package com.withings.account.ui;

import android.app.Activity;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.camera.core.v;
import androidx.core.view.l1;
import androidx.lifecycle.i1;
import androidx.lifecycle.k1;
import androidx.lifecycle.m1;
import com.withings.account.ui.vm.VerifyGoogleAuthenticationSensitiveViewModel;
import fn0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.h;
import nm0.y;
import yk.o;
import ym0.p;
/* compiled from: VerifyAuthenticationSensitiveActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/account/ui/VerifyAuthenticationSensitiveActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class VerifyAuthenticationSensitiveActivity extends Hilt_VerifyAuthenticationSensitiveActivity {

    /* renamed from: e  reason: collision with root package name */
    private final i1 f31007e = new i1(q0.b(VerifyGoogleAuthenticationSensitiveViewModel.class), new f(this), new e(this), new g(this));

    /* renamed from: f  reason: collision with root package name */
    private final d f31008f;

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f31006h = {v.c(VerifyAuthenticationSensitiveActivity.class, "isGoogle", "isGoogle()Z", 0), v.c(VerifyAuthenticationSensitiveActivity.class, "mail", "getMail()Ljava/lang/String;", 0)};

    /* renamed from: g  reason: collision with root package name */
    public static final a f31005g = new Object();

    /* compiled from: VerifyAuthenticationSensitiveActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* compiled from: VerifyAuthenticationSensitiveActivity.kt */
    /* loaded from: classes3.dex */
    static final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {
        b() {
            super(2);
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                o.b(false, s1.b.b(aVar2, -2137159131, new com.withings.account.ui.c(VerifyAuthenticationSensitiveActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class c implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f31010a = h.b(new com.withings.account.ui.d(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f31011b;

        public c(Activity activity) {
            this.f31011b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f31010a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class d implements bn0.d<Activity, String> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f31012a = h.b(new com.withings.account.ui.e(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f31013b;

        public d(Activity activity) {
            this.f31013b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.String] */
        @Override // bn0.d
        public final String getValue(Activity activity, k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f31012a.getValue();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class e extends w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31014a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f31014a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f31014a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class f extends w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31015a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f31015a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f31015a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class g extends w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f31016a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f31016a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f31016a.getDefaultViewModelCreationExtras();
        }
    }

    public VerifyAuthenticationSensitiveActivity() {
        new c(this);
        this.f31008f = new d(this);
    }

    public static final void A3(VerifyAuthenticationSensitiveActivity verifyAuthenticationSensitiveActivity) {
        VerifyGoogleAuthenticationSensitiveViewModel verifyGoogleAuthenticationSensitiveViewModel = (VerifyGoogleAuthenticationSensitiveViewModel) verifyAuthenticationSensitiveActivity.f31007e.getValue();
    }

    public static final void z3(VerifyAuthenticationSensitiveActivity verifyAuthenticationSensitiveActivity) {
        String str = (String) verifyAuthenticationSensitiveActivity.f31008f.getValue(verifyAuthenticationSensitiveActivity, f31006h[1]);
    }

    @Override // com.withings.account.ui.Hilt_VerifyAuthenticationSensitiveActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, -631788661, new b()));
    }
}
