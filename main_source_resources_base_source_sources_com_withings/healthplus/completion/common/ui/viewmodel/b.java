package com.withings.healthplus.completion.common.ui.viewmodel;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import qm0.d;
import tt.a;
import ym0.l;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MissionContentCompletionViewModel.kt */
@e(c = "com.withings.healthplus.completion.common.ui.viewmodel.MissionContentCompletionViewModel$completeMissionTask$1", f = "MissionContentCompletionViewModel.kt", l = {48, 55}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class b extends i implements p<CoroutineScope, d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    a.C1686a f40016a;

    /* renamed from: b  reason: collision with root package name */
    int f40017b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f40018c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ MissionContentCompletionViewModel f40019d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ l<vt.a, y> f40020e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f40021f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MissionContentCompletionViewModel.kt */
    @e(c = "com.withings.healthplus.completion.common.ui.viewmodel.MissionContentCompletionViewModel$completeMissionTask$1$3$1", f = "MissionContentCompletionViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends i implements p<CoroutineScope, d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l<vt.a, y> f40022a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ vt.a f40023b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(l<? super vt.a, y> lVar, vt.a aVar, d<? super a> dVar) {
            super(2, dVar);
            this.f40022a = lVar;
            this.f40023b = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new a(this.f40022a, this.f40023b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            this.f40022a.invoke(this.f40023b);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(MissionContentCompletionViewModel missionContentCompletionViewModel, l<? super vt.a, y> lVar, ym0.a<y> aVar, d<? super b> dVar) {
        super(2, dVar);
        this.f40019d = missionContentCompletionViewModel;
        this.f40020e = lVar;
        this.f40021f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        b bVar = new b(this.f40019d, this.f40020e, this.f40021f, dVar);
        bVar.f40018c = obj;
        return bVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.healthplus.completion.common.ui.viewmodel.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
