package com.withings.zendesk.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.u;
import com.withings.zendesk.R;
import kotlin.Metadata;
import nm0.y;
import ym0.l;
import zendesk.support.Article;
/* compiled from: ArticleList.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/withings/zendesk/ui/ArticleAdapter;", "Landroidx/recyclerview/widget/u;", "Lzendesk/support/Article;", "Lcom/withings/zendesk/ui/ArticleHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/withings/zendesk/ui/ArticleHolder;", "holder", "position", "Lnm0/y;", "onBindViewHolder", "(Lcom/withings/zendesk/ui/ArticleHolder;I)V", "Lkotlin/Function1;", "onItemClick", "Lym0/l;", "<init>", "(Lym0/l;)V", "zendesk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ArticleAdapter extends u<Article, ArticleHolder> {
    public static final int $stable = 0;
    private final l<Article, y> onItemClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ArticleAdapter(l<? super Article, y> onItemClick) {
        super(new m.f<Article>() { // from class: com.withings.zendesk.ui.ArticleAdapter.1
            @Override // androidx.recyclerview.widget.m.f
            public boolean areContentsTheSame(Article oldItem, Article newItem) {
                kotlin.jvm.internal.u.j(oldItem, "oldItem");
                kotlin.jvm.internal.u.j(newItem, "newItem");
                return kotlin.jvm.internal.u.e(oldItem.getTitle(), newItem.getTitle());
            }

            @Override // androidx.recyclerview.widget.m.f
            public boolean areItemsTheSame(Article oldItem, Article newItem) {
                kotlin.jvm.internal.u.j(oldItem, "oldItem");
                kotlin.jvm.internal.u.j(newItem, "newItem");
                return kotlin.jvm.internal.u.e(oldItem, newItem);
            }
        });
        kotlin.jvm.internal.u.j(onItemClick, "onItemClick");
        this.onItemClick = onItemClick;
    }

    public static final void onBindViewHolder$lambda$0(ArticleAdapter this$0, Article article, View view) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        l<Article, y> lVar = this$0.onItemClick;
        kotlin.jvm.internal.u.g(article);
        lVar.invoke(article);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ArticleHolder holder, int i11) {
        kotlin.jvm.internal.u.j(holder, "holder");
        Article item = getItem(i11);
        holder.itemView.setOnClickListener(new com.withings.coach.chatbot.c(2, this, item));
        kotlin.jvm.internal.u.g(item);
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ArticleHolder onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.u.j(parent, "parent");
        return new ArticleHolder(androidx.collection.c.n(parent, R.layout.help_center_article_row));
    }
}
