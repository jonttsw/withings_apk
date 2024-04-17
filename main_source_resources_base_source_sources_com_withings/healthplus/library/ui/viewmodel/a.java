package com.withings.healthplus.library.ui.viewmodel;

import androidx.lifecycle.h1;
import com.withings.contentproviders.model.content.TaskType;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
import ym0.q;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LibraryCategoryScreenViewModel.kt */
@e(c = "com.withings.healthplus.library.ui.viewmodel.LibraryCategoryScreenViewModel$combineAndCollectFiltersAndPreviewContent$1", f = "LibraryCategoryScreenViewModel.kt", l = {193, 229}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class a extends i implements p<CoroutineScope, d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f40442a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LibraryCategoryScreenViewModel f40443b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LibraryCategoryScreenViewModel.kt */
    @e(c = "com.withings.healthplus.library.ui.viewmodel.LibraryCategoryScreenViewModel$combineAndCollectFiltersAndPreviewContent$1$1", f = "LibraryCategoryScreenViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.withings.healthplus.library.ui.viewmodel.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0535a extends i implements q<List<? extends jv.a>, Integer, d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ List f40444a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ int f40445b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ LibraryCategoryScreenViewModel f40446c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LibraryCategoryScreenViewModel.kt */
        @e(c = "com.withings.healthplus.library.ui.viewmodel.LibraryCategoryScreenViewModel$combineAndCollectFiltersAndPreviewContent$1$1$1", f = "LibraryCategoryScreenViewModel.kt", l = {202, 206}, m = "invokeSuspend")
        /* renamed from: com.withings.healthplus.library.ui.viewmodel.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0536a extends i implements p<CoroutineScope, d<? super y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f40447a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ LibraryCategoryScreenViewModel f40448b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f40449c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ List<jv.a> f40450d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: LibraryCategoryScreenViewModel.kt */
            /* renamed from: com.withings.healthplus.library.ui.viewmodel.a$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0537a<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ LibraryCategoryScreenViewModel f40451a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ List<jv.a> f40452b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ int f40453c;

                C0537a(LibraryCategoryScreenViewModel libraryCategoryScreenViewModel, List<jv.a> list, int i11) {
                    this.f40451a = libraryCategoryScreenViewModel;
                    this.f40452b = list;
                    this.f40453c = i11;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0152  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x0178 A[LOOP:4: B:57:0x0172->B:59:0x0178, LOOP_END] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r29, qm0.d r30) {
                    /*
                        Method dump skipped, instructions count: 439
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.withings.healthplus.library.ui.viewmodel.a.C0535a.C0536a.C0537a.emit(java.lang.Object, qm0.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0536a(LibraryCategoryScreenViewModel libraryCategoryScreenViewModel, int i11, List<jv.a> list, d<? super C0536a> dVar) {
                super(2, dVar);
                this.f40448b = libraryCategoryScreenViewModel;
                this.f40449c = i11;
                this.f40450d = list;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<y> create(Object obj, d<?> dVar) {
                return new C0536a(this.f40448b, this.f40449c, this.f40450d, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
                return ((C0536a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                mv.d dVar;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f40447a;
                int i12 = this.f40449c;
                LibraryCategoryScreenViewModel libraryCategoryScreenViewModel = this.f40448b;
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
                    dVar = libraryCategoryScreenViewModel.f40428e;
                    TaskType e11 = libraryCategoryScreenViewModel.K0().e();
                    Integer num = new Integer(i12);
                    if (num.intValue() <= -1) {
                        num = null;
                    }
                    this.f40447a = 1;
                    obj = dVar.a(e11, num, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                C0537a c0537a = new C0537a(libraryCategoryScreenViewModel, this.f40450d, i12);
                this.f40447a = 2;
                if (((Flow) obj).collect(c0537a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0535a(LibraryCategoryScreenViewModel libraryCategoryScreenViewModel, d<? super C0535a> dVar) {
            super(3, dVar);
            this.f40446c = libraryCategoryScreenViewModel;
        }

        @Override // ym0.q
        public final Object invoke(List<? extends jv.a> list, Integer num, d<? super y> dVar) {
            int intValue = num.intValue();
            C0535a c0535a = new C0535a(this.f40446c, dVar);
            c0535a.f40444a = list;
            c0535a.f40445b = intValue;
            return c0535a.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Job launch$default;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            int i11 = this.f40445b;
            LibraryCategoryScreenViewModel libraryCategoryScreenViewModel = this.f40446c;
            launch$default = BuildersKt__Builders_commonKt.launch$default(h1.a(libraryCategoryScreenViewModel), Dispatchers.getIO(), null, new C0536a(libraryCategoryScreenViewModel, i11, this.f40444a, null), 2, null);
            LibraryCategoryScreenViewModel.F0(libraryCategoryScreenViewModel, launch$default);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LibraryCategoryScreenViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class b<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LibraryCategoryScreenViewModel f40454a;

        b(LibraryCategoryScreenViewModel libraryCategoryScreenViewModel) {
            this.f40454a = libraryCategoryScreenViewModel;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, d dVar) {
            Job job;
            y yVar = (y) obj;
            job = this.f40454a.f40438o;
            if (job != null) {
                job.start();
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LibraryCategoryScreenViewModel libraryCategoryScreenViewModel, d<? super a> dVar) {
        super(2, dVar);
        this.f40443b = libraryCategoryScreenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new a(this.f40443b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        mv.e eVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f40442a;
        LibraryCategoryScreenViewModel libraryCategoryScreenViewModel = this.f40443b;
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
            eVar = libraryCategoryScreenViewModel.f40427d;
            TaskType e11 = libraryCategoryScreenViewModel.K0().e();
            this.f40442a = 1;
            obj = eVar.a(e11, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Flow combine = FlowKt.combine((Flow) obj, libraryCategoryScreenViewModel.f40432i, new C0535a(libraryCategoryScreenViewModel, null));
        b bVar = new b(libraryCategoryScreenViewModel);
        this.f40442a = 2;
        if (combine.collect(bVar, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return y.f85009a;
    }
}
