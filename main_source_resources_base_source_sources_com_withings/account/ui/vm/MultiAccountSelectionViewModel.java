package com.withings.account.ui.vm;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v0;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import gg.a;
import gg.c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import og.n;
import og.u;
import qm0.d;
import xw.n;
import ym0.p;
/* compiled from: MultiAccountSelectionViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/account/ui/vm/MultiAccountSelectionViewModel;", "Landroidx/lifecycle/g1;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class MultiAccountSelectionViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final gg.b f31025a;

    /* renamed from: b  reason: collision with root package name */
    private final c f31026b;

    /* renamed from: c  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f31027c;

    /* renamed from: d  reason: collision with root package name */
    private final n<og.n> f31028d;

    /* compiled from: MultiAccountSelectionViewModel.kt */
    @e(c = "com.withings.account.ui.vm.MultiAccountSelectionViewModel$1", f = "MultiAccountSelectionViewModel.kt", l = {30}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends i implements p<CoroutineScope, d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31029a;

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
            int i11 = this.f31029a;
            MultiAccountSelectionViewModel multiAccountSelectionViewModel = MultiAccountSelectionViewModel.this;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                multiAccountSelectionViewModel.j0().setValue(u.c.f86840a);
                gg.b bVar = multiAccountSelectionViewModel.f31025a;
                this.f31029a = 1;
                obj = bVar.b(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            gg.a aVar = (gg.a) obj;
            if (aVar instanceof a.C0983a) {
                multiAccountSelectionViewModel.j0().setValue(new u.b(((a.C0983a) aVar).a()));
            }
            return y.f85009a;
        }
    }

    /* compiled from: MultiAccountSelectionViewModel.kt */
    @e(c = "com.withings.account.ui.vm.MultiAccountSelectionViewModel$selectAccount$1", f = "MultiAccountSelectionViewModel.kt", l = {42}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends i implements p<CoroutineScope, d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31031a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ og.a f31033c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(og.a aVar, d<? super b> dVar) {
            super(2, dVar);
            this.f31033c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new b(this.f31033c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f31031a;
            MultiAccountSelectionViewModel multiAccountSelectionViewModel = MultiAccountSelectionViewModel.this;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                c cVar = multiAccountSelectionViewModel.f31026b;
                long a11 = this.f31033c.a();
                this.f31031a = 1;
                if (cVar.a(a11, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            multiAccountSelectionViewModel.i0().postValue(n.a.f86807a);
            return y.f85009a;
        }
    }

    @Inject
    public MultiAccountSelectionViewModel(gg.b bVar, c cVar) {
        ParcelableSnapshotMutableState f11;
        this.f31025a = bVar;
        this.f31026b = cVar;
        f11 = l0.f(u.c.f86840a, v0.f8878a);
        this.f31027c = f11;
        this.f31028d = new xw.n<>();
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new a(null), 3, null);
    }

    public final xw.n<og.n> i0() {
        return this.f31028d;
    }

    public final ParcelableSnapshotMutableState j0() {
        return this.f31027c;
    }

    public final void k0(og.a accountItem) {
        kotlin.jvm.internal.u.j(accountItem, "accountItem");
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new b(accountItem, null), 3, null);
    }
}
