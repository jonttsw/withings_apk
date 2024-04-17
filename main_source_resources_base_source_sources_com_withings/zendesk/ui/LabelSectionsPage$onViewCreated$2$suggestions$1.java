package com.withings.zendesk.ui;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
import zendesk.support.SimpleArticle;
/* compiled from: LabelSectionsPage.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "Lzendesk/support/SimpleArticle;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "com.withings.zendesk.ui.LabelSectionsPage$onViewCreated$2$suggestions$1", f = "LabelSectionsPage.kt", l = {65}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class LabelSectionsPage$onViewCreated$2$suggestions$1 extends i implements p<CoroutineScope, qm0.d<? super List<? extends SimpleArticle>>, Object> {
    int label;
    final /* synthetic */ LabelSectionsPage this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelSectionsPage$onViewCreated$2$suggestions$1(LabelSectionsPage labelSectionsPage, qm0.d<? super LabelSectionsPage$onViewCreated$2$suggestions$1> dVar) {
        super(2, dVar);
        this.this$0 = labelSectionsPage;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new LabelSectionsPage$onViewCreated$2$suggestions$1(this.this$0, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            nm0.l.b(r6)
            goto L4b
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            nm0.l.b(r6)
            zendesk.support.Support r6 = zendesk.support.Support.INSTANCE
            zendesk.support.ProviderStore r6 = r6.provider()
            if (r6 == 0) goto L4e
            zendesk.support.HelpCenterProvider r6 = r6.helpCenterProvider()
            if (r6 == 0) goto L4e
            com.withings.zendesk.ui.LabelSectionsPage r1 = r5.this$0
            com.withings.zendesk.ui.LabelSectionsPageArgs r1 = com.withings.zendesk.ui.LabelSectionsPage.access$getArgs(r1)
            com.withings.zendesk.ui.ProductHelpCenter r1 = r1.getProductInfo()
            long r3 = r1.getCategoryId()
            com.withings.zendesk.ui.LabelSectionsPage r1 = r5.this$0
            com.withings.zendesk.ui.LabelSectionsPageArgs r1 = com.withings.zendesk.ui.LabelSectionsPage.access$getArgs(r1)
            com.withings.zendesk.models.ZendeskLabel r1 = r1.getLabel()
            java.lang.String r1 = r1.getZendeskLabel()
            r5.label = r2
            java.lang.Object r6 = com.withings.zendesk.ktx.HelpCenterProviderExtensionKt.suggestionByLabel(r6, r3, r1, r5)
            if (r6 != r0) goto L4b
            return r0
        L4b:
            java.util.List r6 = (java.util.List) r6
            goto L4f
        L4e:
            r6 = 0
        L4f:
            if (r6 != 0) goto L53
            kotlin.collections.i0 r6 = kotlin.collections.i0.f76187a
        L53:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.zendesk.ui.LabelSectionsPage$onViewCreated$2$suggestions$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<? extends SimpleArticle>> dVar) {
        return ((LabelSectionsPage$onViewCreated$2$suggestions$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
