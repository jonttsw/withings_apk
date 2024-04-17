package com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.a;
import androidx.lifecycle.h1;
import androidx.lifecycle.i1;
import androidx.lifecycle.k1;
import androidx.lifecycle.m1;
import com.withings.common.compose.component.x4;
import k1.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: Wpa02CleansingModeActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/ui/features/cleansing/Wpa02CleansingModeActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "", "isCleansingModeStarted", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpa02CleansingModeActivity extends Hilt_Wpa02CleansingModeActivity {

    /* renamed from: e  reason: collision with root package name */
    private final i1 f55222e = new i1(q0.b(Wpa02CleansingModeViewModel.class), new c(this), new b(this), new d(this));

    /* renamed from: f  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f55223f;

    /* compiled from: Wpa02CleansingModeActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        a() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                r8.n c11 = androidx.navigation.compose.r.c(new androidx.navigation.c0[0], aVar2);
                aVar2.s(-1988245656);
                Object t11 = aVar2.t();
                a.C0060a.C0061a a11 = a.C0060a.a();
                Wpa02CleansingModeActivity wpa02CleansingModeActivity = Wpa02CleansingModeActivity.this;
                if (t11 == a11) {
                    t11 = Wpa02CleansingModeActivity.B3(wpa02CleansingModeActivity).z0();
                    aVar2.n(t11);
                }
                aVar2.J();
                yk.o.b(false, s1.b.b(aVar2, 2071758111, new m0(x4.b(aVar2), wpa02CleansingModeActivity, c11, (r0) t11)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f55225a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f55225a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f55225a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f55226a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f55226a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f55226a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f55227a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f55227a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f55227a.getDefaultViewModelCreationExtras();
        }
    }

    public Wpa02CleansingModeActivity() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new com.withings.cycletracking.ui.d(this, 1));
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f55223f = registerForActivityResult;
    }

    public static final Wpa02CleansingModeViewModel B3(Wpa02CleansingModeActivity wpa02CleansingModeActivity) {
        return (Wpa02CleansingModeViewModel) wpa02CleansingModeActivity.f55222e.getValue();
    }

    public static void z3(Wpa02CleansingModeActivity this$0, ActivityResult activityResult) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (activityResult.b() != -1) {
            this$0.finish();
            return;
        }
        Wpa02CleansingModeViewModel wpa02CleansingModeViewModel = (Wpa02CleansingModeViewModel) this$0.f55222e.getValue();
        BuildersKt__Builders_commonKt.launch$default(h1.a(wpa02CleansingModeViewModel), Dispatchers.getIO(), null, new p0(wpa02CleansingModeViewModel, null), 2, null);
    }

    @Override // com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing.Hilt_Wpa02CleansingModeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.k.a(this, new s1.a(true, -465917191, new a()));
    }
}
