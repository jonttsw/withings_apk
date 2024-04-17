package com.withings.wiscale2.heart.afib;

import android.app.Activity;
import android.os.Bundle;
import androidx.core.view.l1;
import com.google.android.material.appbar.AppBarLayout;
import com.withings.measure.detail.paged.d;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.heart.afib.f0;
import javax.inject.Inject;
import kotlin.Metadata;
import org.joda.time.DateTime;
/* compiled from: AFibActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/heart/afib/AFibActivity;", "Lcom/withings/measure/detail/paged/DatePagedActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AFibActivity extends Hilt_AFibActivity {

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f57068m = {androidx.camera.core.v.c(AFibActivity.class, "isMedical", "isMedical()Z", 0)};
    @Inject

    /* renamed from: k  reason: collision with root package name */
    public fy.o f57070k;

    /* renamed from: j  reason: collision with root package name */
    private final b f57069j = new b(this);

    /* renamed from: l  reason: collision with root package name */
    private final String f57071l = "afib_event";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AFibActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.afib.AFibActivity", f = "AFibActivity.kt", l = {46, 47}, m = "loadFirstDataTimestamp")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f57072a;

        /* renamed from: c  reason: collision with root package name */
        int f57074c;

        a(qm0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f57072a = obj;
            this.f57074c |= Integer.MIN_VALUE;
            return AFibActivity.this.C3(this);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class b implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57075a = nm0.h.b(new com.withings.wiscale2.heart.afib.a(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f57076b;

        public b(Activity activity) {
            this.f57076b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f57075a.getValue();
        }
    }

    private final boolean E3() {
        return ((Boolean) this.f57069j.getValue(this, f57068m[0])).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd  */
    @Override // com.withings.measure.detail.paged.DatePagedActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C3(qm0.d<? super org.joda.time.DateTime> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.withings.wiscale2.heart.afib.AFibActivity.a
            if (r0 == 0) goto L13
            r0 = r10
            com.withings.wiscale2.heart.afib.AFibActivity$a r0 = (com.withings.wiscale2.heart.afib.AFibActivity.a) r0
            int r1 = r0.f57074c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f57074c = r1
            goto L18
        L13:
            com.withings.wiscale2.heart.afib.AFibActivity$a r0 = new com.withings.wiscale2.heart.afib.AFibActivity$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f57072a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f57074c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            nm0.l.b(r10)
            goto L75
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            nm0.l.b(r10)
            goto L69
        L37:
            nm0.l.b(r10)
            r9.D3(r5)
            org.joda.time.DateTime r10 = org.joda.time.DateTime.now()
            long r6 = r10.getMillis()
            com.withings.wiscale2.heart.afib.l r10 = new com.withings.wiscale2.heart.afib.l
            com.withings.user.User r2 = r9.getUser()
            fy.o r8 = r9.f57070k
            if (r8 == 0) goto Lc7
            r10.<init>(r2, r8)
            boolean r2 = r9.E3()
            if (r2 == 0) goto L6c
            com.withings.wiscale2.heart.afib.AFibType r2 = com.withings.wiscale2.heart.afib.AFibType.f57108b
            com.withings.wiscale2.heart.afib.AFibType r4 = com.withings.wiscale2.heart.afib.AFibType.f57109c
            com.withings.wiscale2.heart.afib.AFibType[] r2 = new com.withings.wiscale2.heart.afib.AFibType[]{r2, r4}
            r0.f57074c = r5
            java.lang.Object r10 = r10.a(r2, r6, r0)
            if (r10 != r1) goto L69
            return r1
        L69:
            java.util.List r10 = (java.util.List) r10
            goto L77
        L6c:
            r0.f57074c = r4
            java.lang.Object r10 = r10.e(r6, r0)
            if (r10 != r1) goto L75
            return r1
        L75:
            java.util.List r10 = (java.util.List) r10
        L77:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            boolean r0 = r10.hasNext()
            if (r0 != 0) goto L84
            goto Laf
        L84:
            java.lang.Object r3 = r10.next()
            boolean r0 = r10.hasNext()
            if (r0 != 0) goto L8f
            goto Laf
        L8f:
            r0 = r3
            ky.a r0 = (ky.a) r0
            org.joda.time.DateTime r0 = r0.b()
        L96:
            java.lang.Object r1 = r10.next()
            r2 = r1
            ky.a r2 = (ky.a) r2
            org.joda.time.DateTime r2 = r2.b()
            int r4 = r0.compareTo(r2)
            if (r4 <= 0) goto La9
            r3 = r1
            r0 = r2
        La9:
            boolean r1 = r10.hasNext()
            if (r1 != 0) goto L96
        Laf:
            ky.a r3 = (ky.a) r3
            if (r3 == 0) goto Lbd
            org.joda.time.DateTime r10 = new org.joda.time.DateTime
            org.joda.time.DateTime r0 = r3.b()
            r10.<init>(r0)
            goto Lc6
        Lbd:
            org.joda.time.DateTime r10 = org.joda.time.DateTime.now()
            java.lang.String r0 = "now(...)"
            kotlin.jvm.internal.u.i(r10, r0)
        Lc6:
            return r10
        Lc7:
            java.lang.String r10 = "getMeasuresGroupList"
            kotlin.jvm.internal.u.s(r10)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.heart.afib.AFibActivity.C3(qm0.d):java.lang.Object");
    }

    @Override // py.a
    public final String getAnalyticsDetailsViewIdentifier() {
        return this.f57071l;
    }

    @Override // com.withings.wiscale2.heart.afib.Hilt_AFibActivity, com.withings.measure.detail.paged.DatePagedActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        int i11;
        super.onCreate(bundle);
        getWindow().setNavigationBarColor(0);
        l1.a(getWindow(), false);
        AppBarLayout appBar = A3().f90072b;
        kotlin.jvm.internal.u.i(appBar, "appBar");
        ay.b.n(appBar, true, false, 29);
        if (E3()) {
            i11 = C1987R.string.heartEvents_afib_title;
        } else {
            i11 = C1987R.string.heartEvents_nonMedical_title;
        }
        setTitle(i11);
    }

    @Override // com.withings.measure.detail.paged.DatePagedActivity
    public final f0 z3(DateTime firstDate) {
        kotlin.jvm.internal.u.j(firstDate, "firstDate");
        D3(false);
        f0.a aVar = f0.f57145n;
        User user = getUser();
        DateTime B3 = B3();
        boolean E3 = E3();
        aVar.getClass();
        kotlin.jvm.internal.u.j(user, "user");
        d.a aVar2 = com.withings.measure.detail.paged.d.f41711j;
        f0 f0Var = new f0();
        f0Var.setArguments(androidx.core.os.e.a(new nm0.j("isMedical", Boolean.valueOf(E3))));
        aVar2.getClass();
        Bundle a11 = androidx.core.os.e.a(new nm0.j("EXTRA_USER", user), new nm0.j("EXTRA_DATE", B3), new nm0.j("EXTRA_FIRST_DATE", firstDate));
        Bundle arguments = f0Var.getArguments();
        if (arguments != null) {
            a11.putAll(arguments);
        }
        f0Var.setArguments(a11);
        return f0Var;
    }
}
