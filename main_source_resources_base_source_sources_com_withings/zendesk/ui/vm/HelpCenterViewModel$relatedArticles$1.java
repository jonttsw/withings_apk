package com.withings.zendesk.ui.vm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.h;
import androidx.lifecycle.h0;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
import qm0.d;
import ym0.l;
import ym0.p;
import zendesk.support.Article;
import zendesk.support.SearchArticle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HelpCenterViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzendesk/support/Article;", "it", "Landroidx/lifecycle/LiveData;", "", "Lzendesk/support/SearchArticle;", "invoke", "(Lzendesk/support/Article;)Landroidx/lifecycle/LiveData;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HelpCenterViewModel$relatedArticles$1 extends w implements l<Article, LiveData<List<SearchArticle>>> {
    final /* synthetic */ HelpCenterViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HelpCenterViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/h0;", "", "Lzendesk/support/SearchArticle;", "Lnm0/y;", "<anonymous>", "(Landroidx/lifecycle/h0;)V"}, k = 3, mv = {1, 9, 0})
    @e(c = "com.withings.zendesk.ui.vm.HelpCenterViewModel$relatedArticles$1$1", f = "HelpCenterViewModel.kt", l = {67, 67}, m = "invokeSuspend")
    /* renamed from: com.withings.zendesk.ui.vm.HelpCenterViewModel$relatedArticles$1$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends i implements p<h0<List<? extends SearchArticle>>, d<? super y>, Object> {
        final /* synthetic */ Article $it;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ HelpCenterViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HelpCenterViewModel helpCenterViewModel, Article article, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = helpCenterViewModel;
            this.$it = article;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$it, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(h0<List<SearchArticle>> h0Var, d<? super y> dVar) {
            return ((AnonymousClass1) create(h0Var, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0057 A[RETURN] */
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
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L21
                if (r1 == r4) goto L19
                if (r1 != r3) goto L11
                nm0.l.b(r7)
                goto L58
            L11:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L19:
                java.lang.Object r1 = r6.L$0
                androidx.lifecycle.h0 r1 = (androidx.lifecycle.h0) r1
                nm0.l.b(r7)
                goto L3e
            L21:
                nm0.l.b(r7)
                java.lang.Object r7 = r6.L$0
                r1 = r7
                androidx.lifecycle.h0 r1 = (androidx.lifecycle.h0) r1
                com.withings.zendesk.ui.vm.HelpCenterViewModel r7 = r6.this$0
                zendesk.support.HelpCenterProvider r7 = com.withings.zendesk.ui.vm.HelpCenterViewModel.access$getHelpCenterProvider$p(r7)
                if (r7 == 0) goto L41
                zendesk.support.Article r5 = r6.$it
                r6.L$0 = r1
                r6.label = r4
                java.lang.Object r7 = com.withings.zendesk.ktx.HelpCenterProviderExtensionKt.relatedArticles(r7, r5, r6)
                if (r7 != r0) goto L3e
                return r0
            L3e:
                java.util.List r7 = (java.util.List) r7
                goto L42
            L41:
                r7 = r2
            L42:
                if (r7 != 0) goto L46
                kotlin.collections.i0 r7 = kotlin.collections.i0.f76187a
            L46:
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                r4 = 5
                java.util.List r7 = kotlin.collections.x.H0(r7, r4)
                r6.L$0 = r2
                r6.label = r3
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L58
                return r0
            L58:
                nm0.y r7 = nm0.y.f85009a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.zendesk.ui.vm.HelpCenterViewModel$relatedArticles$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // ym0.p
        public /* bridge */ /* synthetic */ Object invoke(h0<List<? extends SearchArticle>> h0Var, d<? super y> dVar) {
            return invoke2((h0<List<SearchArticle>>) h0Var, dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpCenterViewModel$relatedArticles$1(HelpCenterViewModel helpCenterViewModel) {
        super(1);
        this.this$0 = helpCenterViewModel;
    }

    @Override // ym0.l
    public final LiveData<List<SearchArticle>> invoke(Article it) {
        u.j(it, "it");
        return h.a(Dispatchers.getIO(), new AnonymousClass1(this.this$0, it, null), 2);
    }
}
