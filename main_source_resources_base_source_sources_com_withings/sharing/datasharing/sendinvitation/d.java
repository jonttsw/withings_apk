package com.withings.sharing.datasharing.sendinvitation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SelectDataViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.sharing.datasharing.sendinvitation.SelectDataViewModel$selectBiomarker$1", f = "SelectDataViewModel.kt", l = {81}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f44146a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SelectDataViewModel f44147b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ y40.a f44148c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectDataViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.l<y40.a, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y40.a f44149a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y40.a aVar) {
            super(1);
            this.f44149a = aVar;
        }

        @Override // ym0.l
        public final Boolean invoke(y40.a aVar) {
            boolean z5;
            y40.a it = aVar;
            kotlin.jvm.internal.u.j(it, "it");
            if (it.b() == this.f44149a.b()) {
                z5 = true;
            } else {
                z5 = false;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectDataViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.l<y40.a, y40.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y40.a f44150a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y40.a aVar) {
            super(1);
            this.f44150a = aVar;
        }

        @Override // ym0.l
        public final y40.a invoke(y40.a aVar) {
            y40.a it = aVar;
            kotlin.jvm.internal.u.j(it, "it");
            return this.f44150a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectDataViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.l<y40.a, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y40.a f44151a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y40.a aVar) {
            super(1);
            this.f44151a = aVar;
        }

        @Override // ym0.l
        public final Boolean invoke(y40.a aVar) {
            boolean z5;
            y40.a it = aVar;
            kotlin.jvm.internal.u.j(it, "it");
            if (it.b() == this.f44151a.b().a()) {
                z5 = true;
            } else {
                z5 = false;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectDataViewModel.kt */
    /* renamed from: com.withings.sharing.datasharing.sendinvitation.d$d  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0612d extends kotlin.jvm.internal.w implements ym0.l<y40.a, y40.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0612d f44152a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final y40.a invoke(y40.a aVar) {
            y40.a it = aVar;
            kotlin.jvm.internal.u.j(it, "it");
            return y40.a.a(it, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectDataViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.l<y40.a, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y40.a f44153a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(y40.a aVar) {
            super(1);
            this.f44153a = aVar;
        }

        @Override // ym0.l
        public final Boolean invoke(y40.a aVar) {
            boolean z5;
            y40.a it = aVar;
            kotlin.jvm.internal.u.j(it, "it");
            if (it.b().a() == this.f44153a.b()) {
                z5 = true;
            } else {
                z5 = false;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectDataViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.l<y40.a, y40.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y40.a f44154a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(y40.a aVar) {
            super(1);
            this.f44154a = aVar;
        }

        @Override // ym0.l
        public final y40.a invoke(y40.a aVar) {
            y40.a it = aVar;
            kotlin.jvm.internal.u.j(it, "it");
            return y40.a.a(it, this.f44154a.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SelectDataViewModel selectDataViewModel, y40.a aVar, qm0.d<? super d> dVar) {
        super(2, dVar);
        this.f44147b = selectDataViewModel;
        this.f44148c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new d(this.f44147b, this.f44148c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f44146a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            SelectDataViewModel selectDataViewModel = this.f44147b;
            List<y40.a> a11 = selectDataViewModel.g0().getValue().a();
            y40.a aVar = this.f44148c;
            List k11 = mo.a.k(a11, new a(aVar), new b(aVar));
            if (aVar.c() && aVar.b().a() != null) {
                k11 = mo.a.k(k11, new c(aVar), C0612d.f44152a);
            }
            List<y40.a> list = a11;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((y40.a) it.next()).b().a() == aVar.b()) {
                        e eVar = new e(aVar);
                        f fVar = new f(aVar);
                        ArrayList S0 = kotlin.collections.x.S0(k11);
                        int size = k11.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            Object obj2 = k11.get(i12);
                            if (((Boolean) eVar.invoke(obj2)).booleanValue()) {
                                S0.set(i12, fVar.invoke(obj2));
                            }
                        }
                        k11 = kotlin.collections.x.Q0(S0);
                    }
                }
            }
            mutableSharedFlow = selectDataViewModel.f44091a;
            this.f44146a = 1;
            if (mutableSharedFlow.emit(k11, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
