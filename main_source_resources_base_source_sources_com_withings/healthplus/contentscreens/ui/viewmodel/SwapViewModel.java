package com.withings.healthplus.contentscreens.ui.viewmodel;

import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import d00.e;
import iu.b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import mu.a;
import nm0.y;
import nu.c;
import qm0.d;
import ym0.p;
/* compiled from: SwapViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/viewmodel/SwapViewModel;", "Lcom/withings/healthplus/contentscreens/ui/viewmodel/ContentScreenViewModel;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SwapViewModel extends ContentScreenViewModel {

    /* renamed from: j  reason: collision with root package name */
    private final b f40229j;

    /* renamed from: k  reason: collision with root package name */
    private final e f40230k;

    /* renamed from: l  reason: collision with root package name */
    private final y30.a f40231l;

    /* renamed from: m  reason: collision with root package name */
    private final MutableStateFlow<mu.a> f40232m;

    /* renamed from: n  reason: collision with root package name */
    private final StateFlow<mu.a> f40233n;

    /* renamed from: o  reason: collision with root package name */
    private final MutableSharedFlow<y> f40234o;

    /* renamed from: p  reason: collision with root package name */
    private final SharedFlow<y> f40235p;

    /* compiled from: SwapViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.healthplus.contentscreens.ui.viewmodel.SwapViewModel$performSwap$1", f = "SwapViewModel.kt", l = {48, 52, 67, 69, 78}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends i implements p<CoroutineScope, d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f40236a;

        /* renamed from: b  reason: collision with root package name */
        int f40237b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f40238c;

        a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f40238c = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00b4 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:15:0x0042, B:36:0x00a0, B:39:0x00b4, B:40:0x00b7, B:41:0x00be, B:23:0x0069, B:25:0x006f, B:32:0x0083, B:27:0x0075, B:29:0x007b), top: B:66:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00b7 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:15:0x0042, B:36:0x00a0, B:39:0x00b4, B:40:0x00b7, B:41:0x00be, B:23:0x0069, B:25:0x006f, B:32:0x0083, B:27:0x0075, B:29:0x007b), top: B:66:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0158 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 348
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.healthplus.contentscreens.ui.viewmodel.SwapViewModel.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public SwapViewModel(u0 savedStateHandle, nu.a retrieveLegacyTaskUiUseCase, c retrieveTaskUiUseCase, b bVar, e eVar, y30.a aVar) {
        super(savedStateHandle, retrieveLegacyTaskUiUseCase, retrieveTaskUiUseCase);
        u.j(savedStateHandle, "savedStateHandle");
        u.j(retrieveLegacyTaskUiUseCase, "retrieveLegacyTaskUiUseCase");
        u.j(retrieveTaskUiUseCase, "retrieveTaskUiUseCase");
        this.f40229j = bVar;
        this.f40230k = eVar;
        this.f40231l = aVar;
        MutableStateFlow<mu.a> MutableStateFlow = StateFlowKt.MutableStateFlow(a.C1327a.f82362a);
        this.f40232m = MutableStateFlow;
        this.f40233n = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<y> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.f40234o = MutableSharedFlow$default;
        this.f40235p = FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final SharedFlow<y> F0() {
        return this.f40235p;
    }

    public final StateFlow<mu.a> G0() {
        return this.f40233n;
    }

    public final void K0() {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }
}
