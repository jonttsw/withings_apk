package com.withings.wiscale2.measure.accountmeasure.ui.add;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.MeasuresGroup;
import com.withings.wiscale2.MainActivity;
import com.withings.wiscale2.heart.HeartDetailActivity;
import com.withings.wiscale2.measure.accountmeasure.ui.add.a;
import com.withings.wiscale2.measure.accountmeasure.ui.add.h0;
import com.withings.wiscale2.measure.accountmeasure.ui.add.o0;
import com.withings.wiscale2.measure.accountmeasure.ui.add.u;
import com.withings.wiscale2.measure.accountmeasure.ui.add.x;
import com.withings.wiscale2.measure.heartrate.HeartRateHandler;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.joda.time.DateTime;
/* compiled from: AddMeasureActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/measure/accountmeasure/ui/add/AddMeasureActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/wiscale2/measure/accountmeasure/ui/add/h0$a;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AddMeasureActivity extends Hilt_AddMeasureActivity implements h0.a {

    /* renamed from: e  reason: collision with root package name */
    private h0 f58100e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f58101f;
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public ch.d f58102g;

    /* renamed from: h  reason: collision with root package name */
    private final c f58103h = new c(this);

    /* renamed from: i  reason: collision with root package name */
    private final d f58104i = new d(this);

    /* renamed from: j  reason: collision with root package name */
    private final e f58105j = new e(this);

    /* renamed from: k  reason: collision with root package name */
    private final f f58106k = new f(this);

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f58107l = nm0.h.b(new b());

    /* renamed from: n  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f58099n = {androidx.camera.core.v.c(AddMeasureActivity.class, "userID", "getUserID()J", 0), androidx.camera.core.v.c(AddMeasureActivity.class, "measureType", "getMeasureType()I", 0), androidx.camera.core.v.c(AddMeasureActivity.class, "goBackToTimeline", "getGoBackToTimeline()Z", 0), androidx.camera.core.v.c(AddMeasureActivity.class, "isFromDetailView", "isFromDetailView()Z", 0)};

    /* renamed from: m  reason: collision with root package name */
    public static final a f58098m = new Object();

    /* compiled from: AddMeasureActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context, int i11, boolean z5, boolean z11, long j5, Double d11) {
            Intent putExtra = com.withings.authentication.n.a(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, context, AddMeasureActivity.class).putExtra("EXTRA_MEASURE_TYPE", i11).putExtra("EXTRA_FROM_DETAIL_VIEW", z5).putExtra("GO_BACK_TIMELINE", z11).putExtra("EXTRA_USER", j5).putExtra("EXTRA_INPUT_VALUE", d11);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            return putExtra;
        }

        public static /* synthetic */ Intent b(a aVar, Context context, int i11, boolean z5, boolean z11, long j5) {
            aVar.getClass();
            return a(context, i11, z5, z11, j5, null);
        }
    }

    /* compiled from: AddMeasureActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<Double> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final Double invoke() {
            return Double.valueOf(AddMeasureActivity.this.getIntent().getDoubleExtra("EXTRA_INPUT_VALUE", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f58109a = nm0.h.b(new b0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f58110b;

        public c(Activity activity) {
            this.f58110b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f58109a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class d implements bn0.d<Activity, Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f58111a = nm0.h.b(new c0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f58112b;

        public d(Activity activity) {
            this.f58112b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Integer] */
        @Override // bn0.d
        public final Integer getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f58111a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class e implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f58113a = nm0.h.b(new d0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f58114b;

        public e(Activity activity) {
            this.f58114b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f58113a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class f implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f58115a = nm0.h.b(new e0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f58116b;

        public f(Activity activity) {
            this.f58116b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f58115a.getValue();
        }
    }

    private final void D3() {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
        if (((Boolean) this.f58105j.getValue(this, f58099n[2])).booleanValue()) {
            Intent a11 = androidx.core.app.g.a(this);
            if (a11 == null) {
                MainActivity.f47950r.getClass();
                startActivity(MainActivity.a.a(this));
                return;
            } else if (androidx.core.app.g.f(this, a11)) {
                androidx.core.app.h0 m11 = androidx.core.app.h0.m(this);
                m11.g(a11);
                m11.r();
                return;
            } else {
                androidx.core.app.g.e(this, a11);
                return;
            }
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E3(h0 h0Var) {
        this.f58100e = h0Var;
        androidx.fragment.app.m0 m11 = getSupportFragmentManager().m();
        m11.l(16908290, h0Var, null);
        m11.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F3() {
        u.a aVar = u.G;
        long B3 = B3();
        boolean C3 = C3();
        aVar.getClass();
        h0.b bVar = h0.f58177j;
        u uVar = new u();
        bVar.getClass();
        h0.b.a(uVar, B3, C3);
        E3(uVar);
    }

    public final long B3() {
        return ((Number) this.f58103h.getValue(this, f58099n[0])).longValue();
    }

    public final boolean C3() {
        return ((Boolean) this.f58106k.getValue(this, f58099n[3])).booleanValue();
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.h0.a
    public final void b2(MeasuresGroup measuresGroup) {
        kotlin.jvm.internal.u.j(measuresGroup, "measuresGroup");
        Intent intent = new Intent();
        intent.putExtra("EXTRA_NEW_MEASURES_GROUP_DATE", new DateTime(measuresGroup.getDate()));
        setResult(-1, intent);
        if (this.f58100e instanceof m) {
            startActivity(HeartDetailActivity.D3(this, measuresGroup, 1, B3()));
            setResult(-1);
            finish();
            return;
        }
        D3();
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.h0.a
    public final void onCancel() {
        D3();
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.Hilt_AddMeasureActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            fn0.k<Object>[] kVarArr = f58099n;
            fn0.k<Object> kVar = kVarArr[1];
            d dVar = this.f58104i;
            int intValue = ((Number) dVar.getValue(this, kVar)).intValue();
            if (intValue != 1) {
                if (intValue != 4) {
                    if (intValue != 71) {
                        if (intValue != 183) {
                            switch (intValue) {
                                case 9:
                                case 10:
                                    a.C0753a c0753a = com.withings.wiscale2.measure.accountmeasure.ui.add.a.B;
                                    long B3 = B3();
                                    boolean C3 = C3();
                                    c0753a.getClass();
                                    h0.b bVar = h0.f58177j;
                                    com.withings.wiscale2.measure.accountmeasure.ui.add.a aVar = new com.withings.wiscale2.measure.accountmeasure.ui.add.a();
                                    bVar.getClass();
                                    h0.b.a(aVar, B3, C3);
                                    E3(aVar);
                                    return;
                                case 11:
                                    if (!HeartRateHandler.e()) {
                                        F3();
                                        return;
                                    } else if (checkCallingOrSelfPermission("android.permission.CAMERA") == 0) {
                                        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new a0(this, null), 3, null);
                                        return;
                                    } else {
                                        requestPermissions(new String[]{"android.permission.CAMERA"}, 1244);
                                        return;
                                    }
                                default:
                                    finish();
                                    throw new UnsupportedOperationException(android.support.v4.media.a.a("Unsupported type : ", ((Number) dVar.getValue(this, kVarArr[1])).intValue()));
                            }
                        }
                        ch.d dVar2 = this.f58102g;
                        if (dVar2 != null) {
                            startActivity(ch.a.a(dVar2.B(), this, -1, B3(), -1L, false, null, 48));
                            finish();
                            return;
                        }
                        kotlin.jvm.internal.u.s("intentBuilder");
                        throw null;
                    }
                    int i11 = k.P;
                    long B32 = B3();
                    boolean C32 = C3();
                    h0.b bVar2 = h0.f58177j;
                    k kVar2 = new k();
                    bVar2.getClass();
                    h0.b.a(kVar2, B32, C32);
                    E3(kVar2);
                    return;
                }
                x.a aVar2 = x.F;
                long B33 = B3();
                boolean C33 = C3();
                aVar2.getClass();
                h0.b bVar3 = h0.f58177j;
                x xVar = new x();
                bVar3.getClass();
                h0.b.a(xVar, B33, C33);
                E3(xVar);
                return;
            }
            o0.a aVar3 = o0.M;
            long B34 = B3();
            boolean C34 = C3();
            double doubleValue = ((Number) this.f58107l.getValue()).doubleValue();
            aVar3.getClass();
            h0.b bVar4 = h0.f58177j;
            o0 o0Var = new o0();
            bVar4.getClass();
            h0.b.a(o0Var, B34, C34);
            o0Var.setArguments(androidx.core.os.e.a(new nm0.j("EXTRA_FROM_DETAIL", Boolean.valueOf(C34)), new nm0.j("EXTRA_INPUT_VALUE", Double.valueOf(doubleValue)), new nm0.j("EXTRA_USER", Long.valueOf(B34))));
            E3(o0Var);
            return;
        }
        this.f58100e = (h0) getSupportFragmentManager().X(16908290);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i11, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.u.j(permissions, "permissions");
        kotlin.jvm.internal.u.j(grantResults, "grantResults");
        if (i11 == 1244) {
            int length = permissions.length;
            boolean z5 = false;
            for (int i12 = 0; i12 < length; i12++) {
                if (kotlin.jvm.internal.u.e("android.permission.CAMERA", permissions[i12])) {
                    if (grantResults[i12] == 0) {
                        z5 = true;
                    }
                    this.f58101f = Boolean.valueOf(z5);
                    return;
                }
            }
            F3();
            return;
        }
        super.onRequestPermissionsResult(i11, permissions, grantResults);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        Boolean bool;
        super.onResume();
        if (this.f58100e == null && (bool = this.f58101f) != null) {
            if (bool.booleanValue()) {
                BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new a0(this, null), 3, null);
            } else {
                F3();
            }
            this.f58101f = null;
        }
    }

    @Override // android.app.Activity
    public final ActionMode startActionMode(ActionMode.Callback callback) {
        kotlin.jvm.internal.u.j(callback, "callback");
        return null;
    }
}
