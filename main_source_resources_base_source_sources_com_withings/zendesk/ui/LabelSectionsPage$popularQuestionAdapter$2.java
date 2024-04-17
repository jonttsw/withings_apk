package com.withings.zendesk.ui;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.zendesk.ui.ArticlePageDirections;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
import zendesk.support.SimpleArticle;
/* compiled from: LabelSectionsPage.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/withings/zendesk/ui/PopularQuestionAdapter;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class LabelSectionsPage$popularQuestionAdapter$2 extends w implements ym0.a<PopularQuestionAdapter> {
    final /* synthetic */ LabelSectionsPage this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LabelSectionsPage.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzendesk/support/SimpleArticle;", ConstantsWs.WELLNESS_TASK_TYPE_ARTICLE, "Lnm0/y;", "invoke", "(Lzendesk/support/SimpleArticle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.zendesk.ui.LabelSectionsPage$popularQuestionAdapter$2$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends w implements l<SimpleArticle, y> {
        final /* synthetic */ LabelSectionsPage this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LabelSectionsPage labelSectionsPage) {
            super(1);
            this.this$0 = labelSectionsPage;
        }

        @Override // ym0.l
        public /* bridge */ /* synthetic */ y invoke(SimpleArticle simpleArticle) {
            invoke2(simpleArticle);
            return y.f85009a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(SimpleArticle article) {
            u.j(article, "article");
            androidx.navigation.e a11 = ah.e.a(this.this$0);
            ArticlePageDirections.Companion companion = ArticlePageDirections.Companion;
            Long id2 = article.getId();
            u.i(id2, "getId(...)");
            a11.K(companion.showArticle(id2.longValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelSectionsPage$popularQuestionAdapter$2(LabelSectionsPage labelSectionsPage) {
        super(0);
        this.this$0 = labelSectionsPage;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final PopularQuestionAdapter invoke() {
        return new PopularQuestionAdapter(new AnonymousClass1(this.this$0));
    }
}
