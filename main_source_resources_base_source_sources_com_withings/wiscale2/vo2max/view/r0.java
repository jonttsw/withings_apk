package com.withings.wiscale2.vo2max.view;

import android.app.Application;
import com.withings.library.measure.MeasuresGroup;
import com.withings.measure.android.data.FitnessLevel;
import com.withings.user.User;
import com.withings.views.view.HorizontalScaleView;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.Dispatchers;
import m80.a;
/* compiled from: Vo2MaxImprovement.kt */
/* loaded from: classes5.dex */
public final class r0 extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final MeasuresGroup f62806a;

    /* renamed from: b  reason: collision with root package name */
    private final User f62807b;

    /* renamed from: c  reason: collision with root package name */
    private final fy.l f62808c;

    /* renamed from: d  reason: collision with root package name */
    private final androidx.lifecycle.k0 f62809d;

    /* renamed from: e  reason: collision with root package name */
    private final androidx.lifecycle.k0 f62810e;

    /* renamed from: f  reason: collision with root package name */
    private final xw.p<a, Integer, Integer> f62811f;

    /* renamed from: g  reason: collision with root package name */
    private final xw.o<a, Integer, Integer, String> f62812g;

    /* compiled from: Vo2MaxImprovement.kt */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Integer f62813a;

        /* renamed from: b  reason: collision with root package name */
        private final FitnessLevel f62814b;

        public a(Integer num, FitnessLevel fitnessLevel) {
            kotlin.jvm.internal.u.j(fitnessLevel, "fitnessLevel");
            this.f62813a = num;
            this.f62814b = fitnessLevel;
        }

        public final Integer a() {
            return this.f62813a;
        }

        public final FitnessLevel b() {
            return this.f62814b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (kotlin.jvm.internal.u.e(this.f62813a, aVar.f62813a) && this.f62814b == aVar.f62814b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            Integer num = this.f62813a;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            return this.f62814b.hashCode() + (hashCode * 31);
        }

        public final String toString() {
            return "Vo2maxHistory(firstValidVo2Max=" + this.f62813a + ", fitnessLevel=" + this.f62814b + ")";
        }
    }

    /* compiled from: Vo2MaxImprovement.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.r<xw.o<a, Integer, Integer, String>, a, Integer, Integer, nm0.y> {
        b() {
            super(4);
        }

        @Override // ym0.r
        public final nm0.y invoke(xw.o<a, Integer, Integer, String> oVar, a aVar, Integer num, Integer num2) {
            String format;
            xw.o<a, Integer, Integer, String> liveData = oVar;
            a history = aVar;
            Integer num3 = num;
            int intValue = num2.intValue();
            kotlin.jvm.internal.u.j(liveData, "liveData");
            kotlin.jvm.internal.u.j(history, "history");
            Application application = r0.this.getApplication();
            kotlin.jvm.internal.u.h(application, "null cannot be cast to non-null type android.content.Context");
            if (num3 == null) {
                format = application.getString(C1987R.string.vo2MaxDetails_improvement_subtitle_waiting);
                kotlin.jvm.internal.u.i(format, "getString(...)");
            } else if (history.b() == FitnessLevel.f41674h) {
                format = application.getString(C1987R.string.vo2MaxDetails_improvement_subtitle_formatted_athlete);
                kotlin.jvm.internal.u.i(format, "getString(...)");
            } else if (num3.intValue() > intValue) {
                int a11 = an0.a.a((history.b().b() - 1) * 100);
                String string = application.getString(C1987R.string.vo2MaxDetails_improvement_subtitle_formatted);
                kotlin.jvm.internal.u.i(string, "getString(...)");
                format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(a11)}, 1));
            } else {
                String string2 = application.getString(C1987R.string.vo2MaxDetails_improvement_subtitle_goal_reached_formatted);
                kotlin.jvm.internal.u.i(string2, "getString(...)");
                format = String.format(string2, Arrays.copyOf(new Object[]{num3}, 1));
            }
            liveData.setValue(format);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Vo2MaxImprovement.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.q<xw.p<a, Integer, Integer>, a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f62816a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(xw.p<a, Integer, Integer> pVar, a aVar, Integer num) {
            Integer num2;
            xw.p<a, Integer, Integer> liveData = pVar;
            a history = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(liveData, "liveData");
            kotlin.jvm.internal.u.j(history, "history");
            Integer a11 = history.a();
            if (a11 != null) {
                num2 = Integer.valueOf(Math.max((int) (history.b().b() * a11.intValue()), intValue));
            } else {
                num2 = null;
            }
            liveData.setValue(num2);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Vo2MaxImprovement.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vo2max.view.Vo2MaxImprovementViewModel$vo2maxHistory$1", f = "Vo2MaxImprovement.kt", l = {48, 56, 57}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<a>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        FitnessLevel f62817a;

        /* renamed from: b  reason: collision with root package name */
        int f62818b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f62819c;

        d(qm0.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f62819c = obj;
            return dVar2;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<a> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((d) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00e0 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 228
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.vo2max.view.r0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Comparator] */
    public r0(Application application, MeasuresGroup vo2MaxMeasuresGroup, User user, fy.l lVar) {
        super(application);
        boolean z5;
        kotlin.jvm.internal.u.j(vo2MaxMeasuresGroup, "vo2MaxMeasuresGroup");
        kotlin.jvm.internal.u.j(user, "user");
        this.f62806a = vo2MaxMeasuresGroup;
        this.f62807b = user;
        this.f62808c = lVar;
        new androidx.lifecycle.k0();
        this.f62809d = xw.d.a(Integer.valueOf(an0.a.a(vo2MaxMeasuresGroup.getMeasureForType(123).f95794y)));
        int i11 = m80.a.f81744h;
        int d11 = user.d();
        int p11 = user.p();
        int i12 = 0;
        if (p11 == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        a.d f11 = a.C1293a.f(d11, z5);
        Application application2 = getApplication();
        kotlin.jvm.internal.u.h(application2, "null cannot be cast to non-null type android.content.Context");
        List D0 = kotlin.collections.x.D0(kotlin.collections.x.G(kotlin.collections.x.q(Integer.valueOf(f11.h() * 10), Integer.valueOf(f11.g() * 10), Integer.valueOf(f11.b() * 10), Integer.valueOf(f11.c() * 10), Integer.valueOf(f11.d() * 10), null, null)), new Object());
        int h11 = f11.h() * 10;
        List list = D0;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
        Iterator it = list.iterator();
        while (true) {
            HorizontalScaleView.f fVar = null;
            if (it.hasNext()) {
                Object next = it.next();
                int i13 = i12 + 1;
                if (i12 >= 0) {
                    int intValue = ((Number) next).intValue();
                    if (i12 < D0.size() - 1) {
                        fVar = new HorizontalScaleView.f("", ((Number) D0.get(i13)).intValue() - intValue, androidx.core.content.a.getColor(application2, C1987R.color.statusInfo));
                    }
                    arrayList.add(fVar);
                    i12 = i13;
                } else {
                    kotlin.collections.x.K0();
                    throw null;
                }
            } else {
                this.f62810e = xw.d.a(new HorizontalScaleView.e(h11, kotlin.collections.x.G(arrayList)));
                androidx.lifecycle.f a11 = androidx.lifecycle.h.a(Dispatchers.getIO(), new d(null), 2);
                xw.p<a, Integer, Integer> pVar = new xw.p<>(a11, this.f62809d, c.f62816a);
                this.f62811f = pVar;
                this.f62812g = new xw.o<>(a11, pVar, this.f62809d, new b());
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f0(com.withings.wiscale2.vo2max.view.r0 r12, java.util.Date r13, qm0.d r14) {
        /*
            r12.getClass()
            boolean r0 = r14 instanceof com.withings.wiscale2.vo2max.view.s0
            if (r0 == 0) goto L17
            r0 = r14
            com.withings.wiscale2.vo2max.view.s0 r0 = (com.withings.wiscale2.vo2max.view.s0) r0
            int r1 = r0.f62829c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f62829c = r1
        L15:
            r8 = r0
            goto L1d
        L17:
            com.withings.wiscale2.vo2max.view.s0 r0 = new com.withings.wiscale2.vo2max.view.s0
            r0.<init>(r12, r14)
            goto L15
        L1d:
            java.lang.Object r14 = r8.f62827a
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r8.f62829c
            r10 = 0
            r11 = 123(0x7b, float:1.72E-43)
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            nm0.l.b(r14)
            goto L70
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            nm0.l.b(r14)
            if (r13 == 0) goto L8e
            com.withings.user.User r14 = r12.f62807b
            long r3 = r14.q()
            long r13 = r13.getTime()
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r13)
            com.withings.library.measure.MeasuresGroup r13 = r12.f62806a
            java.util.Date r13 = r13.getDate()
            long r13 = r13.getTime()
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r13)
            int[] r7 = new int[]{r11}
            r8.f62829c = r2
            fy.l r1 = r12.f62808c
            r12 = 0
            r9 = 24
            r2 = r3
            r4 = r5
            r5 = r6
            r6 = r12
            java.lang.Object r14 = fy.l.c(r1, r2, r4, r5, r6, r7, r8, r9)
            if (r14 != r0) goto L70
            goto L8f
        L70:
            java.util.List r14 = (java.util.List) r14
            r12 = 3
            java.lang.Object r12 = kotlin.collections.x.N(r12, r14)
            ky.d r12 = (ky.d) r12
            if (r12 == 0) goto L8e
            ky.a r12 = ly.a.c(r11, r12)
            if (r12 == 0) goto L8e
            double r12 = r12.f()
            int r12 = an0.a.a(r12)
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r12)
        L8e:
            r0 = r10
        L8f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.vo2max.view.r0.f0(com.withings.wiscale2.vo2max.view.r0, java.util.Date, qm0.d):java.lang.Object");
    }

    public final androidx.lifecycle.k0 k0() {
        return this.f62809d;
    }

    public final androidx.lifecycle.k0 m0() {
        return this.f62810e;
    }

    public final xw.o<a, Integer, Integer, String> p0() {
        return this.f62812g;
    }

    public final xw.p<a, Integer, Integer> q0() {
        return this.f62811f;
    }
}
