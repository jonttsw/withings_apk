package com.withings.zendesk.ui;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
import zendesk.support.SimpleArticle;
/* compiled from: SectionArticlesPage.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "Lzendesk/support/SimpleArticle;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "com.withings.zendesk.ui.SectionArticlesPage$onViewCreated$3$suggestions$1", f = "SectionArticlesPage.kt", l = {64}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class SectionArticlesPage$onViewCreated$3$suggestions$1 extends i implements p<CoroutineScope, qm0.d<? super List<? extends SimpleArticle>>, Object> {
    int label;
    final /* synthetic */ SectionArticlesPage this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionArticlesPage$onViewCreated$3$suggestions$1(SectionArticlesPage sectionArticlesPage, qm0.d<? super SectionArticlesPage$onViewCreated$3$suggestions$1> dVar) {
        super(2, dVar);
        this.this$0 = sectionArticlesPage;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new SectionArticlesPage$onViewCreated$3$suggestions$1(this.this$0, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            nm0.l.b(r7)
            goto L58
        Ld:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L15:
            nm0.l.b(r7)
            zendesk.support.Support r7 = zendesk.support.Support.INSTANCE
            zendesk.support.ProviderStore r7 = r7.provider()
            if (r7 == 0) goto L5b
            zendesk.support.HelpCenterProvider r7 = r7.helpCenterProvider()
            if (r7 == 0) goto L5b
            com.withings.zendesk.ui.SectionArticlesPage r1 = r6.this$0
            com.withings.zendesk.ui.SectionArticlesPageArgs r1 = com.withings.zendesk.ui.SectionArticlesPage.access$getArgs(r1)
            com.withings.zendesk.models.ZendeskLabel r1 = r1.getLabel()
            java.lang.String r1 = r1.getZendeskLabel()
            com.withings.zendesk.ui.SectionArticlesPage r3 = r6.this$0
            com.withings.zendesk.ui.SectionArticlesPageArgs r3 = com.withings.zendesk.ui.SectionArticlesPage.access$getArgs(r3)
            zendesk.support.Section r3 = r3.getSection()
            java.lang.Long r3 = r3.getId()
            if (r3 != 0) goto L4b
            java.lang.Long r3 = new java.lang.Long
            r4 = 0
            r3.<init>(r4)
        L4b:
            long r3 = r3.longValue()
            r6.label = r2
            java.lang.Object r7 = com.withings.zendesk.ktx.HelpCenterProviderExtensionKt.suggestionByLabelAndSection(r7, r1, r3, r6)
            if (r7 != r0) goto L58
            return r0
        L58:
            java.util.List r7 = (java.util.List) r7
            goto L5c
        L5b:
            r7 = 0
        L5c:
            if (r7 != 0) goto L60
            kotlin.collections.i0 r7 = kotlin.collections.i0.f76187a
        L60:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.zendesk.ui.SectionArticlesPage$onViewCreated$3$suggestions$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<? extends SimpleArticle>> dVar) {
        return ((SectionArticlesPage$onViewCreated$3$suggestions$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
