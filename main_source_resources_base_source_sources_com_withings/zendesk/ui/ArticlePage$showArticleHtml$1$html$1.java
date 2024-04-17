package com.withings.zendesk.ui;

import androidx.fragment.app.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.withings.zendesk.R;
import dp0.j;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import wm0.f;
import ym0.p;
import zendesk.support.Article;
/* compiled from: ArticlePage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "com.withings.zendesk.ui.ArticlePage$showArticleHtml$1$html$1", f = "ArticlePage.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class ArticlePage$showArticleHtml$1$html$1 extends i implements p<CoroutineScope, qm0.d<? super String>, Object> {
    final /* synthetic */ Article $article;
    int label;
    final /* synthetic */ ArticlePage this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArticlePage$showArticleHtml$1$html$1(ArticlePage articlePage, Article article, qm0.d<? super ArticlePage$showArticleHtml$1$html$1> dVar) {
        super(2, dVar);
        this.this$0 = articlePage;
        this.$article = article;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new ArticlePage$showArticleHtml$1$html$1(this.this$0, this.$article, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        BufferedReader bufferedReader;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            InputStream openRawResource = this.this$0.getResources().openRawResource(R.raw.article);
            u.i(openRawResource, "openRawResource(...)");
            InputStreamReader inputStreamReader = new InputStreamReader(openRawResource, dp0.c.f64094b);
            if (inputStreamReader instanceof BufferedReader) {
                bufferedReader = (BufferedReader) inputStreamReader;
            } else {
                bufferedReader = new BufferedReader(inputStreamReader, UserMetadata.MAX_INTERNAL_KEY_SIZE);
            }
            return j.O(f.b(bufferedReader), "<body></body>", o.d("<body>", this.$article.getBody(), "</body>"), false);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super String> dVar) {
        return ((ArticlePage$showArticleHtml$1$html$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
