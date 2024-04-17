package com.withings.wiscale2.measure.accountmeasure.ui.add;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.Measure;
import com.withings.library.measure.MeasuresGroup;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import jm.a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import l70.j;
import l70.u;
import l70.w;
/* compiled from: AddBodyTemperatureFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/measure/accountmeasure/ui/add/k;", "Lcom/withings/wiscale2/measure/accountmeasure/ui/add/j0;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class k extends e1 {
    public static final /* synthetic */ int P = 0;
    private l70.u F;
    @Inject
    public fy.p G;

    /* renamed from: z  reason: collision with root package name */
    private NumberPicker f58212z;
    private final nm0.g A = nm0.h.b(new b());
    private final nm0.g B = nm0.h.b(c.f58219a);
    private final boolean M = true;

    /* compiled from: AddBodyTemperatureFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.accountmeasure.ui.add.AddBodyTemperatureFragment$onViewCreated$1", f = "AddBodyTemperatureFragment.kt", l = {60, 62}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        k f58213a;

        /* renamed from: b  reason: collision with root package name */
        u.a f58214b;

        /* renamed from: c  reason: collision with root package name */
        int f58215c;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View f58217e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f58217e = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f58217e, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            u.a aVar;
            k kVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f58215c;
            k kVar2 = k.this;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = this.f58214b;
                kVar = this.f58213a;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                aVar = l70.u.f78815b;
                l70.w H1 = k.H1(kVar2);
                this.f58213a = kVar2;
                this.f58214b = aVar;
                this.f58215c = 1;
                obj = ah.g.q(H1, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                kVar = kVar2;
            }
            int d11 = ((l70.v) obj).d();
            aVar.getClass();
            kVar.F = u.a.e(d11);
            k.I1(kVar2, this.f58217e);
            this.f58213a = null;
            this.f58214b = null;
            this.f58215c = 2;
            if (k.J1(kVar2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: AddBodyTemperatureFragment.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<jm.a> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final jm.a invoke() {
            Context requireContext = k.this.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            return a.d.a(requireContext);
        }
    }

    /* compiled from: AddBodyTemperatureFragment.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<l70.w> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f58219a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final l70.w invoke() {
            return w.a.a();
        }
    }

    public static String G1(k this$0, int i11) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        return ((jm.a) this$0.A.getValue()).f(this$0.M1(i11), 71);
    }

    public static final l70.w H1(k kVar) {
        return (l70.w) kVar.B.getValue();
    }

    public static final void I1(final k kVar, View view) {
        kVar.getClass();
        View findViewById = view.findViewById(C1987R.id.body_temperature);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        NumberPicker numberPicker = (NumberPicker) findViewById;
        kVar.f58212z = numberPicker;
        numberPicker.setMinValue(kVar.N1(36.0d));
        numberPicker.setMaxValue(kVar.N1(41.0d));
        numberPicker.setFormatter(new NumberPicker.Formatter() { // from class: com.withings.wiscale2.measure.accountmeasure.ui.add.g
            @Override // android.widget.NumberPicker.Formatter
            public final String format(int i11) {
                return k.G1(k.this, i11);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J1(com.withings.wiscale2.measure.accountmeasure.ui.add.k r5, qm0.d r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof com.withings.wiscale2.measure.accountmeasure.ui.add.i
            if (r0 == 0) goto L16
            r0 = r6
            com.withings.wiscale2.measure.accountmeasure.ui.add.i r0 = (com.withings.wiscale2.measure.accountmeasure.ui.add.i) r0
            int r1 = r0.f58195d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f58195d = r1
            goto L1b
        L16:
            com.withings.wiscale2.measure.accountmeasure.ui.add.i r0 = new com.withings.wiscale2.measure.accountmeasure.ui.add.i
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f58193b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f58195d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            com.withings.wiscale2.measure.accountmeasure.ui.add.k r5 = r0.f58192a
            nm0.l.b(r6)
            goto L4c
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            nm0.l.b(r6)
            kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.wiscale2.measure.accountmeasure.ui.add.j r2 = new com.withings.wiscale2.measure.accountmeasure.ui.add.j
            r2.<init>(r5, r3)
            r0.f58192a = r5
            r0.f58195d = r4
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r6 != r1) goto L4c
            goto L79
        L4c:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            android.widget.NumberPicker r0 = r5.f58212z
            java.lang.String r1 = "temperatureView"
            if (r0 == 0) goto L7e
            r2 = 0
            android.view.View r0 = r0.getChildAt(r2)
            boolean r4 = r0 instanceof android.widget.EditText
            if (r4 == 0) goto L64
            android.widget.EditText r0 = (android.widget.EditText) r0
            goto L65
        L64:
            r0 = r3
        L65:
            if (r0 == 0) goto L70
            android.text.InputFilter[] r2 = new android.text.InputFilter[r2]
            r0.setFilters(r2)
            r2 = 4
            r0.setVisibility(r2)
        L70:
            android.widget.NumberPicker r5 = r5.f58212z
            if (r5 == 0) goto L7a
            r5.setValue(r6)
            nm0.y r1 = nm0.y.f85009a
        L79:
            return r1
        L7a:
            kotlin.jvm.internal.u.s(r1)
            throw r3
        L7e:
            kotlin.jvm.internal.u.s(r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.measure.accountmeasure.ui.add.k.J1(com.withings.wiscale2.measure.accountmeasure.ui.add.k, qm0.d):java.lang.Object");
    }

    private final double M1(int i11) {
        double d11;
        double d12;
        if (this.F instanceof l70.j) {
            int i12 = l70.j.f78807c;
            d11 = (i11 / 10) - 32.0d;
            d12 = 1.8d;
        } else {
            d11 = i11;
            d12 = 10;
        }
        return d11 / d12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int N1(double d11) {
        if (this.F instanceof l70.j) {
            int i11 = l70.j.f78807c;
            d11 = j.a.a(d11);
        }
        return (int) (d11 * 10);
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.j0
    public final void F1() {
        String str;
        super.F1();
        if (v1()) {
            str = "detail_view";
        } else {
            str = ConstantsWs.SYNC_PROCESS_TIMELINE;
        }
        gh0.a.b(str, u1());
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.j0, com.withings.wiscale2.measure.accountmeasure.ui.add.h0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new a(view, null), 3, null);
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.h0
    public final MeasuresGroup s1() {
        MeasuresGroup measuresGroup = new MeasuresGroup(1);
        measuresGroup.setDevtype(0);
        measuresGroup.setDate(u1().toDate());
        Measure measure = new Measure();
        measure.setDate(u1().toDate());
        measure.setType(71);
        NumberPicker numberPicker = this.f58212z;
        if (numberPicker != null) {
            measure.setValue(Math.pow(10.0d, 3) * M1(numberPicker.getValue()));
            measure.setUnit(-3);
            measuresGroup.addMeasure(measure);
            return measuresGroup;
        }
        kotlin.jvm.internal.u.s("temperatureView");
        throw null;
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.h0
    public final boolean w1() {
        return this.M;
    }
}
