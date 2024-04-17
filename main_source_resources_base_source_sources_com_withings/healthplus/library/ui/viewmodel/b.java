package com.withings.healthplus.library.ui.viewmodel;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kv.a;
import mv.c;
import nm0.y;
import nv.b;
import qm0.d;
import ym0.l;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LibraryCategoryScreenViewModel.kt */
@e(c = "com.withings.healthplus.library.ui.viewmodel.LibraryCategoryScreenViewModel$fetchLibraryPreviewContent$1", f = "LibraryCategoryScreenViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_CAN}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class b extends i implements p<CoroutineScope, d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f40455a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LibraryCategoryScreenViewModel f40456b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f40457c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Integer f40458d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f40459e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LibraryCategoryScreenViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class a extends w implements l<a.AbstractC1229a, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LibraryCategoryScreenViewModel f40460a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(LibraryCategoryScreenViewModel libraryCategoryScreenViewModel) {
            super(1);
            this.f40460a = libraryCategoryScreenViewModel;
        }

        @Override // ym0.l
        public final y invoke(a.AbstractC1229a abstractC1229a) {
            Object value;
            Object value2;
            a.AbstractC1229a.C1230a c1230a;
            Object value3;
            Object value4;
            a.AbstractC1229a fetchPreviewInformation = abstractC1229a;
            u.j(fetchPreviewInformation, "fetchPreviewInformation");
            boolean z5 = fetchPreviewInformation instanceof a.AbstractC1229a.C1230a;
            LibraryCategoryScreenViewModel libraryCategoryScreenViewModel = this.f40460a;
            if (z5) {
                MutableStateFlow mutableStateFlow = libraryCategoryScreenViewModel.f40436m;
                do {
                    value2 = mutableStateFlow.getValue();
                    ((Boolean) value2).getClass();
                    c1230a = (a.AbstractC1229a.C1230a) fetchPreviewInformation;
                } while (!mutableStateFlow.compareAndSet(value2, Boolean.valueOf(c1230a.a())));
                MutableStateFlow mutableStateFlow2 = libraryCategoryScreenViewModel.f40437n;
                do {
                    value3 = mutableStateFlow2.getValue();
                    Integer num = (Integer) value3;
                } while (!mutableStateFlow2.compareAndSet(value3, c1230a.b()));
                MutableStateFlow mutableStateFlow3 = libraryCategoryScreenViewModel.f40433j;
                do {
                    value4 = mutableStateFlow3.getValue();
                    nv.b bVar = (nv.b) value4;
                } while (!mutableStateFlow3.compareAndSet(value4, b.d.f85608a));
            } else if ((fetchPreviewInformation instanceof a.AbstractC1229a.b) && libraryCategoryScreenViewModel.R0().getValue().b().isEmpty()) {
                MutableStateFlow mutableStateFlow4 = libraryCategoryScreenViewModel.f40433j;
                do {
                    value = mutableStateFlow4.getValue();
                    nv.b bVar2 = (nv.b) value;
                } while (!mutableStateFlow4.compareAndSet(value, b.a.f85605a));
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LibraryCategoryScreenViewModel libraryCategoryScreenViewModel, int i11, Integer num, String str, d<? super b> dVar) {
        super(2, dVar);
        this.f40456b = libraryCategoryScreenViewModel;
        this.f40457c = i11;
        this.f40458d = num;
        this.f40459e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new b(this.f40456b, this.f40457c, this.f40458d, this.f40459e, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f40455a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            LibraryCategoryScreenViewModel libraryCategoryScreenViewModel = this.f40456b;
            cVar = libraryCategoryScreenViewModel.f40426c;
            a aVar = new a(libraryCategoryScreenViewModel);
            Integer num = new Integer(this.f40457c);
            if (num.intValue() <= -1) {
                num = null;
            }
            Integer num2 = num;
            long j5 = libraryCategoryScreenViewModel.f40429f;
            this.f40455a = 1;
            if (cVar.a(j5, num2, this.f40458d, this.f40459e, this, aVar) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
