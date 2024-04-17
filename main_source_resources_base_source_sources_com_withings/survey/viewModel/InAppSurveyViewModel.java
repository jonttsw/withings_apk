package com.withings.survey.viewModel;

import android.net.Uri;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v0;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.library.authentication.api.ConstantsWs;
import dp0.j;
import f50.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import t50.a;
import ym0.p;
import ym0.q;
import ym0.r;
/* compiled from: InAppSurveyViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/survey/viewModel/InAppSurveyViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class InAppSurveyViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final d60.a f44466a;

    /* renamed from: b  reason: collision with root package name */
    private final d60.c f44467b;

    /* renamed from: c  reason: collision with root package name */
    private final d60.e f44468c;

    /* renamed from: d  reason: collision with root package name */
    private final d60.d f44469d;

    /* renamed from: e  reason: collision with root package name */
    private final xw.b f44470e;

    /* renamed from: f  reason: collision with root package name */
    private final d60.b f44471f;

    /* renamed from: g  reason: collision with root package name */
    private final long f44472g;

    /* renamed from: h  reason: collision with root package name */
    private final Long f44473h;

    /* renamed from: i  reason: collision with root package name */
    private final Long f44474i;

    /* renamed from: j  reason: collision with root package name */
    private final String f44475j;

    /* renamed from: k  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f44476k;

    /* renamed from: l  reason: collision with root package name */
    private final MutableStateFlow f44477l;

    /* renamed from: m  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f44478m;

    /* renamed from: n  reason: collision with root package name */
    private MutableStateFlow<List<z50.a>> f44479n;

    /* renamed from: o  reason: collision with root package name */
    private final MutableStateFlow f44480o;

    /* renamed from: p  reason: collision with root package name */
    private MutableStateFlow<ArrayList<s50.a>> f44481p;

    /* renamed from: q  reason: collision with root package name */
    private final MutableStateFlow<List<Integer>> f44482q;

    /* renamed from: r  reason: collision with root package name */
    private final StateFlow<List<Integer>> f44483r;

    /* renamed from: s  reason: collision with root package name */
    private final MutableStateFlow<Integer> f44484s;

    /* renamed from: t  reason: collision with root package name */
    private final StateFlow<Integer> f44485t;

    /* renamed from: u  reason: collision with root package name */
    private final MutableStateFlow<Locale> f44486u;

    /* renamed from: v  reason: collision with root package name */
    private final MutableStateFlow<Integer> f44487v;

    /* renamed from: w  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f44488w;

    /* renamed from: x  reason: collision with root package name */
    private final Flow<Boolean> f44489x;

    /* renamed from: y  reason: collision with root package name */
    private final Flow<List<z50.a>> f44490y;

    /* compiled from: InAppSurveyViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.survey.viewModel.InAppSurveyViewModel$1", f = "InAppSurveyViewModel.kt", l = {126}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        InAppSurveyViewModel f44491a;

        /* renamed from: b  reason: collision with root package name */
        int f44492b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f44493c;

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f44493c = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0074 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:6:0x0010, B:24:0x006d, B:27:0x0074, B:29:0x0088, B:30:0x0090, B:32:0x00ab, B:34:0x00bb, B:35:0x00c7, B:13:0x0028, B:15:0x002e, B:16:0x003e, B:18:0x0044, B:20:0x004a), top: B:43:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00bb A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:6:0x0010, B:24:0x006d, B:27:0x0074, B:29:0x0088, B:30:0x0090, B:32:0x00ab, B:34:0x00bb, B:35:0x00c7, B:13:0x0028, B:15:0x002e, B:16:0x003e, B:18:0x0044, B:20:0x004a), top: B:43:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r11.f44492b
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 != r3) goto L17
                com.withings.survey.viewModel.InAppSurveyViewModel r0 = r11.f44491a
                java.lang.Object r1 = r11.f44493c
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                nm0.l.b(r12)     // Catch: java.lang.Throwable -> L14
                goto L6d
            L14:
                r12 = move-exception
                goto Lca
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                nm0.l.b(r12)
                java.lang.Object r12 = r11.f44493c
                kotlinx.coroutines.CoroutineScope r12 = (kotlinx.coroutines.CoroutineScope) r12
                com.withings.survey.viewModel.InAppSurveyViewModel r1 = com.withings.survey.viewModel.InAppSurveyViewModel.this
                java.lang.String r4 = com.withings.survey.viewModel.InAppSurveyViewModel.i0(r1)     // Catch: java.lang.Throwable -> L14
                if (r4 == 0) goto L3e
                d60.c r12 = com.withings.survey.viewModel.InAppSurveyViewModel.k0(r1)     // Catch: java.lang.Throwable -> L14
                java.lang.String r0 = com.withings.survey.viewModel.InAppSurveyViewModel.i0(r1)     // Catch: java.lang.Throwable -> L14
                r12.getClass()     // Catch: java.lang.Throwable -> L14
                v50.a r12 = d60.c.a(r0)     // Catch: java.lang.Throwable -> L14
                goto L72
            L3e:
                java.lang.Long r4 = com.withings.survey.viewModel.InAppSurveyViewModel.q0(r1)     // Catch: java.lang.Throwable -> L14
                if (r4 == 0) goto L71
                java.lang.Long r4 = com.withings.survey.viewModel.InAppSurveyViewModel.r0(r1)     // Catch: java.lang.Throwable -> L14
                if (r4 == 0) goto L71
                d60.a r5 = com.withings.survey.viewModel.InAppSurveyViewModel.g0(r1)     // Catch: java.lang.Throwable -> L14
                java.lang.Long r4 = com.withings.survey.viewModel.InAppSurveyViewModel.r0(r1)     // Catch: java.lang.Throwable -> L14
                long r6 = r4.longValue()     // Catch: java.lang.Throwable -> L14
                java.lang.Long r4 = com.withings.survey.viewModel.InAppSurveyViewModel.q0(r1)     // Catch: java.lang.Throwable -> L14
                long r8 = r4.longValue()     // Catch: java.lang.Throwable -> L14
                r11.f44493c = r12     // Catch: java.lang.Throwable -> L14
                r11.f44491a = r1     // Catch: java.lang.Throwable -> L14
                r11.f44492b = r3     // Catch: java.lang.Throwable -> L14
                r10 = r11
                java.lang.Object r12 = r5.a(r6, r8, r10)     // Catch: java.lang.Throwable -> L14
                if (r12 != r0) goto L6c
                return r0
            L6c:
                r0 = r1
            L6d:
                v50.a r12 = (v50.a) r12     // Catch: java.lang.Throwable -> L14
                r1 = r0
                goto L72
            L71:
                r12 = r2
            L72:
                if (r12 == 0) goto Lb9
                w50.a r12 = r12.a()     // Catch: java.lang.Throwable -> L14
                y50.a r12 = ah.o.f(r12)     // Catch: java.lang.Throwable -> L14
                java.util.List r0 = r12.a()     // Catch: java.lang.Throwable -> L14
                java.lang.Object r0 = kotlin.collections.x.K(r0)     // Catch: java.lang.Throwable -> L14
                t50.a r0 = (t50.a) r0     // Catch: java.lang.Throwable -> L14
                if (r0 == 0) goto Lab
                int r0 = r0.d()     // Catch: java.lang.Throwable -> L14
                kotlinx.coroutines.flow.MutableStateFlow r2 = com.withings.survey.viewModel.InAppSurveyViewModel.z0(r1)     // Catch: java.lang.Throwable -> L14
            L90:
                java.lang.Object r3 = r2.getValue()     // Catch: java.lang.Throwable -> L14
                r4 = r3
                java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L14
                java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L14
                java.util.ArrayList r4 = kotlin.collections.x.S0(r4)     // Catch: java.lang.Throwable -> L14
                java.lang.Integer r5 = new java.lang.Integer     // Catch: java.lang.Throwable -> L14
                r5.<init>(r0)     // Catch: java.lang.Throwable -> L14
                r4.add(r5)     // Catch: java.lang.Throwable -> L14
                boolean r3 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L14
                if (r3 == 0) goto L90
            Lab:
                androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r1.W0()     // Catch: java.lang.Throwable -> L14
                f50.a$b r2 = new f50.a$b     // Catch: java.lang.Throwable -> L14
                r2.<init>(r12)     // Catch: java.lang.Throwable -> L14
                r0.setValue(r2)     // Catch: java.lang.Throwable -> L14
                nm0.y r2 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L14
            Lb9:
                if (r2 != 0) goto Lc7
                androidx.compose.runtime.ParcelableSnapshotMutableState r12 = r1.W0()     // Catch: java.lang.Throwable -> L14
                f50.a$a r0 = new f50.a$a     // Catch: java.lang.Throwable -> L14
                r0.<init>()     // Catch: java.lang.Throwable -> L14
                r12.setValue(r0)     // Catch: java.lang.Throwable -> L14
            Lc7:
                nm0.y r12 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L14
                goto Lce
            Lca:
                nm0.k$a r12 = nm0.l.a(r12)
            Lce:
                java.lang.Throwable r12 = nm0.k.b(r12)
                if (r12 == 0) goto Le1
                java.lang.String r12 = r12.getMessage()
                java.lang.String r12 = java.lang.String.valueOf(r12)
                java.lang.String r0 = "Survey"
                android.util.Log.d(r0, r12)
            Le1:
                nm0.y r12 = nm0.y.f85009a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.survey.viewModel.InAppSurveyViewModel.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: InAppSurveyViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.survey.viewModel.InAppSurveyViewModel$2", f = "InAppSurveyViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_PH}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f44495a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: InAppSurveyViewModel.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ InAppSurveyViewModel f44497a;

            a(InAppSurveyViewModel inAppSurveyViewModel) {
                this.f44497a = inAppSurveyViewModel;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, qm0.d dVar) {
                Object value;
                List list = (List) obj;
                MutableStateFlow mutableStateFlow = this.f44497a.f44484s;
                do {
                    value = mutableStateFlow.getValue();
                    Integer num = (Integer) value;
                } while (!mutableStateFlow.compareAndSet(value, (Integer) x.U(list)));
                return y.f85009a;
            }
        }

        b(qm0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new b(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            return CoroutineSingletons.f76214a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f44495a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l.b(obj);
            } else {
                l.b(obj);
                InAppSurveyViewModel inAppSurveyViewModel = InAppSurveyViewModel.this;
                StateFlow<List<Integer>> V0 = inAppSurveyViewModel.V0();
                a aVar = new a(inAppSurveyViewModel);
                this.f44495a = 1;
                if (V0.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: InAppSurveyViewModel.kt */
    /* loaded from: classes4.dex */
    static final class c extends w implements p<String, String, Uri.Builder> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Uri.Builder f44498a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Uri.Builder builder) {
            super(2);
            this.f44498a = builder;
        }

        @Override // ym0.p
        public final Uri.Builder invoke(String str, String str2) {
            String property = str;
            String value = str2;
            u.j(property, "property");
            u.j(value, "value");
            return this.f44498a.appendQueryParameter(property, value);
        }
    }

    /* compiled from: InAppSurveyViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.survey.viewModel.InAppSurveyViewModel$isNextButtonEnabled$1", f = "InAppSurveyViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class d extends i implements r<List<? extends z50.a>, Integer, Boolean, qm0.d<? super Boolean>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ List f44499a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Integer f44500b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ boolean f44501c;

        d(qm0.d<? super d> dVar) {
            super(4, dVar);
        }

        @Override // ym0.r
        public final Object invoke(List<? extends z50.a> list, Integer num, Boolean bool, qm0.d<? super Boolean> dVar) {
            boolean booleanValue = bool.booleanValue();
            d dVar2 = new d(dVar);
            dVar2.f44499a = list;
            dVar2.f44500b = num;
            dVar2.f44501c = booleanValue;
            return dVar2.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a.b bVar;
            y50.a a11;
            List<t50.a> a12;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            List list = this.f44499a;
            Integer num = this.f44500b;
            boolean z5 = this.f44501c;
            T value = InAppSurveyViewModel.this.W0().getValue();
            Object obj2 = null;
            if (value instanceof a.b) {
                bVar = (a.b) value;
            } else {
                bVar = null;
            }
            if (bVar != null && (a11 = bVar.a()) != null && (a12 = a11.a()) != null) {
                Iterator<T> it = a12.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    int d11 = ((t50.a) next).d();
                    if (num != null && d11 == num.intValue()) {
                        obj2 = next;
                        break;
                    }
                }
                obj2 = (t50.a) obj2;
            }
            boolean z11 = false;
            if (!(obj2 instanceof a.f) ? !(!(obj2 instanceof a.i) && !(obj2 instanceof a.AbstractC1639a) && list.isEmpty()) : !(!(!list.isEmpty()) || !z5)) {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* compiled from: InAppSurveyViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.survey.viewModel.InAppSurveyViewModel$nextQuestion$1", f = "InAppSurveyViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_WAIST}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class e extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        ArrayList f44503a;

        /* renamed from: b  reason: collision with root package name */
        InAppSurveyViewModel f44504b;

        /* renamed from: c  reason: collision with root package name */
        t50.a f44505c;

        /* renamed from: d  reason: collision with root package name */
        p0 f44506d;

        /* renamed from: e  reason: collision with root package name */
        Iterator f44507e;

        /* renamed from: f  reason: collision with root package name */
        int f44508f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ t50.a f44509g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ InAppSurveyViewModel f44510h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p0<Integer> f44511i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: InAppSurveyViewModel.kt */
        /* loaded from: classes4.dex */
        public static final class a extends w implements p<String, Boolean, Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ArrayList<h50.a> f44512a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h50.a f44513b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ArrayList<h50.a> arrayList, h50.a aVar) {
                super(2);
                this.f44512a = arrayList;
                this.f44513b = aVar;
            }

            @Override // ym0.p
            public final Boolean invoke(String str, Boolean bool) {
                String url = str;
                Boolean bool2 = bool;
                bool2.booleanValue();
                u.j(url, "url");
                h50.a aVar = this.f44513b;
                return Boolean.valueOf(this.f44512a.add(new h50.a(aVar.a(), null, null, null, url, null, bool2, null, aVar.b(), null, null)));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: InAppSurveyViewModel.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.survey.viewModel.InAppSurveyViewModel$nextQuestion$1$2$1", f = "InAppSurveyViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class b extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ InAppSurveyViewModel f44514a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f44515b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InAppSurveyViewModel inAppSurveyViewModel, int i11, qm0.d<? super b> dVar) {
                super(2, dVar);
                this.f44514a = inAppSurveyViewModel;
                this.f44515b = i11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
                return new b(this.f44514a, this.f44515b, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
                return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object value;
                ArrayList S0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                l.b(obj);
                MutableStateFlow mutableStateFlow = this.f44514a.f44482q;
                do {
                    value = mutableStateFlow.getValue();
                    S0 = x.S0((List) value);
                    S0.add(new Integer(this.f44515b));
                } while (!mutableStateFlow.compareAndSet(value, S0));
                return y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(t50.a aVar, InAppSurveyViewModel inAppSurveyViewModel, p0<Integer> p0Var, qm0.d<? super e> dVar) {
            super(2, dVar);
            this.f44509g = aVar;
            this.f44510h = inAppSurveyViewModel;
            this.f44511i = p0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new e(this.f44509g, this.f44510h, this.f44511i, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
            if (r10.b() == null) goto L15;
         */
        /* JADX WARN: Removed duplicated region for block: B:124:0x02dd  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x02ed  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x02f7  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0196  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01b9  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01d1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x01d2  */
        /* JADX WARN: Type inference failed for: r10v10, types: [T, java.lang.Integer] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x02d6 -> B:123:0x02d8). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x01d2 -> B:84:0x01d4). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r44) {
            /*
                Method dump skipped, instructions count: 834
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.survey.viewModel.InAppSurveyViewModel.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: InAppSurveyViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.survey.viewModel.InAppSurveyViewModel$preselectedResponse$1", f = "InAppSurveyViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class f extends i implements q<ArrayList<s50.a>, Integer, qm0.d<? super Integer>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Integer f44516a;

        /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.survey.viewModel.InAppSurveyViewModel$f, kotlin.coroutines.jvm.internal.i] */
        @Override // ym0.q
        public final Object invoke(ArrayList<s50.a> arrayList, Integer num, qm0.d<? super Integer> dVar) {
            ?? iVar = new i(3, dVar);
            iVar.f44516a = num;
            return iVar.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            return this.f44516a;
        }
    }

    /* compiled from: InAppSurveyViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.survey.viewModel.InAppSurveyViewModel$previousQuestion$1", f = "InAppSurveyViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class g extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {
        g(qm0.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new g(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((g) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            ArrayList S0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            InAppSurveyViewModel inAppSurveyViewModel = InAppSurveyViewModel.this;
            if (u.e(inAppSurveyViewModel.f44484s.getValue(), x.K(inAppSurveyViewModel.V0().getValue()))) {
                inAppSurveyViewModel.f44476k.setValue(Boolean.TRUE);
            } else {
                InAppSurveyViewModel.G0(inAppSurveyViewModel);
                MutableStateFlow mutableStateFlow = inAppSurveyViewModel.f44482q;
                do {
                    value = mutableStateFlow.getValue();
                    S0 = x.S0((List) value);
                    x.s0(S0);
                } while (!mutableStateFlow.compareAndSet(value, S0));
                inAppSurveyViewModel.M0().setValue(new Integer(-300));
            }
            return y.f85009a;
        }
    }

    /* compiled from: Emitters.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.survey.viewModel.InAppSurveyViewModel$special$$inlined$transform$1", f = "InAppSurveyViewModel.kt", l = {40}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h extends i implements p<FlowCollector<? super List<? extends z50.a>>, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f44518a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f44519b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Flow f44520c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ InAppSurveyViewModel f44521d;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector<List<? extends z50.a>> f44522a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ InAppSurveyViewModel f44523b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.survey.viewModel.InAppSurveyViewModel$special$$inlined$transform$1$1", f = "InAppSurveyViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONGSHAREID, ConstantsWs.WS_STATUS_ACCOUNTCREATERROR}, m = "emit")
            /* renamed from: com.withings.survey.viewModel.InAppSurveyViewModel$h$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0614a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f44524a;

                /* renamed from: b  reason: collision with root package name */
                int f44525b;

                /* renamed from: d  reason: collision with root package name */
                Object f44527d;

                /* renamed from: e  reason: collision with root package name */
                FlowCollector f44528e;

                /* renamed from: f  reason: collision with root package name */
                Object f44529f;

                public C0614a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f44524a = obj;
                    this.f44525b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, InAppSurveyViewModel inAppSurveyViewModel) {
                this.f44523b = inAppSurveyViewModel;
                this.f44522a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00ce  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r10, qm0.d<? super nm0.y> r11) {
                /*
                    Method dump skipped, instructions count: 235
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.survey.viewModel.InAppSurveyViewModel.h.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Flow flow, qm0.d dVar, InAppSurveyViewModel inAppSurveyViewModel) {
            super(2, dVar);
            this.f44520c = flow;
            this.f44521d = inAppSurveyViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            h hVar = new h(this.f44520c, dVar, this.f44521d);
            hVar.f44519b = obj;
            return hVar;
        }

        @Override // ym0.p
        public final Object invoke(FlowCollector<? super List<? extends z50.a>> flowCollector, qm0.d<? super y> dVar) {
            return ((h) create(flowCollector, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f44518a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                a aVar = new a((FlowCollector) this.f44519b, this.f44521d);
                this.f44518a = 1;
                if (this.f44520c.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
    @Inject
    public InAppSurveyViewModel(d60.a aVar, d60.c cVar, d60.e eVar, d60.d dVar, u0 savedStateHandle, xw.b dispatcher, d60.b bVar) {
        Long l5;
        ParcelableSnapshotMutableState f11;
        u.j(savedStateHandle, "savedStateHandle");
        u.j(dispatcher, "dispatcher");
        this.f44466a = aVar;
        this.f44467b = cVar;
        this.f44468c = eVar;
        this.f44469d = dVar;
        this.f44470e = dispatcher;
        this.f44471f = bVar;
        this.f44472g = DateTime.now().getMillis() / 1000;
        this.f44473h = (Long) savedStateHandle.c(HealthUserProfile.USER_PROFILE_KEY_USER_ID);
        String str = (String) savedStateHandle.c("survey_id");
        if (str != null) {
            l5 = j.h0(str);
        } else {
            l5 = null;
        }
        this.f44474i = l5;
        this.f44475j = (String) savedStateHandle.c("survey_content");
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.f44476k = MutableStateFlow;
        this.f44477l = MutableStateFlow;
        f11 = l0.f(a.c.f66191a, v0.f8878a);
        this.f44478m = f11;
        i0 i0Var = i0.f76187a;
        MutableStateFlow<List<z50.a>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(i0Var);
        this.f44479n = MutableStateFlow2;
        this.f44480o = MutableStateFlow2;
        MutableStateFlow<ArrayList<s50.a>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(new ArrayList());
        this.f44481p = MutableStateFlow3;
        MutableStateFlow<List<Integer>> MutableStateFlow4 = StateFlowKt.MutableStateFlow(i0Var);
        this.f44482q = MutableStateFlow4;
        this.f44483r = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Integer> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this.f44484s = MutableStateFlow5;
        this.f44485t = FlowKt.asStateFlow(MutableStateFlow5);
        Locale locale = Locale.getDefault();
        u.i(locale, "getDefault(...)");
        this.f44486u = StateFlowKt.MutableStateFlow(locale);
        this.f44487v = StateFlowKt.MutableStateFlow(300);
        MutableStateFlow<Boolean> MutableStateFlow6 = StateFlowKt.MutableStateFlow(bool);
        this.f44488w = MutableStateFlow6;
        this.f44489x = FlowKt.flowOn(FlowKt.combine(MutableStateFlow2, MutableStateFlow5, MutableStateFlow6, new d(null)), dispatcher.a());
        this.f44490y = FlowKt.flowOn(FlowKt.flow(new h(FlowKt.combine(MutableStateFlow3, MutableStateFlow5, new i(3, null)), null, this)), dispatcher.a());
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), dispatcher.a(), null, new a(null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new b(null), 2, null);
    }

    public static final void G0(InAppSurveyViewModel inAppSurveyViewModel) {
        final com.withings.survey.viewModel.b bVar = new com.withings.survey.viewModel.b(inAppSurveyViewModel);
        inAppSurveyViewModel.f44481p.getValue().removeIf(new Predicate() { // from class: e60.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                ym0.l tmp0 = ym0.l.this;
                u.j(tmp0, "$tmp0");
                return ((Boolean) tmp0.invoke(obj)).booleanValue();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void g1(List<h50.a> list) {
        MutableStateFlow<ArrayList<s50.a>> mutableStateFlow = this.f44481p;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) mutableStateFlow.getValue()).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            MutableStateFlow<Integer> mutableStateFlow2 = this.f44484s;
            if (hasNext) {
                Object next = it.next();
                if (!u.e(((s50.a) next).b(), String.valueOf(mutableStateFlow2.getValue()))) {
                    arrayList.add(next);
                }
            } else {
                arrayList.add(new s50.a(String.valueOf(mutableStateFlow2.getValue()), (List) this.f44480o.getValue(), list));
                mutableStateFlow.setValue(arrayList);
                return;
            }
        }
    }

    public final String K0(h50.a aVar) {
        String j5 = aVar.j();
        if (j5 == null) {
            return null;
        }
        Uri.Builder buildUpon = Uri.parse(j5).buildUpon();
        if (u.e(aVar.g(), Boolean.TRUE)) {
            for (s50.a aVar2 : this.f44481p.getValue()) {
                for (h50.a aVar3 : aVar2.a()) {
                    cr.a.a(new nm0.j(aVar3.f(), aVar3.k()), new c(buildUpon));
                }
            }
        }
        if (u.e(aVar.c(), Boolean.TRUE)) {
            String d11 = aVar.d();
            buildUpon.appendQueryParameter("id_submit", this.f44472g + d11 + this.f44473h);
        }
        if (aVar.d() != null) {
            buildUpon.appendQueryParameter("id_survey", aVar.d());
        }
        return buildUpon.build().toString();
    }

    public final MutableStateFlow<Integer> M0() {
        return this.f44487v;
    }

    public final StateFlow<Integer> O0() {
        return this.f44485t;
    }

    public final MutableStateFlow R0() {
        return this.f44477l;
    }

    public final MutableStateFlow<Locale> T0() {
        return this.f44486u;
    }

    public final Flow<List<z50.a>> U0() {
        return this.f44490y;
    }

    public final StateFlow<List<Integer>> V0() {
        return this.f44483r;
    }

    public final ParcelableSnapshotMutableState W0() {
        return this.f44478m;
    }

    public final MutableStateFlow X0() {
        return this.f44480o;
    }

    public final boolean Y0() {
        return this.f44471f.a();
    }

    public final Flow<Boolean> Z0() {
        return this.f44489x;
    }

    public final MutableStateFlow<Boolean> a1() {
        return this.f44488w;
    }

    public final void c1() {
        a.b bVar;
        y50.a aVar;
        t50.a aVar2;
        List<t50.a> a11;
        Object obj;
        T value = this.f44478m.getValue();
        if (value instanceof a.b) {
            bVar = (a.b) value;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            aVar = bVar.a();
        } else {
            aVar = null;
        }
        if (aVar != null && (a11 = aVar.a()) != null) {
            Iterator<T> it = a11.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    int d11 = ((t50.a) obj).d();
                    Integer num = (Integer) x.U(this.f44482q.getValue());
                    if (num != null && d11 == num.intValue()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            aVar2 = (t50.a) obj;
        } else {
            aVar2 = null;
        }
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), this.f44470e.a(), null, new e(aVar2, this, new p0(), null), 2, null);
    }

    public final void d1() {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), this.f44470e.a(), null, new g(null), 2, null);
    }

    public final void e1(List<z50.a> responses) {
        u.j(responses, "responses");
        this.f44479n.setValue(responses);
        g1(i0.f76187a);
    }
}
