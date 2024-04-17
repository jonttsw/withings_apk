package com.withings.healthplus.completion.common.ui.viewmodel;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import qm0.d;
import ym0.l;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProgramContentCompletionViewModel.kt */
@e(c = "com.withings.healthplus.completion.common.ui.viewmodel.ProgramContentCompletionViewModel$completeProgramTask$1", f = "ProgramContentCompletionViewModel.kt", l = {47, 55}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class c extends i implements p<CoroutineScope, d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f40024a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f40025b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ProgramContentCompletionViewModel f40026c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l<vt.a, y> f40027d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f40028e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProgramContentCompletionViewModel.kt */
    @e(c = "com.withings.healthplus.completion.common.ui.viewmodel.ProgramContentCompletionViewModel$completeProgramTask$1$3$1", f = "ProgramContentCompletionViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends i implements p<CoroutineScope, d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l<vt.a, y> f40029a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ vt.a f40030b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(l<? super vt.a, y> lVar, vt.a aVar, d<? super a> dVar) {
            super(2, dVar);
            this.f40029a = lVar;
            this.f40030b = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new a(this.f40029a, this.f40030b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            this.f40029a.invoke(this.f40030b);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(ProgramContentCompletionViewModel programContentCompletionViewModel, l<? super vt.a, y> lVar, ym0.a<y> aVar, d<? super c> dVar) {
        super(2, dVar);
        this.f40026c = programContentCompletionViewModel;
        this.f40027d = lVar;
        this.f40028e = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        c cVar = new c(this.f40026c, this.f40027d, this.f40028e, dVar);
        cVar.f40025b = obj;
        return cVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0014, B:32:0x00b2, B:34:0x00b7, B:35:0x00bb, B:37:0x00cd, B:39:0x00d2, B:42:0x00d9, B:14:0x002a, B:23:0x007e, B:28:0x0093, B:19:0x004e), top: B:53:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0110  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.healthplus.completion.common.ui.viewmodel.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
