package com.withings.programs.viewmodel;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.programs.model.program.ProgramDomain;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import nm0.y;
import ym0.p;
import ym0.q;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AchieveViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.programs.viewmodel.AchieveViewModel$1", f = "AchieveViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONG_SHARINGISDOCTOR}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f43816a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AchieveViewModel f43817b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AchieveViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.programs.viewmodel.AchieveViewModel$1$1", f = "AchieveViewModel.kt", l = {ConstantsWs.WS_STATUS_OAUTHWRONGSIGNATURE, ConstantsWs.WS_STATUS_WRONGNOTIFICATION, ConstantsWs.WS_STATUS_WRONGFIRSTNAME, ConstantsWs.WS_STATUS_WRONGGENDER, ConstantsWs.WS_STATUS_WRONGBIRTHDATE}, m = "invokeSuspend")
    /* renamed from: com.withings.programs.viewmodel.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0595a extends kotlin.coroutines.jvm.internal.i implements q<List<? extends ProgramDomain>, n20.h, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        List f43818a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList f43819b;

        /* renamed from: c  reason: collision with root package name */
        int f43820c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ List f43821d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f43822e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ AchieveViewModel f43823f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0595a(AchieveViewModel achieveViewModel, qm0.d<? super C0595a> dVar) {
            super(3, dVar);
            this.f43823f = achieveViewModel;
        }

        @Override // ym0.q
        public final Object invoke(List<? extends ProgramDomain> list, n20.h hVar, qm0.d<? super y> dVar) {
            C0595a c0595a = new C0595a(this.f43823f, dVar);
            c0595a.f43821d = list;
            c0595a.f43822e = hVar;
            return c0595a.invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:48:0x013d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x014e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x015a A[RETURN] */
        /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v11, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r7v8, types: [java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 350
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.programs.viewmodel.a.C0595a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AchieveViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class b<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        public static final b<T> f43824a = (b<T>) new Object();

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, qm0.d dVar) {
            y yVar = (y) obj;
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AchieveViewModel achieveViewModel, qm0.d<? super a> dVar) {
        super(2, dVar);
        this.f43817b = achieveViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new a(this.f43817b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        x30.b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f43816a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            AchieveViewModel achieveViewModel = this.f43817b;
            bVar = achieveViewModel.f43779j;
            Flow combine = FlowKt.combine(bVar, achieveViewModel.U0(), new C0595a(achieveViewModel, null));
            FlowCollector flowCollector = b.f43824a;
            this.f43816a = 1;
            if (combine.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
