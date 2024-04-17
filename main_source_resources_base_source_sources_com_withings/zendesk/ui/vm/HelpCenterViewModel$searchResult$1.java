package com.withings.zendesk.ui.vm;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.j;
import nm0.y;
import qm0.d;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HelpCenterViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "query", "Lnm0/j;", "", "", "<anonymous>", "(Ljava/lang/String;)Lnm0/j;"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.zendesk.ui.vm.HelpCenterViewModel$searchResult$1", f = "HelpCenterViewModel.kt", l = {78}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class HelpCenterViewModel$searchResult$1 extends i implements p<String, d<? super j<? extends String, ? extends List<? extends Object>>>, Object> {
    final /* synthetic */ Long $categoryId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HelpCenterViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpCenterViewModel$searchResult$1(HelpCenterViewModel helpCenterViewModel, Long l5, d<? super HelpCenterViewModel$searchResult$1> dVar) {
        super(2, dVar);
        this.this$0 = helpCenterViewModel;
        this.$categoryId = l5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        HelpCenterViewModel$searchResult$1 helpCenterViewModel$searchResult$1 = new HelpCenterViewModel$searchResult$1(this.this$0, this.$categoryId, dVar);
        helpCenterViewModel$searchResult$1.L$0 = obj;
        return helpCenterViewModel$searchResult$1;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ Object invoke(String str, d<? super j<? extends String, ? extends List<? extends Object>>> dVar) {
        return invoke2(str, (d<? super j<String, ? extends List<? extends Object>>>) dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075 A[LOOP:0: B:22:0x006f->B:24:0x0075, LOOP_END] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r10.label
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r0 = r10.L$0
            java.lang.String r0 = (java.lang.String) r0
            nm0.l.b(r11)
            goto L55
        L11:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L19:
            nm0.l.b(r11)
            java.lang.Object r11 = r10.L$0
            java.lang.String r11 = (java.lang.String) r11
            int r1 = r11.length()
            if (r1 != 0) goto L2f
            nm0.j r0 = new nm0.j
            kotlin.collections.i0 r1 = kotlin.collections.i0.f76187a
            r0.<init>(r11, r1)
            goto L9c
        L2f:
            com.withings.zendesk.ui.vm.HelpCenterViewModel r1 = r10.this$0
            zendesk.support.HelpCenterProvider r3 = com.withings.zendesk.ui.vm.HelpCenterViewModel.access$getHelpCenterProvider$p(r1)
            if (r3 == 0) goto L58
            java.lang.Long r1 = r10.$categoryId
            kotlin.jvm.internal.u.g(r1)
            long r4 = r1.longValue()
            com.withings.zendesk.ui.vm.HelpCenterViewModel r1 = r10.this$0
            java.util.List r6 = r1.getLabels$zendesk_release()
            r10.L$0 = r11
            r10.label = r2
            r7 = r11
            r8 = r10
            java.lang.Object r1 = com.withings.zendesk.ktx.HelpCenterProviderExtensionKt.search(r3, r4, r6, r7, r8)
            if (r1 != r0) goto L53
            return r0
        L53:
            r0 = r11
            r11 = r1
        L55:
            java.util.Map r11 = (java.util.Map) r11
            goto L5c
        L58:
            r0 = 0
            r9 = r0
            r0 = r11
            r11 = r9
        L5c:
            if (r11 != 0) goto L62
            java.util.Map r11 = kotlin.collections.s0.d()
        L62:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L6f:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L96
            java.lang.Object r2 = r11.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Object r4 = r2.getKey()
            java.util.ArrayList r3 = kotlin.collections.x.m0(r4, r3)
            java.lang.Object r2 = r2.getValue()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r2 = kotlin.collections.x.l0(r2, r3)
            kotlin.collections.x.n(r2, r1)
            goto L6f
        L96:
            nm0.j r11 = new nm0.j
            r11.<init>(r0, r1)
            r0 = r11
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.zendesk.ui.vm.HelpCenterViewModel$searchResult$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, d<? super j<String, ? extends List<? extends Object>>> dVar) {
        return ((HelpCenterViewModel$searchResult$1) create(str, dVar)).invokeSuspend(y.f85009a);
    }
}
