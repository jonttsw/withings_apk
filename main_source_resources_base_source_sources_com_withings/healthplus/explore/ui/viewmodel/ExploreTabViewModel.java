package com.withings.healthplus.explore.ui.viewmodel;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.l;
import nm0.y;
import qm0.d;
import vk.a;
import ym0.p;
/* compiled from: ExploreTabViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/healthplus/explore/ui/viewmodel/ExploreTabViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ExploreTabViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final or.a f40344a;

    /* renamed from: b  reason: collision with root package name */
    private final or.c f40345b;

    /* renamed from: c  reason: collision with root package name */
    private final bx.a f40346c;

    /* renamed from: d  reason: collision with root package name */
    private final MutableStateFlow<vk.a> f40347d;

    /* renamed from: e  reason: collision with root package name */
    private final MutableStateFlow f40348e;

    /* compiled from: ExploreTabViewModel.kt */
    @e(c = "com.withings.healthplus.explore.ui.viewmodel.ExploreTabViewModel$favorite$1", f = "ExploreTabViewModel.kt", l = {42}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends i implements p<CoroutineScope, d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f40349a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f40351c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f40352d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2, d<? super a> dVar) {
            super(2, dVar);
            this.f40351c = str;
            this.f40352d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new a(this.f40351c, this.f40352d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f40349a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                or.a aVar = ExploreTabViewModel.this.f40344a;
                List V = x.V(this.f40351c);
                this.f40349a = 1;
                if (aVar.a(V, this.f40352d, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: ExploreTabViewModel.kt */
    @e(c = "com.withings.healthplus.explore.ui.viewmodel.ExploreTabViewModel$unFavorite$1", f = "ExploreTabViewModel.kt", l = {52}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends i implements p<CoroutineScope, d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f40353a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f40355c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f40356d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, d<? super b> dVar) {
            super(2, dVar);
            this.f40355c = str;
            this.f40356d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new b(this.f40355c, this.f40356d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f40353a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                or.c cVar = ExploreTabViewModel.this.f40345b;
                List V = x.V(this.f40355c);
                this.f40353a = 1;
                if (cVar.a(V, this.f40356d, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExploreTabViewModel.kt */
    @e(c = "com.withings.healthplus.explore.ui.viewmodel.ExploreTabViewModel$updateStateScreen$1", f = "ExploreTabViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends i implements p<CoroutineScope, d<? super y>, Object> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ vk.a f40358b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(vk.a aVar, d<? super c> dVar) {
            super(2, dVar);
            this.f40358b = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new c(this.f40358b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            MutableStateFlow mutableStateFlow = ExploreTabViewModel.this.f40347d;
            do {
                value = mutableStateFlow.getValue();
                vk.a aVar = (vk.a) value;
            } while (!mutableStateFlow.compareAndSet(value, this.f40358b));
            return y.f85009a;
        }
    }

    @Inject
    public ExploreTabViewModel(or.a aVar, or.c cVar, bx.a sharedLiveWorkoutInfo) {
        u.j(sharedLiveWorkoutInfo, "sharedLiveWorkoutInfo");
        this.f40344a = aVar;
        this.f40345b = cVar;
        this.f40346c = sharedLiveWorkoutInfo;
        MutableStateFlow<vk.a> MutableStateFlow = StateFlowKt.MutableStateFlow(a.b.f103949a);
        this.f40347d = MutableStateFlow;
        this.f40348e = MutableStateFlow;
    }

    public final void j0(String contentId, String type) {
        u.j(contentId, "contentId");
        u.j(type, "type");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(contentId, type, null), 2, null);
    }

    public final MutableStateFlow k0() {
        return this.f40348e;
    }

    public final void m0(boolean z5) {
        this.f40346c.e(z5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.g1
    public final void onCleared() {
        this.f40346c.e(false);
        super.onCleared();
    }

    public final void p0(String contentId, String type) {
        u.j(contentId, "contentId");
        u.j(type, "type");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new b(contentId, type, null), 2, null);
    }

    public final void q0(vk.a newStateScreen) {
        u.j(newStateScreen, "newStateScreen");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new c(newStateScreen, null), 2, null);
    }
}
