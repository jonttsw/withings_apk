package com.withings.wiscale2.weight.list;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.camera.core.v;
import androidx.core.view.l1;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.target.data.TargetRepository;
import com.withings.user.User;
import com.withings.wiscale2.measure.accountmeasure.ui.add.AddMeasureActivity;
import fy.n;
import javax.inject.Inject;
import jm.a;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import yk.o;
import ym0.p;
/* compiled from: WeightListActivity.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006 \u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/wiscale2/weight/list/WeightListActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "", "Lky/d;", "kotlin.jvm.PlatformType", "weightsGroups", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WeightListActivity extends Hilt_WeightListActivity {

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f62900m = {v.c(WeightListActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0)};

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f62901n = 0;

    /* renamed from: e  reason: collision with root package name */
    private final d f62902e = new d(this);

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f62903f = nm0.h.b(new b());

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f62904g = nm0.h.b(new a());
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public cy.a f62905h;
    @Inject

    /* renamed from: i  reason: collision with root package name */
    public n f62906i;
    @Inject

    /* renamed from: j  reason: collision with root package name */
    public fy.a f62907j;
    @Inject

    /* renamed from: k  reason: collision with root package name */
    public TargetRepository f62908k;

    /* renamed from: l  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f62909l;

    /* compiled from: WeightListActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<jm.a> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final jm.a invoke() {
            return a.d.a(WeightListActivity.this);
        }
    }

    /* compiled from: WeightListActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<k> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final k invoke() {
            WeightListActivity weightListActivity = WeightListActivity.this;
            User B3 = WeightListActivity.B3(weightListActivity);
            cy.a aVar = weightListActivity.f62905h;
            if (aVar != null) {
                n nVar = weightListActivity.f62906i;
                if (nVar != null) {
                    fy.a aVar2 = weightListActivity.f62907j;
                    if (aVar2 != null) {
                        return new k(B3, aVar, nVar, aVar2);
                    }
                    u.s("deleteMeasureGroupUseCase");
                    throw null;
                }
                u.s("getMeasureGroupsWithAllTypesUseCase");
                throw null;
            }
            u.s("measureListenerRegisterUseCase");
            throw null;
        }
    }

    /* compiled from: WeightListActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements p<androidx.compose.runtime.a, Integer, y> {
        c() {
            super(2);
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                o.b(false, s1.b.b(aVar2, 2132246862, new h(WeightListActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class d implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f62913a = nm0.h.b(new i(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f62914b;

        public d(Activity activity) {
            this.f62914b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f62913a.getValue();
        }
    }

    public WeightListActivity() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new com.withings.overview.ui.b(this, 1));
        u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f62909l = registerForActivityResult;
    }

    public static final k A3(WeightListActivity weightListActivity) {
        return (k) weightListActivity.f62903f.getValue();
    }

    public static final User B3(WeightListActivity weightListActivity) {
        weightListActivity.getClass();
        return (User) weightListActivity.f62902e.getValue(weightListActivity, f62900m[0]);
    }

    public static final void C3(WeightListActivity weightListActivity) {
        weightListActivity.getClass();
        AddMeasureActivity.a aVar = AddMeasureActivity.f58098m;
        long q11 = ((User) weightListActivity.f62902e.getValue(weightListActivity, f62900m[0])).q();
        aVar.getClass();
        weightListActivity.f62909l.a(AddMeasureActivity.a.a(weightListActivity, 1, true, false, q11, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
        if (r4 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList D3(com.withings.wiscale2.weight.list.WeightListActivity r12, java.util.LinkedHashMap r13, android.content.Context r14) {
        /*
            r12.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r13 = r13.entrySet()
            java.util.Iterator r13 = r13.iterator()
        L10:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L85
            java.lang.Object r1 = r13.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Object r3 = r1.getValue()
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        L2b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L72
            java.lang.Object r4 = r3.next()
            r10 = r4
            ky.d r10 = (ky.d) r10
            r4 = 1
            ky.a r5 = ly.a.e(r4, r10)
            if (r5 == 0) goto L54
            double r5 = r5.f()
            nm0.g r7 = r12.f62904g
            java.lang.Object r7 = r7.getValue()
            jm.a r7 = (jm.a) r7
            java.lang.String r4 = r7.f(r5, r4)
            if (r4 != 0) goto L52
            goto L54
        L52:
            r7 = r4
            goto L57
        L54:
            java.lang.String r4 = ""
            goto L52
        L57:
            org.joda.time.DateTime r4 = r10.c()
            java.lang.String r9 = b50.b.i(r14, r4)
            hk.a r4 = new hk.a
            r5 = 2131231557(0x7f080345, float:1.8079198E38)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            r6 = 0
            r8 = 0
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r2.add(r4)
            goto L2b
        L72:
            hk.k r3 = new hk.k
            java.lang.Object r1 = r1.getKey()
            com.withings.wiscale2.weight.list.b r1 = (com.withings.wiscale2.weight.list.b) r1
            java.lang.String r1 = r1.a()
            r3.<init>(r1, r2)
            r0.add(r3)
            goto L10
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.weight.list.WeightListActivity.D3(com.withings.wiscale2.weight.list.WeightListActivity, java.util.LinkedHashMap, android.content.Context):java.util.ArrayList");
    }

    public static final jm.a z3(WeightListActivity weightListActivity) {
        return (jm.a) weightListActivity.f62904g.getValue();
    }

    @Override // com.withings.wiscale2.weight.list.Hilt_WeightListActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, 475633588, new c()));
    }
}
