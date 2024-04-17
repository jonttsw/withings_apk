package com.withings.sharing.datasharing.sendinvitation;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.sharing.datasharing.sendinvitation.a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: SelectDataViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/sharing/datasharing/sendinvitation/SelectDataViewModel;", "Landroidx/lifecycle/g1;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SelectDataViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final MutableSharedFlow<List<y40.a>> f44091a;

    /* renamed from: b  reason: collision with root package name */
    private final StateFlow<z40.e> f44092b;

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Flow<z40.e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f44093a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SelectDataViewModel f44094b;

        /* compiled from: Emitters.kt */
        /* renamed from: com.withings.sharing.datasharing.sendinvitation.SelectDataViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0608a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f44095a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ SelectDataViewModel f44096b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.sharing.datasharing.sendinvitation.SelectDataViewModel$special$$inlined$map$1$2", f = "SelectDataViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.sharing.datasharing.sendinvitation.SelectDataViewModel$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0609a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f44097a;

                /* renamed from: b  reason: collision with root package name */
                int f44098b;

                public C0609a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f44097a = obj;
                    this.f44098b |= Integer.MIN_VALUE;
                    return C0608a.this.emit(null, this);
                }
            }

            public C0608a(FlowCollector flowCollector, SelectDataViewModel selectDataViewModel) {
                this.f44095a = flowCollector;
                this.f44096b = selectDataViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r10, qm0.d r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof com.withings.sharing.datasharing.sendinvitation.SelectDataViewModel.a.C0608a.C0609a
                    if (r0 == 0) goto L13
                    r0 = r11
                    com.withings.sharing.datasharing.sendinvitation.SelectDataViewModel$a$a$a r0 = (com.withings.sharing.datasharing.sendinvitation.SelectDataViewModel.a.C0608a.C0609a) r0
                    int r1 = r0.f44098b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f44098b = r1
                    goto L18
                L13:
                    com.withings.sharing.datasharing.sendinvitation.SelectDataViewModel$a$a$a r0 = new com.withings.sharing.datasharing.sendinvitation.SelectDataViewModel$a$a$a
                    r0.<init>(r11)
                L18:
                    java.lang.Object r11 = r0.f44097a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f44098b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r11)
                    goto L8e
                L27:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L2f:
                    nm0.l.b(r11)
                    java.util.List r10 = (java.util.List) r10
                    dx.a r11 = dx.a.f64529a
                    java.lang.String r2 = "BIOMARKERS UPDATED"
                    r4 = 0
                    java.lang.Object[] r5 = new java.lang.Object[r4]
                    com.withings.sharing.datasharing.sendinvitation.SelectDataViewModel r6 = r9.f44096b
                    r11.a(r6, r2, r5)
                    r11 = r10
                    java.lang.Iterable r11 = (java.lang.Iterable) r11
                    java.util.Iterator r11 = r11.iterator()
                L47:
                    boolean r2 = r11.hasNext()
                    if (r2 == 0) goto L7e
                    java.lang.Object r2 = r11.next()
                    y40.a r2 = (y40.a) r2
                    dx.a r5 = dx.a.f64529a
                    com.withings.measurement.model.Biomarker r7 = r2.b()
                    boolean r2 = r2.c()
                    if (r2 != 0) goto L62
                    java.lang.String r2 = "--"
                    goto L64
                L62:
                    java.lang.String r2 = "selected"
                L64:
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    r8.append(r7)
                    java.lang.String r7 = " -> "
                    r8.append(r7)
                    r8.append(r2)
                    java.lang.String r2 = r8.toString()
                    java.lang.Object[] r7 = new java.lang.Object[r4]
                    r5.a(r6, r2, r7)
                    goto L47
                L7e:
                    z40.e r11 = new z40.e
                    r11.<init>(r10)
                    r0.f44098b = r3
                    kotlinx.coroutines.flow.FlowCollector r10 = r9.f44095a
                    java.lang.Object r10 = r10.emit(r11, r0)
                    if (r10 != r1) goto L8e
                    return r1
                L8e:
                    nm0.y r10 = nm0.y.f85009a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.sharing.datasharing.sendinvitation.SelectDataViewModel.a.C0608a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public a(MutableSharedFlow mutableSharedFlow, SelectDataViewModel selectDataViewModel) {
            this.f44093a = mutableSharedFlow;
            this.f44094b = selectDataViewModel;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super z40.e> flowCollector, qm0.d dVar) {
            Object collect = this.f44093a.collect(new C0608a(flowCollector, this.f44094b), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    @Inject
    public SelectDataViewModel() {
        MutableSharedFlow<List<y40.a>> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.f44091a = MutableSharedFlow$default;
        this.f44092b = FlowKt.stateIn(new a(MutableSharedFlow$default, this), h1.a(this), SharingStarted.Companion.getLazily(), new z40.e(kotlin.collections.i0.f76187a));
    }

    public final StateFlow<z40.e> g0() {
        return this.f44092b;
    }

    public final void i0(com.withings.sharing.datasharing.sendinvitation.a aVar) {
        dx.a aVar2 = dx.a.f64529a;
        aVar2.a(this, "SelectDataAction called: " + aVar, new Object[0]);
        if (aVar instanceof a.c) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new e(this, ((a.c) aVar).a(), null), 3, null);
        } else if (aVar instanceof a.C0610a) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new c(this, ((a.C0610a) aVar).a(), null), 3, null);
        } else if (aVar instanceof a.b) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new d(this, ((a.b) aVar).a(), null), 3, null);
        }
    }
}
