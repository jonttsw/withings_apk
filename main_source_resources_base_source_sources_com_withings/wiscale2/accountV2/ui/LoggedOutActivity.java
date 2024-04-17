package com.withings.wiscale2.accountV2.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.e1;
import androidx.compose.runtime.v;
import androidx.core.view.l1;
import androidx.lifecycle.i1;
import androidx.lifecycle.k1;
import androidx.lifecycle.m1;
import com.withings.wiscale2.MainActivity;
import e.k;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
import nm0.y;
import wk.c0;
import yk.o;
import ym0.p;
/* compiled from: LoggedOutActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u0014\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/wiscale2/accountV2/ui/LoggedOutActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "", "kotlin.jvm.PlatformType", "isDisconnecting", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LoggedOutActivity extends Hilt_LoggedOutActivity {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f48187f = 0;

    /* renamed from: e  reason: collision with root package name */
    private final i1 f48188e = new i1(q0.b(LoggedOutViewModel.class), new d(this), new c(this), new e(this));

    /* compiled from: LoggedOutActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends w implements ym0.a<y> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final y invoke() {
            int i11 = LoggedOutActivity.f48187f;
            LoggedOutActivity loggedOutActivity = LoggedOutActivity.this;
            loggedOutActivity.getClass();
            Intent intent = new Intent(loggedOutActivity, MainActivity.class);
            intent.setFlags(268468224);
            loggedOutActivity.startActivity(intent);
            return y.f85009a;
        }
    }

    /* compiled from: LoggedOutActivity.kt */
    /* loaded from: classes4.dex */
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
                o.b(false, s1.b.b(aVar2, 828726393, new h(LoggedOutActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class c extends w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f48191a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f48191a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f48191a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class d extends w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f48192a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f48192a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f48192a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class e extends w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f48193a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f48193a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f48193a.getDefaultViewModelCreationExtras();
        }
    }

    public static final LoggedOutViewModel A3(LoggedOutActivity loggedOutActivity) {
        return (LoggedOutViewModel) loggedOutActivity.f48188e.getValue();
    }

    public static final void z3(LoggedOutActivity loggedOutActivity, boolean z5, ym0.a aVar, androidx.compose.runtime.a aVar2, int i11) {
        int i12;
        int i13;
        int i14;
        loggedOutActivity.getClass();
        androidx.compose.runtime.b g11 = aVar2.g(-332692269);
        if ((i11 & 14) == 0) {
            if (g11.a(z5)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(aVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            c0.b(e1.d(androidx.compose.ui.e.f8927a), null, null, com.withings.wiscale2.accountV2.ui.c.f48208a, com.withings.wiscale2.accountV2.ui.a.f48201a, com.withings.wiscale2.accountV2.ui.a.f48202b, s1.b.b(g11, 1669096702, new com.withings.wiscale2.accountV2.ui.e(aVar, z5)), null, 0L, false, null, null, 0.0f, false, com.withings.wiscale2.accountV2.ui.a.f48203c, g11, 1797510, 24576, 16258);
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new f(loggedOutActivity, z5, aVar, i11));
        }
    }

    @Override // com.withings.wiscale2.accountV2.ui.Hilt_LoggedOutActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        ((LoggedOutViewModel) this.f48188e.getValue()).j0().v(this, new a());
        k.a(this, new s1.a(true, 636739923, new b()));
    }
}
