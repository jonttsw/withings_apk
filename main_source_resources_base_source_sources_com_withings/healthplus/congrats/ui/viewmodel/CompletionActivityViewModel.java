package com.withings.healthplus.congrats.ui.viewmodel;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import nm0.g;
import nm0.h;
import nm0.l;
import nm0.y;
import or.i;
import qm0.d;
import ym0.p;
/* compiled from: CompletionActivityViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/healthplus/congrats/ui/viewmodel/CompletionActivityViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CompletionActivityViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final xw.b f40128a;

    /* renamed from: b  reason: collision with root package name */
    private final i f40129b;

    /* renamed from: c  reason: collision with root package name */
    private final g f40130c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompletionActivityViewModel.kt */
    @e(c = "com.withings.healthplus.congrats.ui.viewmodel.CompletionActivityViewModel$syncBookmarkRemotely$1", f = "CompletionActivityViewModel.kt", l = {27}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f40131a;

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
            int i11 = this.f40131a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                CompletionActivityViewModel completionActivityViewModel = CompletionActivityViewModel.this;
                i iVar = completionActivityViewModel.f40129b;
                long g02 = completionActivityViewModel.g0();
                this.f40131a = 1;
                if (iVar.a(g02, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: CompletionActivityViewModel.kt */
    /* loaded from: classes3.dex */
    static final class b extends w implements ym0.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u0 f40133a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(u0 u0Var) {
            super(0);
            this.f40133a = u0Var;
        }

        @Override // ym0.a
        public final Long invoke() {
            Long l5 = (Long) this.f40133a.c(NavigationArguments.USER_ID);
            if (l5 != null) {
                return l5;
            }
            throw new Exception("userId shouldn't be null");
        }
    }

    @Inject
    public CompletionActivityViewModel(u0 savedStateHandle, xw.b dispatcher, i iVar) {
        u.j(savedStateHandle, "savedStateHandle");
        u.j(dispatcher, "dispatcher");
        this.f40128a = dispatcher;
        this.f40129b = iVar;
        this.f40130c = h.b(new b(savedStateHandle));
    }

    public final long g0() {
        return ((Number) this.f40130c.getValue()).longValue();
    }

    public final void i0() {
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), this.f40128a.a(), null, new a(null), 2, null);
    }
}
