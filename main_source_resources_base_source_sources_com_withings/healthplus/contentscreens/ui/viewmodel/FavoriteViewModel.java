package com.withings.healthplus.contentscreens.ui.viewmodel;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.withings.favorite.model.FavoriteStatus;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
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
import nm0.g;
import nm0.j;
import nm0.l;
import nm0.y;
import or.h;
import or.i;
import ym0.p;
/* compiled from: FavoriteViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/viewmodel/FavoriteViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FavoriteViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final u0 f40198a;

    /* renamed from: b  reason: collision with root package name */
    private final or.a f40199b;

    /* renamed from: c  reason: collision with root package name */
    private final or.c f40200c;

    /* renamed from: d  reason: collision with root package name */
    private final h f40201d;

    /* renamed from: e  reason: collision with root package name */
    private final i f40202e;

    /* renamed from: f  reason: collision with root package name */
    private final g f40203f;

    /* renamed from: g  reason: collision with root package name */
    private final g f40204g;

    /* renamed from: h  reason: collision with root package name */
    private final MutableStateFlow<FavoriteStatus> f40205h;

    /* renamed from: i  reason: collision with root package name */
    private final StateFlow<FavoriteStatus> f40206i;

    /* compiled from: FavoriteViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.healthplus.contentscreens.ui.viewmodel.FavoriteViewModel$1", f = "FavoriteViewModel.kt", l = {52, 55}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f40207a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: FavoriteViewModel.kt */
        /* renamed from: com.withings.healthplus.contentscreens.ui.viewmodel.FavoriteViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0524a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FavoriteViewModel f40209a;

            C0524a(FavoriteViewModel favoriteViewModel) {
                this.f40209a = favoriteViewModel;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, qm0.d dVar) {
                Object value;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                MutableStateFlow mutableStateFlow = this.f40209a.f40205h;
                do {
                    value = mutableStateFlow.getValue();
                    FavoriteStatus favoriteStatus = (FavoriteStatus) value;
                } while (!mutableStateFlow.compareAndSet(value, FavoriteStatus.Companion.map(booleanValue)));
                return y.f85009a;
            }
        }

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f40207a;
            FavoriteViewModel favoriteViewModel = FavoriteViewModel.this;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        l.b(obj);
                        return y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l.b(obj);
            } else {
                l.b(obj);
                h hVar = favoriteViewModel.f40201d;
                String q02 = favoriteViewModel.q0();
                this.f40207a = 1;
                obj = hVar.a(q02, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            C0524a c0524a = new C0524a(favoriteViewModel);
            this.f40207a = 2;
            if (((Flow) obj).collect(c0524a, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return y.f85009a;
        }
    }

    /* compiled from: FavoriteViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.healthplus.contentscreens.ui.viewmodel.FavoriteViewModel$addFavorite$1", f = "FavoriteViewModel.kt", l = {68}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f40210a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f40212c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f40212c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new b(this.f40212c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f40210a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                FavoriteViewModel favoriteViewModel = FavoriteViewModel.this;
                or.a aVar = favoriteViewModel.f40199b;
                List V = x.V(favoriteViewModel.q0());
                this.f40210a = 1;
                if (aVar.a(V, this.f40212c, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: FavoriteViewModel.kt */
    /* loaded from: classes3.dex */
    static final class c extends w implements ym0.a<String> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final String invoke() {
            String str = (String) FavoriteViewModel.this.t0().c(NavigationArguments.CONTENT_ID);
            if (str != null) {
                return str;
            }
            throw new Exception("contentId shouldn't be null");
        }
    }

    /* compiled from: FavoriteViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.healthplus.contentscreens.ui.viewmodel.FavoriteViewModel$deleteFavorite$1", f = "FavoriteViewModel.kt", l = {79}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class d extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f40214a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f40216c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, qm0.d<? super d> dVar) {
            super(2, dVar);
            this.f40216c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new d(this.f40216c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f40214a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                FavoriteViewModel favoriteViewModel = FavoriteViewModel.this;
                or.c cVar = favoriteViewModel.f40200c;
                List V = x.V(favoriteViewModel.q0());
                this.f40214a = 1;
                if (cVar.a(V, this.f40216c, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: FavoriteViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.healthplus.contentscreens.ui.viewmodel.FavoriteViewModel$syncFavoriteRemotely$1", f = "FavoriteViewModel.kt", l = {88}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class e extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f40217a;

        e(qm0.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new e(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f40217a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                FavoriteViewModel favoriteViewModel = FavoriteViewModel.this;
                i iVar = favoriteViewModel.f40202e;
                long y02 = favoriteViewModel.y0();
                this.f40217a = 1;
                if (iVar.a(y02, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: FavoriteViewModel.kt */
    /* loaded from: classes3.dex */
    static final class f extends w implements ym0.a<Long> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final Long invoke() {
            Long l5 = (Long) FavoriteViewModel.this.t0().c(NavigationArguments.USER_ID);
            if (l5 != null) {
                return l5;
            }
            throw new Exception("userId shouldn't be null");
        }
    }

    @Inject
    public FavoriteViewModel(u0 savedStateHandle, or.a aVar, or.c cVar, h hVar, i iVar) {
        u.j(savedStateHandle, "savedStateHandle");
        this.f40198a = savedStateHandle;
        this.f40199b = aVar;
        this.f40200c = cVar;
        this.f40201d = hVar;
        this.f40202e = iVar;
        this.f40203f = nm0.h.b(new c());
        this.f40204g = nm0.h.b(new f());
        MutableStateFlow<FavoriteStatus> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.f40205h = MutableStateFlow;
        this.f40206i = FlowKt.asStateFlow(MutableStateFlow);
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    public final void A0() {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new e(null), 2, null);
    }

    public final void m0(String type) {
        u.j(type, "type");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new b(type, null), 2, null);
    }

    public final void p0(String type) {
        u.j(type, "type");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new d(type, null), 2, null);
    }

    public final String q0() {
        return (String) this.f40203f.getValue();
    }

    public final StateFlow<FavoriteStatus> r0() {
        return this.f40206i;
    }

    public final u0 t0() {
        return this.f40198a;
    }

    public final long y0() {
        return ((Number) this.f40204g.getValue()).longValue();
    }

    public final void z0(boolean z5) {
        String str;
        if (z5) {
            str = "check";
        } else {
            str = "uncheck";
        }
        int i11 = v70.a.f103433b;
        v70.a.d("bookmark", "bookmark", s0.j(new j("bookmark", str), new j("task_id", q0())), true);
    }
}
