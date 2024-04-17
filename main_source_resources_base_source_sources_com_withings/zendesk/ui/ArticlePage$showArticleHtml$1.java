package com.withings.zendesk.ui;

import com.withings.zendesk.databinding.FragmentArticleBinding;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nm0.l;
import nm0.y;
import ym0.p;
import zendesk.support.Article;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ArticlePage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@kotlin.coroutines.jvm.internal.e(c = "com.withings.zendesk.ui.ArticlePage$showArticleHtml$1", f = "ArticlePage.kt", l = {123}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ArticlePage$showArticleHtml$1 extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {
    final /* synthetic */ Article $article;
    int label;
    final /* synthetic */ ArticlePage this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArticlePage$showArticleHtml$1(ArticlePage articlePage, Article article, qm0.d<? super ArticlePage$showArticleHtml$1> dVar) {
        super(2, dVar);
        this.this$0 = articlePage;
        this.$article = article;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new ArticlePage$showArticleHtml$1(this.this$0, this.$article, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FragmentArticleBinding binding;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            ArticlePage$showArticleHtml$1$html$1 articlePage$showArticleHtml$1$html$1 = new ArticlePage$showArticleHtml$1$html$1(this.this$0, this.$article, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, articlePage$showArticleHtml$1$html$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        binding = this.this$0.getBinding();
        binding.article.loadDataWithBaseURL(this.$article.getHtmlUrl(), (String) obj, null, "UTF-8", this.$article.getHtmlUrl());
        return y.f85009a;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((ArticlePage$showArticleHtml$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
