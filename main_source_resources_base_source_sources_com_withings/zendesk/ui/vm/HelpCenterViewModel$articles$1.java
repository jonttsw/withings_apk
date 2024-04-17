package com.withings.zendesk.ui.vm;

import androidx.lifecycle.h0;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.y;
import qm0.d;
import ym0.p;
import zendesk.support.SearchArticle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HelpCenterViewModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/h0;", "", "Lzendesk/support/SearchArticle;", "Lnm0/y;", "<anonymous>", "(Landroidx/lifecycle/h0;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.zendesk.ui.vm.HelpCenterViewModel$articles$1", f = "HelpCenterViewModel.kt", l = {41, 41}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class HelpCenterViewModel$articles$1 extends i implements p<h0<List<? extends SearchArticle>>, d<? super y>, Object> {
    final /* synthetic */ Long $categoryId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HelpCenterViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpCenterViewModel$articles$1(Long l5, HelpCenterViewModel helpCenterViewModel, d<? super HelpCenterViewModel$articles$1> dVar) {
        super(2, dVar);
        this.$categoryId = l5;
        this.this$0 = helpCenterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        HelpCenterViewModel$articles$1 helpCenterViewModel$articles$1 = new HelpCenterViewModel$articles$1(this.$categoryId, this.this$0, dVar);
        helpCenterViewModel$articles$1.L$0 = obj;
        return helpCenterViewModel$articles$1;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(h0<List<SearchArticle>> h0Var, d<? super y> dVar) {
        return ((HelpCenterViewModel$articles$1) create(h0Var, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r13 != null) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r12.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L21
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            nm0.l.b(r13)
            goto L62
        L11:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L19:
            java.lang.Object r1 = r12.L$0
            androidx.lifecycle.h0 r1 = (androidx.lifecycle.h0) r1
            nm0.l.b(r13)
            goto L4f
        L21:
            nm0.l.b(r13)
            java.lang.Object r13 = r12.L$0
            r1 = r13
            androidx.lifecycle.h0 r1 = (androidx.lifecycle.h0) r1
            java.lang.Long r13 = r12.$categoryId
            if (r13 == 0) goto L55
            com.withings.zendesk.ui.vm.HelpCenterViewModel r5 = r12.this$0
            long r7 = r13.longValue()
            java.lang.Long r13 = r5.getSectionId()
            if (r13 == 0) goto L52
            long r9 = r13.longValue()
            zendesk.support.HelpCenterProvider r6 = com.withings.zendesk.ui.vm.HelpCenterViewModel.access$getHelpCenterProvider$p(r5)
            if (r6 == 0) goto L52
            r12.L$0 = r1
            r12.label = r3
            r11 = r12
            java.lang.Object r13 = com.withings.zendesk.ktx.HelpCenterProviderExtensionKt.awaitArticlesForCategory(r6, r7, r9, r11)
            if (r13 != r0) goto L4f
            return r0
        L4f:
            java.util.List r13 = (java.util.List) r13
            goto L53
        L52:
            r13 = r4
        L53:
            if (r13 != 0) goto L57
        L55:
            kotlin.collections.i0 r13 = kotlin.collections.i0.f76187a
        L57:
            r12.L$0 = r4
            r12.label = r2
            java.lang.Object r13 = r1.emit(r13, r12)
            if (r13 != r0) goto L62
            return r0
        L62:
            nm0.y r13 = nm0.y.f85009a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.zendesk.ui.vm.HelpCenterViewModel$articles$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ Object invoke(h0<List<? extends SearchArticle>> h0Var, d<? super y> dVar) {
        return invoke2((h0<List<SearchArticle>>) h0Var, dVar);
    }
}
