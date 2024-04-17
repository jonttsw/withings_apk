package com.withings.wiscale2.partner.ui.fitdataviewer;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.k1;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.fitness.FitnessOptions;
import com.withings.android.activity.WithingsActivity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: FitViewerDetailActivity.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/wiscale2/partner/ui/fitdataviewer/FitViewerDetailActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "", "Lcom/google/android/gms/fitness/data/DataPoint;", "points", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FitViewerDetailActivity extends WithingsActivity {

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f59044a = nm0.h.b(new a());

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f59045b = nm0.h.b(new b());

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f59046c = nm0.h.b(new d());

    /* compiled from: FitViewerDetailActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<FitType> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final FitType invoke() {
            Object parcelableExtra;
            Intent intent = FitViewerDetailActivity.this.getIntent();
            u.i(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = intent.getParcelableExtra("fitType", FitType.class);
            } else {
                parcelableExtra = intent.getParcelableExtra("fitType");
            }
            u.g(parcelableExtra);
            return (FitType) parcelableExtra;
        }
    }

    /* compiled from: FitViewerDetailActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<FitnessOptions> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final FitnessOptions invoke() {
            FitnessOptions.Builder builder = FitnessOptions.builder();
            FitViewerDetailActivity fitViewerDetailActivity = FitViewerDetailActivity.this;
            FitnessOptions build = builder.addDataType(FitViewerDetailActivity.B3(fitViewerDetailActivity).a(), 0).addDataType(FitViewerDetailActivity.B3(fitViewerDetailActivity).a(), 1).build();
            u.i(build, "build(...)");
            return build;
        }
    }

    /* compiled from: FitViewerDetailActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {
        c() {
            super(2);
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                FitViewerDetailActivity fitViewerDetailActivity = FitViewerDetailActivity.this;
                FitViewerDetailActivity.A3(fitViewerDetailActivity);
                yk.o.b(false, s1.b.b(aVar2, -444312727, new r(fitViewerDetailActivity)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: FitViewerDetailActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends w implements ym0.a<xh0.e> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final xh0.e invoke() {
            FitViewerDetailActivity fitViewerDetailActivity = FitViewerDetailActivity.this;
            Application application = fitViewerDetailActivity.getApplication();
            u.i(application, "getApplication(...)");
            return (xh0.e) new k1(fitViewerDetailActivity, new k1.a(application)).b(xh0.e.class, "detail");
        }
    }

    public static final void A3(FitViewerDetailActivity fitViewerDetailActivity) {
        GoogleSignInAccount accountForExtension = GoogleSignIn.getAccountForExtension(fitViewerDetailActivity, (FitnessOptions) fitViewerDetailActivity.f59045b.getValue());
        u.i(accountForExtension, "getAccountForExtension(...)");
        nm0.g gVar = fitViewerDetailActivity.f59045b;
        if (GoogleSignIn.hasPermissions(accountForExtension, (FitnessOptions) gVar.getValue())) {
            ((xh0.e) fitViewerDetailActivity.f59046c.getValue()).k0(((FitType) fitViewerDetailActivity.f59044a.getValue()).a());
            return;
        }
        GoogleSignInAccount accountForExtension2 = GoogleSignIn.getAccountForExtension(fitViewerDetailActivity, (FitnessOptions) gVar.getValue());
        u.i(accountForExtension2, "getAccountForExtension(...)");
        GoogleSignIn.requestPermissions(fitViewerDetailActivity, 2, accountForExtension2, (FitnessOptions) gVar.getValue());
    }

    public static final FitType B3(FitViewerDetailActivity fitViewerDetailActivity) {
        return (FitType) fitViewerDetailActivity.f59044a.getValue();
    }

    public static final xh0.e C3(FitViewerDetailActivity fitViewerDetailActivity) {
        return (xh0.e) fitViewerDetailActivity.f59046c.getValue();
    }

    public static final void z3(FitViewerDetailActivity fitViewerDetailActivity, Map map) {
        ((xh0.e) fitViewerDetailActivity.f59046c.getValue()).g0((FitType) fitViewerDetailActivity.f59044a.getValue(), map);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i12 == -1) {
            ((xh0.e) this.f59046c.getValue()).k0(((FitType) this.f59044a.getValue()).a());
            return;
        }
        Log.e("FitDataViewer", "onActivityResult : " + i12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.k.a(this, new s1.a(true, 149449283, new c()));
    }
}
