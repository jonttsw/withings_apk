package com.withings.common.compose.component;

import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import com.google.accompanist.flowlayout.MainAxisAlignment;
import com.google.accompanist.flowlayout.SizeMode;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
/* compiled from: GridSelector.kt */
/* loaded from: classes3.dex */
public final class s1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GridSelector.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<q1> f34683a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f34684b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f34685c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f34686d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f34687e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ k1.r0<Integer> f34688f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.l<q1, nm0.y> f34689g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends q1> list, float f11, boolean z5, long j5, long j11, k1.r0<Integer> r0Var, ym0.l<? super q1, nm0.y> lVar) {
            super(2);
            this.f34683a = list;
            this.f34684b = f11;
            this.f34685c = z5;
            this.f34686d = j5;
            this.f34687e = j11;
            this.f34688f = r0Var;
            this.f34689g = lVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            boolean z5;
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                int i11 = 0;
                for (Object obj : this.f34683a) {
                    int i12 = i11 + 1;
                    if (i11 >= 0) {
                        q1 q1Var = (q1) obj;
                        androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(androidx.compose.ui.e.f8927a, this.f34684b);
                        int id2 = q1Var.getId();
                        k1.r0<Integer> r0Var = this.f34688f;
                        Integer value = r0Var.getValue();
                        if (value != null && id2 == value.intValue()) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        s1.b(e11, i11, q1Var, this.f34685c, z5, this.f34686d, this.f34687e, new r1(q1Var, this.f34689g, r0Var), aVar2, 0, 0);
                        i11 = i12;
                    } else {
                        kotlin.collections.x.K0();
                        throw null;
                    }
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GridSelector.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34690a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List<q1> f34691b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Integer f34692c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f34693d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f34694e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f34695f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f34696g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.l<q1, nm0.y> f34697h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f34698i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f34699j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.e eVar, List<? extends q1> list, Integer num, float f11, boolean z5, long j5, long j11, ym0.l<? super q1, nm0.y> lVar, int i11, int i12) {
            super(2);
            this.f34690a = eVar;
            this.f34691b = list;
            this.f34692c = num;
            this.f34693d = f11;
            this.f34694e = z5;
            this.f34695f = j5;
            this.f34696g = j11;
            this.f34697h = lVar;
            this.f34698i = i11;
            this.f34699j = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34698i | 1);
            long j5 = this.f34696g;
            ym0.l<q1, nm0.y> lVar = this.f34697h;
            s1.a(this.f34690a, this.f34691b, this.f34692c, this.f34693d, this.f34694e, this.f34695f, j5, lVar, aVar, g11, this.f34699j);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GridSelector.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f34700a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final /* bridge */ /* synthetic */ nm0.y invoke() {
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GridSelector.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.common.compose.component.GridSelectorKt$GridSelectorItem$2$1", f = "GridSelector.kt", l = {115}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34701a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f34702b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f34703c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i11, k1.r0<Boolean> r0Var, qm0.d<? super d> dVar) {
            super(2, dVar);
            this.f34702b = i11;
            this.f34703c = r0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new d(this.f34702b, this.f34703c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f34701a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                this.f34701a = 1;
                if (DelayKt.delay(this.f34702b * 50, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            this.f34703c.setValue(Boolean.TRUE);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GridSelector.kt */
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34704a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f34705b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q1 f34706c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f34707d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f34708e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f34709f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f34710g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f34711h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f34712i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f34713j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.compose.ui.e eVar, int i11, q1 q1Var, boolean z5, boolean z11, long j5, long j11, ym0.a<nm0.y> aVar, int i12, int i13) {
            super(2);
            this.f34704a = eVar;
            this.f34705b = i11;
            this.f34706c = q1Var;
            this.f34707d = z5;
            this.f34708e = z11;
            this.f34709f = j5;
            this.f34710g = j11;
            this.f34711h = aVar;
            this.f34712i = i12;
            this.f34713j = i13;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34712i | 1);
            long j5 = this.f34710g;
            ym0.a<nm0.y> aVar2 = this.f34711h;
            s1.b(this.f34704a, this.f34705b, this.f34706c, this.f34707d, this.f34708e, this.f34709f, j5, aVar2, aVar, g11, this.f34713j);
            return nm0.y.f85009a;
        }
    }

    public static final void a(androidx.compose.ui.e eVar, List<? extends q1> choices, Integer num, float f11, boolean z5, long j5, long j11, ym0.l<? super q1, nm0.y> onChoiceSelected, androidx.compose.runtime.a aVar, int i11, int i12) {
        e.a aVar2;
        Integer num2;
        float f12;
        boolean z11;
        long j12;
        int i13;
        long j13;
        int i14;
        kotlin.jvm.internal.u.j(choices, "choices");
        kotlin.jvm.internal.u.j(onChoiceSelected, "onChoiceSelected");
        androidx.compose.runtime.b g11 = aVar.g(290916435);
        if ((i12 & 1) != 0) {
            aVar2 = androidx.compose.ui.e.f8927a;
        } else {
            aVar2 = eVar;
        }
        if ((i12 & 4) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i12 & 8) != 0) {
            f12 = 0.0f;
        } else {
            f12 = f11;
        }
        if ((i12 & 16) != 0) {
            z11 = true;
        } else {
            z11 = z5;
        }
        if ((i12 & 32) != 0) {
            i13 = i11 & (-458753);
            j12 = ((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).J();
        } else {
            j12 = j5;
            i13 = i11;
        }
        if ((i12 & 64) != 0) {
            i14 = i13 & (-3670017);
            j13 = ((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).M();
        } else {
            j13 = j11;
            i14 = i13;
        }
        g11.s(-1934201261);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
            g11.n(t11);
        }
        k1.r0 r0Var = (k1.r0) t11;
        g11.J();
        r0Var.setValue(num2);
        Integer num3 = num2;
        wb.a.b(aVar2, SizeMode.f24404b, MainAxisAlignment.f24400c, 0.0f, null, yk.h.b(), null, s1.b.b(g11, -1489494503, new a(choices, (1.0f - f12) / choices.size(), z11, j12, j13, r0Var, onChoiceSelected)), g11, (i14 & 14) | 12779952, 88);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(aVar2, choices, num3, f12, z11, j12, j13, onChoiceSelected, i11, i12));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:197:0x03cc, code lost:
        r9 = androidx.compose.foundation.c.b(r1, ((d2.f0) r26.getValue()).t(), d2.h1.a());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011a  */
    /* JADX WARN: Type inference failed for: r9v40, types: [androidx.compose.ui.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.ui.e r27, int r28, com.withings.common.compose.component.q1 r29, boolean r30, boolean r31, long r32, long r34, ym0.a<nm0.y> r36, androidx.compose.runtime.a r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1157
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.s1.b(androidx.compose.ui.e, int, com.withings.common.compose.component.q1, boolean, boolean, long, long, ym0.a, androidx.compose.runtime.a, int, int):void");
    }
}
