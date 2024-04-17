package com.withings.healthplus.library.ui.viewmodel;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.contentproviders.eightfit.model.webservice.TaskTypeExtensionKt;
import com.withings.healthplus.library.ui.model.ExploreType;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import mv.c;
import mv.d;
import mv.e;
import nm0.y;
import nv.a;
import nv.b;
import ym0.p;
/* compiled from: LibraryCategoryScreenViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/healthplus/library/ui/viewmodel/LibraryCategoryScreenViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LibraryCategoryScreenViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final mv.a f40424a;

    /* renamed from: b  reason: collision with root package name */
    private final mv.b f40425b;

    /* renamed from: c  reason: collision with root package name */
    private final c f40426c;

    /* renamed from: d  reason: collision with root package name */
    private final e f40427d;

    /* renamed from: e  reason: collision with root package name */
    private final d f40428e;

    /* renamed from: f  reason: collision with root package name */
    private final long f40429f;

    /* renamed from: g  reason: collision with root package name */
    private final ExploreType f40430g;

    /* renamed from: h  reason: collision with root package name */
    private final MutableStateFlow<Integer> f40431h;

    /* renamed from: i  reason: collision with root package name */
    private final StateFlow<Integer> f40432i;

    /* renamed from: j  reason: collision with root package name */
    private final MutableStateFlow<nv.b> f40433j;

    /* renamed from: k  reason: collision with root package name */
    private final MutableStateFlow<nv.d> f40434k;

    /* renamed from: l  reason: collision with root package name */
    private final StateFlow<nv.d> f40435l;

    /* renamed from: m  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f40436m;

    /* renamed from: n  reason: collision with root package name */
    private final MutableStateFlow<Integer> f40437n;

    /* renamed from: o  reason: collision with root package name */
    private Job f40438o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LibraryCategoryScreenViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.healthplus.library.ui.viewmodel.LibraryCategoryScreenViewModel$fetchLibraryFiltersAndPreviewContent$1", f = "LibraryCategoryScreenViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_VHD_RESULT, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MIN}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f40439a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ nv.a f40441c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(nv.a aVar, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f40441c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f40441c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00b2 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r8.f40439a
                nv.a r2 = r8.f40441c
                r3 = 2
                r4 = 1
                com.withings.healthplus.library.ui.viewmodel.LibraryCategoryScreenViewModel r5 = com.withings.healthplus.library.ui.viewmodel.LibraryCategoryScreenViewModel.this
                if (r1 == 0) goto L21
                if (r1 == r4) goto L1d
                if (r1 != r3) goto L15
                nm0.l.b(r9)
                goto Lb3
            L15:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1d:
                nm0.l.b(r9)
                goto L5d
            L21:
                nm0.l.b(r9)
                kotlinx.coroutines.flow.MutableStateFlow r9 = com.withings.healthplus.library.ui.viewmodel.LibraryCategoryScreenViewModel.A0(r5)
            L28:
                java.lang.Object r1 = r9.getValue()
                r6 = r1
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                r6.getClass()
                java.lang.Boolean r6 = java.lang.Boolean.FALSE
                boolean r1 = r9.compareAndSet(r1, r6)
                if (r1 == 0) goto L28
                boolean r9 = r2 instanceof nv.a.b
                if (r9 == 0) goto L71
                kotlinx.coroutines.flow.MutableStateFlow r9 = com.withings.healthplus.library.ui.viewmodel.LibraryCategoryScreenViewModel.y0(r5)
            L42:
                java.lang.Object r1 = r9.getValue()
                r6 = r1
                java.lang.Integer r6 = (java.lang.Integer) r6
                r6 = 0
                boolean r1 = r9.compareAndSet(r1, r6)
                if (r1 == 0) goto L42
                mv.a r9 = com.withings.healthplus.library.ui.viewmodel.LibraryCategoryScreenViewModel.i0(r5)
                r8.f40439a = r4
                java.lang.Object r9 = r9.a(r8)
                if (r9 != r0) goto L5d
                return r0
            L5d:
                kotlinx.coroutines.flow.MutableStateFlow r1 = com.withings.healthplus.library.ui.viewmodel.LibraryCategoryScreenViewModel.z0(r5)
            L61:
                java.lang.Object r9 = r1.getValue()
                r4 = r9
                nv.b r4 = (nv.b) r4
                nv.b$e r4 = nv.b.e.f85609a
                boolean r9 = r1.compareAndSet(r9, r4)
                if (r9 == 0) goto L61
                goto La0
            L71:
                boolean r9 = r2 instanceof nv.a.c
                if (r9 == 0) goto L89
                kotlinx.coroutines.flow.MutableStateFlow r9 = com.withings.healthplus.library.ui.viewmodel.LibraryCategoryScreenViewModel.z0(r5)
            L79:
                java.lang.Object r1 = r9.getValue()
                r4 = r1
                nv.b r4 = (nv.b) r4
                nv.b$c r4 = nv.b.c.f85607a
                boolean r1 = r9.compareAndSet(r1, r4)
                if (r1 == 0) goto L79
                goto La0
            L89:
                boolean r9 = r2 instanceof nv.a.C1399a
                if (r9 == 0) goto La0
                kotlinx.coroutines.flow.MutableStateFlow r9 = com.withings.healthplus.library.ui.viewmodel.LibraryCategoryScreenViewModel.z0(r5)
            L91:
                java.lang.Object r1 = r9.getValue()
                r4 = r1
                nv.b r4 = (nv.b) r4
                nv.b$b r4 = nv.b.C1400b.f85606a
                boolean r1 = r9.compareAndSet(r1, r4)
                if (r1 == 0) goto L91
            La0:
                mv.b r9 = com.withings.healthplus.library.ui.viewmodel.LibraryCategoryScreenViewModel.j0(r5)
                boolean r1 = r2 instanceof nv.a.b
                long r6 = com.withings.healthplus.library.ui.viewmodel.LibraryCategoryScreenViewModel.t0(r5)
                r8.f40439a = r3
                java.lang.Object r9 = r9.a(r6, r1, r8)
                if (r9 != r0) goto Lb3
                return r0
            Lb3:
                kotlinx.coroutines.flow.StateFlow r9 = com.withings.healthplus.library.ui.viewmodel.LibraryCategoryScreenViewModel.r0(r5)
                java.lang.Object r9 = r9.getValue()
                java.lang.Number r9 = (java.lang.Number) r9
                int r9 = r9.intValue()
                kotlinx.coroutines.flow.StateFlow r0 = com.withings.healthplus.library.ui.viewmodel.LibraryCategoryScreenViewModel.g0(r5)
                java.lang.Object r0 = r0.getValue()
                java.lang.Integer r0 = (java.lang.Integer) r0
                com.withings.healthplus.library.ui.model.ExploreType r1 = r5.K0()
                com.withings.contentproviders.model.content.TaskType r1 = r1.e()
                java.lang.String r1 = com.withings.contentproviders.eightfit.model.webservice.TaskTypeExtensionKt.wsValue(r1)
                com.withings.healthplus.library.ui.viewmodel.LibraryCategoryScreenViewModel.f0(r5, r9, r0, r1)
                nm0.y r9 = nm0.y.f85009a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.healthplus.library.ui.viewmodel.LibraryCategoryScreenViewModel.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public LibraryCategoryScreenViewModel(u0 savedStateHandle, mv.a aVar, mv.b bVar, c cVar, e eVar, d dVar) {
        int i11;
        ExploreType valueOf;
        u.j(savedStateHandle, "savedStateHandle");
        this.f40424a = aVar;
        this.f40425b = bVar;
        this.f40426c = cVar;
        this.f40427d = eVar;
        this.f40428e = dVar;
        Long l5 = (Long) savedStateHandle.c(HealthUserProfile.USER_PROFILE_KEY_USER_ID);
        if (l5 != null) {
            this.f40429f = l5.longValue();
            Integer num = (Integer) savedStateHandle.c("categoryFilter");
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = -1;
            }
            String str = (String) savedStateHandle.c("category");
            if (str != null && (valueOf = ExploreType.valueOf(str)) != null) {
                this.f40430g = valueOf;
                MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(Integer.valueOf(i11));
                this.f40431h = MutableStateFlow;
                this.f40432i = FlowKt.asStateFlow(MutableStateFlow);
                this.f40433j = StateFlowKt.MutableStateFlow(b.d.f85608a);
                MutableStateFlow<nv.d> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new nv.d(0));
                this.f40434k = MutableStateFlow2;
                this.f40435l = FlowKt.asStateFlow(MutableStateFlow2);
                this.f40436m = StateFlowKt.MutableStateFlow(Boolean.FALSE);
                this.f40437n = StateFlowKt.MutableStateFlow(null);
                String valueOf2 = String.valueOf(i11);
                String lowerCase = valueOf.name().toLowerCase(Locale.ROOT);
                u.i(lowerCase, "toLowerCase(...)");
                st.a.b(lowerCase.concat("_overview"), valueOf2);
                G0(a.C1399a.f85602a);
                BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new com.withings.healthplus.library.ui.viewmodel.a(this, null), 2, null);
                return;
            }
            throw new Exception("category shouldn't be null");
        }
        throw new Exception("userId shouldn't be null");
    }

    public static final void F0(LibraryCategoryScreenViewModel libraryCategoryScreenViewModel, Job job) {
        Job job2 = libraryCategoryScreenViewModel.f40438o;
        if (job2 != null) {
            job2.cancel(new CancellationException("New job received"));
        }
        libraryCategoryScreenViewModel.f40438o = job;
    }

    public static final void f0(LibraryCategoryScreenViewModel libraryCategoryScreenViewModel, int i11, Integer num, String str) {
        libraryCategoryScreenViewModel.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(libraryCategoryScreenViewModel), Dispatchers.getMain(), null, new b(libraryCategoryScreenViewModel, i11, num, str, null), 2, null);
    }

    public static final StateFlow g0(LibraryCategoryScreenViewModel libraryCategoryScreenViewModel) {
        return FlowKt.asStateFlow(libraryCategoryScreenViewModel.f40437n);
    }

    public final void G0(nv.a fetchLibraryFiltersAndPreviewContentMode) {
        u.j(fetchLibraryFiltersAndPreviewContentMode, "fetchLibraryFiltersAndPreviewContentMode");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(fetchLibraryFiltersAndPreviewContentMode, null), 2, null);
    }

    public final ExploreType K0() {
        return this.f40430g;
    }

    public final StateFlow<nv.b> M0() {
        return FlowKt.asStateFlow(this.f40433j);
    }

    public final StateFlow<Boolean> O0() {
        return FlowKt.asStateFlow(this.f40436m);
    }

    public final StateFlow<nv.d> R0() {
        return this.f40435l;
    }

    public final void T0(ek.a selectedItem) {
        MutableStateFlow<nv.b> mutableStateFlow;
        MutableStateFlow<Boolean> mutableStateFlow2;
        Boolean value;
        MutableStateFlow<Integer> mutableStateFlow3;
        MutableStateFlow<Integer> mutableStateFlow4;
        Integer value2;
        u.j(selectedItem, "selectedItem");
        if (selectedItem.c() != this.f40432i.getValue().intValue()) {
            String a11 = selectedItem.a();
            ExploreType exploreType = this.f40430g;
            if (a11 != null) {
                String lowerCase = exploreType.name().toLowerCase(Locale.ROOT);
                u.i(lowerCase, "toLowerCase(...)");
                st.a.b(lowerCase.concat("_overview"), a11);
            }
            do {
                mutableStateFlow = this.f40433j;
            } while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), b.f.f85610a));
            do {
                mutableStateFlow2 = this.f40436m;
                value = mutableStateFlow2.getValue();
                value.getClass();
            } while (!mutableStateFlow2.compareAndSet(value, Boolean.FALSE));
            do {
                mutableStateFlow3 = this.f40437n;
            } while (!mutableStateFlow3.compareAndSet(mutableStateFlow3.getValue(), null));
            do {
                mutableStateFlow4 = this.f40431h;
                value2 = mutableStateFlow4.getValue();
                value2.intValue();
            } while (!mutableStateFlow4.compareAndSet(value2, Integer.valueOf(selectedItem.c())));
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getMain(), null, new b(this, selectedItem.c(), (Integer) FlowKt.asStateFlow(mutableStateFlow3).getValue(), TaskTypeExtensionKt.wsValue(exploreType.e()), null), 2, null);
        }
    }
}
