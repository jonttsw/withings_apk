package com.withings.healthplus.contentscreens.ui.viewmodel;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import java.net.URLEncoder;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
import zw.a;
/* compiled from: SuggestWorkoutLaunchOnWatchViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/viewmodel/SuggestWorkoutLaunchOnWatchViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SuggestWorkoutLaunchOnWatchViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final u0 f40220a;

    /* renamed from: b  reason: collision with root package name */
    private final bx.a f40221b;

    /* renamed from: c  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f40222c;

    /* renamed from: d  reason: collision with root package name */
    private final StateFlow<Boolean> f40223d;

    /* compiled from: SuggestWorkoutLaunchOnWatchViewModel.kt */
    @e(c = "com.withings.healthplus.contentscreens.ui.viewmodel.SuggestWorkoutLaunchOnWatchViewModel$1", f = "SuggestWorkoutLaunchOnWatchViewModel.kt", l = {31}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends i implements p<CoroutineScope, d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f40224a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SuggestWorkoutLaunchOnWatchViewModel.kt */
        @e(c = "com.withings.healthplus.contentscreens.ui.viewmodel.SuggestWorkoutLaunchOnWatchViewModel$1$1", f = "SuggestWorkoutLaunchOnWatchViewModel.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: com.withings.healthplus.contentscreens.ui.viewmodel.SuggestWorkoutLaunchOnWatchViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0525a extends i implements p<zw.a, d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f40226a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f40227b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ SuggestWorkoutLaunchOnWatchViewModel f40228c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0525a(SuggestWorkoutLaunchOnWatchViewModel suggestWorkoutLaunchOnWatchViewModel, d<? super C0525a> dVar) {
                super(2, dVar);
                this.f40228c = suggestWorkoutLaunchOnWatchViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<y> create(Object obj, d<?> dVar) {
                C0525a c0525a = new C0525a(this.f40228c, dVar);
                c0525a.f40227b = obj;
                return c0525a;
            }

            @Override // ym0.p
            public final Object invoke(zw.a aVar, d<? super y> dVar) {
                return ((C0525a) create(aVar, dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f40226a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    l.b(obj);
                    zw.a aVar = (zw.a) this.f40227b;
                    if ((aVar instanceof a.c) || (aVar instanceof a.b)) {
                        MutableStateFlow mutableStateFlow = this.f40228c.f40222c;
                        Boolean bool = Boolean.TRUE;
                        this.f40226a = 1;
                        if (mutableStateFlow.emit(bool, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return y.f85009a;
            }
        }

        a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f40224a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                SuggestWorkoutLaunchOnWatchViewModel suggestWorkoutLaunchOnWatchViewModel = SuggestWorkoutLaunchOnWatchViewModel.this;
                MutableSharedFlow<zw.a> a11 = suggestWorkoutLaunchOnWatchViewModel.j0().a();
                C0525a c0525a = new C0525a(suggestWorkoutLaunchOnWatchViewModel, null);
                this.f40224a = 1;
                if (FlowKt.collectLatest(a11, c0525a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    @Inject
    public SuggestWorkoutLaunchOnWatchViewModel(u0 savedStateHandle, bx.a sharedLiveWorkoutInfo) {
        u.j(savedStateHandle, "savedStateHandle");
        u.j(sharedLiveWorkoutInfo, "sharedLiveWorkoutInfo");
        this.f40220a = savedStateHandle;
        this.f40221b = sharedLiveWorkoutInfo;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f40222c = MutableStateFlow;
        this.f40223d = FlowKt.asStateFlow(MutableStateFlow);
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    public final String g0() {
        String encode = URLEncoder.encode((String) this.f40220a.c(NavigationArguments.VIDEO_URL), "UTF-8");
        if (encode != null) {
            return encode;
        }
        throw new Exception("videoUrl shouldn't be null");
    }

    public final StateFlow<Boolean> i0() {
        return this.f40223d;
    }

    public final bx.a j0() {
        return this.f40221b;
    }
}
