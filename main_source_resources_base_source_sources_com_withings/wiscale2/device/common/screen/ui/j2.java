package com.withings.wiscale2.device.common.screen.ui;

import com.withings.wiscale2.device.common.screen.ui.h2;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
/* compiled from: WorkoutScreenOrderFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.screen.ui.WorkoutScreenOrderViewModel$createScreensLiveData$1$onDeviceScreensReceived$1", f = "WorkoutScreenOrderFragment.kt", l = {204}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class j2 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f53363a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f53364b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h2 f53365c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ i2 f53366d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f53367e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int[] f53368f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkoutScreenOrderFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.screen.ui.WorkoutScreenOrderViewModel$createScreensLiveData$1$onDeviceScreensReceived$1$screens$1", f = "WorkoutScreenOrderFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super List<? extends wp.u>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i2 f53369a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int[] f53370b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i2 i2Var, int[] iArr, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f53369a = i2Var;
            this.f53370b = iArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f53369a, this.f53370b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<? extends wp.u>> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
            if (r3 == null) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r0 = 6
                r1 = 1
                kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                nm0.l.b(r7)
                com.withings.wiscale2.device.common.screen.ui.i2 r7 = r6.f53369a
                com.withings.wiscale2.device.common.screen.ui.h2 r7 = r7.f53351a
                rc0.a r2 = com.withings.wiscale2.device.common.screen.ui.h2.j0(r7)
                com.withings.device.Device r3 = com.withings.wiscale2.device.common.screen.ui.h2.g0(r7)
                r3.getFirmware()
                com.withings.device.Device r3 = com.withings.wiscale2.device.common.screen.ui.h2.g0(r7)
                r3.getNetwork()
                com.withings.device.Device r3 = com.withings.wiscale2.device.common.screen.ui.h2.g0(r7)
                r3.getId()
                com.withings.user.User r3 = com.withings.wiscale2.device.common.screen.ui.h2.k0(r7)
                long r3 = r3.q()
                java.util.ArrayList r2 = r2.b(r3)
                int[] r3 = r6.f53370b
                if (r3 == 0) goto L41
                int r4 = r3.length
                if (r4 != 0) goto L39
                r4 = r1
                goto L3a
            L39:
                r4 = 0
            L3a:
                r1 = r1 ^ r4
                if (r1 == 0) goto L3e
                goto L3f
            L3e:
                r3 = 0
            L3f:
                if (r3 != 0) goto L4d
            L41:
                rc0.a r1 = com.withings.wiscale2.device.common.screen.ui.h2.j0(r7)
                r1.getClass()
                int[] r3 = new int[r0]
                r3 = {x0070: FILL_ARRAY_DATA  , data: [2, 7, 6, 1, 307, 36} // fill-array
            L4d:
                java.util.Iterator r0 = r2.iterator()
            L51:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L6a
                java.lang.Object r1 = r0.next()
                wp.u r1 = (wp.u) r1
                long r4 = r1.g()
                int r4 = (int) r4
                boolean r4 = kotlin.collections.l.l(r3, r4)
                r1.h(r4)
                goto L51
            L6a:
                java.util.ArrayList r7 = com.withings.wiscale2.device.common.screen.ui.h2.p0(r7, r2, r3)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.screen.ui.j2.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(h2 h2Var, i2 i2Var, int i11, int[] iArr, qm0.d<? super j2> dVar) {
        super(2, dVar);
        this.f53365c = h2Var;
        this.f53366d = i2Var;
        this.f53367e = i11;
        this.f53368f = iArr;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        j2 j2Var = new j2(this.f53365c, this.f53366d, this.f53367e, this.f53368f, dVar);
        j2Var.f53364b = obj;
        return j2Var;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((j2) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        h2 h2Var;
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f53363a;
        h2 h2Var2 = this.f53365c;
        i2 i2Var = this.f53366d;
        if (i11 != 0) {
            if (i11 == 1) {
                h2Var = (h2) this.f53364b;
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            async$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.f53364b, Dispatchers.getIO(), null, new a(i2Var, this.f53368f, null), 2, null);
            this.f53364b = h2Var2;
            this.f53363a = 1;
            obj = async$default.await(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            h2Var = h2Var2;
        }
        h2Var.f53336g = (List) obj;
        list = h2Var2.f53336g;
        List<wp.u> list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list2, 10));
        for (wp.u uVar : list2) {
            arrayList.add(uVar.e());
        }
        i2Var.setValue(new h2.a(this.f53367e, arrayList));
        return nm0.y.f85009a;
    }
}
