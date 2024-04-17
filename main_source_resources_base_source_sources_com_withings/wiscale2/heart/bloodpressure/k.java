package com.withings.wiscale2.heart.bloodpressure;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.Measure;
import com.withings.library.measure.MeasuresGroup;
import com.withings.measure.detail.graduation.month.MonthlyLegendView;
import com.withings.measure.detail.graduation.week.WeeklyLegendView;
import com.withings.measure.detail.graduation.year.YearlyLegendView;
import com.withings.user.User;
import com.withings.views.measure.detail.ui.views.DataView;
import com.withings.views.view.BlockableViewPager;
import com.withings.views.view.CustomNestedScrollView;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.heart.HeartDetailActivity;
import com.withings.wiscale2.heart.HeartHistoryActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import jm.a;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
import tb0.x1;
/* compiled from: BloodPressureHistoryFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withings/wiscale2/heart/bloodpressure/k;", "Landroidx/fragment/app/Fragment;", "Lcom/withings/views/view/CustomNestedScrollView$c;", "Lcom/withings/wiscale2/heart/f;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class k extends l0 implements CustomNestedScrollView.c, com.withings.wiscale2.heart.f {

    /* renamed from: h  reason: collision with root package name */
    private final LifecycleViewBindingProperty f57403h = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());

    /* renamed from: i  reason: collision with root package name */
    private final d f57404i = new d(this);

    /* renamed from: j  reason: collision with root package name */
    private final e f57405j = new e(this);

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f57406k = nm0.h.b(new c());

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f57407l = nm0.h.b(new b());

    /* renamed from: m  reason: collision with root package name */
    private CustomNestedScrollView.b f57408m;

    /* renamed from: n  reason: collision with root package name */
    private int f57409n;

    /* renamed from: o  reason: collision with root package name */
    private ObjectAnimator f57410o;

    /* renamed from: p  reason: collision with root package name */
    public jm.a f57411p;

    /* renamed from: q  reason: collision with root package name */
    private BlockableViewPager.b f57412q;

    /* renamed from: r  reason: collision with root package name */
    private MeasuresGroup f57413r;

    /* renamed from: s  reason: collision with root package name */
    private MeasuresGroup f57414s;

    /* renamed from: t  reason: collision with root package name */
    private MeasuresGroup f57415t;

    /* renamed from: u  reason: collision with root package name */
    private MeasuresGroup f57416u;
    @Inject

    /* renamed from: v  reason: collision with root package name */
    public fy.l f57417v;

    /* renamed from: x  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f57402x = {androidx.camera.core.v.c(k.class, "layout", "getLayout()Lcom/withings/wiscale2/databinding/FragmentBloodPressureHistoryDetailBinding;", 0), androidx.camera.core.v.c(k.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(k.class, "date", "getDate()Lorg/joda/time/DateTime;", 0)};

    /* renamed from: w  reason: collision with root package name */
    public static final a f57401w = new Object();

    /* compiled from: BloodPressureHistoryFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: BloodPressureHistoryFragment.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<Integer> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final Integer invoke() {
            return Integer.valueOf(yq.b.a(k.this).getInt("extra_current_scroll"));
        }
    }

    /* compiled from: BloodPressureHistoryFragment.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<Integer> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Integer invoke() {
            return Integer.valueOf(yq.b.a(k.this).getInt("extra_granularity"));
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class d implements bn0.d<Fragment, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57420a = nm0.h.b(new o(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f57421b;

        public d(Fragment fragment) {
            this.f57421b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f57420a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class e implements bn0.d<Fragment, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57422a = nm0.h.b(new p(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f57423b;

        public e(Fragment fragment) {
            this.f57423b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [org.joda.time.DateTime, java.lang.Object] */
        @Override // bn0.d
        public final DateTime getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f57422a.getValue();
        }
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.l<k, x1> {
        @Override // ym0.l
        public final x1 invoke(k kVar) {
            k fragment = kVar;
            kotlin.jvm.internal.u.j(fragment, "fragment");
            return x1.a(fragment.requireView());
        }
    }

    public static final void A1(k kVar, List list) {
        kVar.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (((Number) kVar.f57406k.getValue()).intValue() == 31) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list) {
                if (kotlin.jvm.internal.u.e(new DateTime(((MeasuresGroup) obj).getDate().getTime()).monthOfYear(), new DateTime(((MeasuresGroup) kotlin.collections.x.I(list)).getDate().getTime()).monthOfYear())) {
                    arrayList3.add(obj);
                }
            }
            list = arrayList3;
        }
        List<MeasuresGroup> list2 = list;
        for (MeasuresGroup measuresGroup : list2) {
            Measure measureForType = measuresGroup.getMeasureForType(10);
            kotlin.jvm.internal.u.i(measureForType, "getMeasureForType(...)");
            arrayList2.add(measureForType);
            Measure measureForType2 = measuresGroup.getMeasureForType(9);
            kotlin.jvm.internal.u.i(measureForType2, "getMeasureForType(...)");
            arrayList.add(measureForType2);
        }
        int height = kVar.C1().f99612c.getHeight();
        if (arrayList.size() == 1 && arrayList2.size() == 1) {
            kVar.C1().f99611b.setLabel(C1987R.string._BPV2_SYSTOL_);
            kVar.C1().f99610a.setLabel(C1987R.string._BPV2_DIASTOL_);
            kVar.C1().f99611b.setValue(jm.a.c(kVar.D1(), 10, ((Measure) kotlin.collections.x.I(arrayList2)).f95794y, 0, 0, 60));
            kVar.C1().f99610a.setValue(jm.a.c(kVar.D1(), 9, ((Measure) kotlin.collections.x.I(arrayList)).f95794y, 0, 0, 60));
            kVar.B1(kotlin.collections.x.u0(list2));
        } else {
            DataView dataView = kVar.C1().f99611b;
            jm.a D1 = kVar.D1();
            Iterator it = arrayList2.iterator();
            double d11 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            double d12 = 0.0d;
            while (it.hasNext()) {
                d12 += ((Measure) it.next()).f95794y;
            }
            dataView.setValue(jm.a.c(D1, 10, Math.round(d12 / arrayList.size()), 0, 0, 60));
            DataView dataView2 = kVar.C1().f99610a;
            jm.a D12 = kVar.D1();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                d11 += ((Measure) it2.next()).f95794y;
            }
            dataView2.setValue(jm.a.c(D12, 9, Math.round(d11 / arrayList.size()), 0, 0, 60));
            kVar.B1(kotlin.collections.x.u0(list2));
        }
        kVar.C1().f99612c.getLayoutParams().height = height;
    }

    private final void B1(List<? extends MeasuresGroup> list) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        List<? extends MeasuresGroup> list2 = list;
        Iterator<T> it = list2.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                double d11 = ((MeasuresGroup) next).getMeasureForType(10).f95794y;
                do {
                    Object next5 = it.next();
                    double d12 = ((MeasuresGroup) next5).getMeasureForType(10).f95794y;
                    if (Double.compare(d11, d12) < 0) {
                        next = next5;
                        d11 = d12;
                    }
                } while (it.hasNext());
            }
        }
        kotlin.jvm.internal.u.g(next);
        this.f57413r = (MeasuresGroup) next;
        Iterator<T> it2 = list2.iterator();
        if (!it2.hasNext()) {
            next2 = null;
        } else {
            next2 = it2.next();
            if (it2.hasNext()) {
                double d13 = ((MeasuresGroup) next2).getMeasureForType(10).f95794y;
                do {
                    Object next6 = it2.next();
                    double d14 = ((MeasuresGroup) next6).getMeasureForType(10).f95794y;
                    if (Double.compare(d13, d14) > 0) {
                        next2 = next6;
                        d13 = d14;
                    }
                } while (it2.hasNext());
            }
        }
        kotlin.jvm.internal.u.g(next2);
        this.f57415t = (MeasuresGroup) next2;
        Iterator<T> it3 = list2.iterator();
        if (!it3.hasNext()) {
            next3 = null;
        } else {
            next3 = it3.next();
            if (it3.hasNext()) {
                double d15 = ((MeasuresGroup) next3).getMeasureForType(9).f95794y;
                do {
                    Object next7 = it3.next();
                    double d16 = ((MeasuresGroup) next7).getMeasureForType(9).f95794y;
                    if (Double.compare(d15, d16) < 0) {
                        next3 = next7;
                        d15 = d16;
                    }
                } while (it3.hasNext());
            }
        }
        kotlin.jvm.internal.u.g(next3);
        this.f57414s = (MeasuresGroup) next3;
        Iterator<T> it4 = list2.iterator();
        if (!it4.hasNext()) {
            next4 = null;
        } else {
            next4 = it4.next();
            if (it4.hasNext()) {
                double d17 = ((MeasuresGroup) next4).getMeasureForType(9).f95794y;
                do {
                    Object next8 = it4.next();
                    double d18 = ((MeasuresGroup) next8).getMeasureForType(9).f95794y;
                    if (Double.compare(d17, d18) > 0) {
                        next4 = next8;
                        d17 = d18;
                    }
                } while (it4.hasNext());
            }
        }
        kotlin.jvm.internal.u.g(next4);
        this.f57416u = (MeasuresGroup) next4;
        LineCellView maxSystol = C1().f99619j;
        kotlin.jvm.internal.u.i(maxSystol, "maxSystol");
        MeasuresGroup measuresGroup = this.f57413r;
        if (measuresGroup != null) {
            F1(maxSystol, measuresGroup);
            LineCellView minSystol = C1().f99621l;
            kotlin.jvm.internal.u.i(minSystol, "minSystol");
            MeasuresGroup measuresGroup2 = this.f57415t;
            if (measuresGroup2 != null) {
                F1(minSystol, measuresGroup2);
                LineCellView maxDiastol = C1().f99618i;
                kotlin.jvm.internal.u.i(maxDiastol, "maxDiastol");
                MeasuresGroup measuresGroup3 = this.f57414s;
                if (measuresGroup3 != null) {
                    E1(maxDiastol, measuresGroup3);
                    LineCellView minDiastol = C1().f99620k;
                    kotlin.jvm.internal.u.i(minDiastol, "minDiastol");
                    MeasuresGroup measuresGroup4 = this.f57416u;
                    if (measuresGroup4 != null) {
                        E1(minDiastol, measuresGroup4);
                        C1().f99619j.setOnClickListener(new androidx.media3.ui.h(this, 17));
                        C1().f99618i.setOnClickListener(new androidx.media3.ui.i(this, 18));
                        C1().f99621l.setOnClickListener(new com.google.android.material.search.j(this, 14));
                        C1().f99620k.setOnClickListener(new com.google.android.material.search.k(this, 16));
                        return;
                    }
                    kotlin.jvm.internal.u.s("minDiastolMeasuresGroup");
                    throw null;
                }
                kotlin.jvm.internal.u.s("maxDiastolMeasuresGroup");
                throw null;
            }
            kotlin.jvm.internal.u.s("minSystolMeasuresGroup");
            throw null;
        }
        kotlin.jvm.internal.u.s("maxSystolMeasuresGroup");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x1 C1() {
        return (x1) this.f57403h.getValue(this, f57402x[0]);
    }

    private static void E1(LineCellView lineCellView, MeasuresGroup measuresGroup) {
        double d11 = measuresGroup.getMeasureForType(10).f95794y;
        double d12 = measuresGroup.getMeasureForType(9).f95794y;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) (((int) d11) + "/"));
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) String.valueOf((int) d12));
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        Context context = lineCellView.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        l70.u g11 = a.d.a(context).g(9);
        Context context2 = lineCellView.getContext();
        kotlin.jvm.internal.u.i(context2, "getContext(...)");
        String h11 = g11.h(context2);
        spannableStringBuilder.append((CharSequence) (" " + h11));
        lineCellView.setValue(new SpannedString(spannableStringBuilder));
    }

    private final void F1(LineCellView lineCellView, MeasuresGroup measuresGroup) {
        double d11 = measuresGroup.getMeasureForType(10).f95794y;
        double d12 = measuresGroup.getMeasureForType(9).f95794y;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) String.valueOf((int) d11));
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        SpannableStringBuilder c11 = jm.a.c(D1(), 9, d12, 0, 0, 60);
        spannableStringBuilder.append((CharSequence) ("/" + ((Object) c11)));
        lineCellView.setValue(new SpannedString(spannableStringBuilder));
    }

    private final void G1(Context context, MeasuresGroup measuresGroup) {
        context.startActivity(HeartDetailActivity.D3(context, measuresGroup, 0, ((User) this.f57404i.getValue(this, f57402x[1])).q()));
    }

    public static void s1(k this$0, View view) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        Context context = view.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        MeasuresGroup measuresGroup = this$0.f57413r;
        if (measuresGroup != null) {
            this$0.G1(context, measuresGroup);
        } else {
            kotlin.jvm.internal.u.s("maxSystolMeasuresGroup");
            throw null;
        }
    }

    public static void t1(k this$0, View view) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        Context context = view.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        MeasuresGroup measuresGroup = this$0.f57415t;
        if (measuresGroup != null) {
            this$0.G1(context, measuresGroup);
        } else {
            kotlin.jvm.internal.u.s("minSystolMeasuresGroup");
            throw null;
        }
    }

    public static void u1(k this$0, View view) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        Context context = view.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        MeasuresGroup measuresGroup = this$0.f57414s;
        if (measuresGroup != null) {
            this$0.G1(context, measuresGroup);
        } else {
            kotlin.jvm.internal.u.s("maxDiastolMeasuresGroup");
            throw null;
        }
    }

    public static void v1(k this$0, View view) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        Context context = view.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        MeasuresGroup measuresGroup = this$0.f57416u;
        if (measuresGroup != null) {
            this$0.G1(context, measuresGroup);
        } else {
            kotlin.jvm.internal.u.s("minDiastolMeasuresGroup");
            throw null;
        }
    }

    public static final void w1(k kVar, LinearLayout linearLayout) {
        kVar.getClass();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, View.ALPHA, 0.0f, 1.0f);
        kVar.f57410o = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(150L);
        }
        ObjectAnimator objectAnimator = kVar.f57410o;
        if (objectAnimator != null) {
            objectAnimator.addListener(new l(kVar));
        }
        ObjectAnimator objectAnimator2 = kVar.f57410o;
        if (objectAnimator2 != null) {
            objectAnimator2.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable y1(com.withings.wiscale2.heart.bloodpressure.k r12, qm0.d r13) {
        /*
            r12.getClass()
            boolean r0 = r13 instanceof com.withings.wiscale2.heart.bloodpressure.n
            if (r0 == 0) goto L17
            r0 = r13
            com.withings.wiscale2.heart.bloodpressure.n r0 = (com.withings.wiscale2.heart.bloodpressure.n) r0
            int r1 = r0.f57442c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f57442c = r1
        L15:
            r8 = r0
            goto L1d
        L17:
            com.withings.wiscale2.heart.bloodpressure.n r0 = new com.withings.wiscale2.heart.bloodpressure.n
            r0.<init>(r12, r13)
            goto L15
        L1d:
            java.lang.Object r13 = r8.f57440a
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r8.f57442c
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            nm0.l.b(r13)
            goto L98
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            nm0.l.b(r13)
            r13 = 10
            r1 = 9
            int[] r7 = new int[]{r13, r1}
            fy.l r1 = r12.f57417v
            if (r1 == 0) goto L9f
            fn0.k<java.lang.Object>[] r13 = com.withings.wiscale2.heart.bloodpressure.k.f57402x
            r3 = r13[r2]
            com.withings.wiscale2.heart.bloodpressure.k$d r4 = r12.f57404i
            java.lang.Object r3 = r4.getValue(r12, r3)
            com.withings.user.User r3 = (com.withings.user.User) r3
            long r3 = r3.q()
            r5 = 2
            r6 = r13[r5]
            com.withings.wiscale2.heart.bloodpressure.k$e r9 = r12.f57405j
            java.lang.Object r6 = r9.getValue(r12, r6)
            org.joda.time.DateTime r6 = (org.joda.time.DateTime) r6
            long r10 = r6.getMillis()
            r13 = r13[r5]
            java.lang.Object r13 = r9.getValue(r12, r13)
            org.joda.time.DateTime r13 = (org.joda.time.DateTime) r13
            nm0.g r12 = r12.f57406k
            java.lang.Object r12 = r12.getValue()
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            org.joda.time.DateTime r12 = r13.plusDays(r12)
            long r12 = r12.getMillis()
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r10)
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r12)
            r8.f57442c = r2
            r9 = 16
            r12 = 1
            r2 = r3
            r4 = r5
            r5 = r6
            r6 = r12
            java.lang.Object r13 = fy.l.c(r1, r2, r4, r5, r6, r7, r8, r9)
            if (r13 != r0) goto L98
            goto L9e
        L98:
            java.util.List r13 = (java.util.List) r13
            java.util.ArrayList r0 = hy.g.f(r13)
        L9e:
            return r0
        L9f:
            java.lang.String r12 = "getMeasureGroupsWithAllTypesBetween"
            kotlin.jvm.internal.u.s(r12)
            r12 = 0
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.heart.bloodpressure.k.y1(com.withings.wiscale2.heart.bloodpressure.k, qm0.d):java.io.Serializable");
    }

    public static final void z1(k kVar) {
        kVar.C1().f99614e.setVisibility(0);
        kVar.C1().f99614e.getLayoutParams().height = kVar.C1().f99613d.getHeight();
        kVar.C1().f99613d.setVisibility(8);
    }

    public final jm.a D1() {
        jm.a aVar = this.f57411p;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.u.s("measureFormatter");
        throw null;
    }

    @Override // com.withings.wiscale2.heart.f
    public final void X() {
        ObjectAnimator objectAnimator = this.f57410o;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
        ObjectAnimator objectAnimator2 = this.f57410o;
        if (objectAnimator2 != null) {
            objectAnimator2.reverse();
        }
    }

    @Override // com.withings.wiscale2.heart.f
    public final void customScrollTo(int i11) {
        C1().f99616g.C(i11);
    }

    @Override // com.withings.wiscale2.heart.f
    public final int k1(HeartHistoryActivity context) {
        kotlin.jvm.internal.u.j(context, "context");
        return ((int) (i70.b.a(context).x * 0.75f)) - this.f57409n;
    }

    @Override // com.withings.wiscale2.heart.bloodpressure.l0, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity instanceof BlockableViewPager.b) {
            this.f57412q = (BlockableViewPager.b) activity;
        }
        if (activity instanceof CustomNestedScrollView.b) {
            this.f57408m = (CustomNestedScrollView.b) activity;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ObjectAnimator objectAnimator = this.f57410o;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f57410o = null;
        super.onDestroyView();
    }

    @Override // com.withings.views.view.CustomNestedScrollView.c
    public final void onScrolled(CustomNestedScrollView customNestedScrollView, int i11) {
        CustomNestedScrollView.b bVar = this.f57408m;
        if (bVar != null) {
            bVar.K1(i11, C1().f99617h.getMeasuredHeight());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        C1().f99624o.setAlpha(0.0f);
        Context context = view.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        this.f57411p = a.d.a(context);
        int intValue = ((Number) this.f57406k.getValue()).intValue();
        if (intValue != 31) {
            if (intValue != 365) {
                WeeklyLegendView weeklyTimeLine = C1().f99625p;
                kotlin.jvm.internal.u.i(weeklyTimeLine, "weeklyTimeLine");
                weeklyTimeLine.setVisibility(0);
                this.f57409n = C1().f99625p.getLayoutParams().height;
            } else {
                YearlyLegendView yearlyTimeLine = C1().f99626q;
                kotlin.jvm.internal.u.i(yearlyTimeLine, "yearlyTimeLine");
                yearlyTimeLine.setVisibility(0);
                this.f57409n = C1().f99626q.getLayoutParams().height;
            }
        } else {
            MonthlyLegendView monthlyTimeLine = C1().f99622m;
            kotlin.jvm.internal.u.i(monthlyTimeLine, "monthlyTimeLine");
            monthlyTimeLine.setVisibility(0);
            this.f57409n = C1().f99622m.getLayoutParams().height;
        }
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), Dispatchers.getMain(), null, new m(this, null), 2, null);
        float f11 = i70.b.a(getActivity()).x;
        int i11 = (int) (f11 * 0.75f);
        C1().f99623n.getLayoutParams().height = i11;
        C1().f99623n.requestLayout();
        C1().f99616g.E(C1().f99623n, C1().f99624o, C1().f99615f, (int) (0.42857143f * f11), i11);
        C1().f99616g.setDelegate(this);
        C1().f99616g.F(((Number) this.f57407l.getValue()).intValue());
        C1().f99615f.a();
    }
}
